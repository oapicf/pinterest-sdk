# WWW::OpenAPIClient::Object::OauthAccessToken

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OauthAccessToken;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **string** |  | [readonly] 
**expires_in** | **int** |  | [readonly] 
**refresh_token** | **string** |  | [optional] 
**refresh_token_expires_at** | **int** |  | [optional] [readonly] 
**refresh_token_expires_in** | **int** |  | [optional] [readonly] 
**response_type** | [**TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] 
**scope** | **string** |  | [optional] 
**token_type** | **string** |  | [readonly] [default to &#39;bearer&#39;]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


