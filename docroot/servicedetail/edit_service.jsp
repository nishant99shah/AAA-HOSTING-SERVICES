<%@ include file="/html/init.jsp" %>

<%
	Dservice dservice= null;
	long dserviceId = ParamUtil.getLong(request, "dserviceId");
	if (dserviceId > 0) {
		dservice = DserviceLocalServiceUtil.getDservice(dserviceId);
	}
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= dservice %>" model="<%= Dservice.class %>"></aui:model-context>
	<portlet:renderURL var="viewDserviceURL"></portlet:renderURL>
	<portlet:actionURL name='<%= dservice == null ? "addDservice" : "updateDservice" %>' var="editDserviceURL" windowState="normal"></portlet:actionURL>
	
<liferay-ui:header backURL="<%= viewDserviceURL %>" title='<%= (dservice != null) ? dservice.getServiceTitle() : "new-dservice" %>'></liferay-ui:header>

<aui:form action="<%= editDserviceURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>"></aui:input>

		<aui:input name="dserviceId" type="hidden" value='<%= dservice == null ? "" : dservice.getDserviceId() %>'/>

		<aui:input label="Title" name="serviceTitle"></aui:input>
		<aui:input label="Description" name="serviceDescription"></aui:input>
		<aui:input label="Rate" name="serviceRate"></aui:input>
		<aui:input label="Duration" name="serviceDuration"></aui:input>


	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button onClick="<%=viewDserviceURL%>"  type="cancel"></aui:button>
	</aui:button-row>
</aui:form>