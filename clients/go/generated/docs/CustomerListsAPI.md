# \CustomerListsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListsCreate**](CustomerListsAPI.md#CustomerListsCreate) | **Post** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**CustomerListsGet**](CustomerListsAPI.md#CustomerListsGet) | **Get** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**CustomerListsList**](CustomerListsAPI.md#CustomerListsList) | **Get** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**CustomerListsUpdate**](CustomerListsAPI.md#CustomerListsUpdate) | **Patch** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list



## CustomerListsCreate

> CustomerList CustomerListsCreate(ctx, adAccountId).CustomerListCreate(customerListCreate).Execute()

Create customer lists



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
	adAccountId := "adAccountId_example" // string | 
	customerListCreate := *openapiclient.NewCustomerListCreate("The Glengarry Glen Ross leads") // CustomerListCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListsAPI.CustomerListsCreate(context.Background(), adAccountId).CustomerListCreate(customerListCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListsAPI.CustomerListsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListsCreate`: CustomerList
	fmt.Fprintf(os.Stdout, "Response from `CustomerListsAPI.CustomerListsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **customerListCreate** | [**CustomerListCreate**](CustomerListCreate.md) |  | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerListsGet

> CustomerList CustomerListsGet(ctx, adAccountId, customerListId).Execute()

Get customer list



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
	adAccountId := "adAccountId_example" // string | 
	customerListId := "customerListId_example" // string | Customer list ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListsAPI.CustomerListsGet(context.Background(), adAccountId, customerListId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListsAPI.CustomerListsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListsGet`: CustomerList
	fmt.Fprintf(os.Stdout, "Response from `CustomerListsAPI.CustomerListsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 
**customerListId** | **string** | Customer list ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerListsList

> CustomerListsList200Response CustomerListsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).ExcludeNca(excludeNca).Execute()

Get customer lists



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
	adAccountId := "adAccountId_example" // string | 
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	excludeNca := true // bool | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListsAPI.CustomerListsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).ExcludeNca(excludeNca).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListsAPI.CustomerListsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListsList`: CustomerListsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CustomerListsAPI.CustomerListsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **excludeNca** | **bool** | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [default to false]

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerListsUpdate

> CustomerList CustomerListsUpdate(ctx, adAccountId, customerListId).CustomerListUpdateWithRequiredBody(customerListUpdateWithRequiredBody).Execute()

Update customer list



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
	adAccountId := "adAccountId_example" // string | 
	customerListId := "customerListId_example" // string | Customer list ID.
	customerListUpdateWithRequiredBody := *openapiclient.NewCustomerListUpdateWithRequiredBody(openapiclient.UserListOperationType("ADD")) // CustomerListUpdateWithRequiredBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListsAPI.CustomerListsUpdate(context.Background(), adAccountId, customerListId).CustomerListUpdateWithRequiredBody(customerListUpdateWithRequiredBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListsAPI.CustomerListsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListsUpdate`: CustomerList
	fmt.Fprintf(os.Stdout, "Response from `CustomerListsAPI.CustomerListsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 
**customerListId** | **string** | Customer list ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **customerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md) |  | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

