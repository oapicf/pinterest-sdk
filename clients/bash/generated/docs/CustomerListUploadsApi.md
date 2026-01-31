# CustomerListUploadsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload



## customerListUploadsCreate

Create customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>

<p>Create a customer list upload request for multipart S3 upload.</p>
<p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0.
Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p>
<p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example

```bash
 customerListUploadsCreate ad_account_id=value customer_list_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **customerListId** | **string** | Unique identifier of a customer list | [default to null]
 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md) | Parameters to create a customer list upload request |

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customerListUploadsGet

Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>
<p>Get the metadata for a given upload by its ID.</p>

### Example

```bash
 customerListUploadsGet ad_account_id=value customer_list_id=value customer_list_upload_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **customerListId** | **string** | Unique identifier of a customer list | [default to null]
 **customerListUploadId** | **string** | Unique identifier of a customer list upload | [default to null]

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customerListUploadsRun

Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>
<p>Begin processing a customer list upload.</p>

### Example

```bash
 customerListUploadsRun ad_account_id=value customer_list_id=value customer_list_upload_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **customerListId** | **string** | Unique identifier of a customer list | [default to null]
 **customerListUploadId** | **string** | Unique identifier of a customer list upload | [default to null]

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

