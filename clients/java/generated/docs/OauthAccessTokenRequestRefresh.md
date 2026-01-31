

# OauthAccessTokenRequestRefresh


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refreshToken** | **String** |  |  |
|**scope** | **String** |  |  [optional] |
|**refreshOn** | **Boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. |  [optional] |
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) |  |  |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



