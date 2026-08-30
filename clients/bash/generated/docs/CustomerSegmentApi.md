# CustomerSegmentApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSegmentCreate**](CustomerSegmentApi.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customerSegmentList**](CustomerSegmentApi.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customerSegmentUpdate**](CustomerSegmentApi.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments



## customerSegmentCreate

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example

```bash
 customerSegmentCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md) |  |

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customerSegmentList

List customer segments

Get a list of the customer segments in the specified 'ad_account_id'.

### Example

```bash
 customerSegmentList ad_account_id=value  bookmark=value  page_size=value  order=value  include_sizing=value  search_query=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID.
Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **includeSizing** | **boolean** | Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null]

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customerSegmentUpdate

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example

```bash
 customerSegmentUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  |

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

