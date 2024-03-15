# PinterestSdkClient::PinMediaMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_type** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **link** | **String** |  | [optional] |
| **images** | [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] |
| **cover_image_url** | **String** |  | [optional] |
| **video_url** | **String** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. | [optional] |
| **duration** | **Float** | Duration (in milliseconds) | [optional] |
| **height** | **Integer** | Height (in pixels) | [optional] |
| **width** | **Integer** | Width (in pixels) | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaMetadata.new(
  item_type: null,
  title: null,
  description: null,
  link: null,
  images: null,
  cover_image_url: null,
  video_url: null,
  duration: null,
  height: null,
  width: null
)
```

