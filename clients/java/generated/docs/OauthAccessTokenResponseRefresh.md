

# OauthAccessTokenResponseRefresh

A successful OAuth access token response for the refresh token flow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** |  |  |
|**expiresIn** | **Integer** |  |  |
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) |  |  [optional] |
|**scope** | **String** |  |  |
|**tokenType** | **String** |  |  |
|**refreshToken** | **String** |  |  |
|**refreshTokenExpiresAt** | **Integer** |  |  |
|**refreshTokenExpiresIn** | **Integer** |  |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



