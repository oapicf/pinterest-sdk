# CUSTOMERSEGMENT_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**customer_segment_create**](CUSTOMERSEGMENT_API.md#customer_segment_create) | **Post** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customer_segment_list**](CUSTOMERSEGMENT_API.md#customer_segment_list) | **Get** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customer_segment_update**](CUSTOMERSEGMENT_API.md#customer_segment_update) | **Patch** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customer_segment_create**
> customer_segment_create (ad_account_id: STRING_32 ; customer_segment_create: CUSTOMER_SEGMENT_CREATE ): detachable CUSTOMER_SEGMENT


Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **customer_segment_create** | [**CUSTOMER_SEGMENT_CREATE**](CUSTOMER_SEGMENT_CREATE.md)|  | 

### Return type

[**CUSTOMER_SEGMENT**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment_list**
> customer_segment_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; include_sizing:  detachable BOOLEAN ; search_query:  detachable STRING_32 ): detachable CUSTOMER_SEGMENT_LIST_200_RESPONSE


List customer segments

Get a list of the customer segments in the specified `ad_account_id`.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **include_sizing** | **BOOLEAN**| Include audience sizing in result or not | [optional] [default to false]
 **search_query** | **STRING_32**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null]

### Return type

[**CUSTOMER_SEGMENT_LIST_200_RESPONSE**](customer_segment_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment_update**
> customer_segment_update (ad_account_id: STRING_32 ; customer_segment_update_request_update_with_required_body: CUSTOMER_SEGMENT_UPDATE_REQUEST_UPDATE_WITH_REQUIRED_BODY )


Update customer segments

Update the customer segment given advertiser ID and customer segment ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **customer_segment_update_request_update_with_required_body** | [**CUSTOMER_SEGMENT_UPDATE_REQUEST_UPDATE_WITH_REQUIRED_BODY**](CUSTOMER_SEGMENT_UPDATE_REQUEST_UPDATE_WITH_REQUIRED_BODY.md)|  | 

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

