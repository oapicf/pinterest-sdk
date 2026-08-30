# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthConversionToken**](OauthApi.md#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
| [**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token |
| [**tokenRevoke**](OauthApi.md#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token |


## Creating OauthApi

To initiate an instance of `OauthApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.OauthApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(OauthApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    OauthApi oauthApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="oauthConversionToken"></a>
# **oauthConversionToken**
```java
Mono<ConversionAccessToken> OauthApi.oauthConversionToken()
```

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.



### Return type
[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="oauthToken"></a>
# **oauthToken**
```java
Mono<OauthAccessToken> OauthApi.oauthToken(grantTypecodecontinuousRefreshredirectUrirefreshTokenscope)
```

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | [**TokenGrantType**](TokenGrantType.md)|  | [enum: `authorization_code`, `refresh_token`, `client_credentials`] |
| **code** | `String`|  | [optional parameter] |
| **continuousRefresh** | `String`|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional parameter] |
| **redirectUri** | `String`|  | [optional parameter] |
| **refreshToken** | `String`|  | [optional parameter] |
| **scope** | `String`|  | [optional parameter] |


### Return type
[**OauthAccessToken**](OauthAccessToken.md)

### Authorization
* **[basic](auth.md#basic)**

### HTTP request headers
 - **Content-Type**: `application/x-www-form-urlencoded`
 - **Accept**: `application/json`

<a id="tokenRevoke"></a>
# **tokenRevoke**
```java
Mono<Void> OauthApi.tokenRevoke(tokentokenTypeHint)
```

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | `String`| The token to revoke. | |
| **tokenTypeHint** | [**TokenTypeHint**](TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional parameter] [enum: `access_token`, `refresh_token`] |




### Authorization
* **[basic](auth.md#basic)**

### HTTP request headers
 - **Content-Type**: `application/x-www-form-urlencoded`
 - **Accept**: `application/json`

