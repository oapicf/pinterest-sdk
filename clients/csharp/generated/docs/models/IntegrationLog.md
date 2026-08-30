# Org.OpenAPITools.Model.IntegrationLog
Schema for log sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientTimestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**EventType** | **IntegrationLogEventType** | Log event type | 
**LogLevel** | **IntegrationLogLevel** | Log level type | 
**AdvertiserId** | **string** |  | [optional] 
**AppVersionNumber** | **string** | Version number of the integration application. | [optional] 
**Error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**ExternalBusinessId** | **string** |  | [optional] 
**FeedProfileId** | **string** |  | [optional] 
**MerchantId** | **string** |  | [optional] 
**Message** | **string** | Explanation of the event that occured. | [optional] 
**PlatformVersionNumber** | **string** | Version number of the platform the integration application is running on. | [optional] 
**Request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 
**TagId** | **string** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

