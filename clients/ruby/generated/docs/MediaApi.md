# PinterestSdkClient::MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**media_create**](MediaApi.md#media_create) | **POST** /media | Register media upload |
| [**media_get**](MediaApi.md#media_get) | **GET** /media/{media_id} | Get media upload details |
| [**media_list**](MediaApi.md#media_list) | **GET** /media | List media uploads |


## media_create

> <MediaUpload> media_create(media_upload_request)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::MediaApi.new
media_upload_request = PinterestSdkClient::MediaUploadRequest.new({media_type: PinterestSdkClient::MediaUploadType::VIDEO}) # MediaUploadRequest | Create a media upload request

begin
  # Register media upload
  result = api_instance.media_create(media_upload_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MediaApi->media_create: #{e}"
end
```

#### Using the media_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MediaUpload>, Integer, Hash)> media_create_with_http_info(media_upload_request)

```ruby
begin
  # Register media upload
  data, status_code, headers = api_instance.media_create_with_http_info(media_upload_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MediaUpload>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MediaApi->media_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media_upload_request** | [**MediaUploadRequest**](MediaUploadRequest.md) | Create a media upload request |  |

### Return type

[**MediaUpload**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## media_get

> <MediaUploadDetails> media_get(media_id)

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::MediaApi.new
media_id = 'media_id_example' # String | Media identifier

begin
  # Get media upload details
  result = api_instance.media_get(media_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MediaApi->media_get: #{e}"
end
```

#### Using the media_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MediaUploadDetails>, Integer, Hash)> media_get_with_http_info(media_id)

```ruby
begin
  # Get media upload details
  data, status_code, headers = api_instance.media_get_with_http_info(media_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MediaUploadDetails>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MediaApi->media_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media_id** | **String** | Media identifier |  |

### Return type

[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## media_list

> <Paginated> media_list(opts)

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::MediaApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
}

begin
  # List media uploads
  result = api_instance.media_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MediaApi->media_list: #{e}"
end
```

#### Using the media_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> media_list_with_http_info(opts)

```ruby
begin
  # List media uploads
  data, status_code, headers = api_instance.media_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MediaApi->media_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

