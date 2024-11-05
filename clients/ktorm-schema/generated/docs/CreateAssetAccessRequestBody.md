
# Table `CreateAssetAccessRequestBody`
(mapped from: CreateAssetAccessRequestBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetRequests** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateAssetAccessRequestBodyAssetRequestsInner&gt;**](CreateAssetAccessRequestBodyAssetRequestsInner.md) |  | 


# **Table `CreateAssetAccessRequestBodyCreateAssetAccessRequestBodyAssetRequestsInner`**
(mapped from: CreateAssetAccessRequestBodyCreateAssetAccessRequestBodyAssetRequestsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetAccessRequestBody | createAssetAccessRequestBody | long | | kotlin.Long | Primary Key | *one*
createAssetAccessRequestBodyAssetRequestsInner | createAssetAccessRequestBodyAssetRequestsInner | long | | kotlin.Long | Foreign Key | *many*



