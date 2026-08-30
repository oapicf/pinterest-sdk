# PinterestSdkClient::ScheduleBatchUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] |
| **end_timestamp** | **Integer** | Schedule end time. Unix timestamp in seconds. | [optional] |
| **entity_id** | **String** | entity ID. | [optional] |
| **entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] |
| **id** | **String** |  |  |
| **name** | **String** | Schedule name. | [optional] |
| **schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] |
| **schedule_id** | **String** | Schedule ID. |  |
| **schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] |
| **schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] |
| **start_timestamp** | **Integer** | Schedule start time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ScheduleBatchUpdate.new(
  delta_value: null,
  end_timestamp: null,
  entity_id: null,
  entity_type: null,
  id: null,
  name: null,
  schedule_action: null,
  schedule_id: null,
  schedule_status: null,
  schedule_type: null,
  start_timestamp: null
)
```

