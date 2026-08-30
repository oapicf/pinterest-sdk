# ScheduleCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **string** |  | [default to undefined]
**entity_type** | **string** | Entity type | [default to undefined]
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [default to undefined]
**end_timestamp** | **number** | Schedule end time. Unix timestamp in seconds. | [default to undefined]
**name** | **string** |  | [default to undefined]
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [default to undefined]
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [default to undefined]
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [default to undefined]
**start_timestamp** | **number** | Schedule start time. Unix timestamp in seconds. | [default to undefined]

## Example

```typescript
import { ScheduleCreateRequest } from './api';

const instance: ScheduleCreateRequest = {
    entity_id,
    entity_type,
    delta_value,
    end_timestamp,
    name,
    schedule_action,
    schedule_status,
    schedule_type,
    start_timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
