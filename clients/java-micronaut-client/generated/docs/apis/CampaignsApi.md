# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**campaignTargetingAnalyticsGet**](CampaignsApi.md#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**campaignsAnalytics**](CampaignsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaignsCreate**](CampaignsApi.md#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**campaignsGet**](CampaignsApi.md#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**campaignsList**](CampaignsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**campaignsUpdate**](CampaignsApi.md#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |


## Creating CampaignsApi

To initiate an instance of `CampaignsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CampaignsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CampaignsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CampaignsApi campaignsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="campaignTargetingAnalyticsGet"></a>
# **campaignTargetingAnalyticsGet**
```java
Mono<MetricsResponse> CampaignsApi.campaignTargetingAnalyticsGet(adAccountIdcampaignIdsstartDateendDatetargetingTypescolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimeattributionTypes)
```

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | |
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **targetingTypes** | [**List&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | |
| **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `SPEND_IN_MICRO_DOLLAR`, `PAID_IMPRESSION`, `SPEND_IN_DOLLAR`, `CPC_IN_MICRO_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPC_IN_DOLLAR`, `CTR`, `ECTR`, `CAMPAIGN_NAME`, `PIN_ID`, `TOTAL_ENGAGEMENT`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ECPE_IN_DOLLAR`, `ENGAGEMENT_RATE`, `EENGAGEMENT_RATE`, `ECPM_IN_MICRO_DOLLAR`, `REPIN_RATE`, `CTR_2`, `CAMPAIGN_ID`, `ADVERTISER_ID`, `AD_ACCOUNT_ID`, `PIN_PROMOTION_ID`, `AD_ID`, `AD_GROUP_ID`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_OBJECTIVE_TYPE`, `CPM_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `AD_GROUP_ENTITY_STATUS`, `ORDER_LINE_ID`, `ORDER_LINE_NAME`, `CLICKTHROUGH_1`, `REPIN_1`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `CLICKTHROUGH_1_GROSS`, `OUTBOUND_CLICK_1`, `CLICKTHROUGH_2`, `REPIN_2`, `IMPRESSION_2`, `OUTBOUND_CLICK_2`, `TOTAL_CLICKTHROUGH`, `TOTAL_IMPRESSION`, `TOTAL_IMPRESSION_USER`, `TOTAL_IMPRESSION_FREQUENCY`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_ADD_TO_CART`, `TOTAL_CLICK_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_ADD_TO_CART`, `TOTAL_VIEW_LEAD`, `TOTAL_CONVERSIONS`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_SESSIONS`, `WEB_SESSIONS_1`, `WEB_SESSIONS_2`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_DAILY_SPEND_CAP`, `TOTAL_PAGE_VISIT`, `TOTAL_SIGNUP`, `TOTAL_CHECKOUT`, `TOTAL_CUSTOM`, `TOTAL_LEAD`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `CHECKOUT_ROAS`, `CUSTOM_ROAS`, `VIDEO_MRC_VIEWS_1`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `VIDEO_MRC_VIEWS_2`, `VIDEO_LENGTH`, `ECPV_IN_DOLLAR`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_REPIN_RATE`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `INAPP_CHECKOUT_COST_PER_ACTION`, `TOTAL_OFFLINE_CHECKOUT`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `LEADS`, `COST_PER_LEAD`, `QUIZ_COMPLETED`, `QUIZ_COMPLETION_RATE`, `SHOWCASE_PIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_CLICKTHROUGH`, `SHOWCASE_SUBPIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_IMPRESSION`, `SHOWCASE_SUBPIN_IMPRESSION`, `SHOWCASE_SUBPAGE_SWIPE_LEFT`, `SHOWCASE_SUBPAGE_SWIPE_RIGHT`, `SHOWCASE_SUBPIN_SWIPE_LEFT`, `SHOWCASE_SUBPIN_SWIPE_RIGHT`, `SHOWCASE_SUBPAGE_REPIN`, `SHOWCASE_SUBPIN_REPIN`, `SHOWCASE_SUBPAGE_CLOSEUP`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD`, `SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION`, `TOTAL_CHECKOUT_CONVERSION_RATE`, `TOTAL_VIEW_CATEGORY_CONVERSION_RATE`, `TOTAL_ADD_TO_CART_CONVERSION_RATE`, `TOTAL_SIGNUP_CONVERSION_RATE`, `TOTAL_PAGE_VISIT_CONVERSION_RATE`, `TOTAL_LEAD_CONVERSION_RATE`, `TOTAL_SEARCH_CONVERSION_RATE`, `TOTAL_WATCH_VIDEO_CONVERSION_RATE`, `TOTAL_UNKNOWN_CONVERSION_RATE`, `TOTAL_CUSTOM_CONVERSION_RATE`] |
| **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |
| **attributionTypes** | [**ConversionReportAttributionType**](.md)| List of types of attribution for the conversion report | [optional parameter] [enum: `INDIVIDUAL`, `HOUSEHOLD`] |


### Return type
[**MetricsResponse**](MetricsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="campaignsAnalytics"></a>
# **campaignsAnalytics**
```java
Mono<List<CampaignsAnalyticsResponseInner>> CampaignsApi.campaignsAnalytics(adAccountIdstartDateendDatecampaignIdscolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get campaign analytics

Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | |
| **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `SPEND_IN_MICRO_DOLLAR`, `PAID_IMPRESSION`, `SPEND_IN_DOLLAR`, `CPC_IN_MICRO_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPC_IN_DOLLAR`, `CTR`, `ECTR`, `CAMPAIGN_NAME`, `PIN_ID`, `TOTAL_ENGAGEMENT`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ECPE_IN_DOLLAR`, `ENGAGEMENT_RATE`, `EENGAGEMENT_RATE`, `ECPM_IN_MICRO_DOLLAR`, `REPIN_RATE`, `CTR_2`, `CAMPAIGN_ID`, `ADVERTISER_ID`, `AD_ACCOUNT_ID`, `PIN_PROMOTION_ID`, `AD_ID`, `AD_GROUP_ID`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_OBJECTIVE_TYPE`, `CPM_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `AD_GROUP_ENTITY_STATUS`, `ORDER_LINE_ID`, `ORDER_LINE_NAME`, `CLICKTHROUGH_1`, `REPIN_1`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `CLICKTHROUGH_1_GROSS`, `OUTBOUND_CLICK_1`, `CLICKTHROUGH_2`, `REPIN_2`, `IMPRESSION_2`, `OUTBOUND_CLICK_2`, `TOTAL_CLICKTHROUGH`, `TOTAL_IMPRESSION`, `TOTAL_IMPRESSION_USER`, `TOTAL_IMPRESSION_FREQUENCY`, `COST_PER_OUTBOUND_CLICK_IN_DOLLAR`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_ADD_TO_CART`, `TOTAL_CLICK_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_ADD_TO_CART`, `TOTAL_VIEW_LEAD`, `TOTAL_CONVERSIONS`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_SESSIONS`, `WEB_SESSIONS_1`, `WEB_SESSIONS_2`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_DAILY_SPEND_CAP`, `TOTAL_PAGE_VISIT`, `TOTAL_SIGNUP`, `TOTAL_CHECKOUT`, `TOTAL_CUSTOM`, `TOTAL_LEAD`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `CHECKOUT_ROAS`, `CUSTOM_ROAS`, `VIDEO_MRC_VIEWS_1`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `VIDEO_MRC_VIEWS_2`, `VIDEO_LENGTH`, `ECPV_IN_DOLLAR`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_REPIN_RATE`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `INAPP_CHECKOUT_COST_PER_ACTION`, `TOTAL_OFFLINE_CHECKOUT`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `LEADS`, `COST_PER_LEAD`, `QUIZ_COMPLETED`, `QUIZ_COMPLETION_RATE`, `SHOWCASE_PIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_CLICKTHROUGH`, `SHOWCASE_SUBPIN_CLICKTHROUGH`, `SHOWCASE_SUBPAGE_IMPRESSION`, `SHOWCASE_SUBPIN_IMPRESSION`, `SHOWCASE_SUBPAGE_SWIPE_LEFT`, `SHOWCASE_SUBPAGE_SWIPE_RIGHT`, `SHOWCASE_SUBPIN_SWIPE_LEFT`, `SHOWCASE_SUBPIN_SWIPE_RIGHT`, `SHOWCASE_SUBPAGE_REPIN`, `SHOWCASE_SUBPIN_REPIN`, `SHOWCASE_SUBPAGE_CLOSEUP`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD`, `SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD`, `SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION`, `TOTAL_CHECKOUT_CONVERSION_RATE`, `TOTAL_VIEW_CATEGORY_CONVERSION_RATE`, `TOTAL_ADD_TO_CART_CONVERSION_RATE`, `TOTAL_SIGNUP_CONVERSION_RATE`, `TOTAL_PAGE_VISIT_CONVERSION_RATE`, `TOTAL_LEAD_CONVERSION_RATE`, `TOTAL_SEARCH_CONVERSION_RATE`, `TOTAL_WATCH_VIDEO_CONVERSION_RATE`, `TOTAL_UNKNOWN_CONVERSION_RATE`, `TOTAL_CUSTOM_CONVERSION_RATE`] |
| **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |


### Return type
[**List&lt;CampaignsAnalyticsResponseInner&gt;**](CampaignsAnalyticsResponseInner.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="campaignsCreate"></a>
# **campaignsCreate**
```java
Mono<CampaignCreateResponse> CampaignsApi.campaignsCreate(adAccountIdcampaignCreateRequest)
```

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-your-campaign/\&quot;&gt;Set up your campaign&lt;/a&gt;. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt; - The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignCreateRequest** | [**List&lt;@Valid CampaignCreateRequest&gt;**](CampaignCreateRequest.md)| Array of campaigns. | |


### Return type
[**CampaignCreateResponse**](CampaignCreateResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="campaignsGet"></a>
# **campaignsGet**
```java
Mono<CampaignResponse> CampaignsApi.campaignsGet(adAccountIdcampaignId)
```

Get campaign

Get a specific campaign given the campaign ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignId** | `String`| Campaign ID, must be associated with the ad account ID provided in the path. | |


### Return type
[**CampaignResponse**](CampaignResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="campaignsList"></a>
# **campaignsList**
```java
Mono<CampaignsList200Response> CampaignsApi.campaignsList(adAccountIdcampaignIdsentityStatusespageSizeorderbookmark)
```

List campaigns

Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter] |
| **entityStatuses** | [**List&lt;String&gt;**](String.md)| Entity status | [optional parameter] [default to `ACTIVE,PAUSED`] [enum: `ACTIVE`, `PAUSED`, `ARCHIVED`, `DRAFT`, `DELETED_DRAFT`] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="campaignsUpdate"></a>
# **campaignsUpdate**
```java
Mono<CampaignUpdateResponse> CampaignsApi.campaignsUpdate(adAccountIdcampaignUpdateRequest)
```

Update campaigns

Update multiple ad campaigns based on campaign_ids. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; - &lt;p&gt;The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignUpdateRequest** | [**List&lt;@Valid CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md)| Array of campaigns. | |


### Return type
[**CampaignUpdateResponse**](CampaignUpdateResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

