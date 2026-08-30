# openapi::CatalogsRetailListProductsByCatalogBasedFilterRequest

Request object to list products for a given retail catalog_id and product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog ID pertaining to the product group. | [Pattern: ^\\d+$] 
**catalog_type** | **character** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [Enum: [RETAIL]] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


