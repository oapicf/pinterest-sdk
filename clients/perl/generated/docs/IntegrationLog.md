# WWW::OpenAPIClient::Object::IntegrationLog

## Load the model package
```perl
use WWW::OpenAPIClient::Object::IntegrationLog;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_timestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**event_type** | **string** | Log event type | 
**log_level** | **string** | Log level type | 
**external_business_id** | **string** |  | [optional] 
**advertiser_id** | **string** |  | [optional] 
**merchant_id** | **string** |  | [optional] 
**tag_id** | **string** |  | [optional] 
**feed_profile_id** | **string** |  | [optional] 
**message** | **string** | Explanation of the event that occured. | [optional] 
**app_version_number** | **string** | Version number of the integration application. | [optional] 
**platform_version_number** | **string** | Version number of the platform the integration application is running on. | [optional] 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


