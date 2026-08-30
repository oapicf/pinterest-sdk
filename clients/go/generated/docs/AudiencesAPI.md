# \AudiencesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesCreate**](AudiencesAPI.md#AudiencesCreate) | **Post** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesGet**](AudiencesAPI.md#AudiencesGet) | **Get** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesList**](AudiencesAPI.md#AudiencesList) | **Get** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesUpdate**](AudiencesAPI.md#AudiencesUpdate) | **Patch** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience



## AudiencesCreate

> AdAccountsAudience AudiencesCreate(ctx, adAccountId).AdAccountsAudienceCreate(adAccountsAudienceCreate).Execute()

Create audience



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
	adAccountsAudienceCreate := *openapiclient.NewAdAccountsAudienceCreate() // AdAccountsAudienceCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesCreate(context.Background(), adAccountId).AdAccountsAudienceCreate(adAccountsAudienceCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesCreate`: AdAccountsAudience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md) |  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudiencesGet

> AdAccountsAudience AudiencesGet(ctx, audienceId, adAccountId).Execute()

Get audience



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
	audienceId := "audienceId_example" // string | Audience ID.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesGet(context.Background(), audienceId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesGet`: AdAccountsAudience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**audienceId** | **string** | Audience ID. | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudiencesList

> AudiencesList200Response AudiencesList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).OwnershipType(ownershipType).ExcludeNca(excludeNca).Execute()

List audiences



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
	ownershipType := openapiclient.AudienceOwnershipType("OWNED") // AudienceOwnershipType |  (optional)
	excludeNca := true // bool | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).OwnershipType(ownershipType).ExcludeNca(excludeNca).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesList`: AudiencesList200Response
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **ownershipType** | [**AudienceOwnershipType**](AudienceOwnershipType.md) |  | 
 **excludeNca** | **bool** | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [default to false]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudiencesUpdate

> AdAccountsAudience AudiencesUpdate(ctx, audienceId, adAccountId).AdAccountsAudienceUpdate(adAccountsAudienceUpdate).Execute()

Update audience



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
	audienceId := "audienceId_example" // string | Audience ID.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	adAccountsAudienceUpdate := *openapiclient.NewAdAccountsAudienceUpdate() // AdAccountsAudienceUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesUpdate(context.Background(), audienceId, adAccountId).AdAccountsAudienceUpdate(adAccountsAudienceUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesUpdate`: AdAccountsAudience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**audienceId** | **string** | Audience ID. | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md) |  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

