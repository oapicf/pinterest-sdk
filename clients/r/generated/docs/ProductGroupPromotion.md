# openapi::ProductGroupPromotion


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **character** | ID of the ad group the product group belongs to. | [optional] [Pattern: ^(AG)?\\d+$] 
**bid_in_micro_currency** | **integer** | The bid in micro currency. | [optional] 
**catalog_product_group_id** | **character** | ID of the catalogs product group that this product group promotion references | [optional] [Pattern: ^\\d+$] 
**catalog_product_group_name** | **character** | Catalogs product group name | [optional] 
**collections_header_type** | **character** | Collections ad header type | [optional] [Enum: [SHOP_THIS_COLLECTION, EXPLORE_THIS_COLLECTION, NO_HEADER, ON_SALE, GET_DEAL]] 
**collections_hero_destination_url** | **character** | Collections Hero Destination Url | [optional] 
**collections_hero_pin_id** | **character** | Hero Pin ID if this PG is promoted as a Collection | [optional] [Pattern: ^\\d+$] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [Enum: ] 
**customizable_cta_type** | **character** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] [Enum: [SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE]] 
**definition** | **character** | The full product group definition path | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [Enum: ] 
**id** | **character** | ID of the product group promotion. | [optional] [Pattern: ^\\d+$] 
**included** | **character** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**is_generate_background** | **character** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**is_mdl** | **character** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**parent_id** | **character** | The parent Product Group ID of this Product Group | [optional] [Pattern: ^\\d+$] 
**preferred_media_type** | **character** | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] [Enum: [VIDEO, IMAGE]] 
**relative_definition** | **character** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**selected_image_tag** | **character** | The ad image tag selected for the product group promotion. | [optional] 
**selected_video_tag** | **character** | The ad video tag selected for the product group promotion. | [optional] 
**slideshow_collections_description** | **character** | Slideshow Collections Description | [optional] 
**slideshow_collections_title** | **character** | Slideshow Collections Title | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [Enum: ] 
**tracking_url** | **character** | Tracking template for proudct group promotions. 4000 limit | [optional] 


