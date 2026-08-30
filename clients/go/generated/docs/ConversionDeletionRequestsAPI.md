# \ConversionDeletionRequestsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionDeletionRequestCreate**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestCreate) | **Post** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**ConversionDeletionRequestDelete**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestDelete) | **Delete** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**ConversionDeletionRequestGet**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestGet) | **Get** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**ConversionDeletionRequestList**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestList) | **Get** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests



## ConversionDeletionRequestCreate

> ConversionDeletionRequest ConversionDeletionRequestCreate(ctx, adAccountId).ConversionDeletionRequestCreate(conversionDeletionRequestCreate).Execute()

Create a conversion deletion request



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
	conversionDeletionRequestCreate := *openapiclient.NewConversionDeletionRequestCreate(*openapiclient.NewConversionDeletionRequestTargets([]string{"UserEmails_example"}, []string{"Epiks_example"})) // ConversionDeletionRequestCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionDeletionRequestsAPI.ConversionDeletionRequestCreate(context.Background(), adAccountId).ConversionDeletionRequestCreate(conversionDeletionRequestCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionDeletionRequestsAPI.ConversionDeletionRequestCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionDeletionRequestCreate`: ConversionDeletionRequest
	fmt.Fprintf(os.Stdout, "Response from `ConversionDeletionRequestsAPI.ConversionDeletionRequestCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionDeletionRequestCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **conversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md) |  | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversionDeletionRequestDelete

> ConversionDeletionRequest ConversionDeletionRequestDelete(ctx, requestId, adAccountId).Execute()

Delete a conversion deletion request



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
	requestId := "requestId_example" // string | Unique identifier of the conversion deletion request
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionDeletionRequestsAPI.ConversionDeletionRequestDelete(context.Background(), requestId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionDeletionRequestsAPI.ConversionDeletionRequestDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionDeletionRequestDelete`: ConversionDeletionRequest
	fmt.Fprintf(os.Stdout, "Response from `ConversionDeletionRequestsAPI.ConversionDeletionRequestDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**requestId** | **string** | Unique identifier of the conversion deletion request | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionDeletionRequestDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversionDeletionRequestGet

> ConversionDeletionRequest ConversionDeletionRequestGet(ctx, requestId, adAccountId).Execute()

Get a single conversion deletion request



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
	requestId := "requestId_example" // string | Unique identifier of the conversion deletion request
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionDeletionRequestsAPI.ConversionDeletionRequestGet(context.Background(), requestId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionDeletionRequestsAPI.ConversionDeletionRequestGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionDeletionRequestGet`: ConversionDeletionRequest
	fmt.Fprintf(os.Stdout, "Response from `ConversionDeletionRequestsAPI.ConversionDeletionRequestGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**requestId** | **string** | Unique identifier of the conversion deletion request | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionDeletionRequestGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversionDeletionRequestList

> ConversionDeletionRequestList200Response ConversionDeletionRequestList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()

List conversion deletion requests



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
	resp, r, err := apiClient.ConversionDeletionRequestsAPI.ConversionDeletionRequestList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionDeletionRequestsAPI.ConversionDeletionRequestList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionDeletionRequestList`: ConversionDeletionRequestList200Response
	fmt.Fprintf(os.Stdout, "Response from `ConversionDeletionRequestsAPI.ConversionDeletionRequestList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionDeletionRequestListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 

### Return type

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

