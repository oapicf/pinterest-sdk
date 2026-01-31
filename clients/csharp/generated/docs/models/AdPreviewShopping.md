# Org.OpenAPITools.Model.AdPreviewShopping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogProductGroupId** | **string** | Catalog Product Group Id. | 
**CreativeType** | **string** | Ad format of the shopping ad preview. | 
**CustomizableCtaType** | **CustomizableCTAType** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**HeroImageTitle** | **string** | Title displayed below ad. | [optional] 
**HeroImageUrl** | **string** | Hero image URL. | [optional] 
**HeroPinId** | **string** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**ImageTag** | **string** | Multi image template tag. | [optional] 
**ItemId** | **string** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**PreferredMediaType** | **string** | Preferred media type. | [optional] 
**VideoTag** | **string** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

