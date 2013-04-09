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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the Soar Registration local service. This utility wraps {@link ca.queensu.res.soar.portlet.service.impl.RegistrationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gbuckholtz
 * @see RegistrationLocalService
 * @see ca.queensu.res.soar.portlet.service.base.RegistrationLocalServiceBaseImpl
 * @see ca.queensu.res.soar.portlet.service.impl.RegistrationLocalServiceImpl
 * @generated
 */
public class RegistrationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ca.queensu.res.soar.portlet.service.impl.RegistrationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Soar Registration to the database. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @return the Soar Registration that was added
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration addRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRegistration(registration);
	}

	/**
	* Creates a new Soar Registration with the primary key. Does not add the Soar Registration to the database.
	*
	* @param ID the primary key for the new Soar Registration
	* @return the new Soar Registration
	*/
	public static ca.queensu.res.soar.portlet.model.Registration createRegistration(
		long ID) {
		return getService().createRegistration(ID);
	}

	/**
	* Deletes the Soar Registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration that was removed
	* @throws PortalException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration deleteRegistration(
		long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRegistration(ID);
	}

	/**
	* Deletes the Soar Registration from the database. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @return the Soar Registration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration deleteRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRegistration(registration);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static ca.queensu.res.soar.portlet.model.Registration fetchRegistration(
		long ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchRegistration(ID);
	}

	/**
	* Returns the Soar Registration with the primary key.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration
	* @throws PortalException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration getRegistration(
		long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistration(ID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> getRegistrations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrations(start, end);
	}

	/**
	* Returns the number of Soar Registrations.
	*
	* @return the number of Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int getRegistrationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationsCount();
	}

	/**
	* Updates the Soar Registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @return the Soar Registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration updateRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRegistration(registration);
	}

	/**
	* Updates the Soar Registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registration the Soar Registration
	* @param merge whether to merge the Soar Registration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the Soar Registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration updateRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRegistration(registration, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static ca.queensu.res.soar.portlet.model.Registration addRegistration(
		ca.queensu.res.soar.portlet.model.Registration registration, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRegistration(registration, userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static RegistrationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RegistrationLocalService.class.getName());

			if (invokableLocalService instanceof RegistrationLocalService) {
				_service = (RegistrationLocalService)invokableLocalService;
			}
			else {
				_service = new RegistrationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RegistrationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(RegistrationLocalService service) {
	}

	private static RegistrationLocalService _service;
}