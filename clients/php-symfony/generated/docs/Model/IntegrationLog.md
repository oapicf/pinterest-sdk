# IntegrationLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientTimestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**eventType** | **string** | Log event type | 
**logLevel** | **string** | Log level type | 
**externalBusinessId** | **string** |  | [optional] 
**advertiserId** | **string** |  | [optional] 
**merchantId** | **string** |  | [optional] 
**tagId** | **string** |  | [optional] 
**feedProfileId** | **string** |  | [optional] 
**message** | **string** | Explanation of the event that occured. | [optional] 
**appVersionNumber** | **string** | Version number of the integration application. | [optional] 
**platformVersionNumber** | **string** | Version number of the platform the integration application is running on. | [optional] 
**error** | [**OpenAPI\Server\Model\IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**request** | [**OpenAPI\Server\Model\IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


