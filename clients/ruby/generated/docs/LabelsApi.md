# PinterestSdkClient::LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**labels_apply**](LabelsApi.md#labels_apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity |
| [**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labels_remove**](LabelsApi.md#labels_remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities |
| [**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


## labels_apply

> <LabeledEntities> labels_apply(ad_account_id, label_id, labeled_entities_create)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

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
ad_account_id = 'ad_account_id_example' # String | 
label_id = 'label_id_example' # String | Label ID.
labeled_entities_create = PinterestSdkClient::LabeledEntitiesCreate.new({entity_ids: ['entity_ids_example']}) # LabeledEntitiesCreate | 

begin
  # Apply label to entity
  result = api_instance.labels_apply(ad_account_id, label_id, labeled_entities_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_apply: #{e}"
end
```

#### Using the labels_apply_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LabeledEntities>, Integer, Hash)> labels_apply_with_http_info(ad_account_id, label_id, labeled_entities_create)

```ruby
begin
  # Apply label to entity
  data, status_code, headers = api_instance.labels_apply_with_http_info(ad_account_id, label_id, labeled_entities_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LabeledEntities>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_apply_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **label_id** | **String** | Label ID. |  |
| **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  |  |

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labels_create

> <LabelsResponse> labels_create(ad_account_id, label_create_request)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

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
label_create_request = PinterestSdkClient::LabelCreateRequest.new({labels: [PinterestSdkClient::LabelCreateItem.new({label_type: PinterestSdkClient::LabelType::BRAND, value: 'value_example'})]}) # LabelCreateRequest | 

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

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

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
  entity_statuses: [PinterestSdkClient::QueryLabelEntityStatusesItems::ACTIVE], # Array<QueryLabelEntityStatusesItems> | Label entity status
  label_types: [PinterestSdkClient::QueryLabelTypesItems::BRAND], # Array<QueryLabelTypesItems> | Label type.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **entity_statuses** | [**Array&lt;QueryLabelEntityStatusesItems&gt;**](QueryLabelEntityStatusesItems.md) | Label entity status | [optional] |
| **label_types** | [**Array&lt;QueryLabelTypesItems&gt;**](QueryLabelTypesItems.md) | Label type. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## labels_remove

> <LabeledEntities> labels_remove(ad_account_id, label_id, labeled_entities_create)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

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
ad_account_id = 'ad_account_id_example' # String | 
label_id = 'label_id_example' # String | Label ID.
labeled_entities_create = PinterestSdkClient::LabeledEntitiesCreate.new({entity_ids: ['entity_ids_example']}) # LabeledEntitiesCreate | 

begin
  # Remove label from entities
  result = api_instance.labels_remove(ad_account_id, label_id, labeled_entities_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_remove: #{e}"
end
```

#### Using the labels_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LabeledEntities>, Integer, Hash)> labels_remove_with_http_info(ad_account_id, label_id, labeled_entities_create)

```ruby
begin
  # Remove label from entities
  data, status_code, headers = api_instance.labels_remove_with_http_info(ad_account_id, label_id, labeled_entities_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LabeledEntities>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LabelsApi->labels_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **label_id** | **String** | Label ID. |  |
| **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  |  |

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labels_update

> <LabelsResponse> labels_update(ad_account_id, label_update_request)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

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
label_update_request = PinterestSdkClient::LabelUpdateRequest.new({labels: [PinterestSdkClient::LabelUpdateItem.new({id: '1106385754497'})]}) # LabelUpdateRequest | 

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

