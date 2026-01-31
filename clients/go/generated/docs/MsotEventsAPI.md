# \MsotEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MsotEventsCreate**](MsotEventsAPI.md#MsotEventsCreate) | **Post** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events



## MsotEventsCreate

> MsotEventsCreate(ctx, adAccountId).ConversionMSOTEvents(conversionMSOTEvents).Execute()

Send Measurement Source Of Truth (MSOT) attributed conversion events



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
	conversionMSOTEvents := *openapiclient.NewConversionMSOTEvents("2680060704746", "click", "eventId0001", "add_to_cart", int64(1451431341)) // ConversionMSOTEvents | Attributed MSOT conversion events

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.MsotEventsAPI.MsotEventsCreate(context.Background(), adAccountId).ConversionMSOTEvents(conversionMSOTEvents).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MsotEventsAPI.MsotEventsCreate``: %v\n", err)
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

Other parameters are passed through a pointer to a apiMsotEventsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **conversionMSOTEvents** | [**ConversionMSOTEvents**](ConversionMSOTEvents.md) | Attributed MSOT conversion events | 

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

