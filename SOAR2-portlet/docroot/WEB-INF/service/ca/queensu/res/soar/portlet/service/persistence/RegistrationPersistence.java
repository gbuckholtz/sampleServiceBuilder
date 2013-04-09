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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the Soar Registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gbuckholtz
 * @see RegistrationPersistenceImpl
 * @see RegistrationUtil
 * @generated
 */
public interface RegistrationPersistence extends BasePersistence<Registration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationUtil} to access the Soar Registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Soar Registration in the entity cache if it is enabled.
	*
	* @param registration the Soar Registration
	*/
	public void cacheResult(
		ca.queensu.res.soar.portlet.model.Registration registration);

	/**
	* Caches the Soar Registrations in the entity cache if it is enabled.
	*
	* @param registrations the Soar Registrations
	*/
	public void cacheResult(
		java.util.List<ca.queensu.res.soar.portlet.model.Registration> registrations);

	/**
	* Creates a new Soar Registration with the primary key. Does not add the Soar Registration to the database.
	*
	* @param ID the primary key for the new Soar Registration
	* @return the new Soar Registration
	*/
	public ca.queensu.res.soar.portlet.model.Registration create(long ID);

	/**
	* Removes the Soar Registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration that was removed
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration remove(long ID)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	public ca.queensu.res.soar.portlet.model.Registration updateImpl(
		ca.queensu.res.soar.portlet.model.Registration registration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Soar Registration with the primary key or throws a {@link ca.queensu.res.soar.portlet.NoSuchRegistrationException} if it could not be found.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration findByPrimaryKey(
		long ID)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Soar Registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the Soar Registration
	* @return the Soar Registration, or <code>null</code> if a Soar Registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration fetchByPrimaryKey(
		long ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Soar Registrations where student_id = &#63;.
	*
	* @param student_id the student_id
	* @return the matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findBystudentId(
		java.lang.String student_id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findBystudentId(
		java.lang.String student_id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findBystudentId(
		java.lang.String student_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration findBystudentId_First(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration fetchBystudentId_First(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration findBystudentId_Last(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Soar Registration in the ordered set where student_id = &#63;.
	*
	* @param student_id the student_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration fetchBystudentId_Last(
		java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public ca.queensu.res.soar.portlet.model.Registration[] findBystudentId_PrevAndNext(
		long ID, java.lang.String student_id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Soar Registrations where Name = &#63;.
	*
	* @param Name the name
	* @return the matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findByStudentName(
		java.lang.String Name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findByStudentName(
		java.lang.String Name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findByStudentName(
		java.lang.String Name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration findByStudentName_First(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration fetchByStudentName_First(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration
	* @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration findByStudentName_Last(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Soar Registration in the ordered set where Name = &#63;.
	*
	* @param Name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ca.queensu.res.soar.portlet.model.Registration fetchByStudentName_Last(
		java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public ca.queensu.res.soar.portlet.model.Registration[] findByStudentName_PrevAndNext(
		long ID, java.lang.String Name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws ca.queensu.res.soar.portlet.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Soar Registrations.
	*
	* @return the Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ca.queensu.res.soar.portlet.model.Registration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Soar Registrations where student_id = &#63; from the database.
	*
	* @param student_id the student_id
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystudentId(java.lang.String student_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Soar Registrations where Name = &#63; from the database.
	*
	* @param Name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStudentName(java.lang.String Name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Soar Registrations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Soar Registrations where student_id = &#63;.
	*
	* @param student_id the student_id
	* @return the number of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countBystudentId(java.lang.String student_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Soar Registrations where Name = &#63;.
	*
	* @param Name the name
	* @return the number of matching Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByStudentName(java.lang.String Name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Soar Registrations.
	*
	* @return the number of Soar Registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}