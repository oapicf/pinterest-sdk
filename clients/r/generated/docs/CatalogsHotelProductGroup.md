# openapi::CatalogsHotelProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**id** | **character** | ID of the hotel product group. | [Pattern: ^\\d+$] 
**name** | **character** | Name of hotel product group | [optional] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**catalog_id** | **character** | Catalog id pertaining to the hotel product group. | [Pattern: ^\\d+$] 


