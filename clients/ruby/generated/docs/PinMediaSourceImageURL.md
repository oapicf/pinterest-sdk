# PinterestSdkClient::PinMediaSourceImageURL

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **source_type** | **String** |  |  |
| **url** | **String** |  |  |
| **is_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourceImageURL.new(
  source_type: null,
  url: null,
  is_standard: null
)
```

