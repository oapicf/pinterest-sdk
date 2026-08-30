# AdPreviewShopping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_product_group_id** | **String** | Catalog Product Group Id. | 
**creative_type** | [***models::AdShoppingPreviewCreativeType**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | 
**customizable_cta_type** | [***swagger::Nullable<models::CustomizableCtaType>**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` | [optional] [default to None]
**hero_image_title** | **String** | Title displayed below ad. | [optional] [default to None]
**hero_image_url** | **String** | Hero image URL. | [optional] [default to None]
**hero_pin_id** | **String** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [default to None]
**image_tag** | **String** | Multi image template tag. | [optional] [default to None]
**item_id** | **String** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] [default to None]
**preferred_media_type** | [***models::BasePreferredMediaType**](BasePreferredMediaType.md) | Preferred media type. | [optional] [default to None]
**show_promotion** | **bool** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] [default to None]
**video_tag** | **String** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


