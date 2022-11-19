# pinterestsdk.model.product_group_promotion.ProductGroupPromotion

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str,  | str,  | ID of the product group promotion. | [optional] 
**ad_group_id** | str,  | str,  | ID of the ad group the product group belongs to. | [optional] 
**type** | None, str,  | NoneClass, str,  | Product group promotion | [optional] 
**bid_in_micro_currency** | decimal.Decimal, int,  | decimal.Decimal,  | The bid in micro currency. | [optional] 
**included** | None, bool,  | NoneClass, BoolClass,  | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**definition** | None, str,  | NoneClass, str,  | The full product group definition path | [optional] 
**relative_definition** | None, str,  | NoneClass, str,  | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**parent_id** | None, str,  | NoneClass, str,  | The parent Product Group ID of this Product Group | [optional] 
**slideshow_collections_title** | None, str,  | NoneClass, str,  | Slideshow Collections Title | [optional] 
**slideshow_collections_description** | None, str,  | NoneClass, str,  | Slideshow Collections Description | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ProductGroupPromotionCommon](ProductGroupPromotionCommon.md) | [**ProductGroupPromotionCommon**](ProductGroupPromotionCommon.md) | [**ProductGroupPromotionCommon**](ProductGroupPromotionCommon.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

