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

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example
```R
library(openapi)

# Create customer list upload
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_customer_list_id <- "customer_list_id_example" # character | Unique identifier of a customer list
var_customer_list_upload_create_request <- CustomerListUploadCreateRequest$new(UserListOperationType$new(), 123) # CustomerListUploadCreateRequest | Parameters to create a customer list upload request

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
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **customer_list_id** | **character**| Unique identifier of a customer list | 
 **customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **CustomerListUploadsGet**
> CustomerListUploadResponse CustomerListUploadsGet(ad_account_id, customer_list_id, customer_list_upload_id)

Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Example
```R
library(openapi)

# Get customer list upload
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_customer_list_id <- "customer_list_id_example" # character | Unique identifier of a customer list
var_customer_list_upload_id <- "customer_list_upload_id_example" # character | Unique identifier of a customer list upload

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
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **customer_list_id** | **character**| Unique identifier of a customer list | 
 **customer_list_upload_id** | **character**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **CustomerListUploadsRun**
> CustomerListUploadResponse CustomerListUploadsRun(ad_account_id, customer_list_id, customer_list_upload_id)

Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Example
```R
library(openapi)

# Run customer list upload
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_customer_list_id <- "customer_list_id_example" # character | Unique identifier of a customer list
var_customer_list_upload_id <- "customer_list_upload_id_example" # character | Unique identifier of a customer list upload

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
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **customer_list_id** | **character**| Unique identifier of a customer list | 
 **customer_list_upload_id** | **character**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

