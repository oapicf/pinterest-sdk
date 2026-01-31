

# OauthAccessTokenResponseRefresh

A successful OAuth access token response for the refresh token flow.

The class is defined in **[OauthAccessTokenResponseRefresh.java](../../src/main/java/org/openapitools/model/OauthAccessTokenResponseRefresh.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | `String` |  | 
**expiresIn** | `Integer` |  | 
**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) |  |  [optional property]
**scope** | `String` |  | 
**tokenType** | `String` |  | 
**refreshToken** | `String` |  | 
**refreshTokenExpiresAt** | `Integer` |  | 
**refreshTokenExpiresIn** | `Integer` |  | 



## ResponseTypeEnum

Name | Value
---- | -----
AUTHORIZATION_CODE | `"authorization_code"`
REFRESH_TOKEN | `"refresh_token"`
CLIENT_CREDENTIALS | `"client_credentials"`







