# \AdvancedAuctionAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancedAuctionItemsGetPost**](AdvancedAuctionAPI.md#AdvancedAuctionItemsGetPost) | **Post** /advanced_auction/items/get | Get item bid options (POST)
[**AdvancedAuctionItemsSubmitPost**](AdvancedAuctionAPI.md#AdvancedAuctionItemsSubmitPost) | **Post** /advanced_auction/items/submit | Operate on item level bid options



## AdvancedAuctionItemsGetPost

> AdvancedAuctionItems AdvancedAuctionItemsGetPost(ctx).AdvancedAuctionItemsGetRequest(advancedAuctionItemsGetRequest).AdAccountId(adAccountId).Execute()

Get item bid options (POST)



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
	advancedAuctionItemsGetRequest := *openapiclient.NewAdvancedAuctionItemsGetRequest("2680059592705", []openapiclient.AdvancedAuctionItemsGetRecord{*openapiclient.NewAdvancedAuctionItemsGetRecord("DS0294-M", openapiclient.Country("AD"), openapiclient.Language("AM"))}) // AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdvancedAuctionAPI.AdvancedAuctionItemsGetPost(context.Background()).AdvancedAuctionItemsGetRequest(advancedAuctionItemsGetRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdvancedAuctionAPI.AdvancedAuctionItemsGetPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvancedAuctionItemsGetPost`: AdvancedAuctionItems
	fmt.Fprintf(os.Stdout, "Response from `AdvancedAuctionAPI.AdvancedAuctionItemsGetPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdvancedAuctionItemsGetPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md) | Request object used to get bid options values for a batch of retail catalog items | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdvancedAuctionItemsSubmitPost

> AdvancedAuctionProcessedItems AdvancedAuctionItemsSubmitPost(ctx).AdvancedAuctionItemsSubmitRequest(advancedAuctionItemsSubmitRequest).AdAccountId(adAccountId).Execute()

Operate on item level bid options



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
	advancedAuctionItemsSubmitRequest := *openapiclient.NewAdvancedAuctionItemsSubmitRequest("2680059592705", []openapiclient.AdvancedAuctionItemsSubmitRecord{openapiclient.AdvancedAuctionItemsSubmitRecord{AdvancedAuctionItemsSubmitDeleteRecord: openapiclient.NewAdvancedAuctionItemsSubmitDeleteRecord("DS0294-M", openapiclient.Country("AD"), openapiclient.Language("AM"))}}) // AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdvancedAuctionAPI.AdvancedAuctionItemsSubmitPost(context.Background()).AdvancedAuctionItemsSubmitRequest(advancedAuctionItemsSubmitRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdvancedAuctionAPI.AdvancedAuctionItemsSubmitPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvancedAuctionItemsSubmitPost`: AdvancedAuctionProcessedItems
	fmt.Fprintf(os.Stdout, "Response from `AdvancedAuctionAPI.AdvancedAuctionItemsSubmitPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdvancedAuctionItemsSubmitPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md) | Request object used to upsert or delete bid options for a batch of retail catalog items | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

