# ProductGroupPromotionResponseElement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | ID of the product group promotion. | [optional]
**ad_group_id** | Option<**String**> | ID of the ad group the product group belongs to. | [optional]
**bid_in_micro_currency** | Option<**i32**> | The bid in micro currency. | [optional]
**included** | Option<**bool**> | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional]
**definition** | Option<**String**> | The full product group definition path | [optional]
**relative_definition** | Option<**String**> | The definition of the product group, relative to its parent - an attribute name/value pair | [optional]
**parent_id** | Option<**String**> | The parent Product Group ID of this Product Group | [optional]
**slideshow_collections_title** | Option<**String**> | Slideshow Collections Title | [optional]
**slideshow_collections_description** | Option<**String**> | Slideshow Collections Description | [optional]
**is_mdl** | Option<**bool**> | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**tracking_url** | Option<**String**> | Tracking template for proudct group promotions. 4000 limit | [optional]
**catalog_product_group_id** | Option<**String**> | ID of the catalogs product group that this product group promotion references | [optional]
**catalog_product_group_name** | Option<**String**> | Catalogs product group name | [optional]
**collections_hero_pin_id** | Option<**String**> | Hero Pin ID if this PG is promoted as a Collection | [optional]
**collections_hero_destination_url** | Option<**String**> | Collections Hero Destination Url | [optional]
**grid_click_type** | Option<[**models::GridClickType**](GridClickType.md)> |  | [optional]
**creative_type** | Option<[**models::CreativeType**](CreativeType.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


