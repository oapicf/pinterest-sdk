# openapi::OauthAccessToken

Describes the valid schema for possible OAuth access token requests.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **character** |  | [readonly] 
**expires_in** | **integer** |  | [readonly] 
**refresh_token** | **character** |  | [optional] 
**refresh_token_expires_at** | **integer** |  | [optional] [readonly] 
**refresh_token_expires_in** | **integer** |  | [optional] [readonly] 
**response_type** | [**TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] [Enum: ] 
**scope** | **character** |  | [optional] 
**token_type** | **character** |  | [readonly] [default to &quot;bearer&quot;] 


