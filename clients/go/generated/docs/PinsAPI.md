# \PinsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MultiPinsAnalytics**](PinsAPI.md#MultiPinsAnalytics) | **Get** /pins/analytics | Get multiple Pin analytics
[**PinsAnalytics**](PinsAPI.md#PinsAnalytics) | **Get** /pins/{pin_id}/analytics | Get Pin analytics
[**PinsCreate**](PinsAPI.md#PinsCreate) | **Post** /pins | Create Pin
[**PinsDelete**](PinsAPI.md#PinsDelete) | **Delete** /pins/{pin_id} | Delete Pin
[**PinsGet**](PinsAPI.md#PinsGet) | **Get** /pins/{pin_id} | Get Pin
[**PinsList**](PinsAPI.md#PinsList) | **Get** /pins | List Pins
[**PinsSave**](PinsAPI.md#PinsSave) | **Post** /pins/{pin_id}/save | Save Pin
[**PinsUpdate**](PinsAPI.md#PinsUpdate) | **Patch** /pins/{pin_id} | Update Pin



## MultiPinsAnalytics

> map[string]map[string]PinAnalyticsMetricsResponse MultiPinsAnalytics(ctx).PinIds(pinIds).StartDate(startDate).EndDate(endDate).MetricTypes(metricTypes).AppTypes(appTypes).AdAccountId(adAccountId).Execute()

Get multiple Pin analytics



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	pinIds := []string{"Inner_example"} // []string | List of Pin IDs.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	metricTypes := []openapiclient.PinsAnalyticsMetricTypesParameterInner{openapiclient.pins_analytics_metric_types_parameter_inner{String: new(string)}} // []PinsAnalyticsMetricTypesParameterInner | Pin metric types to get data for.
	appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.MultiPinsAnalytics(context.Background()).PinIds(pinIds).StartDate(startDate).EndDate(endDate).MetricTypes(metricTypes).AppTypes(appTypes).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.MultiPinsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MultiPinsAnalytics`: map[string]map[string]PinAnalyticsMetricsResponse
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.MultiPinsAnalytics`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMultiPinsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinIds** | **[]string** | List of Pin IDs. | 
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metricTypes** | [**[]PinsAnalyticsMetricTypesParameterInner**](PinsAnalyticsMetricTypesParameterInner.md) | Pin metric types to get data for. | 
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**map[string]map[string]PinAnalyticsMetricsResponse**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsAnalytics

> map[string]PinAnalyticsMetricsResponse PinsAnalytics(ctx, pinId).StartDate(startDate).EndDate(endDate).MetricTypes(metricTypes).AppTypes(appTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()

Get Pin analytics



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	pinId := "pinId_example" // string | Unique identifier of a Pin.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	metricTypes := []openapiclient.PinsAnalyticsMetricTypesParameterInner{openapiclient.pins_analytics_metric_types_parameter_inner{String: new(string)}} // []PinsAnalyticsMetricTypesParameterInner | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
	appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
	splitField := "splitField_example" // string | How to split the data into groups. Not including this param means data won't be split. (optional) (default to "NO_SPLIT")
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.PinsAnalytics(context.Background(), pinId).StartDate(startDate).EndDate(endDate).MetricTypes(metricTypes).AppTypes(appTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PinsAnalytics`: map[string]PinAnalyticsMetricsResponse
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.PinsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of a Pin. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPinsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metricTypes** | [**[]PinsAnalyticsMetricTypesParameterInner**](PinsAnalyticsMetricTypesParameterInner.md) | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | 
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **splitField** | **string** | How to split the data into groups. Not including this param means data won&#39;t be split. | [default to &quot;NO_SPLIT&quot;]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**map[string]PinAnalyticsMetricsResponse**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsCreate

> Pin PinsCreate(ctx).PinCreate(pinCreate).AdAccountId(adAccountId).Execute()

Create Pin



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
	pinCreate := *openapiclient.NewPinCreate() // PinCreate | Create a new Pin.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.PinsCreate(context.Background()).PinCreate(pinCreate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PinsCreate`: Pin
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.PinsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPinsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | [**PinCreate**](PinCreate.md) | Create a new Pin. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsDelete

> PinsDelete(ctx, pinId).AdAccountId(adAccountId).Execute()

Delete Pin



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
	pinId := "pinId_example" // string | Unique identifier of a Pin.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.PinsAPI.PinsDelete(context.Background(), pinId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of a Pin. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPinsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

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


## PinsGet

> Pin PinsGet(ctx, pinId).PinMetrics(pinMetrics).AdAccountId(adAccountId).Execute()

Get Pin



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
	pinId := "pinId_example" // string | Unique identifier of a Pin.
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.PinsGet(context.Background(), pinId).PinMetrics(pinMetrics).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PinsGet`: Pin
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.PinsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of a Pin. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPinsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsList

> PinsList200Response PinsList(ctx).Bookmark(bookmark).PageSize(pageSize).PinFilter(pinFilter).IncludeProtectedPins(includeProtectedPins).PinType(pinType).CreativeTypes(creativeTypes).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()

List Pins



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	pinFilter := "pinFilter_example" // string | Pin filter. (optional)
	includeProtectedPins := true // bool | Specify if return pins from protected boards (optional) (default to false)
	pinType := "pinType_example" // string | The type of pins to return, currently only enabled for private pins (optional)
	creativeTypes := []string{"REGULAR"} // []string | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.PinsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).PinFilter(pinFilter).IncludeProtectedPins(includeProtectedPins).PinType(pinType).CreativeTypes(creativeTypes).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PinsList`: PinsList200Response
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.PinsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPinsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **pinFilter** | **string** | Pin filter. | 
 **includeProtectedPins** | **bool** | Specify if return pins from protected boards | [default to false]
 **pinType** | **string** | The type of pins to return, currently only enabled for private pins | 
 **creativeTypes** | **[]string** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsSave

> Pin PinsSave(ctx, pinId).PinsSaveRequest(pinsSaveRequest).AdAccountId(adAccountId).Execute()

Save Pin



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
	pinId := "pinId_example" // string | Unique identifier of a Pin.
	pinsSaveRequest := *openapiclient.NewPinsSaveRequest() // PinsSaveRequest | Request object used to save an existing pin
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.PinsSave(context.Background(), pinId).PinsSaveRequest(pinsSaveRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsSave``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PinsSave`: Pin
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.PinsSave`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of a Pin. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPinsSaveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md) | Request object used to save an existing pin | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsUpdate

> Pin PinsUpdate(ctx, pinId).PinUpdate(pinUpdate).AdAccountId(adAccountId).Execute()

Update Pin



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
	pinId := "pinId_example" // string | Unique identifier of a Pin.
	pinUpdate := *openapiclient.NewPinUpdate() // PinUpdate | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PinsAPI.PinsUpdate(context.Background(), pinId).PinUpdate(pinUpdate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PinsAPI.PinsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PinsUpdate`: Pin
	fmt.Fprintf(os.Stdout, "Response from `PinsAPI.PinsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string** | Unique identifier of a Pin. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPinsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pinUpdate** | [**PinUpdate**](PinUpdate.md) |  | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

