# PinterestSdkClient::PinMediaSourceVideoID

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] |
| **cover_image_data** | **String** | Cover image Base64. | [optional] |
| **cover_image_key_frame_time** | **Integer** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] |
| **cover_image_url** | **String** | Cover image URL. | [optional] |
| **is_standard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional][default to true] |
| **media_id** | **String** |  |  |
| **source_type** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourceVideoID.new(
  cover_image_content_type: null,
  cover_image_data: null,
  cover_image_key_frame_time: null,
  cover_image_url: null,
  is_standard: null,
  media_id: null,
  source_type: null
)
```

