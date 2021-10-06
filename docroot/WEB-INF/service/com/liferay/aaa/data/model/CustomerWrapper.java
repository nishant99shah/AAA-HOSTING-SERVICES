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
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author Rishikesh Dubey
 * @see Customer
 * @generated
 */
public class CustomerWrapper implements Customer, ModelWrapper<Customer> {
	public CustomerWrapper(Customer customer) {
		_customer = customer;
	}

	@Override
	public Class<?> getModelClass() {
		return Customer.class;
	}

	@Override
	public String getModelClassName() {
		return Customer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("customerId", getCustomerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("customerName", getCustomerName());
		attributes.put("customerEmail", getCustomerEmail());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("customerNIC", getCustomerNIC());
		attributes.put("customerContact", getCustomerContact());
		attributes.put("dserviceId", getDserviceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
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

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String customerEmail = (String)attributes.get("customerEmail");

		if (customerEmail != null) {
			setCustomerEmail(customerEmail);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		Long customerNIC = (Long)attributes.get("customerNIC");

		if (customerNIC != null) {
			setCustomerNIC(customerNIC);
		}

		Long customerContact = (Long)attributes.get("customerContact");

		if (customerContact != null) {
			setCustomerContact(customerContact);
		}

		Long dserviceId = (Long)attributes.get("dserviceId");

		if (dserviceId != null) {
			setDserviceId(dserviceId);
		}
	}

	/**
	* Returns the primary key of this customer.
	*
	* @return the primary key of this customer
	*/
	@Override
	public long getPrimaryKey() {
		return _customer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer.
	*
	* @param primaryKey the primary key of this customer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this customer.
	*
	* @return the uuid of this customer
	*/
	@Override
	public java.lang.String getUuid() {
		return _customer.getUuid();
	}

	/**
	* Sets the uuid of this customer.
	*
	* @param uuid the uuid of this customer
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_customer.setUuid(uuid);
	}

	/**
	* Returns the customer ID of this customer.
	*
	* @return the customer ID of this customer
	*/
	@Override
	public long getCustomerId() {
		return _customer.getCustomerId();
	}

	/**
	* Sets the customer ID of this customer.
	*
	* @param customerId the customer ID of this customer
	*/
	@Override
	public void setCustomerId(long customerId) {
		_customer.setCustomerId(customerId);
	}

	/**
	* Returns the group ID of this customer.
	*
	* @return the group ID of this customer
	*/
	@Override
	public long getGroupId() {
		return _customer.getGroupId();
	}

	/**
	* Sets the group ID of this customer.
	*
	* @param groupId the group ID of this customer
	*/
	@Override
	public void setGroupId(long groupId) {
		_customer.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this customer.
	*
	* @return the company ID of this customer
	*/
	@Override
	public long getCompanyId() {
		return _customer.getCompanyId();
	}

	/**
	* Sets the company ID of this customer.
	*
	* @param companyId the company ID of this customer
	*/
	@Override
	public void setCompanyId(long companyId) {
		_customer.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this customer.
	*
	* @return the user ID of this customer
	*/
	@Override
	public long getUserId() {
		return _customer.getUserId();
	}

	/**
	* Sets the user ID of this customer.
	*
	* @param userId the user ID of this customer
	*/
	@Override
	public void setUserId(long userId) {
		_customer.setUserId(userId);
	}

	/**
	* Returns the user uuid of this customer.
	*
	* @return the user uuid of this customer
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customer.getUserUuid();
	}

	/**
	* Sets the user uuid of this customer.
	*
	* @param userUuid the user uuid of this customer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_customer.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this customer.
	*
	* @return the user name of this customer
	*/
	@Override
	public java.lang.String getUserName() {
		return _customer.getUserName();
	}

	/**
	* Sets the user name of this customer.
	*
	* @param userName the user name of this customer
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_customer.setUserName(userName);
	}

	/**
	* Returns the create date of this customer.
	*
	* @return the create date of this customer
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _customer.getCreateDate();
	}

	/**
	* Sets the create date of this customer.
	*
	* @param createDate the create date of this customer
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_customer.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this customer.
	*
	* @return the modified date of this customer
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _customer.getModifiedDate();
	}

	/**
	* Sets the modified date of this customer.
	*
	* @param modifiedDate the modified date of this customer
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_customer.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the customer name of this customer.
	*
	* @return the customer name of this customer
	*/
	@Override
	public java.lang.String getCustomerName() {
		return _customer.getCustomerName();
	}

	/**
	* Sets the customer name of this customer.
	*
	* @param customerName the customer name of this customer
	*/
	@Override
	public void setCustomerName(java.lang.String customerName) {
		_customer.setCustomerName(customerName);
	}

	/**
	* Returns the customer email of this customer.
	*
	* @return the customer email of this customer
	*/
	@Override
	public java.lang.String getCustomerEmail() {
		return _customer.getCustomerEmail();
	}

	/**
	* Sets the customer email of this customer.
	*
	* @param customerEmail the customer email of this customer
	*/
	@Override
	public void setCustomerEmail(java.lang.String customerEmail) {
		_customer.setCustomerEmail(customerEmail);
	}

	/**
	* Returns the customer address of this customer.
	*
	* @return the customer address of this customer
	*/
	@Override
	public java.lang.String getCustomerAddress() {
		return _customer.getCustomerAddress();
	}

	/**
	* Sets the customer address of this customer.
	*
	* @param customerAddress the customer address of this customer
	*/
	@Override
	public void setCustomerAddress(java.lang.String customerAddress) {
		_customer.setCustomerAddress(customerAddress);
	}

	/**
	* Returns the customer n i c of this customer.
	*
	* @return the customer n i c of this customer
	*/
	@Override
	public long getCustomerNIC() {
		return _customer.getCustomerNIC();
	}

	/**
	* Sets the customer n i c of this customer.
	*
	* @param customerNIC the customer n i c of this customer
	*/
	@Override
	public void setCustomerNIC(long customerNIC) {
		_customer.setCustomerNIC(customerNIC);
	}

	/**
	* Returns the customer contact of this customer.
	*
	* @return the customer contact of this customer
	*/
	@Override
	public long getCustomerContact() {
		return _customer.getCustomerContact();
	}

	/**
	* Sets the customer contact of this customer.
	*
	* @param customerContact the customer contact of this customer
	*/
	@Override
	public void setCustomerContact(long customerContact) {
		_customer.setCustomerContact(customerContact);
	}

	/**
	* Returns the dservice ID of this customer.
	*
	* @return the dservice ID of this customer
	*/
	@Override
	public long getDserviceId() {
		return _customer.getDserviceId();
	}

	/**
	* Sets the dservice ID of this customer.
	*
	* @param dserviceId the dservice ID of this customer
	*/
	@Override
	public void setDserviceId(long dserviceId) {
		_customer.setDserviceId(dserviceId);
	}

	@Override
	public boolean isNew() {
		return _customer.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customer.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customer.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customer.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customer.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customer.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customer.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerWrapper((Customer)_customer.clone());
	}

	@Override
	public int compareTo(com.liferay.aaa.data.model.Customer customer) {
		return _customer.compareTo(customer);
	}

	@Override
	public int hashCode() {
		return _customer.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.aaa.data.model.Customer> toCacheModel() {
		return _customer.toCacheModel();
	}

	@Override
	public com.liferay.aaa.data.model.Customer toEscapedModel() {
		return new CustomerWrapper(_customer.toEscapedModel());
	}

	@Override
	public com.liferay.aaa.data.model.Customer toUnescapedModel() {
		return new CustomerWrapper(_customer.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customer.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customer.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerWrapper)) {
			return false;
		}

		CustomerWrapper customerWrapper = (CustomerWrapper)obj;

		if (Validator.equals(_customer, customerWrapper._customer)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _customer.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Customer getWrappedCustomer() {
		return _customer;
	}

	@Override
	public Customer getWrappedModel() {
		return _customer;
	}

	@Override
	public void resetOriginalValues() {
		_customer.resetOriginalValues();
	}

	private Customer _customer;
}