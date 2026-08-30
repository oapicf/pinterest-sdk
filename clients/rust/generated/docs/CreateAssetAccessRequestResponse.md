# CreateAssetAccessRequestResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | Option<[**Vec<models::AssetAccessRequestError>**](AssetAccessRequestError.md)> | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional]
**invites** | Option<**std::collections::HashMap<String, String>**> | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


