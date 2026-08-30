# OrderLinesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderLinesAPI_orderLinesGet**](OrderLinesAPI.md#OrderLinesAPI_orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**OrderLinesAPI_orderLinesList**](OrderLinesAPI.md#OrderLinesAPI_orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.


# **OrderLinesAPI_orderLinesGet**
```c
// Get order line
//
// Get a specific existing order line associated with an ad account.
//
order_line_t* OrderLinesAPI_orderLinesGet(apiClient_t *apiClient, char *order_line_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**order_line_id** | **char \*** | Order line ID. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[order_line_t](order_line.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderLinesAPI_orderLinesList**
```c
// Get order lines.
//
// List existing order lines associated with an ad account.
//
order_lines_list_200_response_t* OrderLinesAPI_orderLinesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[order_lines_list_200_response_t](order_lines_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

