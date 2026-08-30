# PinterestSdkClient::CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**customer_list_uploads_create**](CustomerListUploadsApi.md#customer_list_uploads_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
| [**customer_list_uploads_get**](CustomerListUploadsApi.md#customer_list_uploads_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
| [**customer_list_uploads_run**](CustomerListUploadsApi.md#customer_list_uploads_run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |


## customer_list_uploads_create

> <CustomerListUploadCreateResponse> customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListUploadsApi.new
ad_account_id = 'ad_account_id_example' # String | 
customer_list_id = 'customer_list_id_example' # String | Customer list ID.
customer_list_upload_create_request = PinterestSdkClient::CustomerListUploadCreateRequest.new({operation: PinterestSdkClient::UserListOperationType::ADD, total_parts: 2}) # CustomerListUploadCreateRequest | 

begin
  # Create customer list upload
  result = api_instance.customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListUploadsApi->customer_list_uploads_create: #{e}"
end
```

#### Using the customer_list_uploads_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerListUploadCreateResponse>, Integer, Hash)> customer_list_uploads_create_with_http_info(ad_account_id, customer_list_id, customer_list_upload_create_request)

```ruby
begin
  # Create customer list upload
  data, status_code, headers = api_instance.customer_list_uploads_create_with_http_info(ad_account_id, customer_list_id, customer_list_upload_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerListUploadCreateResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListUploadsApi->customer_list_uploads_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **customer_list_id** | **String** | Customer list ID. |  |
| **customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md) |  |  |

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customer_list_uploads_get

> <CustomerListUpload> customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)

Get customer list upload

Get the metadata for a given upload by its ID.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListUploadsApi.new
ad_account_id = 'ad_account_id_example' # String | 
customer_list_id = 'customer_list_id_example' # String | Customer list ID.
customer_list_upload_id = 'customer_list_upload_id_example' # String | Customer List Upload ID.

begin
  # Get customer list upload
  result = api_instance.customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListUploadsApi->customer_list_uploads_get: #{e}"
end
```

#### Using the customer_list_uploads_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerListUpload>, Integer, Hash)> customer_list_uploads_get_with_http_info(ad_account_id, customer_list_id, customer_list_upload_id)

```ruby
begin
  # Get customer list upload
  data, status_code, headers = api_instance.customer_list_uploads_get_with_http_info(ad_account_id, customer_list_id, customer_list_upload_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerListUpload>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListUploadsApi->customer_list_uploads_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **customer_list_id** | **String** | Customer list ID. |  |
| **customer_list_upload_id** | **String** | Customer List Upload ID. |  |

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customer_list_uploads_run

> <CustomerListUpload> customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)

Run customer list upload

Begin processing a customer list upload.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListUploadsApi.new
ad_account_id = 'ad_account_id_example' # String | 
customer_list_id = 'customer_list_id_example' # String | Customer list ID.
customer_list_upload_id = 'customer_list_upload_id_example' # String | Customer List Upload ID.

begin
  # Run customer list upload
  result = api_instance.customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListUploadsApi->customer_list_uploads_run: #{e}"
end
```

#### Using the customer_list_uploads_run_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerListUpload>, Integer, Hash)> customer_list_uploads_run_with_http_info(ad_account_id, customer_list_id, customer_list_upload_id)

```ruby
begin
  # Run customer list upload
  data, status_code, headers = api_instance.customer_list_uploads_run_with_http_info(ad_account_id, customer_list_id, customer_list_upload_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerListUpload>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListUploadsApi->customer_list_uploads_run_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **customer_list_id** | **String** | Customer list ID. |  |
| **customer_list_upload_id** | **String** | Customer List Upload ID. |  |

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

