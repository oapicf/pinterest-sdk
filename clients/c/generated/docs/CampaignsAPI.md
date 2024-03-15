# CampaignsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CampaignsAPI_campaignTargetingAnalyticsGet**](CampaignsAPI.md#CampaignsAPI_campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**CampaignsAPI_campaignsAnalytics**](CampaignsAPI.md#CampaignsAPI_campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsAPI_campaignsCreate**](CampaignsAPI.md#CampaignsAPI_campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**CampaignsAPI_campaignsGet**](CampaignsAPI.md#CampaignsAPI_campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**CampaignsAPI_campaignsList**](CampaignsAPI.md#CampaignsAPI_campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**CampaignsAPI_campaignsUpdate**](CampaignsAPI.md#CampaignsAPI_campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns


# **CampaignsAPI_campaignTargetingAnalyticsGet**
```c
// Get targeting analytics for campaigns
//
// Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
//
metrics_response_t* CampaignsAPI_campaignTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_campaignTargetingAnalyticsGet_conversion_report_time_e conversion_report_time, conversion_report_attribution_type_e attribution_types);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | 
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**targeting_types** | **[list_t](ads_analytics_targeting_type.md) \*** | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | 
**columns** | **[list_t](char.md) \*** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | **granularity_e** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**click_window_days** | **int \*** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | **int \*** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**view_window_days** | **int \*** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | **pinterest_rest_api_campaignTargetingAnalyticsGet_conversion_report_time_e** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
**attribution_types** | **conversion_report_attribution_type_e** | List of types of attribution for the conversion report | [optional] 

### Return type

[metrics_response_t](metrics_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CampaignsAPI_campaignsAnalytics**
```c
// Get campaign analytics
//
// Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
//
list_t* CampaignsAPI_campaignsAnalytics(apiClient_t *apiClient, char *ad_account_id, char start_date, char end_date, list_t *campaign_ids, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_campaignsAnalytics_conversion_report_time_e conversion_report_time);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | 
**columns** | **[list_t](char.md) \*** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | **granularity_e** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**click_window_days** | **int \*** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | **int \*** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**view_window_days** | **int \*** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | **pinterest_rest_api_campaignsAnalytics_conversion_report_time_e** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[list_t](campaigns_analytics_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CampaignsAPI_campaignsCreate**
```c
// Create campaigns
//
// Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
//
campaign_create_response_t* CampaignsAPI_campaignsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_create_request** | **[list_t](campaign_create_request.md) \*** | Array of campaigns. | 

### Return type

[campaign_create_response_t](campaign_create_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CampaignsAPI_campaignsGet**
```c
// Get campaign
//
// Get a specific campaign given the campaign ID.
//
campaign_response_t* CampaignsAPI_campaignsGet(apiClient_t *apiClient, char *ad_account_id, char *campaign_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_id** | **char \*** | Campaign ID, must be associated with the ad account ID provided in the path. | 

### Return type

[campaign_response_t](campaign_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CampaignsAPI_campaignsList**
```c
// List campaigns
//
// Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
//
campaigns_list_200_response_t* CampaignsAPI_campaignsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *entity_statuses, int *page_size, pinterest_rest_api_campaignsList_order_e order, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | [optional] 
**entity_statuses** | **[list_t](char.md) \*** | Entity status | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**order** | **pinterest_rest_api_campaignsList_order_e** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[campaigns_list_200_response_t](campaigns_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CampaignsAPI_campaignsUpdate**
```c
// Update campaigns
//
// Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
//
campaign_update_response_t* CampaignsAPI_campaignsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_update_request** | **[list_t](campaign_update_request.md) \*** | Array of campaigns. | 

### Return type

[campaign_update_response_t](campaign_update_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

