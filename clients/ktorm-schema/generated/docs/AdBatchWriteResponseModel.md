
# Table `AdBatchWriteResponseModel`
(mapped from: AdBatchWriteResponseModel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdBatchItem&gt;**](AdBatchItem.md) |  | 


# **Table `AdBatchWriteResponseModelAdBatchItem`**
(mapped from: AdBatchWriteResponseModelAdBatchItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adBatchWriteResponseModel | adBatchWriteResponseModel | long | | kotlin.Long | Primary Key | *one*
adBatchItem | adBatchItem | long | | kotlin.Long | Foreign Key | *many*



