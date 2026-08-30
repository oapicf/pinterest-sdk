# \CustomerSegmentAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerSegmentCreate**](CustomerSegmentAPI.md#CustomerSegmentCreate) | **Post** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**CustomerSegmentList**](CustomerSegmentAPI.md#CustomerSegmentList) | **Get** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**CustomerSegmentUpdate**](CustomerSegmentAPI.md#CustomerSegmentUpdate) | **Patch** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments



## CustomerSegmentCreate

> CustomerSegment CustomerSegmentCreate(ctx, adAccountId).CustomerSegmentCreate(customerSegmentCreate).Execute()

Create customer segments



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
	customerSegmentCreate := *openapiclient.NewCustomerSegmentCreate([]string{"AudienceIds_example"}, "Name_example") // CustomerSegmentCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerSegmentAPI.CustomerSegmentCreate(context.Background(), adAccountId).CustomerSegmentCreate(customerSegmentCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerSegmentAPI.CustomerSegmentCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerSegmentCreate`: CustomerSegment
	fmt.Fprintf(os.Stdout, "Response from `CustomerSegmentAPI.CustomerSegmentCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerSegmentCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md) |  | 

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerSegmentList

> CustomerSegmentList200Response CustomerSegmentList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).IncludeSizing(includeSizing).SearchQuery(searchQuery).Execute()

List customer segments



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
	includeSizing := true // bool | Include audience sizing in result or not (optional) (default to false)
	searchQuery := "searchQuery_example" // string | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerSegmentAPI.CustomerSegmentList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).IncludeSizing(includeSizing).SearchQuery(searchQuery).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerSegmentAPI.CustomerSegmentList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerSegmentList`: CustomerSegmentList200Response
	fmt.Fprintf(os.Stdout, "Response from `CustomerSegmentAPI.CustomerSegmentList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerSegmentListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **includeSizing** | **bool** | Include audience sizing in result or not | [default to false]
 **searchQuery** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | 

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerSegmentUpdate

> CustomerSegmentUpdate(ctx, adAccountId).CustomerSegmentUpdateRequestUpdateWithRequiredBody(customerSegmentUpdateRequestUpdateWithRequiredBody).Execute()

Update customer segments



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
	customerSegmentUpdateRequestUpdateWithRequiredBody := *openapiclient.NewCustomerSegmentUpdateRequestUpdateWithRequiredBody("Id_example", openapiclient.AudienceUpdateOperationType("UPDATE")) // CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CustomerSegmentAPI.CustomerSegmentUpdate(context.Background(), adAccountId).CustomerSegmentUpdateRequestUpdateWithRequiredBody(customerSegmentUpdateRequestUpdateWithRequiredBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerSegmentAPI.CustomerSegmentUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerSegmentUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

