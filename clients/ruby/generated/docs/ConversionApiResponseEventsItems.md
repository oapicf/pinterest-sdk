# PinterestSdkClient::ConversionApiResponseEventsItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **error_message** | **String** | Error message containing more information about why the event failed to be processed. | [optional] |
| **status** | [**EventProcessingStatus**](EventProcessingStatus.md) | Whether the event was processed successfully. |  |
| **warning_message** | **String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionApiResponseEventsItems.new(
  error_message: ,
  status: processed,
  warning_message: 
)
```

