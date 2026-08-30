# CustomerListUploadsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListUploadsAPI_customerListUploadsCreate**](CustomerListUploadsAPI.md#CustomerListUploadsAPI_customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**CustomerListUploadsAPI_customerListUploadsGet**](CustomerListUploadsAPI.md#CustomerListUploadsAPI_customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**CustomerListUploadsAPI_customerListUploadsRun**](CustomerListUploadsAPI.md#CustomerListUploadsAPI_customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **CustomerListUploadsAPI_customerListUploadsCreate**
```c
// Create customer list upload
//
// Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
//
customer_list_upload_create_response_t* CustomerListUploadsAPI_customerListUploadsCreate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_upload_create_request_t *customer_list_upload_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**customer_list_id** | **char \*** | Customer list ID. | 
**customer_list_upload_create_request** | **[customer_list_upload_create_request_t](customer_list_upload_create_request.md) \*** |  | 

### Return type

[customer_list_upload_create_response_t](customer_list_upload_create_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomerListUploadsAPI_customerListUploadsGet**
```c
// Get customer list upload
//
// Get the metadata for a given upload by its ID.
//
customer_list_upload_t* CustomerListUploadsAPI_customerListUploadsGet(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, char *customer_list_upload_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**customer_list_id** | **char \*** | Customer list ID. | 
**customer_list_upload_id** | **char \*** | Customer List Upload ID. | 

### Return type

[customer_list_upload_t](customer_list_upload.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomerListUploadsAPI_customerListUploadsRun**
```c
// Run customer list upload
//
// Begin processing a customer list upload.
//
customer_list_upload_t* CustomerListUploadsAPI_customerListUploadsRun(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, char *customer_list_upload_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**customer_list_id** | **char \*** | Customer list ID. | 
**customer_list_upload_id** | **char \*** | Customer List Upload ID. | 

### Return type

[customer_list_upload_t](customer_list_upload.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

