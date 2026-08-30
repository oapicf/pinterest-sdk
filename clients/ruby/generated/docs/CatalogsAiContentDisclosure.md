# PinterestSdkClient::CatalogsAiContentDisclosure

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **disclosure** | [**Array&lt;CatalogsAiContentDisclosureLabel&gt;**](CatalogsAiContentDisclosureLabel.md) | Disclosure labels that apply to this asset. |  |
| **url** | **String** | URL of the asset. Must match one of image_link, additional_image_link, or video_link. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsAiContentDisclosure.new(
  disclosure: [&quot;ai_modified&quot;],
  url: https://scene.example.com/image/image_v2.jpg
)
```

