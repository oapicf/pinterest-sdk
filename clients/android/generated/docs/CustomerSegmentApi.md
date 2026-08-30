# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSegmentCreate**](CustomerSegmentApi.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customerSegmentList**](CustomerSegmentApi.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customerSegmentUpdate**](CustomerSegmentApi.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments



## customerSegmentCreate

> CustomerSegment customerSegmentCreate(adAccountId, customerSegmentCreate)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerSegmentApi;

CustomerSegmentApi apiInstance = new CustomerSegmentApi();
String adAccountId = null; // String | Unique identifier of an ad account.
CustomerSegmentCreate customerSegmentCreate = new CustomerSegmentCreate(); // CustomerSegmentCreate | 
try {
    CustomerSegment result = apiInstance.customerSegmentCreate(adAccountId, customerSegmentCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSegmentApi#customerSegmentCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  |

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerSegmentList

> CustomerSegmentList200Response customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List customer segments

Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerSegmentApi;

CustomerSegmentApi apiInstance = new CustomerSegmentApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
Boolean includeSizing = false; // Boolean | Include audience sizing in result or not
String searchQuery = null; // String | Search query. Can contain pin description keywords or comma-separated pin IDs.
try {
    CustomerSegmentList200Response result = apiInstance.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSegmentApi#customerSegmentList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **includeSizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null]

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerSegmentUpdate

> customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerSegmentApi;

CustomerSegmentApi apiInstance = new CustomerSegmentApi();
String adAccountId = null; // String | Unique identifier of an ad account.
CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody = new CustomerSegmentUpdateRequestUpdateWithRequiredBody(); // CustomerSegmentUpdateRequestUpdateWithRequiredBody | 
try {
    apiInstance.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSegmentApi#customerSegmentUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

