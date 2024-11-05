
# CatalogsVerticalBatchRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **catalogType** | [**inline**](#CatalogType) |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  |  |
| **items** | [**kotlin.collections.List&lt;CatalogsCreativeAssetsBatchItem&gt;**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations |  |
| **catalogId** | **kotlin.String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional] |


<a id="CatalogType"></a>
## Enum: catalog_type
| Name | Value |
| ---- | ----- |
| catalogType | CREATIVE_ASSETS |



