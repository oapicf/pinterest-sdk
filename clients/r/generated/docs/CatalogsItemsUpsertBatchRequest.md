# openapi::CatalogsItemsUpsertBatchRequest

Request object to upsert catalogs items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**operation** | [**BatchOperation**](BatchOperation.md) |  | [Enum: ] 
**items** | [**array[ItemUpsertBatchRecord]**](ItemUpsertBatchRecord.md) | Array with catalogs items | [Max. items: 1000] [Min. items: 1] 


