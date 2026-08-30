
# Table `CreateAssetAccessRequestResponse`
(mapped from: CreateAssetAccessRequestResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetAccessRequestError&gt;**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. |  [optional]
**invites** | invites | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. |  [optional]


# **Table `CreateAssetAccessRequestResponseAssetAccessRequestError`**
(mapped from: CreateAssetAccessRequestResponseAssetAccessRequestError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetAccessRequestResponse | createAssetAccessRequestResponse | long | | kotlin.Long | Primary Key | *one*
assetAccessRequestError | assetAccessRequestError | long | | kotlin.Long | Foreign Key | *many*




