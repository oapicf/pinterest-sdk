# WWW::OpenAPIClient::Object::CatalogsHotelBatchRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsHotelBatchRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | 
**country** | [**Country**](Country.md) |  | 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**items** | [**ARRAY[CatalogsHotelBatchItem]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalog_id** | **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


