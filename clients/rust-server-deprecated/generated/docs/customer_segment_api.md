# customer_segment_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**customer_segment/create**](customer_segment_api.md#customer_segment/create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
**customer_segment/list**](customer_segment_api.md#customer_segment/list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
**customer_segment/update**](customer_segment_api.md#customer_segment/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customer_segment/create**
> models::CustomerSegment customer_segment/create(ctx, ad_account_id, customer_segment_create)
Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **customer_segment_create** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | 

### Return type

[**models::CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment/list**
> models::CustomerSegmentList200Response customer_segment/list(ctx, ad_account_id, optional)
List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **include_sizing** | **bool**| Include audience sizing in result or not | [default to false]
 **search_query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 

### Return type

[**models::CustomerSegmentList200Response**](customer_segment_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment/update**
> customer_segment/update(ctx, ad_account_id, customer_segment_update_request_update_with_required_body)
Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **customer_segment_update_request_update_with_required_body** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

