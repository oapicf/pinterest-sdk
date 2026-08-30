# PinterestSdkClient::TopVideoPinsAnalyticsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_availability** | [**TopVideoPinsAnalyticsResponseDateAvailability**](TopVideoPinsAnalyticsResponseDateAvailability.md) |  | [optional] |
| **pins** | [**Array&lt;TopVideoPinsAnalyticsResponsePinsItems&gt;**](TopVideoPinsAnalyticsResponsePinsItems.md) |  | [optional] |
| **sort_by** | [**TopVideoPinsSortBy**](TopVideoPinsSortBy.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TopVideoPinsAnalyticsResponse.new(
  date_availability: null,
  pins: null,
  sort_by: null
)
```

