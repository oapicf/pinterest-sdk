# \PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PinsAnalytics**](PinsApi.md#PinsAnalytics) | **Get** /pins/{pin_id}/analytics | Get Pin analytics
[**PinsCreate**](PinsApi.md#PinsCreate) | **Post** /pins | Create Pin
[**PinsDelete**](PinsApi.md#PinsDelete) | **Delete** /pins/{pin_id} | Delete Pin
[**PinsGet**](PinsApi.md#PinsGet) | **Get** /pins/{pin_id} | Get Pin



## PinsAnalytics

> map[string]AnalyticsMetricsResponse PinsAnalytics(ctx, pinId).StartDate(startDate).EndDate(endDate).MetricTypes(metricTypes).AppTypes(appTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()

Get Pin analytics



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    pinId := "pinId_example" // string | Unique identifier of a Pin.
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    metricTypes := []string{"MetricTypes_example"} // []string | Pin metric types to get data for, default is all.
    appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
    splitField := "splitField_example" // string | How to split the data into groups. Not including this param means data won't be split. (optional) (default to "NO_SPLIT")
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsAnalytics(context.Background(), pinId).StartDate(startDate).EndDate(endDate).MetricTypes(metricTypes).AppTypes(appTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PinsAnalytics`: map[string]AnalyticsMetricsResponse
    fmt.Fprintf(os.Stdout, "Response from `PinsApi.PinsAnalytics`: %v\n", resp)
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

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metricTypes** | **[]string** | Pin metric types to get data for, default is all. | 
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **splitField** | **string** | How to split the data into groups. Not including this param means data won&#39;t be split. | [default to &quot;NO_SPLIT&quot;]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**map[string]AnalyticsMetricsResponse**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsCreate

> Pin PinsCreate(ctx).Pin(pin).Execute()

Create Pin



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    pin := *openapiclient.NewPin() // Pin | Create a new Pin.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsCreate(context.Background()).Pin(pin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PinsCreate`: Pin
    fmt.Fprintf(os.Stdout, "Response from `PinsApi.PinsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPinsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Pin**](Pin.md) | Create a new Pin. | 

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

> PinsDelete(ctx, pinId).Execute()

Delete Pin



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    pinId := "pinId_example" // string | Unique identifier of a Pin.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsDelete(context.Background(), pinId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsDelete``: %v\n", err)
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

> Pin PinsGet(ctx, pinId).AdAccountId(adAccountId).Execute()

Get Pin



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    pinId := "pinId_example" // string | Unique identifier of a Pin.
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsGet(context.Background(), pinId).AdAccountId(adAccountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PinsGet`: Pin
    fmt.Fprintf(os.Stdout, "Response from `PinsApi.PinsGet`: %v\n", resp)
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

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

