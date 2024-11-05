# PinterestSdkClient::LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**lead_form_get**](LeadFormsApi.md#lead_form_get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
| [**lead_form_test_create**](LeadFormsApi.md#lead_form_test_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
| [**lead_forms_create**](LeadFormsApi.md#lead_forms_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
| [**lead_forms_list**](LeadFormsApi.md#lead_forms_list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
| [**lead_forms_update**](LeadFormsApi.md#lead_forms_update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |


## lead_form_get

> <LeadFormResponse> lead_form_get(ad_account_id, lead_form_id)

Get lead form by id

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

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

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

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


## lead_forms_create

> <LeadFormArrayResponse> lead_forms_create(ad_account_id, lead_form_create_request)

Create lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

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
lead_form_create_request = [PinterestSdkClient::LeadFormCreateRequest.new({name: 'Lead Form 3/14/2023', privacy_policy_link: 'https://www.advertisername.com/privacy-policy', has_accepted_terms: false, completion_message: 'Thank you for submitting. We will contact you soon.', questions: [{question_type=CUSTOM,  custom_question_field_type=CHECKBOX,  custom_question_label=What is your favorite animal?,  custom_question_options=[Dog,  Cat,  Bird,  Turtle]}]})] # Array<LeadFormCreateRequest> | List of lead forms to create, size limit [1, 30].

begin
  # Create lead forms
  result = api_instance.lead_forms_create(ad_account_id, lead_form_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_create: #{e}"
end
```

#### Using the lead_forms_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormArrayResponse>, Integer, Hash)> lead_forms_create_with_http_info(ad_account_id, lead_form_create_request)

```ruby
begin
  # Create lead forms
  data, status_code, headers = api_instance.lead_forms_create_with_http_info(ad_account_id, lead_form_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormArrayResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **lead_form_create_request** | [**Array&lt;LeadFormCreateRequest&gt;**](LeadFormCreateRequest.md) | List of lead forms to create, size limit [1, 30]. |  |

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## lead_forms_list

> <LeadFormsList200Response> lead_forms_list(ad_account_id, opts)

List lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

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
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List lead forms
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
  # List lead forms
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
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## lead_forms_update

> <LeadFormArrayResponse> lead_forms_update(ad_account_id, lead_form_update_request)

Update lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

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
lead_form_update_request = [PinterestSdkClient::LeadFormUpdateRequest.new({id: '7765300871171'})] # Array<LeadFormUpdateRequest> | List of lead forms to update, size limit [1, 30].

begin
  # Update lead forms
  result = api_instance.lead_forms_update(ad_account_id, lead_form_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_update: #{e}"
end
```

#### Using the lead_forms_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormArrayResponse>, Integer, Hash)> lead_forms_update_with_http_info(ad_account_id, lead_form_update_request)

```ruby
begin
  # Update lead forms
  data, status_code, headers = api_instance.lead_forms_update_with_http_info(ad_account_id, lead_form_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormArrayResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **lead_form_update_request** | [**Array&lt;LeadFormUpdateRequest&gt;**](LeadFormUpdateRequest.md) | List of lead forms to update, size limit [1, 30]. |  |

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

