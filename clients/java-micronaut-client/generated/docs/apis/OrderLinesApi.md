# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderLinesGet**](OrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
| [**orderLinesList**](OrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines |


## Creating OrderLinesApi

To initiate an instance of `OrderLinesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.OrderLinesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(OrderLinesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    OrderLinesApi orderLinesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="orderLinesGet"></a>
# **orderLinesGet**
```java
Mono<OrderLine> OrderLinesApi.orderLinesGet(adAccountIdorderLineId)
```

Get order line

Get a specific existing order line associated with an ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **orderLineId** | `String`| Unique identifier of an order line. | |


### Return type
[**OrderLine**](OrderLine.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="orderLinesList"></a>
# **orderLinesList**
```java
Mono<OrderLinesList200Response> OrderLinesApi.orderLinesList(adAccountIdpageSizeorderbookmark)
```

Get order lines

List existing order lines associated with an ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**OrderLinesList200Response**](OrderLinesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

