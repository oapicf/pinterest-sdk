# openapi::IntegrationLog

Schema for log sent from an integration application.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **character** |  | [optional] [Max. length: 128] 
**app_version_number** | **character** | Version number of the integration application. | [optional] [Max. length: 20] 
**client_timestamp** | **integer** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**event_type** | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type | [Enum: ] 
**external_business_id** | **character** |  | [optional] [Max. length: 2048] 
**feed_profile_id** | **character** |  | [optional] [Max. length: 128] 
**log_level** | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type | [Enum: ] 
**merchant_id** | **character** |  | [optional] [Max. length: 128] 
**message** | **character** | Explanation of the event that occured. | [optional] [Max. length: 8192] 
**platform_version_number** | **character** | Version number of the platform the integration application is running on. | [optional] [Max. length: 20] 
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 
**tag_id** | **character** |  | [optional] [Max. length: 128] 


