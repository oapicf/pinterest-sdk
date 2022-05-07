# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


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

<a name="oauthToken"></a>
# **oauthToken**
```java
Mono<OauthAccessTokenResponse> OauthApi.oauthToken(grantType)
```

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | `String`|  | [enum: `authorization_code`, `refresh_token`]


### Return type
[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)



### HTTP request headers
 - **Content-Type**: `application/x-www-form-urlencoded`
 - **Accept**: `application/json`

