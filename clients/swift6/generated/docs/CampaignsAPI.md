# CampaignsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPinsAnalytics**](CampaignsAPI.md#adpinsanalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaignTargetingAnalyticsGet**](CampaignsAPI.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaignsAnalytics**](CampaignsAPI.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsCreate**](CampaignsAPI.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaignsGet**](CampaignsAPI.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaignsList**](CampaignsAPI.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaignsUpdate**](CampaignsAPI.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**getCampaignDeliveryEstimates**](CampaignsAPI.md#getcampaigndeliveryestimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates


# **adPinsAnalytics**
```swift
    open class func adPinsAnalytics(campaignId: String, pinIds: [String], startDate: Date, endDate: Date, columns: [ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: ClickWindowDays_adPinsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adPinsAnalytics? = nil, viewWindowDays: ViewWindowDays_adPinsAnalytics? = nil, conversionReportTime: ConversionReportTime_adPinsAnalytics? = nil, completion: @escaping (_ data: [AdPinAnalytics]?, _ error: Error?) -> Void)
```

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let campaignId = "campaignId_example" // String | Campaign Id to use to filter the results.
let pinIds = ["inner_example"] // [String] | List of Pin IDs.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get pins analytics
CampaignsAPI.adPinsAnalytics(campaignId: campaignId, pinIds: pinIds, startDate: startDate, endDate: endDate, columns: columns, granularity: granularity, adAccountId: adAccountId, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String** | Campaign Id to use to filter the results. | 
 **pinIds** | [**[String]**](String.md) | List of Pin IDs. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[AdPinAnalytics]**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignTargetingAnalyticsGet**
```swift
    open class func campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: [String], startDate: Date, endDate: Date, targetingTypes: [AdsAnalyticsCampaignTargetingType], columns: [ReportingColumnSync], granularity: Granularity, clickWindowDays: ClickWindowDays_campaignTargetingAnalyticsGet? = nil, engagementWindowDays: EngagementWindowDays_campaignTargetingAnalyticsGet? = nil, viewWindowDays: ViewWindowDays_campaignTargetingAnalyticsGet? = nil, conversionReportTime: ConversionReportTime_campaignTargetingAnalyticsGet? = nil, attributionTypes: [ConversionReportAttributionType]? = nil, reportingTimezone: ReportingTimeZone? = nil, completion: @escaping (_ data: MetricsResponse?, _ error: Error?) -> Void)
```

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let targetingTypes = [AdsAnalyticsCampaignTargetingType()] // [AdsAnalyticsCampaignTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let attributionTypes = [ConversionReportAttributionType()] // [ConversionReportAttributionType] | List of types of attribution for the conversion report (optional)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

// Get targeting analytics for campaigns
CampaignsAPI.campaignTargetingAnalyticsGet(adAccountId: adAccountId, campaignIds: campaignIds, startDate: startDate, endDate: endDate, targetingTypes: targetingTypes, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**[AdsAnalyticsCampaignTargetingType]**](AdsAnalyticsCampaignTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **attributionTypes** | [**[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsAnalytics**
```swift
    open class func campaignsAnalytics(startDate: Date, endDate: Date, campaignIds: [String], columns: [ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: ClickWindowDays_campaignsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_campaignsAnalytics? = nil, viewWindowDays: ViewWindowDays_campaignsAnalytics? = nil, conversionReportTime: ConversionReportTime_campaignsAnalytics? = nil, aggregateReportRows: Bool? = nil, reportingTimezone: ReportingTimeZone? = nil, completion: @escaping (_ data: [CampaignsAnalyticsMetrics]?, _ error: Error?) -> Void)
```

Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let aggregateReportRows = true // Bool | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to false)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

// Get campaign analytics
CampaignsAPI.campaignsAnalytics(startDate: startDate, endDate: endDate, campaignIds: campaignIds, columns: columns, granularity: granularity, adAccountId: adAccountId, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, aggregateReportRows: aggregateReportRows, reportingTimezone: reportingTimezone) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **aggregateReportRows** | **Bool** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**[CampaignsAnalyticsMetrics]**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsCreate**
```swift
    open class func campaignsCreate(adAccountId: String, campaignCreateItem: [CampaignCreateItem], completion: @escaping (_ data: CampaignBatchWriteResponseModel?, _ error: Error?) -> Void)
```

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignCreateItem = [CampaignCreateItem(adAccountId: "adAccountId_example", appId: "appId_example", appPlatform: MobileAppPlatform(), bidOptions: CampaignBidOptions(ageBucketMultipliers: AgeBucketMultipliers(AGE_BUCKET: TargetingSpecAgeBucket()), appTypeMultipliers: AppTypeMultipliers(APP_TYPE: TargetingSpecAppType()), audienceMultipliers: CampaignAudienceMultipliers(AUDIENCE_ID: "AUDIENCE_ID_example"), freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow(), frequencyMultipliers: FrequencyMultipliers(IMPRESSION_COUNT: "IMPRESSION_COUNT_example"), genderMultipliers: GenderMultipliers(GENDER: TargetingSpecGender()), placementMultipliers: PlacementMultipliers(PLACEMENT: PlacementType())), dailySpendCap: 123, defaultAdGroupBudgetInMicroCurrency: 123, endTime: 123, intendedPromotionType: IntendedPromotionType(), isAutomatedCampaign: true, isCampaignBudgetOptimization: true, isFlexibleDailyBudgets: true, isLtvOptimized: true, isPerformancePlus: true, isTopOfSearch: true, lifetimeSpendCap: 123, name: "name_example", objectiveType: ConversionObjectiveType(), orderLineId: "orderLineId_example", startTime: 123, status: EntityStatus(), trackingUrls: TrackingUrls(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]))] // [CampaignCreateItem] | 

// Create campaigns
CampaignsAPI.campaignsCreate(adAccountId: adAccountId, campaignCreateItem: campaignCreateItem) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **campaignCreateItem** | [**[CampaignCreateItem]**](CampaignCreateItem.md) |  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsGet**
```swift
    open class func campaignsGet(campaignId: String, adAccountId: String, completion: @escaping (_ data: Campaign?, _ error: Error?) -> Void)
```

Get campaign

Get a specific campaign given the campaign ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let campaignId = "campaignId_example" // String | Campaign ID, must be associated with the ad account ID provided in the path.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get campaign
CampaignsAPI.campaignsGet(campaignId: campaignId, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String** | Campaign ID, must be associated with the ad account ID provided in the path. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsList**
```swift
    open class func campaignsList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, campaignIds: [String]? = nil, entityStatuses: [EntityStatus]? = nil, completion: @escaping (_ data: CampaignsList200Response?, _ error: Error?) -> Void)
```

List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let entityStatuses = [EntityStatus()] // [EntityStatus] | Entity status (optional)

// List campaigns
CampaignsAPI.campaignsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, campaignIds: campaignIds, entityStatuses: entityStatuses) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[EntityStatus]**](EntityStatus.md) | Entity status | [optional] 

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsUpdate**
```swift
    open class func campaignsUpdate(adAccountId: String, campaignBatchUpdateItem: [CampaignBatchUpdateItem], completion: @escaping (_ data: CampaignBatchWriteResponseModel?, _ error: Error?) -> Void)
```

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignBatchUpdateItem = [CampaignBatchUpdateItem(adAccountId: "adAccountId_example", appId: "appId_example", appPlatform: MobileAppPlatform(), bidOptions: CampaignBidOptionsUpdate(ageBucketMultipliers: AgeBucketMultipliers(AGE_BUCKET: TargetingSpecAgeBucket()), appTypeMultipliers: AppTypeMultipliers(APP_TYPE: TargetingSpecAppType()), audienceMultipliers: CampaignAudienceMultipliers(AUDIENCE_ID: "AUDIENCE_ID_example"), freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow(), frequencyMultipliers: FrequencyMultipliers(IMPRESSION_COUNT: "IMPRESSION_COUNT_example"), genderMultipliers: GenderMultipliers(GENDER: TargetingSpecGender()), placementMultipliers: PlacementMultipliers(PLACEMENT: PlacementType()), updateMask: [CampaignBidOptionsUpdateMaskItems()]), dailySpendCap: 123, defaultAdGroupBudgetInMicroCurrency: 123, endTime: 123, id: "id_example", intendedPromotionType: IntendedPromotionType(), isAutomatedCampaign: true, isCampaignBudgetOptimization: true, isFlexibleDailyBudgets: true, isLtvOptimized: true, isPerformancePlus: true, isTopOfSearch: true, lifetimeSpendCap: 123, name: "name_example", objectiveType: ConversionObjectiveType(), orderLineId: "orderLineId_example", performancePlusCampaignSettings: PerformancePlusCampaignSettings(boostProspectingAdGroupBid: false, pinnerListExclusions: ["pinnerListExclusions_example"]), startTime: 123, status: EntityStatus(), trackingUrls: TrackingUrls(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]))] // [CampaignBatchUpdateItem] | 

// Update campaigns
CampaignsAPI.campaignsUpdate(adAccountId: adAccountId, campaignBatchUpdateItem: campaignBatchUpdateItem) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **campaignBatchUpdateItem** | [**[CampaignBatchUpdateItem]**](CampaignBatchUpdateItem.md) |  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCampaignDeliveryEstimates**
```swift
    open class func getCampaignDeliveryEstimates(adAccountId: String, campaignDeliveryEstimatesCampaign: [CampaignDeliveryEstimatesCampaign], completion: @escaping (_ data: CampaignDeliveryEstimatesResponse?, _ error: Error?) -> Void)
```

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignDeliveryEstimatesCampaign = [CampaignDeliveryEstimatesCampaign(adGroups: [AdGroupDeliveryEstimates(autoTargetingEnabled: false, creativeTypes: [AdGroupAudienceSizingCreativeTypes()], keywords: [AdGroupDeliveryEstimatesKeywordsItems(matchType: NullalbleMatchType(), value: "value_example")], monthlyFrequencyCap: 123, optimizationGoalMetadata: OptimizationGoalMetadata(conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata(attributionWindows: AttributionWindows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: ConversionEvent(), conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, reportingEvent: "reportingEvent_example"), frequencyGoalMetadata: FrequencyGoalMetadata(frequency: 123, timerange: FrequencyGoalMetadataTimerange()), scrollupGoalMetadata: ScrollupGoalMetadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), optimizationType: OptimizationType(), placementGroup: PlacementGroupType(), productGroupIds: ["productGroupIds_example"], targetingSpec: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()]))], budgetDurationType: BudgetDurationType(), dailySpendCap: 123, endDate: "endDate_example", lifetimeSpendCap: 123, objectiveType: DeliveryEstimateObjectiveType(), startDate: "startDate_example")] // [CampaignDeliveryEstimatesCampaign] | 

// Get campaign delivery estimates
CampaignsAPI.getCampaignDeliveryEstimates(adAccountId: adAccountId, campaignDeliveryEstimatesCampaign: campaignDeliveryEstimatesCampaign) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **campaignDeliveryEstimatesCampaign** | [**[CampaignDeliveryEstimatesCampaign]**](CampaignDeliveryEstimatesCampaign.md) |  | 

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

