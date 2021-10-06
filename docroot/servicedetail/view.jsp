<%@ include file="/html/init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addDserviceURL">
		<portlet:param name="mvcPath" value="/html/servicedetail/edit_service.jsp"></portlet:param>
		<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
	</portlet:renderURL>
	
	<c:if test='<%=DserviceModelPermission.contains(permissionChecker, scopeGroupId, "ADD_DSERVICE")%>'>
		<aui:button onClick="<%=addDserviceURL.toString()%>" value="Add service"></aui:button>
	</c:if>
</aui:button-row>

<liferay-ui:search-container>
	<liferay-ui:search-container-results 
	results="<%=DserviceLocalServiceUtil.getDservicesByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd())%>" 
	total="<%=DserviceLocalServiceUtil.getDservicesCountByGroupId(scopeGroupId)%>">
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="Dservice" keyProperty="dserviceId" modelVar="dservice" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="title" value="<%= dservice.getServiceTitle() %>"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="description" property="serviceDescription"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="rate" property="serviceRate"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="duration" property="serviceDuration"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-jsp align="right" path="/html/servicedetail/service_actions.jsp"></liferay-ui:search-container-column-jsp>
	</liferay-ui:search-container-row>

			<liferay-ui:search-iterator></liferay-ui:search-iterator>

</liferay-ui:search-container>