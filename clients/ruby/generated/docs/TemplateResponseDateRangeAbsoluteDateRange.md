# PinterestSdkClient::TemplateResponseDateRangeAbsoluteDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **end_date** | **Float** | The end date of the date range | [optional] |
| **start_date** | **Float** | The start date of the date range | [optional] |
| **type** | **String** | The date range type | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRangeAbsoluteDateRange.new(
  end_date: 6.027456183070403,
  start_date: 0.8008281904610115,
  type: absolute
)
```

