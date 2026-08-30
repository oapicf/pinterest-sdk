# AdGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdGroupsAPI_adGroupsAnalytics**](AdGroupsAPI.md#AdGroupsAPI_adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsAPI_adGroupsAudienceSizing**](AdGroupsAPI.md#AdGroupsAPI_adGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**AdGroupsAPI_adGroupsBidFloorGet**](AdGroupsAPI.md#AdGroupsAPI_adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**AdGroupsAPI_adGroupsCreate**](AdGroupsAPI.md#AdGroupsAPI_adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**AdGroupsAPI_adGroupsDynamicTitlesDownloadCsv**](AdGroupsAPI.md#AdGroupsAPI_adGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**AdGroupsAPI_adGroupsDynamicTitlesGetStatus**](AdGroupsAPI.md#AdGroupsAPI_adGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**AdGroupsAPI_adGroupsDynamicTitlesGetUploadUrl**](AdGroupsAPI.md#AdGroupsAPI_adGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**AdGroupsAPI_adGroupsDynamicTitlesProcessCsv**](AdGroupsAPI.md#AdGroupsAPI_adGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**AdGroupsAPI_adGroupsGet**](AdGroupsAPI.md#AdGroupsAPI_adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**AdGroupsAPI_adGroupsList**](AdGroupsAPI.md#AdGroupsAPI_adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdGroupsAPI_adGroupsTargetingAnalyticsGet**](AdGroupsAPI.md#AdGroupsAPI_adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**AdGroupsAPI_adGroupsUpdate**](AdGroupsAPI.md#AdGroupsAPI_adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**AdGroupsAPI_getAdGroupsByPromotionIdsList**](AdGroupsAPI.md#AdGroupsAPI_getAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


# **AdGroupsAPI_adGroupsAnalytics**
```c
// Get ad group analytics
//
// Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
list_t* AdGroupsAPI_adGroupsAnalytics(apiClient_t *apiClient, char start_date, char end_date, list_t *ad_group_ids, list_t *columns, granularity_e granularity, char *ad_account_id, double click_window_days, double engagement_window_days, double view_window_days, pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e conversion_report_time, int *aggregate_report_rows, reporting_time_zone_e reporting_timezone);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**ad_group_ids** | **[list_t](char.md) \*** | List of Ad group Ids to use to filter the results. | 
**columns** | **[list_t](reporting_column_sync.md) \*** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
**granularity** | **granularity_e** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**click_window_days** | **double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | **double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
**view_window_days** | **double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | **pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
**aggregate_report_rows** | **int \*** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
**reporting_timezone** | **reporting_time_zone_e** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[list_t](ad_groups_analytics_metrics.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsAudienceSizing**
```c
// Get audience sizing
//
// Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
//
ad_group_audience_sizing_t* AdGroupsAPI_adGroupsAudienceSizing(apiClient_t *apiClient, char *ad_account_id, ad_group_audience_sizing_create_t *ad_group_audience_sizing_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_audience_sizing_create** | **[ad_group_audience_sizing_create_t](ad_group_audience_sizing_create.md) \*** |  | 

### Return type

[ad_group_audience_sizing_t](ad_group_audience_sizing.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsBidFloorGet**
```c
// Get bid floors
//
// List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
//
bid_floor_t* AdGroupsAPI_adGroupsBidFloorGet(apiClient_t *apiClient, char *ad_account_id, bid_floor_create_t *bid_floor_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bid_floor_create** | **[bid_floor_create_t](bid_floor_create.md) \*** |  | 

### Return type

[bid_floor_t](bid_floor.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsCreate**
```c
// Create ad groups
//
// Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
//
ad_groups_create_200_response_t* AdGroupsAPI_adGroupsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_group_create_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_create_create** | **[list_t](ad_group_create_create.md) \*** |  | 

### Return type

[ad_groups_create_200_response_t](ad_groups_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsDynamicTitlesDownloadCsv**
```c
// Get dynamic titles CSV download URL
//
// Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
//
dynamic_titles_download_csv_t* AdGroupsAPI_adGroupsDynamicTitlesDownloadCsv(apiClient_t *apiClient, char *ad_account_id, char *ad_group_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_id** | **char \*** | Ad group ID. | 

### Return type

[dynamic_titles_download_csv_t](dynamic_titles_download_csv.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsDynamicTitlesGetStatus**
```c
// Get dynamic titles status
//
// Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
//
dynamic_titles_get_status_t* AdGroupsAPI_adGroupsDynamicTitlesGetStatus(apiClient_t *apiClient, char *ad_account_id, char *ad_group_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_id** | **char \*** | Ad group ID. | 

### Return type

[dynamic_titles_get_status_t](dynamic_titles_get_status.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsDynamicTitlesGetUploadUrl**
```c
// Get dynamic titles upload URL
//
// Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
//
dynamic_titles_upload_url_t* AdGroupsAPI_adGroupsDynamicTitlesGetUploadUrl(apiClient_t *apiClient, char *ad_account_id, char *ad_group_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_id** | **char \*** | Ad group ID. | 

### Return type

[dynamic_titles_upload_url_t](dynamic_titles_upload_url.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsDynamicTitlesProcessCsv**
```c
// Process dynamic titles CSV
//
// Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
//
dynamic_titles_process_csv_t* AdGroupsAPI_adGroupsDynamicTitlesProcessCsv(apiClient_t *apiClient, char *ad_account_id, char *ad_group_id, dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_id** | **char \*** | Ad group ID. | 
**dynamic_titles_process_csv_create** | **[dynamic_titles_process_csv_create_t](dynamic_titles_process_csv_create.md) \*** |  | 

### Return type

[dynamic_titles_process_csv_t](dynamic_titles_process_csv.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsGet**
```c
// Get ad group
//
// Get a specific ad group given the ad group ID.
//
ad_group_t* AdGroupsAPI_adGroupsGet(apiClient_t *apiClient, char *ad_group_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_group_id** | **char \*** | Ad group ID. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[ad_group_t](ad_group.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsList**
```c
// List ad groups
//
// List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
//
ad_groups_list_200_response_t* AdGroupsAPI_adGroupsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, list_t *campaign_ids, list_t *ad_group_ids, list_t *entity_statuses, int *translate_interests_to_names);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | [optional] 
**ad_group_ids** | **[list_t](char.md) \*** | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
**entity_statuses** | **[list_t](entity_status.md) \*** | Entity status | [optional] 
**translate_interests_to_names** | **int \*** | Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[ad_groups_list_200_response_t](ad_groups_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsTargetingAnalyticsGet**
```c
// Get targeting analytics for ad groups
//
// Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
metrics_response_t* AdGroupsAPI_adGroupsTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, list_t *ad_group_ids, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, double click_window_days, double engagement_window_days, double view_window_days, pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e conversion_report_time, list_t *attribution_types, reporting_time_zone_e reporting_timezone, list_t *sort_columns, int *sort_ascending);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_ids** | **[list_t](char.md) \*** | List of Ad group Ids to use to filter the results. | 
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**targeting_types** | **[list_t](ads_analytics_ad_group_targeting_type.md) \*** | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | 
**columns** | **[list_t](reporting_column_sync.md) \*** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
**granularity** | **granularity_e** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
**click_window_days** | **double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | **double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
**view_window_days** | **double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | **pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
**attribution_types** | **[list_t](conversion_report_attribution_type.md) \*** | List of types of attribution for the conversion report | [optional] 
**reporting_timezone** | **reporting_time_zone_e** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
**sort_columns** | **[list_t](char.md) \*** | Sort Columns. | [optional] 
**sort_ascending** | **int \*** | Sort ascending. | [optional] 

### Return type

[metrics_response_t](metrics_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_adGroupsUpdate**
```c
// Update ad groups
//
// Update multiple existing ad groups.
//
ad_groups_create_200_response_t* AdGroupsAPI_adGroupsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_group_update_batch_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_group_update_batch_update** | **[list_t](ad_group_update_batch_update.md) \*** |  | 

### Return type

[ad_groups_create_200_response_t](ad_groups_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdGroupsAPI_getAdGroupsByPromotionIdsList**
```c
// List of ad groups using promotions IDs.
//
//   Get a list of ad groups that are associated with those promotion ids
//
ad_groups_list_200_response_t* AdGroupsAPI_getAdGroupsByPromotionIdsList(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_ids, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**promotion_ids** | **[list_t](char.md) \*** | List of Promotion IDs to use to filter the results. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[ad_groups_list_200_response_t](ad_groups_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

