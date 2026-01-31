

# IntegrationLog

Schema for log sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** |  |  [optional]
**appVersionNumber** | **String** | Version number of the integration application. |  [optional]
**clientTimestamp** | **Int** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  |  [optional]
**eventType** | [**EventType**](#EventType) | Log event type | 
**externalBusinessId** | **String** |  |  [optional]
**feedProfileId** | **String** |  |  [optional]
**logLevel** | [**LogLevel**](#LogLevel) | Log level type | 
**merchantId** | **String** |  |  [optional]
**message** | **String** | Explanation of the event that occured. |  [optional]
**platformVersionNumber** | **String** | Version number of the platform the integration application is running on. |  [optional]
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  |  [optional]
**tagId** | **String** |  |  [optional]


## Enum: EventType
Allowed values: [APP, API]



## Enum: LogLevel
Allowed values: [INFO, WARN, ERROR]




