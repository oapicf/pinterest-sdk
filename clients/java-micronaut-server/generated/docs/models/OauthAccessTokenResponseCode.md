

# OauthAccessTokenResponseCode

A successful OAuth access token response for the authorization code flow.

The class is defined in **[OauthAccessTokenResponseCode.java](../../src/main/java/org/openapitools/model/OauthAccessTokenResponseCode.java)**

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

## ResponseTypeEnum

Name | Value
---- | -----
AUTHORIZATION_CODE | `"authorization_code"`
REFRESH_TOKEN | `"refresh_token"`
CLIENT_CREDENTIALS | `"client_credentials"`








