# BillingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BillingAPI_adsCreditRedeem**](BillingAPI.md#BillingAPI_adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**BillingAPI_adsCreditsDiscountsGet**](BillingAPI.md#BillingAPI_adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**BillingAPI_billingInvoiceDownloadGet**](BillingAPI.md#BillingAPI_billingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**BillingAPI_billingInvoicesGet**](BillingAPI.md#BillingAPI_billingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**BillingAPI_billingProfilesGet**](BillingAPI.md#BillingAPI_billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**BillingAPI_ssioAccountsGet**](BillingAPI.md#BillingAPI_ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**BillingAPI_ssioInsertionOrderCreate**](BillingAPI.md#BillingAPI_ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**BillingAPI_ssioInsertionOrderEdit**](BillingAPI.md#BillingAPI_ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**BillingAPI_ssioInsertionOrdersStatusGetByAdAccount**](BillingAPI.md#BillingAPI_ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**BillingAPI_ssioInsertionOrdersStatusGetByPinOrderId**](BillingAPI.md#BillingAPI_ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**BillingAPI_ssioOrderLinesGetByAdAccount**](BillingAPI.md#BillingAPI_ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **BillingAPI_adsCreditRedeem**
```c
// Redeem ad credits
//
// Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
ads_credit_redeem_t* BillingAPI_adsCreditRedeem(apiClient_t *apiClient, char *ad_account_id, ads_credit_redeem_create_t *ads_credit_redeem_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ads_credit_redeem_create** | **[ads_credit_redeem_create_t](ads_credit_redeem_create.md) \*** |  | 

### Return type

[ads_credit_redeem_t](ads_credit_redeem.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_adsCreditsDiscountsGet**
```c
// Get ads credit discounts
//
// Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
ads_credits_discounts_get_200_response_t* BillingAPI_adsCreditsDiscountsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[ads_credits_discounts_get_200_response_t](ads_credits_discounts_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_billingInvoiceDownloadGet**
```c
// Get download url for a billing invoice
//
// Get download url for a billing invoice.
//
billing_invoice_download_response_t* BillingAPI_billingInvoiceDownloadGet(apiClient_t *apiClient, char *ad_account_id, char *billing_invoice_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**billing_invoice_id** | **char \*** | Unique identifier of a billing invoice. | 

### Return type

[billing_invoice_download_response_t](billing_invoice_download_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_billingInvoicesGet**
```c
// Get billing invoices
//
// Get billing invoices in the advertiser account.
//
billing_invoices_get_200_response_t* BillingAPI_billingInvoicesGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, billing_invoice_sort_field_e sort, billing_invoice_status_e status, billing_invoice_document_type_e document_type, char start_due_date, char end_due_date);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**sort** | **billing_invoice_sort_field_e** | Field of which to sort billing invoices | [optional] 
**status** | **billing_invoice_status_e** | Status of billing invoices to filter by | [optional] 
**document_type** | **billing_invoice_document_type_e** | Document type of billing invoices to filter by | [optional] 
**start_due_date** | **char** | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 
**end_due_date** | **char** | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 

### Return type

[billing_invoices_get_200_response_t](billing_invoices_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_billingProfilesGet**
```c
// Get billing profiles
//
// Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
billing_profiles_get_200_response_t* BillingAPI_billingProfilesGet(apiClient_t *apiClient, int *is_active, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**is_active** | **int \*** | Return active billing profiles, if false return all billing profiles. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[billing_profiles_get_200_response_t](billing_profiles_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_ssioAccountsGet**
```c
// Get Salesforce account details including bill-to information.
//
//   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_account_t* BillingAPI_ssioAccountsGet(apiClient_t *apiClient, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[ssio_account_t](ssio_account.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_ssioInsertionOrderCreate**
```c
// Create insertion order through SSIO.
//
//   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_order_t* BillingAPI_ssioInsertionOrderCreate(apiClient_t *apiClient, char *ad_account_id, ssio_insertion_order_create_t *ssio_insertion_order_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ssio_insertion_order_create** | **[ssio_insertion_order_create_t](ssio_insertion_order_create.md) \*** |  | 

### Return type

[ssio_insertion_order_t](ssio_insertion_order.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_ssioInsertionOrderEdit**
```c
// Edit insertion order through SSIO.
//
//   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_order_t* BillingAPI_ssioInsertionOrderEdit(apiClient_t *apiClient, char *ad_account_id, ssio_insertion_order_update_t *ssio_insertion_order_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ssio_insertion_order_update** | **[ssio_insertion_order_update_t](ssio_insertion_order_update.md) \*** |  | 

### Return type

[ssio_insertion_order_t](ssio_insertion_order.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_ssioInsertionOrdersStatusGetByAdAccount**
```c
// Get insertion order status by ad account id.
//
//   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_orders_status_get_by_ad_account_200_response_t* BillingAPI_ssioInsertionOrdersStatusGetByAdAccount(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[ssio_insertion_orders_status_get_by_ad_account_200_response_t](ssio_insertion_orders_status_get_by_ad_account_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_ssioInsertionOrdersStatusGetByPinOrderId**
```c
// Get insertion order status by pin order id.
//
//   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_order_status_response_t* BillingAPI_ssioInsertionOrdersStatusGetByPinOrderId(apiClient_t *apiClient, char *ad_account_id, char *pin_order_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**pin_order_id** | **char \*** | The pin order id associated with the ssio insertion order | 

### Return type

[ssio_insertion_order_status_response_t](ssio_insertion_order_status_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BillingAPI_ssioOrderLinesGetByAdAccount**
```c
// Get Salesforce order lines by ad account id.
//
//   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_order_lines_get_by_ad_account_200_response_t* BillingAPI_ssioOrderLinesGetByAdAccount(apiClient_t *apiClient, char *ad_account_id, char *pin_order_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**pin_order_id** | **char \*** | The pin order id associated with the SSIO insertion order | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[ssio_order_lines_get_by_ad_account_200_response_t](ssio_order_lines_get_by_ad_account_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

