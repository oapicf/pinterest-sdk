# PinterestSdkClient::BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**bulk_download_create**](BulkApi.md#bulk_download_create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
| [**bulk_request_get**](BulkApi.md#bulk_request_get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
| [**bulk_upsert_create**](BulkApi.md#bulk_upsert_create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |


## bulk_download_create

> <BulkDownloadResponse> bulk_download_create(ad_account_id, bulk_download_request)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BulkApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
bulk_download_request = PinterestSdkClient::BulkDownloadRequest.new # BulkDownloadRequest | Parameters to get ad entities in bulk

begin
  # Get advertiser entities in bulk
  result = api_instance.bulk_download_create(ad_account_id, bulk_download_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BulkApi->bulk_download_create: #{e}"
end
```

#### Using the bulk_download_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BulkDownloadResponse>, Integer, Hash)> bulk_download_create_with_http_info(ad_account_id, bulk_download_request)

```ruby
begin
  # Get advertiser entities in bulk
  data, status_code, headers = api_instance.bulk_download_create_with_http_info(ad_account_id, bulk_download_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BulkDownloadResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BulkApi->bulk_download_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bulk_download_request** | [**BulkDownloadRequest**](BulkDownloadRequest.md) | Parameters to get ad entities in bulk |  |

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## bulk_request_get

> <BulkUpsertStatusResponse> bulk_request_get(ad_account_id, bulk_request_id, opts)

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BulkApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
bulk_request_id = 'bulk_request_id_example' # String | Unique identifier of a bulk upsert request.
opts = {
  include_details: true # Boolean | if set to True then attach the errors/details to all the requests
}

begin
  # Download advertiser entities in bulk
  result = api_instance.bulk_request_get(ad_account_id, bulk_request_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BulkApi->bulk_request_get: #{e}"
end
```

#### Using the bulk_request_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BulkUpsertStatusResponse>, Integer, Hash)> bulk_request_get_with_http_info(ad_account_id, bulk_request_id, opts)

```ruby
begin
  # Download advertiser entities in bulk
  data, status_code, headers = api_instance.bulk_request_get_with_http_info(ad_account_id, bulk_request_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BulkUpsertStatusResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BulkApi->bulk_request_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bulk_request_id** | **String** | Unique identifier of a bulk upsert request. |  |
| **include_details** | **Boolean** | if set to True then attach the errors/details to all the requests | [optional][default to false] |

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## bulk_upsert_create

> <BulkUpsertResponse> bulk_upsert_create(ad_account_id, bulk_upsert_request)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BulkApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
bulk_upsert_request = PinterestSdkClient::BulkUpsertRequest.new # BulkUpsertRequest | Parameters to get create/update ad entities in bulk

begin
  # Create/update ad entities in bulk
  result = api_instance.bulk_upsert_create(ad_account_id, bulk_upsert_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BulkApi->bulk_upsert_create: #{e}"
end
```

#### Using the bulk_upsert_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BulkUpsertResponse>, Integer, Hash)> bulk_upsert_create_with_http_info(ad_account_id, bulk_upsert_request)

```ruby
begin
  # Create/update ad entities in bulk
  data, status_code, headers = api_instance.bulk_upsert_create_with_http_info(ad_account_id, bulk_upsert_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BulkUpsertResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BulkApi->bulk_upsert_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bulk_upsert_request** | [**BulkUpsertRequest**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk |  |

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

