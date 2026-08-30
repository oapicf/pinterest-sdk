# CreateAssetAccessRequestResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**\OpenAPI\Client\Model\AssetAccessRequestError[]**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional]
**invites** | **array<string,string>** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
