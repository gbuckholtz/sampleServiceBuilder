/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package ca.queensu.res.soar.portlet;

import com.liferay.portal.NoSuchModelException;

/**
 * @author gbuckholtz
 */
public class NoSuchRegistrationException extends NoSuchModelException {

	public NoSuchRegistrationException() {
		super();
	}

	public NoSuchRegistrationException(String msg) {
		super(msg);
	}

	public NoSuchRegistrationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchRegistrationException(Throwable cause) {
		super(cause);
	}

}