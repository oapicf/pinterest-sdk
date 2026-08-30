# PinterestSdkClient::Schedule

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] |
| **end_timestamp** | **Integer** | Schedule end time. Unix timestamp in seconds. | [optional] |
| **entity_id** | **String** | entity ID. |  |
| **entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] |
| **name** | **String** | Schedule name. | [optional] |
| **schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] |
| **schedule_id** | **String** | Schedule ID. | [readonly] |
| **schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] |
| **schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] |
| **start_timestamp** | **Integer** | Schedule start time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Schedule.new(
  delta_value: null,
  end_timestamp: null,
  entity_id: null,
  entity_type: null,
  name: null,
  schedule_action: null,
  schedule_id: null,
  schedule_status: null,
  schedule_type: null,
  start_timestamp: null
)
```

