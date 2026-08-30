# \AdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdPreviewsCreate**](AdsAPI.md#AdPreviewsCreate) | **Post** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**AdTargetingAnalyticsGet**](AdsAPI.md#AdTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**AdsAnalytics**](AdsAPI.md#AdsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsCreate**](AdsAPI.md#AdsCreate) | **Post** /ad_accounts/{ad_account_id}/ads | Create ads
[**AdsGet**](AdsAPI.md#AdsGet) | **Get** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**AdsList**](AdsAPI.md#AdsList) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
[**AdsUpdate**](AdsAPI.md#AdsUpdate) | **Patch** /ad_accounts/{ad_account_id}/ads | Update ads
[**CampaignAdPreviewCreate**](AdsAPI.md#CampaignAdPreviewCreate) | **Post** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**CampaignAdPreviewDelete**](AdsAPI.md#CampaignAdPreviewDelete) | **Delete** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**CampaignAdPreviewRead**](AdsAPI.md#CampaignAdPreviewRead) | **Get** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups



## AdPreviewsCreate

> AdPreviewURLResponse AdPreviewsCreate(ctx, adAccountId).AdPreviewRequest(adPreviewRequest).Execute()

Create ad preview with pin or image



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
	adPreviewRequest := openapiclient.AdPreviewRequest{AdPreviewShopping: openapiclient.NewAdPreviewShopping("123456789", openapiclient.AdShoppingPreviewCreativeType("SHOPPING"))} // AdPreviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdPreviewsCreate(context.Background(), adAccountId).AdPreviewRequest(adPreviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdPreviewsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdPreviewsCreate`: AdPreviewURLResponse
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdPreviewsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdPreviewsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md) |  | 

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdTargetingAnalyticsGet

> MetricsResponse AdTargetingAnalyticsGet(ctx, adAccountId).AdIds(adIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).ReportingTimezone(reportingTimezone).SortColumns(sortColumns).SortAscending(sortAscending).Execute()

Get targeting analytics for ads



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
	adIds := []string{"Inner_example"} // []string | List of Ad Ids to use to filter the results.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	targetingTypes := []openapiclient.AdsAnalyticsAdTargetingType{openapiclient.AdsAnalyticsAdTargetingType("KEYWORD")} // []AdsAnalyticsAdTargetingType | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	clickWindowDays := openapiclient.ConversionAttributionWindowDays(0) // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
	engagementWindowDays := openapiclient.ConversionAttributionWindowDays(0) // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
	viewWindowDays := openapiclient.ConversionAttributionWindowDays(0) // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
	conversionReportTime := openapiclient.ConversionReportTimeType("TIME_OF_AD_ACTION") // ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
	attributionTypes := []openapiclient.ConversionReportAttributionType{openapiclient.ConversionReportAttributionType("INDIVIDUAL")} // []ConversionReportAttributionType | List of types of attribution for the conversion report (optional)
	reportingTimezone := openapiclient.ReportingTimeZone("PINTEREST_TIME_ZONE") // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
	sortColumns := []string{"Inner_example"} // []string | Sort Columns. (optional)
	sortAscending := true // bool | Sort ascending. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdTargetingAnalyticsGet(context.Background(), adAccountId).AdIds(adIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).ReportingTimezone(reportingTimezone).SortColumns(sortColumns).SortAscending(sortAscending).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdTargetingAnalyticsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdTargetingAnalyticsGet`: MetricsResponse
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdTargetingAnalyticsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdTargetingAnalyticsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adIds** | **[]string** | List of Ad Ids to use to filter the results. | 
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**[]AdsAnalyticsAdTargetingType**](AdsAnalyticsAdTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | 
 **engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | 
 **viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | 
 **conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | 
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


## AdsAnalytics

> []AdsAnalytics AdsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).Columns(columns).Granularity(granularity).PinIds(pinIds).AdIds(adIds).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).CampaignIds(campaignIds).ReportingTimezone(reportingTimezone).Execute()

Get ad analytics



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
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	pinIds := []string{"Inner_example"} // []string | List of Pin IDs. (optional)
	adIds := []string{"Inner_example"} // []string | List of Ad Ids to use to filter the results. (optional)
	clickWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
	viewWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "conversionReportTime_example" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
	campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
	reportingTimezone := openapiclient.ReportingTimeZone("PINTEREST_TIME_ZONE") // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).Columns(columns).Granularity(granularity).PinIds(pinIds).AdIds(adIds).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).CampaignIds(campaignIds).ReportingTimezone(reportingTimezone).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsAnalytics`: []AdsAnalytics
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 

 **pinIds** | **[]string** | List of Pin IDs. | 
 **adIds** | **[]string** | List of Ad Ids to use to filter the results. | 
 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

### Return type

[**[]AdsAnalytics**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsCreate

> AdBatchWriteResponseModel AdsCreate(ctx, adAccountId).AdCreate(adCreate).Execute()

Create ads



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
	adCreate := []openapiclient.AdCreate{*openapiclient.NewAdCreate("AdGroupId_example", openapiclient.CreativeType("REGULAR"), "PinId_example")} // []AdCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdsCreate(context.Background(), adAccountId).AdCreate(adCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsCreate`: AdBatchWriteResponseModel
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adCreate** | [**[]AdCreate**](AdCreate.md) |  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsGet

> Ad AdsGet(ctx, adId, adAccountId).Execute()

Get ad



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
	adId := "adId_example" // string | The ID of this ad.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdsGet(context.Background(), adId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsGet`: Ad
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adId** | **string** | The ID of this ad. | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsList

> AdsList200Response AdsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).CampaignIds(campaignIds).AdGroupIds(adGroupIds).AdIds(adIds).EntityStatuses(entityStatuses).Execute()

List ads



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
	adIds := []string{"Inner_example"} // []string | List of Ad Ids to use to filter the results. (optional)
	entityStatuses := []openapiclient.EntityStatus{openapiclient.EntityStatus("ACTIVE")} // []EntityStatus | Entity status (optional) (default to {"ACTIVE", "PAUSED"})

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).CampaignIds(campaignIds).AdGroupIds(adGroupIds).AdIds(adIds).EntityStatuses(entityStatuses).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsList`: AdsList200Response
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **adGroupIds** | **[]string** | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | 
 **adIds** | **[]string** | List of Ad Ids to use to filter the results. | 
 **entityStatuses** | [**[]EntityStatus**](EntityStatus.md) | Entity status | [default to {&quot;ACTIVE&quot;, &quot;PAUSED&quot;}]

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsUpdate

> AdBatchWriteResponseModel AdsUpdate(ctx, adAccountId).AdBatchUpdate(adBatchUpdate).Execute()

Update ads



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
	adBatchUpdate := []openapiclient.AdBatchUpdate{*openapiclient.NewAdBatchUpdate("Id_example")} // []AdBatchUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.AdsUpdate(context.Background(), adAccountId).AdBatchUpdate(adBatchUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.AdsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdsUpdate`: AdBatchWriteResponseModel
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.AdsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adBatchUpdate** | [**[]AdBatchUpdate**](AdBatchUpdate.md) |  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignAdPreviewCreate

> []CampaignAdPreviewCreate200ResponseInner CampaignAdPreviewCreate(ctx, adAccountId).CampaignAdPreviewCreate(campaignAdPreviewCreate).Execute()

Create ad preview records for one or more ad groups



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
	campaignAdPreviewCreate := []openapiclient.CampaignAdPreviewCreate{*openapiclient.NewCampaignAdPreviewCreate("1234567890")} // []CampaignAdPreviewCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.CampaignAdPreviewCreate(context.Background(), adAccountId).CampaignAdPreviewCreate(campaignAdPreviewCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.CampaignAdPreviewCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignAdPreviewCreate`: []CampaignAdPreviewCreate200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.CampaignAdPreviewCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignAdPreviewCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignAdPreviewCreate** | [**[]CampaignAdPreviewCreate**](CampaignAdPreviewCreate.md) |  | 

### Return type

[**[]CampaignAdPreviewCreate200ResponseInner**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignAdPreviewDelete

> []CampaignAdPreviewDelete200ResponseInner CampaignAdPreviewDelete(ctx, adAccountId).AdGroupIds(adGroupIds).Execute()

Delete ad preview records for one or more ad groups



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
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.CampaignAdPreviewDelete(context.Background(), adAccountId).AdGroupIds(adGroupIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.CampaignAdPreviewDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignAdPreviewDelete`: []CampaignAdPreviewDelete200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.CampaignAdPreviewDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignAdPreviewDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 


### Return type

[**[]CampaignAdPreviewDelete200ResponseInner**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignAdPreviewRead

> []CampaignAdPreview CampaignAdPreviewRead(ctx, adAccountId).AdGroupIds(adGroupIds).Execute()

Fetch ad preview records for one or more ad groups



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
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdsAPI.CampaignAdPreviewRead(context.Background(), adAccountId).AdGroupIds(adGroupIds).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdsAPI.CampaignAdPreviewRead``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignAdPreviewRead`: []CampaignAdPreview
	fmt.Fprintf(os.Stdout, "Response from `AdsAPI.CampaignAdPreviewRead`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignAdPreviewReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 


### Return type

[**[]CampaignAdPreview**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

