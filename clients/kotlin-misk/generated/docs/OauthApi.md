# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthConversionToken**](OauthApi.md#oauthConversionToken) | **Post** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauthToken**](OauthApi.md#oauthToken) | **Post** /oauth/token | Generate OAuth access token
[**tokenRevoke**](OauthApi.md#tokenRevoke) | **Post** /oauth/token/revoke | Revoke a token


<a name="oauthConversionToken"></a>
# **oauthConversionToken**
> ConversionAccessToken oauthConversionToken()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = OauthApi()
try {
    val result : ConversionAccessToken = apiInstance.oauthConversionToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OauthApi#oauthConversionToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthApi#oauthConversionToken")
    e.printStackTrace()
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
 - **Accept**: APPLICATION_JSON

<a name="oauthToken"></a>
# **oauthToken**
> OauthAccessToken oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = OauthApi()
val grantType : TokenGrantType =  // TokenGrantType | 
val code : kotlin.String = code_example // kotlin.String | 
val continuousRefresh : kotlin.String = continuousRefresh_example // kotlin.String |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | 
val refreshToken : kotlin.String = refreshToken_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
try {
    val result : OauthAccessToken = apiInstance.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OauthApi#oauthToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthApi#oauthToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**TokenGrantType**](TokenGrantType.md)|  | [enum: authorization_code, refresh_token, client_credentials]
 **code** | **kotlin.String**|  | [optional]
 **continuousRefresh** | **kotlin.String**|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional]
 **redirectUri** | **kotlin.String**|  | [optional]
 **refreshToken** | **kotlin.String**|  | [optional]
 **scope** | **kotlin.String**|  | [optional]

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: APPLICATION_FORM_URLENCODED
 - **Accept**: APPLICATION_JSON

<a name="tokenRevoke"></a>
# **tokenRevoke**
> tokenRevoke(token, tokenTypeHint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = OauthApi()
val token : kotlin.String = token_example // kotlin.String | The token to revoke.
val tokenTypeHint : TokenTypeHint =  // TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
try {
    apiInstance.tokenRevoke(token, tokenTypeHint)
} catch (e: ClientException) {
    println("4xx response calling OauthApi#tokenRevoke")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthApi#tokenRevoke")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The token to revoke. |
 **tokenTypeHint** | [**TokenTypeHint**](TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] [enum: access_token, refresh_token]

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: APPLICATION_FORM_URLENCODED
 - **Accept**: APPLICATION_JSON

