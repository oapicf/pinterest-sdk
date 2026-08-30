
# Table `CreateAssetAccessRequestBody`
(mapped from: CreateAssetAccessRequestBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetRequests** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateAssetAccessRequestItem&gt;**](CreateAssetAccessRequestItem.md) |  | 


# **Table `CreateAssetAccessRequestBodyCreateAssetAccessRequestItem`**
(mapped from: CreateAssetAccessRequestBodyCreateAssetAccessRequestItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetAccessRequestBody | createAssetAccessRequestBody | long | | kotlin.Long | Primary Key | *one*
createAssetAccessRequestItem | createAssetAccessRequestItem | long | | kotlin.Long | Foreign Key | *many*



