# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerListUploads/create**](CustomerListUploadsApi.md#customerListUploads/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
| [**customerListUploads/get**](CustomerListUploadsApi.md#customerListUploads/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
| [**customerListUploads/run**](CustomerListUploadsApi.md#customerListUploads/run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |


<a name="customerListUploads/create"></a>
# **customerListUploads/create**
> CustomerListUploadCreateResponse customerListUploads/create(ad\_account\_id, customer\_list\_id, CustomerListUploadCreateRequest)

Create customer list upload

    Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **customer\_list\_id** | **String**| Customer list ID. | [default to null] |
| **CustomerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](../Models/CustomerListUploadCreateRequest.md)|  | |

### Return type

[**CustomerListUploadCreateResponse**](../Models/CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="customerListUploads/get"></a>
# **customerListUploads/get**
> CustomerListUpload customerListUploads/get(ad\_account\_id, customer\_list\_id, customer\_list\_upload\_id)

Get customer list upload

    Get the metadata for a given upload by its ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **customer\_list\_id** | **String**| Customer list ID. | [default to null] |
| **customer\_list\_upload\_id** | **String**| Customer List Upload ID. | [default to null] |

### Return type

[**CustomerListUpload**](../Models/CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="customerListUploads/run"></a>
# **customerListUploads/run**
> CustomerListUpload customerListUploads/run(ad\_account\_id, customer\_list\_id, customer\_list\_upload\_id)

Run customer list upload

    Begin processing a customer list upload.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **customer\_list\_id** | **String**| Customer list ID. | [default to null] |
| **customer\_list\_upload\_id** | **String**| Customer List Upload ID. | [default to null] |

### Return type

[**CustomerListUpload**](../Models/CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

