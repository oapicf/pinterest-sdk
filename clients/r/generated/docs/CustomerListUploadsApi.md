# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListUploadsCreate**](CustomerListUploadsApi.md#CustomerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**CustomerListUploadsGet**](CustomerListUploadsApi.md#CustomerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**CustomerListUploadsRun**](CustomerListUploadsApi.md#CustomerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **CustomerListUploadsCreate**
> CustomerListUploadCreateResponse CustomerListUploadsCreate(ad_account_id, customer_list_id, customer_list_upload_create_request)

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example
```R
library(openapi)

# Create customer list upload
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_customer_list_id <- "customer_list_id_example" # character | Customer list ID.
var_customer_list_upload_create_request <- CustomerListUploadCreateRequest$new(UserListOperationType$new(), 123) # CustomerListUploadCreateRequest | 

api_instance <- CustomerListUploadsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListUploadsCreate(var_ad_account_id, var_customer_list_id, var_customer_list_upload_create_requestdata_file = "result.txt")
result <- api_instance$CustomerListUploadsCreate(var_ad_account_id, var_customer_list_id, var_customer_list_upload_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **customer_list_id** | **character**| Customer list ID. | 
 **customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CustomerListUploadsGet**
> CustomerListUpload CustomerListUploadsGet(ad_account_id, customer_list_id, customer_list_upload_id)

Get customer list upload

Get the metadata for a given upload by its ID.

### Example
```R
library(openapi)

# Get customer list upload
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_customer_list_id <- "customer_list_id_example" # character | Customer list ID.
var_customer_list_upload_id <- "customer_list_upload_id_example" # character | Customer List Upload ID.

api_instance <- CustomerListUploadsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListUploadsGet(var_ad_account_id, var_customer_list_id, var_customer_list_upload_iddata_file = "result.txt")
result <- api_instance$CustomerListUploadsGet(var_ad_account_id, var_customer_list_id, var_customer_list_upload_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **customer_list_id** | **character**| Customer list ID. | 
 **customer_list_upload_id** | **character**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CustomerListUploadsRun**
> CustomerListUpload CustomerListUploadsRun(ad_account_id, customer_list_id, customer_list_upload_id)

Run customer list upload

Begin processing a customer list upload.

### Example
```R
library(openapi)

# Run customer list upload
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_customer_list_id <- "customer_list_id_example" # character | Customer list ID.
var_customer_list_upload_id <- "customer_list_upload_id_example" # character | Customer List Upload ID.

api_instance <- CustomerListUploadsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListUploadsRun(var_ad_account_id, var_customer_list_id, var_customer_list_upload_iddata_file = "result.txt")
result <- api_instance$CustomerListUploadsRun(var_ad_account_id, var_customer_list_id, var_customer_list_upload_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **customer_list_id** | **character**| Customer list ID. | 
 **customer_list_upload_id** | **character**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

