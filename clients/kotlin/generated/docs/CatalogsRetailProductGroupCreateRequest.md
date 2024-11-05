
# CatalogsRetailProductGroupCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **catalogType** | [**inline**](#CatalogType) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
| **name** | **kotlin.String** |  |  |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
| **catalogId** | **kotlin.String** | Catalog id pertaining to the retail product group. |  |
| **country** | [**Country**](Country.md) |  |  |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  |  |
| **description** | **kotlin.String** |  |  [optional] |


<a id="CatalogType"></a>
## Enum: catalog_type
| Name | Value |
| ---- | ----- |
| catalogType | RETAIL |



