# openapi::CatalogsVerticalProductGroupCreateRequest

Request object for creating a hotel product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**catalog_id** | **character** | Catalog id pertaining to the hotel product group. | [Pattern: ^\\d+$] 


