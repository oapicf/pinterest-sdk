# AdPreviewShopping
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **catalog\_product\_group\_id** | **String** | Catalog Product Group Id. | [default to null] |
| **creative\_type** | **String** | Ad format of the shopping ad preview. | [default to null] |
| **customizable\_cta\_type** | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] [default to null] |
| **hero\_image\_title** | **String** | Title displayed below ad. | [optional] [default to null] |
| **hero\_image\_url** | **String** | Hero image URL. | [optional] [default to null] |
| **hero\_pin\_id** | **String** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [default to null] |
| **image\_tag** | **String** | Multi image template tag. | [optional] [default to null] |
| **item\_id** | **String** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] [default to null] |
| **preferred\_media\_type** | **String** | Preferred media type. | [optional] [default to null] |
| **video\_tag** | **String** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

