# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token



## oauthToken

> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.OauthApi;

OauthApi apiInstance = new OauthApi();
String grantType = null; // String | 
try {
    OauthAccessTokenResponse result = apiInstance.oauthToken(grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#oauthToken");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  | [default to null] [enum: authorization_code, refresh_token]

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

