# PinterestSdkClient::TemplateResponseDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dynamic_date_range** | [**TemplateResponseDateRangeDynamicDateRange**](TemplateResponseDateRangeDynamicDateRange.md) |  | [optional] |
| **relative_date_range** | [**TemplateResponseDateRangeRelativeDateRange**](TemplateResponseDateRangeRelativeDateRange.md) |  | [optional] |
| **absolute_date_range** | [**TemplateResponseDateRangeAbsoluteDateRange**](TemplateResponseDateRangeAbsoluteDateRange.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRange.new(
  dynamic_date_range: null,
  relative_date_range: null,
  absolute_date_range: null
)
```

