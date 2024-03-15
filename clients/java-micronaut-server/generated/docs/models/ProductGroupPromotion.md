

# ProductGroupPromotion

The class is defined in **[ProductGroupPromotion.java](../../src/main/java/org/openapitools/model/ProductGroupPromotion.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | ID of the product group promotion. |  [optional property]
**adGroupId** | `String` | ID of the ad group the product group belongs to. |  [optional property]
**bidInMicroCurrency** | `Integer` | The bid in micro currency. |  [optional property]
**included** | `Boolean` | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional property]
**definition** | `String` | The full product group definition path |  [optional property]
**relativeDefinition** | `String` | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional property]
**parentId** | `String` | The parent Product Group ID of this Product Group |  [optional property]
**slideshowCollectionsTitle** | `String` | Slideshow Collections Title |  [optional property]
**slideshowCollectionsDescription** | `String` | Slideshow Collections Description |  [optional property]
**isMdl** | `Boolean` | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrl** | `String` | Tracking template for proudct group promotions. 4000 limit |  [optional property]
**catalogProductGroupId** | `String` | ID of the catalogs product group that this product group promotion references |  [optional property]
**catalogProductGroupName** | `String` | Catalogs product group name |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property]
**collectionsHeroPinId** | `String` | Hero Pin ID if this PG is promoted as a Collection |  [optional property]
**collectionsHeroDestinationUrl** | `String` | Collections Hero Destination Url |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]




















