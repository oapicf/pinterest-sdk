# openapi::CatalogsHotelBatchRequest

Request object to update catalogs hotel items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequest_language.md) |  | 
**items** | [**array[CatalogsHotelBatchItem]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | [Max. items: 1000] [Min. items: 1] 
**catalog_id** | **character** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [Pattern: ^\\d+$] 


