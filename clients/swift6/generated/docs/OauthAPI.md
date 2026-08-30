# OauthAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthConversionToken**](OauthAPI.md#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauthToken**](OauthAPI.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
[**tokenRevoke**](OauthAPI.md#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token


# **oauthConversionToken**
```swift
    open class func oauthConversionToken(completion: @escaping (_ data: ConversionAccessToken?, _ error: Error?) -> Void)
```

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Generate OAuth access token for conversion API
OauthAPI.oauthConversionToken() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauthToken**
```swift
    open class func oauthToken(grantType: TokenGrantType, code: String? = nil, continuousRefresh: String? = nil, redirectUri: String? = nil, refreshToken: String? = nil, scope: String? = nil, completion: @escaping (_ data: OauthAccessToken?, _ error: Error?) -> Void)
```

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let grantType = TokenGrantType() // TokenGrantType | 
let code = "code_example" // String |  (optional)
let continuousRefresh = "continuousRefresh_example" // String |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
let redirectUri = "redirectUri_example" // String |  (optional)
let refreshToken = "refreshToken_example" // String |  (optional)
let scope = "scope_example" // String |  (optional)

// Generate OAuth access token
OauthAPI.oauthToken(grantType: grantType, code: code, continuousRefresh: continuousRefresh, redirectUri: redirectUri, refreshToken: refreshToken, scope: scope) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**TokenGrantType**](TokenGrantType.md) |  | 
 **code** | **String** |  | [optional] 
 **continuousRefresh** | **String** |   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] 
 **redirectUri** | **String** |  | [optional] 
 **refreshToken** | **String** |  | [optional] 
 **scope** | **String** |  | [optional] 

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tokenRevoke**
```swift
    open class func tokenRevoke(token: String, tokenTypeHint: TokenTypeHint? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let token = "token_example" // String | The token to revoke.
let tokenTypeHint = TokenTypeHint() // TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)

// Revoke a token
OauthAPI.tokenRevoke(token: token, tokenTypeHint: tokenTypeHint) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String** | The token to revoke. | 
 **tokenTypeHint** | [**TokenTypeHint**](TokenTypeHint.md) | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

Void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

