# PinterestSdkClient::AdPreviewSourceImage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image_url** | **String** | Image URL. |  |
| **promotion_id** | **String** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] |
| **title** | **String** | Title displayed below ad. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdPreviewSourceImage.new(
  image_url: https://somewebsite.com/someimage.jpg,
  promotion_id: 7834020404549,
  title: My Preview Image
)
```

