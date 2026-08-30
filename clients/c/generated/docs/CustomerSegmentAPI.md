# CustomerSegmentAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerSegmentAPI_customerSegmentCreate**](CustomerSegmentAPI.md#CustomerSegmentAPI_customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**CustomerSegmentAPI_customerSegmentList**](CustomerSegmentAPI.md#CustomerSegmentAPI_customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**CustomerSegmentAPI_customerSegmentUpdate**](CustomerSegmentAPI.md#CustomerSegmentAPI_customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **CustomerSegmentAPI_customerSegmentCreate**
```c
// Create customer segments
//
// Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
//
customer_segment_t* CustomerSegmentAPI_customerSegmentCreate(apiClient_t *apiClient, char *ad_account_id, customer_segment_create_t *customer_segment_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**customer_segment_create** | **[customer_segment_create_t](customer_segment_create.md) \*** |  | 

### Return type

[customer_segment_t](customer_segment.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomerSegmentAPI_customerSegmentList**
```c
// List customer segments
//
// Get a list of the customer segments in the specified `ad_account_id`.
//
customer_segment_list_200_response_t* CustomerSegmentAPI_customerSegmentList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, int *include_sizing, char *search_query);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**include_sizing** | **int \*** | Include audience sizing in result or not | [optional] [default to false]
**search_query** | **char \*** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[customer_segment_list_200_response_t](customer_segment_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomerSegmentAPI_customerSegmentUpdate**
```c
// Update customer segments
//
// Update the customer segment given advertiser ID and customer segment ID
//
void CustomerSegmentAPI_customerSegmentUpdate(apiClient_t *apiClient, char *ad_account_id, customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**customer_segment_update_request_update_with_required_body** | **[customer_segment_update_request_update_with_required_body_t](customer_segment_update_request_update_with_required_body.md) \*** |  | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

