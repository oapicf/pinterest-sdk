

# CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
|**catalogId** | **String** | Catalog id pertaining to the retail product group. |  |
|**country** | **Country** |  |  |
|**locale** | **CatalogsLocale** |  |  |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



