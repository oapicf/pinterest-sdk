# PinterestSdkClient::SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**schedules_create**](SchedulesApi.md#schedules_create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**schedules_list**](SchedulesApi.md#schedules_list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**schedules_update**](SchedulesApi.md#schedules_update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |


## schedules_create

> <Array<SchedulesCreate200ResponseInner>> schedules_create(ad_account_id, schedule_create)

Create schedules

Batch create schedules

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::SchedulesApi.new
ad_account_id = 'ad_account_id_example' # String | 
schedule_create = [PinterestSdkClient::ScheduleCreate.new({entity_id: 'entity_id_example'})] # Array<ScheduleCreate> | 

begin
  # Create schedules
  result = api_instance.schedules_create(ad_account_id, schedule_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SchedulesApi->schedules_create: #{e}"
end
```

#### Using the schedules_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<SchedulesCreate200ResponseInner>>, Integer, Hash)> schedules_create_with_http_info(ad_account_id, schedule_create)

```ruby
begin
  # Create schedules
  data, status_code, headers = api_instance.schedules_create_with_http_info(ad_account_id, schedule_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<SchedulesCreate200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SchedulesApi->schedules_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **schedule_create** | [**Array&lt;ScheduleCreate&gt;**](ScheduleCreate.md) |  |  |

### Return type

[**Array&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## schedules_list

> <SchedulesList200Response> schedules_list(ad_account_id, entity_ids, opts)

Get Schedules

Get schedules for a specific advertiser

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::SchedulesApi.new
ad_account_id = 'ad_account_id_example' # String | 
entity_ids = ['inner_example'] # Array<String> | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  schedule_statuses: [PinterestSdkClient::ScheduleStatus::DRAFT], # Array<ScheduleStatus> | Filter schedules by status (one or more)
  schedule_type: PinterestSdkClient::ScheduleType::CAMPAIGN_BUDGET_CHANGE # ScheduleType | Filter schedules by a type
}

begin
  # Get Schedules
  result = api_instance.schedules_list(ad_account_id, entity_ids, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SchedulesApi->schedules_list: #{e}"
end
```

#### Using the schedules_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SchedulesList200Response>, Integer, Hash)> schedules_list_with_http_info(ad_account_id, entity_ids, opts)

```ruby
begin
  # Get Schedules
  data, status_code, headers = api_instance.schedules_list_with_http_info(ad_account_id, entity_ids, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SchedulesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SchedulesApi->schedules_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **entity_ids** | [**Array&lt;String&gt;**](String.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **schedule_statuses** | [**Array&lt;ScheduleStatus&gt;**](ScheduleStatus.md) | Filter schedules by status (one or more) | [optional] |
| **schedule_type** | [**ScheduleType**](.md) | Filter schedules by a type | [optional] |

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## schedules_update

> <Array<SchedulesCreate200ResponseInner>> schedules_update(ad_account_id, schedule_batch_update)

Update schedules

Update one or more schedules

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::SchedulesApi.new
ad_account_id = 'ad_account_id_example' # String | 
schedule_batch_update = [PinterestSdkClient::ScheduleBatchUpdate.new({id: 'id_example', schedule_id: 'schedule_id_example'})] # Array<ScheduleBatchUpdate> | 

begin
  # Update schedules
  result = api_instance.schedules_update(ad_account_id, schedule_batch_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SchedulesApi->schedules_update: #{e}"
end
```

#### Using the schedules_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<SchedulesCreate200ResponseInner>>, Integer, Hash)> schedules_update_with_http_info(ad_account_id, schedule_batch_update)

```ruby
begin
  # Update schedules
  data, status_code, headers = api_instance.schedules_update_with_http_info(ad_account_id, schedule_batch_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<SchedulesCreate200ResponseInner>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SchedulesApi->schedules_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **schedule_batch_update** | [**Array&lt;ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md) |  |  |

### Return type

[**Array&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

