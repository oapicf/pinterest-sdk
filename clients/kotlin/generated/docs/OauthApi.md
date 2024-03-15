# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


<a id="oauthToken"></a>
# **oauthToken**
> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **kotlin.String**|  | [enum: authorization_code, refresh_token]

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization


Configure basic:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

