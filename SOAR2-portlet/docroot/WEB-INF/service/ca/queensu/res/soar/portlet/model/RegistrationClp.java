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

import ca.queensu.res.soar.portlet.service.RegistrationLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gbuckholtz
 */
public class RegistrationClp extends BaseModelImpl<Registration>
	implements Registration {
	public RegistrationClp() {
	}

	public Class<?> getModelClass() {
		return Registration.class;
	}

	public String getModelClassName() {
		return Registration.class.getName();
	}

	public long getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(long primaryKey) {
		setID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_ID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("student_id", getStudent_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("Name", getName());

		return attributes;
	}

	@Override
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

	public long getID() {
		return _ID;
	}

	public void setID(long ID) {
		_ID = ID;
	}

	public String getStudent_id() {
		return _student_id;
	}

	public void setStudent_id(String student_id) {
		_student_id = student_id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public BaseModel<?> getRegistrationRemoteModel() {
		return _registrationRemoteModel;
	}

	public void setRegistrationRemoteModel(BaseModel<?> registrationRemoteModel) {
		_registrationRemoteModel = registrationRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			RegistrationLocalServiceUtil.addRegistration(this);
		}
		else {
			RegistrationLocalServiceUtil.updateRegistration(this);
		}
	}

	@Override
	public Registration toEscapedModel() {
		return (Registration)Proxy.newProxyInstance(Registration.class.getClassLoader(),
			new Class[] { Registration.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RegistrationClp clone = new RegistrationClp();

		clone.setID(getID());
		clone.setStudent_id(getStudent_id());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setName(getName());

		return clone;
	}

	public int compareTo(Registration registration) {
		long primaryKey = registration.getPrimaryKey();

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
		if (obj == null) {
			return false;
		}

		RegistrationClp registration = null;

		try {
			registration = (RegistrationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = registration.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", student_id=");
		sb.append(getStudent_id());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", Name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("ca.queensu.res.soar.portlet.model.Registration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student_id</column-name><column-value><![CDATA[");
		sb.append(getStudent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ID;
	private String _student_id;
	private long _companyId;
	private long _groupId;
	private String _Name;
	private BaseModel<?> _registrationRemoteModel;
}