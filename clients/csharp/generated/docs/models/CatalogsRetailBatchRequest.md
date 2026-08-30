# Org.OpenAPITools.Model.CatalogsRetailBatchRequest
A request object that can have multiple operations on a single retail batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Country** | **Country** |  | 
**Items** | [**List&lt;CatalogsRetailBatchRequestItemsItems&gt;**](CatalogsRetailBatchRequestItemsItems.md) | Array with catalogs item operations | 
**Language** | **string** | We recommend using the CatalogsLocale values. | 
**CatalogId** | **string** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

