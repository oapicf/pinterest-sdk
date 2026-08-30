

# CatalogsRetailListProductsByCatalogBasedFilterRequest

Request object to list products for a given retail catalog_id and product group filter.

The class is defined in **[CatalogsRetailListProductsByCatalogBasedFilterRequest.java](../../src/main/java/org/openapitools/model/CatalogsRetailListProductsByCatalogBasedFilterRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | `String` | Catalog ID pertaining to the product group. | 
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**country** | `Country` |  | 
**filters** | [`CatalogsProductGroupFilters`](CatalogsProductGroupFilters.md) |  | 
**locale** | `CatalogsLocale` |  | 


## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`





