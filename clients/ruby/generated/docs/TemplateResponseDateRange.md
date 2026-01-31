# PinterestSdkClient::TemplateResponseDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **absolute_date_range** | [**TemplateResponseDateRangeAbsoluteDateRange**](TemplateResponseDateRangeAbsoluteDateRange.md) |  | [optional] |
| **dynamic_date_range** | [**TemplateResponseDateRangeDynamicDateRange**](TemplateResponseDateRangeDynamicDateRange.md) |  | [optional] |
| **relative_date_range** | [**TemplateResponseDateRangeRelativeDateRange**](TemplateResponseDateRangeRelativeDateRange.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRange.new(
  absolute_date_range: null,
  dynamic_date_range: null,
  relative_date_range: null
)
```

