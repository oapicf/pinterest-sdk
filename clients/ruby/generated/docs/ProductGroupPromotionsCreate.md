# PinterestSdkClient::ProductGroupPromotionsCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | ID of the ad group the product group promotion belongs to. |  |
| **product_group_promotion** | [**Array&lt;ProductGroupPromotion&gt;**](ProductGroupPromotion.md) | List of product group promotions to create or update. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductGroupPromotionsCreate.new(
  ad_group_id: 2680059592705,
  product_group_promotion: [{&quot;slideshow_collections_description&quot;:&quot;Description&quot;,&quot;creative_type&quot;:&quot;REGULAR&quot;,&quot;collections_hero_pin_id&quot;:&quot;123123&quot;,&quot;catalog_product_group_name&quot;:&quot;catalogProductGroupName to create&quot;,&quot;collections_hero_destination_url&quot;:&quot;http://www.pinterest.com&quot;,&quot;tracking_url&quot;:&quot;https://www.pinterest.com&quot;,&quot;slideshow_collections_title&quot;:&quot;Title&quot;,&quot;status&quot;:&quot;ACTIVE&quot;,&quot;is_mdl&quot;:true},{&quot;id&quot;:&quot;2680059592705&quot;,&quot;catalog_product_group_id&quot;:&quot;1234123&quot;,&quot;slideshow_collections_description&quot;:&quot;Description&quot;,&quot;creative_type&quot;:&quot;REGULAR&quot;,&quot;collections_hero_pin_id&quot;:&quot;123123&quot;,&quot;catalog_product_group_name&quot;:&quot;catalogProductGroupName to update&quot;,&quot;collections_hero_destination_url&quot;:&quot;http://www.pinterest.com&quot;,&quot;tracking_url&quot;:&quot;https://www.pinterest.com&quot;,&quot;slideshow_collections_title&quot;:&quot;Title&quot;,&quot;status&quot;:&quot;ACTIVE&quot;}]
)
```

