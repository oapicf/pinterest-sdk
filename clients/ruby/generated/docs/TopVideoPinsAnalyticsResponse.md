# PinterestSdkClient::TopVideoPinsAnalyticsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_availability** | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] |
| **pins** | [**Array&lt;TopVideoPinsAnalyticsResponsePinsInner&gt;**](TopVideoPinsAnalyticsResponsePinsInner.md) |  | [optional] |
| **sort_by** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TopVideoPinsAnalyticsResponse.new(
  date_availability: null,
  pins: null,
  sort_by: IMPRESSION
)
```

