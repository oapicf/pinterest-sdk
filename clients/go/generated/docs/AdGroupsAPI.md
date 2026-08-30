# \AdGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdGroupsAnalytics**](AdGroupsAPI.md#AdGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsAudienceSizing**](AdGroupsAPI.md#AdGroupsAudienceSizing) | **Post** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**AdGroupsBidFloorGet**](AdGroupsAPI.md#AdGroupsBidFloorGet) | **Post** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**AdGroupsCreate**](AdGroupsAPI.md#AdGroupsCreate) | **Post** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**AdGroupsDynamicTitlesDownloadCsv**](AdGroupsAPI.md#AdGroupsDynamicTitlesDownloadCsv) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**AdGroupsDynamicTitlesGetStatus**](AdGroupsAPI.md#AdGroupsDynamicTitlesGetStatus) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**AdGroupsDynamicTitlesGetUploadUrl**](AdGroupsAPI.md#AdGroupsDynamicTitlesGetUploadUrl) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**AdGroupsDynamicTitlesProcessCsv**](AdGroupsAPI.md#AdGroupsDynamicTitlesProcessCsv) | **Post** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**AdGroupsGet**](AdGroupsAPI.md#AdGroupsGet) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**AdGroupsList**](AdGroupsAPI.md#AdGroupsList) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdGroupsTargetingAnalyticsGet**](AdGroupsAPI.md#AdGroupsTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**AdGroupsUpdate**](AdGroupsAPI.md#AdGroupsUpdate) | **Patch** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**GetAdGroupsByPromotionIdsList**](AdGroupsAPI.md#GetAdGroupsByPromotionIdsList) | **Get** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.



## AdGroupsAnalytics

> []AdGroupsAnalyticsMetrics AdGroupsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).AdGroupIds(adGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AggregateReportRows(aggregateReportRows).ReportingTimezone(reportingTimezone).Execute()

Get ad group analytics



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
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results.
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	clickWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
	viewWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "conversionReportTime_example" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
	aggregateReportRows := true // bool | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to false)
	reportingTimezone := openapiclient.ReportingTimeZone("PINTEREST_TIME_ZONE") // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).AdGroupIds(adGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AggregateReportRows(aggregateReportRows).ReportingTimezone(reportingTimezone).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsAnalytics`: []AdGroupsAnalyticsMetrics
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 

 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **aggregateReportRows** | **bool** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [default to false]
 **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

### Return type

[**[]AdGroupsAnalyticsMetrics**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsAudienceSizing

> AdGroupAudienceSizing AdGroupsAudienceSizing(ctx, adAccountId).AdGroupAudienceSizingCreate(adGroupAudienceSizingCreate).Execute()

Get audience sizing



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
	adGroupAudienceSizingCreate := *openapiclient.NewAdGroupAudienceSizingCreate() // AdGroupAudienceSizingCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsAudienceSizing(context.Background(), adAccountId).AdGroupAudienceSizingCreate(adGroupAudienceSizingCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsAudienceSizing``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsAudienceSizing`: AdGroupAudienceSizing
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsAudienceSizing`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsAudienceSizingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adGroupAudienceSizingCreate** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md) |  | 

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsBidFloorGet

> BidFloor AdGroupsBidFloorGet(ctx, adAccountId).BidFloorCreate(bidFloorCreate).Execute()

Get bid floors



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
	bidFloorCreate := *openapiclient.NewBidFloorCreate([]openapiclient.BidFloorSpec{*openapiclient.NewBidFloorSpec(openapiclient.ActionType("CLICKTHROUGH"), openapiclient.Currency("UNK"))}) // BidFloorCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsBidFloorGet(context.Background(), adAccountId).BidFloorCreate(bidFloorCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsBidFloorGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsBidFloorGet`: BidFloor
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsBidFloorGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsBidFloorGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bidFloorCreate** | [**BidFloorCreate**](BidFloorCreate.md) |  | 

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsCreate

> AdGroupsCreate200Response AdGroupsCreate(ctx, adAccountId).AdGroupCreateCreate(adGroupCreateCreate).Execute()

Create ad groups



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
	adGroupCreateCreate := []openapiclient.AdGroupCreateCreate{*openapiclient.NewAdGroupCreateCreate(openapiclient.ActionType("CLICKTHROUGH"), "CampaignId_example", "Name_example")} // []AdGroupCreateCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsCreate(context.Background(), adAccountId).AdGroupCreateCreate(adGroupCreateCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsCreate`: AdGroupsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adGroupCreateCreate** | [**[]AdGroupCreateCreate**](AdGroupCreateCreate.md) |  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsDynamicTitlesDownloadCsv

> DynamicTitlesDownloadCSV AdGroupsDynamicTitlesDownloadCsv(ctx, adAccountId, adGroupId).Execute()

Get dynamic titles CSV download URL



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
	adGroupId := "adGroupId_example" // string | Ad group ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsDynamicTitlesDownloadCsv(context.Background(), adAccountId, adGroupId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsDynamicTitlesDownloadCsv``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsDynamicTitlesDownloadCsv`: DynamicTitlesDownloadCSV
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsDynamicTitlesDownloadCsv`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**adGroupId** | **string** | Ad group ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsDynamicTitlesDownloadCsvRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsDynamicTitlesGetStatus

> DynamicTitlesGetStatus AdGroupsDynamicTitlesGetStatus(ctx, adAccountId, adGroupId).Execute()

Get dynamic titles status



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
	adGroupId := "adGroupId_example" // string | Ad group ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsDynamicTitlesGetStatus(context.Background(), adAccountId, adGroupId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsDynamicTitlesGetStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsDynamicTitlesGetStatus`: DynamicTitlesGetStatus
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsDynamicTitlesGetStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**adGroupId** | **string** | Ad group ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsDynamicTitlesGetStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsDynamicTitlesGetUploadUrl

> DynamicTitlesUploadURL AdGroupsDynamicTitlesGetUploadUrl(ctx, adAccountId, adGroupId).Execute()

Get dynamic titles upload URL



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
	adGroupId := "adGroupId_example" // string | Ad group ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsDynamicTitlesGetUploadUrl(context.Background(), adAccountId, adGroupId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsDynamicTitlesGetUploadUrl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsDynamicTitlesGetUploadUrl`: DynamicTitlesUploadURL
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsDynamicTitlesGetUploadUrl`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**adGroupId** | **string** | Ad group ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsDynamicTitlesGetUploadUrlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsDynamicTitlesProcessCsv

> DynamicTitlesProcessCSV AdGroupsDynamicTitlesProcessCsv(ctx, adAccountId, adGroupId).DynamicTitlesProcessCSVCreate(dynamicTitlesProcessCSVCreate).Execute()

Process dynamic titles CSV



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
	adGroupId := "adGroupId_example" // string | Ad group ID.
	dynamicTitlesProcessCSVCreate := *openapiclient.NewDynamicTitlesProcessCSVCreate("RequestId_example") // DynamicTitlesProcessCSVCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsDynamicTitlesProcessCsv(context.Background(), adAccountId, adGroupId).DynamicTitlesProcessCSVCreate(dynamicTitlesProcessCSVCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsDynamicTitlesProcessCsv``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsDynamicTitlesProcessCsv`: DynamicTitlesProcessCSV
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsDynamicTitlesProcessCsv`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**adGroupId** | **string** | Ad group ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsDynamicTitlesProcessCsvRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **dynamicTitlesProcessCSVCreate** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md) |  | 

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsGet

> AdGroup AdGroupsGet(ctx, adGroupId, adAccountId).Execute()

Get ad group



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
	adGroupId := "adGroupId_example" // string | Ad group ID.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsGet(context.Background(), adGroupId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsGet`: AdGroup
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adGroupId** | **string** | Ad group ID. | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**AdGroup**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsList

> AdGroupsList200Response AdGroupsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).CampaignIds(campaignIds).AdGroupIds(adGroupIds).EntityStatuses(entityStatuses).TranslateInterestsToNames(translateInterestsToNames).Execute()

List ad groups



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
	entityStatuses := []openapiclient.EntityStatus{openapiclient.EntityStatus("ACTIVE")} // []EntityStatus | Entity status (optional) (default to {"ACTIVE", "PAUSED"})
	translateInterestsToNames := true // bool | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).CampaignIds(campaignIds).AdGroupIds(adGroupIds).EntityStatuses(entityStatuses).TranslateInterestsToNames(translateInterestsToNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsList`: AdGroupsList200Response
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **adGroupIds** | **[]string** | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | 
 **entityStatuses** | [**[]EntityStatus**](EntityStatus.md) | Entity status | [default to {&quot;ACTIVE&quot;, &quot;PAUSED&quot;}]
 **translateInterestsToNames** | **bool** | Return interests as text names (if value is true) rather than topic IDs. | [default to false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsTargetingAnalyticsGet

> MetricsResponse AdGroupsTargetingAnalyticsGet(ctx, adAccountId).AdGroupIds(adGroupIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).ReportingTimezone(reportingTimezone).SortColumns(sortColumns).SortAscending(sortAscending).Execute()

Get targeting analytics for ad groups



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	targetingTypes := []openapiclient.AdsAnalyticsAdGroupTargetingType{openapiclient.AdsAnalyticsAdGroupTargetingType("KEYWORD")} // []AdsAnalyticsAdGroupTargetingType | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	clickWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
	viewWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "conversionReportTime_example" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
	attributionTypes := []openapiclient.ConversionReportAttributionType{openapiclient.ConversionReportAttributionType("INDIVIDUAL")} // []ConversionReportAttributionType | List of types of attribution for the conversion report (optional)
	reportingTimezone := openapiclient.ReportingTimeZone("PINTEREST_TIME_ZONE") // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
	sortColumns := []string{"Inner_example"} // []string | Sort Columns. (optional)
	sortAscending := true // bool | Sort ascending. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsTargetingAnalyticsGet(context.Background(), adAccountId).AdGroupIds(adGroupIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).ReportingTimezone(reportingTimezone).SortColumns(sortColumns).SortAscending(sortAscending).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsTargetingAnalyticsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsTargetingAnalyticsGet`: MetricsResponse
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsTargetingAnalyticsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsTargetingAnalyticsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**[]AdsAnalyticsAdGroupTargetingType**](AdsAnalyticsAdGroupTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **attributionTypes** | [**[]ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | 
 **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 
 **sortColumns** | **[]string** | Sort Columns. | 
 **sortAscending** | **bool** | Sort ascending. | 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsUpdate

> AdGroupsCreate200Response AdGroupsUpdate(ctx, adAccountId).AdGroupUpdateBatchUpdate(adGroupUpdateBatchUpdate).Execute()

Update ad groups



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
	adGroupUpdateBatchUpdate := []openapiclient.AdGroupUpdateBatchUpdate{*openapiclient.NewAdGroupUpdateBatchUpdate("Id_example")} // []AdGroupUpdateBatchUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsUpdate(context.Background(), adAccountId).AdGroupUpdateBatchUpdate(adGroupUpdateBatchUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsUpdate`: AdGroupsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adGroupUpdateBatchUpdate** | [**[]AdGroupUpdateBatchUpdate**](AdGroupUpdateBatchUpdate.md) |  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAdGroupsByPromotionIdsList

> AdGroupsList200Response GetAdGroupsByPromotionIdsList(ctx, adAccountId).PromotionIds(promotionIds).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()

List of ad groups using promotions IDs.



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
	promotionIds := []string{"Inner_example"} // []string | List of Promotion IDs to use to filter the results.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.GetAdGroupsByPromotionIdsList(context.Background(), adAccountId).PromotionIds(promotionIds).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.GetAdGroupsByPromotionIdsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAdGroupsByPromotionIdsList`: AdGroupsList200Response
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.GetAdGroupsByPromotionIdsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAdGroupsByPromotionIdsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **promotionIds** | **[]string** | List of Promotion IDs to use to filter the results. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

