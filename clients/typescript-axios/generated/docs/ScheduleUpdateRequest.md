# ScheduleUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **string** |  | [optional] [default to undefined]
**entity_type** | **string** | Entity type | [optional] [default to undefined]
**id** | **string** | Schedule ID. | [default to undefined]
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] [default to undefined]
**end_timestamp** | **number** | Schedule end time. Unix timestamp in seconds. | [optional] [default to undefined]
**name** | **string** |  | [optional] [default to undefined]
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [optional] [default to undefined]
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] [default to undefined]
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [optional] [default to undefined]
**start_timestamp** | **number** | Schedule start time. Unix timestamp in seconds. | [optional] [default to undefined]

## Example

```typescript
import { ScheduleUpdateRequest } from './api';

const instance: ScheduleUpdateRequest = {
    entity_id,
    entity_type,
    id,
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
