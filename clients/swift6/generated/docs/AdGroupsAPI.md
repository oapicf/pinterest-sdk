# AdGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adGroupsAnalytics**](AdGroupsAPI.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsAudienceSizing**](AdGroupsAPI.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**adGroupsBidFloorGet**](AdGroupsAPI.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**adGroupsCreate**](AdGroupsAPI.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**adGroupsDynamicTitlesDownloadCsv**](AdGroupsAPI.md#adgroupsdynamictitlesdownloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**adGroupsDynamicTitlesGetStatus**](AdGroupsAPI.md#adgroupsdynamictitlesgetstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**adGroupsDynamicTitlesGetUploadUrl**](AdGroupsAPI.md#adgroupsdynamictitlesgetuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**adGroupsDynamicTitlesProcessCsv**](AdGroupsAPI.md#adgroupsdynamictitlesprocesscsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**adGroupsGet**](AdGroupsAPI.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**adGroupsList**](AdGroupsAPI.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adGroupsTargetingAnalyticsGet**](AdGroupsAPI.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**adGroupsUpdate**](AdGroupsAPI.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**getAdGroupsByPromotionIdsList**](AdGroupsAPI.md#getadgroupsbypromotionidslist) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


# **adGroupsAnalytics**
```swift
    open class func adGroupsAnalytics(startDate: Date, endDate: Date, adGroupIds: [String], columns: [ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: ClickWindowDays_adGroupsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adGroupsAnalytics? = nil, viewWindowDays: ViewWindowDays_adGroupsAnalytics? = nil, conversionReportTime: ConversionReportTime_adGroupsAnalytics? = nil, aggregateReportRows: Bool? = nil, reportingTimezone: ReportingTimeZone? = nil, completion: @escaping (_ data: [AdGroupsAnalyticsMetrics]?, _ error: Error?) -> Void)
```

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let aggregateReportRows = true // Bool | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to false)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

// Get ad group analytics
AdGroupsAPI.adGroupsAnalytics(startDate: startDate, endDate: endDate, adGroupIds: adGroupIds, columns: columns, granularity: granularity, adAccountId: adAccountId, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, aggregateReportRows: aggregateReportRows, reportingTimezone: reportingTimezone) { (response, error) in
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
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | 
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

[**[AdGroupsAnalyticsMetrics]**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsAudienceSizing**
```swift
    open class func adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate, completion: @escaping (_ data: AdGroupAudienceSizing?, _ error: Error?) -> Void)
```

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupAudienceSizingCreate = AdGroupAudienceSizingCreate(autoTargetingEnabled: false, creativeTypes: [AdGroupAudienceSizingCreativeTypes()], keywords: [AdGroupAudienceSizingKeyword(matchType: MatchType(), value: "value_example")], placementGroup: AdgroupPlacementGroupType(), productGroupIds: ["productGroupIds_example"], targetingSpec: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()])) // AdGroupAudienceSizingCreate | 

// Get audience sizing
AdGroupsAPI.adGroupsAudienceSizing(adAccountId: adAccountId, adGroupAudienceSizingCreate: adGroupAudienceSizingCreate) { (response, error) in
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
 **adGroupAudienceSizingCreate** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md) |  | 

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsBidFloorGet**
```swift
    open class func adGroupsBidFloorGet(adAccountId: String, bidFloorCreate: BidFloorCreate, completion: @escaping (_ data: BidFloor?, _ error: Error?) -> Void)
```

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bidFloorCreate = BidFloorCreate(bidFloorSpecs: [BidFloorSpec(billableEvent: ActionType(), countries: [Country()], creativeType: CreativeType(), currency: Currency(), objectiveType: BidFloorObjectiveType(), optimizationGoalMetadata: OptimizationGoalMetadata(conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata(attributionWindows: AttributionWindows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: ConversionEvent(), conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, reportingEvent: "reportingEvent_example"), frequencyGoalMetadata: FrequencyGoalMetadata(frequency: 123, timerange: FrequencyGoalMetadataTimerange()), scrollupGoalMetadata: ScrollupGoalMetadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")))], targetingSpec: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()])) // BidFloorCreate | 

// Get bid floors
AdGroupsAPI.adGroupsBidFloorGet(adAccountId: adAccountId, bidFloorCreate: bidFloorCreate) { (response, error) in
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
 **bidFloorCreate** | [**BidFloorCreate**](BidFloorCreate.md) |  | 

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsCreate**
```swift
    open class func adGroupsCreate(adAccountId: String, adGroupCreateCreate: [AdGroupCreateCreate], completion: @escaping (_ data: AdGroupsCreate200Response?, _ error: Error?) -> Void)
```

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupCreateCreate = [AdGroupCreateCreate(autoTargetingEnabled: false, bidInMicroCurrency: 123, bidMultiplier: 123, bidStrategyType: BidStrategyType(), billableEvent: ActionType(), budgetInMicroCurrency: 123, budgetType: BudgetType(), campaignId: "campaignId_example", customerSegmentId: "customerSegmentId_example", endTime: 123, extFeatures: AdgroupTrackingFeatures(enabled: [AdgroupTrackingFeatureType()]), feedProfileId: "feedProfileId_example", isCreativeOptimization: false, isLocalInventory: false, lifetimeFrequencyCap: 123, localInventoryRadiusInMiles: 123, name: "name_example", optimizationGoalMetadata: NullableOptimizationGoalMetadata(conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata(attributionWindows: AttributionWindows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: ConversionEvent(), conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, reportingEvent: "reportingEvent_example"), frequencyGoalMetadata: FrequencyGoalMetadata(frequency: 123, timerange: FrequencyGoalMetadataTimerange()), scrollupGoalMetadata: ScrollupGoalMetadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), pacingDeliveryType: PacingDeliveryType(), performancePlusCampaignSettings: PerformancePlusCampaignSettings(boostProspectingAdGroupBid: false, pinnerListExclusions: ["pinnerListExclusions_example"]), placementGroup: PlacementGroupType(), placementTrafficType: PlacementTrafficType(), promotionApplicationLevel: PromotionApplicationLevel(), promotionId: "promotionId_example", promotionIds: ["promotionIds_example"], startTime: 123, status: EntityStatus(), targetingSpec: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()]), targetingTemplateIds: ["targetingTemplateIds_example"], trackingUrls: AdGroupTrackingURLs(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]))] // [AdGroupCreateCreate] | 

// Create ad groups
AdGroupsAPI.adGroupsCreate(adAccountId: adAccountId, adGroupCreateCreate: adGroupCreateCreate) { (response, error) in
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
 **adGroupCreateCreate** | [**[AdGroupCreateCreate]**](AdGroupCreateCreate.md) |  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesDownloadCsv**
```swift
    open class func adGroupsDynamicTitlesDownloadCsv(adAccountId: String, adGroupId: String, completion: @escaping (_ data: DynamicTitlesDownloadCSV?, _ error: Error?) -> Void)
```

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupId = "adGroupId_example" // String | Ad group ID.

// Get dynamic titles CSV download URL
AdGroupsAPI.adGroupsDynamicTitlesDownloadCsv(adAccountId: adAccountId, adGroupId: adGroupId) { (response, error) in
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
 **adGroupId** | **String** | Ad group ID. | 

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesGetStatus**
```swift
    open class func adGroupsDynamicTitlesGetStatus(adAccountId: String, adGroupId: String, completion: @escaping (_ data: DynamicTitlesGetStatus?, _ error: Error?) -> Void)
```

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupId = "adGroupId_example" // String | Ad group ID.

// Get dynamic titles status
AdGroupsAPI.adGroupsDynamicTitlesGetStatus(adAccountId: adAccountId, adGroupId: adGroupId) { (response, error) in
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
 **adGroupId** | **String** | Ad group ID. | 

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesGetUploadUrl**
```swift
    open class func adGroupsDynamicTitlesGetUploadUrl(adAccountId: String, adGroupId: String, completion: @escaping (_ data: DynamicTitlesUploadURL?, _ error: Error?) -> Void)
```

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupId = "adGroupId_example" // String | Ad group ID.

// Get dynamic titles upload URL
AdGroupsAPI.adGroupsDynamicTitlesGetUploadUrl(adAccountId: adAccountId, adGroupId: adGroupId) { (response, error) in
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
 **adGroupId** | **String** | Ad group ID. | 

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesProcessCsv**
```swift
    open class func adGroupsDynamicTitlesProcessCsv(adAccountId: String, adGroupId: String, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate, completion: @escaping (_ data: DynamicTitlesProcessCSV?, _ error: Error?) -> Void)
```

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupId = "adGroupId_example" // String | Ad group ID.
let dynamicTitlesProcessCSVCreate = DynamicTitlesProcessCSVCreate(requestId: "requestId_example") // DynamicTitlesProcessCSVCreate | 

// Process dynamic titles CSV
AdGroupsAPI.adGroupsDynamicTitlesProcessCsv(adAccountId: adAccountId, adGroupId: adGroupId, dynamicTitlesProcessCSVCreate: dynamicTitlesProcessCSVCreate) { (response, error) in
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
 **adGroupId** | **String** | Ad group ID. | 
 **dynamicTitlesProcessCSVCreate** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md) |  | 

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsGet**
```swift
    open class func adGroupsGet(adGroupId: String, adAccountId: String, completion: @escaping (_ data: AdGroup?, _ error: Error?) -> Void)
```

Get ad group

Get a specific ad group given the ad group ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adGroupId = "adGroupId_example" // String | Ad group ID.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get ad group
AdGroupsAPI.adGroupsGet(adGroupId: adGroupId, adAccountId: adAccountId) { (response, error) in
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
 **adGroupId** | **String** | Ad group ID. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**AdGroup**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsList**
```swift
    open class func adGroupsList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, campaignIds: [String]? = nil, adGroupIds: [String]? = nil, entityStatuses: [EntityStatus]? = nil, translateInterestsToNames: Bool? = nil, completion: @escaping (_ data: AdGroupsList200Response?, _ error: Error?) -> Void)
```

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
let entityStatuses = [EntityStatus()] // [EntityStatus] | Entity status (optional)
let translateInterestsToNames = true // Bool | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

// List ad groups
AdGroupsAPI.adGroupsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, campaignIds: campaignIds, adGroupIds: adGroupIds, entityStatuses: entityStatuses, translateInterestsToNames: translateInterestsToNames) { (response, error) in
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
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **entityStatuses** | [**[EntityStatus]**](EntityStatus.md) | Entity status | [optional] 
 **translateInterestsToNames** | **Bool** | Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsTargetingAnalyticsGet**
```swift
    open class func adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: [String], startDate: Date, endDate: Date, targetingTypes: [AdsAnalyticsAdGroupTargetingType], columns: [ReportingColumnSync], granularity: Granularity, clickWindowDays: ClickWindowDays_adGroupsTargetingAnalyticsGet? = nil, engagementWindowDays: EngagementWindowDays_adGroupsTargetingAnalyticsGet? = nil, viewWindowDays: ViewWindowDays_adGroupsTargetingAnalyticsGet? = nil, conversionReportTime: ConversionReportTime_adGroupsTargetingAnalyticsGet? = nil, attributionTypes: [ConversionReportAttributionType]? = nil, reportingTimezone: ReportingTimeZone? = nil, sortColumns: [String]? = nil, sortAscending: Bool? = nil, completion: @escaping (_ data: MetricsResponse?, _ error: Error?) -> Void)
```

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let targetingTypes = [AdsAnalyticsAdGroupTargetingType()] // [AdsAnalyticsAdGroupTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let attributionTypes = [ConversionReportAttributionType()] // [ConversionReportAttributionType] | List of types of attribution for the conversion report (optional)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
let sortColumns = ["inner_example"] // [String] | Sort Columns. (optional)
let sortAscending = true // Bool | Sort ascending. (optional)

// Get targeting analytics for ad groups
AdGroupsAPI.adGroupsTargetingAnalyticsGet(adAccountId: adAccountId, adGroupIds: adGroupIds, startDate: startDate, endDate: endDate, targetingTypes: targetingTypes, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone, sortColumns: sortColumns, sortAscending: sortAscending) { (response, error) in
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
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**[AdsAnalyticsAdGroupTargetingType]**](AdsAnalyticsAdGroupTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **attributionTypes** | [**[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **sortColumns** | [**[String]**](String.md) | Sort Columns. | [optional] 
 **sortAscending** | **Bool** | Sort ascending. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsUpdate**
```swift
    open class func adGroupsUpdate(adAccountId: String, adGroupUpdateBatchUpdate: [AdGroupUpdateBatchUpdate], completion: @escaping (_ data: AdGroupsCreate200Response?, _ error: Error?) -> Void)
```

Update ad groups

Update multiple existing ad groups.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupUpdateBatchUpdate = [AdGroupUpdateBatchUpdate(autoTargetingEnabled: false, bidInMicroCurrency: 123, bidMultiplier: 123, bidStrategyType: BidStrategyType(), billableEvent: ActionType(), budgetInMicroCurrency: 123, budgetType: BudgetType(), campaignId: "campaignId_example", customerSegmentId: "customerSegmentId_example", endTime: 123, extFeatures: AdgroupTrackingFeatures(enabled: [AdgroupTrackingFeatureType()]), feedProfileId: "feedProfileId_example", id: "id_example", isCreativeOptimization: false, isLocalInventory: false, lifetimeFrequencyCap: 123, localInventoryRadiusInMiles: 123, name: "name_example", optimizationGoalMetadata: NullableOptimizationGoalMetadata(conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata(attributionWindows: AttributionWindows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: ConversionEvent(), conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, reportingEvent: "reportingEvent_example"), frequencyGoalMetadata: FrequencyGoalMetadata(frequency: 123, timerange: FrequencyGoalMetadataTimerange()), scrollupGoalMetadata: ScrollupGoalMetadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), pacingDeliveryType: PacingDeliveryType(), performancePlusCampaignSettings: PerformancePlusCampaignSettings(boostProspectingAdGroupBid: false, pinnerListExclusions: ["pinnerListExclusions_example"]), placementGroup: PlacementGroupType(), placementTrafficType: PlacementTrafficType(), promotionApplicationLevel: PromotionApplicationLevel(), promotionId: "promotionId_example", promotionIds: ["promotionIds_example"], startTime: 123, status: EntityStatus(), targetingSpec: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()]), targetingSpecOperations: [TargetingSpecOperations(field: "field_example", operation: "operation_example", values: [nil], value: "value_example")], targetingTemplateIds: ["targetingTemplateIds_example"], trackingUrls: AdGroupTrackingURLs(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]))] // [AdGroupUpdateBatchUpdate] | 

// Update ad groups
AdGroupsAPI.adGroupsUpdate(adAccountId: adAccountId, adGroupUpdateBatchUpdate: adGroupUpdateBatchUpdate) { (response, error) in
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
 **adGroupUpdateBatchUpdate** | [**[AdGroupUpdateBatchUpdate]**](AdGroupUpdateBatchUpdate.md) |  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAdGroupsByPromotionIdsList**
```swift
    open class func getAdGroupsByPromotionIdsList(adAccountId: String, promotionIds: [String], bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, completion: @escaping (_ data: AdGroupsList200Response?, _ error: Error?) -> Void)
```

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionIds = ["inner_example"] // [String] | List of Promotion IDs to use to filter the results.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

// List of ad groups using promotions IDs.
AdGroupsAPI.getAdGroupsByPromotionIdsList(adAccountId: adAccountId, promotionIds: promotionIds, bookmark: bookmark, pageSize: pageSize, order: order) { (response, error) in
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
 **promotionIds** | [**[String]**](String.md) | List of Promotion IDs to use to filter the results. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

