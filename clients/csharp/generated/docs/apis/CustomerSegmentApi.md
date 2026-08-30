# Org.OpenAPITools.Api.CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CustomerSegmentCreate**](CustomerSegmentApi.md#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
| [**CustomerSegmentList**](CustomerSegmentApi.md#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
| [**CustomerSegmentUpdate**](CustomerSegmentApi.md#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |

<a id="customersegmentcreate"></a>
# **CustomerSegmentCreate**
> CustomerSegment CustomerSegmentCreate (string adAccountId, CustomerSegmentCreate customerSegmentCreate)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md) |  |  |

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="customersegmentlist"></a>
# **CustomerSegmentList**
> CustomerSegmentList200Response CustomerSegmentList (string adAccountId, string bookmark = null, int pageSize = null, PinterestLibPaginationOrder order = null, bool includeSizing = null, string searchQuery = null)

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **includeSizing** | **bool** | Include audience sizing in result or not | [optional] [default to false] |
| **searchQuery** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]  |

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="customersegmentupdate"></a>
# **CustomerSegmentUpdate**
> void CustomerSegmentUpdate (string adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  |  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

