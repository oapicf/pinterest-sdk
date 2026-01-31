# AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountAnalytics**](AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
| [**adAccountTargetingAnalyticsGet**](AdAccountsApi.md#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account |
| [**adAccountsCreate**](AdAccountsApi.md#adaccountscreate) | **POST** /ad_accounts | Create ad account |
| [**adAccountsGet**](AdAccountsApi.md#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account |
| [**adAccountsList**](AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts |
| [**analyticsCreateConversionProductReport**](AdAccountsApi.md#analyticscreateconversionproductreport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report |
| [**analyticsCreateMmmReport**](AdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report |
| [**analyticsCreateReport**](AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
| [**analyticsCreateTemplateReport**](AdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template |
| [**analyticsGetConversionProductReport**](AdAccountsApi.md#analyticsgetconversionproductreport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report |
| [**analyticsGetMmmReport**](AdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report. |
| [**analyticsGetReport**](AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
| [**sandboxDelete**](AdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox |
| [**templatesList**](AdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates |



## adAccountAnalytics

> Array&lt;AdAccountAnalyticsResponseInner&gt; adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)

Get ad account analytics

Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AdAccountAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.<br/>For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    columns: ...,
    // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
    granularity: DAY,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    clickWindowDays: 1,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>. (optional)
    engagementWindowDays: 56,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    viewWindowDays: 56,
    // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    conversionReportTime: TIME_OF_AD_ACTION,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
  } satisfies AdAccountAnalyticsRequest;

  try {
    const data = await api.adAccountAnalytics(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **columns** | `SPEND_IN_MICRO_DOLLAR`, `PAID_IMPRESSION`, `SPEND_IN_DOLLAR`, `CPC_IN_MICRO_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPC_IN_DOLLAR`, `CTR`, `ECTR`, `OUTBOUND_CTR_1`, `CAMPAIGN_NAME`, `CAMPAIGN_BRAND_LABEL`, `PIN_ID`, `TOTAL_ENGAGEMENT`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ECPE_IN_DOLLAR`, `ENGAGEMENT_RATE`, `EENGAGEMENT_RATE`, `ECPM_IN_MICRO_DOLLAR`, `REPIN_RATE`, `CTR_2`, `CAMPAIGN_ID`, `ADVERTISER_ID`, `AD_ACCOUNT_ID`, `PIN_PROMOTION_ID`, `AD_ID`, `AD_GROUP_ID`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_OBJECTIVE_TYPE`, `CPM_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `AD_GROUP_NAME`, `AD_GROUP_BUDGET_TYPE`, `AD_GROUP_BUDGET_IN_LOCAL_CURRENCY`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_BID_MULTIPLIER`, `PROMO_ID`, `PROMO_NAME`, `ORDER_LINE_ID`, `ORDER_LINE_NAME`, `CLICKTHROUGH_1`, `REPIN_1`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `CLICKTHROUGH_1_GROSS`, `OUTBOUND_CLICK_1`, `CLICKTHROUGH_2`, `REPIN_2`, `IMPRESSION_2`, `OUTBOUND_CLICK_2`, `TOTAL_CLICKTHROUGH`, `TOTAL_IMPRESSION`, `TOTAL_IMPRESSION_USER`, `TOTAL_IMPRESSION_FREQUENCY`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_ADD_TO_CART`, `TOTAL_CLICK_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_ADD_TO_CART`, `TOTAL_VIEW_LEAD`, `TOTAL_CONVERSIONS`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_SESSIONS`, `WEB_SESSIONS_1`, `WEB_SESSIONS_2`, `AD_NAME`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `AD_GROUP_OPTIMIZATION`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_BUDGET_OPTIMIZATION`, `IS_PREMIERE_CAMPAIGN`, `TOTAL_PAGE_VISIT`, `TOTAL_SIGNUP`, `TOTAL_CHECKOUT`, `TOTAL_CUSTOM`, `TOTAL_LEAD`, `TOTAL_ADD_TO_WISHLIST`, `TOTAL_SUBSCRIBE`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `CHECKOUT_ROAS`, `CUSTOM_ROAS`, `PRODUCT_GROUP_AD_IMAGE_TAG`, `PRODUCT_GROUP_AD_VIDEO_TAG`, `VIDEO_3SEC_VIEWS_1`, `VIDEO_15SEC_UNIQUE_VIEWS_1`, `VIDEO_MRC_VIEWS_1`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_15SEC_UNIQUE_VIEWS_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `VIDEO_MRC_VIEWS_2`, `PAID_VIDEO_VIEWABLE_RATE`, `VIDEO_LENGTH`, `VIDEO_SPEND_IN_DOLLAR`, `ECPV_IN_DOLLAR`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_15SEC_UNIQUE_VIEWS`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_REPIN_RATE`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `INAPP_CHECKOUT_COST_PER_ACTION`, `TOTAL_OFFLINE_CHECKOUT`, `TOTAL_APP_INSTALL_CONVERSION_RATE`, `TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `LEADS`, `COST_PER_LEAD`, `QUIZ_COMPLETED`, `QUIZ_PIN_RESULT_OPEN`, `QUIZ_COMPLETION_RATE`, `SHOWCASE_PIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_CLICKTHROUGH`, `SHOWCASE_SUBPIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_IMPRESSION`, `SHOWCASE_SUBPIN_IMPRESSION`, `SHOWCASE_SUBPAGE_SWIPE_LEFT`, `SHOWCASE_SUBPAGE_SWIPE_RIGHT`, `SHOWCASE_SUBPIN_SWIPE_LEFT`, `SHOWCASE_SUBPIN_SWIPE_RIGHT`, `SHOWCASE_SUBPAGE_REPIN`, `SHOWCASE_SUBPIN_REPIN`, `SHOWCASE_SUBPAGE_CLOSEUP`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD`, `SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION`, `TOTAL_CHECKOUT_CONVERSION_RATE`, `TOTAL_VIEW_CATEGORY_CONVERSION_RATE`, `TOTAL_ADD_TO_CART_CONVERSION_RATE`, `TOTAL_SIGNUP_CONVERSION_RATE`, `TOTAL_PAGE_VISIT_CONVERSION_RATE`, `TOTAL_LEAD_CONVERSION_RATE`, `TOTAL_SEARCH_CONVERSION_RATE`, `TOTAL_WATCH_VIDEO_CONVERSION_RATE`, `TOTAL_UNKNOWN_CONVERSION_RATE`, `TOTAL_CUSTOM_CONVERSION_RATE` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [Enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, OUTBOUND_CTR_1, CAMPAIGN_NAME, CAMPAIGN_BRAND_LABEL, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_NAME, AD_GROUP_BUDGET_TYPE, AD_GROUP_BUDGET_IN_LOCAL_CURRENCY, AD_GROUP_ENTITY_STATUS, AD_GROUP_BID_MULTIPLIER, PROMO_ID, PROMO_NAME, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, AD_NAME, CAMPAIGN_LIFETIME_SPEND_CAP, AD_GROUP_OPTIMIZATION, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_BUDGET_OPTIMIZATION, IS_PREMIERE_CAMPAIGN, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_ADD_TO_WISHLIST, TOTAL_SUBSCRIBE, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, PRODUCT_GROUP_AD_IMAGE_TAG, PRODUCT_GROUP_AD_VIDEO_TAG, VIDEO_3SEC_VIEWS_1, VIDEO_15SEC_UNIQUE_VIEWS_1, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_15SEC_UNIQUE_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, PAID_VIDEO_VIEWABLE_RATE, VIDEO_LENGTH, VIDEO_SPEND_IN_DOLLAR, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_15SEC_UNIQUE_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, TOTAL_APP_INSTALL_CONVERSION_RATE, TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_PIN_RESULT_OPEN, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE] |
| **granularity** | `Granularity` | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `undefined`] [Enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**Array&lt;AdAccountAnalyticsResponseInner&gt;**](AdAccountAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adAccountTargetingAnalyticsGet

> MetricsResponse adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AdAccountTargetingAnalyticsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<AdsAnalyticsTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    targetingTypes: ...,
    // Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.<br/>For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    columns: ...,
    // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
    granularity: DAY,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    clickWindowDays: 1,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>. (optional)
    engagementWindowDays: 56,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    viewWindowDays: 56,
    // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    conversionReportTime: TIME_OF_AD_ACTION,
    // Array<ConversionReportAttributionType> | List of types of attribution for the conversion report (optional)
    attributionTypes: ...,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
  } satisfies AdAccountTargetingAnalyticsGetRequest;

  try {
    const data = await api.adAccountTargetingAnalyticsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **targetingTypes** | `Array<AdsAnalyticsTargetingType>` | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | |
| **columns** | `SPEND_IN_MICRO_DOLLAR`, `PAID_IMPRESSION`, `SPEND_IN_DOLLAR`, `CPC_IN_MICRO_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPC_IN_DOLLAR`, `CTR`, `ECTR`, `OUTBOUND_CTR_1`, `CAMPAIGN_NAME`, `CAMPAIGN_BRAND_LABEL`, `PIN_ID`, `TOTAL_ENGAGEMENT`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ECPE_IN_DOLLAR`, `ENGAGEMENT_RATE`, `EENGAGEMENT_RATE`, `ECPM_IN_MICRO_DOLLAR`, `REPIN_RATE`, `CTR_2`, `CAMPAIGN_ID`, `ADVERTISER_ID`, `AD_ACCOUNT_ID`, `PIN_PROMOTION_ID`, `AD_ID`, `AD_GROUP_ID`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_OBJECTIVE_TYPE`, `CPM_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `AD_GROUP_NAME`, `AD_GROUP_BUDGET_TYPE`, `AD_GROUP_BUDGET_IN_LOCAL_CURRENCY`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_BID_MULTIPLIER`, `PROMO_ID`, `PROMO_NAME`, `ORDER_LINE_ID`, `ORDER_LINE_NAME`, `CLICKTHROUGH_1`, `REPIN_1`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `CLICKTHROUGH_1_GROSS`, `OUTBOUND_CLICK_1`, `CLICKTHROUGH_2`, `REPIN_2`, `IMPRESSION_2`, `OUTBOUND_CLICK_2`, `TOTAL_CLICKTHROUGH`, `TOTAL_IMPRESSION`, `TOTAL_IMPRESSION_USER`, `TOTAL_IMPRESSION_FREQUENCY`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_ADD_TO_CART`, `TOTAL_CLICK_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_ADD_TO_CART`, `TOTAL_VIEW_LEAD`, `TOTAL_CONVERSIONS`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_SESSIONS`, `WEB_SESSIONS_1`, `WEB_SESSIONS_2`, `AD_NAME`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `AD_GROUP_OPTIMIZATION`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_BUDGET_OPTIMIZATION`, `IS_PREMIERE_CAMPAIGN`, `TOTAL_PAGE_VISIT`, `TOTAL_SIGNUP`, `TOTAL_CHECKOUT`, `TOTAL_CUSTOM`, `TOTAL_LEAD`, `TOTAL_ADD_TO_WISHLIST`, `TOTAL_SUBSCRIBE`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `CHECKOUT_ROAS`, `CUSTOM_ROAS`, `PRODUCT_GROUP_AD_IMAGE_TAG`, `PRODUCT_GROUP_AD_VIDEO_TAG`, `VIDEO_3SEC_VIEWS_1`, `VIDEO_15SEC_UNIQUE_VIEWS_1`, `VIDEO_MRC_VIEWS_1`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_15SEC_UNIQUE_VIEWS_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `VIDEO_MRC_VIEWS_2`, `PAID_VIDEO_VIEWABLE_RATE`, `VIDEO_LENGTH`, `VIDEO_SPEND_IN_DOLLAR`, `ECPV_IN_DOLLAR`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_15SEC_UNIQUE_VIEWS`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_REPIN_RATE`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `INAPP_CHECKOUT_COST_PER_ACTION`, `TOTAL_OFFLINE_CHECKOUT`, `TOTAL_APP_INSTALL_CONVERSION_RATE`, `TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `LEADS`, `COST_PER_LEAD`, `QUIZ_COMPLETED`, `QUIZ_PIN_RESULT_OPEN`, `QUIZ_COMPLETION_RATE`, `SHOWCASE_PIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_CLICKTHROUGH`, `SHOWCASE_SUBPIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_IMPRESSION`, `SHOWCASE_SUBPIN_IMPRESSION`, `SHOWCASE_SUBPAGE_SWIPE_LEFT`, `SHOWCASE_SUBPAGE_SWIPE_RIGHT`, `SHOWCASE_SUBPIN_SWIPE_LEFT`, `SHOWCASE_SUBPIN_SWIPE_RIGHT`, `SHOWCASE_SUBPAGE_REPIN`, `SHOWCASE_SUBPIN_REPIN`, `SHOWCASE_SUBPAGE_CLOSEUP`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD`, `SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION`, `TOTAL_CHECKOUT_CONVERSION_RATE`, `TOTAL_VIEW_CATEGORY_CONVERSION_RATE`, `TOTAL_ADD_TO_CART_CONVERSION_RATE`, `TOTAL_SIGNUP_CONVERSION_RATE`, `TOTAL_PAGE_VISIT_CONVERSION_RATE`, `TOTAL_LEAD_CONVERSION_RATE`, `TOTAL_SEARCH_CONVERSION_RATE`, `TOTAL_WATCH_VIDEO_CONVERSION_RATE`, `TOTAL_UNKNOWN_CONVERSION_RATE`, `TOTAL_CUSTOM_CONVERSION_RATE` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [Enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, OUTBOUND_CTR_1, CAMPAIGN_NAME, CAMPAIGN_BRAND_LABEL, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_NAME, AD_GROUP_BUDGET_TYPE, AD_GROUP_BUDGET_IN_LOCAL_CURRENCY, AD_GROUP_ENTITY_STATUS, AD_GROUP_BID_MULTIPLIER, PROMO_ID, PROMO_NAME, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, AD_NAME, CAMPAIGN_LIFETIME_SPEND_CAP, AD_GROUP_OPTIMIZATION, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_BUDGET_OPTIMIZATION, IS_PREMIERE_CAMPAIGN, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_ADD_TO_WISHLIST, TOTAL_SUBSCRIBE, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, PRODUCT_GROUP_AD_IMAGE_TAG, PRODUCT_GROUP_AD_VIDEO_TAG, VIDEO_3SEC_VIEWS_1, VIDEO_15SEC_UNIQUE_VIEWS_1, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_15SEC_UNIQUE_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, PAID_VIDEO_VIEWABLE_RATE, VIDEO_LENGTH, VIDEO_SPEND_IN_DOLLAR, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_15SEC_UNIQUE_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, TOTAL_APP_INSTALL_CONVERSION_RATE, TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_PIN_RESULT_OPEN, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE] |
| **granularity** | `Granularity` | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attributionTypes** | `Array<ConversionReportAttributionType>` | List of types of attribution for the conversion report | [Optional] |
| **reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `undefined`] [Enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adAccountsCreate

> AdAccount adAccountsCreate(adAccountCreate)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AdAccountsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // AdAccountCreate
    adAccountCreate: ...,
  } satisfies AdAccountsCreateRequest;

  try {
    const data = await api.adAccountsCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountCreate** | [AdAccountCreate](AdAccountCreate.md) |  | |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adAccountsGet

> AdAccount adAccountsGet(adAccountId)

Get ad account

Get an ad account

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AdAccountsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string
    adAccountId: adAccountId_example,
  } satisfies AdAccountsGetRequest;

  try {
    const data = await api.adAccountsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adAccountsList

> AdAccountsList200Response adAccountsList(includeSharedAccounts, bookmark, pageSize)

List ad accounts

Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AdAccountsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // boolean | Include shared ad accounts (optional)
    includeSharedAccounts: true,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies AdAccountsListRequest;

  try {
    const data = await api.adAccountsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeSharedAccounts** | `boolean` | Include shared ad accounts | [Optional] [Defaults to `true`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsCreateConversionProductReport

> AdsAnalyticsCreateAsyncResponse analyticsCreateConversionProductReport(adAccountId, conversionProductReportRequest)

Create a request for a brand, category, SKU report

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsCreateConversionProductReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // ConversionProductReportRequest
    conversionProductReportRequest: ...,
  } satisfies AnalyticsCreateConversionProductReportRequest;

  try {
    const data = await api.analyticsCreateConversionProductReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **conversionProductReportRequest** | [ConversionProductReportRequest](ConversionProductReportRequest.md) |  | |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics brand, category, SKU parameters |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsCreateMmmReport

> CreateMMMReportResponse analyticsCreateMmmReport(adAccountId, createMMMReportRequest)

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\&#39;s in beta release.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsCreateMmmReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // CreateMMMReportRequest
    createMMMReportRequest: ...,
  } satisfies AnalyticsCreateMmmReportRequest;

  try {
    const data = await api.analyticsCreateMmmReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **createMMMReportRequest** | [CreateMMMReportRequest](CreateMMMReportRequest.md) |  | |

### Return type

[**CreateMMMReportResponse**](CreateMMMReportResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics mmm parameters |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsCreateReport

> AdsAnalyticsCreateAsyncResponse analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsCreateReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // AdsAnalyticsCreateAsyncRequest
    adsAnalyticsCreateAsyncRequest: ...,
  } satisfies AnalyticsCreateReportRequest;

  try {
    const data = await api.analyticsCreateReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adsAnalyticsCreateAsyncRequest** | [AdsAnalyticsCreateAsyncRequest](AdsAnalyticsCreateAsyncRequest.md) |  | |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsCreateTemplateReport

> TemplateBasedReport analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)

Create async request for an analytics report using a template

   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsCreateTemplateReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string
    adAccountId: adAccountId_example,
    // string | Unique identifier of a template.
    templateId: templateId_example,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
    endDate: 2013-10-20,
    // Granularity |    TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly (optional)
    granularity: ...,
  } satisfies AnalyticsCreateTemplateReportRequest;

  try {
    const data = await api.analyticsCreateTemplateReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` |  | [Defaults to `undefined`] |
| **templateId** | `string` | Unique identifier of a template. | [Defaults to `undefined`] |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [Optional] [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [Optional] [Defaults to `undefined`] |
| **granularity** | `Granularity` |    TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly | [Optional] [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |

### Return type

[**TemplateBasedReport**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsGetConversionProductReport

> AdsAnalyticsGetAsyncResponse analyticsGetConversionProductReport(adAccountId, token)

Get advertiser brand, category, SKU report

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsGetConversionProductReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Token returned from the post request creation call
    token: token_example,
  } satisfies AnalyticsGetConversionProductReportRequest;

  try {
    const data = await api.analyticsGetConversionProductReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **token** | `string` | Token returned from the post request creation call | [Defaults to `undefined`] |

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsGetMmmReport

> GetMMMReportResponse analyticsGetMmmReport(adAccountId, token)

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsGetMmmReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Token returned from the post request creation call
    token: token_example,
  } satisfies AnalyticsGetMmmReportRequest;

  try {
    const data = await api.analyticsGetMmmReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **token** | `string` | Token returned from the post request creation call | [Defaults to `undefined`] |

### Return type

[**GetMMMReportResponse**](GetMMMReportResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## analyticsGetReport

> AdsAnalyticsGetAsyncResponse analyticsGetReport(adAccountId, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { AnalyticsGetReportRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Token returned from the post request creation call
    token: token_example,
  } satisfies AnalyticsGetReportRequest;

  try {
    const data = await api.analyticsGetReport(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **token** | `string` | Token returned from the post request creation call | [Defaults to `undefined`] |

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## sandboxDelete

> string sandboxDelete(adAccountId)

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { SandboxDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
  } satisfies SandboxDeleteRequest;

  try {
    const data = await api.sandboxDelete(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## templatesList

> TemplatesList200Response templatesList(adAccountId, pageSize, order, bookmark)

List templates

Gets all Templates associated with an ad account ID.

### Example

```ts
import {
  Configuration,
  AdAccountsApi,
} from '';
import type { TemplatesListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdAccountsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // 'ASCENDING' | 'DESCENDING' | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ASCENDING,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
  } satisfies TemplatesListRequest;

  try {
    const data = await api.templatesList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **order** | `ASCENDING`, `DESCENDING` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account template parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

