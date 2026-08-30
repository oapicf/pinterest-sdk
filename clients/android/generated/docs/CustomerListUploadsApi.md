# CustomerListUploadsApi

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

```java
// Import classes:
//import org.openapitools.client.api.CustomerListUploadsApi;

CustomerListUploadsApi apiInstance = new CustomerListUploadsApi();
String adAccountId = null; // String | 
String customerListId = null; // String | Customer list ID.
CustomerListUploadCreateRequest customerListUploadCreateRequest = new CustomerListUploadCreateRequest(); // CustomerListUploadCreateRequest | 
try {
    CustomerListUploadCreateResponse result = apiInstance.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **customerListId** | **String**| Customer list ID. | [default to null]
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

```java
// Import classes:
//import org.openapitools.client.api.CustomerListUploadsApi;

CustomerListUploadsApi apiInstance = new CustomerListUploadsApi();
String adAccountId = null; // String | 
String customerListId = null; // String | Customer list ID.
String customerListUploadId = null; // String | Customer List Upload ID.
try {
    CustomerListUpload result = apiInstance.customerListUploadsGet(adAccountId, customerListId, customerListUploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **customerListId** | **String**| Customer list ID. | [default to null]
 **customerListUploadId** | **String**| Customer List Upload ID. | [default to null]

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

```java
// Import classes:
//import org.openapitools.client.api.CustomerListUploadsApi;

CustomerListUploadsApi apiInstance = new CustomerListUploadsApi();
String adAccountId = null; // String | 
String customerListId = null; // String | Customer list ID.
String customerListUploadId = null; // String | Customer List Upload ID.
try {
    CustomerListUpload result = apiInstance.customerListUploadsRun(adAccountId, customerListId, customerListUploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **customerListId** | **String**| Customer list ID. | [default to null]
 **customerListUploadId** | **String**| Customer List Upload ID. | [default to null]

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

