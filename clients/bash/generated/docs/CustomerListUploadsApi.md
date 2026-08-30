# CustomerListUploadsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload



## customerListUploadsCreate

Create customer list upload

Create a customer list upload request for multipart S3 upload.

Note: Each part must be at least 5mb; however the last part can be any size greater than 0.
Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.

**Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example

```bash
 customerListUploadsCreate ad_account_id=value customer_list_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **customerListId** | **string** | Customer list ID. | [default to null]
 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md) |  |

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

Get the metadata for a given upload by its ID.

### Example

```bash
 customerListUploadsGet ad_account_id=value customer_list_id=value customer_list_upload_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **customerListId** | **string** | Customer list ID. | [default to null]
 **customerListUploadId** | **string** | Customer List Upload ID. | [default to null]

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customerListUploadsRun

Run customer list upload

Begin processing a customer list upload.

### Example

```bash
 customerListUploadsRun ad_account_id=value customer_list_id=value customer_list_upload_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **customerListId** | **string** | Customer list ID. | [default to null]
 **customerListUploadId** | **string** | Customer List Upload ID. | [default to null]

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

