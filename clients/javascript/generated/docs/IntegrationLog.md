# PinterestSdk.IntegrationLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientTimestamp** | **Number** | Timestamp in milliseconds of when the log was executed at the client. | 
**eventType** | **String** | Log event type | 
**logLevel** | **String** | Log level type | 
**externalBusinessId** | **String** |  | [optional] 
**advertiserId** | **String** |  | [optional] 
**merchantId** | **String** |  | [optional] 
**tagId** | **String** |  | [optional] 
**feedProfileId** | **String** |  | [optional] 
**message** | **String** | Explanation of the event that occured. | [optional] 
**appVersionNumber** | **String** | Version number of the integration application. | [optional] 
**platformVersionNumber** | **String** | Version number of the platform the integration application is running on. | [optional] 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 



## Enum: EventTypeEnum


* `APP` (value: `"APP"`)

* `API` (value: `"API"`)





## Enum: LogLevelEnum


* `INFO` (value: `"INFO"`)

* `WARN` (value: `"WARN"`)

* `ERROR` (value: `"ERROR"`)




