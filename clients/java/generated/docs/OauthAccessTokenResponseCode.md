

# OauthAccessTokenResponseCode


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refreshToken** | **String** |  |  [optional] |
|**refreshTokenExpiresAt** | **Integer** |  |  [optional] |
|**refreshTokenExpiresIn** | **Integer** |  |  [optional] |
|**accessToken** | **String** |  |  |
|**expiresIn** | **Integer** |  |  |
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) |  |  [optional] |
|**scope** | **String** |  |  |
|**tokenType** | **String** |  |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



