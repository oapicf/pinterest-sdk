# PinterestSdkClient::CatalogsCreativeAssetsAttributes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **android_deep_link** | **String** | Link to the creative assets page. | [optional] |
| **custom_label_0** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_1** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_2** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_3** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_4** | **String** | Custom grouping of creative assets. | [optional] |
| **description** | **String** | Brief description of the creative assets. | [optional] |
| **google_product_category** | **String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] |
| **ios_deep_link** | **String** | IOS deep link to the creative assets page. | [optional] |
| **link** | **String** | Link to the creative assets page. | [optional] |
| **title** | **String** | The name of the creative assets. | [optional] |
| **visibility** | **String** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;. | [optional] |
| **ai_disclosures** | [**Array&lt;CatalogsAiContentDisclosure&gt;**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL. | [optional] |
| **image_link** | **String** | The creative assets image. | [optional] |
| **video_link** | **String** | The creative assets video. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsAttributes.new(
  android_deep_link: null,
  custom_label_0: null,
  custom_label_1: null,
  custom_label_2: null,
  custom_label_3: null,
  custom_label_4: null,
  description: null,
  google_product_category: null,
  ios_deep_link: null,
  link: null,
  title: null,
  visibility: null,
  ai_disclosures: [{&quot;url&quot;:&quot;https://scene.example.com/image/image_v2.jpg&quot;,&quot;disclosure&quot;:[&quot;ai_modified&quot;]}],
  image_link: https://scene.example.com/image/image_v2.jpg,
  video_link: https://scene.example.com/image/image_v2.mp4
)
```

