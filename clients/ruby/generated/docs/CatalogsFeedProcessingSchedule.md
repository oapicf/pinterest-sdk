# PinterestSdkClient::CatalogsFeedProcessingSchedule

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **time** | **String** | A time in format HH:MM with leading 0 (zero) |  |
| **timezone** | [**CatalogsFeedProcessingScheduleTimezone**](CatalogsFeedProcessingScheduleTimezone.md) | The timezone considered for the processing schedule time. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProcessingSchedule.new(
  time: null,
  timezone: null
)
```

