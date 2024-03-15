# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderLines/get**](OrderLinesApi.md#orderLines/get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
| [**orderLines/list**](OrderLinesApi.md#orderLines/list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines |


<a name="orderLines/get"></a>
# **orderLines/get**
> OrderLine orderLines/get(ad\_account\_id, order\_line\_id)

Get order line

    Get a specific existing order line associated with an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **order\_line\_id** | **String**| Unique identifier of an order line. | [default to null] |

### Return type

[**OrderLine**](../Models/OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="orderLines/list"></a>
# **orderLines/list**
> order_lines_list_200_response orderLines/list(ad\_account\_id, page\_size, order, bookmark)

Get order lines

    List existing order lines associated with an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**order_lines_list_200_response**](../Models/order_lines_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

