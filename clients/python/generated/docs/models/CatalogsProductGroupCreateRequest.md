# pinterestsdk.model.catalogs_product_group_create_request.CatalogsProductGroupCreateRequest

Request object for creating a product group.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object for creating a product group. | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[one_of_0](#one_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# one_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  |  | 
**filters** | [**CatalogsProductGroupFiltersAllOfRequest**](CatalogsProductGroupFiltersAllOfRequest.md) | [**CatalogsProductGroupFiltersAllOfRequest**](CatalogsProductGroupFiltersAllOfRequest.md) |  | 
**feed_id** | str,  | str,  | Catalog Feed id pertaining to the catalog product group. | 
**description** | None, str,  | NoneClass, str,  |  | [optional] 
**is_featured** | bool,  | BoolClass,  | boolean indicator of whether the product group is being featured or not | [optional] if omitted the server will use the default value of False
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

