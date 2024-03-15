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


# **adPreviewsCreate**
```swift
    open class func adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest, completion: @escaping (_ data: AdPreviewURLResponse?, _ error: Error?) -> Void)
```

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adPreviewRequest = AdPreviewRequest(imageUrl: "imageUrl_example", title: "title_example", pinId: "pinId_example") // AdPreviewRequest | Create ad preview with pin or image.

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
 **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md) | Create ad preview with pin or image. | 

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
    open class func adTargetingAnalyticsGet(adAccountId: String, adIds: [String], startDate: Date, endDate: Date, targetingTypes: [AdsAnalyticsTargetingType], columns: [Columns_adTargetingAnalyticsGet], granularity: Granularity, clickWindowDays: ClickWindowDays_adTargetingAnalyticsGet? = nil, engagementWindowDays: EngagementWindowDays_adTargetingAnalyticsGet? = nil, viewWindowDays: ViewWindowDays_adTargetingAnalyticsGet? = nil, conversionReportTime: ConversionReportTime_adTargetingAnalyticsGet? = nil, attributionTypes: ConversionReportAttributionType? = nil, completion: @escaping (_ data: MetricsResponse?, _ error: Error?) -> Void)
```

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results.
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

// Get targeting analytics for ads
AdsAPI.adTargetingAnalyticsGet(adAccountId: adAccountId, adIds: adIds, startDate: startDate, endDate: endDate, targetingTypes: targetingTypes, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes) { (response, error) in
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

# **adsAnalytics**
```swift
    open class func adsAnalytics(adAccountId: String, startDate: Date, endDate: Date, adIds: [String], columns: [Columns_adsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_adsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adsAnalytics? = nil, viewWindowDays: ViewWindowDays_adsAnalytics? = nil, conversionReportTime: ConversionReportTime_adsAnalytics? = nil, completion: @escaping (_ data: [AdsAnalyticsResponseInner]?, _ error: Error?) -> Void)
```

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get ad analytics
AdsAPI.adsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, adIds: adIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[AdsAnalyticsResponseInner]**](AdsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsCreate**
```swift
    open class func adsCreate(adAccountId: String, adCreateRequest: [AdCreateRequest], completion: @escaping (_ data: AdArrayResponse?, _ error: Error?) -> Void)
```

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adCreateRequest = [AdCreateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: CreativeType(), destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", isPinDeleted: false, isRemovable: false, name: "name_example", status: EntityStatus(), trackingUrls: AdCommon_tracking_urls(impression: ["impression_example"], click: ["click_example"], engagement: ["engagement_example"], buyableButton: ["buyableButton_example"], audienceVerification: ["audienceVerification_example"]), viewTrackingUrl: "viewTrackingUrl_example", leadFormId: "leadFormId_example", gridClickType: GridClickType(), customizableCtaType: "customizableCtaType_example", quizPinData: AdCommon_quiz_pin_data(questions: [QuizPinQuestion(questionId: 123, questionText: "questionText_example", options: [QuizPinOption(id: 123, text: "text_example")])], results: [QuizPinResult(organicPinId: "organicPinId_example", androidDeepLink: "androidDeepLink_example", iosDeepLink: "iosDeepLink_example", destinationUrl: "destinationUrl_example", resultId: 123)]), pinId: "pinId_example")] // [AdCreateRequest] | List of ads to create, size limit [1, 30].

// Create ads
AdsAPI.adsCreate(adAccountId: adAccountId, adCreateRequest: adCreateRequest) { (response, error) in
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
 **adCreateRequest** | [**[AdCreateRequest]**](AdCreateRequest.md) | List of ads to create, size limit [1, 30]. | 

### Return type

[**AdArrayResponse**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsGet**
```swift
    open class func adsGet(adAccountId: String, adId: String, completion: @escaping (_ data: AdResponse?, _ error: Error?) -> Void)
```

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adId = "adId_example" // String | Unique identifier of an ad.

// Get ad
AdsAPI.adsGet(adAccountId: adAccountId, adId: adId) { (response, error) in
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
 **adId** | **String** | Unique identifier of an ad. | 

### Return type

[**AdResponse**](AdResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsList**
```swift
    open class func adsList(adAccountId: String, campaignIds: [String]? = nil, adGroupIds: [String]? = nil, adIds: [String]? = nil, entityStatuses: [EntityStatuses_adsList]? = nil, pageSize: Int? = nil, order: Order_adsList? = nil, bookmark: String? = nil, completion: @escaping (_ data: AdsList200Response?, _ error: Error?) -> Void)
```

List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results. (optional)
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Entity status (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List ads
AdsAPI.adsList(adAccountId: adAccountId, campaignIds: campaignIds, adGroupIds: adGroupIds, adIds: adIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Entity status | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsUpdate**
```swift
    open class func adsUpdate(adAccountId: String, adUpdateRequest: [AdUpdateRequest], completion: @escaping (_ data: AdArrayResponse?, _ error: Error?) -> Void)
```

Update ads

Update multiple existing ads

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adUpdateRequest = [AdUpdateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: CreativeType(), destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", isPinDeleted: false, isRemovable: false, name: "name_example", status: EntityStatus(), trackingUrls: AdCommon_tracking_urls(impression: ["impression_example"], click: ["click_example"], engagement: ["engagement_example"], buyableButton: ["buyableButton_example"], audienceVerification: ["audienceVerification_example"]), viewTrackingUrl: "viewTrackingUrl_example", leadFormId: "leadFormId_example", gridClickType: GridClickType(), customizableCtaType: "customizableCtaType_example", quizPinData: AdCommon_quiz_pin_data(questions: [QuizPinQuestion(questionId: 123, questionText: "questionText_example", options: [QuizPinOption(id: 123, text: "text_example")])], results: [QuizPinResult(organicPinId: "organicPinId_example", androidDeepLink: "androidDeepLink_example", iosDeepLink: "iosDeepLink_example", destinationUrl: "destinationUrl_example", resultId: 123)]), id: "id_example", pinId: "pinId_example")] // [AdUpdateRequest] | List of ads to update, size limit [1, 30]

// Update ads
AdsAPI.adsUpdate(adAccountId: adAccountId, adUpdateRequest: adUpdateRequest) { (response, error) in
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
 **adUpdateRequest** | [**[AdUpdateRequest]**](AdUpdateRequest.md) | List of ads to update, size limit [1, 30] | 

### Return type

[**AdArrayResponse**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

