# \AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountAnalytics**](AdAccountsApi.md#AdAccountAnalytics) | **Get** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**AdAccountsList**](AdAccountsApi.md#AdAccountsList) | **Get** /ad_accounts | List ad accounts
[**AdGroupsAnalytics**](AdAccountsApi.md#AdGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsList**](AdAccountsApi.md#AdGroupsList) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdsAnalytics**](AdAccountsApi.md#AdsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsList**](AdAccountsApi.md#AdsList) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
[**AnalyticsCreateReport**](AdAccountsApi.md#AnalyticsCreateReport) | **Post** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**AnalyticsGetReport**](AdAccountsApi.md#AnalyticsGetReport) | **Get** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**CampaignsAnalytics**](AdAccountsApi.md#CampaignsAnalytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsList**](AdAccountsApi.md#CampaignsList) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**ProductGroupsAnalytics**](AdAccountsApi.md#ProductGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## AdAccountAnalytics

> []map[string]map[string]interface{} AdAccountAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

Get ad account analytics



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    columns := []string{"SPEND_IN_DOLLAR"} // []string | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity := openapiclient.Granularity("TOTAL") // Granularity | Granularity
    clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AdAccountAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AdAccountAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdAccountAnalytics`: []map[string]map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AdAccountAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | **[]string** | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | Granularity | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdAccountsList

> Paginated AdAccountsList(ctx).Bookmark(bookmark).PageSize(pageSize).IncludeSharedAccounts(includeSharedAccounts).Execute()

List ad accounts



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
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
    includeSharedAccounts := true // bool | Include shared ad accounts (optional) (default to true)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AdAccountsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).IncludeSharedAccounts(includeSharedAccounts).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AdAccountsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdAccountsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AdAccountsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **includeSharedAccounts** | **bool** | Include shared ad accounts | [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsAnalytics

> []map[string]map[string]interface{} AdGroupsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).AdGroupIds(adGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

Get ad group analytics



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results.
    columns := []string{"SPEND_IN_DOLLAR"} // []string | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity := openapiclient.Granularity("TOTAL") // Granularity | Granularity
    clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AdGroupsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).AdGroupIds(adGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AdGroupsAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdGroupsAnalytics`: []map[string]map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AdGroupsAnalytics`: %v\n", resp)
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

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 
 **columns** | **[]string** | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | Granularity | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsList

> Paginated AdGroupsList(ctx, adAccountId).CampaignIds(campaignIds).AdGroupIds(adGroupIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).TranslateInterestsToNames(translateInterestsToNames).Execute()

List ad groups



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
    adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results. (optional)
    entityStatuses := []string{"ACTIVE"} // []string | Entity status (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
    order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    translateInterestsToNames := true // bool | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AdGroupsList(context.Background(), adAccountId).CampaignIds(campaignIds).AdGroupIds(adGroupIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).TranslateInterestsToNames(translateInterestsToNames).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AdGroupsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdGroupsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AdGroupsList`: %v\n", resp)
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
 **entityStatuses** | **[]string** | Entity status | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **translateInterestsToNames** | **bool** | Return interests as text names (if value is true) rather than topic IDs. | [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsAnalytics

> []map[string]map[string]interface{} AdsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).AdIds(adIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

Get ad analytics



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    adIds := []string{"Inner_example"} // []string | List of Ad Ids to use to filter the results.
    columns := []string{"SPEND_IN_DOLLAR"} // []string | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity := openapiclient.Granularity("TOTAL") // Granularity | Granularity
    clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AdsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).AdIds(adIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AdsAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdsAnalytics`: []map[string]map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AdsAnalytics`: %v\n", resp)
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

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adIds** | **[]string** | List of Ad Ids to use to filter the results. | 
 **columns** | **[]string** | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | Granularity | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsList

> Paginated AdsList(ctx, adAccountId).CampaignIds(campaignIds).AdGroupIds(adGroupIds).AdIds(adIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()

List ads



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
    adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to use to filter the results. (optional)
    adIds := []string{"Inner_example"} // []string | List of Ad Ids to use to filter the results. (optional)
    entityStatuses := []string{"ACTIVE"} // []string | Entity status (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
    order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AdsList(context.Background(), adAccountId).CampaignIds(campaignIds).AdGroupIds(adGroupIds).AdIds(adIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AdsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AdsList`: %v\n", resp)
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

 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **adGroupIds** | **[]string** | List of Ad group Ids to use to filter the results. | 
 **adIds** | **[]string** | List of Ad Ids to use to filter the results. | 
 **entityStatuses** | **[]string** | Entity status | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsCreateReport

> AdsAnalyticsCreateAsyncResponse AnalyticsCreateReport(ctx, adAccountId).AdsAnalyticsCreateAsyncRequest(adsAnalyticsCreateAsyncRequest).Execute()

Create async request for an account analytics report



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    adsAnalyticsCreateAsyncRequest := *openapiclient.NewAdsAnalyticsCreateAsyncRequest("2020-12-20", "2020-12-20", openapiclient.Granularity("TOTAL"), []openapiclient.ReportingColumnAsync{openapiclient.ReportingColumnAsync("SPEND_IN_MICRO_DOLLAR")}, openapiclient.MetricsReportingLevel("ADVERTISER")) // AdsAnalyticsCreateAsyncRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AnalyticsCreateReport(context.Background(), adAccountId).AdsAnalyticsCreateAsyncRequest(adsAnalyticsCreateAsyncRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AnalyticsCreateReport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AnalyticsCreateReport`: AdsAnalyticsCreateAsyncResponse
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AnalyticsCreateReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAnalyticsCreateReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsGetReport

> AdsAnalyticsGetAsyncResponse AnalyticsGetReport(ctx, adAccountId).Token(token).Execute()

Get the account analytics report created by the async call



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    token := "token_example" // string | Token returned from the post request creation call

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.AnalyticsGetReport(context.Background(), adAccountId).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.AnalyticsGetReport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AnalyticsGetReport`: AdsAnalyticsGetAsyncResponse
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.AnalyticsGetReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAnalyticsGetReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **token** | **string** | Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsAnalytics

> []map[string]map[string]interface{} CampaignsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).CampaignIds(campaignIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

Get campaign analytics



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results.
    columns := []string{"SPEND_IN_DOLLAR"} // []string | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity := openapiclient.Granularity("TOTAL") // Granularity | Granularity
    clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.CampaignsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).CampaignIds(campaignIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.CampaignsAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CampaignsAnalytics`: []map[string]map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.CampaignsAnalytics`: %v\n", resp)
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

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **columns** | **[]string** | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | Granularity | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsList

> Paginated CampaignsList(ctx, adAccountId).CampaignIds(campaignIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()

List campaigns



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
    entityStatuses := []string{"ACTIVE"} // []string | Entity status (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
    order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.CampaignsList(context.Background(), adAccountId).CampaignIds(campaignIds).EntityStatuses(entityStatuses).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.CampaignsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CampaignsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.CampaignsList`: %v\n", resp)
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

 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **entityStatuses** | **[]string** | Entity status | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupsAnalytics

> []map[string]map[string]interface{} ProductGroupsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).ProductGroupIds(productGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

Get product group analytics



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
    adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
    startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD
    endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD
    productGroupIds := []string{"Inner_example"} // []string | List of Product group Ids to use to filter the results.
    columns := []string{"SPEND_IN_DOLLAR"} // []string | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity := openapiclient.Granularity("TOTAL") // Granularity | Granularity
    clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdAccountsApi.ProductGroupsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).ProductGroupIds(productGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdAccountsApi.ProductGroupsAnalytics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ProductGroupsAnalytics`: []map[string]map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `AdAccountsApi.ProductGroupsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductGroupsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **productGroupIds** | **[]string** | List of Product group Ids to use to filter the results. | 
 **columns** | **[]string** | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | Granularity | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

