# \BulkAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BulkDownloadCreate**](BulkAPI.md#BulkDownloadCreate) | **Post** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**BulkRequestGet**](BulkAPI.md#BulkRequestGet) | **Get** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**BulkUpsertCreate**](BulkAPI.md#BulkUpsertCreate) | **Post** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk



## BulkDownloadCreate

> BulkDownload BulkDownloadCreate(ctx, adAccountId).BulkDownloadCreate(bulkDownloadCreate).Execute()

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
	bulkDownloadCreate := *openapiclient.NewBulkDownloadCreate() // BulkDownloadCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BulkAPI.BulkDownloadCreate(context.Background(), adAccountId).BulkDownloadCreate(bulkDownloadCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BulkAPI.BulkDownloadCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BulkDownloadCreate`: BulkDownload
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

 **bulkDownloadCreate** | [**BulkDownloadCreate**](BulkDownloadCreate.md) |  | 

### Return type

[**BulkDownload**](BulkDownload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BulkRequestGet

> BulkJobData BulkRequestGet(ctx, adAccountId, bulkRequestId).IncludeDetails(includeDetails).Execute()

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
	bulkRequestId := "bulkRequestId_example" // string | Bulk request ID that is from one of the entities bulk endpoints
	includeDetails := true // bool | If set to True then attach the errors/details to all the requests (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BulkAPI.BulkRequestGet(context.Background(), adAccountId, bulkRequestId).IncludeDetails(includeDetails).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BulkAPI.BulkRequestGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BulkRequestGet`: BulkJobData
	fmt.Fprintf(os.Stdout, "Response from `BulkAPI.BulkRequestGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**bulkRequestId** | **string** | Bulk request ID that is from one of the entities bulk endpoints | 

### Other Parameters

Other parameters are passed through a pointer to a apiBulkRequestGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **includeDetails** | **bool** | If set to True then attach the errors/details to all the requests | [default to false]

### Return type

[**BulkJobData**](BulkJobData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

