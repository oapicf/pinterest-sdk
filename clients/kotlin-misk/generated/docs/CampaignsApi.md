# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPinsAnalytics**](CampaignsApi.md#adPinsAnalytics) | **Get** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaignTargetingAnalyticsGet**](CampaignsApi.md#campaignTargetingAnalyticsGet) | **Get** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaignsAnalytics**](CampaignsApi.md#campaignsAnalytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsCreate**](CampaignsApi.md#campaignsCreate) | **Post** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaignsGet**](CampaignsApi.md#campaignsGet) | **Get** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaignsList**](CampaignsApi.md#campaignsList) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaignsUpdate**](CampaignsApi.md#campaignsUpdate) | **Patch** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**getCampaignDeliveryEstimates**](CampaignsApi.md#getCampaignDeliveryEstimates) | **Post** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates


<a name="adPinsAnalytics"></a>
# **adPinsAnalytics**
> kotlin.collections.List&lt;AdPinAnalytics&gt; adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val campaignId : kotlin.String = campaignId_example // kotlin.String | Campaign Id to use to filter the results.
val pinIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Pin IDs.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val clickWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = conversionReportTime_example // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
try {
    val result : kotlin.collections.List<AdPinAnalytics> = apiInstance.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#adPinsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#adPinsAnalytics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **kotlin.String**| Campaign Id to use to filter the results. |
 **pinIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Pin IDs. |
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **clickWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]

### Return type

[**kotlin.collections.List&lt;AdPinAnalytics&gt;**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="campaignTargetingAnalyticsGet"></a>
# **campaignTargetingAnalyticsGet**
> MetricsResponse campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val targetingTypes : kotlin.collections.List<AdsAnalyticsCampaignTargetingType> =  // kotlin.collections.List<AdsAnalyticsCampaignTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val clickWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = conversionReportTime_example // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val attributionTypes : kotlin.collections.List<ConversionReportAttributionType> =  // kotlin.collections.List<ConversionReportAttributionType> | List of types of attribution for the conversion report
val reportingTimezone : ReportingTimeZone =  // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
try {
    val result : MetricsResponse = apiInstance.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#campaignTargetingAnalyticsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#campaignTargetingAnalyticsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **campaignIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Campaign Ids to use to filter the results. |
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **targetingTypes** | [**kotlin.collections.List&lt;AdsAnalyticsCampaignTargetingType&gt;**](AdsAnalyticsCampaignTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |
 **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **attributionTypes** | [**kotlin.collections.List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional]
 **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="campaignsAnalytics"></a>
# **campaignsAnalytics**
> kotlin.collections.List&lt;CampaignsAnalyticsMetrics&gt; campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

Get campaign analytics

Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
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
    val result : kotlin.collections.List<CampaignsAnalyticsMetrics> = apiInstance.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#campaignsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#campaignsAnalytics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **campaignIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Campaign Ids to use to filter the results. |
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

[**kotlin.collections.List&lt;CampaignsAnalyticsMetrics&gt;**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="campaignsCreate"></a>
# **campaignsCreate**
> CampaignBatchWriteResponseModel campaignsCreate(adAccountId, campaignCreateItem)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignCreateItem : kotlin.collections.List<CampaignCreateItem> =  // kotlin.collections.List<CampaignCreateItem> | 
try {
    val result : CampaignBatchWriteResponseModel = apiInstance.campaignsCreate(adAccountId, campaignCreateItem)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#campaignsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#campaignsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **campaignCreateItem** | [**kotlin.collections.List&lt;CampaignCreateItem&gt;**](CampaignCreateItem.md)|  |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="campaignsGet"></a>
# **campaignsGet**
> Campaign campaignsGet(campaignId, adAccountId)

Get campaign

Get a specific campaign given the campaign ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val campaignId : kotlin.String = campaignId_example // kotlin.String | Campaign ID, must be associated with the ad account ID provided in the path.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Campaign = apiInstance.campaignsGet(campaignId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#campaignsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#campaignsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **kotlin.String**| Campaign ID, must be associated with the ad account ID provided in the path. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="campaignsList"></a>
# **campaignsList**
> CampaignsList200Response campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)

List campaigns

Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val entityStatuses : kotlin.collections.List<EntityStatus> =  // kotlin.collections.List<EntityStatus> | Entity status
try {
    val result : CampaignsList200Response = apiInstance.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#campaignsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#campaignsList")
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
 **entityStatuses** | [**kotlin.collections.List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional] [default to arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)]

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="campaignsUpdate"></a>
# **campaignsUpdate**
> CampaignBatchWriteResponseModel campaignsUpdate(adAccountId, campaignBatchUpdateItem)

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignBatchUpdateItem : kotlin.collections.List<CampaignBatchUpdateItem> =  // kotlin.collections.List<CampaignBatchUpdateItem> | 
try {
    val result : CampaignBatchWriteResponseModel = apiInstance.campaignsUpdate(adAccountId, campaignBatchUpdateItem)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#campaignsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#campaignsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **campaignBatchUpdateItem** | [**kotlin.collections.List&lt;CampaignBatchUpdateItem&gt;**](CampaignBatchUpdateItem.md)|  |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="getCampaignDeliveryEstimates"></a>
# **getCampaignDeliveryEstimates**
> CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CampaignsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignDeliveryEstimatesCampaign : kotlin.collections.List<CampaignDeliveryEstimatesCampaign> =  // kotlin.collections.List<CampaignDeliveryEstimatesCampaign> | 
try {
    val result : CampaignDeliveryEstimatesResponse = apiInstance.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignDeliveryEstimates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignDeliveryEstimates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **campaignDeliveryEstimatesCampaign** | [**kotlin.collections.List&lt;CampaignDeliveryEstimatesCampaign&gt;**](CampaignDeliveryEstimatesCampaign.md)|  |

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

