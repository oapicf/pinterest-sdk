# ProductGroupPromotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group the product group belongs to. | [optional]
**bid_in_micro_currency** | **int** | The bid in micro currency. | [optional]
**catalog_product_group_id** | **string** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional]
**catalog_product_group_name** | **string** | Catalogs product group name | [optional]
**collections_header_type** | [**\OpenAPI\Client\Model\CollectionsHeaderType**](CollectionsHeaderType.md) |  | [optional]
**collections_hero_destination_url** | **string** | Collections Hero Destination Url | [optional]
**collections_hero_pin_id** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional]
**creative_type** | [**\OpenAPI\Client\Model\CreativeType**](CreativeType.md) |  | [optional]
**customizable_cta_type** | [**\OpenAPI\Client\Model\ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional]
**definition** | **string** | The full product group definition path | [optional]
**grid_click_type** | [**\OpenAPI\Client\Model\GridClickType**](GridClickType.md) |  | [optional]
**id** | **string** | ID of the product group promotion (required for update operations). | [optional]
**included** | **bool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional]
**is_generate_background** | **bool** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional]
**is_image_auto_resizing** | **bool** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional]
**is_mdl** | **bool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional]
**parent_id** | **string** | The parent Product Group ID of this Product Group | [optional]
**preferred_media_type** | [**\OpenAPI\Client\Model\PreferredMediaType**](PreferredMediaType.md) |  | [optional]
**relative_definition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional]
**selected_image_tag** | **string** | The ad image tag selected for the product group promotion. | [optional]
**selected_video_tag** | **string** | The ad video tag selected for the product group promotion. | [optional]
**slideshow_collections_description** | **string** | Slideshow Collections Description | [optional]
**slideshow_collections_title** | **string** | Slideshow Collections Title | [optional]
**status** | [**\OpenAPI\Client\Model\EntityStatus**](EntityStatus.md) |  | [optional]
**tracking_url** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
