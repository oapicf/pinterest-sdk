# PRODUCT_GROUP_PROMOTION

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | [**STRING_32**](STRING_32.md) | ID of the ad group the product group belongs to. | [optional] [default to null]
**bid_in_micro_currency** | **INTEGER_32** | The bid in micro currency. | [optional] [default to null]
**catalog_product_group_id** | [**STRING_32**](STRING_32.md) | ID of the catalogs product group that this product group promotion references | [optional] [default to null]
**catalog_product_group_name** | [**STRING_32**](STRING_32.md) | Catalogs product group name | [optional] [default to null]
**collections_header_type** | [**STRING_32**](STRING_32.md) | Collections ad header type | [optional] [default to null]
**collections_hero_destination_url** | [**STRING_32**](STRING_32.md) | Collections Hero Destination Url | [optional] [default to null]
**collections_hero_pin_id** | [**STRING_32**](STRING_32.md) | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to null]
**creative_type** | [**CREATIVE_TYPE**](CreativeType.md) |  | [optional] [default to null]
**customizable_cta_type** | [**STRING_32**](STRING_32.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] [default to null]
**definition** | [**STRING_32**](STRING_32.md) | The full product group definition path | [optional] [default to null]
**grid_click_type** | [**GRID_CLICK_TYPE**](GridClickType.md) |  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | ID of the product group promotion. | [optional] [default to null]
**included** | **BOOLEAN** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to null]
**is_generate_background** | **BOOLEAN** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] [default to null]
**is_mdl** | **BOOLEAN** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to null]
**parent_id** | [**STRING_32**](STRING_32.md) | The parent Product Group ID of this Product Group | [optional] [default to null]
**preferred_media_type** | [**STRING_32**](STRING_32.md) | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] [default to null]
**relative_definition** | [**STRING_32**](STRING_32.md) | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to null]
**selected_image_tag** | [**STRING_32**](STRING_32.md) | The ad image tag selected for the product group promotion. | [optional] [default to null]
**selected_video_tag** | [**STRING_32**](STRING_32.md) | The ad video tag selected for the product group promotion. | [optional] [default to null]
**slideshow_collections_description** | [**STRING_32**](STRING_32.md) | Slideshow Collections Description | [optional] [default to null]
**slideshow_collections_title** | [**STRING_32**](STRING_32.md) | Slideshow Collections Title | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]
**tracking_url** | [**STRING_32**](STRING_32.md) | Tracking template for proudct group promotions. 4000 limit | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


