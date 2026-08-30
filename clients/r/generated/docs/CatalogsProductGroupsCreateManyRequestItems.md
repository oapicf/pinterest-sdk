# openapi::CatalogsProductGroupsCreateManyRequestItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **character** |  | [optional] 
**feed_id** | **character** | Catalog Feed id pertaining to the catalog product group. | [Pattern: ^\\d+$] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **character** |  | 
**catalog_id** | **character** | Catalog ID pertaining to the product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**country** | [**Country**](Country.md) |  | [optional] [Enum: ] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [Enum: ] 


