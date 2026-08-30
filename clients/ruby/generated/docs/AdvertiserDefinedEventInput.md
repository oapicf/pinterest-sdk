# PinterestSdkClient::AdvertiserDefinedEventInput

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **mapped_conversion_type** | [**AdvertiserDefinedEventMappingType**](AdvertiserDefinedEventMappingType.md) | Pinterest standard event type to map this custom event to for campaign optimization and reporting |  |
| **name** | **String** | Raw string name of the event |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvertiserDefinedEventInput.new(
  mapped_conversion_type: SIGNUP,
  name: newsletter_signup
)
```

