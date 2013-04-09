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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Registration service. Represents a row in the &quot;SOAR_REGISTRATION_LIFERAY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ca.queensu.res.soar.portlet.model.impl.RegistrationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ca.queensu.res.soar.portlet.model.impl.RegistrationImpl}.
 * </p>
 *
 * @author gbuckholtz
 * @see Registration
 * @see ca.queensu.res.soar.portlet.model.impl.RegistrationImpl
 * @see ca.queensu.res.soar.portlet.model.impl.RegistrationModelImpl
 * @generated
 */
public interface RegistrationModel extends BaseModel<Registration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Soar Registration model instance should use the {@link Registration} interface instead.
	 */

	/**
	 * Returns the primary key of this Soar Registration.
	 *
	 * @return the primary key of this Soar Registration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Soar Registration.
	 *
	 * @param primaryKey the primary key of this Soar Registration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the i d of this Soar Registration.
	 *
	 * @return the i d of this Soar Registration
	 */
	public long getID();

	/**
	 * Sets the i d of this Soar Registration.
	 *
	 * @param ID the i d of this Soar Registration
	 */
	public void setID(long ID);

	/**
	 * Returns the student_id of this Soar Registration.
	 *
	 * @return the student_id of this Soar Registration
	 */
	@AutoEscape
	public String getStudent_id();

	/**
	 * Sets the student_id of this Soar Registration.
	 *
	 * @param student_id the student_id of this Soar Registration
	 */
	public void setStudent_id(String student_id);

	/**
	 * Returns the company ID of this Soar Registration.
	 *
	 * @return the company ID of this Soar Registration
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this Soar Registration.
	 *
	 * @param companyId the company ID of this Soar Registration
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this Soar Registration.
	 *
	 * @return the group ID of this Soar Registration
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this Soar Registration.
	 *
	 * @param groupId the group ID of this Soar Registration
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the name of this Soar Registration.
	 *
	 * @return the name of this Soar Registration
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this Soar Registration.
	 *
	 * @param Name the name of this Soar Registration
	 */
	public void setName(String Name);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Registration registration);

	public int hashCode();

	public CacheModel<Registration> toCacheModel();

	public Registration toEscapedModel();

	public String toString();

	public String toXmlString();
}