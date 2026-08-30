# ScheduleCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] [default to undefined]
**end_timestamp** | **number** | Schedule end time. Unix timestamp in seconds. | [optional] [default to undefined]
**entity_id** | **string** | entity ID. | [default to undefined]
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] [default to undefined]
**name** | **string** | Schedule name. | [optional] [default to undefined]
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] [default to undefined]
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] [default to undefined]
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] [default to undefined]
**start_timestamp** | **number** | Schedule start time. Unix timestamp in seconds. | [optional] [default to undefined]

## Example

```typescript
import { ScheduleCreate } from './api';

const instance: ScheduleCreate = {
    delta_value,
    end_timestamp,
    entity_id,
    entity_type,
    name,
    schedule_action,
    schedule_status,
    schedule_type,
    start_timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
