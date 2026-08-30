# AD_PREVIEW_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | [**STRING_32**](STRING_32.md) | Image URL. | [default to null]
**promotion_id** | [**STRING_32**](STRING_32.md) | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] [default to null]
**title** | [**STRING_32**](STRING_32.md) | Title displayed below ad. | [default to null]
**creative_type** | [**AD_SHOPPING_PREVIEW_CREATIVE_TYPE**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | [default to null]
**pin_id** | [**STRING_32**](STRING_32.md) | Pin ID. | [default to null]
**catalog_product_group_id** | [**STRING_32**](STRING_32.md) | Catalog Product Group Id. | [default to null]
**customizable_cta_type** | [**CUSTOMIZABLE_CTA_TYPE**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] [default to null]
**hero_image_title** | [**STRING_32**](STRING_32.md) | Title displayed below ad. | [optional] [default to null]
**hero_image_url** | [**STRING_32**](STRING_32.md) | Hero image URL. | [optional] [default to null]
**hero_pin_id** | [**STRING_32**](STRING_32.md) | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [default to null]
**image_tag** | [**STRING_32**](STRING_32.md) | Multi image template tag. | [optional] [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] [default to null]
**preferred_media_type** | [**BASE_PREFERRED_MEDIA_TYPE**](BasePreferredMediaType.md) | Preferred media type. | [optional] [default to null]
**show_promotion** | **BOOLEAN** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] [default to null]
**video_tag** | [**STRING_32**](STRING_32.md) | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


