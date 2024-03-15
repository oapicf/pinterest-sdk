# \AudienceInsightsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudienceInsightsGet**](AudienceInsightsAPI.md#AudienceInsightsGet) | **Get** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**AudienceInsightsScopeAndTypeGet**](AudienceInsightsAPI.md#AudienceInsightsScopeAndTypeGet) | **Get** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type



## AudienceInsightsGet

> AudienceInsightsResponse AudienceInsightsGet(ctx, adAccountId).AudienceInsightType(audienceInsightType).Execute()

Get audience insights



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
	audienceInsightType := openapiclient.AudienceInsightType("YOUR_TOTAL_AUDIENCE") // AudienceInsightType | Type of audience insights. (default to "YOUR_TOTAL_AUDIENCE")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceInsightsAPI.AudienceInsightsGet(context.Background(), adAccountId).AudienceInsightType(audienceInsightType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceInsightsAPI.AudienceInsightsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudienceInsightsGet`: AudienceInsightsResponse
	fmt.Fprintf(os.Stdout, "Response from `AudienceInsightsAPI.AudienceInsightsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudienceInsightsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **audienceInsightType** | [**AudienceInsightType**](AudienceInsightType.md) | Type of audience insights. | [default to &quot;YOUR_TOTAL_AUDIENCE&quot;]

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudienceInsightsScopeAndTypeGet

> AudienceDefinitionResponse AudienceInsightsScopeAndTypeGet(ctx, adAccountId).Execute()

Get audience insights scope and type



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
	resp, r, err := apiClient.AudienceInsightsAPI.AudienceInsightsScopeAndTypeGet(context.Background(), adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceInsightsAPI.AudienceInsightsScopeAndTypeGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudienceInsightsScopeAndTypeGet`: AudienceDefinitionResponse
	fmt.Fprintf(os.Stdout, "Response from `AudienceInsightsAPI.AudienceInsightsScopeAndTypeGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudienceInsightsScopeAndTypeGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

