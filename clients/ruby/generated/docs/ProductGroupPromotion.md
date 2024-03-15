# PinterestSdkClient::ProductGroupPromotion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | ID of the product group promotion. | [optional] |
| **ad_group_id** | **String** | ID of the ad group the product group belongs to. | [optional] |
| **bid_in_micro_currency** | **Integer** | The bid in micro currency. | [optional] |
| **included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] |
| **definition** | **String** | The full product group definition path | [optional] |
| **relative_definition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] |
| **parent_id** | **String** | The parent Product Group ID of this Product Group | [optional] |
| **slideshow_collections_title** | **String** | Slideshow Collections Title | [optional] |
| **slideshow_collections_description** | **String** | Slideshow Collections Description | [optional] |
| **is_mdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **tracking_url** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] |
| **catalog_product_group_id** | **String** | ID of the catalogs product group that this product group promotion references | [optional] |
| **catalog_product_group_name** | **String** | Catalogs product group name | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] |
| **collections_hero_pin_id** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] |
| **collections_hero_destination_url** | **String** | Collections Hero Destination Url | [optional] |
| **grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductGroupPromotion.new(
  id: 2680059592705,
  ad_group_id: 2680059592705,
  bid_in_micro_currency: 14000000,
  included: true,
  definition: */product_type_0&#x3D;&#39;kitchen&#39;/product_type_1&#x3D;&#39;beverage appliances&#39;,
  relative_definition: product_type_1&#x3D;&#39;beverage appliances&#39;,
  parent_id: 1231234,
  slideshow_collections_title: slideshow title,
  slideshow_collections_description: slideshow description,
  is_mdl: true,
  status: null,
  tracking_url: https://www.pinterest.com,
  catalog_product_group_id: 1231235,
  catalog_product_group_name: catalogProductGroupName,
  creative_type: null,
  collections_hero_pin_id: 123123,
  collections_hero_destination_url: http://www.pinterest.com,
  grid_click_type: null
)
```

