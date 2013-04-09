/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package ca.queensu.res.soar.portlet.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Registration}.
 * </p>
 *
 * @author    gbuckholtz
 * @see       Registration
 * @generated
 */
public class RegistrationWrapper implements Registration,
	ModelWrapper<Registration> {
	public RegistrationWrapper(Registration registration) {
		_registration = registration;
	}

	public Class<?> getModelClass() {
		return Registration.class;
	}

	public String getModelClassName() {
		return Registration.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("student_id", getStudent_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("Name", getName());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long ID = (Long)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String student_id = (String)attributes.get("student_id");

		if (student_id != null) {
			setStudent_id(student_id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}
	}

	/**
	* Returns the primary key of this Soar Registration.
	*
	* @return the primary key of this Soar Registration
	*/
	public long getPrimaryKey() {
		return _registration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Soar Registration.
	*
	* @param primaryKey the primary key of this Soar Registration
	*/
	public void setPrimaryKey(long primaryKey) {
		_registration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this Soar Registration.
	*
	* @return the i d of this Soar Registration
	*/
	public long getID() {
		return _registration.getID();
	}

	/**
	* Sets the i d of this Soar Registration.
	*
	* @param ID the i d of this Soar Registration
	*/
	public void setID(long ID) {
		_registration.setID(ID);
	}

	/**
	* Returns the student_id of this Soar Registration.
	*
	* @return the student_id of this Soar Registration
	*/
	public java.lang.String getStudent_id() {
		return _registration.getStudent_id();
	}

	/**
	* Sets the student_id of this Soar Registration.
	*
	* @param student_id the student_id of this Soar Registration
	*/
	public void setStudent_id(java.lang.String student_id) {
		_registration.setStudent_id(student_id);
	}

	/**
	* Returns the company ID of this Soar Registration.
	*
	* @return the company ID of this Soar Registration
	*/
	public long getCompanyId() {
		return _registration.getCompanyId();
	}

	/**
	* Sets the company ID of this Soar Registration.
	*
	* @param companyId the company ID of this Soar Registration
	*/
	public void setCompanyId(long companyId) {
		_registration.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this Soar Registration.
	*
	* @return the group ID of this Soar Registration
	*/
	public long getGroupId() {
		return _registration.getGroupId();
	}

	/**
	* Sets the group ID of this Soar Registration.
	*
	* @param groupId the group ID of this Soar Registration
	*/
	public void setGroupId(long groupId) {
		_registration.setGroupId(groupId);
	}

	/**
	* Returns the name of this Soar Registration.
	*
	* @return the name of this Soar Registration
	*/
	public java.lang.String getName() {
		return _registration.getName();
	}

	/**
	* Sets the name of this Soar Registration.
	*
	* @param Name the name of this Soar Registration
	*/
	public void setName(java.lang.String Name) {
		_registration.setName(Name);
	}

	public boolean isNew() {
		return _registration.isNew();
	}

	public void setNew(boolean n) {
		_registration.setNew(n);
	}

	public boolean isCachedModel() {
		return _registration.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_registration.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _registration.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _registration.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_registration.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _registration.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_registration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RegistrationWrapper((Registration)_registration.clone());
	}

	public int compareTo(
		ca.queensu.res.soar.portlet.model.Registration registration) {
		return _registration.compareTo(registration);
	}

	@Override
	public int hashCode() {
		return _registration.hashCode();
	}

	public com.liferay.portal.model.CacheModel<ca.queensu.res.soar.portlet.model.Registration> toCacheModel() {
		return _registration.toCacheModel();
	}

	public ca.queensu.res.soar.portlet.model.Registration toEscapedModel() {
		return new RegistrationWrapper(_registration.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _registration.toString();
	}

	public java.lang.String toXmlString() {
		return _registration.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_registration.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Registration getWrappedRegistration() {
		return _registration;
	}

	public Registration getWrappedModel() {
		return _registration;
	}

	public void resetOriginalValues() {
		_registration.resetOriginalValues();
	}

	private Registration _registration;
}