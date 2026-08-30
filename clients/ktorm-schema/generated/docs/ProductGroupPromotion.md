
# Table `ProductGroupPromotion`
(mapped from: ProductGroupPromotion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text |  | **kotlin.String** | ID of the ad group the product group belongs to. |  [optional]
**bidInMicroCurrency** | bid_in_micro_currency | int |  | **kotlin.Int** | The bid in micro currency. |  [optional]
**catalogProductGroupId** | catalog_product_group_id | text |  | **kotlin.String** | ID of the catalogs product group that this product group promotion references (required for create operations) |  [optional]
**catalogProductGroupName** | catalog_product_group_name | text |  | **kotlin.String** | Catalogs product group name |  [optional]
**collectionsHeaderType** | collections_header_type | long |  | [**CollectionsHeaderType**](CollectionsHeaderType.md) |  |  [optional] [foreignkey]
**collectionsHeroDestinationUrl** | collections_hero_destination_url | text |  | **kotlin.String** | Collections Hero Destination Url |  [optional]
**collectionsHeroPinId** | collections_hero_pin_id | text |  | **kotlin.String** | Hero Pin ID if this PG is promoted as a Collection |  [optional]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) |  |  [optional] [foreignkey]
**customizableCtaType** | customizable_cta_type | long |  | [**ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  |  [optional] [foreignkey]
**definition** | definition | text |  | **kotlin.String** | The full product group definition path |  [optional]
**gridClickType** | grid_click_type | long |  | [**GridClickType**](GridClickType.md) |  |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | ID of the product group promotion (required for update operations). |  [optional]
**included** | included | boolean |  | **kotlin.Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional]
**isGenerateBackground** | is_generate_background | boolean |  | **kotlin.Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. |  [optional]
**isImageAutoResizing** | is_image_auto_resizing | boolean |  | **kotlin.Boolean** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. |  [optional]
**isMdl** | is_mdl | boolean |  | **kotlin.Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional]
**parentId** | parent_id | text |  | **kotlin.String** | The parent Product Group ID of this Product Group |  [optional]
**preferredMediaType** | preferred_media_type | long |  | [**PreferredMediaType**](PreferredMediaType.md) |  |  [optional] [foreignkey]
**relativeDefinition** | relative_definition | text |  | **kotlin.String** | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional]
**selectedImageTag** | selected_image_tag | text |  | **kotlin.String** | The ad image tag selected for the product group promotion. |  [optional]
**selectedVideoTag** | selected_video_tag | text |  | **kotlin.String** | The ad video tag selected for the product group promotion. |  [optional]
**slideshowCollectionsDescription** | slideshow_collections_description | text |  | **kotlin.String** | Slideshow Collections Description |  [optional]
**slideshowCollectionsTitle** | slideshow_collections_title | text |  | **kotlin.String** | Slideshow Collections Title |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrl** | tracking_url | text |  | **kotlin.String** | Tracking template for proudct group promotions. 4000 limit |  [optional]



























