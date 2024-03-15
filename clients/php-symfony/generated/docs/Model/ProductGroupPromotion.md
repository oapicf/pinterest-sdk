# ProductGroupPromotion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | ID of the product group promotion. | [optional] 
**adGroupId** | **string** | ID of the ad group the product group belongs to. | [optional] 
**bidInMicroCurrency** | **int** | The bid in micro currency. | [optional] 
**included** | **bool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | **string** | The full product group definition path | [optional] 
**relativeDefinition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parentId** | **string** | The parent Product Group ID of this Product Group | [optional] 
**slideshowCollectionsTitle** | **string** | Slideshow Collections Title | [optional] 
**slideshowCollectionsDescription** | **string** | Slideshow Collections Description | [optional] 
**isMdl** | **bool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrl** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalogProductGroupId** | **string** | ID of the catalogs product group that this product group promotion references | [optional] 
**catalogProductGroupName** | **string** | Catalogs product group name | [optional] 
**creativeType** | [**OpenAPI\Server\Model\CreativeType**](CreativeType.md) |  | [optional] 
**collectionsHeroPinId** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**collectionsHeroDestinationUrl** | **string** | Collections Hero Destination Url | [optional] 
**gridClickType** | [**OpenAPI\Server\Model\GridClickType**](GridClickType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


