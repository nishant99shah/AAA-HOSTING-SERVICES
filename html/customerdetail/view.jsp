<%@ include file="/html/init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addCustomerURL">
		<portlet:param name="mvcPath" value="/html/customerdetail/edit_customer.jsp"></portlet:param>
		<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
	</portlet:renderURL>

	<aui:button onClick="<%=addCustomerURL.toString()%>" value="Add Customer"></aui:button>
</aui:button-row>

<liferay-ui:search-container>
	<liferay-ui:search-container-results 
	results="<%=CustomerLocalServiceUtil.getCustomersByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd())%>" 
	total="<%= CustomerLocalServiceUtil.getCustomersCountByGroupId(scopeGroupId)%>">
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="Customer" keyProperty="customerId" modelVar="customer" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="name" value="<%=customer.getCustomerName()%>"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="email" property="customerEmail"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="address" property="customerAddress"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="nationalId" property="customerNIC"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="contactNumber" property="customerContact"></liferay-ui:search-container-column-text>
		
		<%
			String serviceName = "";
		  	try{
		  		serviceName = DserviceLocalServiceUtil.getDservice
		  				(customer.getDserviceId()).getServiceTitle();
		  	} catch (Exception e){
		  		
		  	}
		%>
		
		<liferay-ui:search-container-column-text name="service" value="<%=serviceName%>"></liferay-ui:search-container-column-text>	
		<liferay-ui:search-container-column-jsp align="right" path="/html/customerdetail/customer_actions.jsp"></liferay-ui:search-container-column-jsp>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator></liferay-ui:search-iterator>
</liferay-ui:search-container>
