# AdPreviewShopping

Ad preview from a catalog product group (shopping).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_product_group_id** | **string** | Catalog Product Group Id. | [default to undefined]
**creative_type** | [**AdShoppingPreviewCreativeType**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | [default to undefined]
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] [default to undefined]
**hero_image_title** | **string** | Title displayed below ad. | [optional] [default to undefined]
**hero_image_url** | **string** | Hero image URL. | [optional] [default to undefined]
**hero_pin_id** | **string** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [default to undefined]
**image_tag** | **string** | Multi image template tag. | [optional] [default to undefined]
**item_id** | **string** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] [default to undefined]
**preferred_media_type** | [**BasePreferredMediaType**](BasePreferredMediaType.md) | Preferred media type. | [optional] [default to undefined]
**show_promotion** | **boolean** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] [default to undefined]
**video_tag** | **string** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] [default to undefined]

## Example

```typescript
import { AdPreviewShopping } from './api';

const instance: AdPreviewShopping = {
    catalog_product_group_id,
    creative_type,
    customizable_cta_type,
    hero_image_title,
    hero_image_url,
    hero_pin_id,
    image_tag,
    item_id,
    preferred_media_type,
    show_promotion,
    video_tag,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
