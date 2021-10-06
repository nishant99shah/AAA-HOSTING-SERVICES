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

package com.liferay.aaa.data.service.persistence;

import com.liferay.aaa.data.model.Dservice;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the dservice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rishikesh Dubey
 * @see DservicePersistenceImpl
 * @see DserviceUtil
 * @generated
 */
public interface DservicePersistence extends BasePersistence<Dservice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DserviceUtil} to access the dservice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dservices where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dservices where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @return the range of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dservices where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dservice in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dservice in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dservice in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dservice in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservices before and after the current dservice in the ordered set where uuid = &#63;.
	*
	* @param dserviceId the primary key of the current dservice
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice[] findByUuid_PrevAndNext(
		long dserviceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dservices where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dservices where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservice where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.aaa.data.NoSuchDserviceException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservice where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservice where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dservice where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dservice that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dservices where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dservices where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dservices where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @return the range of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dservices where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dservice in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dservice in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dservice in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dservice in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservices before and after the current dservice in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dserviceId the primary key of the current dservice
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice[] findByUuid_C_PrevAndNext(
		long dserviceId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dservices where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dservices where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dservices where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dservices where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @return the range of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dservices where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dservice in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dservice in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dservice in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dservice in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dservice, or <code>null</code> if a matching dservice could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservices before and after the current dservice in the ordered set where groupId = &#63;.
	*
	* @param dserviceId the primary key of the current dservice
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice[] findByGroupId_PrevAndNext(
		long dserviceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dservices that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dservices that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dservices that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @return the range of matching dservices that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dservices that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dservices that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservices before and after the current dservice in the ordered set of dservices that the user has permission to view where groupId = &#63;.
	*
	* @param dserviceId the primary key of the current dservice
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice[] filterFindByGroupId_PrevAndNext(
		long dserviceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dservices where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dservices where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dservices
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dservices that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dservices that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dservice in the entity cache if it is enabled.
	*
	* @param dservice the dservice
	*/
	public void cacheResult(com.liferay.aaa.data.model.Dservice dservice);

	/**
	* Caches the dservices in the entity cache if it is enabled.
	*
	* @param dservices the dservices
	*/
	public void cacheResult(
		java.util.List<com.liferay.aaa.data.model.Dservice> dservices);

	/**
	* Creates a new dservice with the primary key. Does not add the dservice to the database.
	*
	* @param dserviceId the primary key for the new dservice
	* @return the new dservice
	*/
	public com.liferay.aaa.data.model.Dservice create(long dserviceId);

	/**
	* Removes the dservice with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dserviceId the primary key of the dservice
	* @return the dservice that was removed
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice remove(long dserviceId)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.aaa.data.model.Dservice updateImpl(
		com.liferay.aaa.data.model.Dservice dservice)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservice with the primary key or throws a {@link com.liferay.aaa.data.NoSuchDserviceException} if it could not be found.
	*
	* @param dserviceId the primary key of the dservice
	* @return the dservice
	* @throws com.liferay.aaa.data.NoSuchDserviceException if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice findByPrimaryKey(long dserviceId)
		throws com.liferay.aaa.data.NoSuchDserviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dservice with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dserviceId the primary key of the dservice
	* @return the dservice, or <code>null</code> if a dservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.aaa.data.model.Dservice fetchByPrimaryKey(
		long dserviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dservices.
	*
	* @return the dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.aaa.data.model.Dservice> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dservices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.aaa.data.model.impl.DserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dservices
	* @param end the upper bound of the range of dservices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.aaa.data.model.Dservice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dservices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dservices.
	*
	* @return the number of dservices
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}