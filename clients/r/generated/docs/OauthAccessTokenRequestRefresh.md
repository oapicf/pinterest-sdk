# openapi::OauthAccessTokenRequestRefresh

A request to exchange a refresh token for a new access token.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grant_type** | **character** |  | [Enum: [authorization_code, refresh_token, client_credentials]] 
**refresh_token** | **character** |  | 
**scope** | **character** |  | [optional] 
**refresh_on** | **character** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] 


