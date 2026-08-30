# PinterestSdkClient::TopPinsAnalyticsResponsePinsItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data_status** | [**Hash&lt;String, DataStatus&gt;**](DataStatus.md) |  | [optional] |
| **metrics** | **Hash&lt;String, Float&gt;** |  | [optional] |
| **pin_id** | **String** | The pin id | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TopPinsAnalyticsResponsePinsItems.new(
  data_status: null,
  metrics: null,
  pin_id: null
)
```

