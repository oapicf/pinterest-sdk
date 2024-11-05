

# OauthAccessTokenResponseIntegrationRefresh

A successful OAuth access token response for the refresh token flow, with an added refresh token.

The class is defined in **[OauthAccessTokenResponseIntegrationRefresh.java](../../src/main/java/org/openapitools/model/OauthAccessTokenResponseIntegrationRefresh.java)**

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








