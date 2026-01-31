# PinterestSdkClient::PinMediaMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  | [optional] |
| **images** | [**ImageSize**](ImageSize.md) |  | [optional] |
| **item_type** | **String** |  | [optional] |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |
| **cover_image_url** | **String** |  | [optional] |
| **duration** | **Float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] |
| **height** | **Integer** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] |
| **video_url** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] |
| **width** | **Integer** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaMetadata.new(
  description: null,
  images: null,
  item_type: null,
  link: null,
  title: null,
  cover_image_url: null,
  duration: null,
  height: null,
  video_url: null,
  width: null
)
```

