# openapi::CatalogsVerticalProductGroupCreateRequest

Request object for creating a catalog based product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


