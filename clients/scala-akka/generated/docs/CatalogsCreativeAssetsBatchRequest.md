

# CatalogsCreativeAssetsBatchRequest

Request object to update catalogs creative assets items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**country** | **Country** |  | 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**items** | [**Seq&lt;CatalogsCreativeAssetsBatchItem&gt;**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**catalogId** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]


## Enum: CatalogType
Allowed values: [CREATIVE_ASSETS]




