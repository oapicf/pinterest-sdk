# PinterestSdkClient::ProductGroupPromotion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | ID of the ad group the product group belongs to. | [optional] |
| **bid_in_micro_currency** | **Integer** | The bid in micro currency. | [optional] |
| **catalog_product_group_id** | **String** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] |
| **catalog_product_group_name** | **String** | Catalogs product group name | [optional] |
| **collections_header_type** | [**CollectionsHeaderType**](CollectionsHeaderType.md) |  | [optional] |
| **collections_hero_destination_url** | **String** | Collections Hero Destination Url | [optional] |
| **collections_hero_pin_id** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] |
| **customizable_cta_type** | [**ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional] |
| **definition** | **String** | The full product group definition path | [optional] |
| **grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] |
| **id** | **String** | ID of the product group promotion (required for update operations). | [optional] |
| **included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] |
| **is_generate_background** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] |
| **is_image_auto_resizing** | **Boolean** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] |
| **is_mdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] |
| **parent_id** | **String** | The parent Product Group ID of this Product Group | [optional] |
| **preferred_media_type** | [**PreferredMediaType**](PreferredMediaType.md) |  | [optional] |
| **relative_definition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] |
| **selected_image_tag** | **String** | The ad image tag selected for the product group promotion. | [optional] |
| **selected_video_tag** | **String** | The ad video tag selected for the product group promotion. | [optional] |
| **slideshow_collections_description** | **String** | Slideshow Collections Description | [optional] |
| **slideshow_collections_title** | **String** | Slideshow Collections Title | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **tracking_url** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductGroupPromotion.new(
  ad_group_id: 2680059592705,
  bid_in_micro_currency: 14000000,
  catalog_product_group_id: 1231235,
  catalog_product_group_name: catalogProductGroupName,
  collections_header_type: null,
  collections_hero_destination_url: http://www.pinterest.com,
  collections_hero_pin_id: 123123,
  creative_type: null,
  customizable_cta_type: null,
  definition: */product_type_0&#x3D;&#39;kitchen&#39;/product_type_1&#x3D;&#39;beverage appliances&#39;,
  grid_click_type: null,
  id: 2680059592705,
  included: true,
  is_generate_background: true,
  is_image_auto_resizing: true,
  is_mdl: true,
  parent_id: 1231234,
  preferred_media_type: null,
  relative_definition: product_type_1&#x3D;&#39;beverage appliances&#39;,
  selected_image_tag: holiday_sale,
  selected_video_tag: holiday_sale,
  slideshow_collections_description: slideshow description,
  slideshow_collections_title: slideshow title,
  status: null,
  tracking_url: https://www.pinterest.com
)
```

