# CAMPAIGNS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_pins_analytics**](CAMPAIGNS_API.md#ad_pins_analytics) | **Get** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaign_delivery_estimates**](CAMPAIGNS_API.md#campaign_delivery_estimates) | **Post** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
[**campaign_targeting_analytics_get**](CAMPAIGNS_API.md#campaign_targeting_analytics_get) | **Get** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaigns_analytics**](CAMPAIGNS_API.md#campaigns_analytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_create**](CAMPAIGNS_API.md#campaigns_create) | **Post** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaigns_get**](CAMPAIGNS_API.md#campaigns_get) | **Get** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaigns_list**](CAMPAIGNS_API.md#campaigns_list) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaigns_update**](CAMPAIGNS_API.md#campaigns_update) | **Patch** /ad_accounts/{ad_account_id}/campaigns | Update campaigns


# **ad_pins_analytics**
> ad_pins_analytics (campaign_id: STRING_32 ; pin_ids: LIST [STRING_32] ; start_date: DATE ; end_date: DATE ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; ad_account_id: STRING_32 ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [AD_PIN_ANALYTICS]


Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **STRING_32**| Campaign Id to use to filter the results. | [default to null]
 **pin_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Pin IDs. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [AD_PIN_ANALYTICS]**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_delivery_estimates**
> campaign_delivery_estimates (ad_account_id: STRING_32 ; campaign_delivery_estimates_campaign: LIST [CAMPAIGN_DELIVERY_ESTIMATES_CAMPAIGN] ): detachable CAMPAIGN_DELIVERY_ESTIMATES_RESPONSE


Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_delivery_estimates_campaign** | [**LIST [CAMPAIGN_DELIVERY_ESTIMATES_CAMPAIGN]**](CampaignDeliveryEstimatesCampaign.md)|  | 

### Return type

[**CAMPAIGN_DELIVERY_ESTIMATES_RESPONSE**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_targeting_analytics_get**
> campaign_targeting_analytics_get (ad_account_id: STRING_32 ; campaign_ids: LIST [STRING_32] ; start_date: DATE ; end_date: DATE ; targeting_types: LIST [ADS_ANALYTICS_CAMPAIGN_TARGETING_TYPE] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; attribution_types:  detachable LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE] ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable METRICS_RESPONSE


Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targeting_types** | [**LIST [ADS_ANALYTICS_CAMPAIGN_TARGETING_TYPE]**](ADS_ANALYTICS_CAMPAIGN_TARGETING_TYPE.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **attribution_types** | [**LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]**](CONVERSION_REPORT_ATTRIBUTION_TYPE.md)| List of types of attribution for the conversion report | [optional] [default to null]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**METRICS_RESPONSE**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> campaigns_analytics (start_date: DATE ; end_date: DATE ; campaign_ids: LIST [STRING_32] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; ad_account_id: STRING_32 ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; aggregate_report_rows:  detachable BOOLEAN ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable LIST [CAMPAIGNS_ANALYTICS_METRICS]


Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **aggregate_report_rows** | **BOOLEAN**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**LIST [CAMPAIGNS_ANALYTICS_METRICS]**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_create**
> campaigns_create (ad_account_id: STRING_32 ; campaign_create_item: LIST [CAMPAIGN_CREATE_ITEM] ): detachable CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL


Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_create_item** | [**LIST [CAMPAIGN_CREATE_ITEM]**](CampaignCreateItem.md)|  | 

### Return type

[**CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_get**
> campaigns_get (campaign_id: STRING_32 ; ad_account_id: STRING_32 ): detachable CAMPAIGN


Get campaign

Get a specific campaign given the campaign ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **STRING_32**| Campaign ID, must be associated with the ad account ID provided in the path. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**CAMPAIGN**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> campaigns_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; campaign_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [ENTITY_STATUS] ): detachable CAMPAIGNS_LIST_200_RESPONSE


List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [ENTITY_STATUS]**](ENTITY_STATUS.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**CAMPAIGNS_LIST_200_RESPONSE**](campaigns_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_update**
> campaigns_update (ad_account_id: STRING_32 ; campaign_batch_update_item: LIST [CAMPAIGN_BATCH_UPDATE_ITEM] ): detachable CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL


Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_batch_update_item** | [**LIST [CAMPAIGN_BATCH_UPDATE_ITEM]**](CampaignBatchUpdateItem.md)|  | 

### Return type

[**CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

