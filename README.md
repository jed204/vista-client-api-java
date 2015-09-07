# Vista Platform API Client (Java)

Maven usage:
``
          <dependency>
            <groupId>com.intelemage</groupId>
            <artifactId>vista-client-api-java</artifactId>
            <version>1.0.0</version>
        </dependency>
``

Import the API class:
``
  import com.intelemage.vista.api.VistaAPI;
``

Setup the API parameters (You only need to do this once per application)
``
  VistaAPI.setupAPI("API_URL", "YOUR_CLIENT_ID", "YOUR_API_KEY", "YOUR_APP_NAME", "YOUR_APP_VERSION");
``

Note: Please contact your Intelemage Project Manager for the proper settings above

Get started! Here's how you can get a list of trials your API client has access to:
``
  List<Trial> trialList = VistaAPI.getTrials();
``
