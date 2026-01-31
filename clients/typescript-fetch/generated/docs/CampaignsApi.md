# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adPinsAnalytics**](CampaignsApi.md#adpinsanalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics |
| [**campaignTargetingAnalyticsGet**](CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**campaignsAnalytics**](CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaignsCreate**](CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**campaignsGet**](CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**campaignsList**](CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**campaignsUpdate**](CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |



## adPinsAnalytics

> Array&lt;AdPinAnalytics&gt; adPinsAnalytics(adAccountId, campaignId, pinIds, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { AdPinsAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Campaign Id to use to filter the results.
    campaignId: campaignId_example,
    // Array<string> | List of Pin IDs.
    pinIds: ...,
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
  } satisfies AdPinsAnalyticsRequest;

  try {
    const data = await api.adPinsAnalytics(body);
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
| **campaignId** | `string` | Campaign Id to use to filter the results. | [Defaults to `undefined`] |
| **pinIds** | `Array<string>` | List of Pin IDs. | |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **columns** | `SPEND_IN_MICRO_DOLLAR`, `PAID_IMPRESSION`, `SPEND_IN_DOLLAR`, `CPC_IN_MICRO_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPC_IN_DOLLAR`, `CTR`, `ECTR`, `OUTBOUND_CTR_1`, `CAMPAIGN_NAME`, `CAMPAIGN_BRAND_LABEL`, `PIN_ID`, `TOTAL_ENGAGEMENT`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ECPE_IN_DOLLAR`, `ENGAGEMENT_RATE`, `EENGAGEMENT_RATE`, `ECPM_IN_MICRO_DOLLAR`, `REPIN_RATE`, `CTR_2`, `CAMPAIGN_ID`, `ADVERTISER_ID`, `AD_ACCOUNT_ID`, `PIN_PROMOTION_ID`, `AD_ID`, `AD_GROUP_ID`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_OBJECTIVE_TYPE`, `CPM_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `AD_GROUP_NAME`, `AD_GROUP_BUDGET_TYPE`, `AD_GROUP_BUDGET_IN_LOCAL_CURRENCY`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_BID_MULTIPLIER`, `PROMO_ID`, `PROMO_NAME`, `ORDER_LINE_ID`, `ORDER_LINE_NAME`, `CLICKTHROUGH_1`, `REPIN_1`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `CLICKTHROUGH_1_GROSS`, `OUTBOUND_CLICK_1`, `CLICKTHROUGH_2`, `REPIN_2`, `IMPRESSION_2`, `OUTBOUND_CLICK_2`, `TOTAL_CLICKTHROUGH`, `TOTAL_IMPRESSION`, `TOTAL_IMPRESSION_USER`, `TOTAL_IMPRESSION_FREQUENCY`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_ADD_TO_CART`, `TOTAL_CLICK_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_ADD_TO_CART`, `TOTAL_VIEW_LEAD`, `TOTAL_CONVERSIONS`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_SESSIONS`, `WEB_SESSIONS_1`, `WEB_SESSIONS_2`, `AD_NAME`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `AD_GROUP_OPTIMIZATION`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_BUDGET_OPTIMIZATION`, `IS_PREMIERE_CAMPAIGN`, `TOTAL_PAGE_VISIT`, `TOTAL_SIGNUP`, `TOTAL_CHECKOUT`, `TOTAL_CUSTOM`, `TOTAL_LEAD`, `TOTAL_ADD_TO_WISHLIST`, `TOTAL_SUBSCRIBE`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `CHECKOUT_ROAS`, `CUSTOM_ROAS`, `PRODUCT_GROUP_AD_IMAGE_TAG`, `PRODUCT_GROUP_AD_VIDEO_TAG`, `VIDEO_3SEC_VIEWS_1`, `VIDEO_15SEC_UNIQUE_VIEWS_1`, `VIDEO_MRC_VIEWS_1`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_15SEC_UNIQUE_VIEWS_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `VIDEO_MRC_VIEWS_2`, `PAID_VIDEO_VIEWABLE_RATE`, `VIDEO_LENGTH`, `VIDEO_SPEND_IN_DOLLAR`, `ECPV_IN_DOLLAR`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_15SEC_UNIQUE_VIEWS`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_REPIN_RATE`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `INAPP_CHECKOUT_COST_PER_ACTION`, `TOTAL_OFFLINE_CHECKOUT`, `TOTAL_APP_INSTALL_CONVERSION_RATE`, `TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `LEADS`, `COST_PER_LEAD`, `QUIZ_COMPLETED`, `QUIZ_PIN_RESULT_OPEN`, `QUIZ_COMPLETION_RATE`, `SHOWCASE_PIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_CLICKTHROUGH`, `SHOWCASE_SUBPIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_IMPRESSION`, `SHOWCASE_SUBPIN_IMPRESSION`, `SHOWCASE_SUBPAGE_SWIPE_LEFT`, `SHOWCASE_SUBPAGE_SWIPE_RIGHT`, `SHOWCASE_SUBPIN_SWIPE_LEFT`, `SHOWCASE_SUBPIN_SWIPE_RIGHT`, `SHOWCASE_SUBPAGE_REPIN`, `SHOWCASE_SUBPIN_REPIN`, `SHOWCASE_SUBPAGE_CLOSEUP`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD`, `SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION`, `TOTAL_CHECKOUT_CONVERSION_RATE`, `TOTAL_VIEW_CATEGORY_CONVERSION_RATE`, `TOTAL_ADD_TO_CART_CONVERSION_RATE`, `TOTAL_SIGNUP_CONVERSION_RATE`, `TOTAL_PAGE_VISIT_CONVERSION_RATE`, `TOTAL_LEAD_CONVERSION_RATE`, `TOTAL_SEARCH_CONVERSION_RATE`, `TOTAL_WATCH_VIDEO_CONVERSION_RATE`, `TOTAL_UNKNOWN_CONVERSION_RATE`, `TOTAL_CUSTOM_CONVERSION_RATE` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [Enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, OUTBOUND_CTR_1, CAMPAIGN_NAME, CAMPAIGN_BRAND_LABEL, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_NAME, AD_GROUP_BUDGET_TYPE, AD_GROUP_BUDGET_IN_LOCAL_CURRENCY, AD_GROUP_ENTITY_STATUS, AD_GROUP_BID_MULTIPLIER, PROMO_ID, PROMO_NAME, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, AD_NAME, CAMPAIGN_LIFETIME_SPEND_CAP, AD_GROUP_OPTIMIZATION, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_BUDGET_OPTIMIZATION, IS_PREMIERE_CAMPAIGN, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_ADD_TO_WISHLIST, TOTAL_SUBSCRIBE, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, PRODUCT_GROUP_AD_IMAGE_TAG, PRODUCT_GROUP_AD_VIDEO_TAG, VIDEO_3SEC_VIEWS_1, VIDEO_15SEC_UNIQUE_VIEWS_1, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_15SEC_UNIQUE_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, PAID_VIDEO_VIEWABLE_RATE, VIDEO_LENGTH, VIDEO_SPEND_IN_DOLLAR, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_15SEC_UNIQUE_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, TOTAL_APP_INSTALL_CONVERSION_RATE, TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_PIN_RESULT_OPEN, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE] |
| **granularity** | `Granularity` | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |

### Return type

[**Array&lt;AdPinAnalytics&gt;**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account pins analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## campaignTargetingAnalyticsGet

> MetricsResponse campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { CampaignTargetingAnalyticsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Campaign Ids to use to filter the results.
    campaignIds: ...,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<AdsAnalyticsCampaignTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
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
  } satisfies CampaignTargetingAnalyticsGetRequest;

  try {
    const data = await api.campaignTargetingAnalyticsGet(body);
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
| **campaignIds** | `Array<string>` | List of Campaign Ids to use to filter the results. | |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **targetingTypes** | `Array<AdsAnalyticsCampaignTargetingType>` | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | |
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


## campaignsAnalytics

> Array&lt;CampaignsAnalyticsResponseInner&gt; campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

Get campaign analytics

Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { CampaignsAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<string> | List of Campaign Ids to use to filter the results.
    campaignIds: ...,
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
    // boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional)
    aggregateReportRows: true,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
  } satisfies CampaignsAnalyticsRequest;

  try {
    const data = await api.campaignsAnalytics(body);
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
| **campaignIds** | `Array<string>` | List of Campaign Ids to use to filter the results. | |
| **columns** | `SPEND_IN_MICRO_DOLLAR`, `PAID_IMPRESSION`, `SPEND_IN_DOLLAR`, `CPC_IN_MICRO_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPC_IN_DOLLAR`, `CTR`, `ECTR`, `OUTBOUND_CTR_1`, `CAMPAIGN_NAME`, `CAMPAIGN_BRAND_LABEL`, `PIN_ID`, `TOTAL_ENGAGEMENT`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ECPE_IN_DOLLAR`, `ENGAGEMENT_RATE`, `EENGAGEMENT_RATE`, `ECPM_IN_MICRO_DOLLAR`, `REPIN_RATE`, `CTR_2`, `CAMPAIGN_ID`, `ADVERTISER_ID`, `AD_ACCOUNT_ID`, `PIN_PROMOTION_ID`, `AD_ID`, `AD_GROUP_ID`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_OBJECTIVE_TYPE`, `CPM_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `AD_GROUP_NAME`, `AD_GROUP_BUDGET_TYPE`, `AD_GROUP_BUDGET_IN_LOCAL_CURRENCY`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_BID_MULTIPLIER`, `PROMO_ID`, `PROMO_NAME`, `ORDER_LINE_ID`, `ORDER_LINE_NAME`, `CLICKTHROUGH_1`, `REPIN_1`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `CLICKTHROUGH_1_GROSS`, `OUTBOUND_CLICK_1`, `CLICKTHROUGH_2`, `REPIN_2`, `IMPRESSION_2`, `OUTBOUND_CLICK_2`, `TOTAL_CLICKTHROUGH`, `TOTAL_IMPRESSION`, `TOTAL_IMPRESSION_USER`, `TOTAL_IMPRESSION_FREQUENCY`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_ADD_TO_CART`, `TOTAL_CLICK_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_ADD_TO_CART`, `TOTAL_VIEW_LEAD`, `TOTAL_CONVERSIONS`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_SESSIONS`, `WEB_SESSIONS_1`, `WEB_SESSIONS_2`, `AD_NAME`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `AD_GROUP_OPTIMIZATION`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_BUDGET_OPTIMIZATION`, `IS_PREMIERE_CAMPAIGN`, `TOTAL_PAGE_VISIT`, `TOTAL_SIGNUP`, `TOTAL_CHECKOUT`, `TOTAL_CUSTOM`, `TOTAL_LEAD`, `TOTAL_ADD_TO_WISHLIST`, `TOTAL_SUBSCRIBE`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `CHECKOUT_ROAS`, `CUSTOM_ROAS`, `PRODUCT_GROUP_AD_IMAGE_TAG`, `PRODUCT_GROUP_AD_VIDEO_TAG`, `VIDEO_3SEC_VIEWS_1`, `VIDEO_15SEC_UNIQUE_VIEWS_1`, `VIDEO_MRC_VIEWS_1`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_15SEC_UNIQUE_VIEWS_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `VIDEO_MRC_VIEWS_2`, `PAID_VIDEO_VIEWABLE_RATE`, `VIDEO_LENGTH`, `VIDEO_SPEND_IN_DOLLAR`, `ECPV_IN_DOLLAR`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_15SEC_UNIQUE_VIEWS`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_REPIN_RATE`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `INAPP_CHECKOUT_COST_PER_ACTION`, `TOTAL_OFFLINE_CHECKOUT`, `TOTAL_APP_INSTALL_CONVERSION_RATE`, `TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `LEADS`, `COST_PER_LEAD`, `QUIZ_COMPLETED`, `QUIZ_PIN_RESULT_OPEN`, `QUIZ_COMPLETION_RATE`, `SHOWCASE_PIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_CLICKTHROUGH`, `SHOWCASE_SUBPIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_IMPRESSION`, `SHOWCASE_SUBPIN_IMPRESSION`, `SHOWCASE_SUBPAGE_SWIPE_LEFT`, `SHOWCASE_SUBPAGE_SWIPE_RIGHT`, `SHOWCASE_SUBPIN_SWIPE_LEFT`, `SHOWCASE_SUBPIN_SWIPE_RIGHT`, `SHOWCASE_SUBPAGE_REPIN`, `SHOWCASE_SUBPIN_REPIN`, `SHOWCASE_SUBPAGE_CLOSEUP`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD`, `SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION`, `TOTAL_CHECKOUT_CONVERSION_RATE`, `TOTAL_VIEW_CATEGORY_CONVERSION_RATE`, `TOTAL_ADD_TO_CART_CONVERSION_RATE`, `TOTAL_SIGNUP_CONVERSION_RATE`, `TOTAL_PAGE_VISIT_CONVERSION_RATE`, `TOTAL_LEAD_CONVERSION_RATE`, `TOTAL_SEARCH_CONVERSION_RATE`, `TOTAL_WATCH_VIDEO_CONVERSION_RATE`, `TOTAL_UNKNOWN_CONVERSION_RATE`, `TOTAL_CUSTOM_CONVERSION_RATE` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [Enum: SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, OUTBOUND_CTR_1, CAMPAIGN_NAME, CAMPAIGN_BRAND_LABEL, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_NAME, AD_GROUP_BUDGET_TYPE, AD_GROUP_BUDGET_IN_LOCAL_CURRENCY, AD_GROUP_ENTITY_STATUS, AD_GROUP_BID_MULTIPLIER, PROMO_ID, PROMO_NAME, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, AD_NAME, CAMPAIGN_LIFETIME_SPEND_CAP, AD_GROUP_OPTIMIZATION, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_BUDGET_OPTIMIZATION, IS_PREMIERE_CAMPAIGN, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_ADD_TO_WISHLIST, TOTAL_SUBSCRIBE, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, PRODUCT_GROUP_AD_IMAGE_TAG, PRODUCT_GROUP_AD_VIDEO_TAG, VIDEO_3SEC_VIEWS_1, VIDEO_15SEC_UNIQUE_VIEWS_1, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_15SEC_UNIQUE_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, PAID_VIDEO_VIEWABLE_RATE, VIDEO_LENGTH, VIDEO_SPEND_IN_DOLLAR, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_15SEC_UNIQUE_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, TOTAL_APP_INSTALL_CONVERSION_RATE, TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_PIN_RESULT_OPEN, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE] |
| **granularity** | `Granularity` | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **aggregateReportRows** | `boolean` | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `false`] |
| **reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `undefined`] [Enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**Array&lt;CampaignsAnalyticsResponseInner&gt;**](CampaignsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account campaign analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## campaignsCreate

> CampaignCreateResponse campaignsCreate(adAccountId, campaignCreateRequest)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-your-campaign/\&quot;&gt;Set up your campaign&lt;/a&gt;. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt; - The values for \&#39;lifetime_spend_cap\&#39; and \&#39;daily_spend_cap\&#39; are microcurrency amounts based on the currency field set in the advertiser\&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { CampaignsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<CampaignCreateRequest> | Array of campaigns.
    campaignCreateRequest: ...,
  } satisfies CampaignsCreateRequest;

  try {
    const data = await api.campaignsCreate(body);
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
| **campaignCreateRequest** | `Array<CampaignCreateRequest>` | Array of campaigns. | |

### Return type

[**CampaignCreateResponse**](CampaignCreateResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## campaignsGet

> CampaignResponse campaignsGet(adAccountId, campaignId)

Get campaign

Get a specific campaign given the campaign ID.

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { CampaignsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Campaign ID, must be associated with the ad account ID provided in the path.
    campaignId: campaignId_example,
  } satisfies CampaignsGetRequest;

  try {
    const data = await api.campaignsGet(body);
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
| **campaignId** | `string` | Campaign ID, must be associated with the ad account ID provided in the path. | [Defaults to `undefined`] |

### Return type

[**CampaignResponse**](CampaignResponse.md)

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


## campaignsList

> CampaignsList200Response campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark)

List campaigns

Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { CampaignsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Campaign Ids to use to filter the results. (optional)
    campaignIds: ...,
    // Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'> | Entity status (optional)
    entityStatuses: ...,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // 'ASCENDING' | 'DESCENDING' | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ASCENDING,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
  } satisfies CampaignsListRequest;

  try {
    const data = await api.campaignsList(body);
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
| **campaignIds** | `Array<string>` | List of Campaign Ids to use to filter the results. | [Optional] |
| **entityStatuses** | `ACTIVE`, `PAUSED`, `ARCHIVED`, `DRAFT`, `DELETED_DRAFT` | Entity status | [Optional] [Enum: ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **order** | `ASCENDING`, `DESCENDING` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account campaign parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## campaignsUpdate

> CampaignUpdateResponse campaignsUpdate(adAccountId, campaignUpdateRequest)

Update campaigns

&lt;p&gt;Update multiple ad campaigns based on campaign_ids. &lt;/p&gt; &lt;p&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/p&gt; - &lt;p&gt;The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser\&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;

### Example

```ts
import {
  Configuration,
  CampaignsApi,
} from '';
import type { CampaignsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CampaignsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<CampaignUpdateRequest> | Array of campaigns.
    campaignUpdateRequest: ...,
  } satisfies CampaignsUpdateRequest;

  try {
    const data = await api.campaignsUpdate(body);
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
| **campaignUpdateRequest** | `Array<CampaignUpdateRequest>` | Array of campaigns. | |

### Return type

[**CampaignUpdateResponse**](CampaignUpdateResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

