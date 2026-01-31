

# ItemsBatchPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**country** | [**Country**](Country.md) |  | 
**language** | [**LanguageEnum**](#LanguageEnum) | We recommend using the CatalogsLocale values. | 
**items** | [**List&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**catalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]
**operation** | [**BatchOperation**](BatchOperation.md) |  | 


## Enum: CatalogTypeEnum

Name | Value
---- | -----


## Enum: LanguageEnum

Name | Value
---- | -----




