# PinterestSdkClient::AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**audiences_create**](AudiencesApi.md#audiences_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiences_create_custom**](AudiencesApi.md#audiences_create_custom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience |
| [**audiences_get**](AudiencesApi.md#audiences_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiences_list**](AudiencesApi.md#audiences_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiences_update**](AudiencesApi.md#audiences_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


## audiences_create

> <Audience> audiences_create(ad_account_id, audience_create_request)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
audience_create_request = PinterestSdkClient::AudienceCreateRequest.new({name: 'string', rule: PinterestSdkClient::AudienceRule.new, audience_type: PinterestSdkClient::AudienceCreateRequest1AudienceType.new}) # AudienceCreateRequest | List of ads to create, size limit [1, 30]

begin
  # Create audience
  result = api_instance.audiences_create(ad_account_id, audience_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_create: #{e}"
end
```

#### Using the audiences_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Audience>, Integer, Hash)> audiences_create_with_http_info(ad_account_id, audience_create_request)

```ruby
begin
  # Create audience
  data, status_code, headers = api_instance.audiences_create_with_http_info(ad_account_id, audience_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Audience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_create_request** | [**AudienceCreateRequest**](AudienceCreateRequest.md) | List of ads to create, size limit [1, 30] |  |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## audiences_create_custom

> <Audience> audiences_create_custom(ad_account_id, audience_create_custom_request)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
audience_create_custom_request = PinterestSdkClient::AudienceCreateCustomRequest.new({name: 'string', rule: PinterestSdkClient::AudienceRule.new, sharing_type: PinterestSdkClient::AudienceSharingType::CUSTOM, data_party: PinterestSdkClient::AudienceDataParty::N1P}) # AudienceCreateCustomRequest | Custom audience to create.

begin
  # Create custom audience
  result = api_instance.audiences_create_custom(ad_account_id, audience_create_custom_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_create_custom: #{e}"
end
```

#### Using the audiences_create_custom_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Audience>, Integer, Hash)> audiences_create_custom_with_http_info(ad_account_id, audience_create_custom_request)

```ruby
begin
  # Create custom audience
  data, status_code, headers = api_instance.audiences_create_custom_with_http_info(ad_account_id, audience_create_custom_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Audience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_create_custom_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_create_custom_request** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md) | Custom audience to create. |  |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## audiences_get

> <Audience> audiences_get(ad_account_id, audience_id)

Get audience

Get a specific audience given the audience ID.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
audience_id = 'audience_id_example' # String | Unique identifier of an audience

begin
  # Get audience
  result = api_instance.audiences_get(ad_account_id, audience_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_get: #{e}"
end
```

#### Using the audiences_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Audience>, Integer, Hash)> audiences_get_with_http_info(ad_account_id, audience_id)

```ruby
begin
  # Get audience
  data, status_code, headers = api_instance.audiences_get_with_http_info(ad_account_id, audience_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Audience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_id** | **String** | Unique identifier of an audience |  |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiences_list

> <AudiencesList200Response> audiences_list(ad_account_id, opts)

List audiences

Get list of audiences for the ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  ownership_type: 'OWNED' # String | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.
}

begin
  # List audiences
  result = api_instance.audiences_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_list: #{e}"
end
```

#### Using the audiences_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AudiencesList200Response>, Integer, Hash)> audiences_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List audiences
  data, status_code, headers = api_instance.audiences_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudiencesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ownership_type** | **String** | &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional][default to &#39;OWNED&#39;] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiences_update

> <Audience> audiences_update(ad_account_id, audience_id, opts)

Update audience

Update (edit or remove) an existing targeting audience.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
audience_id = 'audience_id_example' # String | Unique identifier of an audience
opts = {
  audience_update_request: PinterestSdkClient::AudienceUpdateRequest.new # AudienceUpdateRequest | The audience to be updated.
}

begin
  # Update audience
  result = api_instance.audiences_update(ad_account_id, audience_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_update: #{e}"
end
```

#### Using the audiences_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Audience>, Integer, Hash)> audiences_update_with_http_info(ad_account_id, audience_id, opts)

```ruby
begin
  # Update audience
  data, status_code, headers = api_instance.audiences_update_with_http_info(ad_account_id, audience_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Audience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_id** | **String** | Unique identifier of an audience |  |
| **audience_update_request** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md) | The audience to be updated. | [optional] |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

