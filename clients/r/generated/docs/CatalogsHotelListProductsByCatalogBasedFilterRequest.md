# openapi::CatalogsHotelListProductsByCatalogBasedFilterRequest

Request object to list products for a given hotel catalog_id and product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog id pertaining to the hotel product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 


