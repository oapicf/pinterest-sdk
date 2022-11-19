# pinterestsdk.model.product_group_promotion_common.ProductGroupPromotionCommon

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**status** | [**EntityStatus**](EntityStatus.md) | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_url** | None, str,  | NoneClass, str,  | Tracking template for proudct group promotions. 4000 limit | [optional] 
**catalogs_product_group_id** | str,  | str,  | ID of the catalogs product group that this product group promotion references | [optional] 
**catalogs_product_group_name** | str,  | str,  | Catalogs product group | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) | [**CreativeType**](CreativeType.md) |  | [optional] 
**collections_hero_pin_id** | None, str,  | NoneClass, str,  | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**collections_hero_destination_url** | None, str,  | NoneClass, str,  | Collections Hero Destination Url | [optional] 
**slideshow_collections_title** | None, str,  | NoneClass, str,  | Slideshow Collections Title | [optional] 
**slideshow_collections_description** | None, str,  | NoneClass, str,  | Slideshow Collections Description | [optional] 
**is_mdl** | None, bool,  | NoneClass, BoolClass,  | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

