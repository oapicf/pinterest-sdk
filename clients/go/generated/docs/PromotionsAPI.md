# \PromotionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PromotionsCreate**](PromotionsAPI.md#PromotionsCreate) | **Post** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**PromotionsDelete**](PromotionsAPI.md#PromotionsDelete) | **Delete** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**PromotionsGet**](PromotionsAPI.md#PromotionsGet) | **Get** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**PromotionsList**](PromotionsAPI.md#PromotionsList) | **Get** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**PromotionsUpdate**](PromotionsAPI.md#PromotionsUpdate) | **Patch** /ad_accounts/{ad_account_id}/promotions | Update promotions



## PromotionsCreate

> PromotionsResponse PromotionsCreate(ctx, adAccountId).PromotionCreate(promotionCreate).Execute()

Create promotions



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
	promotionCreate := []openapiclient.PromotionCreate{*openapiclient.NewPromotionCreate("PromotionTitle_example", openapiclient.PromotionType("VARIABLE"))} // []PromotionCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsCreate(context.Background(), adAccountId).PromotionCreate(promotionCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PromotionsCreate`: PromotionsResponse
	fmt.Fprintf(os.Stdout, "Response from `PromotionsAPI.PromotionsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **promotionCreate** | [**[]PromotionCreate**](PromotionCreate.md) |  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PromotionsDelete

> Promotion PromotionsDelete(ctx, promotionId, adAccountId).Execute()

Delete promotion by id



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
	promotionId := "promotionId_example" // string | Promotion ID
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsDelete(context.Background(), promotionId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PromotionsDelete`: Promotion
	fmt.Fprintf(os.Stdout, "Response from `PromotionsAPI.PromotionsDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**promotionId** | **string** | Promotion ID | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PromotionsGet

> Promotion PromotionsGet(ctx, promotionId, adAccountId).Execute()

Get promotion by id



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
	promotionId := "promotionId_example" // string | Promotion ID
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsGet(context.Background(), promotionId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PromotionsGet`: Promotion
	fmt.Fprintf(os.Stdout, "Response from `PromotionsAPI.PromotionsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**promotionId** | **string** | Promotion ID | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PromotionsList

> PromotionsList200Response PromotionsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()

Get promotions



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
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PromotionsList`: PromotionsList200Response
	fmt.Fprintf(os.Stdout, "Response from `PromotionsAPI.PromotionsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PromotionsUpdate

> PromotionsResponse PromotionsUpdate(ctx, adAccountId).PromotionBatchUpdate(promotionBatchUpdate).Execute()

Update promotions



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
	promotionBatchUpdate := []openapiclient.PromotionBatchUpdate{*openapiclient.NewPromotionBatchUpdate("Id_example")} // []PromotionBatchUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsUpdate(context.Background(), adAccountId).PromotionBatchUpdate(promotionBatchUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PromotionsUpdate`: PromotionsResponse
	fmt.Fprintf(os.Stdout, "Response from `PromotionsAPI.PromotionsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **promotionBatchUpdate** | [**[]PromotionBatchUpdate**](PromotionBatchUpdate.md) |  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

