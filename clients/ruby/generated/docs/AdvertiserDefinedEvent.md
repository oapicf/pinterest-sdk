# PinterestSdkClient::AdvertiserDefinedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | raw string name of the event, usually logged as raw_event_name in our dataset | [optional] |
| **mapped_conversion_type** | **String** | standard type mapped to ADE for optimization | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvertiserDefinedEvent.new(
  name: download_picture,
  mapped_conversion_type: null
)
```

