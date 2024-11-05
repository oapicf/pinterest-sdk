
# ProductGroupPromotionResponseElement

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | ID of the product group promotion. |  [optional] |
| **adGroupId** | **kotlin.String** | ID of the ad group the product group belongs to. |  [optional] |
| **bidInMicroCurrency** | **kotlin.Int** | The bid in micro currency. |  [optional] |
| **included** | **kotlin.Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional] |
| **definition** | **kotlin.String** | The full product group definition path |  [optional] |
| **relativeDefinition** | **kotlin.String** | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional] |
| **parentId** | **kotlin.String** | The parent Product Group ID of this Product Group |  [optional] |
| **slideshowCollectionsTitle** | **kotlin.String** | Slideshow Collections Title |  [optional] |
| **slideshowCollectionsDescription** | **kotlin.String** | Slideshow Collections Description |  [optional] |
| **isMdl** | **kotlin.Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] |
| **trackingUrl** | **kotlin.String** | Tracking template for proudct group promotions. 4000 limit |  [optional] |
| **catalogProductGroupId** | **kotlin.String** | ID of the catalogs product group that this product group promotion references |  [optional] |
| **catalogProductGroupName** | **kotlin.String** | Catalogs product group name |  [optional] |
| **collectionsHeroPinId** | **kotlin.String** | Hero Pin ID if this PG is promoted as a Collection |  [optional] |
| **collectionsHeroDestinationUrl** | **kotlin.String** | Collections Hero Destination Url |  [optional] |
| **gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional] |
| **creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional] |



