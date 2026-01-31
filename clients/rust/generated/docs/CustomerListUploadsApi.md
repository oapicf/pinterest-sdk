# \CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads_slash_create**](CustomerListUploadsApi.md#customer_list_uploads_slash_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customer_list_uploads_slash_get**](CustomerListUploadsApi.md#customer_list_uploads_slash_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customer_list_uploads_slash_run**](CustomerListUploadsApi.md#customer_list_uploads_slash_run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload



## customer_list_uploads_slash_create

> models::CustomerListUploadCreateResponse customer_list_uploads_slash_create(ad_account_id, customer_list_id, customer_list_upload_create_request)
Create customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**customer_list_id** | **String** | Unique identifier of a customer list | [required] |
**customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md) | Parameters to create a customer list upload request | [required] |

### Return type

[**models::CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customer_list_uploads_slash_get

> models::CustomerListUploadResponse customer_list_uploads_slash_get(ad_account_id, customer_list_id, customer_list_upload_id)
Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**customer_list_id** | **String** | Unique identifier of a customer list | [required] |
**customer_list_upload_id** | **String** | Unique identifier of a customer list upload | [required] |

### Return type

[**models::CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## customer_list_uploads_slash_run

> models::CustomerListUploadResponse customer_list_uploads_slash_run(ad_account_id, customer_list_id, customer_list_upload_id)
Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**customer_list_id** | **String** | Unique identifier of a customer list | [required] |
**customer_list_upload_id** | **String** | Unique identifier of a customer list upload | [required] |

### Return type

[**models::CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

