# .AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](AdAccountsApi.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](AdAccountsApi.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](AdAccountsApi.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateMmmReport**](AdAccountsApi.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](AdAccountsApi.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analyticsGetMmmReport**](AdAccountsApi.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analyticsGetReport**](AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandboxDelete**](AdAccountsApi.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templatesList**](AdAccountsApi.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates


# **adAccountAnalytics**
> Array<AdAccountAnalyticsResponseInner> adAccountAnalytics()

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAdAccountAnalyticsRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.<br/>For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  columns: [
    "TOTAL_CONVERSIONS",
  ],
  // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  granularity: "DAY",
  // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  clickWindowDays: 1,
  // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  engagementWindowDays: 30,
  // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
  viewWindowDays: 1,
  // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
  conversionReportTime: "TIME_OF_AD_ACTION",
};

apiInstance.adAccountAnalytics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **columns** | **Array<&#39;SPEND_IN_MICRO_DOLLAR&#39; &#124; &#39;PAID_IMPRESSION&#39; &#124; &#39;SPEND_IN_DOLLAR&#39; &#124; &#39;CPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_DOLLAR&#39; &#124; &#39;CTR&#39; &#124; &#39;ECTR&#39; &#124; &#39;CAMPAIGN_NAME&#39; &#124; &#39;PIN_ID&#39; &#124; &#39;TOTAL_ENGAGEMENT&#39; &#124; &#39;ENGAGEMENT_1&#39; &#124; &#39;ENGAGEMENT_2&#39; &#124; &#39;ECPE_IN_DOLLAR&#39; &#124; &#39;ENGAGEMENT_RATE&#39; &#124; &#39;EENGAGEMENT_RATE&#39; &#124; &#39;ECPM_IN_MICRO_DOLLAR&#39; &#124; &#39;REPIN_RATE&#39; &#124; &#39;CTR_2&#39; &#124; &#39;CAMPAIGN_ID&#39; &#124; &#39;ADVERTISER_ID&#39; &#124; &#39;AD_ACCOUNT_ID&#39; &#124; &#39;PIN_PROMOTION_ID&#39; &#124; &#39;AD_ID&#39; &#124; &#39;AD_GROUP_ID&#39; &#124; &#39;CAMPAIGN_ENTITY_STATUS&#39; &#124; &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; &#124; &#39;CPM_IN_MICRO_DOLLAR&#39; &#124; &#39;CPM_IN_DOLLAR&#39; &#124; &#39;AD_GROUP_ENTITY_STATUS&#39; &#124; &#39;ORDER_LINE_ID&#39; &#124; &#39;ORDER_LINE_NAME&#39; &#124; &#39;CLICKTHROUGH_1&#39; &#124; &#39;REPIN_1&#39; &#124; &#39;IMPRESSION_1&#39; &#124; &#39;IMPRESSION_1_GROSS&#39; &#124; &#39;CLICKTHROUGH_1_GROSS&#39; &#124; &#39;OUTBOUND_CLICK_1&#39; &#124; &#39;CLICKTHROUGH_2&#39; &#124; &#39;REPIN_2&#39; &#124; &#39;IMPRESSION_2&#39; &#124; &#39;OUTBOUND_CLICK_2&#39; &#124; &#39;TOTAL_CLICKTHROUGH&#39; &#124; &#39;TOTAL_IMPRESSION&#39; &#124; &#39;TOTAL_IMPRESSION_USER&#39; &#124; &#39;TOTAL_IMPRESSION_FREQUENCY&#39; &#124; &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_ENGAGEMENT_LEAD&#39; &#124; &#39;TOTAL_CLICK_SIGNUP&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_CLICK_ADD_TO_CART&#39; &#124; &#39;TOTAL_CLICK_LEAD&#39; &#124; &#39;TOTAL_VIEW_SIGNUP&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_VIEW_ADD_TO_CART&#39; &#124; &#39;TOTAL_VIEW_LEAD&#39; &#124; &#39;TOTAL_CONVERSIONS&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_SESSIONS&#39; &#124; &#39;WEB_SESSIONS_1&#39; &#124; &#39;WEB_SESSIONS_2&#39; &#124; &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; &#124; &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; &#124; &#39;TOTAL_PAGE_VISIT&#39; &#124; &#39;TOTAL_SIGNUP&#39; &#124; &#39;TOTAL_CHECKOUT&#39; &#124; &#39;TOTAL_CUSTOM&#39; &#124; &#39;TOTAL_LEAD&#39; &#124; &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;PAGE_VISIT_COST_PER_ACTION&#39; &#124; &#39;PAGE_VISIT_ROAS&#39; &#124; &#39;CHECKOUT_ROAS&#39; &#124; &#39;CUSTOM_ROAS&#39; &#124; &#39;VIDEO_MRC_VIEWS_1&#39; &#124; &#39;VIDEO_3SEC_VIEWS_2&#39; &#124; &#39;VIDEO_P100_COMPLETE_2&#39; &#124; &#39;VIDEO_P0_COMBINED_2&#39; &#124; &#39;VIDEO_P25_COMBINED_2&#39; &#124; &#39;VIDEO_P50_COMBINED_2&#39; &#124; &#39;VIDEO_P75_COMBINED_2&#39; &#124; &#39;VIDEO_P95_COMBINED_2&#39; &#124; &#39;VIDEO_MRC_VIEWS_2&#39; &#124; &#39;VIDEO_LENGTH&#39; &#124; &#39;ECPV_IN_DOLLAR&#39; &#124; &#39;ECPCV_IN_DOLLAR&#39; &#124; &#39;ECPCV_P95_IN_DOLLAR&#39; &#124; &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_P100_COMPLETE&#39; &#124; &#39;TOTAL_VIDEO_P0_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P25_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P50_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P75_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P95_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_MRC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; &#124; &#39;TOTAL_REPIN_RATE&#39; &#124; &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;WEB_CHECKOUT_ROAS&#39; &#124; &#39;TOTAL_WEB_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;TOTAL_OFFLINE_CHECKOUT&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; &#124; &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; &#124; &#39;LEADS&#39; &#124; &#39;COST_PER_LEAD&#39; &#124; &#39;QUIZ_COMPLETED&#39; &#124; &#39;QUIZ_COMPLETION_RATE&#39; &#124; &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPAGE_REPIN&#39; &#124; &#39;SHOWCASE_SUBPIN_REPIN&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; &#124; &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; &#124; &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; &#124; &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; &#124; &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_LEAD_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; &#124; &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; &#124; &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; &#124; &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;>** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | defaults to undefined
 **granularity** | **Granularity** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | defaults to undefined
 **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30
 **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30
 **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1
 **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'


### Return type

**Array<AdAccountAnalyticsResponseInner>**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountTargetingAnalyticsGet**
> MetricsResponse adAccountTargetingAnalyticsGet()

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAdAccountTargetingAnalyticsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // Array<AdsAnalyticsTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
  targetingTypes: [
    "APPTYPE",
  ],
  // Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.<br/>For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  columns: [
    "TOTAL_CONVERSIONS",
  ],
  // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  granularity: "DAY",
  // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  clickWindowDays: 1,
  // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
  engagementWindowDays: 30,
  // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
  viewWindowDays: 1,
  // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
  conversionReportTime: "TIME_OF_AD_ACTION",
  // ConversionReportAttributionType | List of types of attribution for the conversion report (optional)
  attributionTypes: "INDIVIDUAL",
};

apiInstance.adAccountTargetingAnalyticsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **targetingTypes** | **Array&lt;AdsAnalyticsTargetingType&gt;** | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | defaults to undefined
 **columns** | **Array<&#39;SPEND_IN_MICRO_DOLLAR&#39; &#124; &#39;PAID_IMPRESSION&#39; &#124; &#39;SPEND_IN_DOLLAR&#39; &#124; &#39;CPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_MICRO_DOLLAR&#39; &#124; &#39;ECPC_IN_DOLLAR&#39; &#124; &#39;CTR&#39; &#124; &#39;ECTR&#39; &#124; &#39;CAMPAIGN_NAME&#39; &#124; &#39;PIN_ID&#39; &#124; &#39;TOTAL_ENGAGEMENT&#39; &#124; &#39;ENGAGEMENT_1&#39; &#124; &#39;ENGAGEMENT_2&#39; &#124; &#39;ECPE_IN_DOLLAR&#39; &#124; &#39;ENGAGEMENT_RATE&#39; &#124; &#39;EENGAGEMENT_RATE&#39; &#124; &#39;ECPM_IN_MICRO_DOLLAR&#39; &#124; &#39;REPIN_RATE&#39; &#124; &#39;CTR_2&#39; &#124; &#39;CAMPAIGN_ID&#39; &#124; &#39;ADVERTISER_ID&#39; &#124; &#39;AD_ACCOUNT_ID&#39; &#124; &#39;PIN_PROMOTION_ID&#39; &#124; &#39;AD_ID&#39; &#124; &#39;AD_GROUP_ID&#39; &#124; &#39;CAMPAIGN_ENTITY_STATUS&#39; &#124; &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; &#124; &#39;CPM_IN_MICRO_DOLLAR&#39; &#124; &#39;CPM_IN_DOLLAR&#39; &#124; &#39;AD_GROUP_ENTITY_STATUS&#39; &#124; &#39;ORDER_LINE_ID&#39; &#124; &#39;ORDER_LINE_NAME&#39; &#124; &#39;CLICKTHROUGH_1&#39; &#124; &#39;REPIN_1&#39; &#124; &#39;IMPRESSION_1&#39; &#124; &#39;IMPRESSION_1_GROSS&#39; &#124; &#39;CLICKTHROUGH_1_GROSS&#39; &#124; &#39;OUTBOUND_CLICK_1&#39; &#124; &#39;CLICKTHROUGH_2&#39; &#124; &#39;REPIN_2&#39; &#124; &#39;IMPRESSION_2&#39; &#124; &#39;OUTBOUND_CLICK_2&#39; &#124; &#39;TOTAL_CLICKTHROUGH&#39; &#124; &#39;TOTAL_IMPRESSION&#39; &#124; &#39;TOTAL_IMPRESSION_USER&#39; &#124; &#39;TOTAL_IMPRESSION_FREQUENCY&#39; &#124; &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_ENGAGEMENT_LEAD&#39; &#124; &#39;TOTAL_CLICK_SIGNUP&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_CLICK_ADD_TO_CART&#39; &#124; &#39;TOTAL_CLICK_LEAD&#39; &#124; &#39;TOTAL_VIEW_SIGNUP&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_VIEW_ADD_TO_CART&#39; &#124; &#39;TOTAL_VIEW_LEAD&#39; &#124; &#39;TOTAL_CONVERSIONS&#39; &#124; &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_SESSIONS&#39; &#124; &#39;WEB_SESSIONS_1&#39; &#124; &#39;WEB_SESSIONS_2&#39; &#124; &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; &#124; &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; &#124; &#39;TOTAL_PAGE_VISIT&#39; &#124; &#39;TOTAL_SIGNUP&#39; &#124; &#39;TOTAL_CHECKOUT&#39; &#124; &#39;TOTAL_CUSTOM&#39; &#124; &#39;TOTAL_LEAD&#39; &#124; &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;PAGE_VISIT_COST_PER_ACTION&#39; &#124; &#39;PAGE_VISIT_ROAS&#39; &#124; &#39;CHECKOUT_ROAS&#39; &#124; &#39;CUSTOM_ROAS&#39; &#124; &#39;VIDEO_MRC_VIEWS_1&#39; &#124; &#39;VIDEO_3SEC_VIEWS_2&#39; &#124; &#39;VIDEO_P100_COMPLETE_2&#39; &#124; &#39;VIDEO_P0_COMBINED_2&#39; &#124; &#39;VIDEO_P25_COMBINED_2&#39; &#124; &#39;VIDEO_P50_COMBINED_2&#39; &#124; &#39;VIDEO_P75_COMBINED_2&#39; &#124; &#39;VIDEO_P95_COMBINED_2&#39; &#124; &#39;VIDEO_MRC_VIEWS_2&#39; &#124; &#39;VIDEO_LENGTH&#39; &#124; &#39;ECPV_IN_DOLLAR&#39; &#124; &#39;ECPCV_IN_DOLLAR&#39; &#124; &#39;ECPCV_P95_IN_DOLLAR&#39; &#124; &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_P100_COMPLETE&#39; &#124; &#39;TOTAL_VIDEO_P0_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P25_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P50_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P75_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_P95_COMBINED&#39; &#124; &#39;TOTAL_VIDEO_MRC_VIEWS&#39; &#124; &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; &#124; &#39;TOTAL_REPIN_RATE&#39; &#124; &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;WEB_CHECKOUT_ROAS&#39; &#124; &#39;TOTAL_WEB_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; &#124; &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; &#124; &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; &#124; &#39;TOTAL_OFFLINE_CHECKOUT&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; &#124; &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; &#124; &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; &#124; &#39;LEADS&#39; &#124; &#39;COST_PER_LEAD&#39; &#124; &#39;QUIZ_COMPLETED&#39; &#124; &#39;QUIZ_COMPLETION_RATE&#39; &#124; &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; &#124; &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; &#124; &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; &#124; &#39;SHOWCASE_SUBPAGE_REPIN&#39; &#124; &#39;SHOWCASE_SUBPIN_REPIN&#39; &#124; &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; &#124; &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; &#124; &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; &#124; &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; &#124; &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; &#124; &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; &#124; &#39;TOTAL_LEAD_CONVERSION_RATE&#39; &#124; &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; &#124; &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; &#124; &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; &#124; &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;>** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | defaults to undefined
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

# **adAccountsCreate**
> AdAccount adAccountsCreate(adAccountCreateRequest)

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAdAccountsCreateRequest = {
  // AdAccountCreateRequest | Ad account to create.
  adAccountCreateRequest: {
    country: "US",
    name: "ACME Tools",
    ownerUserId: "383791336903426391",
  },
};

apiInstance.adAccountsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreateRequest** | **AdAccountCreateRequest**| Ad account to create. |


### Return type

**AdAccount**

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

# **adAccountsGet**
> AdAccount adAccountsGet()

Get an ad account

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAdAccountsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
};

apiInstance.adAccountsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdAccount**

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

# **adAccountsList**
> AdAccountsList200Response adAccountsList()

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAdAccountsListRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // boolean | Include shared ad accounts (optional)
  includeSharedAccounts: true,
};

apiInstance.adAccountsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **includeSharedAccounts** | [**boolean**] | Include shared ad accounts | (optional) defaults to true


### Return type

**AdAccountsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **analyticsCreateMmmReport**
> CreateMMMReportResponse analyticsCreateMmmReport(createMMMReportRequest)

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAnalyticsCreateMmmReportRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // CreateMMMReportRequest
  createMMMReportRequest: ,
};

apiInstance.analyticsCreateMmmReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMMMReportRequest** | **CreateMMMReportRequest**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**CreateMMMReportResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads analytics mmm parameters |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **analyticsCreateReport**
> AdsAnalyticsCreateAsyncResponse analyticsCreateReport(adsAnalyticsCreateAsyncRequest)

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAnalyticsCreateReportRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // AdsAnalyticsCreateAsyncRequest
  adsAnalyticsCreateAsyncRequest: ,
};

apiInstance.analyticsCreateReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adsAnalyticsCreateAsyncRequest** | **AdsAnalyticsCreateAsyncRequest**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdsAnalyticsCreateAsyncResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **analyticsCreateTemplateReport**
> AdsAnalyticsCreateAsyncResponse analyticsCreateTemplateReport()

This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAnalyticsCreateTemplateReportRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of a template.
  templateId: "4",
  // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly (optional)
  granularity: "DAY",
};

apiInstance.analyticsCreateTemplateReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **templateId** | [**string**] | Unique identifier of a template. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | (optional) defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | (optional) defaults to undefined
 **granularity** | **Granularity** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | (optional) defaults to undefined


### Return type

**AdsAnalyticsCreateAsyncResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads analytics template parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **analyticsGetMmmReport**
> GetMMMReportResponse analyticsGetMmmReport()

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAnalyticsGetMmmReportRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Token returned from the post request creation call
  token: "token_example",
};

apiInstance.analyticsGetMmmReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **token** | [**string**] | Token returned from the post request creation call | defaults to undefined


### Return type

**GetMMMReportResponse**

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

# **analyticsGetReport**
> AdsAnalyticsGetAsyncResponse analyticsGetReport()

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiAnalyticsGetReportRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Token returned from the post request creation call
  token: "token_example",
};

apiInstance.analyticsGetReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **token** | [**string**] | Token returned from the post request creation call | defaults to undefined


### Return type

**AdsAnalyticsGetAsyncResponse**

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

# **sandboxDelete**
> string sandboxDelete()

Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiSandboxDeleteRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
};

apiInstance.sandboxDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**string**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Invalid ad account id. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesList**
> TemplatesList200Response templatesList()

Gets all Templates associated with an ad account ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AdAccountsApi(configuration);

let body:.AdAccountsApiTemplatesListRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // 'ASCENDING' | 'DESCENDING' | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

apiInstance.templatesList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**TemplatesList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account template parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


