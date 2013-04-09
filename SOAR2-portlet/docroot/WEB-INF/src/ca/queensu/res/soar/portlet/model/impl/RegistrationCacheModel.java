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

package ca.queensu.res.soar.portlet.model.impl;

import ca.queensu.res.soar.portlet.model.Registration;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Registration in entity cache.
 *
 * @author gbuckholtz
 * @see Registration
 * @generated
 */
public class RegistrationCacheModel implements CacheModel<Registration>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", student_id=");
		sb.append(student_id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", Name=");
		sb.append(Name);
		sb.append("}");

		return sb.toString();
	}

	public Registration toEntityModel() {
		RegistrationImpl registrationImpl = new RegistrationImpl();

		registrationImpl.setID(ID);

		if (student_id == null) {
			registrationImpl.setStudent_id(StringPool.BLANK);
		}
		else {
			registrationImpl.setStudent_id(student_id);
		}

		registrationImpl.setCompanyId(companyId);
		registrationImpl.setGroupId(groupId);

		if (Name == null) {
			registrationImpl.setName(StringPool.BLANK);
		}
		else {
			registrationImpl.setName(Name);
		}

		registrationImpl.resetOriginalValues();

		return registrationImpl;
	}

	public long ID;
	public String student_id;
	public long companyId;
	public long groupId;
	public String Name;
}