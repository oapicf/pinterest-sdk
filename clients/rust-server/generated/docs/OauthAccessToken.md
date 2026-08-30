# OauthAccessToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **String** |  | [readonly] 
**expires_in** | **i32** |  | [readonly] 
**refresh_token** | **String** |  | [optional] [default to None]
**refresh_token_expires_at** | **i32** |  | [optional] [readonly] [default to None]
**refresh_token_expires_in** | **i32** |  | [optional] [readonly] [default to None]
**response_type** | [***models::TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] [default to None]
**scope** | **String** |  | [optional] [default to None]
**token_type** | **String** |  | [readonly] [default to "bearer".to_string()]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


