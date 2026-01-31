
# CatalogsRetailProductGroupCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **catalogId** | **kotlin.String** | Catalog id pertaining to the retail product group. |  |
| **catalogType** | [**inline**](#CatalogType) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **country** | [**Country**](Country.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  |  [optional] |


<a id="CatalogType"></a>
## Enum: catalog_type
| Name | Value |
| ---- | ----- |
| catalogType | RETAIL |



