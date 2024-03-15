# PinterestSdkClient::PinMediaSourceImageBase64

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **source_type** | **String** |  |  |
| **content_type** | **String** |  |  |
| **data** | **String** |  |  |
| **is_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourceImageBase64.new(
  source_type: null,
  content_type: null,
  data: null,
  is_standard: null
)
```

