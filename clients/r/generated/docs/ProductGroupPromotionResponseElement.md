# openapi::ProductGroupPromotionResponseElement


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | ID of the product group promotion. | [optional] [Pattern: ^\\d+$] 
**ad_group_id** | **character** | ID of the ad group the product group belongs to. | [optional] [Pattern: ^(AG)?\\d+$] 
**bid_in_micro_currency** | **integer** | The bid in micro currency. | [optional] 
**included** | **character** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | **character** | The full product group definition path | [optional] 
**relative_definition** | **character** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parent_id** | **character** | The parent Product Group ID of this Product Group | [optional] [Pattern: ^\\d+$] 
**slideshow_collections_title** | **character** | Slideshow Collections Title | [optional] 
**slideshow_collections_description** | **character** | Slideshow Collections Description | [optional] 
**is_mdl** | **character** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [Enum: ] 
**tracking_url** | **character** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalog_product_group_id** | **character** | ID of the catalogs product group that this product group promotion references | [optional] [Pattern: ^\\d+$] 
**catalog_product_group_name** | **character** | Catalogs product group name | [optional] 
**collections_hero_pin_id** | **character** | Hero Pin ID if this PG is promoted as a Collection | [optional] [Pattern: ^\\d+$] 
**collections_hero_destination_url** | **character** | Collections Hero Destination Url | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [Enum: ] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [Enum: ] 


