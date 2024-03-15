# openapi::CatalogsProductGroupsCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] [default to FALSE] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**feed_id** | **character** | Catalog Feed id pertaining to the catalog product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**catalog_id** | **character** | Catalog id pertaining to the hotel product group. | [Pattern: ^\\d+$] 


