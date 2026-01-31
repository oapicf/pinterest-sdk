# AdPreviewShopping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogProductGroupId** | **String!** | Catalog Product Group Id. | [default to null]
**creativeType** | **String!** | Ad format of the shopping ad preview. | [default to null]
**customizableCtaType** | [***CustomizableCtaType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] [default to null]
**heroImageTitle** | **String!** | Title displayed below ad. | [optional] [default to null]
**heroImageUrl** | **String!** | Hero image URL. | [optional] [default to null]
**heroPinId** | **String!** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [default to null]
**imageTag** | **String!** | Multi image template tag. | [optional] [default to null]
**itemId** | **String!** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] [default to null]
**preferredMediaType** | **String!** | Preferred media type. | [optional] [default to null]
**videoTag** | **String!** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


