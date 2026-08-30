# IntegrationLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **swagger::Nullable<String>** |  | [optional] [default to None]
**app_version_number** | **String** | Version number of the integration application. | [optional] [default to None]
**client_timestamp** | **i32** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [***models::IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] [default to None]
**event_type** | [***models::IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type | 
**external_business_id** | **swagger::Nullable<String>** |  | [optional] [default to None]
**feed_profile_id** | **swagger::Nullable<String>** |  | [optional] [default to None]
**log_level** | [***models::IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type | 
**merchant_id** | **swagger::Nullable<String>** |  | [optional] [default to None]
**message** | **String** | Explanation of the event that occured. | [optional] [default to None]
**platform_version_number** | **String** | Version number of the platform the integration application is running on. | [optional] [default to None]
**request** | [***models::IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] [default to None]
**tag_id** | **swagger::Nullable<String>** |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


