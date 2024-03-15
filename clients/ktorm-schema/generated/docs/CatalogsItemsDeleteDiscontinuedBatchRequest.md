
# Table `CatalogsItemsDeleteDiscontinuedBatchRequest`
(mapped from: CatalogsItemsDeleteDiscontinuedBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]
**operation** | operation | long NOT NULL |  | [**BatchOperation**](BatchOperation.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDeleteDiscontinuedBatchRecord&gt;**](ItemDeleteDiscontinuedBatchRecord.md) | Array with catalogs items | 





# **Table `CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord`**
(mapped from: CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsDeleteDiscontinuedBatchRequest | catalogsItemsDeleteDiscontinuedBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemDeleteDiscontinuedBatchRecord | itemDeleteDiscontinuedBatchRecord | long | | kotlin.Long | Foreign Key | *many*



