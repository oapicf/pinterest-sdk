# openapi::CatalogsVerticalProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**id** | **character** | ID of the creative assets product group. | [Pattern: ^\\d+$] 
**name** | **character** | Name of creative assets product group | [optional] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] [Enum: ] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] [Enum: ] 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**feed_id** | **character** | id of the catalogs feed belonging to this catalog product group | [Pattern: ^\\d+$] 
**country** | **character** |  | [optional] 
**locale** | **character** |  | [optional] 


