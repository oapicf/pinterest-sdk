
# Table `CatalogsItemsBatchRequest`
(mapped from: CatalogsItemsBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**language** | language | text NOT NULL |  | [**language**](#Language) | We recommend using the CatalogsLocale values. | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 



# **Table `CatalogsItemsBatchRequestItemDeleteBatchRecord`**
(mapped from: CatalogsItemsBatchRequestItemDeleteBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsBatchRequest | catalogsItemsBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemDeleteBatchRecord | itemDeleteBatchRecord | long | | kotlin.Long | Foreign Key | *many*





