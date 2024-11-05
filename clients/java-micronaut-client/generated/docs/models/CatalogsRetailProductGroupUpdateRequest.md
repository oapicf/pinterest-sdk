

# CatalogsRetailProductGroupUpdateRequest

Request object for updating a retail product group.

The class is defined in **[CatalogsRetailProductGroupUpdateRequest.java](../../src/main/java/org/openapitools/model/CatalogsRetailProductGroupUpdateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  [optional property]
**name** | `String` |  |  [optional property]
**description** | `String` |  |  [optional property]
**filters** | [`CatalogsProductGroupFiltersRequest`](CatalogsProductGroupFiltersRequest.md) |  |  [optional property]
**country** | `Country` |  |  [optional property]
**locale** | `CatalogsLocale` |  |  [optional property]

## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`







