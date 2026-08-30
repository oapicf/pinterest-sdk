# AdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPreviewsCreate**](AdsAPI.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**adTargetingAnalyticsGet**](AdsAPI.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**adsAnalytics**](AdsAPI.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsCreate**](AdsAPI.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**adsGet**](AdsAPI.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**adsList**](AdsAPI.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**adsUpdate**](AdsAPI.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaignAdPreviewCreate**](AdsAPI.md#campaignadpreviewcreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaignAdPreviewDelete**](AdsAPI.md#campaignadpreviewdelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaignAdPreviewRead**](AdsAPI.md#campaignadpreviewread) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **adPreviewsCreate**
```swift
    open class func adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest, completion: @escaping (_ data: AdPreviewURLResponse?, _ error: Error?) -> Void)
```

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adPreviewRequest = AdPreviewRequest(imageUrl: "imageUrl_example", promotionId: "promotionId_example", title: "title_example", creativeType: AdShoppingPreviewCreativeType(), pinId: "pinId_example", catalogProductGroupId: "catalogProductGroupId_example", customizableCtaType: CustomizableCTAType(), heroImageTitle: "heroImageTitle_example", heroImageUrl: "heroImageUrl_example", heroPinId: "heroPinId_example", imageTag: "imageTag_example", itemId: "itemId_example", preferredMediaType: BasePreferredMediaType(), showPromotion: false, videoTag: "videoTag_example") // AdPreviewRequest | 

// Create ad preview with pin or image
AdsAPI.adPreviewsCreate(adAccountId: adAccountId, adPreviewRequest: adPreviewRequest) { (response, error) in
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
 **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md) |  | 

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adTargetingAnalyticsGet**
```swift
    open class func adTargetingAnalyticsGet(adAccountId: String, adIds: [String], startDate: Date, endDate: Date, targetingTypes: [AdsAnalyticsAdTargetingType], columns: [ReportingColumnSync], granularity: Granularity, clickWindowDays: ConversionAttributionWindowDays? = nil, engagementWindowDays: ConversionAttributionWindowDays? = nil, viewWindowDays: ConversionAttributionWindowDays? = nil, conversionReportTime: ConversionReportTimeType? = nil, attributionTypes: [ConversionReportAttributionType]? = nil, reportingTimezone: ReportingTimeZone? = nil, sortColumns: [String]? = nil, sortAscending: Bool? = nil, completion: @escaping (_ data: MetricsResponse?, _ error: Error?) -> Void)
```

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let targetingTypes = [AdsAnalyticsAdTargetingType()] // [AdsAnalyticsAdTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let clickWindowDays = ConversionAttributionWindowDays() // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
let engagementWindowDays = ConversionAttributionWindowDays() // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
let viewWindowDays = ConversionAttributionWindowDays() // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
let conversionReportTime = ConversionReportTimeType() // ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
let attributionTypes = [ConversionReportAttributionType()] // [ConversionReportAttributionType] | List of types of attribution for the conversion report (optional)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
let sortColumns = ["inner_example"] // [String] | Sort Columns. (optional)
let sortAscending = true // Bool | Sort ascending. (optional)

// Get targeting analytics for ads
AdsAPI.adTargetingAnalyticsGet(adAccountId: adAccountId, adIds: adIds, startDate: startDate, endDate: endDate, targetingTypes: targetingTypes, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone, sortColumns: sortColumns, sortAscending: sortAscending) { (response, error) in
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
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**[AdsAnalyticsAdTargetingType]**](AdsAnalyticsAdTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
 **engagementWindowDays** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] 
 **viewWindowDays** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 
 **conversionReportTime** | [**ConversionReportTimeType**](.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
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

# **adsAnalytics**
```swift
    open class func adsAnalytics(startDate: Date, endDate: Date, columns: [ReportingColumnSync], granularity: Granularity, adAccountId: String, pinIds: [String]? = nil, adIds: [String]? = nil, clickWindowDays: ClickWindowDays_adsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adsAnalytics? = nil, viewWindowDays: ViewWindowDays_adsAnalytics? = nil, conversionReportTime: ConversionReportTime_adsAnalytics? = nil, campaignIds: [String]? = nil, reportingTimezone: ReportingTimeZone? = nil, completion: @escaping (_ data: [AdsAnalytics]?, _ error: Error?) -> Void)
```

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pinIds = ["inner_example"] // [String] | List of Pin IDs. (optional)
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results. (optional)
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

// Get ad analytics
AdsAPI.adsAnalytics(startDate: startDate, endDate: endDate, columns: columns, granularity: granularity, adAccountId: adAccountId, pinIds: pinIds, adIds: adIds, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, campaignIds: campaignIds, reportingTimezone: reportingTimezone) { (response, error) in
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
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **pinIds** | [**[String]**](String.md) | List of Pin IDs. | [optional] 
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | [optional] 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**[AdsAnalytics]**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsCreate**
```swift
    open class func adsCreate(adAccountId: String, adCreate: [AdCreate], completion: @escaping (_ data: AdBatchWriteResponseModel?, _ error: Error?) -> Void)
```

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adCreate = [AdCreate(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", collectionItemsDestinationUrlTemplate: "collectionItemsDestinationUrlTemplate_example", collectionsHeaderType: AdCollectionsHeaderType(), creativeType: CreativeType(), customizableCtaType: CustomizableCTAType(), destinationUrl: "destinationUrl_example", disclosureType: DisclosureType(), disclosureUrl: "disclosureUrl_example", gridClickType: GridClickType(), iosDeepLink: "iosDeepLink_example", isCarting: false, isCollageAcceptedTerms: false, isCollageSingleDestination: false, isPinDeleted: false, isRemovable: false, leadFormId: "leadFormId_example", name: "name_example", pinId: "pinId_example", quizPinData: QuizPinData(questions: [QuizPinQuestion(options: [QuizPinOption(id: 123, text: "text_example")], questionId: 123, questionText: "questionText_example")], results: [QuizPinResult(androidDeepLink: "androidDeepLink_example", destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", organicPinId: "organicPinId_example", resultId: 123)], tieBreakerCustomResult: nil, tieBreakerType: TieBreakerType()), status: EntityStatus(), trackingUrls: TrackingUrls(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]), viewTrackingUrl: "viewTrackingUrl_example")] // [AdCreate] | 

// Create ads
AdsAPI.adsCreate(adAccountId: adAccountId, adCreate: adCreate) { (response, error) in
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
 **adCreate** | [**[AdCreate]**](AdCreate.md) |  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsGet**
```swift
    open class func adsGet(adId: String, adAccountId: String, completion: @escaping (_ data: Ad?, _ error: Error?) -> Void)
```

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adId = "adId_example" // String | The ID of this ad.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get ad
AdsAPI.adsGet(adId: adId, adAccountId: adAccountId) { (response, error) in
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
 **adId** | **String** | The ID of this ad. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsList**
```swift
    open class func adsList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, campaignIds: [String]? = nil, adGroupIds: [String]? = nil, adIds: [String]? = nil, entityStatuses: [EntityStatus]? = nil, completion: @escaping (_ data: AdsList200Response?, _ error: Error?) -> Void)
```

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

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
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results. (optional)
let entityStatuses = [EntityStatus()] // [EntityStatus] | Entity status (optional)

// List ads
AdsAPI.adsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, campaignIds: campaignIds, adGroupIds: adGroupIds, adIds: adIds, entityStatuses: entityStatuses) { (response, error) in
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
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[EntityStatus]**](EntityStatus.md) | Entity status | [optional] 

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsUpdate**
```swift
    open class func adsUpdate(adAccountId: String, adBatchUpdate: [AdBatchUpdate], completion: @escaping (_ data: AdBatchWriteResponseModel?, _ error: Error?) -> Void)
```

Update ads

Update multiple existing ads

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adBatchUpdate = [AdBatchUpdate(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", collectionItemsDestinationUrlTemplate: "collectionItemsDestinationUrlTemplate_example", collectionsHeaderType: AdCollectionsHeaderType(), creativeType: CreativeType(), customizableCtaType: CustomizableCTAType(), destinationUrl: "destinationUrl_example", disclosureType: DisclosureType(), disclosureUrl: "disclosureUrl_example", gridClickType: GridClickType(), id: "id_example", iosDeepLink: "iosDeepLink_example", isCarting: false, isCollageAcceptedTerms: false, isCollageSingleDestination: false, isPinDeleted: false, isRemovable: false, leadFormId: "leadFormId_example", name: "name_example", pinId: "pinId_example", quizPinData: QuizPinData(questions: [QuizPinQuestion(options: [QuizPinOption(id: 123, text: "text_example")], questionId: 123, questionText: "questionText_example")], results: [QuizPinResult(androidDeepLink: "androidDeepLink_example", destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", organicPinId: "organicPinId_example", resultId: 123)], tieBreakerCustomResult: nil, tieBreakerType: TieBreakerType()), status: EntityStatus(), trackingUrls: TrackingUrls(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]), viewTrackingUrl: "viewTrackingUrl_example")] // [AdBatchUpdate] | 

// Update ads
AdsAPI.adsUpdate(adAccountId: adAccountId, adBatchUpdate: adBatchUpdate) { (response, error) in
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
 **adBatchUpdate** | [**[AdBatchUpdate]**](AdBatchUpdate.md) |  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignAdPreviewCreate**
```swift
    open class func campaignAdPreviewCreate(adAccountId: String, campaignAdPreviewCreate: [CampaignAdPreviewCreate], completion: @escaping (_ data: [CampaignAdPreviewCreate200ResponseInner]?, _ error: Error?) -> Void)
```

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignAdPreviewCreate = [CampaignAdPreviewCreate(adGroupId: "adGroupId_example")] // [CampaignAdPreviewCreate] | 

// Create ad preview records for one or more ad groups
AdsAPI.campaignAdPreviewCreate(adAccountId: adAccountId, campaignAdPreviewCreate: campaignAdPreviewCreate) { (response, error) in
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
 **campaignAdPreviewCreate** | [**[CampaignAdPreviewCreate]**](CampaignAdPreviewCreate.md) |  | 

### Return type

[**[CampaignAdPreviewCreate200ResponseInner]**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignAdPreviewDelete**
```swift
    open class func campaignAdPreviewDelete(adGroupIds: [String], adAccountId: String, completion: @escaping (_ data: [CampaignAdPreviewDelete200ResponseInner]?, _ error: Error?) -> Void)
```

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Delete ad preview records for one or more ad groups
AdsAPI.campaignAdPreviewDelete(adGroupIds: adGroupIds, adAccountId: adAccountId) { (response, error) in
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
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**[CampaignAdPreviewDelete200ResponseInner]**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignAdPreviewRead**
```swift
    open class func campaignAdPreviewRead(adGroupIds: [String], adAccountId: String, completion: @escaping (_ data: [CampaignAdPreview]?, _ error: Error?) -> Void)
```

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Fetch ad preview records for one or more ad groups
AdsAPI.campaignAdPreviewRead(adGroupIds: adGroupIds, adAccountId: adAccountId) { (response, error) in
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
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**[CampaignAdPreview]**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

