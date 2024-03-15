# \ProductGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsCatalogsProductGroupsList**](ProductGroupsAPI.md#AdAccountsCatalogsProductGroupsList) | **Get** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups



## AdAccountsCatalogsProductGroupsList

> AdAccountsCatalogsProductGroupsList200Response AdAccountsCatalogsProductGroupsList(ctx, adAccountId).FeedProfileId(feedProfileId).Execute()

Get catalog product groups



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
	feedProfileId := "feedProfileId_example" // string | The feed profile id whose catalog product groups we want to return. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupsAPI.AdAccountsCatalogsProductGroupsList(context.Background(), adAccountId).FeedProfileId(feedProfileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupsAPI.AdAccountsCatalogsProductGroupsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdAccountsCatalogsProductGroupsList`: AdAccountsCatalogsProductGroupsList200Response
	fmt.Fprintf(os.Stdout, "Response from `ProductGroupsAPI.AdAccountsCatalogsProductGroupsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsCatalogsProductGroupsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **feedProfileId** | **string** | The feed profile id whose catalog product groups we want to return. | 

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

