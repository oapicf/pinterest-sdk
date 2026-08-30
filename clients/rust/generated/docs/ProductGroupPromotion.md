# ProductGroupPromotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | Option<**String**> | ID of the ad group the product group belongs to. | [optional]
**bid_in_micro_currency** | Option<**i32**> | The bid in micro currency. | [optional]
**catalog_product_group_id** | Option<**String**> | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional]
**catalog_product_group_name** | Option<**String**> | Catalogs product group name | [optional]
**collections_header_type** | Option<[**models::CollectionsHeaderType**](CollectionsHeaderType.md)> |  | [optional]
**collections_hero_destination_url** | Option<**String**> | Collections Hero Destination Url | [optional]
**collections_hero_pin_id** | Option<**String**> | Hero Pin ID if this PG is promoted as a Collection | [optional]
**creative_type** | Option<[**models::CreativeType**](CreativeType.md)> |  | [optional]
**customizable_cta_type** | Option<[**models::ProductGroupPromotionCustomizableCtaType**](ProductGroupPromotionCustomizableCTAType.md)> |  | [optional]
**definition** | Option<**String**> | The full product group definition path | [optional]
**grid_click_type** | Option<[**models::GridClickType**](GridClickType.md)> |  | [optional]
**id** | Option<**String**> | ID of the product group promotion (required for update operations). | [optional]
**included** | Option<**bool**> | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional]
**is_generate_background** | Option<**bool**> | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional]
**is_image_auto_resizing** | Option<**bool**> | Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional]
**is_mdl** | Option<**bool**> | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional]
**parent_id** | Option<**String**> | The parent Product Group ID of this Product Group | [optional]
**preferred_media_type** | Option<[**models::PreferredMediaType**](PreferredMediaType.md)> |  | [optional]
**relative_definition** | Option<**String**> | The definition of the product group, relative to its parent - an attribute name/value pair | [optional]
**selected_image_tag** | Option<**String**> | The ad image tag selected for the product group promotion. | [optional]
**selected_video_tag** | Option<**String**> | The ad video tag selected for the product group promotion. | [optional]
**slideshow_collections_description** | Option<**String**> | Slideshow Collections Description | [optional]
**slideshow_collections_title** | Option<**String**> | Slideshow Collections Title | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**tracking_url** | Option<**String**> | Tracking template for proudct group promotions. 4000 limit | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


