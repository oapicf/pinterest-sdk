# PinterestSdkClient::TemplateResponseDateRangeDynamicDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **range** | **String** | The dynamic range type | [optional] |
| **type** | **String** | The date range type | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRangeDynamicDateRange.new(
  range: YEAR_TO_DATE,
  type: dynamic
)
```

