# IntegrationLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientTimestamp** | **Int** | Timestamp in milliseconds of when the log was executed at the client. | 
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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


