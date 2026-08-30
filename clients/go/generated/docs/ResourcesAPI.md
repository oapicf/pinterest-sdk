# \ResourcesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountCountriesGet**](ResourcesAPI.md#AdAccountCountriesGet) | **Get** /resources/ad_account_countries | Get ad accounts countries
[**DeliveryMetricsGet**](ResourcesAPI.md#DeliveryMetricsGet) | **Get** /resources/delivery_metrics | Get available metrics&#39; definitions
[**InterestTargetingOptionsGet**](ResourcesAPI.md#InterestTargetingOptionsGet) | **Get** /resources/targeting/interests/{interest_id} | Get interest details
[**LeadFormQuestionsGet**](ResourcesAPI.md#LeadFormQuestionsGet) | **Get** /resources/lead_form_questions | Get lead form questions
[**MetricsReadyStateGet**](ResourcesAPI.md#MetricsReadyStateGet) | **Get** /resources/metrics_ready_state | Get metrics ready state
[**TargetingOptionsGet**](ResourcesAPI.md#TargetingOptionsGet) | **Get** /resources/targeting/{targeting_type} | Get targeting options



## AdAccountCountriesGet

> AdAccountCountriesGet200Response AdAccountCountriesGet(ctx).Execute()

Get ad accounts countries



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ResourcesAPI.AdAccountCountriesGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ResourcesAPI.AdAccountCountriesGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdAccountCountriesGet`: AdAccountCountriesGet200Response
	fmt.Fprintf(os.Stdout, "Response from `ResourcesAPI.AdAccountCountriesGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountCountriesGetRequest struct via the builder pattern


### Return type

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeliveryMetricsGet

> DeliveryMetricsGet200Response DeliveryMetricsGet(ctx).ReportType(reportType).Execute()

Get available metrics' definitions



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
	reportType := openapiclient.ReportType("SYNC") // ReportType | Report type. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ResourcesAPI.DeliveryMetricsGet(context.Background()).ReportType(reportType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ResourcesAPI.DeliveryMetricsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeliveryMetricsGet`: DeliveryMetricsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `ResourcesAPI.DeliveryMetricsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDeliveryMetricsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | [**ReportType**](ReportType.md) | Report type. | 

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## InterestTargetingOptionsGet

> SingleInterestTargetingOption InterestTargetingOptionsGet(ctx, interestId).Execute()

Get interest details



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
	interestId := "interestId_example" // string | Unique identifier of an interest.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ResourcesAPI.InterestTargetingOptionsGet(context.Background(), interestId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ResourcesAPI.InterestTargetingOptionsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `InterestTargetingOptionsGet`: SingleInterestTargetingOption
	fmt.Fprintf(os.Stdout, "Response from `ResourcesAPI.InterestTargetingOptionsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**interestId** | **string** | Unique identifier of an interest. | 

### Other Parameters

Other parameters are passed through a pointer to a apiInterestTargetingOptionsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormQuestionsGet

> LeadFormQuestionsGet(ctx).Execute()

Get lead form questions



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.ResourcesAPI.LeadFormQuestionsGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ResourcesAPI.LeadFormQuestionsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormQuestionsGetRequest struct via the builder pattern


### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MetricsReadyStateGet

> BookClosed MetricsReadyStateGet(ctx).Date(date).Execute()

Get metrics ready state



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
	date := "date_example" // string | Analytics reports request date (UTC). Format: YYYY-MM-DD

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ResourcesAPI.MetricsReadyStateGet(context.Background()).Date(date).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ResourcesAPI.MetricsReadyStateGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MetricsReadyStateGet`: BookClosed
	fmt.Fprintf(os.Stdout, "Response from `ResourcesAPI.MetricsReadyStateGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMetricsReadyStateGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **string** | Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**BookClosed**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TargetingOptionsGet

> []map[string]interface{} TargetingOptionsGet(ctx, targetingType).AdAccountId(adAccountId).ClientId(clientId).OauthSignature(oauthSignature).Timestamp(timestamp).Execute()

Get targeting options



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
	targetingType := openapiclient.PublicTargetingType("APPTYPE") // PublicTargetingType | Public targeting type
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	clientId := "clientId_example" // string | Client ID (optional)
	oauthSignature := "oauthSignature_example" // string | Oauth signature (optional)
	timestamp := "timestamp_example" // string | Timestamp. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ResourcesAPI.TargetingOptionsGet(context.Background(), targetingType).AdAccountId(adAccountId).ClientId(clientId).OauthSignature(oauthSignature).Timestamp(timestamp).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ResourcesAPI.TargetingOptionsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TargetingOptionsGet`: []map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ResourcesAPI.TargetingOptionsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**targetingType** | [**PublicTargetingType**](.md) | Public targeting type | 

### Other Parameters

Other parameters are passed through a pointer to a apiTargetingOptionsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **clientId** | **string** | Client ID | 
 **oauthSignature** | **string** | Oauth signature | 
 **timestamp** | **string** | Timestamp. | 

### Return type

**[]map[string]interface{}**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

