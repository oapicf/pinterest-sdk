# .AdsApi

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


# **adPreviewsCreate**
> AdPreviewURLResponse adPreviewsCreate(adPreviewRequest)

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdPreviewsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdPreviewsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Create ad preview with pin or image.
  adPreviewRequest: null,
};

const data = await apiInstance.adPreviewsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adPreviewRequest** | **AdPreviewRequest**| Create ad preview with pin or image. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdPreviewURLResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful ad preview creation. |  -  |
**400** | Invalid Pin parameters response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adTargetingAnalyticsGet**
> MetricsResponse adTargetingAnalyticsGet()

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdTargetingAnalyticsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdTargetingAnalyticsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of Ad Ids to use to filter the results.
  adIds: [
    "4",
  ],
    // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  targetingTypes: [
    "APPTYPE",
  ],
    // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.<br/>For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  columns: [
    "TOTAL_CONVERSIONS",
  ],
    // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  granularity: "DAY",
    // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  clickWindowDays: 1,
    // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  engagementWindowDays: 30,
    // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
  viewWindowDays: 1,
    // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
  conversionReportTime: "TIME_OF_AD_ACTION",
    // List of types of attribution for the conversion report (optional)
  attributionTypes: "INDIVIDUAL",
};

const data = await apiInstance.adTargetingAnalyticsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **adIds** | **Array&lt;string&gt;** | List of Ad Ids to use to filter the results. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **targetingTypes** | **Array&lt;AdsAnalyticsAdTargetingType&gt;** | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | defaults to undefined
 **columns** | **Array<&#39;SPEND_IN_MICRO_DOLLAR&#39; &#124; &#39;PAID_IMPRESSION&#39; &#124; &#39;SPEND_IN_DOLLAR&#39; &#124; &#39;CPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_DOLLAR&#39; &#124; &#39;CTR&#39; &#124; &#39;ECTR&#39; &#124; &#39;CAMPAIGN_NAME&#39; &#124; &#39;PIN_ID&#39; &#124; &#39;TOTAL_ENGAGEMENT&#39; &#124; &#39;ENGAGEMENT_1&#39; &#124; &#39;ENGAGEMENT_2&#39; &#124; &#39;ECPE_IN_DOLLAR&#39; &#124; &#39;ENGAGEMENT_RATE&#39; &#124; &#39;EENGAGEMENT_RATE&#39; &#124; &#39;ECPM_IN_MICRO_DOLLAR&#39; &#124; &#39;REPIN_RATE&#39; &#124; &#39;CTR_2&#39; &#124; &#39;CAMPAIGN_ID&#39; &#124; &#39;ADVERTISER_ID&#39; &#124; &#39;AD_ACCOUNT_ID&#39; &#124; &#39;PIN_PROMOTION_ID&#39; &#124; &#39;AD_ID&#39; &#124; &#39;AD_GROUP_ID&#39; &#124; &#39;CAMPAIGN_ENTITY_STATUS&#39; &#124; &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; &#124; &#39;CPM_IN_MICRO_DOLLAR&#39; &#124; &#39;CPM_IN_DOLLAR&#39; &#124; &#39;AD_GROUP_ENTITY_STATUS&#39; &#124; &#39;ORDER_LINE_ID&#39; &#124; &#39;ORDER_LINE_NAME&#39; &#124; &#39;CLICKTHROUGH_1&#39; &#124; &#39;REPIN_1&#39; &#124; &#39;IMPRESSION_1&#39; &#124; &#39;IMPRESSION_1_GROSS&#39; &#124; &#39;CLICKTHROUGH_1_GROSS&#39; &#124; &#39;OUTBOUND_CLICK_1&#39; &#124; &#39;CLICKTHROUGH_2&#39; &#124; &#39;REPIN_2&#39; &#124; &#39;IMPRESSION_2&#39; &#124; &#39;OUTBOUND_CLICK_2&#39; &#124; &#39;TOTAL_CLICKTHROUGH&#39; &#124; &#39;TOTAL_IMPRESSION&#39; &#124; &#39;TOTAL_IMPRESSION_USER&#39; &#124; &#39;TOTAL_IMPRESSION_FREQUENCY&#39; &#124; &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_ENGAGEMENT_LEAD&#39; &#124; &#39;TOTAL_CLICK_SIGNUP&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_CLICK_ADD_TO_CART&#39; &#124; &#39;TOTAL_CLICK_LEAD&#39; &#124; &#39;TOTAL_VIEW_SIGNUP&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_VIEW_ADD_TO_CART&#39; &#124; &#39;TOTAL_VIEW_LEAD&#39; &#124; &#39;TOTAL_CONVERSIONS&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_SESSIONS&#39; &#124; &#39;WEB_SESSIONS_1&#39; &#124; &#39;WEB_SESSIONS_2&#39; &#124; &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; &#124; &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; &#124; &#39;TOTAL_PAGE_VISIT&#39; &#124; &#39;TOTAL_SIGNUP&#39; &#124; &#39;TOTAL_CHECKOUT&#39; &#124; &#39;TOTAL_CUSTOM&#39; &#124; &#39;TOTAL_LEAD&#39; &#124; &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;PAGE_VISIT_COST_PER_ACTION&#39; &#124; &#39;PAGE_VISIT_ROAS&#39; &#124; &#39;CHECKOUT_ROAS&#39; &#124; &#39;CUSTOM_ROAS&#39; &#124; &#39;VIDEO_MRC_VIEWS_1&#39; &#124; &#39;VIDEO_3SEC_VIEWS_2&#39; &#124; &#39;VIDEO_P100_COMPLETE_2&#39; &#124; &#39;VIDEO_P0_COMBINED_2&#39; &#124; &#39;VIDEO_P25_COMBINED_2&#39; &#124; &#39;VIDEO_P50_COMBINED_2&#39; &#124; &#39;VIDEO_P75_COMBINED_2&#39; &#124; &#39;VIDEO_P95_COMBINED_2&#39; &#124; &#39;VIDEO_MRC_VIEWS_2&#39; &#124; &#39;PAID_VIDEO_VIEWABLE_RATE&#39; &#124; &#39;VIDEO_LENGTH&#39; &#124; &#39;ECPV_IN_DOLLAR&#39; &#124; &#39;ECPCV_IN_DOLLAR&#39; &#124; &#39;ECPCV_P95_IN_DOLLAR&#39; &#124; &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_P100_COMPLETE&#39; &#124; &#39;TOTAL_VIDEO_P0_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P25_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P50_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P75_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P95_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_MRC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; &#124; &#39;TOTAL_REPIN_RATE&#39; &#124; &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;WEB_CHECKOUT_ROAS&#39; &#124; &#39;TOTAL_WEB_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;TOTAL_OFFLINE_CHECKOUT&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; &#124; &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; &#124; &#39;LEADS&#39; &#124; &#39;COST_PER_LEAD&#39; &#124; &#39;QUIZ_COMPLETED&#39; &#124; &#39;QUIZ_PIN_RESULT_OPEN&#39; &#124; &#39;QUIZ_COMPLETION_RATE&#39; &#124; &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPAGE_REPIN&#39; &#124; &#39;SHOWCASE_SUBPIN_REPIN&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; &#124; &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; &#124; &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; &#124; &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; &#124; &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_LEAD_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; &#124; &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; &#124; &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; &#124; &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;>** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | defaults to undefined
 **granularity** | **Granularity** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | defaults to undefined
 **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30
 **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30
 **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1
 **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'
 **attributionTypes** | **ConversionReportAttributionType** | List of types of attribution for the conversion report | (optional) defaults to undefined


### Return type

**MetricsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adsAnalytics**
> Array<AdsAnalyticsResponseInner> adsAnalytics()

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdsAnalyticsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdsAnalyticsRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.<br/>For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  columns: [
    "TOTAL_CONVERSIONS",
  ],
    // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  granularity: "DAY",
    // List of Ad Ids to use to filter the results. (optional)
  adIds: [
    "4",
  ],
    // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  clickWindowDays: 1,
    // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  engagementWindowDays: 30,
    // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
  viewWindowDays: 1,
    // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
  conversionReportTime: "TIME_OF_AD_ACTION",
    // List of Pin IDs. (optional)
  pinIds: [
    "4",
  ],
    // List of Campaign Ids to use to filter the results. (optional)
  campaignIds: [
    "4",
  ],
};

const data = await apiInstance.adsAnalytics(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **columns** | **Array<&#39;SPEND_IN_MICRO_DOLLAR&#39; &#124; &#39;PAID_IMPRESSION&#39; &#124; &#39;SPEND_IN_DOLLAR&#39; &#124; &#39;CPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_DOLLAR&#39; &#124; &#39;CTR&#39; &#124; &#39;ECTR&#39; &#124; &#39;CAMPAIGN_NAME&#39; &#124; &#39;PIN_ID&#39; &#124; &#39;TOTAL_ENGAGEMENT&#39; &#124; &#39;ENGAGEMENT_1&#39; &#124; &#39;ENGAGEMENT_2&#39; &#124; &#39;ECPE_IN_DOLLAR&#39; &#124; &#39;ENGAGEMENT_RATE&#39; &#124; &#39;EENGAGEMENT_RATE&#39; &#124; &#39;ECPM_IN_MICRO_DOLLAR&#39; &#124; &#39;REPIN_RATE&#39; &#124; &#39;CTR_2&#39; &#124; &#39;CAMPAIGN_ID&#39; &#124; &#39;ADVERTISER_ID&#39; &#124; &#39;AD_ACCOUNT_ID&#39; &#124; &#39;PIN_PROMOTION_ID&#39; &#124; &#39;AD_ID&#39; &#124; &#39;AD_GROUP_ID&#39; &#124; &#39;CAMPAIGN_ENTITY_STATUS&#39; &#124; &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; &#124; &#39;CPM_IN_MICRO_DOLLAR&#39; &#124; &#39;CPM_IN_DOLLAR&#39; &#124; &#39;AD_GROUP_ENTITY_STATUS&#39; &#124; &#39;ORDER_LINE_ID&#39; &#124; &#39;ORDER_LINE_NAME&#39; &#124; &#39;CLICKTHROUGH_1&#39; &#124; &#39;REPIN_1&#39; &#124; &#39;IMPRESSION_1&#39; &#124; &#39;IMPRESSION_1_GROSS&#39; &#124; &#39;CLICKTHROUGH_1_GROSS&#39; &#124; &#39;OUTBOUND_CLICK_1&#39; &#124; &#39;CLICKTHROUGH_2&#39; &#124; &#39;REPIN_2&#39; &#124; &#39;IMPRESSION_2&#39; &#124; &#39;OUTBOUND_CLICK_2&#39; &#124; &#39;TOTAL_CLICKTHROUGH&#39; &#124; &#39;TOTAL_IMPRESSION&#39; &#124; &#39;TOTAL_IMPRESSION_USER&#39; &#124; &#39;TOTAL_IMPRESSION_FREQUENCY&#39; &#124; &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_ENGAGEMENT_LEAD&#39; &#124; &#39;TOTAL_CLICK_SIGNUP&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_CLICK_ADD_TO_CART&#39; &#124; &#39;TOTAL_CLICK_LEAD&#39; &#124; &#39;TOTAL_VIEW_SIGNUP&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_VIEW_ADD_TO_CART&#39; &#124; &#39;TOTAL_VIEW_LEAD&#39; &#124; &#39;TOTAL_CONVERSIONS&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_SESSIONS&#39; &#124; &#39;WEB_SESSIONS_1&#39; &#124; &#39;WEB_SESSIONS_2&#39; &#124; &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; &#124; &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; &#124; &#39;TOTAL_PAGE_VISIT&#39; &#124; &#39;TOTAL_SIGNUP&#39; &#124; &#39;TOTAL_CHECKOUT&#39; &#124; &#39;TOTAL_CUSTOM&#39; &#124; &#39;TOTAL_LEAD&#39; &#124; &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;PAGE_VISIT_COST_PER_ACTION&#39; &#124; &#39;PAGE_VISIT_ROAS&#39; &#124; &#39;CHECKOUT_ROAS&#39; &#124; &#39;CUSTOM_ROAS&#39; &#124; &#39;VIDEO_MRC_VIEWS_1&#39; &#124; &#39;VIDEO_3SEC_VIEWS_2&#39; &#124; &#39;VIDEO_P100_COMPLETE_2&#39; &#124; &#39;VIDEO_P0_COMBINED_2&#39; &#124; &#39;VIDEO_P25_COMBINED_2&#39; &#124; &#39;VIDEO_P50_COMBINED_2&#39; &#124; &#39;VIDEO_P75_COMBINED_2&#39; &#124; &#39;VIDEO_P95_COMBINED_2&#39; &#124; &#39;VIDEO_MRC_VIEWS_2&#39; &#124; &#39;PAID_VIDEO_VIEWABLE_RATE&#39; &#124; &#39;VIDEO_LENGTH&#39; &#124; &#39;ECPV_IN_DOLLAR&#39; &#124; &#39;ECPCV_IN_DOLLAR&#39; &#124; &#39;ECPCV_P95_IN_DOLLAR&#39; &#124; &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_P100_COMPLETE&#39; &#124; &#39;TOTAL_VIDEO_P0_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P25_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P50_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P75_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P95_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_MRC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; &#124; &#39;TOTAL_REPIN_RATE&#39; &#124; &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;WEB_CHECKOUT_ROAS&#39; &#124; &#39;TOTAL_WEB_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;TOTAL_OFFLINE_CHECKOUT&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; &#124; &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; &#124; &#39;LEADS&#39; &#124; &#39;COST_PER_LEAD&#39; &#124; &#39;QUIZ_COMPLETED&#39; &#124; &#39;QUIZ_PIN_RESULT_OPEN&#39; &#124; &#39;QUIZ_COMPLETION_RATE&#39; &#124; &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPAGE_REPIN&#39; &#124; &#39;SHOWCASE_SUBPIN_REPIN&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; &#124; &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; &#124; &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; &#124; &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; &#124; &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_LEAD_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; &#124; &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; &#124; &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; &#124; &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;>** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | defaults to undefined
 **granularity** | **Granularity** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | defaults to undefined
 **adIds** | **Array&lt;string&gt;** | List of Ad Ids to use to filter the results. | (optional) defaults to undefined
 **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30
 **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30
 **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1
 **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'
 **pinIds** | **Array&lt;string&gt;** | List of Pin IDs. | (optional) defaults to undefined
 **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | (optional) defaults to undefined


### Return type

**Array<AdsAnalyticsResponseInner>**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adsCreate**
> AdArrayResponse adsCreate(adCreateRequest)

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of ads to create, size limit [1, 30].
  adCreateRequest: [
    ,
  ],
};

const data = await apiInstance.adsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adCreateRequest** | **Array<AdCreateRequest>**| List of ads to create, size limit [1, 30]. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdArrayResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adsGet**
> AdResponse adsGet()

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of an ad.
  adId: "4",
};

const data = await apiInstance.adsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **adId** | [**string**] | Unique identifier of an ad. | defaults to undefined


### Return type

**AdResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adsList**
> AdsList200Response adsList()

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdsListRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of Campaign Ids to use to filter the results. (optional)
  campaignIds: [
    "4",
  ],
    // List of Ad group Ids to use to filter the results. (optional)
  adGroupIds: [
    "4",
  ],
    // List of Ad Ids to use to filter the results. (optional)
  adIds: [
    "4",
  ],
    // Entity status (optional)
  entityStatuses: ["ACTIVE","PAUSED"],
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.adsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | (optional) defaults to undefined
 **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to use to filter the results. | (optional) defaults to undefined
 **adIds** | **Array&lt;string&gt;** | List of Ad Ids to use to filter the results. | (optional) defaults to undefined
 **entityStatuses** | **Array<&#39;ACTIVE&#39; &#124; &#39;PAUSED&#39; &#124; &#39;ARCHIVED&#39; &#124; &#39;DRAFT&#39; &#124; &#39;DELETED_DRAFT&#39;>** | Entity status | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**AdsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adsUpdate**
> AdArrayResponse adsUpdate(adUpdateRequest)

Update multiple existing ads

### Example


```typescript
import { createConfiguration, AdsApi } from '';
import type { AdsApiAdsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdsApi(configuration);

const request: AdsApiAdsUpdateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of ads to update, size limit [1, 30]
  adUpdateRequest: [
    ,
  ],
};

const data = await apiInstance.adsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adUpdateRequest** | **Array<AdUpdateRequest>**| List of ads to update, size limit [1, 30] |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdArrayResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


