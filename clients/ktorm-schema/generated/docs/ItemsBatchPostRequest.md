
# Table `items_batch_post_request`
(mapped from: ItemsBatchPostRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**operation** | operation | long NOT NULL |  | [**BatchOperation**](BatchOperation.md) |  |  [foreignkey]
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional]





# **Table `ItemsBatchPostRequestItemDeleteBatchRecord`**
(mapped from: ItemsBatchPostRequestItemDeleteBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemsBatchPostRequest | itemsBatchPostRequest | long | | kotlin.Long | Primary Key | *one*
itemDeleteBatchRecord | itemDeleteBatchRecord | long | | kotlin.Long | Foreign Key | *many*





