# ProductGroupPromotion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group the product group belongs to. | [optional] [default to undefined]
**bid_in_micro_currency** | **number** | The bid in micro currency. | [optional] [default to undefined]
**catalog_product_group_id** | **string** | ID of the catalogs product group that this product group promotion references | [optional] [default to undefined]
**catalog_product_group_name** | **string** | Catalogs product group name | [optional] [default to undefined]
**collections_header_type** | **string** | Collections ad header type | [optional] [default to undefined]
**collections_hero_destination_url** | **string** | Collections Hero Destination Url | [optional] [default to undefined]
**collections_hero_pin_id** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to undefined]
**customizable_cta_type** | **string** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] [default to undefined]
**definition** | **string** | The full product group definition path | [optional] [default to undefined]
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to undefined]
**id** | **string** | ID of the product group promotion. | [optional] [default to undefined]
**included** | **boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to undefined]
**is_generate_background** | **boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] [default to undefined]
**is_mdl** | **boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to undefined]
**parent_id** | **string** | The parent Product Group ID of this Product Group | [optional] [default to undefined]
**preferred_media_type** | **string** | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] [default to undefined]
**relative_definition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to undefined]
**selected_image_tag** | **string** | The ad image tag selected for the product group promotion. | [optional] [default to undefined]
**selected_video_tag** | **string** | The ad video tag selected for the product group promotion. | [optional] [default to undefined]
**slideshow_collections_description** | **string** | Slideshow Collections Description | [optional] [default to undefined]
**slideshow_collections_title** | **string** | Slideshow Collections Title | [optional] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**tracking_url** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to undefined]

## Example

```typescript
import { ProductGroupPromotion } from './api';

const instance: ProductGroupPromotion = {
    ad_group_id,
    bid_in_micro_currency,
    catalog_product_group_id,
    catalog_product_group_name,
    collections_header_type,
    collections_hero_destination_url,
    collections_hero_pin_id,
    creative_type,
    customizable_cta_type,
    definition,
    grid_click_type,
    id,
    included,
    is_generate_background,
    is_mdl,
    parent_id,
    preferred_media_type,
    relative_definition,
    selected_image_tag,
    selected_video_tag,
    slideshow_collections_description,
    slideshow_collections_title,
    status,
    tracking_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
