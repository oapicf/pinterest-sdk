# CreateAssetAccessRequestResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`exceptions`** | [**`Vector{AssetAccessRequestError}`**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] [default to nothing]
**`invites`** | **`Dict{String, String}`** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


