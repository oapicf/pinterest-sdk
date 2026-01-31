# PinterestSdkClient::AdPreviewShopping

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_product_group_id** | **String** | Catalog Product Group Id. |  |
| **creative_type** | **String** | Ad format of the shopping ad preview. |  |
| **customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] |
| **hero_image_title** | **String** | Title displayed below ad. | [optional] |
| **hero_image_url** | **String** | Hero image URL. | [optional] |
| **hero_pin_id** | **String** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] |
| **image_tag** | **String** | Multi image template tag. | [optional] |
| **item_id** | **String** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] |
| **preferred_media_type** | **String** | Preferred media type. | [optional] |
| **video_tag** | **String** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdPreviewShopping.new(
  catalog_product_group_id: 123456789,
  creative_type: SHOPPING,
  customizable_cta_type: null,
  hero_image_title: My Preview Image,
  hero_image_url: https://somewebsite.com/someimage.jpg,
  hero_pin_id: 987654321,
  image_tag: Christmas Sale,
  item_id: 111111111,
  preferred_media_type: IMAGE,
  video_tag: Black Friday Sale
)
```

