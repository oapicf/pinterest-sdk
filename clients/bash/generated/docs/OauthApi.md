# OauthApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token



## oauthToken

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.

See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example

```bash
 oauthToken
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **string** |  | [default to null]

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

