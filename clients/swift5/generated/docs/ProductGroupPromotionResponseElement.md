# ProductGroupPromotionResponseElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the product group promotion. | [optional] 
**adGroupId** | **String** | ID of the ad group the product group belongs to. | [optional] 
**bidInMicroCurrency** | **Int** | The bid in micro currency. | [optional] 
**included** | **Bool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | **String** | The full product group definition path | [optional] 
**relativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parentId** | **String** | The parent Product Group ID of this Product Group | [optional] 
**slideshowCollectionsTitle** | **String** | Slideshow Collections Title | [optional] 
**slideshowCollectionsDescription** | **String** | Slideshow Collections Description | [optional] 
**isMdl** | **Bool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references | [optional] 
**catalogProductGroupName** | **String** | Catalogs product group name | [optional] 
**collectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**collectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**creativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


