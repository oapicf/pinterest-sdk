# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adGroupsAnalytics**](AdGroupsApi.md#adGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsAudienceSizing**](AdGroupsApi.md#adGroupsAudienceSizing) | **Post** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**adGroupsBidFloorGet**](AdGroupsApi.md#adGroupsBidFloorGet) | **Post** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**adGroupsCreate**](AdGroupsApi.md#adGroupsCreate) | **Post** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**adGroupsDynamicTitlesDownloadCsv**](AdGroupsApi.md#adGroupsDynamicTitlesDownloadCsv) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**adGroupsDynamicTitlesGetStatus**](AdGroupsApi.md#adGroupsDynamicTitlesGetStatus) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**adGroupsDynamicTitlesGetUploadUrl**](AdGroupsApi.md#adGroupsDynamicTitlesGetUploadUrl) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**adGroupsDynamicTitlesProcessCsv**](AdGroupsApi.md#adGroupsDynamicTitlesProcessCsv) | **Post** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**adGroupsGet**](AdGroupsApi.md#adGroupsGet) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**adGroupsList**](AdGroupsApi.md#adGroupsList) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adGroupsTargetingAnalyticsGet**](AdGroupsApi.md#adGroupsTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**adGroupsUpdate**](AdGroupsApi.md#adGroupsUpdate) | **Patch** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**getAdGroupsByPromotionIdsList**](AdGroupsApi.md#getAdGroupsByPromotionIdsList) | **Get** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


<a name="adGroupsAnalytics"></a>
# **adGroupsAnalytics**
> kotlin.collections.List&lt;AdGroupsAnalyticsMetrics&gt; adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

Get ad group analytics

Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to use to filter the results.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val clickWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = conversionReportTime_example // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val aggregateReportRows : kotlin.Boolean = true // kotlin.Boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
val reportingTimezone : ReportingTimeZone =  // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
try {
    val result : kotlin.collections.List<AdGroupsAnalyticsMetrics> = apiInstance.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsAnalytics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **adGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad group Ids to use to filter the results. |
 **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **clickWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **aggregateReportRows** | **kotlin.Boolean**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
 **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]

### Return type

[**kotlin.collections.List&lt;AdGroupsAnalyticsMetrics&gt;**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adGroupsAudienceSizing"></a>
# **adGroupsAudienceSizing**
> AdGroupAudienceSizing adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupAudienceSizingCreate : AdGroupAudienceSizingCreate =  // AdGroupAudienceSizingCreate | 
try {
    val result : AdGroupAudienceSizing = apiInstance.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsAudienceSizing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsAudienceSizing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupAudienceSizingCreate** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md)|  |

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adGroupsBidFloorGet"></a>
# **adGroupsBidFloorGet**
> BidFloor adGroupsBidFloorGet(adAccountId, bidFloorCreate)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bidFloorCreate : BidFloorCreate =  // BidFloorCreate | 
try {
    val result : BidFloor = apiInstance.adGroupsBidFloorGet(adAccountId, bidFloorCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsBidFloorGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsBidFloorGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bidFloorCreate** | [**BidFloorCreate**](BidFloorCreate.md)|  |

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adGroupsCreate"></a>
# **adGroupsCreate**
> AdGroupsCreate200Response adGroupsCreate(adAccountId, adGroupCreateCreate)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupCreateCreate : kotlin.collections.List<AdGroupCreateCreate> =  // kotlin.collections.List<AdGroupCreateCreate> | 
try {
    val result : AdGroupsCreate200Response = apiInstance.adGroupsCreate(adAccountId, adGroupCreateCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupCreateCreate** | [**kotlin.collections.List&lt;AdGroupCreateCreate&gt;**](AdGroupCreateCreate.md)|  |

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adGroupsDynamicTitlesDownloadCsv"></a>
# **adGroupsDynamicTitlesDownloadCsv**
> DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupId : kotlin.String = adGroupId_example // kotlin.String | Ad group ID.
try {
    val result : DynamicTitlesDownloadCSV = apiInstance.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsDynamicTitlesDownloadCsv")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsDynamicTitlesDownloadCsv")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupId** | **kotlin.String**| Ad group ID. |

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adGroupsDynamicTitlesGetStatus"></a>
# **adGroupsDynamicTitlesGetStatus**
> DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupId : kotlin.String = adGroupId_example // kotlin.String | Ad group ID.
try {
    val result : DynamicTitlesGetStatus = apiInstance.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsDynamicTitlesGetStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsDynamicTitlesGetStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupId** | **kotlin.String**| Ad group ID. |

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adGroupsDynamicTitlesGetUploadUrl"></a>
# **adGroupsDynamicTitlesGetUploadUrl**
> DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupId : kotlin.String = adGroupId_example // kotlin.String | Ad group ID.
try {
    val result : DynamicTitlesUploadURL = apiInstance.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsDynamicTitlesGetUploadUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsDynamicTitlesGetUploadUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupId** | **kotlin.String**| Ad group ID. |

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adGroupsDynamicTitlesProcessCsv"></a>
# **adGroupsDynamicTitlesProcessCsv**
> DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupId : kotlin.String = adGroupId_example // kotlin.String | Ad group ID.
val dynamicTitlesProcessCSVCreate : DynamicTitlesProcessCSVCreate =  // DynamicTitlesProcessCSVCreate | 
try {
    val result : DynamicTitlesProcessCSV = apiInstance.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsDynamicTitlesProcessCsv")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsDynamicTitlesProcessCsv")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupId** | **kotlin.String**| Ad group ID. |
 **dynamicTitlesProcessCSVCreate** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md)|  |

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adGroupsGet"></a>
# **adGroupsGet**
> AdGroup adGroupsGet(adGroupId, adAccountId)

Get ad group

Get a specific ad group given the ad group ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adGroupId : kotlin.String = adGroupId_example // kotlin.String | Ad group ID.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AdGroup = apiInstance.adGroupsGet(adGroupId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupId** | **kotlin.String**| Ad group ID. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**AdGroup**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adGroupsList"></a>
# **adGroupsList**
> AdGroupsList200Response adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
val entityStatuses : kotlin.collections.List<EntityStatus> =  // kotlin.collections.List<EntityStatus> | Entity status
val translateInterestsToNames : kotlin.Boolean = true // kotlin.Boolean | Return interests as text names (if value is true) rather than topic IDs.
try {
    val result : AdGroupsList200Response = apiInstance.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsList")
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
 **entityStatuses** | [**kotlin.collections.List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional] [default to arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)]
 **translateInterestsToNames** | **kotlin.Boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adGroupsTargetingAnalyticsGet"></a>
# **adGroupsTargetingAnalyticsGet**
> MetricsResponse adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to use to filter the results.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val targetingTypes : kotlin.collections.List<AdsAnalyticsAdGroupTargetingType> =  // kotlin.collections.List<AdsAnalyticsAdGroupTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val clickWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = conversionReportTime_example // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val attributionTypes : kotlin.collections.List<ConversionReportAttributionType> =  // kotlin.collections.List<ConversionReportAttributionType> | List of types of attribution for the conversion report
val reportingTimezone : ReportingTimeZone =  // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
val sortColumns : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Sort Columns.
val sortAscending : kotlin.Boolean = true // kotlin.Boolean | Sort ascending.
try {
    val result : MetricsResponse = apiInstance.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsTargetingAnalyticsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsTargetingAnalyticsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad group Ids to use to filter the results. |
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **targetingTypes** | [**kotlin.collections.List&lt;AdsAnalyticsAdGroupTargetingType&gt;**](AdsAnalyticsAdGroupTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. |
 **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
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

<a name="adGroupsUpdate"></a>
# **adGroupsUpdate**
> AdGroupsCreate200Response adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)

Update ad groups

Update multiple existing ad groups.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adGroupUpdateBatchUpdate : kotlin.collections.List<AdGroupUpdateBatchUpdate> =  // kotlin.collections.List<AdGroupUpdateBatchUpdate> | 
try {
    val result : AdGroupsCreate200Response = apiInstance.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#adGroupsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#adGroupsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adGroupUpdateBatchUpdate** | [**kotlin.collections.List&lt;AdGroupUpdateBatchUpdate&gt;**](AdGroupUpdateBatchUpdate.md)|  |

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="getAdGroupsByPromotionIdsList"></a>
# **getAdGroupsByPromotionIdsList**
> AdGroupsList200Response getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AdGroupsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Promotion IDs to use to filter the results.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    val result : AdGroupsList200Response = apiInstance.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdGroupsApi#getAdGroupsByPromotionIdsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdGroupsApi#getAdGroupsByPromotionIdsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **promotionIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Promotion IDs to use to filter the results. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

