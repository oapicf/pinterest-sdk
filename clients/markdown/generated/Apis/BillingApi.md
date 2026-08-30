# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adsCredit/redeem**](BillingApi.md#adsCredit/redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
| [**adsCreditsDiscounts/get**](BillingApi.md#adsCreditsDiscounts/get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
| [**billingInvoiceDownload/get**](BillingApi.md#billingInvoiceDownload/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice |
| [**billingInvoices/get**](BillingApi.md#billingInvoices/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices |
| [**billingProfiles/get**](BillingApi.md#billingProfiles/get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
| [**ssioAccounts/get**](BillingApi.md#ssioAccounts/get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
| [**ssioInsertionOrder/create**](BillingApi.md#ssioInsertionOrder/create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
| [**ssioInsertionOrder/edit**](BillingApi.md#ssioInsertionOrder/edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
| [**ssioInsertionOrdersStatus/getByAdAccount**](BillingApi.md#ssioInsertionOrdersStatus/getByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
| [**ssioInsertionOrdersStatus/getByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatus/getByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
| [**ssioOrderLines/getByAdAccount**](BillingApi.md#ssioOrderLines/getByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |


<a name="adsCredit/redeem"></a>
# **adsCredit/redeem**
> AdsCreditRedeem adsCredit/redeem(ad\_account\_id, AdsCreditRedeemCreate)

Redeem ad credits

    Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdsCreditRedeemCreate** | [**AdsCreditRedeemCreate**](../Models/AdsCreditRedeemCreate.md)|  | |

### Return type

[**AdsCreditRedeem**](../Models/AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adsCreditsDiscounts/get"></a>
# **adsCreditsDiscounts/get**
> ads_credits_discounts_get_200_response adsCreditsDiscounts/get(ad\_account\_id, bookmark, page\_size)

Get ads credit discounts

    Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**ads_credits_discounts_get_200_response**](../Models/ads_credits_discounts_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="billingInvoiceDownload/get"></a>
# **billingInvoiceDownload/get**
> BillingInvoiceDownloadResponse billingInvoiceDownload/get(ad\_account\_id, billing\_invoice\_id)

Get download url for a billing invoice

    Get download url for a billing invoice.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **billing\_invoice\_id** | **String**| Unique identifier of a billing invoice. | [default to null] |

### Return type

[**BillingInvoiceDownloadResponse**](../Models/BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="billingInvoices/get"></a>
# **billingInvoices/get**
> billing_invoices_get_200_response billingInvoices/get(ad\_account\_id, bookmark, page\_size, order, sort, status, document\_type, start\_due\_date, end\_due\_date)

Get billing invoices

    Get billing invoices in the advertiser account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **sort** | [**BillingInvoiceSortField**](../Models/.md)| Field of which to sort billing invoices | [optional] [default to null] [enum: DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER] |
| **status** | [**BillingInvoiceStatus**](../Models/.md)| Status of billing invoices to filter by | [optional] [default to null] [enum: OPEN, CLOSED] |
| **document\_type** | [**BillingInvoiceDocumentType**](../Models/.md)| Document type of billing invoices to filter by | [optional] [default to null] [enum: INVOICE, CREDIT_MEMO] |
| **start\_due\_date** | **date**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] [default to null] |
| **end\_due\_date** | **date**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] [default to null] |

### Return type

[**billing_invoices_get_200_response**](../Models/billing_invoices_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="billingProfiles/get"></a>
# **billingProfiles/get**
> billing_profiles_get_200_response billingProfiles/get(is\_active, ad\_account\_id, bookmark, page\_size)

Get billing profiles

    Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **is\_active** | **Boolean**| Return active billing profiles, if false return all billing profiles. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**billing_profiles_get_200_response**](../Models/billing_profiles_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioAccounts/get"></a>
# **ssioAccounts/get**
> SSIOAccount ssioAccounts/get(ad\_account\_id)

Get Salesforce account details including bill-to information.

      Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**SSIOAccount**](../Models/SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioInsertionOrder/create"></a>
# **ssioInsertionOrder/create**
> SSIOInsertionOrder ssioInsertionOrder/create(ad\_account\_id, SSIOInsertionOrderCreate)

Create insertion order through SSIO.

      Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **SSIOInsertionOrderCreate** | [**SSIOInsertionOrderCreate**](../Models/SSIOInsertionOrderCreate.md)|  | |

### Return type

[**SSIOInsertionOrder**](../Models/SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ssioInsertionOrder/edit"></a>
# **ssioInsertionOrder/edit**
> SSIOInsertionOrder ssioInsertionOrder/edit(ad\_account\_id, SSIOInsertionOrderUpdate)

Edit insertion order through SSIO.

      Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **SSIOInsertionOrderUpdate** | [**SSIOInsertionOrderUpdate**](../Models/SSIOInsertionOrderUpdate.md)|  | |

### Return type

[**SSIOInsertionOrder**](../Models/SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ssioInsertionOrdersStatus/getByAdAccount"></a>
# **ssioInsertionOrdersStatus/getByAdAccount**
> ssio_insertion_orders_status_get_by_ad_account_200_response ssioInsertionOrdersStatus/getByAdAccount(ad\_account\_id, bookmark, page\_size)

Get insertion order status by ad account id.

      Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**ssio_insertion_orders_status_get_by_ad_account_200_response**](../Models/ssio_insertion_orders_status_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioInsertionOrdersStatus/getByPinOrderId"></a>
# **ssioInsertionOrdersStatus/getByPinOrderId**
> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatus/getByPinOrderId(ad\_account\_id, pin\_order\_id)

Get insertion order status by pin order id.

      Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **pin\_order\_id** | **String**| The pin order id associated with the ssio insertion order | [default to null] |

### Return type

[**SSIOInsertionOrderStatusResponse**](../Models/SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioOrderLines/getByAdAccount"></a>
# **ssioOrderLines/getByAdAccount**
> ssio_order_lines_get_by_ad_account_200_response ssioOrderLines/getByAdAccount(ad\_account\_id, pin\_order\_id, bookmark, page\_size)

Get Salesforce order lines by ad account id.

      Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **pin\_order\_id** | **String**| The pin order id associated with the SSIO insertion order | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**ssio_order_lines_get_by_ad_account_200_response**](../Models/ssio_order_lines_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

