# OrderLinesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderLinesAPI_orderLinesGet**](OrderLinesAPI.md#OrderLinesAPI_orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**OrderLinesAPI_orderLinesList**](OrderLinesAPI.md#OrderLinesAPI_orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines


# **OrderLinesAPI_orderLinesGet**
```c
// Get order line
//
// Get a specific existing order line associated with an ad account.
//
order_line_t* OrderLinesAPI_orderLinesGet(apiClient_t *apiClient, char *ad_account_id, char *order_line_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**order_line_id** | **char \*** | Unique identifier of an order line. | 

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
// Get order lines
//
// List existing order lines associated with an ad account.
//
order_lines_list_200_response_t* OrderLinesAPI_orderLinesList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_orderLinesList_order_e order, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**order** | **pinterest_rest_api_orderLinesList_order_e** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[order_lines_list_200_response_t](order_lines_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

