

# CreateAssetAccessRequestResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**Seq&lt;AssetAccessRequestError&gt;**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. |  [optional]
**invites** | **Map&lt;String, String&gt;** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. |  [optional]



