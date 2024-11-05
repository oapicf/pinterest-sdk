

# OauthAccessTokenResponseEverlastingRefresh

A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.

The class is defined in **[OauthAccessTokenResponseEverlastingRefresh.java](../../src/main/java/org/openapitools/model/OauthAccessTokenResponseEverlastingRefresh.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) |  |  [optional property]
**accessToken** | `String` |  | 
**tokenType** | `String` |  | 
**expiresIn** | `Integer` |  | 
**scope** | `String` |  | 
**refreshToken** | `String` |  | 
**refreshTokenExpiresIn** | `Integer` |  | 
**refreshTokenExpiresAt** | `Integer` |  | 

## ResponseTypeEnum

Name | Value
---- | -----
AUTHORIZATION_CODE | `"authorization_code"`
REFRESH_TOKEN | `"refresh_token"`
CLIENT_CREDENTIALS | `"client_credentials"`









