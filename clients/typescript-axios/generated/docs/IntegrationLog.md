# IntegrationLog

Schema for log sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **string** |  | [optional] [default to undefined]
**app_version_number** | **string** | Version number of the integration application. | [optional] [default to undefined]
**client_timestamp** | **number** | Timestamp in milliseconds of when the log was executed at the client. | [default to undefined]
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] [default to undefined]
**event_type** | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type | [default to undefined]
**external_business_id** | **string** |  | [optional] [default to undefined]
**feed_profile_id** | **string** |  | [optional] [default to undefined]
**log_level** | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type | [default to undefined]
**merchant_id** | **string** |  | [optional] [default to undefined]
**message** | **string** | Explanation of the event that occured. | [optional] [default to undefined]
**platform_version_number** | **string** | Version number of the platform the integration application is running on. | [optional] [default to undefined]
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] [default to undefined]
**tag_id** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { IntegrationLog } from './api';

const instance: IntegrationLog = {
    advertiser_id,
    app_version_number,
    client_timestamp,
    error,
    event_type,
    external_business_id,
    feed_profile_id,
    log_level,
    merchant_id,
    message,
    platform_version_number,
    request,
    tag_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
