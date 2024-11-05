# openapi::OauthAccessTokenResponseEverlastingRefresh

A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_type** | **character** |  | [optional] [Enum: [authorization_code, refresh_token, client_credentials]] 
**access_token** | **character** |  | 
**token_type** | **character** |  | [default to &quot;bearer&quot;] 
**expires_in** | **integer** |  | 
**scope** | **character** |  | 
**refresh_token** | **character** |  | 
**refresh_token_expires_in** | **integer** |  | 
**refresh_token_expires_at** | **integer** |  | 


