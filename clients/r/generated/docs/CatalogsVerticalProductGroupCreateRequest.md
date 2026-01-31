# openapi::CatalogsVerticalProductGroupCreateRequest

Request object for creating a catalog based product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**country** | [**Country**](Country.md) |  | [optional] [Enum: ] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [Enum: ] 
**name** | **character** |  | 


