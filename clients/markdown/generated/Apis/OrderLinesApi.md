# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderLines/get**](OrderLinesApi.md#orderLines/get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
| [**orderLines/list**](OrderLinesApi.md#orderLines/list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines. |


<a name="orderLines/get"></a>
# **orderLines/get**
> OrderLine orderLines/get(order\_line\_id, ad\_account\_id)

Get order line

    Get a specific existing order line associated with an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **order\_line\_id** | **String**| Order line ID. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**OrderLine**](../Models/OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="orderLines/list"></a>
# **orderLines/list**
> order_lines_list_200_response orderLines/list(ad\_account\_id, bookmark, page\_size, order)

Get order lines.

    List existing order lines associated with an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |

### Return type

[**order_lines_list_200_response**](../Models/order_lines_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

