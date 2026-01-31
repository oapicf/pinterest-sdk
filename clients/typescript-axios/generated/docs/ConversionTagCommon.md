# ConversionTagCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**code_snippet** | **string** | Tag code snippet. | [optional] [default to undefined]
**enhanced_match_status** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) |  | [optional] [default to undefined]
**id** | **string** | Tag ID. | [optional] [default to undefined]
**last_fired_time_ms** | **number** | Time for the last event fired. | [optional] [default to undefined]
**name** | **string** | Conversion tag name. | [optional] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**version** | **string** | Version number. | [optional] [default to undefined]
**configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ConversionTagCommon } from './api';

const instance: ConversionTagCommon = {
    ad_account_id,
    code_snippet,
    enhanced_match_status,
    id,
    last_fired_time_ms,
    name,
    status,
    version,
    configs,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
