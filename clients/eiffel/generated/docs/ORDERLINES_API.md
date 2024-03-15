# ORDERLINES_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**order_lines_get**](ORDERLINES_API.md#order_lines_get) | **Get** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**order_lines_list**](ORDERLINES_API.md#order_lines_list) | **Get** /ad_accounts/{ad_account_id}/order_lines | Get order lines


# **order_lines_get**
> order_lines_get (ad_account_id: STRING_32 ; order_line_id: STRING_32 ): detachable ORDER_LINE


Get order line

Get a specific existing order line associated with an ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **order_line_id** | **STRING_32**| Unique identifier of an order line. | [default to null]

### Return type

[**ORDER_LINE**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_lines_list**
> order_lines_list (ad_account_id: STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable ORDER_LINES_LIST_200_RESPONSE


Get order lines

List existing order lines associated with an ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**ORDER_LINES_LIST_200_RESPONSE**](order_lines_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

