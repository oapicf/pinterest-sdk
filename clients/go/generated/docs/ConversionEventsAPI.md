# \ConversionEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EventsCreate**](ConversionEventsAPI.md#EventsCreate) | **Post** /ad_accounts/{ad_account_id}/events | Send conversions



## EventsCreate

> ConversionApiResponse EventsCreate(ctx, adAccountId).ConversionEvents(conversionEvents).Test(test).Execute()

Send conversions



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
	conversionEvents := *openapiclient.NewConversionEvents([]openapiclient.ConversionEventsDataInner{*openapiclient.NewConversionEventsDataInner("checkout", "app_ios", int64(1451431341), "eventId0001", *openapiclient.NewConversionEventsUserData([]string{"Em_example"}, []string{"HashedMaids_example"}, "216.3.128.12", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"))}) // ConversionEvents | Conversion events.
	test := true // bool | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionEventsAPI.EventsCreate(context.Background(), adAccountId).ConversionEvents(conversionEvents).Test(test).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionEventsAPI.EventsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EventsCreate`: ConversionApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ConversionEventsAPI.EventsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiEventsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **conversionEvents** | [**ConversionEvents**](ConversionEvents.md) | Conversion events. | 
 **test** | **bool** | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | 

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

