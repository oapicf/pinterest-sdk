# INTEGRATION_LOG

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_timestamp** | **INTEGER_32** | Timestamp in milliseconds of when the log was executed at the client. | [default to null]
**event_type** | [**STRING_32**](STRING_32.md) | Log event type | [default to null]
**log_level** | [**STRING_32**](STRING_32.md) | Log level type | [default to null]
**external_business_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**advertiser_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**merchant_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**tag_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**feed_profile_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**message** | [**STRING_32**](STRING_32.md) | Explanation of the event that occured. | [optional] [default to null]
**app_version_number** | [**STRING_32**](STRING_32.md) | Version number of the integration application. | [optional] [default to null]
**platform_version_number** | [**STRING_32**](STRING_32.md) | Version number of the platform the integration application is running on. | [optional] [default to null]
**error** | [**INTEGRATION_LOG_CLIENT_ERROR**](IntegrationLogClientError.md) |  | [optional] [default to null]
**request** | [**INTEGRATION_LOG_CLIENT_REQUEST**](IntegrationLogClientRequest.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


