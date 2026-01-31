# PinterestSdkClient::PinMediaSourceImageBase64

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content_type** | [**ContentType**](ContentType.md) |  |  |
| **data** | **String** |  |  |
| **is_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true] |
| **source_type** | **String** | The source type of the media. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourceImageBase64.new(
  content_type: null,
  data: null,
  is_standard: null,
  source_type: null
)
```

