# PinterestSdk.ProductGroupPromotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group the product group belongs to. | [optional] 
**bidInMicroCurrency** | **Number** | The bid in micro currency. | [optional] 
**catalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] 
**catalogProductGroupName** | **String** | Catalogs product group name | [optional] 
**collectionsHeaderType** | [**CollectionsHeaderType**](CollectionsHeaderType.md) |  | [optional] 
**collectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url | [optional] 
**collectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**creativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**customizableCtaType** | [**ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional] 
**definition** | **String** | The full product group definition path | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**id** | **String** | ID of the product group promotion (required for update operations). | [optional] 
**included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**isGenerateBackground** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**isImageAutoResizing** | **Boolean** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] 
**isMdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**parentId** | **String** | The parent Product Group ID of this Product Group | [optional] 
**preferredMediaType** | [**PreferredMediaType**](PreferredMediaType.md) |  | [optional] 
**relativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**selectedImageTag** | **String** | The ad image tag selected for the product group promotion. | [optional] 
**selectedVideoTag** | **String** | The ad video tag selected for the product group promotion. | [optional] 
**slideshowCollectionsDescription** | **String** | Slideshow Collections Description | [optional] 
**slideshowCollectionsTitle** | **String** | Slideshow Collections Title | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] 


