
# Table `CatalogsItemsUpdateBatchRequest`
(mapped from: CatalogsItemsUpdateBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemUpdateBatchRecord&gt;**](ItemUpdateBatchRecord.md) | Array with catalogs items | 
**language** | language | text NOT NULL |  | [**language**](#Language) | We recommend using the CatalogsLocale values. | 
**operation** | operation | long NOT NULL |  | [**BatchOperation**](BatchOperation.md) |  |  [foreignkey]



# **Table `CatalogsItemsUpdateBatchRequestItemUpdateBatchRecord`**
(mapped from: CatalogsItemsUpdateBatchRequestItemUpdateBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsUpdateBatchRequest | catalogsItemsUpdateBatchRequest | long | | kotlin.Long | Primary Key | *one*
itemUpdateBatchRecord | itemUpdateBatchRecord | long | | kotlin.Long | Foreign Key | *many*





