# CatalogsHotelBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **String** |  | 
**country** | [**models::Country**](Country.md) |  | 
**language** | [**models::CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**items** | [**Vec<models::CatalogsHotelBatchItem>**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalog_id** | Option<**String**> | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


