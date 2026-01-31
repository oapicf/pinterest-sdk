# openapi::CatalogsVerticalProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**country** | **character** |  | [optional] 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**description** | **character** |  | [optional] 
**feed_id** | **character** | id of the catalogs feed belonging to this catalog product group | [Pattern: ^\\d+$] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**id** | **character** | ID of the creative assets product group. | [Pattern: ^\\d+$] 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] 
**locale** | **character** |  | [optional] 
**name** | **character** | Name of creative assets product group | [optional] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] [Enum: ] 
**type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | [Enum: ] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 


