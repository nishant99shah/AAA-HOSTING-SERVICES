<%@ include file="/html/init.jsp" %>

<%
	Customer customer = null;
	long customerId = ParamUtil.getLong(request, "customerId");
	if(customerId>0){
		customer = CustomerLocalServiceUtil.getCustomer(customerId);
	}
	List<Dservice> dservices = DserviceLocalServiceUtil.getDservicesByGroupId(scopeGroupId); 
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%=customer%>" model="<%=Customer.class%>"></aui:model-context>

<portlet:renderURL var="viewCustomerURL"></portlet:renderURL>
<portlet:actionURL name='<%=customer == null ? "addCustomer" : "updateCustomer"%>' var="editCustomerURL" windowState="normal"></portlet:actionURL>

<liferay-ui:header backURL="<%=viewCustomerURL%>" title='<%=(customer != null) ? customer.getCustomerName() : "new-customer"%>'></liferay-ui:header>

<aui:form action="<%=editCustomerURL%>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%=redirect%>"></aui:input>

		<aui:input name="customerId" type="hidden" value='<%=customer == null ? "" : customer.getCustomerId()%>'></aui:input>

		<aui:input label="Name" name="customerName"></aui:input>

		<aui:input label="Email" name="customerEmail"></aui:input>
		
		<aui:input label="Address" name="customerAddress"></aui:input>
		
		<aui:input label="National Identity Number" name="customerNIC"></aui:input>
		
		<aui:input label="Contact Number" name="customerContact"></aui:input>

		<aui:select label="Service" name="dserviceId" showEmptyOption="<%=true%>">

	 		<%
				for (Dservice dservice : dservices) {
			%>

			<aui:option selected="<%= customer != null && dservice.getDserviceId() == customer.getDserviceId() %>" value="<%= dservice.getDserviceId() %>"><%=dservice.getServiceTitle() %></aui:option>

			<%
				}
			%>

		</aui:select>
		

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>

		<aui:button onClick="<%= viewCustomerURL %>"  type="cancel"></aui:button>
	</aui:button-row>
</aui:form>