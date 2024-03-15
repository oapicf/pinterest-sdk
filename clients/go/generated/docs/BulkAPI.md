# \BulkAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BulkDownloadCreate**](BulkAPI.md#BulkDownloadCreate) | **Post** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**BulkRequestGet**](BulkAPI.md#BulkRequestGet) | **Get** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**BulkUpsertCreate**](BulkAPI.md#BulkUpsertCreate) | **Post** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk



## BulkDownloadCreate

> BulkDownloadResponse BulkDownloadCreate(ctx, adAccountId).BulkDownloadRequest(bulkDownloadRequest).Execute()

Get advertiser entities in bulk



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
	bulkDownloadRequest := *openapiclient.NewBulkDownloadRequest() // BulkDownloadRequest | Parameters to get ad entities in bulk

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BulkAPI.BulkDownloadCreate(context.Background(), adAccountId).BulkDownloadRequest(bulkDownloadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BulkAPI.BulkDownloadCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BulkDownloadCreate`: BulkDownloadResponse
	fmt.Fprintf(os.Stdout, "Response from `BulkAPI.BulkDownloadCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBulkDownloadCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md) | Parameters to get ad entities in bulk | 

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BulkRequestGet

> BulkUpsertStatusResponse BulkRequestGet(ctx, adAccountId, bulkRequestId).IncludeDetails(includeDetails).Execute()

Download advertiser entities in bulk



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
	bulkRequestId := "bulkRequestId_example" // string | Unique identifier of a bulk upsert request.
	includeDetails := true // bool | if set to True then attach the errors/details to all the requests (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BulkAPI.BulkRequestGet(context.Background(), adAccountId, bulkRequestId).IncludeDetails(includeDetails).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BulkAPI.BulkRequestGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BulkRequestGet`: BulkUpsertStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `BulkAPI.BulkRequestGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**bulkRequestId** | **string** | Unique identifier of a bulk upsert request. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBulkRequestGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **includeDetails** | **bool** | if set to True then attach the errors/details to all the requests | [default to false]

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BulkUpsertCreate

> BulkUpsertResponse BulkUpsertCreate(ctx, adAccountId).BulkUpsertRequest(bulkUpsertRequest).Execute()

Create/update ad entities in bulk



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
	bulkUpsertRequest := *openapiclient.NewBulkUpsertRequest() // BulkUpsertRequest | Parameters to get create/update ad entities in bulk

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BulkAPI.BulkUpsertCreate(context.Background(), adAccountId).BulkUpsertRequest(bulkUpsertRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BulkAPI.BulkUpsertCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BulkUpsertCreate`: BulkUpsertResponse
	fmt.Fprintf(os.Stdout, "Response from `BulkAPI.BulkUpsertCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBulkUpsertCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk | 

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

