# BillingController

All URIs are relative to `"/v5"`

The controller class is defined in **[BillingController.java](../../src/main/java/org/openapitools/controller/BillingController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingInvoiceDownloadGet**](#billingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billingInvoicesGet**](#billingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billingProfilesGet**](#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.

<a id="adsCreditRedeem"></a>
# **adsCreditRedeem**
```java
Mono<AdsCreditRedeem> BillingController.adsCreditRedeem(adAccountIdadsCreditRedeemCreate)
```

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**adsCreditRedeemCreate** | [**AdsCreditRedeemCreate**](../../docs/models/AdsCreditRedeemCreate.md) |  |

### Return type
[**AdsCreditRedeem**](../../docs/models/AdsCreditRedeem.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`, `billing:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="adsCreditsDiscountsGet"></a>
# **adsCreditsDiscountsGet**
```java
Mono<AdsCreditsDiscountsGet200Response> BillingController.adsCreditsDiscountsGet(adAccountIdbookmarkpageSize)
```

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**AdsCreditsDiscountsGet200Response**](../../docs/models/AdsCreditsDiscountsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`, `billing:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="billingInvoiceDownloadGet"></a>
# **billingInvoiceDownloadGet**
```java
Mono<BillingInvoiceDownloadResponse> BillingController.billingInvoiceDownloadGet(adAccountIdbillingInvoiceId)
```

Get download url for a billing invoice

Get download url for a billing invoice.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**billingInvoiceId** | `String` | Unique identifier of a billing invoice. |

### Return type
[**BillingInvoiceDownloadResponse**](../../docs/models/BillingInvoiceDownloadResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`, `billing:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="billingInvoicesGet"></a>
# **billingInvoicesGet**
```java
Mono<BillingInvoicesGet200Response> BillingController.billingInvoicesGet(adAccountIdbookmarkpageSizeordersortstatusdocumentTypestartDueDateendDueDate)
```

Get billing invoices

Get billing invoices in the advertiser account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**sort** | [**BillingInvoiceSortField**](../../docs/models/.md) | Field of which to sort billing invoices | [optional parameter] [default to `DUE_DATE`] [enum: `DUE_DATE`, `BILLING_PERIOD`, `DOCUMENT_TYPE`, `TOTAL_AMOUNT`, `INVOICE_NUMBER`]
**status** | [**BillingInvoiceStatus**](../../docs/models/.md) | Status of billing invoices to filter by | [optional parameter] [enum: `OPEN`, `CLOSED`]
**documentType** | [**BillingInvoiceDocumentType**](../../docs/models/.md) | Document type of billing invoices to filter by | [optional parameter] [enum: `INVOICE`, `CREDIT_MEMO`]
**startDueDate** | `LocalDate` | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional parameter]
**endDueDate** | `LocalDate` | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional parameter]

### Return type
[**BillingInvoicesGet200Response**](../../docs/models/BillingInvoicesGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`, `billing:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="billingProfilesGet"></a>
# **billingProfilesGet**
```java
Mono<BillingProfilesGet200Response> BillingController.billingProfilesGet(isActiveadAccountIdbookmarkpageSize)
```

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**isActive** | `Boolean` | Return active billing profiles, if false return all billing profiles. |
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**BillingProfilesGet200Response**](../../docs/models/BillingProfilesGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`, `billing:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="ssioAccountsGet"></a>
# **ssioAccountsGet**
```java
Mono<SSIOAccount> BillingController.ssioAccountsGet(adAccountId)
```

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**SSIOAccount**](../../docs/models/SSIOAccount.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="ssioInsertionOrderCreate"></a>
# **ssioInsertionOrderCreate**
```java
Mono<SSIOInsertionOrder> BillingController.ssioInsertionOrderCreate(adAccountIdssIOInsertionOrderCreate)
```

Create insertion order through SSIO.

  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**ssIOInsertionOrderCreate** | [**SSIOInsertionOrderCreate**](../../docs/models/SSIOInsertionOrderCreate.md) |  |

### Return type
[**SSIOInsertionOrder**](../../docs/models/SSIOInsertionOrder.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="ssioInsertionOrderEdit"></a>
# **ssioInsertionOrderEdit**
```java
Mono<SSIOInsertionOrder> BillingController.ssioInsertionOrderEdit(adAccountIdssIOInsertionOrderUpdate)
```

Edit insertion order through SSIO.

  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**ssIOInsertionOrderUpdate** | [**SSIOInsertionOrderUpdate**](../../docs/models/SSIOInsertionOrderUpdate.md) |  |

### Return type
[**SSIOInsertionOrder**](../../docs/models/SSIOInsertionOrder.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="ssioInsertionOrdersStatusGetByAdAccount"></a>
# **ssioInsertionOrdersStatusGetByAdAccount**
```java
Mono<SsioInsertionOrdersStatusGetByAdAccount200Response> BillingController.ssioInsertionOrdersStatusGetByAdAccount(adAccountIdbookmarkpageSize)
```

Get insertion order status by ad account id.

  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**SsioInsertionOrdersStatusGetByAdAccount200Response**](../../docs/models/SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="ssioInsertionOrdersStatusGetByPinOrderId"></a>
# **ssioInsertionOrdersStatusGetByPinOrderId**
```java
Mono<SSIOInsertionOrderStatusResponse> BillingController.ssioInsertionOrdersStatusGetByPinOrderId(adAccountIdpinOrderId)
```

Get insertion order status by pin order id.

  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**pinOrderId** | `String` | The pin order id associated with the ssio insertion order |

### Return type
[**SSIOInsertionOrderStatusResponse**](../../docs/models/SSIOInsertionOrderStatusResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="ssioOrderLinesGetByAdAccount"></a>
# **ssioOrderLinesGetByAdAccount**
```java
Mono<SsioOrderLinesGetByAdAccount200Response> BillingController.ssioOrderLinesGetByAdAccount(adAccountIdpinOrderIdbookmarkpageSize)
```

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**pinOrderId** | `String` | The pin order id associated with the SSIO insertion order | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**SsioOrderLinesGetByAdAccount200Response**](../../docs/models/SsioOrderLinesGetByAdAccount200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

