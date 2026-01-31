# PinterestSdkClient::TemplateResponseDateRangeRelativeDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **end_days_in_past** | **Float** | The end date of the date range | [optional] |
| **start_days_in_past** | **Float** | The start date of the date range | [optional] |
| **type** | **String** | The date range type | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRangeRelativeDateRange.new(
  end_days_in_past: 7,
  start_days_in_past: 14,
  type: relative
)
```

