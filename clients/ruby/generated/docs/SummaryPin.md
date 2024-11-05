# PinterestSdkClient::SummaryPin

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional][readonly] |
| **alt_text** | **String** |  | [optional] |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SummaryPin.new(
  media: null,
  alt_text: null,
  link: https://www.pinterest.com/,
  title: null,
  description: null
)
```

