# PinterestSdkClient::AdPreviewCreateFromImage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image_url** | **String** | Image URL. |  |
| **title** | **String** | Title displayed below ad. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdPreviewCreateFromImage.new(
  image_url: https://somewebsite.com/someimage.jpg,
  title: My Preview Image
)
```

