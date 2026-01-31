# \ConversionEqsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionEqsList**](ConversionEqsAPI.md#ConversionEqsList) | **Get** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)



## ConversionEqsList

> []EventQualityScore ConversionEqsList(ctx, adAccountId).LookbackPeriod(lookbackPeriod).SourcePlatform(sourcePlatform).IngestionSource(ingestionSource).Execute()

Get event quality score (EQS)



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
	lookbackPeriod := openapiclient.LookbackPeriodOptions("1d") // LookbackPeriodOptions | Lookback window (number of days).
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	sourcePlatform := openapiclient.SourcePlatformOptions("WEB") // SourcePlatformOptions | Source platform of event. (optional)
	ingestionSource := openapiclient.IngestionSourceOptions("TAG") // IngestionSourceOptions | Ingestion source of event. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionEqsAPI.ConversionEqsList(context.Background(), adAccountId).LookbackPeriod(lookbackPeriod).SourcePlatform(sourcePlatform).IngestionSource(ingestionSource).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionEqsAPI.ConversionEqsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionEqsList`: []EventQualityScore
	fmt.Fprintf(os.Stdout, "Response from `ConversionEqsAPI.ConversionEqsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionEqsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) | Lookback window (number of days). | 

 **sourcePlatform** | [**SourcePlatformOptions**](SourcePlatformOptions.md) | Source platform of event. | 
 **ingestionSource** | [**IngestionSourceOptions**](IngestionSourceOptions.md) | Ingestion source of event. | 

### Return type

[**[]EventQualityScore**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

