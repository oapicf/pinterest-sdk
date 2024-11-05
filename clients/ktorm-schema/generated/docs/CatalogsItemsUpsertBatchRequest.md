
# Table `CatalogsItemsUpsertBatchRequest`
(mapped from: CatalogsItemsUpsertBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  |  [foreignkey]
**operation** | operation | long NOT NULL |  | [**BatchOperation**](BatchOperation.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemUpsertBatchRecord&gt;**](ItemUpsertBatchRecord.md) | Array with catalogs items | 





# **Table `CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord`**
(mapped from: CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsUpsertBatchRequest | catalogsItemsUpsertBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemUpsertBatchRecord | itemUpsertBatchRecord | long | | kotlin.Long | Foreign Key | *many*



