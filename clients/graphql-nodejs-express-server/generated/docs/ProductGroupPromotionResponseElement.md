# ProductGroupPromotionResponseElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | ID of the product group promotion. | [optional] [default to null]
**adGroupId** | **String!** | ID of the ad group the product group belongs to. | [optional] [default to null]
**bidInMicroCurrency** | **Int** | The bid in micro currency. | [optional] [default to null]
**included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to null]
**definition** | **String** | The full product group definition path | [optional] [default to null]
**relativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to null]
**parentId** | **String** | The parent Product Group ID of this Product Group | [optional] [default to null]
**slideshowCollectionsTitle** | **String** | Slideshow Collections Title | [optional] [default to null]
**slideshowCollectionsDescription** | **String** | Slideshow Collections Description | [optional] [default to null]
**isMdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to null]
**status** | [***EntityStatus**](EntityStatus.md) |  | [optional] [default to null]
**trackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to null]
**catalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references | [optional] [default to null]
**catalogProductGroupName** | **String** | Catalogs product group name | [optional] [default to null]
**collectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to null]
**collectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url | [optional] [default to null]
**gridClickType** | [***GridClickType**](GridClickType.md) |  | [optional] [default to null]
**creativeType** | [***CreativeType**](CreativeType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


