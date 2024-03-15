# ProductGroupPromotion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the product group promotion. | [optional] [default to None]
**ad_group_id** | **String** | ID of the ad group the product group belongs to. | [optional] [default to None]
**bid_in_micro_currency** | **i32** | The bid in micro currency. | [optional] [default to None]
**included** | **bool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to None]
**definition** | **String** | The full product group definition path | [optional] [default to None]
**relative_definition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to None]
**parent_id** | **String** | The parent Product Group ID of this Product Group | [optional] [default to None]
**slideshow_collections_title** | **String** | Slideshow Collections Title | [optional] [default to None]
**slideshow_collections_description** | **String** | Slideshow Collections Description | [optional] [default to None]
**is_mdl** | **bool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) |  | [optional] [default to None]
**tracking_url** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to None]
**catalog_product_group_id** | **String** | ID of the catalogs product group that this product group promotion references | [optional] [default to None]
**catalog_product_group_name** | **String** | Catalogs product group name | [optional] [default to None]
**creative_type** | [***models::CreativeType**](CreativeType.md) |  | [optional] [default to None]
**collections_hero_pin_id** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to None]
**collections_hero_destination_url** | **String** | Collections Hero Destination Url | [optional] [default to None]
**grid_click_type** | [***models::GridClickType**](GridClickType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


