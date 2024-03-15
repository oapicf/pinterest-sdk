

# IntegrationLog

Schema for log sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientTimestamp** | **Int** | Timestamp in milliseconds of when the log was executed at the client. | 
**eventType** | [**EventType**](#EventType) | Log event type | 
**logLevel** | [**LogLevel**](#LogLevel) | Log level type | 
**externalBusinessId** | **String** |  |  [optional]
**advertiserId** | **String** |  |  [optional]
**merchantId** | **String** |  |  [optional]
**tagId** | **String** |  |  [optional]
**feedProfileId** | **String** |  |  [optional]
**message** | **String** | Explanation of the event that occured. |  [optional]
**appVersionNumber** | **String** | Version number of the integration application. |  [optional]
**platformVersionNumber** | **String** | Version number of the platform the integration application is running on. |  [optional]
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  |  [optional]
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  |  [optional]


## Enum: EventType
Allowed values: [APP, API]



## Enum: LogLevel
Allowed values: [INFO, WARN, ERROR]




