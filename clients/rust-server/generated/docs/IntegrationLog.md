# IntegrationLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_timestamp** | **i32** | Timestamp in milliseconds of when the log was executed at the client. | 
**event_type** | **String** | Log event type | 
**log_level** | **String** | Log level type | 
**external_business_id** | **String** |  | [optional] [default to None]
**advertiser_id** | **String** |  | [optional] [default to None]
**merchant_id** | **String** |  | [optional] [default to None]
**tag_id** | **String** |  | [optional] [default to None]
**feed_profile_id** | **String** |  | [optional] [default to None]
**message** | **String** | Explanation of the event that occured. | [optional] [default to None]
**app_version_number** | **String** | Version number of the integration application. | [optional] [default to None]
**platform_version_number** | **String** | Version number of the platform the integration application is running on. | [optional] [default to None]
**error** | [***models::IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] [default to None]
**request** | [***models::IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


