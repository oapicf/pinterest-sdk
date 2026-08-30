# OauthAccessToken

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **String** |  | [readonly]
**expires_in** | **i32** |  | [readonly]
**refresh_token** | Option<**String**> |  | [optional]
**refresh_token_expires_at** | Option<**i32**> |  | [optional][readonly]
**refresh_token_expires_in** | Option<**i32**> |  | [optional][readonly]
**response_type** | Option<[**models::TokenGrantType**](TokenGrantType.md)> |  | [optional][readonly]
**scope** | Option<**String**> |  | [optional]
**token_type** | **String** |  | [readonly][default to bearer]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


