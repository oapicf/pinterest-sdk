

# OauthAccessTokenResponseEverlastingRefresh

A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) |  |  [optional] |
|**accessToken** | **String** |  |  |
|**tokenType** | **String** |  |  |
|**expiresIn** | **Integer** |  |  |
|**scope** | **String** |  |  |
|**refreshToken** | **String** |  |  |
|**refreshTokenExpiresIn** | **Integer** |  |  |
|**refreshTokenExpiresAt** | **Integer** |  |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



