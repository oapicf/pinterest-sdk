# \ConversionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvertiserDefinedEventsGet**](ConversionsAPI.md#AdvertiserDefinedEventsGet) | **Get** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events



## AdvertiserDefinedEventsGet

> AdvertiserDefinedEventsResponse AdvertiserDefinedEventsGet(ctx, adAccountId).Execute()

Get advertiser defined events



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionsAPI.AdvertiserDefinedEventsGet(context.Background(), adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionsAPI.AdvertiserDefinedEventsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvertiserDefinedEventsGet`: AdvertiserDefinedEventsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConversionsAPI.AdvertiserDefinedEventsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdvertiserDefinedEventsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**AdvertiserDefinedEventsResponse**](AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

