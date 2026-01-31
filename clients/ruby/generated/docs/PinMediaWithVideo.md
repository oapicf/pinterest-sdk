# PinterestSdkClient::PinMediaWithVideo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cover_image_url** | **String** |  | [optional] |
| **duration** | **Float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] |
| **height** | **Integer** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] |
| **images** | [**ImageSize**](ImageSize.md) |  | [optional] |
| **media_type** | **String** |  |  |
| **video_url** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] |
| **width** | **Integer** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaWithVideo.new(
  cover_image_url: null,
  duration: null,
  height: null,
  images: null,
  media_type: null,
  video_url: null,
  width: null
)
```

