# \BillingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdsCreditRedeem**](BillingAPI.md#AdsCreditRedeem) | **Post** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**AdsCreditsDiscountsGet**](BillingAPI.md#AdsCreditsDiscountsGet) | **Get** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**BillingProfilesGet**](BillingAPI.md#BillingProfilesGet) | **Get** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**SsioAccountsGet**](BillingAPI.md#SsioAccountsGet) | **Get** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**SsioInsertionOrderCreate**](BillingAPI.md#SsioInsertionOrderCreate) | **Post** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**SsioInsertionOrderEdit**](BillingAPI.md#SsioInsertionOrderEdit) | **Patch** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**SsioInsertionOrdersStatusGetByAdAccount**](BillingAPI.md#SsioInsertionOrdersStatusGetByAdAccount) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**SsioInsertionOrdersStatusGetByPinOrderId**](BillingAPI.md#SsioInsertionOrdersStatusGetByPinOrderId) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**SsioOrderLinesGetByAdAccount**](BillingAPI.md#SsioOrderLinesGetByAdAccount) | **Get** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.



## AdsCreditRedeem

> AdsCreditRedeemResponse AdsCreditRedeem(ctx, adAccountId).AdsCreditRedeemRequest(adsCreditRedeemRequest).Execute()

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
	adsCreditRedeemRequest := *openapiclient.NewAdsCreditRedeemRequest("138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", true) // AdsCreditRedeemRequest | Redeem ad credits request.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.AdsCreditRedeem(context.Background(), adAccountId).AdsCreditRedeemRequest(adsCreditRedeemRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.AdsCreditRedeem``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsCreditRedeem`: AdsCreditRedeemResponse
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

 **adsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md) | Redeem ad credits request. | 

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

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
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	isActive := true // bool | Return active billing profiles, if false return all billing profiles.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

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
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

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

> SSIOAccountResponse SsioAccountsGet(ctx, adAccountId).Execute()

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
	// response from `SsioAccountsGet`: SSIOAccountResponse
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

[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioInsertionOrderCreate

> SSIOCreateInsertionOrderResponse SsioInsertionOrderCreate(ctx, adAccountId).SSIOCreateInsertionOrderRequest(sSIOCreateInsertionOrderRequest).Execute()

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
	sSIOCreateInsertionOrderRequest := *openapiclient.NewSSIOCreateInsertionOrderRequest("2020-12-20", "PoNumber_example", "BillingContactFirstname_example", "BillingContactLastname_example", "test@example", "MediaContactFirstname_example", "MediaContactLastname_example", "test@example", "PmpId_example", "OrderName_example", "OrderLineType_example", "AcceptedTermsId_example", "BilltoCompanyId_example", "BilltoBusinessAddressId_example", "BilltoBillingAddressId_example", openapiclient.Currency("UNK")) // SSIOCreateInsertionOrderRequest | Order line to create.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioInsertionOrderCreate(context.Background(), adAccountId).SSIOCreateInsertionOrderRequest(sSIOCreateInsertionOrderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioInsertionOrderCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioInsertionOrderCreate`: SSIOCreateInsertionOrderResponse
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

 **sSIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md) | Order line to create. | 

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SsioInsertionOrderEdit

> SSIOEditInsertionOrderResponse SsioInsertionOrderEdit(ctx, adAccountId).SSIOEditInsertionOrderRequest(sSIOEditInsertionOrderRequest).Execute()

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
	sSIOEditInsertionOrderRequest := *openapiclient.NewSSIOEditInsertionOrderRequest() // SSIOEditInsertionOrderRequest | Order line to create.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioInsertionOrderEdit(context.Background(), adAccountId).SSIOEditInsertionOrderRequest(sSIOEditInsertionOrderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BillingAPI.SsioInsertionOrderEdit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SsioInsertionOrderEdit`: SSIOEditInsertionOrderResponse
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

 **sSIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md) | Order line to create. | 

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

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
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

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
	pinOrderId := "0Q01N0000015hekSVDFDC" // string | The pin order id associated with the ssio insertion order

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

> SsioOrderLinesGetByAdAccount200Response SsioOrderLinesGetByAdAccount(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).PinOrderId(pinOrderId).Execute()

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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	pinOrderId := "0Q01N0000015hekSVDFDC" // string | The pin order id associated with the ssio insertino order (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BillingAPI.SsioOrderLinesGetByAdAccount(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).PinOrderId(pinOrderId).Execute()
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

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **pinOrderId** | **string** | The pin order id associated with the ssio insertino order | 

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

