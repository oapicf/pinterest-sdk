# AdPreviewShopping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_product_group_id** | **String** | Catalog Product Group Id. | 
**creative_type** | **String** | Ad format of the shopping ad preview. | 
**customizable_cta_type** | Option<[**models::CustomizableCtaType**](CustomizableCTAType.md)> | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` | [optional]
**hero_image_title** | Option<**String**> | Title displayed below ad. | [optional]
**hero_image_url** | Option<**String**> | Hero image URL. | [optional]
**hero_pin_id** | Option<**String**> | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional]
**image_tag** | Option<**String**> | Multi image template tag. | [optional]
**item_id** | Option<**String**> | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional]
**preferred_media_type** | Option<**String**> | Preferred media type. | [optional]
**video_tag** | Option<**String**> | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


