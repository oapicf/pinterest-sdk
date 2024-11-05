

# ItemsBatchPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**country** | **Country** |  | 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**items** | [**Seq&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**catalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]
**operation** | **BatchOperation** |  | 


## Enum: CatalogType
Allowed values: [CREATIVE_ASSETS]




