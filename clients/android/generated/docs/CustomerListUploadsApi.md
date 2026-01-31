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

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListUploadsApi;

CustomerListUploadsApi apiInstance = new CustomerListUploadsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String customerListId = null; // String | Unique identifier of a customer list
CustomerListUploadCreateRequest customerListUploadCreateRequest = new CustomerListUploadCreateRequest(); // CustomerListUploadCreateRequest | Parameters to create a customer list upload request
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
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerListId** | **String**| Unique identifier of a customer list | [default to null]
 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request |

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerListUploadsGet

> CustomerListUploadResponse customerListUploadsGet(adAccountId, customerListId, customerListUploadId)

Get customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListUploadsApi;

CustomerListUploadsApi apiInstance = new CustomerListUploadsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String customerListId = null; // String | Unique identifier of a customer list
String customerListUploadId = null; // String | Unique identifier of a customer list upload
try {
    CustomerListUploadResponse result = apiInstance.customerListUploadsGet(adAccountId, customerListId, customerListUploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerListId** | **String**| Unique identifier of a customer list | [default to null]
 **customerListUploadId** | **String**| Unique identifier of a customer list upload | [default to null]

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerListUploadsRun

> CustomerListUploadResponse customerListUploadsRun(adAccountId, customerListId, customerListUploadId)

Run customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListUploadsApi;

CustomerListUploadsApi apiInstance = new CustomerListUploadsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String customerListId = null; // String | Unique identifier of a customer list
String customerListUploadId = null; // String | Unique identifier of a customer list upload
try {
    CustomerListUploadResponse result = apiInstance.customerListUploadsRun(adAccountId, customerListId, customerListUploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListUploadsApi#customerListUploadsRun");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerListId** | **String**| Unique identifier of a customer list | [default to null]
 **customerListUploadId** | **String**| Unique identifier of a customer list upload | [default to null]

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

