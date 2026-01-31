# PinterestSdkClient::LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


## labels_create

> <LabelsResponse> labels_create(ad_account_id, label_create_request)

Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LabelsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
label_create_request = PinterestSdkClient::LabelCreateRequest.new({labels: [PinterestSdkClient::LabelCreateRequestLabelsInner.new({label_type: PinterestSdkClient::LabelType::BRAND, value: 'value_example'})], parent_id: '626753052072'}) # LabelCreateRequest | 

begin
  # Create labels
  result = api_instance.labels_create(ad_account_id, label_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_create: #{e}"
end
```

#### Using the labels_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LabelsResponse>, Integer, Hash)> labels_create_with_http_info(ad_account_id, label_create_request)

```ruby
begin
  # Create labels
  data, status_code, headers = api_instance.labels_create_with_http_info(ad_account_id, label_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LabelsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md) |  |  |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labels_list

> <LabelsList200Response> labels_list(ad_account_id, opts)

List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LabelsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  campaign_ids: ['inner_example'], # Array<String> | List of Campaign Ids to use to filter the results.
  label_ids: ['inner_example'], # Array<String> | List of Label Ids to use to filter the results.
  entity_statuses: ['ACTIVE'], # Array<String> | Label entity status
  label_types: ['BRAND'], # Array<String> | Label type.
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List labels
  result = api_instance.labels_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_list: #{e}"
end
```

#### Using the labels_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LabelsList200Response>, Integer, Hash)> labels_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List labels
  data, status_code, headers = api_instance.labels_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LabelsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_ids** | [**Array&lt;String&gt;**](String.md) | List of Campaign Ids to use to filter the results. | [optional] |
| **label_ids** | [**Array&lt;String&gt;**](String.md) | List of Label Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**Array&lt;String&gt;**](String.md) | Label entity status | [optional] |
| **label_types** | [**Array&lt;String&gt;**](String.md) | Label type. | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## labels_update

> <LabelsResponse> labels_update(ad_account_id, label_update_request)

Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LabelsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
label_update_request = PinterestSdkClient::LabelUpdateRequest.new({labels: [PinterestSdkClient::LabelUpdateRequestLabelsInner.new({id: '1106385754497'})]}) # LabelUpdateRequest | 

begin
  # Update labels
  result = api_instance.labels_update(ad_account_id, label_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_update: #{e}"
end
```

#### Using the labels_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LabelsResponse>, Integer, Hash)> labels_update_with_http_info(ad_account_id, label_update_request)

```ruby
begin
  # Update labels
  data, status_code, headers = api_instance.labels_update_with_http_info(ad_account_id, label_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LabelsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md) |  |  |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

