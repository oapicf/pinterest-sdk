# CAMPAIGNS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**campaign_targeting_analytics_get**](CAMPAIGNS_API.md#campaign_targeting_analytics_get) | **Get** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaigns_analytics**](CAMPAIGNS_API.md#campaigns_analytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_create**](CAMPAIGNS_API.md#campaigns_create) | **Post** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaigns_get**](CAMPAIGNS_API.md#campaigns_get) | **Get** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaigns_list**](CAMPAIGNS_API.md#campaigns_list) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaigns_update**](CAMPAIGNS_API.md#campaigns_update) | **Patch** /ad_accounts/{ad_account_id}/campaigns | Update campaigns


# **campaign_targeting_analytics_get**
> campaign_targeting_analytics_get (ad_account_id: STRING_32 ; campaign_ids: LIST [STRING_32] ; start_date: DATE ; end_date: DATE ; targeting_types: LIST [ADS_ANALYTICS_TARGETING_TYPE] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ; attribution_types:  detachable CONVERSION_REPORT_ATTRIBUTION_TYPE ): detachable METRICS_RESPONSE


Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targeting_types** | [**LIST [ADS_ANALYTICS_TARGETING_TYPE]**](ADS_ANALYTICS_TARGETING_TYPE.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **attribution_types** | [**CONVERSION_REPORT_ATTRIBUTION_TYPE**](.md)| List of types of attribution for the conversion report | [optional] [default to null]

### Return type

[**METRICS_RESPONSE**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> campaigns_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; campaign_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [CAMPAIGNS_ANALYTICS_RESPONSE_INNER]


Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [CAMPAIGNS_ANALYTICS_RESPONSE_INNER]**](CampaignsAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_create**
> campaigns_create (ad_account_id: STRING_32 ; campaign_create_request: LIST [CAMPAIGN_CREATE_REQUEST] ): detachable CAMPAIGN_CREATE_RESPONSE


Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_create_request** | [**LIST [CAMPAIGN_CREATE_REQUEST]**](CampaignCreateRequest.md)| Array of campaigns. | 

### Return type

[**CAMPAIGN_CREATE_RESPONSE**](CampaignCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_get**
> campaigns_get (ad_account_id: STRING_32 ; campaign_id: STRING_32 ): detachable CAMPAIGN_RESPONSE


Get campaign

Get a specific campaign given the campaign ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_id** | **STRING_32**| Campaign ID, must be associated with the ad account ID provided in the path. | [default to null]

### Return type

[**CAMPAIGN_RESPONSE**](CampaignResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> campaigns_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable CAMPAIGNS_LIST_200_RESPONSE


List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**CAMPAIGNS_LIST_200_RESPONSE**](campaigns_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_update**
> campaigns_update (ad_account_id: STRING_32 ; campaign_update_request: LIST [CAMPAIGN_UPDATE_REQUEST] ): detachable CAMPAIGN_UPDATE_RESPONSE


Update campaigns

Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_update_request** | [**LIST [CAMPAIGN_UPDATE_REQUEST]**](CampaignUpdateRequest.md)| Array of campaigns. | 

### Return type

[**CAMPAIGN_UPDATE_RESPONSE**](CampaignUpdateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

