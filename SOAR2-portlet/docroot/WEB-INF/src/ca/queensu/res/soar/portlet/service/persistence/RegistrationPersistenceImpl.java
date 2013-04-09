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

import ca.queensu.res.soar.portlet.NoSuchRegistrationException;
import ca.queensu.res.soar.portlet.model.Registration;
import ca.queensu.res.soar.portlet.model.impl.RegistrationImpl;
import ca.queensu.res.soar.portlet.model.impl.RegistrationModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Soar Registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gbuckholtz
 * @see RegistrationPersistence
 * @see RegistrationUtil
 * @generated
 */
public class RegistrationPersistenceImpl extends BasePersistenceImpl<Registration>
	implements RegistrationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RegistrationUtil} to access the Soar Registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RegistrationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTID =
		new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystudentId",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTID =
		new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystudentId",
			new String[] { String.class.getName() },
			RegistrationModelImpl.STUDENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTID = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystudentId",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTNAME =
		new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStudentName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAME =
		new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStudentName",
			new String[] { String.class.getName() },
			RegistrationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTNAME = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudentName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the Soar Registration in the entity cache if it is enabled.
	 *
	 * @param registration the Soar Registration
	 */
	public void cacheResult(Registration registration) {
		EntityCacheUtil.putResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationImpl.class, registration.getPrimaryKey(), registration);

		registration.resetOriginalValues();
	}

	/**
	 * Caches the Soar Registrations in the entity cache if it is enabled.
	 *
	 * @param registrations the Soar Registrations
	 */
	public void cacheResult(List<Registration> registrations) {
		for (Registration registration : registrations) {
			if (EntityCacheUtil.getResult(
						RegistrationModelImpl.ENTITY_CACHE_ENABLED,
						RegistrationImpl.class, registration.getPrimaryKey()) == null) {
				cacheResult(registration);
			}
			else {
				registration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Soar Registrations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RegistrationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RegistrationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Soar Registration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Registration registration) {
		EntityCacheUtil.removeResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationImpl.class, registration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Registration> registrations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Registration registration : registrations) {
			EntityCacheUtil.removeResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
				RegistrationImpl.class, registration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Soar Registration with the primary key. Does not add the Soar Registration to the database.
	 *
	 * @param ID the primary key for the new Soar Registration
	 * @return the new Soar Registration
	 */
	public Registration create(long ID) {
		Registration registration = new RegistrationImpl();

		registration.setNew(true);
		registration.setPrimaryKey(ID);

		return registration;
	}

	/**
	 * Removes the Soar Registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the Soar Registration
	 * @return the Soar Registration that was removed
	 * @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration remove(long ID)
		throws NoSuchRegistrationException, SystemException {
		return remove(Long.valueOf(ID));
	}

	/**
	 * Removes the Soar Registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Soar Registration
	 * @return the Soar Registration that was removed
	 * @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Registration remove(Serializable primaryKey)
		throws NoSuchRegistrationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Registration registration = (Registration)session.get(RegistrationImpl.class,
					primaryKey);

			if (registration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(registration);
		}
		catch (NoSuchRegistrationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Registration removeImpl(Registration registration)
		throws SystemException {
		registration = toUnwrappedModel(registration);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, registration);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(registration);

		return registration;
	}

	@Override
	public Registration updateImpl(
		ca.queensu.res.soar.portlet.model.Registration registration,
		boolean merge) throws SystemException {
		registration = toUnwrappedModel(registration);

		boolean isNew = registration.isNew();

		RegistrationModelImpl registrationModelImpl = (RegistrationModelImpl)registration;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, registration, merge);

			registration.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RegistrationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((registrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationModelImpl.getOriginalStudent_id()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTID,
					args);

				args = new Object[] { registrationModelImpl.getStudent_id() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTID,
					args);
			}

			if ((registrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAME,
					args);

				args = new Object[] { registrationModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationImpl.class, registration.getPrimaryKey(), registration);

		return registration;
	}

	protected Registration toUnwrappedModel(Registration registration) {
		if (registration instanceof RegistrationImpl) {
			return registration;
		}

		RegistrationImpl registrationImpl = new RegistrationImpl();

		registrationImpl.setNew(registration.isNew());
		registrationImpl.setPrimaryKey(registration.getPrimaryKey());

		registrationImpl.setID(registration.getID());
		registrationImpl.setStudent_id(registration.getStudent_id());
		registrationImpl.setCompanyId(registration.getCompanyId());
		registrationImpl.setGroupId(registration.getGroupId());
		registrationImpl.setName(registration.getName());

		return registrationImpl;
	}

	/**
	 * Returns the Soar Registration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Soar Registration
	 * @return the Soar Registration
	 * @throws com.liferay.portal.NoSuchModelException if a Soar Registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Registration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the Soar Registration with the primary key or throws a {@link ca.queensu.res.soar.portlet.NoSuchRegistrationException} if it could not be found.
	 *
	 * @param ID the primary key of the Soar Registration
	 * @return the Soar Registration
	 * @throws ca.queensu.res.soar.portlet.NoSuchRegistrationException if a Soar Registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration findByPrimaryKey(long ID)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = fetchByPrimaryKey(ID);

		if (registration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + ID);
			}

			throw new NoSuchRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				ID);
		}

		return registration;
	}

	/**
	 * Returns the Soar Registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Soar Registration
	 * @return the Soar Registration, or <code>null</code> if a Soar Registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Registration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the Soar Registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the Soar Registration
	 * @return the Soar Registration, or <code>null</code> if a Soar Registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration fetchByPrimaryKey(long ID) throws SystemException {
		Registration registration = (Registration)EntityCacheUtil.getResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
				RegistrationImpl.class, ID);

		if (registration == _nullRegistration) {
			return null;
		}

		if (registration == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				registration = (Registration)session.get(RegistrationImpl.class,
						Long.valueOf(ID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (registration != null) {
					cacheResult(registration);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
						RegistrationImpl.class, ID, _nullRegistration);
				}

				closeSession(session);
			}
		}

		return registration;
	}

	/**
	 * Returns all the Soar Registrations where student_id = &#63;.
	 *
	 * @param student_id the student_id
	 * @return the matching Soar Registrations
	 * @throws SystemException if a system exception occurred
	 */
	public List<Registration> findBystudentId(String student_id)
		throws SystemException {
		return findBystudentId(student_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<Registration> findBystudentId(String student_id, int start,
		int end) throws SystemException {
		return findBystudentId(student_id, start, end, null);
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
	public List<Registration> findBystudentId(String student_id, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTID;
			finderArgs = new Object[] { student_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTID;
			finderArgs = new Object[] { student_id, start, end, orderByComparator };
		}

		List<Registration> list = (List<Registration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Registration registration : list) {
				if (!Validator.equals(student_id, registration.getStudent_id())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_REGISTRATION_WHERE);

			if (student_id == null) {
				query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_1);
			}
			else {
				if (student_id.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_3);
				}
				else {
					query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (student_id != null) {
					qPos.add(student_id);
				}

				list = (List<Registration>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public Registration findBystudentId_First(String student_id,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = fetchBystudentId_First(student_id,
				orderByComparator);

		if (registration != null) {
			return registration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("student_id=");
		msg.append(student_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationException(msg.toString());
	}

	/**
	 * Returns the first Soar Registration in the ordered set where student_id = &#63;.
	 *
	 * @param student_id the student_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration fetchBystudentId_First(String student_id,
		OrderByComparator orderByComparator) throws SystemException {
		List<Registration> list = findBystudentId(student_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Registration findBystudentId_Last(String student_id,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = fetchBystudentId_Last(student_id,
				orderByComparator);

		if (registration != null) {
			return registration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("student_id=");
		msg.append(student_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationException(msg.toString());
	}

	/**
	 * Returns the last Soar Registration in the ordered set where student_id = &#63;.
	 *
	 * @param student_id the student_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration fetchBystudentId_Last(String student_id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBystudentId(student_id);

		List<Registration> list = findBystudentId(student_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Registration[] findBystudentId_PrevAndNext(long ID,
		String student_id, OrderByComparator orderByComparator)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = findByPrimaryKey(ID);

		Session session = null;

		try {
			session = openSession();

			Registration[] array = new RegistrationImpl[3];

			array[0] = getBystudentId_PrevAndNext(session, registration,
					student_id, orderByComparator, true);

			array[1] = registration;

			array[2] = getBystudentId_PrevAndNext(session, registration,
					student_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Registration getBystudentId_PrevAndNext(Session session,
		Registration registration, String student_id,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REGISTRATION_WHERE);

		if (student_id == null) {
			query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_1);
		}
		else {
			if (student_id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_3);
			}
			else {
				query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (student_id != null) {
			qPos.add(student_id);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Registration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the Soar Registrations where Name = &#63;.
	 *
	 * @param Name the name
	 * @return the matching Soar Registrations
	 * @throws SystemException if a system exception occurred
	 */
	public List<Registration> findByStudentName(String Name)
		throws SystemException {
		return findByStudentName(Name, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	public List<Registration> findByStudentName(String Name, int start, int end)
		throws SystemException {
		return findByStudentName(Name, start, end, null);
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
	public List<Registration> findByStudentName(String Name, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAME;
			finderArgs = new Object[] { Name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTNAME;
			finderArgs = new Object[] { Name, start, end, orderByComparator };
		}

		List<Registration> list = (List<Registration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Registration registration : list) {
				if (!Validator.equals(Name, registration.getName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_REGISTRATION_WHERE);

			if (Name == null) {
				query.append(_FINDER_COLUMN_STUDENTNAME_NAME_1);
			}
			else {
				if (Name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STUDENTNAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_STUDENTNAME_NAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (Name != null) {
					qPos.add(Name);
				}

				list = (List<Registration>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public Registration findByStudentName_First(String Name,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = fetchByStudentName_First(Name,
				orderByComparator);

		if (registration != null) {
			return registration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("Name=");
		msg.append(Name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationException(msg.toString());
	}

	/**
	 * Returns the first Soar Registration in the ordered set where Name = &#63;.
	 *
	 * @param Name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration fetchByStudentName_First(String Name,
		OrderByComparator orderByComparator) throws SystemException {
		List<Registration> list = findByStudentName(Name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Registration findByStudentName_Last(String Name,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = fetchByStudentName_Last(Name,
				orderByComparator);

		if (registration != null) {
			return registration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("Name=");
		msg.append(Name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationException(msg.toString());
	}

	/**
	 * Returns the last Soar Registration in the ordered set where Name = &#63;.
	 *
	 * @param Name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Soar Registration, or <code>null</code> if a matching Soar Registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Registration fetchByStudentName_Last(String Name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStudentName(Name);

		List<Registration> list = findByStudentName(Name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Registration[] findByStudentName_PrevAndNext(long ID, String Name,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationException, SystemException {
		Registration registration = findByPrimaryKey(ID);

		Session session = null;

		try {
			session = openSession();

			Registration[] array = new RegistrationImpl[3];

			array[0] = getByStudentName_PrevAndNext(session, registration,
					Name, orderByComparator, true);

			array[1] = registration;

			array[2] = getByStudentName_PrevAndNext(session, registration,
					Name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Registration getByStudentName_PrevAndNext(Session session,
		Registration registration, String Name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REGISTRATION_WHERE);

		if (Name == null) {
			query.append(_FINDER_COLUMN_STUDENTNAME_NAME_1);
		}
		else {
			if (Name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STUDENTNAME_NAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_STUDENTNAME_NAME_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (Name != null) {
			qPos.add(Name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Registration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the Soar Registrations.
	 *
	 * @return the Soar Registrations
	 * @throws SystemException if a system exception occurred
	 */
	public List<Registration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Registration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<Registration> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Registration> list = (List<Registration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REGISTRATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISTRATION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Registration>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Registration>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the Soar Registrations where student_id = &#63; from the database.
	 *
	 * @param student_id the student_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBystudentId(String student_id) throws SystemException {
		for (Registration registration : findBystudentId(student_id)) {
			remove(registration);
		}
	}

	/**
	 * Removes all the Soar Registrations where Name = &#63; from the database.
	 *
	 * @param Name the name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStudentName(String Name) throws SystemException {
		for (Registration registration : findByStudentName(Name)) {
			remove(registration);
		}
	}

	/**
	 * Removes all the Soar Registrations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Registration registration : findAll()) {
			remove(registration);
		}
	}

	/**
	 * Returns the number of Soar Registrations where student_id = &#63;.
	 *
	 * @param student_id the student_id
	 * @return the number of matching Soar Registrations
	 * @throws SystemException if a system exception occurred
	 */
	public int countBystudentId(String student_id) throws SystemException {
		Object[] finderArgs = new Object[] { student_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STUDENTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATION_WHERE);

			if (student_id == null) {
				query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_1);
			}
			else {
				if (student_id.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_3);
				}
				else {
					query.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (student_id != null) {
					qPos.add(student_id);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of Soar Registrations where Name = &#63;.
	 *
	 * @param Name the name
	 * @return the number of matching Soar Registrations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStudentName(String Name) throws SystemException {
		Object[] finderArgs = new Object[] { Name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STUDENTNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATION_WHERE);

			if (Name == null) {
				query.append(_FINDER_COLUMN_STUDENTNAME_NAME_1);
			}
			else {
				if (Name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STUDENTNAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_STUDENTNAME_NAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (Name != null) {
					qPos.add(Name);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of Soar Registrations.
	 *
	 * @return the number of Soar Registrations
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REGISTRATION);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the Soar Registration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.ca.queensu.res.soar.portlet.model.Registration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Registration>> listenersList = new ArrayList<ModelListener<Registration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Registration>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(RegistrationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = RegistrationPersistence.class)
	protected RegistrationPersistence registrationPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_REGISTRATION = "SELECT registration FROM Registration registration";
	private static final String _SQL_SELECT_REGISTRATION_WHERE = "SELECT registration FROM Registration registration WHERE ";
	private static final String _SQL_COUNT_REGISTRATION = "SELECT COUNT(registration) FROM Registration registration";
	private static final String _SQL_COUNT_REGISTRATION_WHERE = "SELECT COUNT(registration) FROM Registration registration WHERE ";
	private static final String _FINDER_COLUMN_STUDENTID_STUDENT_ID_1 = "registration.student_id IS NULL";
	private static final String _FINDER_COLUMN_STUDENTID_STUDENT_ID_2 = "registration.student_id = ?";
	private static final String _FINDER_COLUMN_STUDENTID_STUDENT_ID_3 = "(registration.student_id IS NULL OR registration.student_id = ?)";
	private static final String _FINDER_COLUMN_STUDENTNAME_NAME_1 = "registration.Name IS NULL";
	private static final String _FINDER_COLUMN_STUDENTNAME_NAME_2 = "registration.Name = ?";
	private static final String _FINDER_COLUMN_STUDENTNAME_NAME_3 = "(registration.Name IS NULL OR registration.Name = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "registration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Registration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Registration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RegistrationPersistenceImpl.class);
	private static Registration _nullRegistration = new RegistrationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Registration> toCacheModel() {
				return _nullRegistrationCacheModel;
			}
		};

	private static CacheModel<Registration> _nullRegistrationCacheModel = new CacheModel<Registration>() {
			public Registration toEntityModel() {
				return _nullRegistration;
			}
		};
}