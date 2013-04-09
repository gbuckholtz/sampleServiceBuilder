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

package ca.queensu.res.soar.portlet.service.persistence;

import ca.queensu.res.soar.portlet.model.Registration;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the Soar Registration service. This utility wraps {@link RegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gbuckholtz
 * @see RegistrationPersistence
 * @see RegistrationPersistenceImpl
 * @generated
 */
public class RegistrationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Registration registration) {
		getPersistence().clearCache(registration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Registration update(Registration registration, boolean merge)
		throws SystemException {
		return getPersistence().update(registration, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Registration update(Registration registration, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(registration, merge, serviceContext);
	}

	/**
	* Caches the Soar Registration in the entity cache if it is enabled.
	*
	* @param registration the Soar Registration
	*/
	public static void cacheResult(
		ca.queensu.res.soar.portlet.model.Registration registration) {
		getPersistence().cacheResult(registration);
	}

	/**
	* Caches the Soar Registrations in the entity cache if it is enabled.
	*
	* @param registrations the Soar Registrations
	*/
	public static void cacheResult(
		java.util.List<ca.queensu.res.soar.portlet.model.Registration> registrations) {
		getPersistence().cacheResult(registrations);
	}

	/**
	* Creates a new Soar Registration with the primary key. Does not add the Soar Registration to the database.
	*
	* @param ID the primary key for the new Soar Registration
	* @return the new Soar Registration
	*/
	public static ca.queensu.res.soar.portlet.model.Registration create(long ID) {
		return getPersistence().create(ID);
	}

	/**
	* Removes the Soar Registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration that was removed
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration remove(long ID)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ID);
	}

	public static ca.queensu.res.soar.portlet.model.Registration updateImpl(
		ca.queensu.res.soar.portlet.model.Registration registration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(registration, merge);
	}

	/**
	* Returns the Soar Registration with the primary key or throws a {@link ca.queensu.res.soar.portlet.NoSuchRegistrationException} if it could not be found.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration findByPrimaryKey(
		long ID)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ID);
	}

	/**
	* Returns the Soar Registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration, or <code>null</code> if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration fetchByPrimaryKey(
		long ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ID);
	}

	/**
	* Returns all the Soar Registrations where student_id = &#63;.
	*
	* @param student_id the student_id
	* @return the matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findBystudentId(
		java.lang.String student_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystudentId(student_id);
	}

	/**
	* Returns a range of all the Soar Registrations where student_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param student_id the student_id
	* @param start the lower bound of the range of Soar Registrations
	* @param end the upper bound of the range of Soar Registrations (not inclusive)
	* @return the range of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findBystudentId(
		java.lang.String student_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystudentId(student_id, start, end);
	}

	/**
	* Returns an ordered range of all the Soar Registrations where student_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param student_id the student_id
	* @param start the lower bound of the range of Soar Registrations
	* @param end the upper bound of the range of Soar Registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findBystudentId(
		java.lang.String student_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentId(student_id, start, end, orderByComparator);
	}

	/**
	* Returns the first Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration findBystudentId_First(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentId_First(student_id, orderByComparator);
	}

	/**
	* Returns the first Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration fetchBystudentId_First(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystudentId_First(student_id, orderByComparator);
	}

	/**
	* Returns the last Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration findBystudentId_Last(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentId_Last(student_id, orderByComparator);
	}

	/**
	* Returns the last Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration fetchBystudentId_Last(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystudentId_Last(student_id, orderByComparator);
	}

	/**
	* Returns the Soar Registrations before and after the current Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param ID the primary key of the current Soar Registration
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration[] findBystudentId_PrevAndNext(
		long ID, java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentId_PrevAndNext(ID, student_id,
			orderByComparator);
	}

	/**
	* Returns all the Soar Registrations where Name = &#63;.
	*
	* @param Name the name
	* @return the matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findByStudentName(
		java.lang.String Name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStudentName(Name);
	}

	/**
	* Returns a range of all the Soar Registrations where Name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Name the name
	* @param start the lower bound of the range of Soar Registrations
	* @param end the upper bound of the range of Soar Registrations (not inclusive)
	* @return the range of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findByStudentName(
		java.lang.String Name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStudentName(Name, start, end);
	}

	/**
	* Returns an ordered range of all the Soar Registrations where Name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Name the name
	* @param start the lower bound of the range of Soar Registrations
	* @param end the upper bound of the range of Soar Registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findByStudentName(
		java.lang.String Name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStudentName(Name, start, end, orderByComparator);
	}

	/**
	* Returns the first Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration findByStudentName_First(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStudentName_First(Name, orderByComparator);
	}

	/**
	* Returns the first Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration fetchByStudentName_First(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByStudentName_First(Name, orderByComparator);
	}

	/**
	* Returns the last Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration findByStudentName_Last(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStudentName_Last(Name, orderByComparator);
	}

	/**
	* Returns the last Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration fetchByStudentName_Last(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByStudentName_Last(Name, orderByComparator);
	}

	/**
	* Returns the Soar Registrations before and after the current Soar Registration in the ordered set where Name = &#63;.
	*
	* @param ID the primary key of the current Soar Registration
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ca.queensu.res.soar.portlet.model.Registration[] findByStudentName_PrevAndNext(
		long ID, java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStudentName_PrevAndNext(ID, Name, orderByComparator);
	}

	/**
	* Returns all the Soar Registrations.
	*
	* @return the Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Soar Registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Soar Registrations
	* @param end the upper bound of the range of Soar Registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ca.queensu.res.soar.portlet.model.Registration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the Soar Registrations where student_id = &#63; from the database.
	*
	* @param student_id the student_id
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystudentId(java.lang.String student_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystudentId(student_id);
	}

	/**
	* Removes all the Soar Registrations where Name = &#63; from the database.
	*
	* @param Name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStudentName(java.lang.String Name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStudentName(Name);
	}

	/**
	* Removes all the Soar Registrations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Soar Registrations where student_id = &#63;.
	*
	* @param student_id the student_id
	* @return the number of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystudentId(java.lang.String student_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystudentId(student_id);
	}

	/**
	* Returns the number of Soar Registrations where Name = &#63;.
	*
	* @param Name the name
	* @return the number of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStudentName(java.lang.String Name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStudentName(Name);
	}

	/**
	* Returns the number of Soar Registrations.
	*
	* @return the number of Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RegistrationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RegistrationPersistence)PortletBeanLocatorUtil.locate(ca.queensu.res.soar.portlet.service.ClpSerializer.getServletContextName(),
					RegistrationPersistence.class.getName());

			ReferenceRegistry.registerReference(RegistrationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(RegistrationPersistence persistence) {
	}

	private static RegistrationPersistence _persistence;
}