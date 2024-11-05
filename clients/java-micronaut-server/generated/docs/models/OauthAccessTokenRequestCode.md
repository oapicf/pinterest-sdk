

# OauthAccessTokenRequestCode

A request to exchange an authorization code for an access token.

The class is defined in **[OauthAccessTokenRequestCode.java](../../src/main/java/org/openapitools/model/OauthAccessTokenRequestCode.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) |  | 
**code** | `String` |  | 
**redirectUri** | `String` |  | 

## GrantTypeEnum

Name | Value
---- | -----
AUTHORIZATION_CODE | `"authorization_code"`
REFRESH_TOKEN | `"refresh_token"`
CLIENT_CREDENTIALS | `"client_credentials"`




