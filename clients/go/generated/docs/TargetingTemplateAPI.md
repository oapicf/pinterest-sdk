# \TargetingTemplateAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TargetingTemplateCreate**](TargetingTemplateAPI.md#TargetingTemplateCreate) | **Post** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**TargetingTemplateList**](TargetingTemplateAPI.md#TargetingTemplateList) | **Get** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**TargetingTemplateUpdate**](TargetingTemplateAPI.md#TargetingTemplateUpdate) | **Patch** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates



## TargetingTemplateCreate

> TargetingTemplate TargetingTemplateCreate(ctx, adAccountId).TargetingTemplateCreate(targetingTemplateCreate).Execute()

Create targeting templates



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
	targetingTemplateCreate := *openapiclient.NewTargetingTemplateCreate("Name_example", *openapiclient.NewTargetingSpecOptimal()) // TargetingTemplateCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TargetingTemplateAPI.TargetingTemplateCreate(context.Background(), adAccountId).TargetingTemplateCreate(targetingTemplateCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TargetingTemplateAPI.TargetingTemplateCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TargetingTemplateCreate`: TargetingTemplate
	fmt.Fprintf(os.Stdout, "Response from `TargetingTemplateAPI.TargetingTemplateCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTargetingTemplateCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) |  | 

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TargetingTemplateList

> TargetingTemplateList200Response TargetingTemplateList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).IncludeSizing(includeSizing).SearchQuery(searchQuery).Execute()

List targeting templates



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
	resp, r, err := apiClient.TargetingTemplateAPI.TargetingTemplateList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).IncludeSizing(includeSizing).SearchQuery(searchQuery).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TargetingTemplateAPI.TargetingTemplateList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TargetingTemplateList`: TargetingTemplateList200Response
	fmt.Fprintf(os.Stdout, "Response from `TargetingTemplateAPI.TargetingTemplateList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTargetingTemplateListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **includeSizing** | **bool** | Include audience sizing in result or not | [default to false]
 **searchQuery** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TargetingTemplateUpdate

> TargetingTemplateUpdate(ctx, adAccountId).TargetingTemplateUpdateRequestReadOrUpdate(targetingTemplateUpdateRequestReadOrUpdate).Execute()

Update targeting templates



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
	targetingTemplateUpdateRequestReadOrUpdate := *openapiclient.NewTargetingTemplateUpdateRequestReadOrUpdate("643", openapiclient.AudienceUpdateOperationType("UPDATE")) // TargetingTemplateUpdateRequestReadOrUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.TargetingTemplateAPI.TargetingTemplateUpdate(context.Background(), adAccountId).TargetingTemplateUpdateRequestReadOrUpdate(targetingTemplateUpdateRequestReadOrUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TargetingTemplateAPI.TargetingTemplateUpdate``: %v\n", err)
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

Other parameters are passed through a pointer to a apiTargetingTemplateUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **targetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md) |  | 

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

