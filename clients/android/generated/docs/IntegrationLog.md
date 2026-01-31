

# IntegrationLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** |  |  [optional]
**appVersionNumber** | **String** | Version number of the integration application. |  [optional]
**clientTimestamp** | **Integer** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Log event type | 
**externalBusinessId** | **String** |  |  [optional]
**feedProfileId** | **String** |  |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Log level type | 
**merchantId** | **String** |  |  [optional]
**message** | **String** | Explanation of the event that occured. |  [optional]
**platformVersionNumber** | **String** | Version number of the platform the integration application is running on. |  [optional]
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  |  [optional]
**tagId** | **String** |  |  [optional]


## Enum: EventTypeEnum

Name | Value
---- | -----


## Enum: LogLevelEnum

Name | Value
---- | -----




