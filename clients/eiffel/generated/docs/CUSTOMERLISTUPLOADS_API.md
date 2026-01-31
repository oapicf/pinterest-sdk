# CUSTOMERLISTUPLOADS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads_create**](CUSTOMERLISTUPLOADS_API.md#customer_list_uploads_create) | **Post** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customer_list_uploads_get**](CUSTOMERLISTUPLOADS_API.md#customer_list_uploads_get) | **Get** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customer_list_uploads_run**](CUSTOMERLISTUPLOADS_API.md#customer_list_uploads_run) | **Post** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customer_list_uploads_create**
> customer_list_uploads_create (ad_account_id: STRING_32 ; customer_list_id: STRING_32 ; customer_list_upload_create_request: CUSTOMER_LIST_UPLOAD_CREATE_REQUEST ): detachable CUSTOMER_LIST_UPLOAD_CREATE_RESPONSE


Create customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **customer_list_id** | **STRING_32**| Unique identifier of a customer list | [default to null]
 **customer_list_upload_create_request** | [**CUSTOMER_LIST_UPLOAD_CREATE_REQUEST**](CUSTOMER_LIST_UPLOAD_CREATE_REQUEST.md)| Parameters to create a customer list upload request | 

### Return type

[**CUSTOMER_LIST_UPLOAD_CREATE_RESPONSE**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_get**
> customer_list_uploads_get (ad_account_id: STRING_32 ; customer_list_id: STRING_32 ; customer_list_upload_id: STRING_32 ): detachable CUSTOMER_LIST_UPLOAD_RESPONSE


Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **customer_list_id** | **STRING_32**| Unique identifier of a customer list | [default to null]
 **customer_list_upload_id** | **STRING_32**| Unique identifier of a customer list upload | [default to null]

### Return type

[**CUSTOMER_LIST_UPLOAD_RESPONSE**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_run**
> customer_list_uploads_run (ad_account_id: STRING_32 ; customer_list_id: STRING_32 ; customer_list_upload_id: STRING_32 ): detachable CUSTOMER_LIST_UPLOAD_RESPONSE


Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **customer_list_id** | **STRING_32**| Unique identifier of a customer list | [default to null]
 **customer_list_upload_id** | **STRING_32**| Unique identifier of a customer list upload | [default to null]

### Return type

[**CUSTOMER_LIST_UPLOAD_RESPONSE**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

