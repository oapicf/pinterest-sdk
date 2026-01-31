# PinterestSdkClient::PinMediaSourceImageURL

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true] |
| **source_type** | **String** | The source type of the media. |  |
| **url** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourceImageURL.new(
  is_standard: null,
  source_type: null,
  url: null
)
```

