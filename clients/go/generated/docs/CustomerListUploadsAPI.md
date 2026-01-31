# \CustomerListUploadsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListUploadsCreate**](CustomerListUploadsAPI.md#CustomerListUploadsCreate) | **Post** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**CustomerListUploadsGet**](CustomerListUploadsAPI.md#CustomerListUploadsGet) | **Get** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**CustomerListUploadsRun**](CustomerListUploadsAPI.md#CustomerListUploadsRun) | **Post** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload



## CustomerListUploadsCreate

> CustomerListUploadCreateResponse CustomerListUploadsCreate(ctx, adAccountId, customerListId).CustomerListUploadCreateRequest(customerListUploadCreateRequest).Execute()

Create customer list upload



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
	customerListId := "customerListId_example" // string | Unique identifier of a customer list
	customerListUploadCreateRequest := *openapiclient.NewCustomerListUploadCreateRequest(openapiclient.UserListOperationType("ADD"), int32(2)) // CustomerListUploadCreateRequest | Parameters to create a customer list upload request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListUploadsAPI.CustomerListUploadsCreate(context.Background(), adAccountId, customerListId).CustomerListUploadCreateRequest(customerListUploadCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListUploadsAPI.CustomerListUploadsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListUploadsCreate`: CustomerListUploadCreateResponse
	fmt.Fprintf(os.Stdout, "Response from `CustomerListUploadsAPI.CustomerListUploadsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**customerListId** | **string** | Unique identifier of a customer list | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListUploadsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md) | Parameters to create a customer list upload request | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerListUploadsGet

> CustomerListUploadResponse CustomerListUploadsGet(ctx, adAccountId, customerListId, customerListUploadId).Execute()

Get customer list upload



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
	customerListId := "customerListId_example" // string | Unique identifier of a customer list
	customerListUploadId := "customerListUploadId_example" // string | Unique identifier of a customer list upload

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListUploadsAPI.CustomerListUploadsGet(context.Background(), adAccountId, customerListId, customerListUploadId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListUploadsAPI.CustomerListUploadsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListUploadsGet`: CustomerListUploadResponse
	fmt.Fprintf(os.Stdout, "Response from `CustomerListUploadsAPI.CustomerListUploadsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**customerListId** | **string** | Unique identifier of a customer list | 
**customerListUploadId** | **string** | Unique identifier of a customer list upload | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListUploadsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CustomerListUploadsRun

> CustomerListUploadResponse CustomerListUploadsRun(ctx, adAccountId, customerListId, customerListUploadId).Execute()

Run customer list upload



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
	customerListId := "customerListId_example" // string | Unique identifier of a customer list
	customerListUploadId := "customerListUploadId_example" // string | Unique identifier of a customer list upload

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CustomerListUploadsAPI.CustomerListUploadsRun(context.Background(), adAccountId, customerListId, customerListUploadId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CustomerListUploadsAPI.CustomerListUploadsRun``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CustomerListUploadsRun`: CustomerListUploadResponse
	fmt.Fprintf(os.Stdout, "Response from `CustomerListUploadsAPI.CustomerListUploadsRun`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**customerListId** | **string** | Unique identifier of a customer list | 
**customerListUploadId** | **string** | Unique identifier of a customer list upload | 

### Other Parameters

Other parameters are passed through a pointer to a apiCustomerListUploadsRunRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

