# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderLinesGet**](OrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**orderLinesList**](OrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.



## orderLinesGet

> OrderLine orderLinesGet(orderLineId, adAccountId)

Get order line

Get a specific existing order line associated with an ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLinesApi;

OrderLinesApi apiInstance = new OrderLinesApi();
String orderLineId = null; // String | Order line ID.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    OrderLine result = apiInstance.orderLinesGet(orderLineId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLinesApi#orderLinesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderLineId** | **String**| Order line ID. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderLinesList

> OrderLinesList200Response orderLinesList(adAccountId, bookmark, pageSize, order)

Get order lines.

List existing order lines associated with an ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLinesApi;

OrderLinesApi apiInstance = new OrderLinesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    OrderLinesList200Response result = apiInstance.orderLinesList(adAccountId, bookmark, pageSize, order);
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
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]

### Return type

[**OrderLinesList200Response**](OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

