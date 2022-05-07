# OauthController

All URIs are relative to `"/v5"`

The controller class is defined in **[OauthController.java](../../src/main/java/org/openapitools/controller/OauthController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](#oauthToken) | **POST** /oauth/token | Generate OAuth access token

<a name="oauthToken"></a>
# **oauthToken**
```java
Mono<OauthAccessTokenResponse> OauthController.oauthToken(grantType)
```

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**grantType** | `String` |  | [enum: `authorization_code`, `refresh_token`]

### Return type
[**OauthAccessTokenResponse**](../../docs/models/OauthAccessTokenResponse.md)


### HTTP request headers
 - **Accepts Content-Type**: `application/x-www-form-urlencoded`
 - **Produces Content-Type**: `application/json`

