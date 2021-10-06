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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.aaa.data.service.http.DserviceServiceSoap}.
 *
 * @author Rishikesh Dubey
 * @see com.liferay.aaa.data.service.http.DserviceServiceSoap
 * @generated
 */
public class DserviceSoap implements Serializable {
	public static DserviceSoap toSoapModel(Dservice model) {
		DserviceSoap soapModel = new DserviceSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDserviceId(model.getDserviceId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setServiceTitle(model.getServiceTitle());
		soapModel.setServiceDescription(model.getServiceDescription());
		soapModel.setServiceRate(model.getServiceRate());
		soapModel.setServiceDuration(model.getServiceDuration());

		return soapModel;
	}

	public static DserviceSoap[] toSoapModels(Dservice[] models) {
		DserviceSoap[] soapModels = new DserviceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DserviceSoap[][] toSoapModels(Dservice[][] models) {
		DserviceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DserviceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DserviceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DserviceSoap[] toSoapModels(List<Dservice> models) {
		List<DserviceSoap> soapModels = new ArrayList<DserviceSoap>(models.size());

		for (Dservice model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DserviceSoap[soapModels.size()]);
	}

	public DserviceSoap() {
	}

	public long getPrimaryKey() {
		return _dserviceId;
	}

	public void setPrimaryKey(long pk) {
		setDserviceId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDserviceId() {
		return _dserviceId;
	}

	public void setDserviceId(long dserviceId) {
		_dserviceId = dserviceId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getServiceTitle() {
		return _serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		_serviceTitle = serviceTitle;
	}

	public String getServiceDescription() {
		return _serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		_serviceDescription = serviceDescription;
	}

	public String getServiceRate() {
		return _serviceRate;
	}

	public void setServiceRate(String serviceRate) {
		_serviceRate = serviceRate;
	}

	public String getServiceDuration() {
		return _serviceDuration;
	}

	public void setServiceDuration(String serviceDuration) {
		_serviceDuration = serviceDuration;
	}

	private String _uuid;
	private long _dserviceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _serviceTitle;
	private String _serviceDescription;
	private String _serviceRate;
	private String _serviceDuration;
}