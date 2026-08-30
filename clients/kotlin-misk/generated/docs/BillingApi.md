# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApi.md#adsCreditRedeem) | **Post** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApi.md#adsCreditsDiscountsGet) | **Get** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingInvoiceDownloadGet**](BillingApi.md#billingInvoiceDownloadGet) | **Get** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billingInvoicesGet**](BillingApi.md#billingInvoicesGet) | **Get** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billingProfilesGet**](BillingApi.md#billingProfilesGet) | **Get** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingApi.md#ssioAccountsGet) | **Get** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingApi.md#ssioInsertionOrderCreate) | **Post** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingApi.md#ssioInsertionOrderEdit) | **Patch** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingApi.md#ssioOrderLinesGetByAdAccount) | **Get** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


<a name="adsCreditRedeem"></a>
# **adsCreditRedeem**
> AdsCreditRedeem adsCreditRedeem(adAccountId, adsCreditRedeemCreate)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adsCreditRedeemCreate : AdsCreditRedeemCreate =  // AdsCreditRedeemCreate | 
try {
    val result : AdsCreditRedeem = apiInstance.adsCreditRedeem(adAccountId, adsCreditRedeemCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#adsCreditRedeem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#adsCreditRedeem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adsCreditRedeemCreate** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md)|  |

### Return type

[**AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adsCreditsDiscountsGet"></a>
# **adsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : AdsCreditsDiscountsGet200Response = apiInstance.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#adsCreditsDiscountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#adsCreditsDiscountsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="billingInvoiceDownloadGet"></a>
# **billingInvoiceDownloadGet**
> BillingInvoiceDownloadResponse billingInvoiceDownloadGet(adAccountId, billingInvoiceId)

Get download url for a billing invoice

Get download url for a billing invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val billingInvoiceId : kotlin.String = billingInvoiceId_example // kotlin.String | Unique identifier of a billing invoice.
try {
    val result : BillingInvoiceDownloadResponse = apiInstance.billingInvoiceDownloadGet(adAccountId, billingInvoiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingInvoiceDownloadGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingInvoiceDownloadGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **billingInvoiceId** | **kotlin.String**| Unique identifier of a billing invoice. |

### Return type

[**BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="billingInvoicesGet"></a>
# **billingInvoicesGet**
> BillingInvoicesGet200Response billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)

Get billing invoices

Get billing invoices in the advertiser account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val sort : BillingInvoiceSortField =  // BillingInvoiceSortField | Field of which to sort billing invoices
val status : BillingInvoiceStatus =  // BillingInvoiceStatus | Status of billing invoices to filter by
val documentType : BillingInvoiceDocumentType =  // BillingInvoiceDocumentType | Document type of billing invoices to filter by
val startDueDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
val endDueDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
try {
    val result : BillingInvoicesGet200Response = apiInstance.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingInvoicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingInvoicesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **sort** | [**BillingInvoiceSortField**](.md)| Field of which to sort billing invoices | [optional] [default to DUE_DATE] [enum: DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER]
 **status** | [**BillingInvoiceStatus**](.md)| Status of billing invoices to filter by | [optional] [enum: OPEN, CLOSED]
 **documentType** | [**BillingInvoiceDocumentType**](.md)| Document type of billing invoices to filter by | [optional] [enum: INVOICE, CREDIT_MEMO]
 **startDueDate** | **java.time.LocalDate**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional]
 **endDueDate** | **java.time.LocalDate**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional]

### Return type

[**BillingInvoicesGet200Response**](BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="billingProfilesGet"></a>
# **billingProfilesGet**
> BillingProfilesGet200Response billingProfilesGet(isActive, adAccountId, bookmark, pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val isActive : kotlin.Boolean = true // kotlin.Boolean | Return active billing profiles, if false return all billing profiles.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : BillingProfilesGet200Response = apiInstance.billingProfilesGet(isActive, adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingProfilesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingProfilesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **kotlin.Boolean**| Return active billing profiles, if false return all billing profiles. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="ssioAccountsGet"></a>
# **ssioAccountsGet**
> SSIOAccount ssioAccountsGet(adAccountId)

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : SSIOAccount = apiInstance.ssioAccountsGet(adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#ssioAccountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#ssioAccountsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**SSIOAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="ssioInsertionOrderCreate"></a>
# **ssioInsertionOrderCreate**
> SSIOInsertionOrder ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate)

Create insertion order through SSIO.

  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val ssIOInsertionOrderCreate : SSIOInsertionOrderCreate =  // SSIOInsertionOrderCreate | 
try {
    val result : SSIOInsertionOrder = apiInstance.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#ssioInsertionOrderCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#ssioInsertionOrderCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **ssIOInsertionOrderCreate** | [**SSIOInsertionOrderCreate**](SSIOInsertionOrderCreate.md)|  |

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="ssioInsertionOrderEdit"></a>
# **ssioInsertionOrderEdit**
> SSIOInsertionOrder ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate)

Edit insertion order through SSIO.

  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val ssIOInsertionOrderUpdate : SSIOInsertionOrderUpdate =  // SSIOInsertionOrderUpdate | 
try {
    val result : SSIOInsertionOrder = apiInstance.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#ssioInsertionOrderEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#ssioInsertionOrderEdit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **ssIOInsertionOrderUpdate** | [**SSIOInsertionOrderUpdate**](SSIOInsertionOrderUpdate.md)|  |

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="ssioInsertionOrdersStatusGetByAdAccount"></a>
# **ssioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)

Get insertion order status by ad account id.

  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : SsioInsertionOrdersStatusGetByAdAccount200Response = apiInstance.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#ssioInsertionOrdersStatusGetByAdAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#ssioInsertionOrdersStatusGetByAdAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="ssioInsertionOrdersStatusGetByPinOrderId"></a>
# **ssioInsertionOrdersStatusGetByPinOrderId**
> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)

Get insertion order status by pin order id.

  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinOrderId : kotlin.String = pinOrderId_example // kotlin.String | The pin order id associated with the ssio insertion order
try {
    val result : SSIOInsertionOrderStatusResponse = apiInstance.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#ssioInsertionOrdersStatusGetByPinOrderId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#ssioInsertionOrdersStatusGetByPinOrderId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **pinOrderId** | **kotlin.String**| The pin order id associated with the ssio insertion order |

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="ssioOrderLinesGetByAdAccount"></a>
# **ssioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BillingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinOrderId : kotlin.String = pinOrderId_example // kotlin.String | The pin order id associated with the SSIO insertion order
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : SsioOrderLinesGetByAdAccount200Response = apiInstance.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#ssioOrderLinesGetByAdAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#ssioOrderLinesGetByAdAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **pinOrderId** | **kotlin.String**| The pin order id associated with the SSIO insertion order | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

