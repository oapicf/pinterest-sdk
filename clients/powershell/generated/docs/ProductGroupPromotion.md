# ProductGroupPromotion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **String** | ID of the ad group the product group belongs to. | [optional] 
**BidInMicroCurrency** | **Int32** | The bid in micro currency. | [optional] 
**CatalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] 
**CatalogProductGroupName** | **String** | Catalogs product group name | [optional] 
**CollectionsHeaderType** | [**CollectionsHeaderType**](CollectionsHeaderType.md) |  | [optional] 
**CollectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url | [optional] 
**CollectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**CustomizableCtaType** | [**ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional] 
**Definition** | **String** | The full product group definition path | [optional] 
**GridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**Id** | **String** | ID of the product group promotion (required for update operations). | [optional] 
**Included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**IsGenerateBackground** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**IsImageAutoResizing** | **Boolean** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] 
**IsMdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**ParentId** | **String** | The parent Product Group ID of this Product Group | [optional] 
**PreferredMediaType** | [**PreferredMediaType**](PreferredMediaType.md) |  | [optional] 
**RelativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**SelectedImageTag** | **String** | The ad image tag selected for the product group promotion. | [optional] 
**SelectedVideoTag** | **String** | The ad video tag selected for the product group promotion. | [optional] 
**SlideshowCollectionsDescription** | **String** | Slideshow Collections Description | [optional] 
**SlideshowCollectionsTitle** | **String** | Slideshow Collections Title | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotion = Initialize-PSOpenAPIToolsProductGroupPromotion  -AdGroupId 2680059592705 `
 -BidInMicroCurrency 14000000 `
 -CatalogProductGroupId 1231235 `
 -CatalogProductGroupName catalogProductGroupName `
 -CollectionsHeaderType null `
 -CollectionsHeroDestinationUrl http://www.pinterest.com `
 -CollectionsHeroPinId 123123 `
 -CreativeType null `
 -CustomizableCtaType null `
 -Definition */product_type_0&#x3D;&#39;kitchen&#39;/product_type_1&#x3D;&#39;beverage appliances&#39; `
 -GridClickType null `
 -Id 2680059592705 `
 -Included true `
 -IsGenerateBackground true `
 -IsImageAutoResizing true `
 -IsMdl true `
 -ParentId 1231234 `
 -PreferredMediaType null `
 -RelativeDefinition product_type_1&#x3D;&#39;beverage appliances&#39; `
 -SelectedImageTag holiday_sale `
 -SelectedVideoTag holiday_sale `
 -SlideshowCollectionsDescription slideshow description `
 -SlideshowCollectionsTitle slideshow title `
 -Status null `
 -TrackingUrl https://www.pinterest.com
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

