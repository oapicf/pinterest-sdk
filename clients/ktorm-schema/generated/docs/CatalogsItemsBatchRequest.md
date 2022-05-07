
# Table `CatalogsItemsBatchRequest`
(mapped from: CatalogsItemsBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**language** | language | long |  | [**Language**](Language.md) |  |  [optional] [foreignkey]
**operation** | operation | long |  | [**BatchOperation**](BatchOperation.md) |  |  [optional] [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemBatchRecord&gt;**](ItemBatchRecord.md) | Array with catalogs items |  [optional]





# **Table `CatalogsItemsBatchRequestItemBatchRecord`**
(mapped from: CatalogsItemsBatchRequestItemBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsBatchRequest | catalogsItemsBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemBatchRecord | itemBatchRecord | long | | kotlin.Long | Foreign Key | *many*



