# PRODUCT_GROUP_PROMOTION

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | ID of the product group promotion. | [optional] [default to null]
**ad_group_id** | [**STRING_32**](STRING_32.md) | ID of the ad group the product group belongs to. | [optional] [default to null]
**bid_in_micro_currency** | **INTEGER_32** | The bid in micro currency. | [optional] [default to null]
**included** | **BOOLEAN** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to null]
**definition** | [**STRING_32**](STRING_32.md) | The full product group definition path | [optional] [default to null]
**relative_definition** | [**STRING_32**](STRING_32.md) | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to null]
**parent_id** | [**STRING_32**](STRING_32.md) | The parent Product Group ID of this Product Group | [optional] [default to null]
**slideshow_collections_title** | [**STRING_32**](STRING_32.md) | Slideshow Collections Title | [optional] [default to null]
**slideshow_collections_description** | [**STRING_32**](STRING_32.md) | Slideshow Collections Description | [optional] [default to null]
**is_mdl** | **BOOLEAN** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]
**tracking_url** | [**STRING_32**](STRING_32.md) | Tracking template for proudct group promotions. 4000 limit | [optional] [default to null]
**catalog_product_group_id** | [**STRING_32**](STRING_32.md) | ID of the catalogs product group that this product group promotion references | [optional] [default to null]
**catalog_product_group_name** | [**STRING_32**](STRING_32.md) | Catalogs product group name | [optional] [default to null]
**collections_hero_pin_id** | [**STRING_32**](STRING_32.md) | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to null]
**collections_hero_destination_url** | [**STRING_32**](STRING_32.md) | Collections Hero Destination Url | [optional] [default to null]
**grid_click_type** | [**GRID_CLICK_TYPE**](GridClickType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


