# \UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAccountAnalytics**](UserAccountApi.md#UserAccountAnalytics) | **Get** /user_account/analytics | Get user account analytics
[**UserAccountGet**](UserAccountApi.md#UserAccountGet) | **Get** /user_account | Get user account



## UserAccountAnalytics

> map[string]AnalyticsMetricsResponse UserAccountAnalytics(ctx).StartDate(startDate).EndDate(endDate).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).MetricTypes(metricTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()

Get user account analytics



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
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    fromClaimedContent := "fromClaimedContent_example" // string | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
    pinFormat := "pinFormat_example" // string | Pin formats to get data for, default is all. (optional) (default to "ALL")
    appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
    metricTypes := []string{"MetricTypes_example"} // []string | Metric types to get data for, default is all.  (optional)
    splitField := "splitField_example" // string | How to split the data into groups. Not including this param means data won't be split. (optional) (default to "NO_SPLIT")
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UserAccountApi.UserAccountAnalytics(context.Background()).StartDate(startDate).EndDate(endDate).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).MetricTypes(metricTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UserAccountApi.UserAccountAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UserAccountAnalytics`: map[string]AnalyticsMetricsResponse
    fmt.Fprintf(os.Stdout, "Response from `UserAccountApi.UserAccountAnalytics`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **pinFormat** | **string** | Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **metricTypes** | **[]string** | Metric types to get data for, default is all.  | 
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


## UserAccountGet

> Account UserAccountGet(ctx).AdAccountId(adAccountId).Execute()

Get user account



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UserAccountApi.UserAccountGet(context.Background()).AdAccountId(adAccountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UserAccountApi.UserAccountGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UserAccountGet`: Account
    fmt.Fprintf(os.Stdout, "Response from `UserAccountApi.UserAccountGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

