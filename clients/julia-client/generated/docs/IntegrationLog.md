# IntegrationLog


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`advertiser_id`** | **`String`** |  | [optional] [default to nothing]
**`app_version_number`** | **`String`** | Version number of the integration application. | [optional] [default to nothing]
**`client_timestamp`** | **`Int64`** | Timestamp in milliseconds of when the log was executed at the client. | [default to nothing]
**`error`** | [**`*IntegrationLogClientError`**](IntegrationLogClientError.md) |  | [optional] [default to nothing]
**`event_type`** | [**`*IntegrationLogEventType`**](IntegrationLogEventType.md) | Log event type | [default to nothing]
**`external_business_id`** | **`String`** |  | [optional] [default to nothing]
**`feed_profile_id`** | **`String`** |  | [optional] [default to nothing]
**`log_level`** | [**`*IntegrationLogLevel`**](IntegrationLogLevel.md) | Log level type | [default to nothing]
**`merchant_id`** | **`String`** |  | [optional] [default to nothing]
**`message`** | **`String`** | Explanation of the event that occured. | [optional] [default to nothing]
**`platform_version_number`** | **`String`** | Version number of the platform the integration application is running on. | [optional] [default to nothing]
**`request`** | [**`*IntegrationLogClientRequest`**](IntegrationLogClientRequest.md) |  | [optional] [default to nothing]
**`tag_id`** | **`String`** |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


