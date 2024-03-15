# integration_log_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_timestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**event_type** | **pinterest_rest_api_integration_log_EVENTTYPE_e** | Log event type | 
**log_level** | **pinterest_rest_api_integration_log_LOGLEVEL_e** | Log level type | 
**external_business_id** | **char \*** |  | [optional] 
**advertiser_id** | **char \*** |  | [optional] 
**merchant_id** | **char \*** |  | [optional] 
**tag_id** | **char \*** |  | [optional] 
**feed_profile_id** | **char \*** |  | [optional] 
**message** | **char \*** | Explanation of the event that occured. | [optional] 
**app_version_number** | **char \*** | Version number of the integration application. | [optional] 
**platform_version_number** | **char \*** | Version number of the platform the integration application is running on. | [optional] 
**error** | [**integration_log_client_error_t**](integration_log_client_error.md) \* |  | [optional] 
**request** | [**integration_log_client_request_t**](integration_log_client_request.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


