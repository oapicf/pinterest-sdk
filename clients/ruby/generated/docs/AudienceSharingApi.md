# PinterestSdkClient::AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ad_accounts_audiences_shared_accounts_list**](AudienceSharingApi.md#ad_accounts_audiences_shared_accounts_list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**business_account_audiences_shared_accounts_list**](AudienceSharingApi.md#business_account_audiences_shared_accounts_list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**shared_audiences_for_business_list**](AudienceSharingApi.md#shared_audiences_for_business_list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**update_ad_account_to_ad_account_shared_audience**](AudienceSharingApi.md#update_ad_account_to_ad_account_shared_audience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**update_ad_account_to_business_shared_audience**](AudienceSharingApi.md#update_ad_account_to_business_shared_audience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**update_business_to_ad_account_shared_audience**](AudienceSharingApi.md#update_business_to_ad_account_shared_audience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**update_business_to_business_shared_audience**](AudienceSharingApi.md#update_business_to_business_shared_audience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |


## ad_accounts_audiences_shared_accounts_list

> <AdAccountsAudiencesSharedAccountsList200Response> ad_accounts_audiences_shared_accounts_list(ad_account_id, audience_id, account_type, opts)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
audience_id = 'audience_id_example' # String | Unique identifier of the audience to use to filter the results.
account_type = PinterestSdkClient::AudienceAccountType::AD_ACCOUNT # AudienceAccountType | Filter accounts by account type.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List accounts with access to an audience owned by an ad account
  result = api_instance.ad_accounts_audiences_shared_accounts_list(ad_account_id, audience_id, account_type, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->ad_accounts_audiences_shared_accounts_list: #{e}"
end
```

#### Using the ad_accounts_audiences_shared_accounts_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsAudiencesSharedAccountsList200Response>, Integer, Hash)> ad_accounts_audiences_shared_accounts_list_with_http_info(ad_account_id, audience_id, account_type, opts)

```ruby
begin
  # List accounts with access to an audience owned by an ad account
  data, status_code, headers = api_instance.ad_accounts_audiences_shared_accounts_list_with_http_info(ad_account_id, audience_id, account_type, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsAudiencesSharedAccountsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->ad_accounts_audiences_shared_accounts_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **audience_id** | **String** | Unique identifier of the audience to use to filter the results. |  |
| **account_type** | [**AudienceAccountType**](.md) | Filter accounts by account type. | [default to &#39;AD_ACCOUNT&#39;] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## business_account_audiences_shared_accounts_list

> <AdAccountsAudiencesSharedAccountsList200Response> business_account_audiences_shared_accounts_list(business_id, audience_id, account_type, opts)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
audience_id = 'audience_id_example' # String | Unique identifier of the audience to use to filter the results.
account_type = PinterestSdkClient::AudienceAccountType::AD_ACCOUNT # AudienceAccountType | Filter accounts by account type.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List accounts with access to an audience owned by a business
  result = api_instance.business_account_audiences_shared_accounts_list(business_id, audience_id, account_type, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->business_account_audiences_shared_accounts_list: #{e}"
end
```

#### Using the business_account_audiences_shared_accounts_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsAudiencesSharedAccountsList200Response>, Integer, Hash)> business_account_audiences_shared_accounts_list_with_http_info(business_id, audience_id, account_type, opts)

```ruby
begin
  # List accounts with access to an audience owned by a business
  data, status_code, headers = api_instance.business_account_audiences_shared_accounts_list_with_http_info(business_id, audience_id, account_type, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsAudiencesSharedAccountsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->business_account_audiences_shared_accounts_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **audience_id** | **String** | Unique identifier of the audience to use to filter the results. |  |
| **account_type** | [**AudienceAccountType**](.md) | Filter accounts by account type. | [default to &#39;AD_ACCOUNT&#39;] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## shared_audiences_for_business_list

> <AudiencesList200Response> shared_audiences_for_business_list(business_id, opts)

List received audiences for a business

Get a list of received audiences for the given business.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # List received audiences for a business
  result = api_instance.shared_audiences_for_business_list(business_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->shared_audiences_for_business_list: #{e}"
end
```

#### Using the shared_audiences_for_business_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AudiencesList200Response>, Integer, Hash)> shared_audiences_for_business_list_with_http_info(business_id, opts)

```ruby
begin
  # List received audiences for a business
  data, status_code, headers = api_instance.shared_audiences_for_business_list_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudiencesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->shared_audiences_for_business_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_ad_account_to_ad_account_shared_audience

> <SharedAudienceResponse> update_ad_account_to_ad_account_shared_audience(ad_account_id, shared_audience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
shared_audience = PinterestSdkClient::SharedAudience.new({audience_id: '2542621871096', operation_type: PinterestSdkClient::OperationType::SHARE, recipient_account_ids: ['recipient_account_ids_example']}) # SharedAudience | 

begin
  # Update audience sharing between ad accounts
  result = api_instance.update_ad_account_to_ad_account_shared_audience(ad_account_id, shared_audience)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_ad_account_to_ad_account_shared_audience: #{e}"
end
```

#### Using the update_ad_account_to_ad_account_shared_audience_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SharedAudienceResponse>, Integer, Hash)> update_ad_account_to_ad_account_shared_audience_with_http_info(ad_account_id, shared_audience)

```ruby
begin
  # Update audience sharing between ad accounts
  data, status_code, headers = api_instance.update_ad_account_to_ad_account_shared_audience_with_http_info(ad_account_id, shared_audience)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SharedAudienceResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_ad_account_to_ad_account_shared_audience_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **shared_audience** | [**SharedAudience**](SharedAudience.md) |  |  |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_ad_account_to_business_shared_audience

> <BusinessSharedAudienceResponse> update_ad_account_to_business_shared_audience(ad_account_id, business_shared_audience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
business_shared_audience = PinterestSdkClient::BusinessSharedAudience.new({audience_id: '2542621871096', operation_type: PinterestSdkClient::OperationType::SHARE, recipient_business_ids: ['recipient_business_ids_example']}) # BusinessSharedAudience | 

begin
  # Update audience sharing from an ad account to businesses
  result = api_instance.update_ad_account_to_business_shared_audience(ad_account_id, business_shared_audience)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_ad_account_to_business_shared_audience: #{e}"
end
```

#### Using the update_ad_account_to_business_shared_audience_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessSharedAudienceResponse>, Integer, Hash)> update_ad_account_to_business_shared_audience_with_http_info(ad_account_id, business_shared_audience)

```ruby
begin
  # Update audience sharing from an ad account to businesses
  data, status_code, headers = api_instance.update_ad_account_to_business_shared_audience_with_http_info(ad_account_id, business_shared_audience)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessSharedAudienceResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_ad_account_to_business_shared_audience_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **business_shared_audience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  |  |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_business_to_ad_account_shared_audience

> <SharedAudienceResponse> update_business_to_ad_account_shared_audience(business_id, shared_audience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
shared_audience = PinterestSdkClient::SharedAudience.new({audience_id: '2542621871096', operation_type: PinterestSdkClient::OperationType::SHARE, recipient_account_ids: ['recipient_account_ids_example']}) # SharedAudience | 

begin
  # Update audience sharing from a business to ad accounts
  result = api_instance.update_business_to_ad_account_shared_audience(business_id, shared_audience)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_business_to_ad_account_shared_audience: #{e}"
end
```

#### Using the update_business_to_ad_account_shared_audience_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SharedAudienceResponse>, Integer, Hash)> update_business_to_ad_account_shared_audience_with_http_info(business_id, shared_audience)

```ruby
begin
  # Update audience sharing from a business to ad accounts
  data, status_code, headers = api_instance.update_business_to_ad_account_shared_audience_with_http_info(business_id, shared_audience)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SharedAudienceResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_business_to_ad_account_shared_audience_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **shared_audience** | [**SharedAudience**](SharedAudience.md) |  |  |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_business_to_business_shared_audience

> <BusinessSharedAudienceResponse> update_business_to_business_shared_audience(business_id, business_shared_audience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudienceSharingApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
business_shared_audience = PinterestSdkClient::BusinessSharedAudience.new({audience_id: '2542621871096', operation_type: PinterestSdkClient::OperationType::SHARE, recipient_business_ids: ['recipient_business_ids_example']}) # BusinessSharedAudience | 

begin
  # Update audience sharing between businesses
  result = api_instance.update_business_to_business_shared_audience(business_id, business_shared_audience)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_business_to_business_shared_audience: #{e}"
end
```

#### Using the update_business_to_business_shared_audience_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessSharedAudienceResponse>, Integer, Hash)> update_business_to_business_shared_audience_with_http_info(business_id, business_shared_audience)

```ruby
begin
  # Update audience sharing between businesses
  data, status_code, headers = api_instance.update_business_to_business_shared_audience_with_http_info(business_id, business_shared_audience)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessSharedAudienceResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudienceSharingApi->update_business_to_business_shared_audience_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **business_shared_audience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  |  |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

