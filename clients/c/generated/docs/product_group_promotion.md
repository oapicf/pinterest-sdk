# product_group_promotion_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **char \*** | ID of the ad group the product group belongs to. | [optional] 
**bid_in_micro_currency** | **int** | The bid in micro currency. | [optional] 
**catalog_product_group_id** | **char \*** | ID of the catalogs product group that this product group promotion references | [optional] 
**catalog_product_group_name** | **char \*** | Catalogs product group name | [optional] 
**collections_header_type** | **pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_e** | Collections ad header type | [optional] 
**collections_hero_destination_url** | **char \*** | Collections Hero Destination Url | [optional] 
**collections_hero_pin_id** | **char \*** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**creative_type** | **creative_type_t \*** |  | [optional] 
**customizable_cta_type** | **pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_e** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] 
**definition** | **char \*** | The full product group definition path | [optional] 
**grid_click_type** | **grid_click_type_t \*** |  | [optional] 
**id** | **char \*** | ID of the product group promotion. | [optional] 
**included** | **int** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**is_generate_background** | **int** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**is_mdl** | **int** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**parent_id** | **char \*** | The parent Product Group ID of this Product Group | [optional] 
**preferred_media_type** | **pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_e** | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] 
**relative_definition** | **char \*** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**selected_image_tag** | **char \*** | The ad image tag selected for the product group promotion. | [optional] 
**selected_video_tag** | **char \*** | The ad video tag selected for the product group promotion. | [optional] 
**slideshow_collections_description** | **char \*** | Slideshow Collections Description | [optional] 
**slideshow_collections_title** | **char \*** | Slideshow Collections Title | [optional] 
**status** | **entity_status_t \*** |  | [optional] 
**tracking_url** | **char \*** | Tracking template for proudct group promotions. 4000 limit | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


