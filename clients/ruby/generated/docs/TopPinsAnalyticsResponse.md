# PinterestSdkClient::TopPinsAnalyticsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_availability** | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] |
| **pins** | [**Array&lt;TopPinsAnalyticsResponsePinsItems&gt;**](TopPinsAnalyticsResponsePinsItems.md) |  | [optional] |
| **sort_by** | [**TopPinsSortBy**](TopPinsSortBy.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TopPinsAnalyticsResponse.new(
  date_availability: null,
  pins: null,
  sort_by: null
)
```

