# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPreviewsCreate**](AdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**adTargetingAnalyticsGet**](AdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**adsAnalytics**](AdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsCreate**](AdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**adsGet**](AdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**adsList**](AdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**adsUpdate**](AdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads


<a id="adPreviewsCreate"></a>
# **adPreviewsCreate**
> AdPreviewURLResponse adPreviewsCreate(adAccountId, adPreviewRequest)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adPreviewRequest : AdPreviewRequest =  // AdPreviewRequest | Create ad preview with pin or image.
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
 **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md)| Create ad preview with pin or image. |

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adTargetingAnalyticsGet"></a>
# **adTargetingAnalyticsGet**
> MetricsResponse adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad Ids to use to filter the results.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val targetingTypes : kotlin.collections.List<AdsAnalyticsTargetingType> =  // kotlin.collections.List<AdsAnalyticsTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
val columns : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
val granularity : Granularity = DAY // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
val clickWindowDays : kotlin.Int = 1 // kotlin.Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : kotlin.Int = 56 // kotlin.Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val viewWindowDays : kotlin.Int = 56 // kotlin.Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = TIME_OF_AD_ACTION // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val attributionTypes : ConversionReportAttributionType =  // ConversionReportAttributionType | List of types of attribution for the conversion report
try {
    val result : MetricsResponse = apiInstance.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
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
 **targetingTypes** | [**kotlin.collections.List&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. |
 **columns** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE]
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | **kotlin.Int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **kotlin.Int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **kotlin.Int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **attributionTypes** | [**ConversionReportAttributionType**](.md)| List of types of attribution for the conversion report | [optional] [enum: INDIVIDUAL, HOUSEHOLD]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adsAnalytics"></a>
# **adsAnalytics**
> kotlin.collections.List&lt;AdsAnalyticsResponseInner&gt; adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

Get ad analytics

Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val adIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad Ids to use to filter the results.
val columns : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
val granularity : Granularity = DAY // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
val clickWindowDays : kotlin.Int = 1 // kotlin.Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : kotlin.Int = 56 // kotlin.Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val viewWindowDays : kotlin.Int = 56 // kotlin.Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = TIME_OF_AD_ACTION // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
try {
    val result : kotlin.collections.List<AdsAnalyticsResponseInner> = apiInstance.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **adIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad Ids to use to filter the results. |
 **columns** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE]
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | **kotlin.Int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **kotlin.Int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **kotlin.Int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]

### Return type

[**kotlin.collections.List&lt;AdsAnalyticsResponseInner&gt;**](AdsAnalyticsResponseInner.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adsCreate"></a>
# **adsCreate**
> AdArrayResponse adsCreate(adAccountId, adCreateRequest)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adCreateRequest : kotlin.collections.List<AdCreateRequest> =  // kotlin.collections.List<AdCreateRequest> | List of ads to create, size limit [1, 30].
try {
    val result : AdArrayResponse = apiInstance.adsCreate(adAccountId, adCreateRequest)
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
 **adCreateRequest** | [**kotlin.collections.List&lt;AdCreateRequest&gt;**](AdCreateRequest.md)| List of ads to create, size limit [1, 30]. |

### Return type

[**AdArrayResponse**](AdArrayResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adsGet"></a>
# **adsGet**
> AdResponse adsGet(adAccountId, adId)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adId : kotlin.String = adId_example // kotlin.String | Unique identifier of an ad.
try {
    val result : AdResponse = apiInstance.adsGet(adAccountId, adId)
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
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adId** | **kotlin.String**| Unique identifier of an ad. |

### Return type

[**AdResponse**](AdResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adsList"></a>
# **adsList**
> AdsList200Response adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)

List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val adGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad group Ids to use to filter the results.
val adIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Ad Ids to use to filter the results.
val entityStatuses : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Entity status
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : AdsList200Response = apiInstance.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)
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
 **campaignIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Campaign Ids to use to filter the results. | [optional]
 **adGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad group Ids to use to filter the results. | [optional]
 **adIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Ad Ids to use to filter the results. | [optional]
 **entityStatuses** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Entity status | [optional] [default to arrayListOf(EntityStatuses.ACTIVE,EntityStatuses.PAUSED)] [enum: ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adsUpdate"></a>
# **adsUpdate**
> AdArrayResponse adsUpdate(adAccountId, adUpdateRequest)

Update ads

Update multiple existing ads

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adUpdateRequest : kotlin.collections.List<AdUpdateRequest> =  // kotlin.collections.List<AdUpdateRequest> | List of ads to update, size limit [1, 30]
try {
    val result : AdArrayResponse = apiInstance.adsUpdate(adAccountId, adUpdateRequest)
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
 **adUpdateRequest** | [**kotlin.collections.List&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md)| List of ads to update, size limit [1, 30] |

### Return type

[**AdArrayResponse**](AdArrayResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

