# AdPreviewRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageUrl** | **String** | Image URL. | 
**PromotionId** | **String** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] 
**Title** | **String** | Title displayed below ad. | 
**CreativeType** | [**AdShoppingPreviewCreativeType**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | 
**PinId** | **String** | Pin ID. | 
**CatalogProductGroupId** | **String** | Catalog Product Group Id. | 
**CustomizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**HeroImageTitle** | **String** | Title displayed below ad. | [optional] 
**HeroImageUrl** | **String** | Hero image URL. | [optional] 
**HeroPinId** | **String** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**ImageTag** | **String** | Multi image template tag. | [optional] 
**ItemId** | **String** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**PreferredMediaType** | [**BasePreferredMediaType**](BasePreferredMediaType.md) | Preferred media type. | [optional] 
**ShowPromotion** | **Boolean** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] 
**VideoTag** | **String** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdPreviewRequest = Initialize-PSOpenAPIToolsAdPreviewRequest  -ImageUrl https://somewebsite.com/someimage.jpg `
 -PromotionId 7834020404549 `
 -Title My Preview Image `
 -CreativeType SHOPPING `
 -PinId 7389479023 `
 -CatalogProductGroupId 123456789 `
 -CustomizableCtaType null `
 -HeroImageTitle My Preview Image `
 -HeroImageUrl https://somewebsite.com/someimage.jpg `
 -HeroPinId 987654321 `
 -ImageTag Christmas Sale `
 -ItemId 111111111 `
 -PreferredMediaType IMAGE `
 -ShowPromotion null `
 -VideoTag Black Friday Sale
```

- Convert the resource to JSON
```powershell
$AdPreviewRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

