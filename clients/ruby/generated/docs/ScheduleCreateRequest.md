# PinterestSdkClient::ScheduleCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entity_id** | **String** |  |  |
| **entity_type** | **String** | Entity type |  |
| **delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  |  |
| **end_timestamp** | **Integer** | Schedule end time. Unix timestamp in seconds. |  |
| **name** | **String** |  |  |
| **schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  |  |
| **schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  |  |
| **schedule_type** | [**ScheduleType**](ScheduleType.md) |  |  |
| **start_timestamp** | **Integer** | Schedule start time. Unix timestamp in seconds. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ScheduleCreateRequest.new(
  entity_id: null,
  entity_type: null,
  delta_value: null,
  end_timestamp: null,
  name: null,
  schedule_action: null,
  schedule_status: null,
  schedule_type: null,
  start_timestamp: null
)
```

