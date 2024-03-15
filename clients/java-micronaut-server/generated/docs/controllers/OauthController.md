# OauthController

All URIs are relative to `"/v5"`

The controller class is defined in **[OauthController.java](../../src/main/java/org/openapitools/controller/OauthController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](#oauthToken) | **POST** /oauth/token | Generate OAuth access token

<a id="oauthToken"></a>
# **oauthToken**
```java
Mono<OauthAccessTokenResponse> OauthController.oauthToken(grantType)
```

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**grantType** | `String` |  | [enum: `authorization_code`, `refresh_token`]

### Return type
[**OauthAccessTokenResponse**](../../docs/models/OauthAccessTokenResponse.md)

### Authorization
* **basic**

### HTTP request headers
 - **Accepts Content-Type**: `application/x-www-form-urlencoded`
 - **Produces Content-Type**: `application/json`

