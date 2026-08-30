# openapi::CatalogsHotelProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog ID pertaining to the product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**id** | **character** | ID of the catalog product group. | [Pattern: ^\\d+$] 
**name** | **character** | Name of catalog product group | [optional] 
**type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | [Enum: ] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 


