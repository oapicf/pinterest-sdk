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

> PromotionsResponse PromotionsCreate(ctx, adAccountId).PromotionCreateRequest(promotionCreateRequest).Execute()

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
	promotionCreateRequest := []openapiclient.PromotionCreateRequest{*openapiclient.NewPromotionCreateRequest("Black Friday 10% off", openapiclient.PromotionType("VARIABLE"))} // []PromotionCreateRequest | List of promotions to create, size limit [1, 30].

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsCreate(context.Background(), adAccountId).PromotionCreateRequest(promotionCreateRequest).Execute()
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

 **promotionCreateRequest** | [**[]PromotionCreateRequest**](PromotionCreateRequest.md) | List of promotions to create, size limit [1, 30]. | 

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

> PromotionsDelete(ctx, adAccountId, promotionId).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	promotionId := "promotionId_example" // string | Unique identifier of a promotion

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.PromotionsAPI.PromotionsDelete(context.Background(), adAccountId, promotionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**promotionId** | **string** | Unique identifier of a promotion | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PromotionsGet

> PromotionResponse PromotionsGet(ctx, adAccountId, promotionId).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	promotionId := "promotionId_example" // string | Unique identifier of a promotion

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsGet(context.Background(), adAccountId, promotionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PromotionsAPI.PromotionsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PromotionsGet`: PromotionResponse
	fmt.Fprintf(os.Stdout, "Response from `PromotionsAPI.PromotionsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**promotionId** | **string** | Unique identifier of a promotion | 

### Other Parameters

Other parameters are passed through a pointer to a apiPromotionsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PromotionsList

> PromotionsList200Response PromotionsList(ctx, adAccountId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()

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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsList(context.Background(), adAccountId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()
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

 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

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

> PromotionsResponse PromotionsUpdate(ctx, adAccountId).PromotionUpdateRequest(promotionUpdateRequest).Execute()

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
	promotionUpdateRequest := []openapiclient.PromotionUpdateRequest{*openapiclient.NewPromotionUpdateRequest("7834020347906")} // []PromotionUpdateRequest | List of promotions to create, size limit [1, 30].

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PromotionsAPI.PromotionsUpdate(context.Background(), adAccountId).PromotionUpdateRequest(promotionUpdateRequest).Execute()
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

 **promotionUpdateRequest** | [**[]PromotionUpdateRequest**](PromotionUpdateRequest.md) | List of promotions to create, size limit [1, 30]. | 

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

