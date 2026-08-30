# \CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_segment_slash_create**](CustomerSegmentApi.md#customer_segment_slash_create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customer_segment_slash_list**](CustomerSegmentApi.md#customer_segment_slash_list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customer_segment_slash_update**](CustomerSegmentApi.md#customer_segment_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments



## customer_segment_slash_create

> models::CustomerSegment customer_segment_slash_create(ad_account_id, customer_segment_create)
Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**customer_segment_create** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md) |  | [required] |

### Return type

[**models::CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customer_segment_slash_list

> models::CustomerSegmentList200Response customer_segment_slash_list(ad_account_id, bookmark, page_size, order, include_sizing, search_query)
List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**include_sizing** | Option<**bool**> | Include audience sizing in result or not |  |[default to false]
**search_query** | Option<**String**> | Search query. Can contain pin description keywords or comma-separated pin IDs. |  |

### Return type

[**models::CustomerSegmentList200Response**](customer_segment_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customer_segment_slash_update

> customer_segment_slash_update(ad_account_id, customer_segment_update_request_update_with_required_body)
Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**customer_segment_update_request_update_with_required_body** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

