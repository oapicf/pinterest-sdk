# PinterestSdk.ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionDeletionRequestCreate**](ConversionDeletionRequestsApi.md#conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversionDeletionRequestDelete**](ConversionDeletionRequestsApi.md#conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversionDeletionRequestGet**](ConversionDeletionRequestsApi.md#conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversionDeletionRequestList**](ConversionDeletionRequestsApi.md#conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests



## conversionDeletionRequestCreate

> ConversionDeletionRequest conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ConversionDeletionRequestsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let conversionDeletionRequestCreate = new PinterestSdk.ConversionDeletionRequestCreate(); // ConversionDeletionRequestCreate | 
apiInstance.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate, (error, data, response) => {
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
 **conversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md)|  | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## conversionDeletionRequestDelete

> ConversionDeletionRequest conversionDeletionRequestDelete(requestId, adAccountId)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ConversionDeletionRequestsApi();
let requestId = "requestId_example"; // String | Unique identifier of the conversion deletion request
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
apiInstance.conversionDeletionRequestDelete(requestId, adAccountId, (error, data, response) => {
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
 **requestId** | **String**| Unique identifier of the conversion deletion request | 
 **adAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversionDeletionRequestGet

> ConversionDeletionRequest conversionDeletionRequestGet(requestId, adAccountId)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ConversionDeletionRequestsApi();
let requestId = "requestId_example"; // String | Unique identifier of the conversion deletion request
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
apiInstance.conversionDeletionRequestGet(requestId, adAccountId, (error, data, response) => {
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
 **requestId** | **String**| Unique identifier of the conversion deletion request | 
 **adAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversionDeletionRequestList

> ConversionDeletionRequestList200Response conversionDeletionRequestList(adAccountId, opts)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ConversionDeletionRequestsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  'order': new PinterestSdk.PinterestLibPaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
};
apiInstance.conversionDeletionRequestList(adAccountId, opts, (error, data, response) => {
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

### Return type

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

