# PinterestSdkClient::AdvertiserDefinedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **mapped_conversion_type** | [**ConversionTagTypeOptimal**](ConversionTagTypeOptimal.md) | Standard type mapped to ADE for optimization | [optional] |
| **name** | **String** | Raw string name of the event, usually logged as raw_event_name in our dataset | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvertiserDefinedEvent.new(
  mapped_conversion_type: SIGNUP,
  name: newsletter_signup
)
```

