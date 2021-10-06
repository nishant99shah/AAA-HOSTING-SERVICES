<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@ include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Dservice dservice = (Dservice) row.getObject();
	long groupId = dservice.getGroupId();
	String name = Dservice.class.getName();
	long dserviceId = dservice.getDserviceId();
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>

	<c:if test="<%=DservicePermission.contains(permissionChecker, dservice.getDserviceId(), ActionKeys.UPDATE)%>">
		<portlet:renderURL var="editURL">
			<portlet:param name="mvcPath" value="/html/servicedetail/edit_service.jsp"></portlet:param>
			<portlet:param name="dserviceId" value="<%=String.valueOf(dserviceId)%>"></portlet:param>
			<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
		</portlet:renderURL>
	
		<liferay-ui:icon image="edit" url="<%=editURL.toString()%>"></liferay-ui:icon>
	</c:if>
	
	<c:if test="<%=DservicePermission.contains(permissionChecker, dservice.getDserviceId(), ActionKeys.DELETE)%>">
		<portlet:actionURL name="deleteDservice" var="deleteURL">
			<portlet:param name="dserviceId" value="<%=String.valueOf(dserviceId)%>"></portlet:param>
			<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
		</portlet:actionURL>
		
		<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
	</c:if>
	
	<c:if test="<%=DservicePermission.contains(permissionChecker, dservice.getDserviceId(), ActionKeys.PERMISSIONS) %>">
		
		<liferay-security:permissionsURL modelResource="<%=Dservice.class.getName()%>" modelResourceDescription="<%= dservice.getServiceDescription()%>" resourcePrimKey="<%=String.valueOf(dservice.getDserviceId())%>" var="permissionsURL"></liferay-security:permissionsURL>
		
		<liferay-ui:icon image="permissions" url="<%=permissionsURL.toString()%>"></liferay-ui:icon>
	</c:if>

</liferay-ui:icon-menu>