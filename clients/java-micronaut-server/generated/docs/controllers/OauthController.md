# OauthController

All URIs are relative to `"/v5"`

The controller class is defined in **[OauthController.java](../../src/main/java/org/openapitools/controller/OauthController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthConversionToken**](#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauthToken**](#oauthToken) | **POST** /oauth/token | Generate OAuth access token
[**tokenRevoke**](#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token

<a id="oauthConversionToken"></a>
# **oauthConversionToken**
```java
Mono<ConversionAccessTokenResponse> OauthController.oauthConversionToken()
```

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.


### Return type
[**ConversionAccessTokenResponse**](../../docs/models/ConversionAccessTokenResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="oauthToken"></a>
# **oauthToken**
```java
Mono<OauthAccessTokenResponse> OauthController.oauthToken(grantType)
```

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**grantType** | `String` |  | [enum: `authorization_code`, `refresh_token`, `client_credentials`]

### Return type
[**OauthAccessTokenResponse**](../../docs/models/OauthAccessTokenResponse.md)

### Authorization
* **basic**

### HTTP request headers
 - **Accepts Content-Type**: `application/x-www-form-urlencoded`
 - **Produces Content-Type**: `application/json`

<a id="tokenRevoke"></a>
# **tokenRevoke**
```java
Mono<Object> OauthController.tokenRevoke(tokentokenTypeHint)
```

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**token** | `String` | The token to revoke. |
**tokenTypeHint** | `String` | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional parameter] [enum: `access_token`, `refresh_token`]


### Authorization
* **basic**

### HTTP request headers
 - **Accepts Content-Type**: `application/x-www-form-urlencoded`
 - **Produces Content-Type**: `application/json`

