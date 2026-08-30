# PinterestSdk.CustomerSegmentApi

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CustomerSegmentApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let customerSegmentCreate = new PinterestSdk.CustomerSegmentCreate(); // CustomerSegmentCreate | 
apiInstance.customerSegmentCreate(adAccountId, customerSegmentCreate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | 

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerSegmentList

> CustomerSegmentList200Response customerSegmentList(adAccountId, opts)

List customer segments

Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CustomerSegmentApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  'order': new PinterestSdk.PinterestLibPaginationOrder(), // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  'includeSizing': false, // Boolean | Include audience sizing in result or not
  'searchQuery': "searchQuery_example" // String | Search query. Can contain pin description keywords or comma-separated pin IDs.
};
apiInstance.customerSegmentList(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **includeSizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CustomerSegmentApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let customerSegmentUpdateRequestUpdateWithRequiredBody = new PinterestSdk.CustomerSegmentUpdateRequestUpdateWithRequiredBody(); // CustomerSegmentUpdateRequestUpdateWithRequiredBody | 
apiInstance.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

