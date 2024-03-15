# Org.OpenAPITools.Model.IntegrationLog
Schema for log sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientTimestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**EventType** | **string** | Log event type | 
**LogLevel** | **string** | Log level type | 
**ExternalBusinessId** | **string** |  | [optional] 
**AdvertiserId** | **string** |  | [optional] 
**MerchantId** | **string** |  | [optional] 
**TagId** | **string** |  | [optional] 
**FeedProfileId** | **string** |  | [optional] 
**Message** | **string** | Explanation of the event that occured. | [optional] 
**AppVersionNumber** | **string** | Version number of the integration application. | [optional] 
**PlatformVersionNumber** | **string** | Version number of the platform the integration application is running on. | [optional] 
**Error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**Request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

