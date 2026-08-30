# \ProductTagsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductTagsBulkAdd**](ProductTagsAPI.md#ProductTagsBulkAdd) | **Post** /pins/{pin_id}/product_tags | Add product tags to pin
[**ProductTagsBulkDelete**](ProductTagsAPI.md#ProductTagsBulkDelete) | **Post** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**ProductTagsList**](ProductTagsAPI.md#ProductTagsList) | **Get** /pins/{pin_id}/product_tags | Get product tags for pin



## ProductTagsBulkAdd

> ProductTagsResponse ProductTagsBulkAdd(ctx, pinId).ProductTagsBulkAddRequest(productTagsBulkAddRequest).Execute()

Add product tags to pin



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
	pinId := "pinId_example" // string | Unique identifier of the hero pin that will receive product tags.
	productTagsBulkAddRequest := *openapiclient.NewProductTagsBulkAddRequest([]openapiclient.ProductTagItem{*openapiclient.NewProductTagItem("PinId_example")}) // ProductTagsBulkAddRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductTagsAPI.ProductTagsBulkAdd(context.Background(), pinId).ProductTagsBulkAddRequest(productTagsBulkAddRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductTagsAPI.ProductTagsBulkAdd``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductTagsBulkAdd`: ProductTagsResponse
	fmt.Fprintf(os.Stdout, "Response from `ProductTagsAPI.ProductTagsBulkAdd`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of the hero pin that will receive product tags. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductTagsBulkAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md) |  | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductTagsBulkDelete

> ProductTagsBulkDelete(ctx, pinId).ProductTagsBulkDeleteRequest(productTagsBulkDeleteRequest).Execute()

Delete product tags from pin



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
	pinId := "pinId_example" // string | Unique identifier of the hero pin that will receive product tags.
	productTagsBulkDeleteRequest := *openapiclient.NewProductTagsBulkDeleteRequest([]openapiclient.ProductTagItem{*openapiclient.NewProductTagItem("PinId_example")}) // ProductTagsBulkDeleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.ProductTagsAPI.ProductTagsBulkDelete(context.Background(), pinId).ProductTagsBulkDeleteRequest(productTagsBulkDeleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductTagsAPI.ProductTagsBulkDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of the hero pin that will receive product tags. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductTagsBulkDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md) |  | 

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


## ProductTagsList

> ProductTagsResponse ProductTagsList(ctx, pinId).Execute()

Get product tags for pin



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
	pinId := "pinId_example" // string | Unique identifier of the hero pin that will receive product tags.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductTagsAPI.ProductTagsList(context.Background(), pinId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductTagsAPI.ProductTagsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductTagsList`: ProductTagsResponse
	fmt.Fprintf(os.Stdout, "Response from `ProductTagsAPI.ProductTagsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of the hero pin that will receive product tags. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductTagsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

