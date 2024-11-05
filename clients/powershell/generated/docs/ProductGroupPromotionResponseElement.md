# ProductGroupPromotionResponseElement
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | ID of the product group promotion. | [optional] 
**AdGroupId** | **String** | ID of the ad group the product group belongs to. | [optional] 
**BidInMicroCurrency** | **Int32** | The bid in micro currency. | [optional] 
**Included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**Definition** | **String** | The full product group definition path | [optional] 
**RelativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**ParentId** | **String** | The parent Product Group ID of this Product Group | [optional] 
**SlideshowCollectionsTitle** | **String** | Slideshow Collections Title | [optional] 
**SlideshowCollectionsDescription** | **String** | Slideshow Collections Description | [optional] 
**IsMdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**CatalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references | [optional] 
**CatalogProductGroupName** | **String** | Catalogs product group name | [optional] 
**CollectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**CollectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url | [optional] 
**GridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotionResponseElement = Initialize-PSOpenAPIToolsProductGroupPromotionResponseElement  -Id 2680059592705 `
 -AdGroupId 2680059592705 `
 -BidInMicroCurrency 14000000 `
 -Included true `
 -Definition */product_type_0&#x3D;&#39;kitchen&#39;/product_type_1&#x3D;&#39;beverage appliances&#39; `
 -RelativeDefinition product_type_1&#x3D;&#39;beverage appliances&#39; `
 -ParentId 1231234 `
 -SlideshowCollectionsTitle slideshow title `
 -SlideshowCollectionsDescription slideshow description `
 -IsMdl true `
 -Status null `
 -TrackingUrl https://www.pinterest.com `
 -CatalogProductGroupId 1231235 `
 -CatalogProductGroupName catalogProductGroupName `
 -CollectionsHeroPinId 123123 `
 -CollectionsHeroDestinationUrl http://www.pinterest.com `
 -GridClickType null `
 -CreativeType null
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotionResponseElement | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

