# \BillingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdsCreditRedeem**](BillingAPI.md#AdsCreditRedeem) | **Post** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**AdsCreditsDiscountsGet**](BillingAPI.md#AdsCreditsDiscountsGet) | **Get** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**BillingInvoiceDownloadGet**](BillingAPI.md#BillingInvoiceDownloadGet) | **Get** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**BillingInvoicesGet**](BillingAPI.md#BillingInvoicesGet) | **Get** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**BillingProfilesGet**](BillingAPI.md#BillingProfilesGet) | **Get** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**SsioAccountsGet**](BillingAPI.md#SsioAccountsGet) | **Get** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**SsioInsertionOrderCreate**](BillingAPI.md#SsioInsertionOrderCreate) | **Post** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**SsioInsertionOrderEdit**](BillingAPI.md#SsioInsertionOrderEdit) | **Patch** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**SsioInsertionOrdersStatusGetByAdAccount**](BillingAPI.md#SsioInsertionOrdersStatusGetByAdAccount) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**SsioInsertionOrdersStatusGetByPinOrderId**](BillingAPI.md#SsioInsertionOrdersStatusGetByPinOrderId) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**SsioOrderLinesGetByAdAccount**](BillingAPI.md#SsioOrderLinesGetByAdAccount) | **Get** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.



## AdsCreditRedeem

> AdsCreditRedeem AdsCreditRedeem(ctx, adAccountId).AdsCreditRedeemCreate(adsCreditRedeemCreate).Execute()

Redeem ad credits



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	adsCreditRedeemCreate := *openapiclient.NewAdsCreditRedeemCreate("138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", true) // AdsCreditRedeemCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.AdsCreditRedeem(context.Background(), adAccountId).AdsCreditRedeemCreate(adsCreditRedeemCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.AdsCreditRedeem``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsCreditRedeem`: AdsCreditRedeem
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.AdsCreditRedeem`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsCreditRedeemRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adsCreditRedeemCreate** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md) |  | 

### Return type

[**AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsCreditsDiscountsGet

> AdsCreditsDiscountsGet200Response AdsCreditsDiscountsGet(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

Get ads credit discounts



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.AdsCreditsDiscountsGet(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.AdsCreditsDiscountsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsCreditsDiscountsGet`: AdsCreditsDiscountsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.AdsCreditsDiscountsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsCreditsDiscountsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BillingInvoiceDownloadGet

> BillingInvoiceDownloadResponse BillingInvoiceDownloadGet(ctx, adAccountId, billingInvoiceId).Execute()

Get download url for a billing invoice



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	billingInvoiceId := "billingInvoiceId_example" // string | Unique identifier of a billing invoice.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.BillingInvoiceDownloadGet(context.Background(), adAccountId, billingInvoiceId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.BillingInvoiceDownloadGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BillingInvoiceDownloadGet`: BillingInvoiceDownloadResponse
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.BillingInvoiceDownloadGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**billingInvoiceId** | **string** | Unique identifier of a billing invoice. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBillingInvoiceDownloadGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BillingInvoicesGet

> BillingInvoicesGet200Response BillingInvoicesGet(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Sort(sort).Status(status).DocumentType(documentType).StartDueDate(startDueDate).EndDueDate(endDueDate).Execute()

Get billing invoices



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	sort := openapiclient.BillingInvoiceSortField("DUE_DATE") // BillingInvoiceSortField | Field of which to sort billing invoices (optional) (default to "DUE_DATE")
	status := openapiclient.BillingInvoiceStatus("OPEN") // BillingInvoiceStatus | Status of billing invoices to filter by (optional)
	documentType := openapiclient.BillingInvoiceDocumentType("INVOICE") // BillingInvoiceDocumentType | Document type of billing invoices to filter by (optional)
	startDueDate := time.Now() // string | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
	endDueDate := time.Now() // string | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.BillingInvoicesGet(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Sort(sort).Status(status).DocumentType(documentType).StartDueDate(startDueDate).EndDueDate(endDueDate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.BillingInvoicesGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BillingInvoicesGet`: BillingInvoicesGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.BillingInvoicesGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBillingInvoicesGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **sort** | [**BillingInvoiceSortField**](BillingInvoiceSortField.md) | Field of which to sort billing invoices | [default to &quot;DUE_DATE&quot;]
 **status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | Status of billing invoices to filter by | 
 **documentType** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | Document type of billing invoices to filter by | 
 **startDueDate** | **string** | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | 
 **endDueDate** | **string** | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | 

### Return type

[**BillingInvoicesGet200Response**](BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BillingProfilesGet

> BillingProfilesGet200Response BillingProfilesGet(ctx, adAccountId).IsActive(isActive).Bookmark(bookmark).PageSize(pageSize).Execute()

Get billing profiles



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	isActive := true // bool | Return active billing profiles, if false return all billing profiles.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.BillingProfilesGet(context.Background(), adAccountId).IsActive(isActive).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.BillingProfilesGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BillingProfilesGet`: BillingProfilesGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.BillingProfilesGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBillingProfilesGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **bool** | Return active billing profiles, if false return all billing profiles. | 

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioAccountsGet

> SSIOAccount SsioAccountsGet(ctx, adAccountId).Execute()

Get Salesforce account details including bill-to information.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioAccountsGet(context.Background(), adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioAccountsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioAccountsGet`: SSIOAccount
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.SsioAccountsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSsioAccountsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**SSIOAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioInsertionOrderCreate

> SSIOInsertionOrder SsioInsertionOrderCreate(ctx, adAccountId).SSIOInsertionOrderCreate(sSIOInsertionOrderCreate).Execute()

Create insertion order through SSIO.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	sSIOInsertionOrderCreate := *openapiclient.NewSSIOInsertionOrderCreate("AcceptedTermsId_example", "BillingContactEmail_example", "BillingContactFirstname_example", "BillingContactLastname_example", "BilltoBillingAddressId_example", "BilltoBusinessAddressId_example", "BilltoCompanyId_example", openapiclient.Currency("UNK"), "MediaContactEmail_example", "MediaContactFirstname_example", "MediaContactLastname_example", openapiclient.SSIOOrderLineType("BUDGET"), "OrderName_example", "PmpId_example", "PoNumber_example", "StartDate_example") // SSIOInsertionOrderCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioInsertionOrderCreate(context.Background(), adAccountId).SSIOInsertionOrderCreate(sSIOInsertionOrderCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioInsertionOrderCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioInsertionOrderCreate`: SSIOInsertionOrder
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.SsioInsertionOrderCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSsioInsertionOrderCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **sSIOInsertionOrderCreate** | [**SSIOInsertionOrderCreate**](SSIOInsertionOrderCreate.md) |  | 

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioInsertionOrderEdit

> SSIOInsertionOrder SsioInsertionOrderEdit(ctx, adAccountId).SSIOInsertionOrderUpdate(sSIOInsertionOrderUpdate).Execute()

Edit insertion order through SSIO.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	sSIOInsertionOrderUpdate := *openapiclient.NewSSIOInsertionOrderUpdate() // SSIOInsertionOrderUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioInsertionOrderEdit(context.Background(), adAccountId).SSIOInsertionOrderUpdate(sSIOInsertionOrderUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioInsertionOrderEdit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioInsertionOrderEdit`: SSIOInsertionOrder
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.SsioInsertionOrderEdit`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSsioInsertionOrderEditRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **sSIOInsertionOrderUpdate** | [**SSIOInsertionOrderUpdate**](SSIOInsertionOrderUpdate.md) |  | 

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioInsertionOrdersStatusGetByAdAccount

> SsioInsertionOrdersStatusGetByAdAccount200Response SsioInsertionOrdersStatusGetByAdAccount(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

Get insertion order status by ad account id.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioInsertionOrdersStatusGetByAdAccount(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioInsertionOrdersStatusGetByAdAccount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioInsertionOrdersStatusGetByAdAccount`: SsioInsertionOrdersStatusGetByAdAccount200Response
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.SsioInsertionOrdersStatusGetByAdAccount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSsioInsertionOrdersStatusGetByAdAccountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioInsertionOrdersStatusGetByPinOrderId

> SSIOInsertionOrderStatusResponse SsioInsertionOrdersStatusGetByPinOrderId(ctx, adAccountId, pinOrderId).Execute()

Get insertion order status by pin order id.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	pinOrderId := "pinOrderId_example" // string | The pin order id associated with the ssio insertion order

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioInsertionOrdersStatusGetByPinOrderId(context.Background(), adAccountId, pinOrderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioInsertionOrdersStatusGetByPinOrderId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioInsertionOrdersStatusGetByPinOrderId`: SSIOInsertionOrderStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.SsioInsertionOrdersStatusGetByPinOrderId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**pinOrderId** | **string** | The pin order id associated with the ssio insertion order | 

### Other Parameters

Other parameters are passed through a pointer to a apiSsioInsertionOrdersStatusGetByPinOrderIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioOrderLinesGetByAdAccount

> SsioOrderLinesGetByAdAccount200Response SsioOrderLinesGetByAdAccount(ctx, adAccountId).PinOrderId(pinOrderId).Bookmark(bookmark).PageSize(pageSize).Execute()

Get Salesforce order lines by ad account id.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	pinOrderId := "pinOrderId_example" // string | The pin order id associated with the SSIO insertion order (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioOrderLinesGetByAdAccount(context.Background(), adAccountId).PinOrderId(pinOrderId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioOrderLinesGetByAdAccount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioOrderLinesGetByAdAccount`: SsioOrderLinesGetByAdAccount200Response
	fmt.Fprintf(os.Stdout, "Response from `BillingAPI.SsioOrderLinesGetByAdAccount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSsioOrderLinesGetByAdAccountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pinOrderId** | **string** | The pin order id associated with the SSIO insertion order | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

