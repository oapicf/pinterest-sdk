# \MsotEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MsotEventsCreate**](MsotEventsAPI.md#MsotEventsCreate) | **Post** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events



## MsotEventsCreate

> MsotEventsCreate(ctx, adAccountId).ConversionMSOTEventsCreate(conversionMSOTEventsCreate).Execute()

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
	conversionMSOTEventsCreate := *openapiclient.NewConversionMSOTEventsCreate("2680060704746", "eventId0001", openapiclient.MsotEventName("add_to_cart"), int64(1451431341)) // ConversionMSOTEventsCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.MsotEventsAPI.MsotEventsCreate(context.Background(), adAccountId).ConversionMSOTEventsCreate(conversionMSOTEventsCreate).Execute()
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

 **conversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md) |  | 

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

