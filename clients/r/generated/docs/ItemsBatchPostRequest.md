# openapi::ItemsBatchPostRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**Language**](Language.md) |  | [Enum: ] 
**items** | [**array[ItemDeleteBatchRecord]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**catalog_id** | **character** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [Pattern: ^\\d+$] 
**operation** | [**BatchOperation**](BatchOperation.md) |  | [Enum: ] 


