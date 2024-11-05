

# CatalogsCreativeAssetsBatchRequest

Request object to update catalogs creative assets items

The class is defined in **[CatalogsCreativeAssetsBatchRequest.java](../../src/main/java/org/openapitools/model/CatalogsCreativeAssetsBatchRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**country** | `Country` |  | 
**language** | [`CatalogsItemsRequestLanguage`](CatalogsItemsRequestLanguage.md) |  | 
**items** | [`List&lt;CatalogsCreativeAssetsBatchItem&gt;`](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**catalogId** | `String` | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional property]

## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`






