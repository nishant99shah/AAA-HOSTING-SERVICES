/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.aaa.data.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DserviceLocalService}.
 *
 * @author Rishikesh Dubey
 * @see DserviceLocalService
 * @generated
 */
public class DserviceLocalServiceWrapper implements DserviceLocalService,
	ServiceWrapper<DserviceLocalService> {
	public DserviceLocalServiceWrapper(
		DserviceLocalService dserviceLocalService) {
		_dserviceLocalService = dserviceLocalService;
	}

	/**
	* Adds the dservice to the database. Also notifies the appropriate model listeners.
	*
	* @param dservice the dservice
	* @return the dservice that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice addDservice(
		com.liferay.aaa.data.model.Dservice dservice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.addDservice(dservice);
	}

	/**
	* Creates a new dservice with the primary key. Does not add the dservice to the database.
	*
	* @param dserviceId the primary key for the new dservice
	* @return the new dservice
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice createDservice(long dserviceId) {
		return _dserviceLocalService.createDservice(dserviceId);
	}

	/**
	* Deletes the dservice with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dserviceId the primary key of the dservice
	* @return the dservice that was removed
	* @throws PortalException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice deleteDservice(long dserviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.deleteDservice(dserviceId);
	}

	/**
	* Deletes the dservice from the database. Also notifies the appropriate model listeners.
	*
	* @param dservice the dservice
	* @return the dservice that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice deleteDservice(
		com.liferay.aaa.data.model.Dservice dservice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.deleteDservice(dservice);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dserviceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.aaa.data.model.Dservice fetchDservice(long dserviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.fetchDservice(dserviceId);
	}

	/**
	* Returns the dservice with the matching UUID and company.
	*
	* @param uuid the dservice's UUID
	* @param companyId the primary key of the company
	* @return the matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice fetchDserviceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.fetchDserviceByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the dservice matching the UUID and group.
	*
	* @param uuid the dservice's UUID
	* @param groupId the primary key of the group
	* @return the matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice fetchDserviceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.fetchDserviceByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dservice with the primary key.
	*
	* @param dserviceId the primary key of the dservice
	* @return the dservice
	* @throws PortalException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice getDservice(long dserviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDservice(dserviceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the dservice with the matching UUID and company.
	*
	* @param uuid the dservice's UUID
	* @param companyId the primary key of the company
	* @return the matching dservice
	* @throws PortalException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice getDserviceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDserviceByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the dservice matching the UUID and group.
	*
	* @param uuid the dservice's UUID
	* @param groupId the primary key of the group
	* @return the matching dservice
	* @throws PortalException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice getDserviceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDserviceByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the dservices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @return the range of dservices
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.aaa.data.model.Dservice> getDservices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDservices(start, end);
	}

	/**
	* Returns the number of dservices.
	*
	* @return the number of dservices
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDservicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDservicesCount();
	}

	/**
	* Updates the dservice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dservice the dservice
	* @return the dservice that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.aaa.data.model.Dservice updateDservice(
		com.liferay.aaa.data.model.Dservice dservice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.updateDservice(dservice);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dserviceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dserviceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dserviceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.liferay.aaa.data.model.Dservice> getDservicesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDservicesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.aaa.data.model.Dservice> getDservicesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDservicesByGroupId(groupId, start, end);
	}

	@Override
	public int getDservicesCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.getDservicesCountByGroupId(groupId);
	}

	@Override
	public com.liferay.aaa.data.model.Dservice addDservice(long userId,
		long groupId, java.lang.String serviceTitle,
		java.lang.String serviceDescription, java.lang.String serviceRate,
		java.lang.String serviceDuration,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.addDservice(userId, groupId, serviceTitle,
			serviceDescription, serviceRate, serviceDuration, serviceContext);
	}

	@Override
	public com.liferay.aaa.data.model.Dservice updateDservice(long dserviceId,
		java.lang.String serviceTitle, java.lang.String serviceDescription,
		java.lang.String serviceRate, java.lang.String serviceDuration,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dserviceLocalService.updateDservice(dserviceId, serviceTitle,
			serviceDescription, serviceRate, serviceDuration, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DserviceLocalService getWrappedDserviceLocalService() {
		return _dserviceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDserviceLocalService(
		DserviceLocalService dserviceLocalService) {
		_dserviceLocalService = dserviceLocalService;
	}

	@Override
	public DserviceLocalService getWrappedService() {
		return _dserviceLocalService;
	}

	@Override
	public void setWrappedService(DserviceLocalService dserviceLocalService) {
		_dserviceLocalService = dserviceLocalService;
	}

	private DserviceLocalService _dserviceLocalService;
}