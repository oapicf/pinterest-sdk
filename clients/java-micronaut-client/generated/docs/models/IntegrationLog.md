

# IntegrationLog

Schema for log sent from an integration application.

The class is defined in **[IntegrationLog.java](../../src/main/java/org/openapitools/model/IntegrationLog.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientTimestamp** | `Integer` | Timestamp in milliseconds of when the log was executed at the client. | 
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Log event type | 
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Log level type | 
**externalBusinessId** | `String` |  |  [optional property]
**advertiserId** | `String` |  |  [optional property]
**merchantId** | `String` |  |  [optional property]
**tagId** | `String` |  |  [optional property]
**feedProfileId** | `String` |  |  [optional property]
**message** | `String` | Explanation of the event that occured. |  [optional property]
**appVersionNumber** | `String` | Version number of the integration application. |  [optional property]
**platformVersionNumber** | `String` | Version number of the platform the integration application is running on. |  [optional property]
**error** | [`IntegrationLogClientError`](IntegrationLogClientError.md) |  |  [optional property]
**request** | [`IntegrationLogClientRequest`](IntegrationLogClientRequest.md) |  |  [optional property]


## EventTypeEnum

Name | Value
---- | -----
APP | `"APP"`
API | `"API"`

## LogLevelEnum

Name | Value
---- | -----
INFO | `"INFO"`
WARN | `"WARN"`
ERROR | `"ERROR"`












