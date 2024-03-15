# openapi::CatalogsVerticalBatchRequest

A request object that can have multiple operations on a single batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**Language**](Language.md) |  | [Enum: ] 
**items** | [**array[CatalogsHotelBatchItem]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | [Max. items: 1000] [Min. items: 1] 
**catalog_id** | **character** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [Pattern: ^\\d+$] 


