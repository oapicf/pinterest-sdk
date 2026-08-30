# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_segment_create**](CustomerSegmentApi.md#customer_segment_create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customer_segment_list**](CustomerSegmentApi.md#customer_segment_list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customer_segment_update**](CustomerSegmentApi.md#customer_segment_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customer_segment_create**
> `customer_segment_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `customer_segment_create_param`::`CustomerSegmentCreate`;) -> `CustomerSegment`

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`customer_segment_create_param`** | [**`CustomerSegmentCreate`**](CustomerSegmentCreate.md)|  |

### Return type

[**`CustomerSegment`**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment_list**
> `customer_segment_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `include_sizing`=nothing, `search_query`=nothing,) -> `CustomerSegmentList200Response`

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

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
 **`include_sizing`** | **`Bool`**| Include audience sizing in result or not | [default to false]
 **`search_query`** | **`String`**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [default to nothing]

### Return type

[**`CustomerSegmentList200Response`**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_segment_update**
> `customer_segment_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `customer_segment_update_request_update_with_required_body`::`CustomerSegmentUpdateRequestUpdateWithRequiredBody`;) -> `Nothing`

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`customer_segment_update_request_update_with_required_body`** | [**`CustomerSegmentUpdateRequestUpdateWithRequiredBody`**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  |

### Return type

`Nothing`

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

