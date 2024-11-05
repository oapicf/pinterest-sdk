# openapi::CatalogsRetailListProductsByCatalogBasedFilterRequest

Request object to list products for a given retail catalog_id and product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [Enum: [RETAIL]] 
**catalog_id** | **character** | Catalog id pertaining to the retail product group. | [Pattern: ^\\d+$] 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


