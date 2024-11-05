# \AdGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdGroupsAnalytics**](AdGroupsAPI.md#AdGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsAudienceSizing**](AdGroupsAPI.md#AdGroupsAudienceSizing) | **Post** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**AdGroupsBidFloorGet**](AdGroupsAPI.md#AdGroupsBidFloorGet) | **Post** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**AdGroupsCreate**](AdGroupsAPI.md#AdGroupsCreate) | **Post** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**AdGroupsGet**](AdGroupsAPI.md#AdGroupsGet) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**AdGroupsList**](AdGroupsAPI.md#AdGroupsList) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdGroupsTargetingAnalyticsGet**](AdGroupsAPI.md#AdGroupsTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**AdGroupsUpdate**](AdGroupsAPI.md#AdGroupsUpdate) | **Patch** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups



## AdGroupsAnalytics

> []AdGroupsAnalyticsResponseInner AdGroupsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).AdGroupIds(adGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results.
	columns := []string{"TOTAL_CONVERSIONS"} // []string | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
	granularity := openapiclient.Granularity("TOTAL") // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
	clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).AdGroupIds(adGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsAnalytics`: []AdGroupsAnalyticsResponseInner
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
 **columns** | **[]string** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]AdGroupsAnalyticsResponseInner**](AdGroupsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsAudienceSizing

> AdGroupAudienceSizingResponse AdGroupsAudienceSizing(ctx, adAccountId).AdGroupAudienceSizingRequest(adGroupAudienceSizingRequest).Execute()

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
	adGroupAudienceSizingRequest := *openapiclient.NewAdGroupAudienceSizingRequest() // AdGroupAudienceSizingRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsAudienceSizing(context.Background(), adAccountId).AdGroupAudienceSizingRequest(adGroupAudienceSizingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsAudienceSizing``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsAudienceSizing`: AdGroupAudienceSizingResponse
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

 **adGroupAudienceSizingRequest** | [**AdGroupAudienceSizingRequest**](AdGroupAudienceSizingRequest.md) |  | 

### Return type

[**AdGroupAudienceSizingResponse**](AdGroupAudienceSizingResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsBidFloorGet

> BidFloor AdGroupsBidFloorGet(ctx, adAccountId).BidFloorRequest(bidFloorRequest).Execute()

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
	bidFloorRequest := *openapiclient.NewBidFloorRequest([]openapiclient.BidFloorSpec{*openapiclient.NewBidFloorSpec(openapiclient.Currency("UNK"), openapiclient.ActionType("CLICKTHROUGH"))}) // BidFloorRequest | Parameters to get bid_floor info

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsBidFloorGet(context.Background(), adAccountId).BidFloorRequest(bidFloorRequest).Execute()
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

 **bidFloorRequest** | [**BidFloorRequest**](BidFloorRequest.md) | Parameters to get bid_floor info | 

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsCreate

> AdGroupArrayResponse AdGroupsCreate(ctx, adAccountId).AdGroupCreateRequest(adGroupCreateRequest).Execute()

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
	adGroupCreateRequest := []openapiclient.AdGroupCreateRequest{*openapiclient.NewAdGroupCreateRequest("Ad Group For Pin: 687195905986", "626736533506", openapiclient.ActionType("CLICKTHROUGH"))} // []AdGroupCreateRequest | List of ad groups to create, size limit [1, 30].

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsCreate(context.Background(), adAccountId).AdGroupCreateRequest(adGroupCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsCreate`: AdGroupArrayResponse
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

 **adGroupCreateRequest** | [**[]AdGroupCreateRequest**](AdGroupCreateRequest.md) | List of ad groups to create, size limit [1, 30]. | 

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsGet

> AdGroupResponse AdGroupsGet(ctx, adAccountId, adGroupId).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	adGroupId := "adGroupId_example" // string | Unique identifier of an ad group.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsGet(context.Background(), adAccountId, adGroupId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsGet`: AdGroupResponse
	fmt.Fprintf(os.Stdout, "Response from `AdGroupsAPI.AdGroupsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**adGroupId** | **string** | Unique identifier of an ad group. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdGroupsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**AdGroupResponse**](AdGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsList

> AdGroupsList200Response AdGroupsList(ctx, adAccountId).CampaignIds(campaignIds).AdGroupIds(adGroupIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).TranslateInterestsToNames(translateInterestsToNames).Execute()

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
	campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results. (optional)
	entityStatuses := []string{"ACTIVE"} // []string | Entity status (optional) (default to ["ACTIVE","PAUSED"])
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	translateInterestsToNames := true // bool | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsList(context.Background(), adAccountId).CampaignIds(campaignIds).AdGroupIds(adGroupIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).TranslateInterestsToNames(translateInterestsToNames).Execute()
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

 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 
 **entityStatuses** | **[]string** | Entity status | [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **translateInterestsToNames** | **bool** | Return interests as text names (if value is true) rather than topic IDs. | [default to false]

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


## AdGroupsTargetingAnalyticsGet

> MetricsResponse AdGroupsTargetingAnalyticsGet(ctx, adAccountId).AdGroupIds(adGroupIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).Execute()

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
	targetingTypes := []openapiclient.AdsAnalyticsTargetingType{openapiclient.AdsAnalyticsTargetingType("KEYWORD")} // []AdsAnalyticsTargetingType | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	columns := []string{"TOTAL_CONVERSIONS"} // []string | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
	granularity := openapiclient.Granularity("TOTAL") // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
	clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
	attributionTypes := openapiclient.ConversionReportAttributionType("INDIVIDUAL") // ConversionReportAttributionType | List of types of attribution for the conversion report (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsTargetingAnalyticsGet(context.Background(), adAccountId).AdGroupIds(adGroupIds).StartDate(startDate).EndDate(endDate).TargetingTypes(targetingTypes).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).AttributionTypes(attributionTypes).Execute()
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
 **targetingTypes** | [**[]AdsAnalyticsTargetingType**](AdsAnalyticsTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | **[]string** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **attributionTypes** | [**ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsUpdate

> AdGroupArrayResponse AdGroupsUpdate(ctx, adAccountId).AdGroupUpdateRequest(adGroupUpdateRequest).Execute()

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
	adGroupUpdateRequest := []openapiclient.AdGroupUpdateRequest{*openapiclient.NewAdGroupUpdateRequest("2680060704746")} // []AdGroupUpdateRequest | List of ad groups to update, size limit [1, 30].

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AdGroupsAPI.AdGroupsUpdate(context.Background(), adAccountId).AdGroupUpdateRequest(adGroupUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AdGroupsAPI.AdGroupsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdGroupsUpdate`: AdGroupArrayResponse
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

 **adGroupUpdateRequest** | [**[]AdGroupUpdateRequest**](AdGroupUpdateRequest.md) | List of ad groups to update, size limit [1, 30]. | 

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

