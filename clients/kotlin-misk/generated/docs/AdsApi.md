# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPreviewsCreate**](AdsApi.md#adPreviewsCreate) | **Post** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**adTargetingAnalyticsGet**](AdsApi.md#adTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**adsAnalytics**](AdsApi.md#adsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsCreate**](AdsApi.md#adsCreate) | **Post** /ad_accounts/{ad_account_id}/ads | Create ads
[**adsGet**](AdsApi.md#adsGet) | **Get** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**adsList**](AdsApi.md#adsList) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
[**adsUpdate**](AdsApi.md#adsUpdate) | **Patch** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaignAdPreviewCreate**](AdsApi.md#campaignAdPreviewCreate) | **Post** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaignAdPreviewDelete**](AdsApi.md#campaignAdPreviewDelete) | **Delete** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaignAdPreviewRead**](AdsApi.md#campaignAdPreviewRead) | **Get** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


<a name="adPreviewsCreate"></a>
# **adPreviewsCreate**
> AdPreviewURLResponse adPreviewsCreate(adAccountId, adPreviewRequest)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adPreviewRequest : AdPreviewRequest =  // AdPreviewRequest | 
try {
    val result : AdPreviewURLResponse = apiInstance.adPreviewsCreate(adAccountId, adPreviewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adPreviewsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adPreviewsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md)|  |

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adTargetingAnalyticsGet"></a>
# **adTargetingAnalyticsGet**
> MetricsResponse adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad Ids to use to filter the results.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val targetingTypes : kotlin.collections.List<AdsAnalyticsAdTargetingType> =  // kotlin.collections.List<AdsAnalyticsAdTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val clickWindowDays : ConversionAttributionWindowDays =  // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : ConversionAttributionWindowDays =  // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : ConversionAttributionWindowDays =  // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : ConversionReportTimeType =  // ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val attributionTypes : kotlin.collections.List<ConversionReportAttributionType> =  // kotlin.collections.List<ConversionReportAttributionType> | List of types of attribution for the conversion report
val reportingTimezone : ReportingTimeZone =  // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
val sortColumns : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Sort Columns.
val sortAscending : kotlin.Boolean = true // kotlin.Boolean | Sort ascending.
try {
    val result : MetricsResponse = apiInstance.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adTargetingAnalyticsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adTargetingAnalyticsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad Ids to use to filter the results. |
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **targetingTypes** | [**kotlin.collections.List&lt;AdsAnalyticsAdTargetingType&gt;**](AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |
 **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | [**ConversionReportTimeType**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **attributionTypes** | [**kotlin.collections.List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional]
 **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]
 **sortColumns** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Sort Columns. | [optional]
 **sortAscending** | **kotlin.Boolean**| Sort ascending. | [optional]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adsAnalytics"></a>
# **adsAnalytics**
> kotlin.collections.List&lt;AdsAnalytics&gt; adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)

Get ad analytics

    Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Pin IDs.
val adIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad Ids to use to filter the results.
val clickWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = conversionReportTime_example // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val reportingTimezone : ReportingTimeZone =  // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
try {
    val result : kotlin.collections.List<AdsAnalytics> = apiInstance.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adsAnalytics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **pinIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Pin IDs. | [optional]
 **adIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad Ids to use to filter the results. | [optional]
 **clickWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **campaignIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Campaign Ids to use to filter the results. | [optional]
 **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]

### Return type

[**kotlin.collections.List&lt;AdsAnalytics&gt;**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adsCreate"></a>
# **adsCreate**
> AdBatchWriteResponseModel adsCreate(adAccountId, adCreate)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adCreate : kotlin.collections.List<AdCreate> =  // kotlin.collections.List<AdCreate> | 
try {
    val result : AdBatchWriteResponseModel = apiInstance.adsCreate(adAccountId, adCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adCreate** | [**kotlin.collections.List&lt;AdCreate&gt;**](AdCreate.md)|  |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adsGet"></a>
# **adsGet**
> Ad adsGet(adId, adAccountId)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adId : kotlin.String = adId_example // kotlin.String | The ID of this ad.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Ad = apiInstance.adsGet(adId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adId** | **kotlin.String**| The ID of this ad. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adsList"></a>
# **adsList**
> AdsList200Response adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
val adIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad Ids to use to filter the results.
val entityStatuses : kotlin.collections.List<EntityStatus> =  // kotlin.collections.List<EntityStatus> | Entity status
try {
    val result : AdsList200Response = apiInstance.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **campaignIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Campaign Ids to use to filter the results. | [optional]
 **adGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional]
 **adIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad Ids to use to filter the results. | [optional]
 **entityStatuses** | [**kotlin.collections.List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional] [default to arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)]

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adsUpdate"></a>
# **adsUpdate**
> AdBatchWriteResponseModel adsUpdate(adAccountId, adBatchUpdate)

Update ads

Update multiple existing ads

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adBatchUpdate : kotlin.collections.List<AdBatchUpdate> =  // kotlin.collections.List<AdBatchUpdate> | 
try {
    val result : AdBatchWriteResponseModel = apiInstance.adsUpdate(adAccountId, adBatchUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#adsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#adsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adBatchUpdate** | [**kotlin.collections.List&lt;AdBatchUpdate&gt;**](AdBatchUpdate.md)|  |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="campaignAdPreviewCreate"></a>
# **campaignAdPreviewCreate**
> kotlin.collections.List&lt;CampaignAdPreviewCreate200ResponseInner&gt; campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignAdPreviewCreate : kotlin.collections.List<CampaignAdPreviewCreate> =  // kotlin.collections.List<CampaignAdPreviewCreate> | 
try {
    val result : kotlin.collections.List<CampaignAdPreviewCreate200ResponseInner> = apiInstance.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#campaignAdPreviewCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#campaignAdPreviewCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **campaignAdPreviewCreate** | [**kotlin.collections.List&lt;CampaignAdPreviewCreate&gt;**](CampaignAdPreviewCreate.md)|  |

### Return type

[**kotlin.collections.List&lt;CampaignAdPreviewCreate200ResponseInner&gt;**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="campaignAdPreviewDelete"></a>
# **campaignAdPreviewDelete**
> kotlin.collections.List&lt;CampaignAdPreviewDelete200ResponseInner&gt; campaignAdPreviewDelete(adGroupIds, adAccountId)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to use to filter the results.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<CampaignAdPreviewDelete200ResponseInner> = apiInstance.campaignAdPreviewDelete(adGroupIds, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#campaignAdPreviewDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#campaignAdPreviewDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad group Ids to use to filter the results. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**kotlin.collections.List&lt;CampaignAdPreviewDelete200ResponseInner&gt;**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="campaignAdPreviewRead"></a>
# **campaignAdPreviewRead**
> kotlin.collections.List&lt;CampaignAdPreview&gt; campaignAdPreviewRead(adGroupIds, adAccountId)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdsApi()
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to use to filter the results.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<CampaignAdPreview> = apiInstance.campaignAdPreviewRead(adGroupIds, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#campaignAdPreviewRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#campaignAdPreviewRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad group Ids to use to filter the results. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**kotlin.collections.List&lt;CampaignAdPreview&gt;**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

