
# Table `CatalogsItemsUpsertBatchRequest`
(mapped from: CatalogsItemsUpsertBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemUpsertBatchRecord&gt;**](ItemUpsertBatchRecord.md) | Array with catalogs items | 
**language** | language | text NOT NULL |  | [**language**](#Language) | We recommend using the CatalogsLocale values. | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 



# **Table `CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord`**
(mapped from: CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsUpsertBatchRequest | catalogsItemsUpsertBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemUpsertBatchRecord | itemUpsertBatchRecord | long | | kotlin.Long | Foreign Key | *many*





