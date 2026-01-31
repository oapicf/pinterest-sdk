# ProductGroupPromotionCreateRequestElement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | ID of the product group promotion. | [optional] [default to undefined]
**ad_group_id** | **string** | ID of the ad group the product group belongs to. | [optional] [default to undefined]
**bid_in_micro_currency** | **number** | The bid in micro currency. | [optional] [default to undefined]
**included** | **boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to undefined]
**definition** | **string** | The full product group definition path | [optional] [default to undefined]
**relative_definition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to undefined]
**parent_id** | **string** | The parent Product Group ID of this Product Group | [optional] [default to undefined]
**slideshow_collections_title** | **string** | Slideshow Collections Title | [optional] [default to undefined]
**slideshow_collections_description** | **string** | Slideshow Collections Description | [optional] [default to undefined]
**is_mdl** | **boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**tracking_url** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to undefined]
**catalog_product_group_id** | **string** | ID of the catalogs product group that this product group promotion references | [optional] [default to undefined]
**catalog_product_group_name** | **string** | Catalogs product group name | [optional] [default to undefined]
**collections_hero_pin_id** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to undefined]
**collections_hero_destination_url** | **string** | Collections Hero Destination Url | [optional] [default to undefined]
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ProductGroupPromotionCreateRequestElement } from './api';

const instance: ProductGroupPromotionCreateRequestElement = {
    id,
    ad_group_id,
    bid_in_micro_currency,
    included,
    definition,
    relative_definition,
    parent_id,
    slideshow_collections_title,
    slideshow_collections_description,
    is_mdl,
    status,
    tracking_url,
    catalog_product_group_id,
    catalog_product_group_name,
    collections_hero_pin_id,
    collections_hero_destination_url,
    grid_click_type,
    creative_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
