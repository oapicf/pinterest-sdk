# PinterestSdkClient::BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ads_credit_redeem**](BillingApi.md#ads_credit_redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
| [**ads_credits_discounts_get**](BillingApi.md#ads_credits_discounts_get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
| [**billing_profiles_get**](BillingApi.md#billing_profiles_get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
| [**ssio_accounts_get**](BillingApi.md#ssio_accounts_get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
| [**ssio_insertion_order_create**](BillingApi.md#ssio_insertion_order_create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
| [**ssio_insertion_order_edit**](BillingApi.md#ssio_insertion_order_edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
| [**ssio_insertion_orders_status_get_by_ad_account**](BillingApi.md#ssio_insertion_orders_status_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
| [**ssio_insertion_orders_status_get_by_pin_order_id**](BillingApi.md#ssio_insertion_orders_status_get_by_pin_order_id) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
| [**ssio_order_lines_get_by_ad_account**](BillingApi.md#ssio_order_lines_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |


## ads_credit_redeem

> <AdsCreditRedeemResponse> ads_credit_redeem(ad_account_id, ads_credit_redeem_request)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ads_credit_redeem_request = PinterestSdkClient::AdsCreditRedeemRequest.new({offer_code_hash: '138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67', validate_only: true}) # AdsCreditRedeemRequest | Redeem ad credits request.

begin
  # Redeem ad credits
  result = api_instance.ads_credit_redeem(ad_account_id, ads_credit_redeem_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ads_credit_redeem: #{e}"
end
```

#### Using the ads_credit_redeem_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdsCreditRedeemResponse>, Integer, Hash)> ads_credit_redeem_with_http_info(ad_account_id, ads_credit_redeem_request)

```ruby
begin
  # Redeem ad credits
  data, status_code, headers = api_instance.ads_credit_redeem_with_http_info(ad_account_id, ads_credit_redeem_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsCreditRedeemResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ads_credit_redeem_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ads_credit_redeem_request** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md) | Redeem ad credits request. |  |

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ads_credits_discounts_get

> <AdsCreditsDiscountsGet200Response> ads_credits_discounts_get(ad_account_id, opts)

Get ads credit discounts

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get ads credit discounts
  result = api_instance.ads_credits_discounts_get(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ads_credits_discounts_get: #{e}"
end
```

#### Using the ads_credits_discounts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdsCreditsDiscountsGet200Response>, Integer, Hash)> ads_credits_discounts_get_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get ads credit discounts
  data, status_code, headers = api_instance.ads_credits_discounts_get_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsCreditsDiscountsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ads_credits_discounts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billing_profiles_get

> <BillingProfilesGet200Response> billing_profiles_get(ad_account_id, is_active, opts)

Get billing profiles

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
is_active = true # Boolean | Return active billing profiles, if false return all billing profiles.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get billing profiles
  result = api_instance.billing_profiles_get(ad_account_id, is_active, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_profiles_get: #{e}"
end
```

#### Using the billing_profiles_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BillingProfilesGet200Response>, Integer, Hash)> billing_profiles_get_with_http_info(ad_account_id, is_active, opts)

```ruby
begin
  # Get billing profiles
  data, status_code, headers = api_instance.billing_profiles_get_with_http_info(ad_account_id, is_active, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BillingProfilesGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_profiles_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **is_active** | **Boolean** | Return active billing profiles, if false return all billing profiles. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssio_accounts_get

> <SSIOAccountResponse> ssio_accounts_get(ad_account_id)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get Salesforce account details including bill-to information.
  result = api_instance.ssio_accounts_get(ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_accounts_get: #{e}"
end
```

#### Using the ssio_accounts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SSIOAccountResponse>, Integer, Hash)> ssio_accounts_get_with_http_info(ad_account_id)

```ruby
begin
  # Get Salesforce account details including bill-to information.
  data, status_code, headers = api_instance.ssio_accounts_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOAccountResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_accounts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssio_insertion_order_create

> <SSIOCreateInsertionOrderResponse> ssio_insertion_order_create(ad_account_id, ssio_create_insertion_order_request)

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ssio_create_insertion_order_request = PinterestSdkClient::SSIOCreateInsertionOrderRequest.new({start_date: '2020-12-20', po_number: 'po_number_example', billing_contact_firstname: 'billing_contact_firstname_example', billing_contact_lastname: 'billing_contact_lastname_example', billing_contact_email: 'test@example', media_contact_firstname: 'media_contact_firstname_example', media_contact_lastname: 'media_contact_lastname_example', media_contact_email: 'test@example', pmp_id: 'pmp_id_example', order_name: 'order_name_example', order_line_type: 'BUDGET', accepted_terms_id: 'accepted_terms_id_example', billto_company_id: 'billto_company_id_example', billto_business_address_id: 'billto_business_address_id_example', billto_billing_address_id: 'billto_billing_address_id_example', currency_info: PinterestSdkClient::Currency::UNK}) # SSIOCreateInsertionOrderRequest | Order line to create.

begin
  # Create insertion order through SSIO.
  result = api_instance.ssio_insertion_order_create(ad_account_id, ssio_create_insertion_order_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_create: #{e}"
end
```

#### Using the ssio_insertion_order_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SSIOCreateInsertionOrderResponse>, Integer, Hash)> ssio_insertion_order_create_with_http_info(ad_account_id, ssio_create_insertion_order_request)

```ruby
begin
  # Create insertion order through SSIO.
  data, status_code, headers = api_instance.ssio_insertion_order_create_with_http_info(ad_account_id, ssio_create_insertion_order_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOCreateInsertionOrderResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ssio_create_insertion_order_request** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md) | Order line to create. |  |

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssio_insertion_order_edit

> <SSIOEditInsertionOrderResponse> ssio_insertion_order_edit(ad_account_id, ssio_edit_insertion_order_request)

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ssio_edit_insertion_order_request = PinterestSdkClient::SSIOEditInsertionOrderRequest.new # SSIOEditInsertionOrderRequest | Order line to create.

begin
  # Edit insertion order through SSIO.
  result = api_instance.ssio_insertion_order_edit(ad_account_id, ssio_edit_insertion_order_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_edit: #{e}"
end
```

#### Using the ssio_insertion_order_edit_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SSIOEditInsertionOrderResponse>, Integer, Hash)> ssio_insertion_order_edit_with_http_info(ad_account_id, ssio_edit_insertion_order_request)

```ruby
begin
  # Edit insertion order through SSIO.
  data, status_code, headers = api_instance.ssio_insertion_order_edit_with_http_info(ad_account_id, ssio_edit_insertion_order_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOEditInsertionOrderResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_edit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ssio_edit_insertion_order_request** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md) | Order line to create. |  |

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssio_insertion_orders_status_get_by_ad_account

> <SsioInsertionOrdersStatusGetByAdAccount200Response> ssio_insertion_orders_status_get_by_ad_account(ad_account_id, opts)

Get insertion order status by ad account id.

Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get insertion order status by ad account id.
  result = api_instance.ssio_insertion_orders_status_get_by_ad_account(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_orders_status_get_by_ad_account: #{e}"
end
```

#### Using the ssio_insertion_orders_status_get_by_ad_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SsioInsertionOrdersStatusGetByAdAccount200Response>, Integer, Hash)> ssio_insertion_orders_status_get_by_ad_account_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get insertion order status by ad account id.
  data, status_code, headers = api_instance.ssio_insertion_orders_status_get_by_ad_account_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SsioInsertionOrdersStatusGetByAdAccount200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_orders_status_get_by_ad_account_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssio_insertion_orders_status_get_by_pin_order_id

> <SSIOInsertionOrderStatusResponse> ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id, pin_order_id)

Get insertion order status by pin order id.

Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
pin_order_id = '0Q01N0000015hekSVDFDC' # String | The pin order id associated with the ssio insertion order

begin
  # Get insertion order status by pin order id.
  result = api_instance.ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id, pin_order_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_orders_status_get_by_pin_order_id: #{e}"
end
```

#### Using the ssio_insertion_orders_status_get_by_pin_order_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SSIOInsertionOrderStatusResponse>, Integer, Hash)> ssio_insertion_orders_status_get_by_pin_order_id_with_http_info(ad_account_id, pin_order_id)

```ruby
begin
  # Get insertion order status by pin order id.
  data, status_code, headers = api_instance.ssio_insertion_orders_status_get_by_pin_order_id_with_http_info(ad_account_id, pin_order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOInsertionOrderStatusResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_orders_status_get_by_pin_order_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **pin_order_id** | **String** | The pin order id associated with the ssio insertion order |  |

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssio_order_lines_get_by_ad_account

> <SsioOrderLinesGetByAdAccount200Response> ssio_order_lines_get_by_ad_account(ad_account_id, opts)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BillingApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  pin_order_id: '0Q01N0000015hekSVDFDC' # String | The pin order id associated with the ssio insertino order
}

begin
  # Get Salesforce order lines by ad account id.
  result = api_instance.ssio_order_lines_get_by_ad_account(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_order_lines_get_by_ad_account: #{e}"
end
```

#### Using the ssio_order_lines_get_by_ad_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SsioOrderLinesGetByAdAccount200Response>, Integer, Hash)> ssio_order_lines_get_by_ad_account_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get Salesforce order lines by ad account id.
  data, status_code, headers = api_instance.ssio_order_lines_get_by_ad_account_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SsioOrderLinesGetByAdAccount200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_order_lines_get_by_ad_account_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **pin_order_id** | **String** | The pin order id associated with the ssio insertino order | [optional] |

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

