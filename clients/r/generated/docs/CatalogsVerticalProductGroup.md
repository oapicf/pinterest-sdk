# openapi::CatalogsVerticalProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**id** | **character** | ID of the catalog product group. | [Pattern: ^\\d+$] 
**name** | **character** | Name of catalog product group | [optional] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**catalog_id** | **character** |  | [Pattern: ^\\d+$] 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] [Enum: ] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] [Enum: ] 
**feed_id** | **character** |  | [Enum: [null]] 


