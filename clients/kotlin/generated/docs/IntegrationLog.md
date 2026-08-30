
# IntegrationLog

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clientTimestamp** | **kotlin.Int** | Timestamp in milliseconds of when the log was executed at the client. |  |
| **eventType** | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type |  |
| **logLevel** | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type |  |
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



