# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**campaignTargetingAnalytics/get**](CampaignsApi.md#campaignTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**campaigns/analytics**](CampaignsApi.md#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaigns/create**](CampaignsApi.md#campaigns/create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**campaigns/get**](CampaignsApi.md#campaigns/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**campaigns/list**](CampaignsApi.md#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**campaigns/update**](CampaignsApi.md#campaigns/update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |


<a name="campaignTargetingAnalytics/get"></a>
# **campaignTargetingAnalytics/get**
> MetricsResponse campaignTargetingAnalytics/get(ad\_account\_id, campaign\_ids, start\_date, end\_date, targeting\_types, columns, granularity, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, attribution\_types)

Get targeting analytics for campaigns

    Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **targeting\_types** | [**List**](../Models/AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | [default to null] |
| **columns** | [**List**](../Models/String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null] [enum: ADVERTISER_ID, PIN_PROMOTION_ID, AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_OFFLINE_CHECKOUT, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, WEB_SESSIONS_1, WEB_SESSIONS_2] |
| **granularity** | [**Granularity**](../Models/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **click\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 1, 7, 30, 60] |
| **engagement\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 1, 7, 30, 60] |
| **view\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 1, 7, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attribution\_types** | [**ConversionReportAttributionType**](../Models/.md)| List of types of attribution for the conversion report | [optional] [default to null] [enum: INDIVIDUAL, HOUSEHOLD] |

### Return type

[**MetricsResponse**](../Models/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="campaigns/analytics"></a>
# **campaigns/analytics**
> List campaigns/analytics(ad\_account\_id, start\_date, end\_date, campaign\_ids, columns, granularity, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time)

Get campaign analytics

    Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [default to null] |
| **columns** | [**List**](../Models/String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null] [enum: ADVERTISER_ID, PIN_PROMOTION_ID, AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_OFFLINE_CHECKOUT, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, WEB_SESSIONS_1, WEB_SESSIONS_2] |
| **granularity** | [**Granularity**](../Models/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **click\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 1, 7, 30, 60] |
| **engagement\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 1, 7, 30, 60] |
| **view\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 1, 7, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |

### Return type

[**List**](../Models/CampaignsAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="campaigns/create"></a>
# **campaigns/create**
> CampaignCreateResponse campaigns/create(ad\_account\_id, CampaignCreateRequest)

Create campaigns

    Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-your-campaign/\&quot;&gt;Set up your campaign&lt;/a&gt;. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt; - The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **CampaignCreateRequest** | [**List**](../Models/CampaignCreateRequest.md)| Array of campaigns. | |

### Return type

[**CampaignCreateResponse**](../Models/CampaignCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="campaigns/get"></a>
# **campaigns/get**
> CampaignResponse campaigns/get(ad\_account\_id, campaign\_id)

Get campaign

    Get a specific campaign given the campaign ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_id** | **String**| Campaign ID, must be associated with the ad account ID provided in the path. | [default to null] |

### Return type

[**CampaignResponse**](../Models/CampaignResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="campaigns/list"></a>
# **campaigns/list**
> campaigns_list_200_response campaigns/list(ad\_account\_id, campaign\_ids, entity\_statuses, page\_size, order, bookmark)

List campaigns

    Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/String.md)| Entity status | [optional] [default to null] [enum: ACTIVE, PAUSED, ARCHIVED] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**campaigns_list_200_response**](../Models/campaigns_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="campaigns/update"></a>
# **campaigns/update**
> CampaignUpdateResponse campaigns/update(ad\_account\_id, CampaignUpdateRequest)

Update campaigns

    Update multiple ad campaigns based on campaign_ids. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; - &lt;p&gt;The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **CampaignUpdateRequest** | [**List**](../Models/CampaignUpdateRequest.md)| Array of campaigns. | |

### Return type

[**CampaignUpdateResponse**](../Models/CampaignUpdateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

