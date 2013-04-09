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

package ca.queensu.res.soar.portlet.service.impl;



import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.counter.service.CounterLocalServiceUtil;
import ca.queensu.res.soar.portlet.model.Registration;
import ca.queensu.res.soar.portlet.service.base.RegistrationLocalServiceBaseImpl;
import ca.queensu.res.soar.portlet.service.persistence.RegistrationPersistenceImpl;

/**
 * The implementation of the registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ca.queensu.res.soar.portlet.service.RegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gbuckholtz
 * @see ca.queensu.res.soar.portlet.service.base.RegistrationLocalServiceBaseImpl
 * @see ca.queensu.res.soar.portlet.service.RegistrationLocalServiceUtil
 */
public class RegistrationLocalServiceImpl
	extends RegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link ca.queensu.res.soar.portlet.service.RegistrationLocalServiceUtil} to access the registration local service.
	 */
	

	public Registration addRegistration(Registration registration, long userId) throws SystemException
	{
		
		
		
		Registration newReg = registrationPersistence.create(CounterLocalServiceUtil.increment(Registration.class.getName()));
		
		System.out.println("localserviceimpl name: " + registration.getName());
		System.out.println("localserviceimpl id: " + registration.getStudent_id());
		System.out.println("localserviceimpl group:" + registration.getGroupId());
		System.out.println("localserviceimpl company id: " +String.valueOf(registration.getCompanyId()));
		System.out.println("localserviceimpl user id: " + String.valueOf(userId));
		
		System.out.println(Registration.class.getName());
		
		
		//try {
			/*resourceLocalService.addResources(registration.getCompanyId(),
												registration.getGroupId(),
												Registration.class.getName(), false);
			*/
			/*resourceLocalService.addResources(registration.getCompanyId(),
					registration.getGroupId(), userId,
					Registration.class.getName(),newReg.getPrimaryKey(), false,true,true);
			*/
			/*resourceLocalService.addResources(
		            newProduct.getCompanyId(), newProduct.getGroupId(), userId,
		            PRProduct.class.getName(), product.getPrimaryKey(), false, true, true);*/
			newReg.setName(registration.getName());
			newReg.setStudent_id(registration.getStudent_id());
			newReg.setCompanyId(registration.getCompanyId());
			newReg.setGroupId(registration.getGroupId());
			
			
//		} catch (PortalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
			Registration testReg = null;
			try{
			 testReg= registrationPersistence.update(newReg, false);
			}
			catch(Exception se)
			{
				System.out.println("Failed to update");
				se.printStackTrace();
			}
			if (testReg== null)
			{
				System.out.println("null value for peristed object");
			}
			else
			{
				System.out.println("persisted object not null");
			}
		return testReg;
	
	}
	
	
}