# openapi::CatalogsListProductsByFilterRequest

Request object to list products for a given product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **character** | Catalog Feed id pertaining to the catalog product group filter. | [Pattern: ^\\d+$] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets product group. | [Pattern: ^\\d+$] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


