# openapi::ItemsBatchPostRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**items** | [**array[ItemDeleteBatchRecord]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**catalog_id** | **character** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [Pattern: ^\\d+$] 
**operation** | [**BatchOperation**](BatchOperation.md) |  | [Enum: ] 


