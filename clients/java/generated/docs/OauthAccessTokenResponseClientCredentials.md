

# OauthAccessTokenResponseClientCredentials

A successful OAuth client token response for the client token flow.

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



