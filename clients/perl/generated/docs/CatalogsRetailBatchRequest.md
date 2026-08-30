# WWW::OpenAPIClient::Object::CatalogsRetailBatchRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsRetailBatchRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 
**catalog_type** | **string** |  | 
**country** | [**Country**](Country.md) |  | 
**items** | [**ARRAY[CatalogsRetailBatchRequestItemsItems]**](CatalogsRetailBatchRequestItemsItems.md) | Array with catalogs item operations | 
**language** | **string** | We recommend using the CatalogsLocale values. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


