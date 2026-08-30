# \CampaignsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdPinsAnalytics**](CampaignsAPI.md#AdPinsAnalytics) | **Get** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**CampaignTargetingAnalyticsGet**](CampaignsAPI.md#CampaignTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**CampaignsAnalytics**](CampaignsAPI.md#CampaignsAnalytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsCreate**](CampaignsAPI.md#CampaignsCreate) | **Post** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**CampaignsGet**](CampaignsAPI.md#CampaignsGet) | **Get** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**CampaignsList**](CampaignsAPI.md#CampaignsList) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**CampaignsUpdate**](CampaignsAPI.md#CampaignsUpdate) | **Patch** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**GetCampaignDeliveryEstimates**](CampaignsAPI.md#GetCampaignDeliveryEstimates) | **Post** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates



## AdPinsAnalytics

> []AdPinAnalytics AdPinsAnalytics(ctx, adAccountId).CampaignId(campaignId).PinIds(pinIds).StartDate(startDate).EndDate(endDate).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

Get pins analytics



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
	campaignId := "campaignId_example" // string | Campaign Id to use to filter the results.
	pinIds := []string{"Inner_example"} // []string | List of Pin IDs.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	clickWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
	viewWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "conversionReportTime_example" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.AdPinsAnalytics(context.Background(), adAccountId).CampaignId(campaignId).PinIds(pinIds).StartDate(startDate).EndDate(endDate).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.AdPinsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdPinsAnalytics`: []AdPinAnalytics
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.AdPinsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdPinsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **string** | Campaign Id to use to filter the results. | 
 **pinIds** | **[]string** | List of Pin IDs. | 
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 

 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]AdPinAnalytics**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignTargetingAnalyticsGet

> MetricsResponse CampaignTargetingAnalyticsGet(ctx, adAccountId).CampaignIds(campaignIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).ReportingTimezone(reportingTimezone).Execute()

Get targeting analytics for campaigns



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
	campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	targetingTypes := []openapiclient.AdsAnalyticsCampaignTargetingType{openapiclient.AdsAnalyticsCampaignTargetingType("KEYWORD")} // []AdsAnalyticsCampaignTargetingType | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	clickWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
	viewWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "conversionReportTime_example" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
	attributionTypes := []openapiclient.ConversionReportAttributionType{openapiclient.ConversionReportAttributionType("INDIVIDUAL")} // []ConversionReportAttributionType | List of types of attribution for the conversion report (optional)
	reportingTimezone := openapiclient.ReportingTimeZone("PINTEREST_TIME_ZONE") // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.CampaignTargetingAnalyticsGet(context.Background(), adAccountId).CampaignIds(campaignIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).ReportingTimezone(reportingTimezone).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.CampaignTargetingAnalyticsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignTargetingAnalyticsGet`: MetricsResponse
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.CampaignTargetingAnalyticsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignTargetingAnalyticsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**[]AdsAnalyticsCampaignTargetingType**](AdsAnalyticsCampaignTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **attributionTypes** | [**[]ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | 
 **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

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


## CampaignsAnalytics

> []CampaignsAnalyticsMetrics CampaignsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).CampaignIds(campaignIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AggregateReportRows(aggregateReportRows).ReportingTimezone(reportingTimezone).Execute()

Get campaign analytics



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
	campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results.
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
	resp, r, err := apiClient.CampaignsAPI.CampaignsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).CampaignIds(campaignIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AggregateReportRows(aggregateReportRows).ReportingTimezone(reportingTimezone).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.CampaignsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignsAnalytics`: []CampaignsAnalyticsMetrics
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.CampaignsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 

 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **aggregateReportRows** | **bool** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [default to false]
 **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

### Return type

[**[]CampaignsAnalyticsMetrics**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsCreate

> CampaignBatchWriteResponseModel CampaignsCreate(ctx, adAccountId).CampaignCreateItem(campaignCreateItem).Execute()

Create campaigns



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
	campaignCreateItem := []openapiclient.CampaignCreateItem{*openapiclient.NewCampaignCreateItem("ACME Tools", openapiclient.ConversionObjectiveType("AWARENESS"))} // []CampaignCreateItem | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.CampaignsCreate(context.Background(), adAccountId).CampaignCreateItem(campaignCreateItem).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.CampaignsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignsCreate`: CampaignBatchWriteResponseModel
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.CampaignsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignCreateItem** | [**[]CampaignCreateItem**](CampaignCreateItem.md) |  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsGet

> Campaign CampaignsGet(ctx, campaignId, adAccountId).Execute()

Get campaign



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
	campaignId := "campaignId_example" // string | Campaign ID, must be associated with the ad account ID provided in the path.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.CampaignsGet(context.Background(), campaignId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.CampaignsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignsGet`: Campaign
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.CampaignsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **string** | Campaign ID, must be associated with the ad account ID provided in the path. | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsList

> CampaignsList200Response CampaignsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).CampaignIds(campaignIds).EntityStatuses(entityStatuses).Execute()

List campaigns



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
	entityStatuses := []openapiclient.EntityStatus{openapiclient.EntityStatus("ACTIVE")} // []EntityStatus | Entity status (optional) (default to {"ACTIVE", "PAUSED"})

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.CampaignsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).CampaignIds(campaignIds).EntityStatuses(entityStatuses).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.CampaignsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignsList`: CampaignsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.CampaignsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **entityStatuses** | [**[]EntityStatus**](EntityStatus.md) | Entity status | [default to {&quot;ACTIVE&quot;, &quot;PAUSED&quot;}]

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsUpdate

> CampaignBatchWriteResponseModel CampaignsUpdate(ctx, adAccountId).CampaignBatchUpdateItem(campaignBatchUpdateItem).Execute()

Update campaigns



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
	campaignBatchUpdateItem := []openapiclient.CampaignBatchUpdateItem{*openapiclient.NewCampaignBatchUpdateItem("549755885175")} // []CampaignBatchUpdateItem | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.CampaignsUpdate(context.Background(), adAccountId).CampaignBatchUpdateItem(campaignBatchUpdateItem).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.CampaignsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CampaignsUpdate`: CampaignBatchWriteResponseModel
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.CampaignsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCampaignsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignBatchUpdateItem** | [**[]CampaignBatchUpdateItem**](CampaignBatchUpdateItem.md) |  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaignDeliveryEstimates

> CampaignDeliveryEstimatesResponse GetCampaignDeliveryEstimates(ctx, adAccountId).CampaignDeliveryEstimatesCampaign(campaignDeliveryEstimatesCampaign).Execute()

Get campaign delivery estimates



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
	campaignDeliveryEstimatesCampaign := []openapiclient.CampaignDeliveryEstimatesCampaign{*openapiclient.NewCampaignDeliveryEstimatesCampaign([]openapiclient.AdGroupDeliveryEstimates{*openapiclient.NewAdGroupDeliveryEstimates()}, openapiclient.BudgetDurationType("FIXED_DAILY"), openapiclient.DeliveryEstimateObjectiveType("AWARENESS"), "StartDate_example")} // []CampaignDeliveryEstimatesCampaign | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CampaignsAPI.GetCampaignDeliveryEstimates(context.Background(), adAccountId).CampaignDeliveryEstimatesCampaign(campaignDeliveryEstimatesCampaign).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CampaignsAPI.GetCampaignDeliveryEstimates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignDeliveryEstimates`: CampaignDeliveryEstimatesResponse
	fmt.Fprintf(os.Stdout, "Response from `CampaignsAPI.GetCampaignDeliveryEstimates`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignDeliveryEstimatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignDeliveryEstimatesCampaign** | [**[]CampaignDeliveryEstimatesCampaign**](CampaignDeliveryEstimatesCampaign.md) |  | 

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

