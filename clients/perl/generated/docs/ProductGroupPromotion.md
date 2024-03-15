# WWW::OpenAPIClient::Object::ProductGroupPromotion

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ProductGroupPromotion;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | ID of the product group promotion. | [optional] 
**ad_group_id** | **string** | ID of the ad group the product group belongs to. | [optional] 
**bid_in_micro_currency** | **int** | The bid in micro currency. | [optional] 
**included** | **boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | **string** | The full product group definition path | [optional] 
**relative_definition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parent_id** | **string** | The parent Product Group ID of this Product Group | [optional] 
**slideshow_collections_title** | **string** | Slideshow Collections Title | [optional] 
**slideshow_collections_description** | **string** | Slideshow Collections Description | [optional] 
**is_mdl** | **boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_url** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalog_product_group_id** | **string** | ID of the catalogs product group that this product group promotion references | [optional] 
**catalog_product_group_name** | **string** | Catalogs product group name | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] 
**collections_hero_pin_id** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**collections_hero_destination_url** | **string** | Collections Hero Destination Url | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


