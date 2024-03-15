# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderLinesGet**](OrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**orderLinesList**](OrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines



## orderLinesGet

> OrderLine orderLinesGet(adAccountId, orderLineId)

Get order line

Get a specific existing order line associated with an ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLinesApi;

OrderLinesApi apiInstance = new OrderLinesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String orderLineId = null; // String | Unique identifier of an order line.
try {
    OrderLine result = apiInstance.orderLinesGet(adAccountId, orderLineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLinesApi#orderLinesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **orderLineId** | **String**| Unique identifier of an order line. | [default to null]

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderLinesList

> OrderLinesList200Response orderLinesList(adAccountId, pageSize, order, bookmark)

Get order lines

List existing order lines associated with an ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLinesApi;

OrderLinesApi apiInstance = new OrderLinesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String order = ASCENDING; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    OrderLinesList200Response result = apiInstance.orderLinesList(adAccountId, pageSize, order, bookmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLinesApi#orderLinesList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**OrderLinesList200Response**](OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

