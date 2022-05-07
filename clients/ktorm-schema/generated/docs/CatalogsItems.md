
# Table `CatalogsItems`
(mapped from: CatalogsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemBatchRecord&gt;**](ItemBatchRecord.md) | Array with catalogs items |  [optional]


# **Table `CatalogsItemsItemBatchRecord`**
(mapped from: CatalogsItemsItemBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItems | catalogsItems | long | | kotlin.Long | Primary Key | *one*
itemBatchRecord | itemBatchRecord | long | | kotlin.Long | Foreign Key | *many*



