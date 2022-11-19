# pinterestsdk.model.catalogs_product_group.CatalogsProductGroup

catalog product group entity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | catalog product group entity | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[one_of_0](#one_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
[one_of_1](#one_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# one_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**id** | str,  | str,  | ID of the catalog product group. | 
**feed_id** | str,  | str,  | id of the catalogs feed belonging to this catalog product group | 
**name** | str,  | str,  | Name of catalog product group | [optional] 
**description** | None, str,  | NoneClass, str,  |  | [optional] 
**is_featured** | bool,  | BoolClass,  | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**created_at** | decimal.Decimal, int,  | decimal.Decimal,  | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | decimal.Decimal, int,  | decimal.Decimal,  | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# one_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**id** | str,  | str,  | ID of the catalog product group. | 
**feed_id** | None, str,  | NoneClass, str,  |  | must be one of [None, ] 
**name** | str,  | str,  | Name of catalog product group | [optional] 
**description** | None, str,  | NoneClass, str,  |  | [optional] 
**is_featured** | bool,  | BoolClass,  | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**created_at** | decimal.Decimal, int,  | decimal.Decimal,  | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | decimal.Decimal, int,  | decimal.Decimal,  | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

