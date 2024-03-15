# PinterestSdkClient::ConversionApiResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **num_events_received** | **Integer** | Total number of events received in the request. |  |
| **num_events_processed** | **Integer** | Number of events that were successfully processed from the events. |  |
| **events** | [**Array&lt;ConversionApiResponseEventsInner&gt;**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionApiResponse.new(
  num_events_received: null,
  num_events_processed: null,
  events: null
)
```

