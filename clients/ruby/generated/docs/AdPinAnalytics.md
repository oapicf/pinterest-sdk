# PinterestSdkClient::AdPinAnalytics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date** | **Date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] |
| **pin_id** | **String** | The ID of the pin that the metric belongs to. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdPinAnalytics.new(
  date: null,
  pin_id: null
)
```

