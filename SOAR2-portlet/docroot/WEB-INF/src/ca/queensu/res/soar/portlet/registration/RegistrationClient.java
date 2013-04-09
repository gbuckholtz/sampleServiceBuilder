package ca.queensu.res.soar.portlet.registration;

import ca.queensu.res.soar.portlet.model.Registration;
import ca.queensu.res.soar.portlet.model.impl.RegistrationImpl;
import ca.queensu.res.soar.portlet.service.RegistrationLocalServiceUtil;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class RegistrationClient
 */
public class RegistrationClient extends MVCPortlet {
 
	public void addRegistrant(ActionRequest request, ActionResponse response) throws Exception
	{
		ThemeDisplay  themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		String studentID = ParamUtil.getString(request,"studentID");
		String studentName = ParamUtil.getString(request,"Name");
		
		System.out.println("From ACtion Request studentID: " + studentID);
		System.out.println("From Action Request: " + studentName );
		
		Registration newReg = new RegistrationImpl();
			
		newReg.setStudent_id(studentID);
		
		newReg.setName(studentName);
		newReg.setCompanyId(themeDisplay.getCompanyId());
		newReg.setGroupId(themeDisplay.getCompanyGroupId());
	
		RegistrationLocalServiceUtil.addRegistration(newReg,themeDisplay.getUserId());
	}




/**
 * doView
 * Responsible for the rendering of the view
 * All Business logic related to the rendering of the view goes here.
 */
public void doView(RenderRequest request, RenderResponse response)
                throws IOException, PortletException{          
       
       
	/*String studentID = request.getParameter("studentID");
	String studentName = request.getParameter("Name");
	
	System.out.println(studentID);
	System.out.println(studentName);
	request.setAttribute("studentID", "Name");*/
	                            
       super.doView(request, response);               
}

}