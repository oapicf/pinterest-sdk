

# CatalogsVerticalBatchRequest

A request object that can have multiple operations on a single batch

The class is defined in **[CatalogsVerticalBatchRequest.java](../../src/main/java/org/openapitools/model/CatalogsVerticalBatchRequest.java)**

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






