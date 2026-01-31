# PinterestSdkClient::ProductGroupPromotion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | ID of the ad group the product group belongs to. | [optional] |
| **bid_in_micro_currency** | **Integer** | The bid in micro currency. | [optional] |
| **catalog_product_group_id** | **String** | ID of the catalogs product group that this product group promotion references | [optional] |
| **catalog_product_group_name** | **String** | Catalogs product group name | [optional] |
| **collections_header_type** | **String** | Collections ad header type | [optional] |
| **collections_hero_destination_url** | **String** | Collections Hero Destination Url | [optional] |
| **collections_hero_pin_id** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] |
| **customizable_cta_type** | **String** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] |
| **definition** | **String** | The full product group definition path | [optional] |
| **grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] |
| **id** | **String** | ID of the product group promotion. | [optional] |
| **included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] |
| **is_generate_background** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] |
| **is_mdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] |
| **parent_id** | **String** | The parent Product Group ID of this Product Group | [optional] |
| **preferred_media_type** | **String** | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] |
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
  collections_header_type: SHOP_THIS_COLLECTION,
  collections_hero_destination_url: http://www.pinterest.com,
  collections_hero_pin_id: 123123,
  creative_type: null,
  customizable_cta_type: SHOP_NOW,
  definition: */product_type_0&#x3D;&#39;kitchen&#39;/product_type_1&#x3D;&#39;beverage appliances&#39;,
  grid_click_type: null,
  id: 2680059592705,
  included: true,
  is_generate_background: true,
  is_mdl: true,
  parent_id: 1231234,
  preferred_media_type: VIDEO,
  relative_definition: product_type_1&#x3D;&#39;beverage appliances&#39;,
  selected_image_tag: holiday_sale,
  selected_video_tag: holiday_sale,
  slideshow_collections_description: slideshow description,
  slideshow_collections_title: slideshow title,
  status: null,
  tracking_url: https://www.pinterest.com
)
```

