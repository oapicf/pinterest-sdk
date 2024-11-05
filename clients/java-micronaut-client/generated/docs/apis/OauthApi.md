# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token |


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

<a id="oauthToken"></a>
# **oauthToken**
```java
Mono<OauthAccessTokenResponse> OauthApi.oauthToken(grantType)
```

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication-and-scopes/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  &lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | `String`|  | [enum: `authorization_code`, `refresh_token`, `client_credentials`] |


### Return type
[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization
* **[basic](auth.md#basic)**

### HTTP request headers
 - **Content-Type**: `application/x-www-form-urlencoded`
 - **Accept**: `application/json`

