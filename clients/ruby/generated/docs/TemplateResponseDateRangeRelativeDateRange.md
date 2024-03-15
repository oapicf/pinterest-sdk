# PinterestSdkClient::TemplateResponseDateRangeRelativeDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The date range type | [optional] |
| **start_days_in_past** | **Float** | The start date of the date range | [optional] |
| **end_days_in_past** | **Float** | The end date of the date range | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRangeRelativeDateRange.new(
  type: relative,
  start_days_in_past: 14,
  end_days_in_past: 7
)
```

