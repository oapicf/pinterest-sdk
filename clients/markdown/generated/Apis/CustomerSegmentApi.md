# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerSegment/create**](CustomerSegmentApi.md#customerSegment/create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
| [**customerSegment/list**](CustomerSegmentApi.md#customerSegment/list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
| [**customerSegment/update**](CustomerSegmentApi.md#customerSegment/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |


<a name="customerSegment/create"></a>
# **customerSegment/create**
> CustomerSegment customerSegment/create(ad\_account\_id, CustomerSegmentCreate)

Create customer segments

    Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **CustomerSegmentCreate** | [**CustomerSegmentCreate**](../Models/CustomerSegmentCreate.md)|  | |

### Return type

[**CustomerSegment**](../Models/CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="customerSegment/list"></a>
# **customerSegment/list**
> customer_segment_list_200_response customerSegment/list(ad\_account\_id, bookmark, page\_size, order, include\_sizing, search\_query)

List customer segments

    Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **include\_sizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false] |
| **search\_query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null] |

### Return type

[**customer_segment_list_200_response**](../Models/customer_segment_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="customerSegment/update"></a>
# **customerSegment/update**
> customerSegment/update(ad\_account\_id, CustomerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

    Update the customer segment given advertiser ID and customer segment ID

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **CustomerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](../Models/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

