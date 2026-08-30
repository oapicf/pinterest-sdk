# IntegrationLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | Option<**String**> |  | [optional]
**app_version_number** | Option<**String**> | Version number of the integration application. | [optional]
**client_timestamp** | **i32** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | Option<[**models::IntegrationLogClientError**](IntegrationLogClientError.md)> |  | [optional]
**event_type** | [**models::IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type | 
**external_business_id** | Option<**String**> |  | [optional]
**feed_profile_id** | Option<**String**> |  | [optional]
**log_level** | [**models::IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type | 
**merchant_id** | Option<**String**> |  | [optional]
**message** | Option<**String**> | Explanation of the event that occured. | [optional]
**platform_version_number** | Option<**String**> | Version number of the platform the integration application is running on. | [optional]
**request** | Option<[**models::IntegrationLogClientRequest**](IntegrationLogClientRequest.md)> |  | [optional]
**tag_id** | Option<**String**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


