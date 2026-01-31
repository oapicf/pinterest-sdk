# # AdPreviewShopping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_product_group_id** | **string** | Catalog Product Group Id. |
**creative_type** | **string** | Ad format of the shopping ad preview. |
**customizable_cta_type** | [**\OpenAPI\Client\Model\CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional]
**hero_image_title** | **string** | Title displayed below ad. | [optional]
**hero_image_url** | **string** | Hero image URL. | [optional]
**hero_pin_id** | **string** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional]
**image_tag** | **string** | Multi image template tag. | [optional]
**item_id** | **string** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional]
**preferred_media_type** | **string** | Preferred media type. | [optional]
**video_tag** | **string** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
