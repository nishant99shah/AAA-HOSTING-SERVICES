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

import com.liferay.aaa.data.service.ClpSerializer;
import com.liferay.aaa.data.service.DserviceLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Rishikesh Dubey
 */
public class DserviceClp extends BaseModelImpl<Dservice> implements Dservice {
	public DserviceClp() {
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
	public long getPrimaryKey() {
		return _dserviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDserviceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dserviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_dserviceRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDserviceId() {
		return _dserviceId;
	}

	@Override
	public void setDserviceId(long dserviceId) {
		_dserviceId = dserviceId;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDserviceId", long.class);

				method.invoke(_dserviceRemoteModel, dserviceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dserviceRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dserviceRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dserviceRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_dserviceRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dserviceRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dserviceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceTitle() {
		return _serviceTitle;
	}

	@Override
	public void setServiceTitle(String serviceTitle) {
		_serviceTitle = serviceTitle;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceTitle", String.class);

				method.invoke(_dserviceRemoteModel, serviceTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceDescription() {
		return _serviceDescription;
	}

	@Override
	public void setServiceDescription(String serviceDescription) {
		_serviceDescription = serviceDescription;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceDescription",
						String.class);

				method.invoke(_dserviceRemoteModel, serviceDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceRate() {
		return _serviceRate;
	}

	@Override
	public void setServiceRate(String serviceRate) {
		_serviceRate = serviceRate;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceRate", String.class);

				method.invoke(_dserviceRemoteModel, serviceRate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceDuration() {
		return _serviceDuration;
	}

	@Override
	public void setServiceDuration(String serviceDuration) {
		_serviceDuration = serviceDuration;

		if (_dserviceRemoteModel != null) {
			try {
				Class<?> clazz = _dserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceDuration",
						String.class);

				method.invoke(_dserviceRemoteModel, serviceDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Dservice.class.getName()));
	}

	public BaseModel<?> getDserviceRemoteModel() {
		return _dserviceRemoteModel;
	}

	public void setDserviceRemoteModel(BaseModel<?> dserviceRemoteModel) {
		_dserviceRemoteModel = dserviceRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _dserviceRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_dserviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DserviceLocalServiceUtil.addDservice(this);
		}
		else {
			DserviceLocalServiceUtil.updateDservice(this);
		}
	}

	@Override
	public Dservice toEscapedModel() {
		return (Dservice)ProxyUtil.newProxyInstance(Dservice.class.getClassLoader(),
			new Class[] { Dservice.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DserviceClp clone = new DserviceClp();

		clone.setUuid(getUuid());
		clone.setDserviceId(getDserviceId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServiceTitle(getServiceTitle());
		clone.setServiceDescription(getServiceDescription());
		clone.setServiceRate(getServiceRate());
		clone.setServiceDuration(getServiceDuration());

		return clone;
	}

	@Override
	public int compareTo(Dservice dservice) {
		long primaryKey = dservice.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DserviceClp)) {
			return false;
		}

		DserviceClp dservice = (DserviceClp)obj;

		long primaryKey = dservice.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", dserviceId=");
		sb.append(getDserviceId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", serviceTitle=");
		sb.append(getServiceTitle());
		sb.append(", serviceDescription=");
		sb.append(getServiceDescription());
		sb.append(", serviceRate=");
		sb.append(getServiceRate());
		sb.append(", serviceDuration=");
		sb.append(getServiceDuration());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.aaa.data.model.Dservice");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dserviceId</column-name><column-value><![CDATA[");
		sb.append(getDserviceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceTitle</column-name><column-value><![CDATA[");
		sb.append(getServiceTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceDescription</column-name><column-value><![CDATA[");
		sb.append(getServiceDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceRate</column-name><column-value><![CDATA[");
		sb.append(getServiceRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceDuration</column-name><column-value><![CDATA[");
		sb.append(getServiceDuration());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _dserviceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _serviceTitle;
	private String _serviceDescription;
	private String _serviceRate;
	private String _serviceDuration;
	private BaseModel<?> _dserviceRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.aaa.data.service.ClpSerializer.class;
}