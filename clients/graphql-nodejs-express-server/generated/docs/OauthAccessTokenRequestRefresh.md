# OauthAccessTokenRequestRefresh

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grantType** | **String!** |  | [default to null]
**refreshToken** | **String!** |  | [default to null]
**scope** | **String!** |  | [optional] [default to null]
**refreshOn** | **Boolean!** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


