# PinterestSdkClient::CatalogsFeedProcessingSchedule

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **time** | **String** | A time in format HH:MM with leading 0 (zero) |  |
| **timezone** | **String** | The timezone considered for the processing schedule time. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProcessingSchedule.new(
  time: 02:59,
  timezone: null
)
```

