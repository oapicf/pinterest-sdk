# openapi::CatalogsCreativeAssetsProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**id** | **character** | ID of the creative assets product group. | [Pattern: ^\\d+$] 
**name** | **character** | Name of creative assets product group | [optional] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 


