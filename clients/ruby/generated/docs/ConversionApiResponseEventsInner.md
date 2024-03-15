# PinterestSdkClient::ConversionApiResponseEventsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | **String** | Whether the event was processed successfully. |  |
| **error_message** | **String** | Error message containing more information about why the event failed to be processed. | [optional] |
| **warning_message** | **String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionApiResponseEventsInner.new(
  status: processed,
  error_message: null,
  warning_message: null
)
```

