# ItemsBatchPostRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [***models::CatalogsType**](CatalogsType.md) |  | 
**country** | [***models::Country**](Country.md) |  | 
**language** | [***models::Language**](Language.md) |  | 
**items** | [**Vec<models::ItemDeleteBatchRecord>**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**catalog_id** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [default to None]
**operation** | [***models::BatchOperation**](BatchOperation.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


