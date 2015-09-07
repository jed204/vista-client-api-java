package com.intelemage.vista.api;

import java.util.List;

import com.intelemage.vista.api.model.Trial;
import com.intelemage.vista.api.model.TrialCollection;
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
}
