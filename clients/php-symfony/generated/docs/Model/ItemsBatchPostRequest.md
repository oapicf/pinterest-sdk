# ItemsBatchPostRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | **string** |  | 
**country** | [**OpenAPI\Server\Model\Country**](Country.md) |  | 
**language** | **string** | We recommend using the CatalogsLocale values. | 
**items** | [**OpenAPI\Server\Model\ItemDeleteBatchRecord**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**catalogId** | **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**operation** | [**OpenAPI\Server\Model\BatchOperation**](BatchOperation.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


