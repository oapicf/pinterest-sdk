# Org.OpenAPITools.Model.OauthAccessTokenRequestRefresh
A request to exchange a refresh token for a new access token.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GrantType** | **string** |  | 
**RefreshToken** | **string** |  | 
**Scope** | **string** |  | [optional] 
**RefreshOn** | **bool** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
