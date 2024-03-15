# AdGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adGroupsAnalytics**](AdGroupsAPI.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsAudienceSizing**](AdGroupsAPI.md#adgroupsaudiencesizing) | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**adGroupsBidFloorGet**](AdGroupsAPI.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**adGroupsCreate**](AdGroupsAPI.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**adGroupsGet**](AdGroupsAPI.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**adGroupsList**](AdGroupsAPI.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adGroupsTargetingAnalyticsGet**](AdGroupsAPI.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**adGroupsUpdate**](AdGroupsAPI.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups


# **adGroupsAnalytics**
```swift
    open class func adGroupsAnalytics(adAccountId: String, startDate: Date, endDate: Date, adGroupIds: [String], columns: [Columns_adGroupsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_adGroupsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adGroupsAnalytics? = nil, viewWindowDays: ViewWindowDays_adGroupsAnalytics? = nil, conversionReportTime: ConversionReportTime_adGroupsAnalytics? = nil, completion: @escaping (_ data: [AdGroupsAnalyticsResponseInner]?, _ error: Error?) -> Void)
```

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get ad group analytics
AdGroupsAPI.adGroupsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, adGroupIds: adGroupIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[AdGroupsAnalyticsResponseInner]**](AdGroupsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsAudienceSizing**
```swift
    open class func adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest? = nil, completion: @escaping (_ data: AdGroupAudienceSizingResponse?, _ error: Error?) -> Void)
```

Get audience sizing

Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupAudienceSizingRequest = AdGroupAudienceSizingRequest(autoTargetingEnabled: true, placementGroup: PlacementGroupType(), creativeTypes: ["creativeTypes_example"], targetingSpec: TargetingSpec(AGE_BUCKET: ["AGE_BUCKET_example"], APPTYPE: ["APPTYPE_example"], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: ["GENDER_example"], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], SHOPPING_RETARGETING: [TargetingSpec_SHOPPING_RETARGETING(lookbackWindow: 123, tagTypes: [123], exclusionWindow: 123)], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), productGroupIds: ["productGroupIds_example"], keywords: [AdGroupAudienceSizingRequest_keywords_inner(matchType: MatchTypeResponse(), value: "value_example")]) // AdGroupAudienceSizingRequest |  (optional)

// Get audience sizing
AdGroupsAPI.adGroupsAudienceSizing(adAccountId: adAccountId, adGroupAudienceSizingRequest: adGroupAudienceSizingRequest) { (response, error) in
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
 **adGroupAudienceSizingRequest** | [**AdGroupAudienceSizingRequest**](AdGroupAudienceSizingRequest.md) |  | [optional] 

### Return type

[**AdGroupAudienceSizingResponse**](AdGroupAudienceSizingResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsBidFloorGet**
```swift
    open class func adGroupsBidFloorGet(adAccountId: String, bidFloorRequest: BidFloorRequest, completion: @escaping (_ data: BidFloor?, _ error: Error?) -> Void)
```

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bidFloorRequest = BidFloorRequest(bidFloorSpecs: [BidFloorSpec(countries: [Country()], currency: Currency(), objectiveType: ObjectiveType(), billableEvent: ActionType(), optimizationGoalMetadata: OptimizationGoalMetadata(conversionTagV3GoalMetadata: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(attributionWindows: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: "conversionEvent_example", conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, learningModeType: "learningModeType_example"), frequencyGoalMetadata: OptimizationGoalMetadata_frequency_goal_metadata(frequency: 123, timerange: "timerange_example"), scrollupGoalMetadata: OptimizationGoalMetadata_scrollup_goal_metadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), creativeType: CreativeType())], targetingSpec: TargetingSpec(AGE_BUCKET: ["AGE_BUCKET_example"], APPTYPE: ["APPTYPE_example"], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: ["GENDER_example"], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], SHOPPING_RETARGETING: [TargetingSpec_SHOPPING_RETARGETING(lookbackWindow: 123, tagTypes: [123], exclusionWindow: 123)], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"])) // BidFloorRequest | Parameters to get bid_floor info

// Get bid floors
AdGroupsAPI.adGroupsBidFloorGet(adAccountId: adAccountId, bidFloorRequest: bidFloorRequest) { (response, error) in
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
 **bidFloorRequest** | [**BidFloorRequest**](BidFloorRequest.md) | Parameters to get bid_floor info | 

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsCreate**
```swift
    open class func adGroupsCreate(adAccountId: String, adGroupCreateRequest: [AdGroupCreateRequest], completion: @escaping (_ data: AdGroupArrayResponse?, _ error: Error?) -> Void)
```

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupCreateRequest = [AdGroupCreateRequest(name: "name_example", status: EntityStatus(), budgetInMicroCurrency: 123, bidInMicroCurrency: 123, optimizationGoalMetadata: AdGroupCommon_optimization_goal_metadata(conversionTagV3GoalMetadata: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(attributionWindows: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: "conversionEvent_example", conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, learningModeType: "learningModeType_example"), frequencyGoalMetadata: OptimizationGoalMetadata_frequency_goal_metadata(frequency: 123, timerange: "timerange_example"), scrollupGoalMetadata: OptimizationGoalMetadata_scrollup_goal_metadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), budgetType: BudgetType(), startTime: 123, endTime: 123, targetingSpec: TargetingSpec(AGE_BUCKET: ["AGE_BUCKET_example"], APPTYPE: ["APPTYPE_example"], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: ["GENDER_example"], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], SHOPPING_RETARGETING: [TargetingSpec_SHOPPING_RETARGETING(lookbackWindow: 123, tagTypes: [123], exclusionWindow: 123)], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), lifetimeFrequencyCap: 123, trackingUrls: AdGroupCommon_tracking_urls(impression: ["impression_example"], click: ["click_example"], engagement: ["engagement_example"], buyableButton: ["buyableButton_example"], audienceVerification: ["audienceVerification_example"]), autoTargetingEnabled: true, placementGroup: PlacementGroupType(), pacingDeliveryType: PacingDeliveryType(), campaignId: "campaignId_example", billableEvent: ActionType(), bidStrategyType: "bidStrategyType_example")] // [AdGroupCreateRequest] | List of ad groups to create, size limit [1, 30].

// Create ad groups
AdGroupsAPI.adGroupsCreate(adAccountId: adAccountId, adGroupCreateRequest: adGroupCreateRequest) { (response, error) in
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
 **adGroupCreateRequest** | [**[AdGroupCreateRequest]**](AdGroupCreateRequest.md) | List of ad groups to create, size limit [1, 30]. | 

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsGet**
```swift
    open class func adGroupsGet(adAccountId: String, adGroupId: String, completion: @escaping (_ data: AdGroupResponse?, _ error: Error?) -> Void)
```

Get ad group

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupId = "adGroupId_example" // String | Unique identifier of an ad group.

// Get ad group
AdGroupsAPI.adGroupsGet(adAccountId: adAccountId, adGroupId: adGroupId) { (response, error) in
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
 **adGroupId** | **String** | Unique identifier of an ad group. | 

### Return type

[**AdGroupResponse**](AdGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsList**
```swift
    open class func adGroupsList(adAccountId: String, campaignIds: [String]? = nil, adGroupIds: [String]? = nil, entityStatuses: [EntityStatuses_adGroupsList]? = nil, pageSize: Int? = nil, order: Order_adGroupsList? = nil, bookmark: String? = nil, translateInterestsToNames: Bool? = nil, completion: @escaping (_ data: AdGroupsList200Response?, _ error: Error?) -> Void)
```

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Entity status (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let translateInterestsToNames = true // Bool | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

// List ad groups
AdGroupsAPI.adGroupsList(adAccountId: adAccountId, campaignIds: campaignIds, adGroupIds: adGroupIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark, translateInterestsToNames: translateInterestsToNames) { (response, error) in
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
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Entity status | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **translateInterestsToNames** | **Bool** | Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsTargetingAnalyticsGet**
```swift
    open class func adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: [String], startDate: Date, endDate: Date, targetingTypes: [AdsAnalyticsTargetingType], columns: [Columns_adGroupsTargetingAnalyticsGet], granularity: Granularity, clickWindowDays: ClickWindowDays_adGroupsTargetingAnalyticsGet? = nil, engagementWindowDays: EngagementWindowDays_adGroupsTargetingAnalyticsGet? = nil, viewWindowDays: ViewWindowDays_adGroupsTargetingAnalyticsGet? = nil, conversionReportTime: ConversionReportTime_adGroupsTargetingAnalyticsGet? = nil, attributionTypes: ConversionReportAttributionType? = nil, completion: @escaping (_ data: MetricsResponse?, _ error: Error?) -> Void)
```

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let targetingTypes = [AdsAnalyticsTargetingType()] // [AdsAnalyticsTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
let columns = ["columns_example"] // [String] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let attributionTypes = ConversionReportAttributionType() // ConversionReportAttributionType | List of types of attribution for the conversion report (optional)

// Get targeting analytics for ad groups
AdGroupsAPI.adGroupsTargetingAnalyticsGet(adAccountId: adAccountId, adGroupIds: adGroupIds, startDate: startDate, endDate: endDate, targetingTypes: targetingTypes, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes) { (response, error) in
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
 **targetingTypes** | [**[AdsAnalyticsTargetingType]**](AdsAnalyticsTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **attributionTypes** | [**ConversionReportAttributionType**](.md) | List of types of attribution for the conversion report | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsUpdate**
```swift
    open class func adGroupsUpdate(adAccountId: String, adGroupUpdateRequest: [AdGroupUpdateRequest], completion: @escaping (_ data: AdGroupArrayResponse?, _ error: Error?) -> Void)
```

Update ad groups

Update multiple existing ad groups.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adGroupUpdateRequest = [AdGroupUpdateRequest(name: "name_example", status: EntityStatus(), budgetInMicroCurrency: 123, bidInMicroCurrency: 123, optimizationGoalMetadata: AdGroupCommon_optimization_goal_metadata(conversionTagV3GoalMetadata: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(attributionWindows: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: "conversionEvent_example", conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, learningModeType: "learningModeType_example"), frequencyGoalMetadata: OptimizationGoalMetadata_frequency_goal_metadata(frequency: 123, timerange: "timerange_example"), scrollupGoalMetadata: OptimizationGoalMetadata_scrollup_goal_metadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), budgetType: BudgetType(), startTime: 123, endTime: 123, targetingSpec: TargetingSpec(AGE_BUCKET: ["AGE_BUCKET_example"], APPTYPE: ["APPTYPE_example"], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: ["GENDER_example"], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], SHOPPING_RETARGETING: [TargetingSpec_SHOPPING_RETARGETING(lookbackWindow: 123, tagTypes: [123], exclusionWindow: 123)], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), lifetimeFrequencyCap: 123, trackingUrls: AdGroupCommon_tracking_urls(impression: ["impression_example"], click: ["click_example"], engagement: ["engagement_example"], buyableButton: ["buyableButton_example"], audienceVerification: ["audienceVerification_example"]), autoTargetingEnabled: true, placementGroup: PlacementGroupType(), pacingDeliveryType: PacingDeliveryType(), campaignId: "campaignId_example", billableEvent: ActionType(), bidStrategyType: "bidStrategyType_example", id: "id_example")] // [AdGroupUpdateRequest] | List of ad groups to update, size limit [1, 30].

// Update ad groups
AdGroupsAPI.adGroupsUpdate(adAccountId: adAccountId, adGroupUpdateRequest: adGroupUpdateRequest) { (response, error) in
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
 **adGroupUpdateRequest** | [**[AdGroupUpdateRequest]**](AdGroupUpdateRequest.md) | List of ad groups to update, size limit [1, 30]. | 

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

