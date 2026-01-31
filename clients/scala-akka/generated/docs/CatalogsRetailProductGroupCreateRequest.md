

# CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **String** | Catalog id pertaining to the retail product group. | 
**catalogType** | [**CatalogType**](#CatalogType) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**country** | **Country** |  |  [optional]
**description** | **String** |  |  [optional]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**locale** | **CatalogsLocale** |  |  [optional]
**name** | **String** |  | 


## Enum: CatalogType
Allowed values: [RETAIL]




