# PinterestSdkClient::ScheduleUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entity_id** | **String** |  | [optional] |
| **entity_type** | **String** | Entity type | [optional] |
| **id** | **String** | Schedule ID. |  |
| **delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] |
| **end_timestamp** | **Integer** | Schedule end time. Unix timestamp in seconds. | [optional] |
| **name** | **String** |  | [optional] |
| **schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [optional] |
| **schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] |
| **schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [optional] |
| **start_timestamp** | **Integer** | Schedule start time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ScheduleUpdateRequest.new(
  entity_id: null,
  entity_type: null,
  id: null,
  delta_value: null,
  end_timestamp: null,
  name: null,
  schedule_action: null,
  schedule_status: null,
  schedule_type: null,
  start_timestamp: null
)
```

