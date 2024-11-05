# openapi::CatalogsItemsCreateBatchRequest

Request object to create catalogs items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**operation** | [**BatchOperation**](BatchOperation.md) |  | [Enum: ] 
**items** | [**array[ItemCreateBatchRecord]**](ItemCreateBatchRecord.md) | Array with catalogs items | [Max. items: 1000] [Min. items: 1] 


