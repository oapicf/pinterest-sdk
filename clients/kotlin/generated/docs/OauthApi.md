# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**oauthConversionToken**](OauthApi.md#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token |
| [**tokenRevoke**](OauthApi.md#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token |


<a id="oauthConversionToken"></a>
# **oauthConversionToken**
> ConversionAccessTokenResponse oauthConversionToken()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OauthApi()
try {
    val result : ConversionAccessTokenResponse = apiInstance.oauthConversionToken()
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

[**ConversionAccessTokenResponse**](ConversionAccessTokenResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="oauthToken"></a>
# **oauthToken**
> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OauthApi()
val grantType : kotlin.String = grantType_example // kotlin.String | 
try {
    val result : OauthAccessTokenResponse = apiInstance.oauthToken(grantType)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grantType** | **kotlin.String**|  | [enum: authorization_code, refresh_token, client_credentials] |

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization


Configure basic:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a id="tokenRevoke"></a>
# **tokenRevoke**
> tokenRevoke(token, tokenTypeHint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OauthApi()
val token : kotlin.String = token_example // kotlin.String | The token to revoke.
val tokenTypeHint : kotlin.String = tokenTypeHint_example // kotlin.String | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
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
| **token** | **kotlin.String**| The token to revoke. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tokenTypeHint** | **kotlin.String**| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] [enum: access_token, refresh_token] |

### Return type

null (empty response body)

### Authorization


Configure basic:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

