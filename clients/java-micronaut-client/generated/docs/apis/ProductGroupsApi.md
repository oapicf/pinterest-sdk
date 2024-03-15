# ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups |


## Creating ProductGroupsApi

To initiate an instance of `ProductGroupsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ProductGroupsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ProductGroupsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ProductGroupsApi productGroupsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="adAccountsCatalogsProductGroupsList"></a>
# **adAccountsCatalogsProductGroupsList**
```java
Mono<AdAccountsCatalogsProductGroupsList200Response> ProductGroupsApi.adAccountsCatalogsProductGroupsList(adAccountIdfeedProfileId)
```

Get catalog product groups

This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **feedProfileId** | `String`| The feed profile id whose catalog product groups we want to return. | [optional parameter] |


### Return type
[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

