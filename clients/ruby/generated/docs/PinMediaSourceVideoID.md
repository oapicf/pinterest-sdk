# PinterestSdkClient::PinMediaSourceVideoID

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **source_type** | **String** |  |  |
| **cover_image_url** | **String** | Cover image url. | [optional] |
| **cover_image_content_type** | **String** | Content type for cover image Base64. | [optional] |
| **cover_image_data** | **String** | Cover image Base64. | [optional] |
| **media_id** | **String** |  |  |
| **is_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourceVideoID.new(
  source_type: null,
  cover_image_url: null,
  cover_image_content_type: null,
  cover_image_data: null,
  media_id: null,
  is_standard: null
)
```

