# PinterestSdkClient::LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**lead_form_get**](LeadFormsApi.md#lead_form_get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
| [**lead_form_test_create**](LeadFormsApi.md#lead_form_test_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
| [**lead_forms_list**](LeadFormsApi.md#lead_forms_list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms |


## lead_form_get

> <LeadFormResponse> lead_form_get(ad_account_id, lead_form_id)

Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadFormsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
lead_form_id = '1234567890123' # String | Unique identifier of a lead form.

begin
  # Get lead form by id
  result = api_instance.lead_form_get(ad_account_id, lead_form_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_get: #{e}"
end
```

#### Using the lead_form_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormResponse>, Integer, Hash)> lead_form_get_with_http_info(ad_account_id, lead_form_id)

```ruby
begin
  # Get lead form by id
  data, status_code, headers = api_instance.lead_form_get_with_http_info(ad_account_id, lead_form_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **lead_form_id** | **String** | Unique identifier of a lead form. |  |

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## lead_form_test_create

> <LeadFormTestResponse> lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_request)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadFormsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
lead_form_id = '1234567890123' # String | Unique identifier of a lead form.
lead_form_test_request = PinterestSdkClient::LeadFormTestRequest.new({answers: ["John", "Doe", "abc@email.com", "987654321"]}) # LeadFormTestRequest | Subscription to create.

begin
  # Create lead form test data
  result = api_instance.lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_test_create: #{e}"
end
```

#### Using the lead_form_test_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormTestResponse>, Integer, Hash)> lead_form_test_create_with_http_info(ad_account_id, lead_form_id, lead_form_test_request)

```ruby
begin
  # Create lead form test data
  data, status_code, headers = api_instance.lead_form_test_create_with_http_info(ad_account_id, lead_form_id, lead_form_test_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormTestResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_test_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **lead_form_id** | **String** | Unique identifier of a lead form. |  |
| **lead_form_test_request** | [**LeadFormTestRequest**](LeadFormTestRequest.md) | Subscription to create. |  |

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## lead_forms_list

> <LeadFormsList200Response> lead_forms_list(ad_account_id, opts)

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadFormsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get lead forms
  result = api_instance.lead_forms_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_list: #{e}"
end
```

#### Using the lead_forms_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormsList200Response>, Integer, Hash)> lead_forms_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get lead forms
  data, status_code, headers = api_instance.lead_forms_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

