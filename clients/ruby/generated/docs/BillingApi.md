# PinterestSdkClient::BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ads_credit_redeem**](BillingApi.md#ads_credit_redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
| [**ads_credits_discounts_get**](BillingApi.md#ads_credits_discounts_get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
| [**billing_invoice_download_get**](BillingApi.md#billing_invoice_download_get) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice |
| [**billing_invoices_get**](BillingApi.md#billing_invoices_get) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices |
| [**billing_profiles_get**](BillingApi.md#billing_profiles_get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
| [**ssio_accounts_get**](BillingApi.md#ssio_accounts_get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
| [**ssio_insertion_order_create**](BillingApi.md#ssio_insertion_order_create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
| [**ssio_insertion_order_edit**](BillingApi.md#ssio_insertion_order_edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
| [**ssio_insertion_orders_status_get_by_ad_account**](BillingApi.md#ssio_insertion_orders_status_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
| [**ssio_insertion_orders_status_get_by_pin_order_id**](BillingApi.md#ssio_insertion_orders_status_get_by_pin_order_id) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
| [**ssio_order_lines_get_by_ad_account**](BillingApi.md#ssio_order_lines_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |


## ads_credit_redeem

> <AdsCreditRedeem> ads_credit_redeem(ad_account_id, ads_credit_redeem_create)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
ads_credit_redeem_create = PinterestSdkClient::AdsCreditRedeemCreate.new({offer_code_hash: '138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67', validate_only: true}) # AdsCreditRedeemCreate | 

begin
  # Redeem ad credits
  result = api_instance.ads_credit_redeem(ad_account_id, ads_credit_redeem_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ads_credit_redeem: #{e}"
end
```

#### Using the ads_credit_redeem_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdsCreditRedeem>, Integer, Hash)> ads_credit_redeem_with_http_info(ad_account_id, ads_credit_redeem_create)

```ruby
begin
  # Redeem ad credits
  data, status_code, headers = api_instance.ads_credit_redeem_with_http_info(ad_account_id, ads_credit_redeem_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdsCreditRedeem>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ads_credit_redeem_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ads_credit_redeem_create** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md) |  |  |

### Return type

[**AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ads_credits_discounts_get

> <AdsCreditsDiscountsGet200Response> ads_credits_discounts_get(ad_account_id, opts)

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billing_invoice_download_get

> <BillingInvoiceDownloadResponse> billing_invoice_download_get(ad_account_id, billing_invoice_id)

Get download url for a billing invoice

Get download url for a billing invoice.

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
billing_invoice_id = 'billing_invoice_id_example' # String | Unique identifier of a billing invoice.

begin
  # Get download url for a billing invoice
  result = api_instance.billing_invoice_download_get(ad_account_id, billing_invoice_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_invoice_download_get: #{e}"
end
```

#### Using the billing_invoice_download_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BillingInvoiceDownloadResponse>, Integer, Hash)> billing_invoice_download_get_with_http_info(ad_account_id, billing_invoice_id)

```ruby
begin
  # Get download url for a billing invoice
  data, status_code, headers = api_instance.billing_invoice_download_get_with_http_info(ad_account_id, billing_invoice_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BillingInvoiceDownloadResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_invoice_download_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **billing_invoice_id** | **String** | Unique identifier of a billing invoice. |  |

### Return type

[**BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billing_invoices_get

> <BillingInvoicesGet200Response> billing_invoices_get(ad_account_id, opts)

Get billing invoices

Get billing invoices in the advertiser account.

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
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  sort: PinterestSdkClient::BillingInvoiceSortField::DUE_DATE, # BillingInvoiceSortField | Field of which to sort billing invoices
  status: PinterestSdkClient::BillingInvoiceStatus::OPEN, # BillingInvoiceStatus | Status of billing invoices to filter by
  document_type: PinterestSdkClient::BillingInvoiceDocumentType::INVOICE, # BillingInvoiceDocumentType | Document type of billing invoices to filter by
  start_due_date: Date.parse('2013-10-20'), # Date | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
  end_due_date: Date.parse('2013-10-20') # Date | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
}

begin
  # Get billing invoices
  result = api_instance.billing_invoices_get(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_invoices_get: #{e}"
end
```

#### Using the billing_invoices_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BillingInvoicesGet200Response>, Integer, Hash)> billing_invoices_get_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get billing invoices
  data, status_code, headers = api_instance.billing_invoices_get_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BillingInvoicesGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_invoices_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **sort** | [**BillingInvoiceSortField**](.md) | Field of which to sort billing invoices | [optional][default to &#39;DUE_DATE&#39;] |
| **status** | [**BillingInvoiceStatus**](.md) | Status of billing invoices to filter by | [optional] |
| **document_type** | [**BillingInvoiceDocumentType**](.md) | Document type of billing invoices to filter by | [optional] |
| **start_due_date** | **Date** | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] |
| **end_due_date** | **Date** | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] |

### Return type

[**BillingInvoicesGet200Response**](BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billing_profiles_get

> <BillingProfilesGet200Response> billing_profiles_get(is_active, ad_account_id, opts)

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
is_active = true # Boolean | Return active billing profiles, if false return all billing profiles.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
}

begin
  # Get billing profiles
  result = api_instance.billing_profiles_get(is_active, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->billing_profiles_get: #{e}"
end
```

#### Using the billing_profiles_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BillingProfilesGet200Response>, Integer, Hash)> billing_profiles_get_with_http_info(is_active, ad_account_id, opts)

```ruby
begin
  # Get billing profiles
  data, status_code, headers = api_instance.billing_profiles_get_with_http_info(is_active, ad_account_id, opts)
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
| **is_active** | **Boolean** | Return active billing profiles, if false return all billing profiles. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssio_accounts_get

> <SSIOAccount> ssio_accounts_get(ad_account_id)

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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

> <Array(<SSIOAccount>, Integer, Hash)> ssio_accounts_get_with_http_info(ad_account_id)

```ruby
begin
  # Get Salesforce account details including bill-to information.
  data, status_code, headers = api_instance.ssio_accounts_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOAccount>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_accounts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**SSIOAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssio_insertion_order_create

> <SSIOInsertionOrder> ssio_insertion_order_create(ad_account_id, ssio_insertion_order_create)

Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
ssio_insertion_order_create = PinterestSdkClient::SSIOInsertionOrderCreate.new({accepted_terms_id: 'accepted_terms_id_example', billing_contact_email: 'billing_contact_email_example', billing_contact_firstname: 'billing_contact_firstname_example', billing_contact_lastname: 'billing_contact_lastname_example', billto_billing_address_id: 'billto_billing_address_id_example', billto_business_address_id: 'billto_business_address_id_example', billto_company_id: 'billto_company_id_example', currency_info: PinterestSdkClient::Currency::UNK, media_contact_email: 'media_contact_email_example', media_contact_firstname: 'media_contact_firstname_example', media_contact_lastname: 'media_contact_lastname_example', order_line_type: PinterestSdkClient::SSIOOrderLineType::BUDGET, order_name: 'order_name_example', pmp_id: 'pmp_id_example', po_number: 'po_number_example', start_date: 'start_date_example'}) # SSIOInsertionOrderCreate | 

begin
  # Create insertion order through SSIO.
  result = api_instance.ssio_insertion_order_create(ad_account_id, ssio_insertion_order_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_create: #{e}"
end
```

#### Using the ssio_insertion_order_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SSIOInsertionOrder>, Integer, Hash)> ssio_insertion_order_create_with_http_info(ad_account_id, ssio_insertion_order_create)

```ruby
begin
  # Create insertion order through SSIO.
  data, status_code, headers = api_instance.ssio_insertion_order_create_with_http_info(ad_account_id, ssio_insertion_order_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOInsertionOrder>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ssio_insertion_order_create** | [**SSIOInsertionOrderCreate**](SSIOInsertionOrderCreate.md) |  |  |

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssio_insertion_order_edit

> <SSIOInsertionOrder> ssio_insertion_order_edit(ad_account_id, ssio_insertion_order_update)

Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
ssio_insertion_order_update = PinterestSdkClient::SSIOInsertionOrderUpdate.new # SSIOInsertionOrderUpdate | 

begin
  # Edit insertion order through SSIO.
  result = api_instance.ssio_insertion_order_edit(ad_account_id, ssio_insertion_order_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_edit: #{e}"
end
```

#### Using the ssio_insertion_order_edit_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SSIOInsertionOrder>, Integer, Hash)> ssio_insertion_order_edit_with_http_info(ad_account_id, ssio_insertion_order_update)

```ruby
begin
  # Edit insertion order through SSIO.
  data, status_code, headers = api_instance.ssio_insertion_order_edit_with_http_info(ad_account_id, ssio_insertion_order_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SSIOInsertionOrder>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BillingApi->ssio_insertion_order_edit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ssio_insertion_order_update** | [**SSIOInsertionOrderUpdate**](SSIOInsertionOrderUpdate.md) |  |  |

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssio_insertion_orders_status_get_by_ad_account

> <SsioInsertionOrdersStatusGetByAdAccount200Response> ssio_insertion_orders_status_get_by_ad_account(ad_account_id, opts)

Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

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

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
pin_order_id = 'pin_order_id_example' # String | The pin order id associated with the ssio insertion order

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

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
  pin_order_id: 'pin_order_id_example', # String | The pin order id associated with the SSIO insertion order
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **pin_order_id** | **String** | The pin order id associated with the SSIO insertion order | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

