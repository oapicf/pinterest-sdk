# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_lines_get**](OrderLinesApi.md#order_lines_get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**order_lines_list**](OrderLinesApi.md#order_lines_list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.


# **order_lines_get**
> `order_lines_get`(req::`HTTP.Request`, `order_line_id`::`String`, `ad_account_id`::`String`;) -> `OrderLine`

Get order line

Get a specific existing order line associated with an ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`order_line_id`** | **`String`**| Order line ID. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`OrderLine`**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_lines_list**
> `order_lines_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing,) -> `OrderLinesList200Response`

Get order lines.

List existing order lines associated with an ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]

### Return type

[**`OrderLinesList200Response`**](OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

