# Org.OpenAPITools.Model.OauthAccessToken
Describes the valid schema for possible OAuth access token requests.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **string** |  | [readonly] 
**ExpiresIn** | **int** |  | [readonly] 
**RefreshToken** | **string** |  | [optional] 
**RefreshTokenExpiresAt** | **int** |  | [optional] [readonly] 
**RefreshTokenExpiresIn** | **int** |  | [optional] [readonly] 
**ResponseType** | **TokenGrantType** |  | [optional] [readonly] 
**Scope** | **string** |  | [optional] 
**TokenType** | **string** |  | [readonly] [default to "bearer"]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

