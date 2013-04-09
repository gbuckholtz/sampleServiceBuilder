<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

This is the <b>RegistrationClient</b> portlet in View mode.

<portlet:actionURL name="addRegistrant" 
	var="addRegistrantURL"/>


	
	<aui:form action="<%=addRegistrantURL.toString() %>">
		<aui:fieldset>
			<aui:input name="studentID" size="11"/>
			<aui:input name="Name" size="30"/>
			<aui:button-row><aui:button type="submit"/>
			</aui:button-row>
		</aui:fieldset>
	</aui:form>