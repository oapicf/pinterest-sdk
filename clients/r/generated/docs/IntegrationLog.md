# openapi::IntegrationLog

Schema for log sent from an integration application.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_timestamp** | **integer** | Timestamp in milliseconds of when the log was executed at the client. | 
**event_type** | **character** | Log event type | [Enum: [APP, API]] 
**log_level** | **character** | Log level type | [Enum: [INFO, WARN, ERROR]] 
**external_business_id** | **character** |  | [optional] [Max. length: 2048] 
**advertiser_id** | **character** |  | [optional] [Max. length: 128] 
**merchant_id** | **character** |  | [optional] [Max. length: 128] 
**tag_id** | **character** |  | [optional] [Max. length: 128] 
**feed_profile_id** | **character** |  | [optional] [Max. length: 128] 
**message** | **character** | Explanation of the event that occured. | [optional] [Max. length: 2048] 
**app_version_number** | **character** | Version number of the integration application. | [optional] [Max. length: 20] 
**platform_version_number** | **character** | Version number of the platform the integration application is running on. | [optional] [Max. length: 20] 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 


