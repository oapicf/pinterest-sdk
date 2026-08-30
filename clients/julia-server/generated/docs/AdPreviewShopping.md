# AdPreviewShopping


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_product_group_id`** | **`String`** | Catalog Product Group Id. | [default to nothing]
**`creative_type`** | [**`*AdShoppingPreviewCreativeType`**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | [default to nothing]
**`customizable_cta_type`** | [**`*CustomizableCTAType`**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] [default to nothing]
**`hero_image_title`** | **`String`** | Title displayed below ad. | [optional] [default to nothing]
**`hero_image_url`** | **`String`** | Hero image URL. | [optional] [default to nothing]
**`hero_pin_id`** | **`String`** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [default to nothing]
**`image_tag`** | **`String`** | Multi image template tag. | [optional] [default to nothing]
**`item_id`** | **`String`** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] [default to nothing]
**`preferred_media_type`** | [**`*BasePreferredMediaType`**](BasePreferredMediaType.md) | Preferred media type. | [optional] [default to nothing]
**`show_promotion`** | **`Bool`** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] [default to nothing]
**`video_tag`** | **`String`** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


