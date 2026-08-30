# ProductGroupPromotion


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_group_id`** | **`String`** | ID of the ad group the product group belongs to. | [optional] [default to nothing]
**`bid_in_micro_currency`** | **`Int64`** | The bid in micro currency. | [optional] [default to nothing]
**`catalog_product_group_id`** | **`String`** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] [default to nothing]
**`catalog_product_group_name`** | **`String`** | Catalogs product group name | [optional] [default to nothing]
**`collections_header_type`** | [**`*CollectionsHeaderType`**](CollectionsHeaderType.md) |  | [optional] [default to nothing]
**`collections_hero_destination_url`** | **`String`** | Collections Hero Destination Url | [optional] [default to nothing]
**`collections_hero_pin_id`** | **`String`** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to nothing]
**`creative_type`** | [**`*CreativeType`**](CreativeType.md) |  | [optional] [default to nothing]
**`customizable_cta_type`** | [**`*ProductGroupPromotionCustomizableCTAType`**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional] [default to nothing]
**`definition`** | **`String`** | The full product group definition path | [optional] [default to nothing]
**`grid_click_type`** | [**`*GridClickType`**](GridClickType.md) |  | [optional] [default to nothing]
**`id`** | **`String`** | ID of the product group promotion (required for update operations). | [optional] [default to nothing]
**`included`** | **`Bool`** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to nothing]
**`is_generate_background`** | **`Bool`** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] [default to nothing]
**`is_image_auto_resizing`** | **`Bool`** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] [default to nothing]
**`is_mdl`** | **`Bool`** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to nothing]
**`parent_id`** | **`String`** | The parent Product Group ID of this Product Group | [optional] [default to nothing]
**`preferred_media_type`** | [**`*PreferredMediaType`**](PreferredMediaType.md) |  | [optional] [default to nothing]
**`relative_definition`** | **`String`** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to nothing]
**`selected_image_tag`** | **`String`** | The ad image tag selected for the product group promotion. | [optional] [default to nothing]
**`selected_video_tag`** | **`String`** | The ad video tag selected for the product group promotion. | [optional] [default to nothing]
**`slideshow_collections_description`** | **`String`** | Slideshow Collections Description | [optional] [default to nothing]
**`slideshow_collections_title`** | **`String`** | Slideshow Collections Title | [optional] [default to nothing]
**`status`** | [**`*EntityStatus`**](EntityStatus.md) |  | [optional] [default to nothing]
**`tracking_url`** | **`String`** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


