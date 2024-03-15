# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |


## Creating TermsOfServiceApi

To initiate an instance of `TermsOfServiceApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.TermsOfServiceApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(TermsOfServiceApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    TermsOfServiceApi termsOfServiceApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="termsOfServiceGet"></a>
# **termsOfServiceGet**
```java
Mono<TermsOfService> TermsOfServiceApi.termsOfServiceGet(adAccountIdincludeHtmltosType)
```

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **includeHtml** | `Boolean`| Return HTML in TOS text. | [optional parameter] [default to `false`] |
| **tosType** | `String`| Request type. | [optional parameter] |


### Return type
[**TermsOfService**](TermsOfService.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

