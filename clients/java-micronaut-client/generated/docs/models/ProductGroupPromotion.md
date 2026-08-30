

# ProductGroupPromotion

The class is defined in **[ProductGroupPromotion.java](../../src/main/java/org/openapitools/model/ProductGroupPromotion.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group the product group belongs to. |  [optional property]
**bidInMicroCurrency** | `Integer` | The bid in micro currency. |  [optional property]
**catalogProductGroupId** | `String` | ID of the catalogs product group that this product group promotion references (required for create operations) |  [optional property]
**catalogProductGroupName** | `String` | Catalogs product group name |  [optional property]
**collectionsHeaderType** | `CollectionsHeaderType` |  |  [optional property]
**collectionsHeroDestinationUrl** | `String` | Collections Hero Destination Url |  [optional property]
**collectionsHeroPinId** | `String` | Hero Pin ID if this PG is promoted as a Collection |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property]
**customizableCtaType** | `ProductGroupPromotionCustomizableCTAType` |  |  [optional property]
**definition** | `String` | The full product group definition path |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**id** | `String` | ID of the product group promotion (required for update operations). |  [optional property]
**included** | `Boolean` | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional property]
**isGenerateBackground** | `Boolean` | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. |  [optional property]
**isImageAutoResizing** | `Boolean` | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. |  [optional property]
**isMdl** | `Boolean` | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional property]
**parentId** | `String` | The parent Product Group ID of this Product Group |  [optional property]
**preferredMediaType** | `PreferredMediaType` |  |  [optional property]
**relativeDefinition** | `String` | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional property]
**selectedImageTag** | `String` | The ad image tag selected for the product group promotion. |  [optional property]
**selectedVideoTag** | `String` | The ad video tag selected for the product group promotion. |  [optional property]
**slideshowCollectionsDescription** | `String` | Slideshow Collections Description |  [optional property]
**slideshowCollectionsTitle** | `String` | Slideshow Collections Title |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrl** | `String` | Tracking template for proudct group promotions. 4000 limit |  [optional property]



























