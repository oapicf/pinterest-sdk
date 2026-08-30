# billing_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**ads_credit/redeem**](billing_api.md#ads_credit/redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
**ads_credits_discounts/get**](billing_api.md#ads_credits_discounts/get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
**billing_invoices/get**](billing_api.md#billing_invoices/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
**billing_profiles/get**](billing_api.md#billing_profiles/get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
**ssio_accounts/get**](billing_api.md#ssio_accounts/get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
**ssio_insertion_order/create**](billing_api.md#ssio_insertion_order/create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
**ssio_insertion_order/edit**](billing_api.md#ssio_insertion_order/edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
**ssio_insertion_orders_status/get_by_ad_account**](billing_api.md#ssio_insertion_orders_status/get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
**ssio_order_lines/get_by_ad_account**](billing_api.md#ssio_order_lines/get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
**billing_invoice_download/get**](billing_api.md#billing_invoice_download/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
**ssio_insertion_orders_status/get_by_pin_order_id**](billing_api.md#ssio_insertion_orders_status/get_by_pin_order_id) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.


# **ads_credit/redeem**
> models::AdsCreditRedeem ads_credit/redeem(ctx, ad_account_id, ads_credit_redeem_create)
Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ads_credit_redeem_create** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md)|  | 

### Return type

[**models::AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_credits_discounts/get**
> models::AdsCreditsDiscountsGet200Response ads_credits_discounts/get(ctx, ad_account_id, optional)
Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::AdsCreditsDiscountsGet200Response**](ads_credits_discounts_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_invoices/get**
> models::BillingInvoicesGet200Response billing_invoices/get(ctx, ad_account_id, optional)
Get billing invoices

Get billing invoices in the advertiser account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **sort** | [****](.md)| Field of which to sort billing invoices | 
 **status** | [****](.md)| Status of billing invoices to filter by | 
 **document_type** | [****](.md)| Document type of billing invoices to filter by | 
 **start_due_date** | **chrono::naive::NaiveDate**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | 
 **end_due_date** | **chrono::naive::NaiveDate**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | 

### Return type

[**models::BillingInvoicesGet200Response**](billing_invoices_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_profiles/get**
> models::BillingProfilesGet200Response billing_profiles/get(ctx, is_active, ad_account_id, optional)
Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **is_active** | **bool**| Return active billing profiles, if false return all billing profiles. | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **is_active** | **bool**| Return active billing profiles, if false return all billing profiles. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::BillingProfilesGet200Response**](billing_profiles_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_accounts/get**
> models::SsioAccount ssio_accounts/get(ctx, ad_account_id)
Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::SsioAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order/create**
> models::SsioInsertionOrder ssio_insertion_order/create(ctx, ad_account_id, ssio_insertion_order_create)
Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ssio_insertion_order_create** | [**SsioInsertionOrderCreate**](SsioInsertionOrderCreate.md)|  | 

### Return type

[**models::SsioInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order/edit**
> models::SsioInsertionOrder ssio_insertion_order/edit(ctx, ad_account_id, ssio_insertion_order_update)
Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ssio_insertion_order_update** | [**SsioInsertionOrderUpdate**](SsioInsertionOrderUpdate.md)|  | 

### Return type

[**models::SsioInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status/get_by_ad_account**
> models::SsioInsertionOrdersStatusGetByAdAccount200Response ssio_insertion_orders_status/get_by_ad_account(ctx, ad_account_id, optional)
Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::SsioInsertionOrdersStatusGetByAdAccount200Response**](ssio_insertion_orders_status_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_order_lines/get_by_ad_account**
> models::SsioOrderLinesGetByAdAccount200Response ssio_order_lines/get_by_ad_account(ctx, ad_account_id, optional)
Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **pin_order_id** | **String**| The pin order id associated with the SSIO insertion order | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::SsioOrderLinesGetByAdAccount200Response**](ssio_order_lines_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_invoice_download/get**
> models::BillingInvoiceDownloadResponse billing_invoice_download/get(ctx, ad_account_id, billing_invoice_id)
Get download url for a billing invoice

Get download url for a billing invoice.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **billing_invoice_id** | **String**| Unique identifier of a billing invoice. | 

### Return type

[**models::BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status/get_by_pin_order_id**
> models::SsioInsertionOrderStatusResponse ssio_insertion_orders_status/get_by_pin_order_id(ctx, ad_account_id, pin_order_id)
Get insertion order status by pin order id.

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **pin_order_id** | **String**| The pin order id associated with the ssio insertion order | 

### Return type

[**models::SsioInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

