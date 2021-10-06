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

package com.liferay.aaa.data.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Dservice}.
 * </p>
 *
 * @author Rishikesh Dubey
 * @see Dservice
 * @generated
 */
public class DserviceWrapper implements Dservice, ModelWrapper<Dservice> {
	public DserviceWrapper(Dservice dservice) {
		_dservice = dservice;
	}

	@Override
	public Class<?> getModelClass() {
		return Dservice.class;
	}

	@Override
	public String getModelClassName() {
		return Dservice.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dserviceId", getDserviceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceTitle", getServiceTitle());
		attributes.put("serviceDescription", getServiceDescription());
		attributes.put("serviceRate", getServiceRate());
		attributes.put("serviceDuration", getServiceDuration());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dserviceId = (Long)attributes.get("dserviceId");

		if (dserviceId != null) {
			setDserviceId(dserviceId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String serviceTitle = (String)attributes.get("serviceTitle");

		if (serviceTitle != null) {
			setServiceTitle(serviceTitle);
		}

		String serviceDescription = (String)attributes.get("serviceDescription");

		if (serviceDescription != null) {
			setServiceDescription(serviceDescription);
		}

		String serviceRate = (String)attributes.get("serviceRate");

		if (serviceRate != null) {
			setServiceRate(serviceRate);
		}

		String serviceDuration = (String)attributes.get("serviceDuration");

		if (serviceDuration != null) {
			setServiceDuration(serviceDuration);
		}
	}

	/**
	* Returns the primary key of this dservice.
	*
	* @return the primary key of this dservice
	*/
	@Override
	public long getPrimaryKey() {
		return _dservice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dservice.
	*
	* @param primaryKey the primary key of this dservice
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dservice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this dservice.
	*
	* @return the uuid of this dservice
	*/
	@Override
	public java.lang.String getUuid() {
		return _dservice.getUuid();
	}

	/**
	* Sets the uuid of this dservice.
	*
	* @param uuid the uuid of this dservice
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dservice.setUuid(uuid);
	}

	/**
	* Returns the dservice ID of this dservice.
	*
	* @return the dservice ID of this dservice
	*/
	@Override
	public long getDserviceId() {
		return _dservice.getDserviceId();
	}

	/**
	* Sets the dservice ID of this dservice.
	*
	* @param dserviceId the dservice ID of this dservice
	*/
	@Override
	public void setDserviceId(long dserviceId) {
		_dservice.setDserviceId(dserviceId);
	}

	/**
	* Returns the group ID of this dservice.
	*
	* @return the group ID of this dservice
	*/
	@Override
	public long getGroupId() {
		return _dservice.getGroupId();
	}

	/**
	* Sets the group ID of this dservice.
	*
	* @param groupId the group ID of this dservice
	*/
	@Override
	public void setGroupId(long groupId) {
		_dservice.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dservice.
	*
	* @return the company ID of this dservice
	*/
	@Override
	public long getCompanyId() {
		return _dservice.getCompanyId();
	}

	/**
	* Sets the company ID of this dservice.
	*
	* @param companyId the company ID of this dservice
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dservice.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dservice.
	*
	* @return the user ID of this dservice
	*/
	@Override
	public long getUserId() {
		return _dservice.getUserId();
	}

	/**
	* Sets the user ID of this dservice.
	*
	* @param userId the user ID of this dservice
	*/
	@Override
	public void setUserId(long userId) {
		_dservice.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dservice.
	*
	* @return the user uuid of this dservice
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dservice.getUserUuid();
	}

	/**
	* Sets the user uuid of this dservice.
	*
	* @param userUuid the user uuid of this dservice
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dservice.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this dservice.
	*
	* @return the user name of this dservice
	*/
	@Override
	public java.lang.String getUserName() {
		return _dservice.getUserName();
	}

	/**
	* Sets the user name of this dservice.
	*
	* @param userName the user name of this dservice
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dservice.setUserName(userName);
	}

	/**
	* Returns the create date of this dservice.
	*
	* @return the create date of this dservice
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dservice.getCreateDate();
	}

	/**
	* Sets the create date of this dservice.
	*
	* @param createDate the create date of this dservice
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dservice.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dservice.
	*
	* @return the modified date of this dservice
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dservice.getModifiedDate();
	}

	/**
	* Sets the modified date of this dservice.
	*
	* @param modifiedDate the modified date of this dservice
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dservice.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the service title of this dservice.
	*
	* @return the service title of this dservice
	*/
	@Override
	public java.lang.String getServiceTitle() {
		return _dservice.getServiceTitle();
	}

	/**
	* Sets the service title of this dservice.
	*
	* @param serviceTitle the service title of this dservice
	*/
	@Override
	public void setServiceTitle(java.lang.String serviceTitle) {
		_dservice.setServiceTitle(serviceTitle);
	}

	/**
	* Returns the service description of this dservice.
	*
	* @return the service description of this dservice
	*/
	@Override
	public java.lang.String getServiceDescription() {
		return _dservice.getServiceDescription();
	}

	/**
	* Sets the service description of this dservice.
	*
	* @param serviceDescription the service description of this dservice
	*/
	@Override
	public void setServiceDescription(java.lang.String serviceDescription) {
		_dservice.setServiceDescription(serviceDescription);
	}

	/**
	* Returns the service rate of this dservice.
	*
	* @return the service rate of this dservice
	*/
	@Override
	public java.lang.String getServiceRate() {
		return _dservice.getServiceRate();
	}

	/**
	* Sets the service rate of this dservice.
	*
	* @param serviceRate the service rate of this dservice
	*/
	@Override
	public void setServiceRate(java.lang.String serviceRate) {
		_dservice.setServiceRate(serviceRate);
	}

	/**
	* Returns the service duration of this dservice.
	*
	* @return the service duration of this dservice
	*/
	@Override
	public java.lang.String getServiceDuration() {
		return _dservice.getServiceDuration();
	}

	/**
	* Sets the service duration of this dservice.
	*
	* @param serviceDuration the service duration of this dservice
	*/
	@Override
	public void setServiceDuration(java.lang.String serviceDuration) {
		_dservice.setServiceDuration(serviceDuration);
	}

	@Override
	public boolean isNew() {
		return _dservice.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dservice.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dservice.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dservice.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dservice.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dservice.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dservice.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dservice.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dservice.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dservice.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dservice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DserviceWrapper((Dservice)_dservice.clone());
	}

	@Override
	public int compareTo(com.liferay.aaa.data.model.Dservice dservice) {
		return _dservice.compareTo(dservice);
	}

	@Override
	public int hashCode() {
		return _dservice.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.aaa.data.model.Dservice> toCacheModel() {
		return _dservice.toCacheModel();
	}

	@Override
	public com.liferay.aaa.data.model.Dservice toEscapedModel() {
		return new DserviceWrapper(_dservice.toEscapedModel());
	}

	@Override
	public com.liferay.aaa.data.model.Dservice toUnescapedModel() {
		return new DserviceWrapper(_dservice.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dservice.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dservice.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dservice.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DserviceWrapper)) {
			return false;
		}

		DserviceWrapper dserviceWrapper = (DserviceWrapper)obj;

		if (Validator.equals(_dservice, dserviceWrapper._dservice)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dservice.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Dservice getWrappedDservice() {
		return _dservice;
	}

	@Override
	public Dservice getWrappedModel() {
		return _dservice;
	}

	@Override
	public void resetOriginalValues() {
		_dservice.resetOriginalValues();
	}

	private Dservice _dservice;
}