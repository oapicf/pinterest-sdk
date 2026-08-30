
# Table `IntegrationLog`
(mapped from: IntegrationLog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**clientTimestamp** | client_timestamp | int NOT NULL |  | **kotlin.Int** | Timestamp in milliseconds of when the log was executed at the client. | 
**eventType** | event_type | long NOT NULL |  | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type |  [foreignkey]
**logLevel** | log_level | long NOT NULL |  | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type |  [foreignkey]
**advertiserId** | advertiser_id | text |  | **kotlin.String** |  |  [optional]
**appVersionNumber** | app_version_number | text |  | **kotlin.String** | Version number of the integration application. |  [optional]
**error** | error | long |  | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  |  [optional] [foreignkey]
**externalBusinessId** | external_business_id | text |  | **kotlin.String** |  |  [optional]
**feedProfileId** | feed_profile_id | text |  | **kotlin.String** |  |  [optional]
**merchantId** | merchant_id | text |  | **kotlin.String** |  |  [optional]
**message** | message | text |  | **kotlin.String** | Explanation of the event that occured. |  [optional]
**platformVersionNumber** | platform_version_number | text |  | **kotlin.String** | Version number of the platform the integration application is running on. |  [optional]
**request** | request | long |  | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  |  [optional] [foreignkey]
**tagId** | tag_id | text |  | **kotlin.String** |  |  [optional]















