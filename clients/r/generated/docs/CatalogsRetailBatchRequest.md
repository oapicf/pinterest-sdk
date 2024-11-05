# openapi::CatalogsRetailBatchRequest

A request object that can have multiple operations on a single retail batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**items** | [**array[CatalogsRetailBatchRequestItemsInner]**](CatalogsRetailBatchRequest_items_inner.md) | Array with catalogs item operations | [Max. items: 1000] [Min. items: 1] 


