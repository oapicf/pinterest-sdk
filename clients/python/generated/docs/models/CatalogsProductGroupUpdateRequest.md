# pinterestsdk.model.catalogs_product_group_update_request.CatalogsProductGroupUpdateRequest

Request object for updating a product group.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object for updating a product group. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  |  | [optional] 
**description** | None, str,  | NoneClass, str,  |  | [optional] 
**is_featured** | bool,  | BoolClass,  | boolean indicator of whether the product group is being featured or not | [optional] 
**filters** | [**CatalogsProductGroupFiltersAllOfRequest**](CatalogsProductGroupFiltersAllOfRequest.md) | [**CatalogsProductGroupFiltersAllOfRequest**](CatalogsProductGroupFiltersAllOfRequest.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

