
# OauthAccessTokenRequestRefresh

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **grantType** | [**inline**](#GrantType) |  |  |
| **refreshToken** | **kotlin.String** |  |  |
| **scope** | **kotlin.String** |  |  [optional] |
| **refreshOn** | **kotlin.Boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. |  [optional] |


<a id="GrantType"></a>
## Enum: grant_type
| Name | Value |
| ---- | ----- |
| grantType | authorization_code, refresh_token, client_credentials |



