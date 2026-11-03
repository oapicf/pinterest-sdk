# BillingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingAPI.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingAPI.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingInvoiceDownloadGet**](BillingAPI.md#billinginvoicedownloadget) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billingInvoicesGet**](BillingAPI.md#billinginvoicesget) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billingProfilesGet**](BillingAPI.md#billingprofilesget) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingAPI.md#ssioaccountsget) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingAPI.md#ssioinsertionordercreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingAPI.md#ssioinsertionorderedit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingAPI.md#ssioinsertionordersstatusgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingAPI.md#ssioinsertionordersstatusgetbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingAPI.md#ssioorderlinesgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **adsCreditRedeem**
```swift
    open class func adsCreditRedeem(adAccountId: String, adsCreditRedeemCreate: AdsCreditRedeemCreate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AdsCreditRedeem
```

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adsCreditRedeemCreate = AdsCreditRedeemCreate(offerCodeHash: "offerCodeHash_example", validateOnly: true) // AdsCreditRedeemCreate | 

// Redeem ad credits
do {
    let response = try await BillingAPI.adsCreditRedeem(adAccountId: adAccountId, adsCreditRedeemCreate: adsCreditRedeemCreate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **adsCreditRedeemCreate** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md) |  | 

### Return type

[**AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsCreditsDiscountsGet**
```swift
    open class func adsCreditsDiscountsGet(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AdsCreditsDiscountsGet200Response
```

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get ads credit discounts
do {
    let response = try await BillingAPI.adsCreditsDiscountsGet(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingInvoiceDownloadGet**
```swift
    open class func billingInvoiceDownloadGet(adAccountId: String, billingInvoiceId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BillingInvoiceDownloadResponse
```

Get download url for a billing invoice

Get download url for a billing invoice.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let billingInvoiceId = "billingInvoiceId_example" // String | Unique identifier of a billing invoice.

// Get download url for a billing invoice
do {
    let response = try await BillingAPI.billingInvoiceDownloadGet(adAccountId: adAccountId, billingInvoiceId: billingInvoiceId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **billingInvoiceId** | **String** | Unique identifier of a billing invoice. | 

### Return type

[**BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingInvoicesGet**
```swift
    open class func billingInvoicesGet(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, sort: BillingInvoiceSortField? = nil, status: BillingInvoiceStatus? = nil, documentType: BillingInvoiceDocumentType? = nil, startDueDate: Date? = nil, endDueDate: Date? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BillingInvoicesGet200Response
```

Get billing invoices

Get billing invoices in the advertiser account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let sort = BillingInvoiceSortField() // BillingInvoiceSortField | Field of which to sort billing invoices (optional)
let status = BillingInvoiceStatus() // BillingInvoiceStatus | Status of billing invoices to filter by (optional)
let documentType = BillingInvoiceDocumentType() // BillingInvoiceDocumentType | Document type of billing invoices to filter by (optional)
let startDueDate = Date() // Date | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
let endDueDate = Date() // Date | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)

// Get billing invoices
do {
    let response = try await BillingAPI.billingInvoicesGet(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, sort: sort, status: status, documentType: documentType, startDueDate: startDueDate, endDueDate: endDueDate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **sort** | [**BillingInvoiceSortField**](.md) | Field of which to sort billing invoices | [optional] 
 **status** | [**BillingInvoiceStatus**](.md) | Status of billing invoices to filter by | [optional] 
 **documentType** | [**BillingInvoiceDocumentType**](.md) | Document type of billing invoices to filter by | [optional] 
 **startDueDate** | **Date** | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 
 **endDueDate** | **Date** | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 

### Return type

[**BillingInvoicesGet200Response**](BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingProfilesGet**
```swift
    open class func billingProfilesGet(isActive: Bool, adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BillingProfilesGet200Response
```

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let isActive = true // Bool | Return active billing profiles, if false return all billing profiles.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get billing profiles
do {
    let response = try await BillingAPI.billingProfilesGet(isActive: isActive, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **Bool** | Return active billing profiles, if false return all billing profiles. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioAccountsGet**
```swift
    open class func ssioAccountsGet(adAccountId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> SSIOAccount
```

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get Salesforce account details including bill-to information.
do {
    let response = try await BillingAPI.ssioAccountsGet(adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**SSIOAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderCreate**
```swift
    open class func ssioInsertionOrderCreate(adAccountId: String, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> SSIOInsertionOrder
```

Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let sSIOInsertionOrderCreate = SSIOInsertionOrderCreate(acceptedTermsId: "acceptedTermsId_example", acceptedTermsTime: 123, agencyLink: "agencyLink_example", billingContactEmail: "billingContactEmail_example", billingContactFirstname: "billingContactFirstname_example", billingContactLastname: "billingContactLastname_example", billtoBillingAddressId: "billtoBillingAddressId_example", billtoBusinessAddressId: "billtoBusinessAddressId_example", billtoCompanyId: "billtoCompanyId_example", budgetAmount: 123, currencyInfo: Currency(), endDate: "endDate_example", estimatedMonthlySpend: 123, mediaContactEmail: "mediaContactEmail_example", mediaContactFirstname: "mediaContactFirstname_example", mediaContactLastname: "mediaContactLastname_example", orderLineType: SSIOOrderLineType(), orderName: "orderName_example", pmpId: "pmpId_example", poNumber: "poNumber_example", startDate: "startDate_example", userEmail: "userEmail_example") // SSIOInsertionOrderCreate | 

// Create insertion order through SSIO.
do {
    let response = try await BillingAPI.ssioInsertionOrderCreate(adAccountId: adAccountId, sSIOInsertionOrderCreate: sSIOInsertionOrderCreate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **sSIOInsertionOrderCreate** | [**SSIOInsertionOrderCreate**](SSIOInsertionOrderCreate.md) |  | 

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderEdit**
```swift
    open class func ssioInsertionOrderEdit(adAccountId: String, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> SSIOInsertionOrder
```

Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let sSIOInsertionOrderUpdate = SSIOInsertionOrderUpdate(adsManagerOrderLineId: "adsManagerOrderLineId_example", agencyLink: "agencyLink_example", billingContactEmail: "billingContactEmail_example", billingContactFirstname: "billingContactFirstname_example", billingContactLastname: "billingContactLastname_example", budgetAmount: 123, endDate: "endDate_example", mediaContactEmail: "mediaContactEmail_example", mediaContactFirstname: "mediaContactFirstname_example", mediaContactLastname: "mediaContactLastname_example", oracleLineId: "oracleLineId_example", poNumber: "poNumber_example", salesforceOrderId: "salesforceOrderId_example", salesforceOrderLineId: "salesforceOrderLineId_example", startDate: "startDate_example", userEmail: "userEmail_example") // SSIOInsertionOrderUpdate | 

// Edit insertion order through SSIO.
do {
    let response = try await BillingAPI.ssioInsertionOrderEdit(adAccountId: adAccountId, sSIOInsertionOrderUpdate: sSIOInsertionOrderUpdate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **sSIOInsertionOrderUpdate** | [**SSIOInsertionOrderUpdate**](SSIOInsertionOrderUpdate.md) |  | 

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrdersStatusGetByAdAccount**
```swift
    open class func ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> SsioInsertionOrdersStatusGetByAdAccount200Response
```

Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get insertion order status by ad account id.
do {
    let response = try await BillingAPI.ssioInsertionOrdersStatusGetByAdAccount(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrdersStatusGetByPinOrderId**
```swift
    open class func ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> SSIOInsertionOrderStatusResponse
```

Get insertion order status by pin order id.

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pinOrderId = "pinOrderId_example" // String | The pin order id associated with the ssio insertion order

// Get insertion order status by pin order id.
do {
    let response = try await BillingAPI.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: adAccountId, pinOrderId: pinOrderId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **pinOrderId** | **String** | The pin order id associated with the ssio insertion order | 

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioOrderLinesGetByAdAccount**
```swift
    open class func ssioOrderLinesGetByAdAccount(adAccountId: String, pinOrderId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> SsioOrderLinesGetByAdAccount200Response
```

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pinOrderId = "pinOrderId_example" // String | The pin order id associated with the SSIO insertion order (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get Salesforce order lines by ad account id.
do {
    let response = try await BillingAPI.ssioOrderLinesGetByAdAccount(adAccountId: adAccountId, pinOrderId: pinOrderId, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **pinOrderId** | **String** | The pin order id associated with the SSIO insertion order | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

