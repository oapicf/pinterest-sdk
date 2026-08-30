# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads_create**](CustomerListUploadsApi.md#customer_list_uploads_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customer_list_uploads_get**](CustomerListUploadsApi.md#customer_list_uploads_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customer_list_uploads_run**](CustomerListUploadsApi.md#customer_list_uploads_run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customer_list_uploads_create**
> `customer_list_uploads_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `customer_list_id`::`String`, `customer_list_upload_create_request`::`CustomerListUploadCreateRequest`;) -> `CustomerListUploadCreateResponse`

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**|  |
**`customer_list_id`** | **`String`**| Customer list ID. |
**`customer_list_upload_create_request`** | [**`CustomerListUploadCreateRequest`**](CustomerListUploadCreateRequest.md)|  |

### Return type

[**`CustomerListUploadCreateResponse`**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_get**
> `customer_list_uploads_get`(req::`HTTP.Request`, `ad_account_id`::`String`, `customer_list_id`::`String`, `customer_list_upload_id`::`String`;) -> `CustomerListUpload`

Get customer list upload

Get the metadata for a given upload by its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**|  |
**`customer_list_id`** | **`String`**| Customer list ID. |
**`customer_list_upload_id`** | **`String`**| Customer List Upload ID. |

### Return type

[**`CustomerListUpload`**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_run**
> `customer_list_uploads_run`(req::`HTTP.Request`, `ad_account_id`::`String`, `customer_list_id`::`String`, `customer_list_upload_id`::`String`;) -> `CustomerListUpload`

Run customer list upload

Begin processing a customer list upload.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**|  |
**`customer_list_id`** | **`String`**| Customer list ID. |
**`customer_list_upload_id`** | **`String`**| Customer List Upload ID. |

### Return type

[**`CustomerListUpload`**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

