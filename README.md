# Vista Platform API Client (Java)

Add the library using Maven:
```xml
<dependency>
          <groupId>com.intelemage</groupId>
          <artifactId>vista-client-api-java</artifactId>
          <version>1.0.0</version>
</dependency>
```

## Getting Started

Import the API class:
```java
  import com.intelemage.vista.api.VistaAPI;
```

Setup the API parameters (You only need to do this once per application)
```java
  VistaAPI.setupAPI("API_URL", "YOUR_CLIENT_ID", "YOUR_API_KEY", "YOUR_APP_NAME", "YOUR_APP_VERSION");
```

<i>Note: Please contact your Intelemage Project Manager for the proper settings above</i>

Here's how you can get a list of trials your API client has access to:
```java  
   List<Trial> trialList = VistaAPI.getTrials();
```


## Available Calls

