
# Table `CatalogsCreativeAssetsBatchRequest`
(mapped from: CatalogsCreativeAssetsBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsCreativeAssetsBatchItem&gt;**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]





# **Table `CatalogsCreativeAssetsBatchRequestCatalogsCreativeAssetsBatchItem`**
(mapped from: CatalogsCreativeAssetsBatchRequestCatalogsCreativeAssetsBatchItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsBatchRequest | catalogsCreativeAssetsBatchRequest | long | | kotlin.Long | Primary Key | *one*
catalogsCreativeAssetsBatchItem | catalogsCreativeAssetsBatchItem | long | | kotlin.Long | Foreign Key | *many*




