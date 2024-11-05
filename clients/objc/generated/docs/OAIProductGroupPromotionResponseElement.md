# OAIProductGroupPromotionResponseElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | ID of the product group promotion. | [optional] 
**adGroupId** | **NSString*** | ID of the ad group the product group belongs to. | [optional] 
**bidInMicroCurrency** | **NSNumber*** | The bid in micro currency. | [optional] 
**included** | **NSNumber*** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | **NSString*** | The full product group definition path | [optional] 
**relativeDefinition** | **NSString*** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parentId** | **NSString*** | The parent Product Group ID of this Product Group | [optional] 
**slideshowCollectionsTitle** | **NSString*** | Slideshow Collections Title | [optional] 
**slideshowCollectionsDescription** | **NSString*** | Slideshow Collections Description | [optional] 
**isMdl** | **NSNumber*** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] 
**trackingUrl** | **NSString*** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalogProductGroupId** | **NSString*** | ID of the catalogs product group that this product group promotion references | [optional] 
**catalogProductGroupName** | **NSString*** | Catalogs product group name | [optional] 
**collectionsHeroPinId** | **NSString*** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**collectionsHeroDestinationUrl** | **NSString*** | Collections Hero Destination Url | [optional] 
**gridClickType** | [**OAIGridClickType***](OAIGridClickType.md) |  | [optional] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


