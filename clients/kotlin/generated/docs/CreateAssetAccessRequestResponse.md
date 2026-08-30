
# CreateAssetAccessRequestResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exceptions** | [**kotlin.collections.List&lt;AssetAccessRequestError&gt;**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. |  [optional] |
| **invites** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. |  [optional] |



