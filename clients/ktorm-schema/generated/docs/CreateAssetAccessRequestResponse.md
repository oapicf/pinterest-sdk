
# Table `CreateAssetAccessRequestResponse`
(mapped from: CreateAssetAccessRequestResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateAssetAccessRequestErrorMessageInner&gt;**](CreateAssetAccessRequestErrorMessageInner.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. |  [optional]
**invites** | invites | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional]


# **Table `CreateAssetAccessRequestResponseCreateAssetAccessRequestErrorMessageInner`**
(mapped from: CreateAssetAccessRequestResponseCreateAssetAccessRequestErrorMessageInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetAccessRequestResponse | createAssetAccessRequestResponse | long | | kotlin.Long | Primary Key | *one*
createAssetAccessRequestErrorMessageInner | createAssetAccessRequestErrorMessageInner | long | | kotlin.Long | Foreign Key | *many*




