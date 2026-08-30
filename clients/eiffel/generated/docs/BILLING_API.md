# BILLING_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ads_credit_redeem**](BILLING_API.md#ads_credit_redeem) | **Post** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**ads_credits_discounts_get**](BILLING_API.md#ads_credits_discounts_get) | **Get** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billing_invoice_download_get**](BILLING_API.md#billing_invoice_download_get) | **Get** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billing_invoices_get**](BILLING_API.md#billing_invoices_get) | **Get** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billing_profiles_get**](BILLING_API.md#billing_profiles_get) | **Get** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssio_accounts_get**](BILLING_API.md#ssio_accounts_get) | **Get** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssio_insertion_order_create**](BILLING_API.md#ssio_insertion_order_create) | **Post** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssio_insertion_order_edit**](BILLING_API.md#ssio_insertion_order_edit) | **Patch** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssio_insertion_orders_status_get_by_ad_account**](BILLING_API.md#ssio_insertion_orders_status_get_by_ad_account) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssio_insertion_orders_status_get_by_pin_order_id**](BILLING_API.md#ssio_insertion_orders_status_get_by_pin_order_id) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssio_order_lines_get_by_ad_account**](BILLING_API.md#ssio_order_lines_get_by_ad_account) | **Get** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **ads_credit_redeem**
> ads_credit_redeem (ad_account_id: STRING_32 ; ads_credit_redeem_create: ADS_CREDIT_REDEEM_CREATE ): detachable ADS_CREDIT_REDEEM


Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ads_credit_redeem_create** | [**ADS_CREDIT_REDEEM_CREATE**](ADS_CREDIT_REDEEM_CREATE.md)|  | 

### Return type

[**ADS_CREDIT_REDEEM**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_credits_discounts_get**
> ads_credits_discounts_get (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable ADS_CREDITS_DISCOUNTS_GET_200_RESPONSE


Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**ADS_CREDITS_DISCOUNTS_GET_200_RESPONSE**](ads_credits_discounts_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_invoice_download_get**
> billing_invoice_download_get (ad_account_id: STRING_32 ; billing_invoice_id: STRING_32 ): detachable BILLING_INVOICE_DOWNLOAD_RESPONSE


Get download url for a billing invoice

Get download url for a billing invoice.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **billing_invoice_id** | **STRING_32**| Unique identifier of a billing invoice. | [default to null]

### Return type

[**BILLING_INVOICE_DOWNLOAD_RESPONSE**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_invoices_get**
> billing_invoices_get (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; sort:  detachable BILLING_INVOICE_SORT_FIELD ; status:  detachable BILLING_INVOICE_STATUS ; document_type:  detachable BILLING_INVOICE_DOCUMENT_TYPE ; start_due_date:  detachable DATE ; end_due_date:  detachable DATE ): detachable BILLING_INVOICES_GET_200_RESPONSE


Get billing invoices

Get billing invoices in the advertiser account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **sort** | [**BILLING_INVOICE_SORT_FIELD**](.md)| Field of which to sort billing invoices | [optional] [default to null]
 **status** | [**BILLING_INVOICE_STATUS**](.md)| Status of billing invoices to filter by | [optional] [default to null]
 **document_type** | [**BILLING_INVOICE_DOCUMENT_TYPE**](.md)| Document type of billing invoices to filter by | [optional] [default to null]
 **start_due_date** | **DATE**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] [default to null]
 **end_due_date** | **DATE**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] [default to null]

### Return type

[**BILLING_INVOICES_GET_200_RESPONSE**](billing_invoices_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_profiles_get**
> billing_profiles_get (is_active: BOOLEAN ; ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BILLING_PROFILES_GET_200_RESPONSE


Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **is_active** | **BOOLEAN**| Return active billing profiles, if false return all billing profiles. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BILLING_PROFILES_GET_200_RESPONSE**](billing_profiles_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_accounts_get**
> ssio_accounts_get (ad_account_id: STRING_32 ): detachable SSIO_ACCOUNT


Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**SSIO_ACCOUNT**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order_create**
> ssio_insertion_order_create (ad_account_id: STRING_32 ; ssio_insertion_order_create: SSIO_INSERTION_ORDER_CREATE ): detachable SSIO_INSERTION_ORDER


Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ssio_insertion_order_create** | [**SSIO_INSERTION_ORDER_CREATE**](SSIO_INSERTION_ORDER_CREATE.md)|  | 

### Return type

[**SSIO_INSERTION_ORDER**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order_edit**
> ssio_insertion_order_edit (ad_account_id: STRING_32 ; ssio_insertion_order_update: SSIO_INSERTION_ORDER_UPDATE ): detachable SSIO_INSERTION_ORDER


Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ssio_insertion_order_update** | [**SSIO_INSERTION_ORDER_UPDATE**](SSIO_INSERTION_ORDER_UPDATE.md)|  | 

### Return type

[**SSIO_INSERTION_ORDER**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status_get_by_ad_account**
> ssio_insertion_orders_status_get_by_ad_account (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable SSIO_INSERTION_ORDERS_STATUS_GET_BY_AD_ACCOUNT_200_RESPONSE


Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SSIO_INSERTION_ORDERS_STATUS_GET_BY_AD_ACCOUNT_200_RESPONSE**](ssio_insertion_orders_status_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status_get_by_pin_order_id**
> ssio_insertion_orders_status_get_by_pin_order_id (ad_account_id: STRING_32 ; pin_order_id: STRING_32 ): detachable SSIO_INSERTION_ORDER_STATUS_RESPONSE


Get insertion order status by pin order id.

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **pin_order_id** | **STRING_32**| The pin order id associated with the ssio insertion order | [default to null]

### Return type

[**SSIO_INSERTION_ORDER_STATUS_RESPONSE**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_order_lines_get_by_ad_account**
> ssio_order_lines_get_by_ad_account (ad_account_id: STRING_32 ; pin_order_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT_200_RESPONSE


Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **pin_order_id** | **STRING_32**| The pin order id associated with the SSIO insertion order | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT_200_RESPONSE**](ssio_order_lines_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

