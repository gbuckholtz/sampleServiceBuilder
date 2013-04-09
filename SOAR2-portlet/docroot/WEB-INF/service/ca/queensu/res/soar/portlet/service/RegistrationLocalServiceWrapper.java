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

package ca.queensu.res.soar.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link RegistrationLocalService}.
 * </p>
 *
 * @author    gbuckholtz
 * @see       RegistrationLocalService
 * @generated
 */
public class RegistrationLocalServiceWrapper implements RegistrationLocalService,
	ServiceWrapper<RegistrationLocalService> {
	public RegistrationLocalServiceWrapper(
		RegistrationLocalService registrationLocalService) {
		_registrationLocalService = registrationLocalService;
	}

	/**
	* Adds the Soar Registration to the database. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @return the Soar Registration that was added
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration addRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.addRegistration(registration);
	}

	/**
	* Creates a new Soar Registration with the primary key. Does not add the Soar Registration to the database.
	*
	* @param ID the primary key for the new Soar Registration
	* @return the new Soar Registration
	*/
	public ca.queensu.res.soar.portlet.model.Registration createRegistration(
		long ID) {
		return _registrationLocalService.createRegistration(ID);
	}

	/**
	* Deletes the Soar Registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration that was removed
	* @throws PortalException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration deleteRegistration(
		long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.deleteRegistration(ID);
	}

	/**
	* Deletes the Soar Registration from the database. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @return the Soar Registration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration deleteRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.deleteRegistration(registration);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registrationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.dynamicQueryCount(dynamicQuery);
	}

	public ca.queensu.res.soar.portlet.model.Registration fetchRegistration(
		long ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.fetchRegistration(ID);
	}

	/**
	* Returns the Soar Registration with the primary key.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration
	* @throws PortalException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration getRegistration(
		long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.getRegistration(ID);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Soar Registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Soar Registrations
	* @param end the upper bound of the range of Soar Registrations (not inclusive)
	* @return the range of Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> getRegistrations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.getRegistrations(start, end);
	}

	/**
	* Returns the number of Soar Registrations.
	*
	* @return the number of Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public int getRegistrationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.getRegistrationsCount();
	}

	/**
	* Updates the Soar Registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @return the Soar Registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration updateRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.updateRegistration(registration);
	}

	/**
	* Updates the Soar Registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @param merge whether to merge the Soar Registration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the Soar Registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration updateRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.updateRegistration(registration, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _registrationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_registrationLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _registrationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public ca.queensu.res.soar.portlet.model.Registration addRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationLocalService.addRegistration(registration, userId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RegistrationLocalService getWrappedRegistrationLocalService() {
		return _registrationLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRegistrationLocalService(
		RegistrationLocalService registrationLocalService) {
		_registrationLocalService = registrationLocalService;
	}

	public RegistrationLocalService getWrappedService() {
		return _registrationLocalService;
	}

	public void setWrappedService(
		RegistrationLocalService registrationLocalService) {
		_registrationLocalService = registrationLocalService;
	}

	private RegistrationLocalService _registrationLocalService;
}