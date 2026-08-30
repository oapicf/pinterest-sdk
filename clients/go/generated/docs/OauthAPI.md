# \OauthAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthConversionToken**](OauthAPI.md#OauthConversionToken) | **Post** /oauth/conversion_token | Generate OAuth access token for conversion API
[**OauthToken**](OauthAPI.md#OauthToken) | **Post** /oauth/token | Generate OAuth access token
[**TokenRevoke**](OauthAPI.md#TokenRevoke) | **Post** /oauth/token/revoke | Revoke a token



## OauthConversionToken

> ConversionAccessToken OauthConversionToken(ctx).Execute()

Generate OAuth access token for conversion API



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OauthAPI.OauthConversionToken(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OauthAPI.OauthConversionToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OauthConversionToken`: ConversionAccessToken
	fmt.Fprintf(os.Stdout, "Response from `OauthAPI.OauthConversionToken`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiOauthConversionTokenRequest struct via the builder pattern


### Return type

[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OauthToken

> OauthAccessToken OauthToken(ctx).GrantType(grantType).Code(code).ContinuousRefresh(continuousRefresh).RedirectUri(redirectUri).RefreshToken(refreshToken).Scope(scope).Execute()

Generate OAuth access token



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	grantType := openapiclient.TokenGrantType("authorization_code") // TokenGrantType | 
	code := "code_example" // string |  (optional)
	continuousRefresh := "continuousRefresh_example" // string |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
	redirectUri := "redirectUri_example" // string |  (optional)
	refreshToken := "refreshToken_example" // string |  (optional)
	scope := "scope_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OauthAPI.OauthToken(context.Background()).GrantType(grantType).Code(code).ContinuousRefresh(continuousRefresh).RedirectUri(redirectUri).RefreshToken(refreshToken).Scope(scope).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OauthAPI.OauthToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OauthToken`: OauthAccessToken
	fmt.Fprintf(os.Stdout, "Response from `OauthAPI.OauthToken`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOauthTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**TokenGrantType**](TokenGrantType.md) |  | 
 **code** | **string** |  | 
 **continuousRefresh** | **string** |   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | 
 **redirectUri** | **string** |  | 
 **refreshToken** | **string** |  | 
 **scope** | **string** |  | 

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TokenRevoke

> TokenRevoke(ctx).Token(token).TokenTypeHint(tokenTypeHint).Execute()

Revoke a token



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	token := "token_example" // string | The token to revoke.
	tokenTypeHint := openapiclient.TokenTypeHint("access_token") // TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.OauthAPI.TokenRevoke(context.Background()).Token(token).TokenTypeHint(tokenTypeHint).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OauthAPI.TokenRevoke``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTokenRevokeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | The token to revoke. | 
 **tokenTypeHint** | [**TokenTypeHint**](TokenTypeHint.md) | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | 

### Return type

 (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

