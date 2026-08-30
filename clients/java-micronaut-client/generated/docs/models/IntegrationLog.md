

# IntegrationLog

Schema for log sent from an integration application.

The class is defined in **[IntegrationLog.java](../../src/main/java/org/openapitools/model/IntegrationLog.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | `String` |  |  [optional property]
**appVersionNumber** | `String` | Version number of the integration application. |  [optional property]
**clientTimestamp** | `Integer` | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [`IntegrationLogClientError`](IntegrationLogClientError.md) |  |  [optional property]
**eventType** | `IntegrationLogEventType` | Log event type | 
**externalBusinessId** | `String` |  |  [optional property]
**feedProfileId** | `String` |  |  [optional property]
**logLevel** | `IntegrationLogLevel` | Log level type | 
**merchantId** | `String` |  |  [optional property]
**message** | `String` | Explanation of the event that occured. |  [optional property]
**platformVersionNumber** | `String` | Version number of the platform the integration application is running on. |  [optional property]
**request** | [`IntegrationLogClientRequest`](IntegrationLogClientRequest.md) |  |  [optional property]
**tagId** | `String` |  |  [optional property]















