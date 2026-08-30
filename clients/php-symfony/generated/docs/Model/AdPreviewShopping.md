# AdPreviewShopping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogProductGroupId** | **string** | Catalog Product Group Id. | 
**creativeType** | [**OpenAPI\Server\Model\AdShoppingPreviewCreativeType**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | 
**customizableCtaType** | [**OpenAPI\Server\Model\CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**heroImageTitle** | **string** | Title displayed below ad. | [optional] 
**heroImageUrl** | **string** | Hero image URL. | [optional] 
**heroPinId** | **string** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**imageTag** | **string** | Multi image template tag. | [optional] 
**itemId** | **string** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**preferredMediaType** | [**OpenAPI\Server\Model\BasePreferredMediaType**](BasePreferredMediaType.md) | Preferred media type. | [optional] 
**showPromotion** | **bool** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] 
**videoTag** | **string** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


