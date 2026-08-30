# PinterestSdk.CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload



## customerListUploadsCreate

> CustomerListUploadCreateResponse customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CustomerListUploadsApi();
let adAccountId = "adAccountId_example"; // String | 
let customerListId = "customerListId_example"; // String | Customer list ID.
let customerListUploadCreateRequest = new PinterestSdk.CustomerListUploadCreateRequest(); // CustomerListUploadCreateRequest | 
apiInstance.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest, (error, data, response) => {
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
 **adAccountId** | **String**|  | 
 **customerListId** | **String**| Customer list ID. | 
 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerListUploadsGet

> CustomerListUpload customerListUploadsGet(adAccountId, customerListId, customerListUploadId)

Get customer list upload

Get the metadata for a given upload by its ID.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CustomerListUploadsApi();
let adAccountId = "adAccountId_example"; // String | 
let customerListId = "customerListId_example"; // String | Customer list ID.
let customerListUploadId = "customerListUploadId_example"; // String | Customer List Upload ID.
apiInstance.customerListUploadsGet(adAccountId, customerListId, customerListUploadId, (error, data, response) => {
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
 **adAccountId** | **String**|  | 
 **customerListId** | **String**| Customer list ID. | 
 **customerListUploadId** | **String**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerListUploadsRun

> CustomerListUpload customerListUploadsRun(adAccountId, customerListId, customerListUploadId)

Run customer list upload

Begin processing a customer list upload.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CustomerListUploadsApi();
let adAccountId = "adAccountId_example"; // String | 
let customerListId = "customerListId_example"; // String | Customer list ID.
let customerListUploadId = "customerListUploadId_example"; // String | Customer List Upload ID.
apiInstance.customerListUploadsRun(adAccountId, customerListId, customerListUploadId, (error, data, response) => {
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
 **adAccountId** | **String**|  | 
 **customerListId** | **String**| Customer list ID. | 
 **customerListUploadId** | **String**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

