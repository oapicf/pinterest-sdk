# IntegrationLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_timestamp** | **i32** | Timestamp in milliseconds of when the log was executed at the client. | 
**event_type** | **String** | Log event type | 
**log_level** | **String** | Log level type | 
**external_business_id** | Option<**String**> |  | [optional]
**advertiser_id** | Option<**String**> |  | [optional]
**merchant_id** | Option<**String**> |  | [optional]
**tag_id** | Option<**String**> |  | [optional]
**feed_profile_id** | Option<**String**> |  | [optional]
**message** | Option<**String**> | Explanation of the event that occured. | [optional]
**app_version_number** | Option<**String**> | Version number of the integration application. | [optional]
**platform_version_number** | Option<**String**> | Version number of the platform the integration application is running on. | [optional]
**error** | Option<[**models::IntegrationLogClientError**](IntegrationLogClientError.md)> |  | [optional]
**request** | Option<[**models::IntegrationLogClientRequest**](IntegrationLogClientRequest.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


