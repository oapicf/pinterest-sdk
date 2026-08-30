
# Table `CatalogsItemsCreateBatchRequest`
(mapped from: CatalogsItemsCreateBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemCreateBatchRecord&gt;**](ItemCreateBatchRecord.md) | Array with catalogs items | 
**language** | language | text NOT NULL |  | [**language**](#Language) | We recommend using the CatalogsLocale values. | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 



# **Table `CatalogsItemsCreateBatchRequestItemCreateBatchRecord`**
(mapped from: CatalogsItemsCreateBatchRequestItemCreateBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsCreateBatchRequest | catalogsItemsCreateBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemCreateBatchRecord | itemCreateBatchRecord | long | | kotlin.Long | Foreign Key | *many*





