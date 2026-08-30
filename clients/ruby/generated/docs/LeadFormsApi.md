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

> <LeadForm> lead_form_get(lead_form_id, ad_account_id)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
lead_form_id = 'lead_form_id_example' # String | The ID of this lead form
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get lead form by id
  result = api_instance.lead_form_get(lead_form_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_get: #{e}"
end
```

#### Using the lead_form_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadForm>, Integer, Hash)> lead_form_get_with_http_info(lead_form_id, ad_account_id)

```ruby
begin
  # Get lead form by id
  data, status_code, headers = api_instance.lead_form_get_with_http_info(lead_form_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadForm>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **lead_form_id** | **String** | The ID of this lead form |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**LeadForm**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## lead_form_test_create

> <LeadFormTest> lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_create)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

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
ad_account_id = 'ad_account_id_example' # String | 
lead_form_id = 'lead_form_id_example' # String | Unique identifier of a lead form.
lead_form_test_create = PinterestSdkClient::LeadFormTestCreate.new({answers: ["John", "Doe", "abc@email.com", "987654321"]}) # LeadFormTestCreate | 

begin
  # Create lead form test data
  result = api_instance.lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_test_create: #{e}"
end
```

#### Using the lead_form_test_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormTest>, Integer, Hash)> lead_form_test_create_with_http_info(ad_account_id, lead_form_id, lead_form_test_create)

```ruby
begin
  # Create lead form test data
  data, status_code, headers = api_instance.lead_form_test_create_with_http_info(ad_account_id, lead_form_id, lead_form_test_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormTest>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_form_test_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** |  |  |
| **lead_form_id** | **String** | Unique identifier of a lead form. |  |
| **lead_form_test_create** | [**LeadFormTestCreate**](LeadFormTestCreate.md) |  |  |

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## lead_forms_create

> <LeadFormsCreate200Response> lead_forms_create(ad_account_id, lead_form_create)

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
lead_form_create = [PinterestSdkClient::LeadFormCreate.new({completion_message: 'Thank you for submitting. We will contact you soon.', has_accepted_terms: false, name: 'Lead Form 3/14/2023', privacy_policy_link: 'https://www.advertisername.com/privacy-policy', questions: [{"question_type": "CUSTOM", "custom_question_field_type": "CHECKBOX", "custom_question_label": "What is your favorite animal?", "custom_question_options": ["Dog", "Cat", "Bird", "Turtle"]}]})] # Array<LeadFormCreate> | 

begin
  # Create lead forms
  result = api_instance.lead_forms_create(ad_account_id, lead_form_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_create: #{e}"
end
```

#### Using the lead_forms_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormsCreate200Response>, Integer, Hash)> lead_forms_create_with_http_info(ad_account_id, lead_form_create)

```ruby
begin
  # Create lead forms
  data, status_code, headers = api_instance.lead_forms_create_with_http_info(ad_account_id, lead_form_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **lead_form_create** | [**Array&lt;LeadFormCreate&gt;**](LeadFormCreate.md) |  |  |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## lead_forms_list

> <LeadFormsList200Response> lead_forms_list(ad_account_id, opts)

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
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
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## lead_forms_update

> <LeadFormsCreate200Response> lead_forms_update(ad_account_id, lead_form_batch_update)

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
lead_form_batch_update = [PinterestSdkClient::LeadFormBatchUpdate.new({id: 'id_example'})] # Array<LeadFormBatchUpdate> | 

begin
  # Update lead forms
  result = api_instance.lead_forms_update(ad_account_id, lead_form_batch_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_update: #{e}"
end
```

#### Using the lead_forms_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadFormsCreate200Response>, Integer, Hash)> lead_forms_update_with_http_info(ad_account_id, lead_form_batch_update)

```ruby
begin
  # Update lead forms
  data, status_code, headers = api_instance.lead_forms_update_with_http_info(ad_account_id, lead_form_batch_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadFormsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadFormsApi->lead_forms_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **lead_form_batch_update** | [**Array&lt;LeadFormBatchUpdate&gt;**](LeadFormBatchUpdate.md) |  |  |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

