

# OauthAccessTokenResponse

A successful OAuth access token response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) |  |  [optional] |
|**accessToken** | **String** |  |  |
|**tokenType** | **String** |  |  |
|**expiresIn** | **Integer** |  |  |
|**scope** | **String** |  |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



