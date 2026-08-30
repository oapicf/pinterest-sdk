# OAIProductGroupPromotion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **NSString*** | ID of the ad group the product group belongs to. | [optional] 
**bidInMicroCurrency** | **NSNumber*** | The bid in micro currency. | [optional] 
**catalogProductGroupId** | **NSString*** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] 
**catalogProductGroupName** | **NSString*** | Catalogs product group name | [optional] 
**collectionsHeaderType** | [**OAICollectionsHeaderType***](OAICollectionsHeaderType.md) |  | [optional] 
**collectionsHeroDestinationUrl** | **NSString*** | Collections Hero Destination Url | [optional] 
**collectionsHeroPinId** | **NSString*** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | [optional] 
**customizableCtaType** | [**OAIProductGroupPromotionCustomizableCTAType***](OAIProductGroupPromotionCustomizableCTAType.md) |  | [optional] 
**definition** | **NSString*** | The full product group definition path | [optional] 
**gridClickType** | [**OAIGridClickType***](OAIGridClickType.md) |  | [optional] 
**_id** | **NSString*** | ID of the product group promotion (required for update operations). | [optional] 
**included** | **NSNumber*** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**isGenerateBackground** | **NSNumber*** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**isImageAutoResizing** | **NSNumber*** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] 
**isMdl** | **NSNumber*** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**parentId** | **NSString*** | The parent Product Group ID of this Product Group | [optional] 
**preferredMediaType** | [**OAIPreferredMediaType***](OAIPreferredMediaType.md) |  | [optional] 
**relativeDefinition** | **NSString*** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**selectedImageTag** | **NSString*** | The ad image tag selected for the product group promotion. | [optional] 
**selectedVideoTag** | **NSString*** | The ad video tag selected for the product group promotion. | [optional] 
**slideshowCollectionsDescription** | **NSString*** | Slideshow Collections Description | [optional] 
**slideshowCollectionsTitle** | **NSString*** | Slideshow Collections Title | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] 
**trackingUrl** | **NSString*** | Tracking template for proudct group promotions. 4000 limit | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


