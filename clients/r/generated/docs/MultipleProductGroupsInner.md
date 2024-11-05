# openapi::MultipleProductGroupsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] [default to FALSE] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**feed_id** | **character** | Catalog Feed id pertaining to the catalog product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


