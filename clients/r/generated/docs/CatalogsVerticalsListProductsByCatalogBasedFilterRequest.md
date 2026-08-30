# openapi::CatalogsVerticalsListProductsByCatalogBasedFilterRequest

Request object to list products for a given catalog_id and product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog ID pertaining to the product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


