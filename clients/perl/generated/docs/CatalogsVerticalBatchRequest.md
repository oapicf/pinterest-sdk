# WWW::OpenAPIClient::Object::CatalogsVerticalBatchRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsVerticalBatchRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**country** | [**Country**](Country.md) |  | 
**language** | [**Language**](Language.md) |  | 
**items** | [**ARRAY[CatalogsHotelBatchItem]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalog_id** | **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


