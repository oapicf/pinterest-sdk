# ConversionTagCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_snippet** | **string** | Tag code snippet. | [optional] [readonly] [default to undefined]
**configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] [readonly] [default to undefined]
**enhanced_match_status** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag | [optional] [readonly] [default to undefined]
**id** | **string** | Tag ID. | [optional] [readonly] [default to undefined]
**last_fired_time_ms** | **number** | Time for the last event fired. | [optional] [readonly] [default to undefined]
**name** | **string** | Conversion tag name. | [default to undefined]
**version** | **string** | Version number. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { ConversionTagCommon } from './api';

const instance: ConversionTagCommon = {
    code_snippet,
    configs,
    enhanced_match_status,
    id,
    last_fired_time_ms,
    name,
    version,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
