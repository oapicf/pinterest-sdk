# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingInvoiceDownloadGet**](BillingApi.md#billingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billingInvoicesGet**](BillingApi.md#billingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billingProfilesGet**](BillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.



## adsCreditRedeem

> AdsCreditRedeem adsCreditRedeem(adAccountId, adsCreditRedeemCreate)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdsCreditRedeemCreate adsCreditRedeemCreate = new AdsCreditRedeemCreate(); // AdsCreditRedeemCreate | 
try {
    AdsCreditRedeem result = apiInstance.adsCreditRedeem(adAccountId, adsCreditRedeemCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#adsCreditRedeem");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **adsCreditRedeemCreate** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md)|  |

### Return type

[**AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## adsCreditsDiscountsGet

> AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    AdsCreditsDiscountsGet200Response result = apiInstance.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#adsCreditsDiscountsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billingInvoiceDownloadGet

> BillingInvoiceDownloadResponse billingInvoiceDownloadGet(adAccountId, billingInvoiceId)

Get download url for a billing invoice

Get download url for a billing invoice.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String billingInvoiceId = null; // String | Unique identifier of a billing invoice.
try {
    BillingInvoiceDownloadResponse result = apiInstance.billingInvoiceDownloadGet(adAccountId, billingInvoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#billingInvoiceDownloadGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **billingInvoiceId** | **String**| Unique identifier of a billing invoice. | [default to null]

### Return type

[**BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billingInvoicesGet

> BillingInvoicesGet200Response billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)

Get billing invoices

Get billing invoices in the advertiser account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
BillingInvoiceSortField sort = null; // BillingInvoiceSortField | Field of which to sort billing invoices
BillingInvoiceStatus status = null; // BillingInvoiceStatus | Status of billing invoices to filter by
BillingInvoiceDocumentType documentType = null; // BillingInvoiceDocumentType | Document type of billing invoices to filter by
Date startDueDate = null; // Date | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
Date endDueDate = null; // Date | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
try {
    BillingInvoicesGet200Response result = apiInstance.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#billingInvoicesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **sort** | [**BillingInvoiceSortField**](.md)| Field of which to sort billing invoices | [optional] [default to null] [enum: DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER]
 **status** | [**BillingInvoiceStatus**](.md)| Status of billing invoices to filter by | [optional] [default to null] [enum: OPEN, CLOSED]
 **documentType** | [**BillingInvoiceDocumentType**](.md)| Document type of billing invoices to filter by | [optional] [default to null] [enum: INVOICE, CREDIT_MEMO]
 **startDueDate** | **Date**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] [default to null]
 **endDueDate** | **Date**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] [default to null]

### Return type

[**BillingInvoicesGet200Response**](BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billingProfilesGet

> BillingProfilesGet200Response billingProfilesGet(isActive, adAccountId, bookmark, pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
Boolean isActive = null; // Boolean | Return active billing profiles, if false return all billing profiles.
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    BillingProfilesGet200Response result = apiInstance.billingProfilesGet(isActive, adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#billingProfilesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **Boolean**| Return active billing profiles, if false return all billing profiles. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioAccountsGet

> SSIOAccount ssioAccountsGet(adAccountId)

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    SSIOAccount result = apiInstance.ssioAccountsGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioAccountsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**SSIOAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioInsertionOrderCreate

> SSIOInsertionOrder ssioInsertionOrderCreate(adAccountId, sSIOInsertionOrderCreate)

Create insertion order through SSIO.

  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
SSIOInsertionOrderCreate sSIOInsertionOrderCreate = new SSIOInsertionOrderCreate(); // SSIOInsertionOrderCreate | 
try {
    SSIOInsertionOrder result = apiInstance.ssioInsertionOrderCreate(adAccountId, sSIOInsertionOrderCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrderCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **sSIOInsertionOrderCreate** | [**SSIOInsertionOrderCreate**](SSIOInsertionOrderCreate.md)|  |

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssioInsertionOrderEdit

> SSIOInsertionOrder ssioInsertionOrderEdit(adAccountId, sSIOInsertionOrderUpdate)

Edit insertion order through SSIO.

  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate = new SSIOInsertionOrderUpdate(); // SSIOInsertionOrderUpdate | 
try {
    SSIOInsertionOrder result = apiInstance.ssioInsertionOrderEdit(adAccountId, sSIOInsertionOrderUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrderEdit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **sSIOInsertionOrderUpdate** | [**SSIOInsertionOrderUpdate**](SSIOInsertionOrderUpdate.md)|  |

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssioInsertionOrdersStatusGetByAdAccount

> SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)

Get insertion order status by ad account id.

  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    SsioInsertionOrdersStatusGetByAdAccount200Response result = apiInstance.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByAdAccount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioInsertionOrdersStatusGetByPinOrderId

> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)

Get insertion order status by pin order id.

  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String pinOrderId = null; // String | The pin order id associated with the ssio insertion order
try {
    SSIOInsertionOrderStatusResponse result = apiInstance.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByPinOrderId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **pinOrderId** | **String**| The pin order id associated with the ssio insertion order | [default to null]

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioOrderLinesGetByAdAccount

> SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String pinOrderId = null; // String | The pin order id associated with the SSIO insertion order
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    SsioOrderLinesGetByAdAccount200Response result = apiInstance.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioOrderLinesGetByAdAccount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **pinOrderId** | **String**| The pin order id associated with the SSIO insertion order | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

