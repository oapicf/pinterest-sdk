# PinterestSdkClient::ConversionEvents

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **events** | [**Array&lt;ConversionApiResponseEventsItems&gt;**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [readonly] |
| **num_events_processed** | **Integer** | Number of events that were successfully processed from the events. | [readonly] |
| **num_events_received** | **Integer** | Total number of events received in the request. | [readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEvents.new(
  events: null,
  num_events_processed: 1,
  num_events_received: 1
)
```

