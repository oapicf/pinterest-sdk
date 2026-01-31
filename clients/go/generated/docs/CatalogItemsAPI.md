# \CatalogItemsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemsBatchGet**](CatalogItemsAPI.md#ItemsBatchGet) | **Get** /catalogs/items/batch/{batch_id} | Get item batch status
[**ItemsBatchPost**](CatalogItemsAPI.md#ItemsBatchPost) | **Post** /catalogs/items/batch | Operate on item batch
[**ItemsPost**](CatalogItemsAPI.md#ItemsPost) | **Post** /catalogs/items | Get catalogs items (POST)



## ItemsBatchGet

> CatalogsItemsBatch ItemsBatchGet(ctx, batchId).AdAccountId(adAccountId).Execute()

Get item batch status



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
	batchId := "66753b9bb65c46c49bd8503b27fecf9e" // string | Id of a catalogs items batch to fetch
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogItemsAPI.ItemsBatchGet(context.Background(), batchId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogItemsAPI.ItemsBatchGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsBatchGet`: CatalogsItemsBatch
	fmt.Fprintf(os.Stdout, "Response from `CatalogItemsAPI.ItemsBatchGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string** | Id of a catalogs items batch to fetch | 

### Other Parameters

Other parameters are passed through a pointer to a apiItemsBatchGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchPost

> CatalogsItemsBatch ItemsBatchPost(ctx).ItemsBatchPostRequest(itemsBatchPostRequest).AdAccountId(adAccountId).Execute()

Operate on item batch



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
	itemsBatchPostRequest := openapiclient.items_batch_post_request{CatalogsItemsBatchRequest: openapiclient.CatalogsItemsBatchRequest{CatalogsItemsCreateBatchRequest: openapiclient.NewCatalogsItemsCreateBatchRequest(openapiclient.Country("AD"), []openapiclient.ItemCreateBatchRecord{*openapiclient.NewItemCreateBatchRecord()}, "Language_example", openapiclient.BatchOperation("UPDATE"))}} // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogItemsAPI.ItemsBatchPost(context.Background()).ItemsBatchPostRequest(itemsBatchPostRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogItemsAPI.ItemsBatchPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsBatchPost`: CatalogsItemsBatch
	fmt.Fprintf(os.Stdout, "Response from `CatalogItemsAPI.ItemsBatchPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsBatchPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md) | Request object used to create catalogs items in a batch | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsPost

> CatalogsItems ItemsPost(ctx).CatalogsItemsRequest(catalogsItemsRequest).AdAccountId(adAccountId).Execute()

Get catalogs items (POST)



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
	catalogsItemsRequest := *openapiclient.NewCatalogsItemsRequest(openapiclient.Country("AD"), openapiclient.CatalogsItemsPostFilters{CatalogsCreativeAssetsItemsPostFilter: openapiclient.NewCatalogsCreativeAssetsItemsPostFilter("CatalogType_example", []string{"CreativeAssetsIds_example"})}, "Language_example") // CatalogsItemsRequest | Request object used to get catalogs items
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogItemsAPI.ItemsPost(context.Background()).CatalogsItemsRequest(catalogsItemsRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogItemsAPI.ItemsPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsPost`: CatalogsItems
	fmt.Fprintf(os.Stdout, "Response from `CatalogItemsAPI.ItemsPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md) | Request object used to get catalogs items | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

