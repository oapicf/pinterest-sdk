# pinterestsdk.model.catalogs_list_products_by_filter_request.CatalogsListProductsByFilterRequest

Request object to list products for a given product group filter.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object to list products for a given product group filter. | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[one_of_0](#one_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object to list products for a given feed_id and product group filter. | 

# one_of_0

Request object to list products for a given feed_id and product group filter.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object to list products for a given feed_id and product group filter. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**feed_id** | str,  | str,  | Catalog Feed id pertaining to the catalog product group filter. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

