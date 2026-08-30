
# Table `CatalogsItemsBatchPostRequest`
(mapped from: CatalogsItemsBatchPostRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**language** | language | text NOT NULL |  | [**language**](#Language) | We recommend using the CatalogsLocale values. | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]




# **Table `CatalogsItemsBatchPostRequestItemDeleteBatchRecord`**
(mapped from: CatalogsItemsBatchPostRequestItemDeleteBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsBatchPostRequest | catalogsItemsBatchPostRequest | long | | kotlin.Long | Primary Key | *one*
itemDeleteBatchRecord | itemDeleteBatchRecord | long | | kotlin.Long | Foreign Key | *many*






