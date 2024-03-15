
# Table `IntegrationLog`
(mapped from: IntegrationLog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**clientTimestamp** | client_timestamp | int NOT NULL |  | **kotlin.Int** | Timestamp in milliseconds of when the log was executed at the client. | 
**eventType** | event_type | text NOT NULL |  | [**event_type**](#EventType) | Log event type | 
**logLevel** | log_level | text NOT NULL |  | [**log_level**](#LogLevel) | Log level type | 
**externalBusinessId** | external_business_id | text |  | **kotlin.String** |  |  [optional]
**advertiserId** | advertiser_id | text |  | **kotlin.String** |  |  [optional]
**merchantId** | merchant_id | text |  | **kotlin.String** |  |  [optional]
**tagId** | tag_id | text |  | **kotlin.String** |  |  [optional]
**feedProfileId** | feed_profile_id | text |  | **kotlin.String** |  |  [optional]
**message** | message | text |  | **kotlin.String** | Explanation of the event that occured. |  [optional]
**appVersionNumber** | app_version_number | text |  | **kotlin.String** | Version number of the integration application. |  [optional]
**platformVersionNumber** | platform_version_number | text |  | **kotlin.String** | Version number of the platform the integration application is running on. |  [optional]
**error** | error | long |  | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  |  [optional] [foreignkey]
**request** | request | long |  | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  |  [optional] [foreignkey]















