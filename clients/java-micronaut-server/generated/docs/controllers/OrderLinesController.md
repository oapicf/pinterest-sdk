# OrderLinesController

All URIs are relative to `"/v5"`

The controller class is defined in **[OrderLinesController.java](../../src/main/java/org/openapitools/controller/OrderLinesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderLinesGet**](#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**orderLinesList**](#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines

<a id="orderLinesGet"></a>
# **orderLinesGet**
```java
Mono<OrderLine> OrderLinesController.orderLinesGet(adAccountIdorderLineId)
```

Get order line

Get a specific existing order line associated with an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**orderLineId** | `String` | Unique identifier of an order line. |

### Return type
[**OrderLine**](../../docs/models/OrderLine.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="orderLinesList"></a>
# **orderLinesList**
```java
Mono<OrderLinesList200Response> OrderLinesController.orderLinesList(adAccountIdpageSizeorderbookmark)
```

Get order lines

List existing order lines associated with an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**OrderLinesList200Response**](../../docs/models/OrderLinesList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

