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

    &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **customer\_list\_id** | **String**| Unique identifier of a customer list | [default to null] |
| **CustomerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](../Models/CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | |

### Return type

[**CustomerListUploadCreateResponse**](../Models/CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="customerListUploads/get"></a>
# **customerListUploads/get**
> CustomerListUploadResponse customerListUploads/get(ad\_account\_id, customer\_list\_id, customer\_list\_upload\_id)

Get customer list upload

    &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **customer\_list\_id** | **String**| Unique identifier of a customer list | [default to null] |
| **customer\_list\_upload\_id** | **String**| Unique identifier of a customer list upload | [default to null] |

### Return type

[**CustomerListUploadResponse**](../Models/CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="customerListUploads/run"></a>
# **customerListUploads/run**
> CustomerListUploadResponse customerListUploads/run(ad\_account\_id, customer\_list\_id, customer\_list\_upload\_id)

Run customer list upload

    &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **customer\_list\_id** | **String**| Unique identifier of a customer list | [default to null] |
| **customer\_list\_upload\_id** | **String**| Unique identifier of a customer list upload | [default to null] |

### Return type

[**CustomerListUploadResponse**](../Models/CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

