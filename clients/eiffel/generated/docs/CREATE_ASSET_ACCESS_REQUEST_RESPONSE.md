# CREATE_ASSET_ACCESS_REQUEST_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**LIST [ASSET_ACCESS_REQUEST_ERROR]**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] [default to null]
**invites** | [**STRING_TABLE [STRING_32]**](STRING_32.md) | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


