# Org.OpenAPITools.Model.ProductGroupPromotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | ID of the product group promotion. | [optional] 
**AdGroupId** | **string** | ID of the ad group the product group belongs to. | [optional] 
**BidInMicroCurrency** | **int?** | The bid in micro currency. | [optional] 
**Included** | **bool?** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**Definition** | **string** | The full product group definition path | [optional] 
**RelativeDefinition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**ParentId** | **string** | The parent Product Group ID of this Product Group | [optional] 
**SlideshowCollectionsTitle** | **string** | Slideshow Collections Title | [optional] 
**SlideshowCollectionsDescription** | **string** | Slideshow Collections Description | [optional] 
**IsMdl** | **bool?** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**TrackingUrl** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**CatalogProductGroupId** | **string** | ID of the catalogs product group that this product group promotion references | [optional] 
**CatalogProductGroupName** | **string** | Catalogs product group name | [optional] 
**CreativeType** | **CreativeType** |  | [optional] 
**CollectionsHeroPinId** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**CollectionsHeroDestinationUrl** | **string** | Collections Hero Destination Url | [optional] 
**GridClickType** | **GridClickType** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

