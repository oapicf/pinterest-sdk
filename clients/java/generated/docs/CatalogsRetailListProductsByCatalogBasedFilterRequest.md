

# CatalogsRetailListProductsByCatalogBasedFilterRequest

Request object to list products for a given retail catalog_id and product group filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
|**catalogId** | **String** | Catalog id pertaining to the retail product group. |  |
|**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
|**country** | **Country** |  |  |
|**locale** | **CatalogsLocale** |  |  |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



