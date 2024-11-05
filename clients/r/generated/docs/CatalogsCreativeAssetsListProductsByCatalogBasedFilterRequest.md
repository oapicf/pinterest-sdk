# openapi::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

Request object to list products for a given creative assets catalog_id and product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 


