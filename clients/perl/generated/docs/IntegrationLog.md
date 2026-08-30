# WWW::OpenAPIClient::Object::IntegrationLog

## Load the model package
```perl
use WWW::OpenAPIClient::Object::IntegrationLog;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **string** |  | [optional] 
**app_version_number** | **string** | Version number of the integration application. | [optional] 
**client_timestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**event_type** | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type | 
**external_business_id** | **string** |  | [optional] 
**feed_profile_id** | **string** |  | [optional] 
**log_level** | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type | 
**merchant_id** | **string** |  | [optional] 
**message** | **string** | Explanation of the event that occured. | [optional] 
**platform_version_number** | **string** | Version number of the platform the integration application is running on. | [optional] 
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 
**tag_id** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


