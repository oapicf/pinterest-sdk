# openapi::CatalogsProductGroupsList200ResponseAllOfItemsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | ID of the catalog product group. | [Pattern: ^\\d+$] 
**name** | **character** | Name of catalog product group | [optional] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] [Enum: ] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] [Enum: ] 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**feed_id** | **character** |  | [Enum: [null]] 
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**catalog_id** | **character** |  | [Pattern: ^\\d+$] 


