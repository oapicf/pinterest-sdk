# product_group_promotion_response_element_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | ID of the product group promotion. | [optional] 
**ad_group_id** | **char \*** | ID of the ad group the product group belongs to. | [optional] 
**bid_in_micro_currency** | **int** | The bid in micro currency. | [optional] 
**included** | **int** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | **char \*** | The full product group definition path | [optional] 
**relative_definition** | **char \*** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parent_id** | **char \*** | The parent Product Group ID of this Product Group | [optional] 
**slideshow_collections_title** | **char \*** | Slideshow Collections Title | [optional] 
**slideshow_collections_description** | **char \*** | Slideshow Collections Description | [optional] 
**is_mdl** | **int** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**status** | **entity_status_t \*** |  | [optional] 
**tracking_url** | **char \*** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalog_product_group_id** | **char \*** | ID of the catalogs product group that this product group promotion references | [optional] 
**catalog_product_group_name** | **char \*** | Catalogs product group name | [optional] 
**collections_hero_pin_id** | **char \*** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**collections_hero_destination_url** | **char \*** | Collections Hero Destination Url | [optional] 
**grid_click_type** | **grid_click_type_t \*** |  | [optional] 
**creative_type** | **creative_type_t \*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


