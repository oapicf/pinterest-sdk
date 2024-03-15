# PinterestSdkClient::TemplateResponseDateRangeAbsoluteDateRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The date range type | [optional] |
| **start_date** | **Float** | The start date of the date range | [optional] |
| **end_date** | **Float** | The end date of the date range | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponseDateRangeAbsoluteDateRange.new(
  type: absolute,
  start_date: 0.8008281904610115,
  end_date: 6.027456183070403
)
```

