
# IntegrationLog

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clientTimestamp** | **kotlin.Int** | Timestamp in milliseconds of when the log was executed at the client. |  |
| **eventType** | [**inline**](#EventType) | Log event type |  |
| **logLevel** | [**inline**](#LogLevel) | Log level type |  |
| **advertiserId** | **kotlin.String** |  |  [optional] |
| **appVersionNumber** | **kotlin.String** | Version number of the integration application. |  [optional] |
| **error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  |  [optional] |
| **externalBusinessId** | **kotlin.String** |  |  [optional] |
| **feedProfileId** | **kotlin.String** |  |  [optional] |
| **merchantId** | **kotlin.String** |  |  [optional] |
| **message** | **kotlin.String** | Explanation of the event that occured. |  [optional] |
| **platformVersionNumber** | **kotlin.String** | Version number of the platform the integration application is running on. |  [optional] |
| **request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  |  [optional] |
| **tagId** | **kotlin.String** |  |  [optional] |


<a id="EventType"></a>
## Enum: event_type
| Name | Value |
| ---- | ----- |
| eventType | APP, API |


<a id="LogLevel"></a>
## Enum: log_level
| Name | Value |
| ---- | ----- |
| logLevel | INFO, WARN, ERROR |



