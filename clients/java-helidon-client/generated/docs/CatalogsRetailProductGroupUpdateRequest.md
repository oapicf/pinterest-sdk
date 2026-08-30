

# CatalogsRetailProductGroupUpdateRequest

Request object for updating a retail product group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  [optional] |
|**country** | **Country** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [optional] |
|**locale** | **CatalogsLocale** |  |  [optional] |
|**name** | **String** | Name of catalog product group |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



