package com.intelemage.vista.api;

import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.intelemage.vista.api.model.APIResult;
import com.intelemage.vista.api.model.APIResultHolder;
import com.intelemage.vista.api.model.Subject;
import com.intelemage.vista.api.model.Trial;
import com.intelemage.vista.api.model.TrialCollection;
import com.intelemage.vista.api.model.VerticalDataItem;
import com.intelemage.vista.api.model.Visit;
import com.intelemage.vista.api.model.VisitCollection;
import com.untzuntz.ustackclientapi.ParameterSet;
import com.untzuntz.ustackclientapi.UStack;
import com.untzuntz.ustackclientapi.exceptions.ClientSideException;
import com.untzuntz.ustackclientapi.exceptions.ServerSideException;

public class VistaAPI {

	/**
	 * Setup the API parameters needed to communicate with the platform
	 * 
	 * @param apiServer URL of the test server
	 * @param clientId Your Client ID for the API
	 * @param apiKey Your API Key
	 * @param applicationName Name of your application (short, no spaces is fine)
	 * @param applicationVersion Version of your application
	 */
	public static void setupAPI(String apiServer, String clientId, String apiKey, String applicationName, String applicationVersion) {
		UStack.API_BASE = apiServer;
		UStack.API_VERSION = "v1/";
		UStack.clientId = clientId;
		UStack.apiKey = apiKey;
		UStack.CLIENT_VERSION = applicationVersion;
		UStack.APP_NAME = applicationName;
	}

	/**
	 * Returns a list of Trials the caller has access to manage/view/update
	 * 
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static List<Trial> getTrials() throws ServerSideException, ClientSideException
	{
		return UStack.get("/intelegrid/vista/trials", 
				TrialCollection.class,
				new ParameterSet()).getTrials();
	}

	/**
	 * Updates an existing site/subject or creates a new one if it doesn't exist
	 * 
	 * @param trialId
	 * @param siteName
	 * @param subjectName
	 * @param actor
	 * @param changeReason
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static Subject addUpdateSubject(Long trialId, String siteName, String subjectName, String actor, String changeReason) throws ServerSideException, ClientSideException
	{
		return UStack.post("/intelegrid/vista/trial/subject/update", 
				Subject.class,
				new ParameterSet(Params.trial_id, trialId).add(Params.site_name, siteName).add(Params.subject_name, subjectName).add(Params.actor, actor).add(Params.change_reason, changeReason));
	}
	
	/**
	 * Returns a list of Visits for the provided Subject
	 * 
	 * @param trialId
	 * @param subjectId
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static List<Visit> getVisitsBySubject(Long trialId, Long subjectId) throws ServerSideException, ClientSideException
	{
		return UStack.get("/intelegrid/vista/trial/subject/visits", 
				VisitCollection.class,
				new ParameterSet(Params.trial_id, trialId).add(Params.subject_id, subjectId)).getVisits();
	}
	
	/**
	 * Returns the details about a specific visit
	 * 
	 * @param trialId
	 * @param siteName
	 * @param subjectName
	 * @param visitName
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static Visit getVisitById(Long trialId, Long visitId, boolean includeTrackedItems, boolean includeStudies) throws ServerSideException, ClientSideException
	{
		return UStack.get("/intelegrid/vista/trial/subject/visit", 
				Visit.class,
				new ParameterSet(Params.trial_id, trialId).add(Params.visit_id, visitId).add(Params.include_tracked_items, includeTrackedItems).add(Params.include_studies, includeStudies));
	}
	
	/**
	 * Updates an existing visit or creates a new visit
	 * 
	 * @param trialId
	 * @param siteName
	 * @param subjectName
	 * @param visitName
	 * @param visitDate
	 * @param trackedData
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static Visit addUpdateVisit(Long trialId, String siteName, String subjectName, String visitName, Date visitDate, List<VerticalDataItem> trackedData, String actor, String changeReason) throws ServerSideException, ClientSideException
	{
		String trackedDataStr = null;
		if (trackedData != null)
			trackedDataStr = new Gson().toJson(trackedData);
		
		return UStack.post("/intelegrid/vista/trial/visit/update", 
				Visit.class,
				new ParameterSet(Params.trial_id, trialId).add(Params.site_name, siteName).add(Params.subject_name, subjectName).add(Params.visit_name, visitName).add(Params.visit_date, visitDate).add(Params.tracked_data, trackedDataStr).add(Params.actor, actor).add(Params.change_reason, changeReason));
	}
	
	/**
	 * Sets the form data XML for the provided visit requirement
	 * 
	 * @param trialId
	 * @param siteName
	 * @param subjectName
	 * @param visitName
	 * @param requirementName
	 * @param formXml
	 * @param actor
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static APIResult setRequirementFormData(Long trialId, String siteName, String subjectName, String visitName, String requirementName, String formXml, String actor) throws ServerSideException, ClientSideException 
	{
		return setRequirementFormData(trialId, siteName, subjectName, visitName, requirementName, formXml, null, null, actor);
	}
	
	/**
	 * Sets the form data XML for the provided visit requirement
	 * 
	 * @param trialId
	 * @param siteName
	 * @param subjectName
	 * @param visitName
	 * @param requirementName
	 * @param formXml
	 * @param mode
	 * @param status
	 * @param actor
	 */
	public static APIResult setRequirementFormData(Long trialId, String siteName, String subjectName, String visitName, String requirementName, String formXml, String mode, String status, String actor) throws ServerSideException, ClientSideException 
	{
		return UStack.post("/intelegrid/vista/trial/subject/visit/form/set", 
				APIResultHolder.class,
				new ParameterSet(Params.trial_id, trialId).add(Params.site_name, siteName).add(Params.subject_name, subjectName).add(Params.visit_name, visitName).add(Params.requirement_name, requirementName).add(Params.form_xml, formXml).add(Params.mode, mode).add(Params.status, status)).getResult();
	}
	
	/**
	 * Starts a new visit workflow for the provided visit
	 * 
	 * @param trialId
	 * @param visitId
	 * @param workflowName
	 * @return
	 * @throws ServerSideException
	 * @throws ClientSideException
	 */
	public static APIResult startVisitWorkflow(Long trialId, Long visitId, String workflowName) throws ServerSideException, ClientSideException
	{
		return UStack.post("/intelegrid/vista/trial/visit/start_workflow", 
				APIResultHolder.class,
				new ParameterSet(Params.trial_id, trialId).add(Params.visit_id, visitId).add(Params.name, workflowName)).getResult();
	}
}
