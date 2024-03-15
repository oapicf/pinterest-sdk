# PinterestSdkClient::TemplateResponseDateRangeDynamicDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The date range type | [optional] |
| **range** | **String** | The dynamic range type | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRangeDynamicDateRange.new(
  type: dynamic,
  range: YEAR_TO_DATE
)
```

