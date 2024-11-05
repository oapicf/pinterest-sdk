# PinterestSdk.OauthAccessTokenRequestRefresh

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grantType** | **String** |  | 
**refreshToken** | **String** |  | 
**scope** | **String** |  | [optional] 
**refreshOn** | **Boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] 



## Enum: GrantTypeEnum


* `authorization_code` (value: `"authorization_code"`)

* `refresh_token` (value: `"refresh_token"`)

* `client_credentials` (value: `"client_credentials"`)




