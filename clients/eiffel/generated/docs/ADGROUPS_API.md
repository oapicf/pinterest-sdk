# ADGROUPS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_groups_analytics**](ADGROUPS_API.md#ad_groups_analytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**ad_groups_audience_sizing**](ADGROUPS_API.md#ad_groups_audience_sizing) | **Post** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**ad_groups_bid_floor_get**](ADGROUPS_API.md#ad_groups_bid_floor_get) | **Post** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**ad_groups_by_promotion_ids_list**](ADGROUPS_API.md#ad_groups_by_promotion_ids_list) | **Get** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
[**ad_groups_create**](ADGROUPS_API.md#ad_groups_create) | **Post** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**ad_groups_dynamic_titles_download_csv**](ADGROUPS_API.md#ad_groups_dynamic_titles_download_csv) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**ad_groups_dynamic_titles_get_status**](ADGROUPS_API.md#ad_groups_dynamic_titles_get_status) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**ad_groups_dynamic_titles_get_upload_url**](ADGROUPS_API.md#ad_groups_dynamic_titles_get_upload_url) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**ad_groups_dynamic_titles_process_csv**](ADGROUPS_API.md#ad_groups_dynamic_titles_process_csv) | **Post** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**ad_groups_get**](ADGROUPS_API.md#ad_groups_get) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**ad_groups_list**](ADGROUPS_API.md#ad_groups_list) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**ad_groups_targeting_analytics_get**](ADGROUPS_API.md#ad_groups_targeting_analytics_get) | **Get** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**ad_groups_update**](ADGROUPS_API.md#ad_groups_update) | **Patch** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups


# **ad_groups_analytics**
> ad_groups_analytics (start_date: DATE ; end_date: DATE ; ad_group_ids: LIST [STRING_32] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; ad_account_id: STRING_32 ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; aggregate_report_rows:  detachable BOOLEAN ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable LIST [AD_GROUPS_ANALYTICS_METRICS]


Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [default to null]
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

[**LIST [AD_GROUPS_ANALYTICS_METRICS]**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_audience_sizing**
> ad_groups_audience_sizing (ad_account_id: STRING_32 ; ad_group_audience_sizing_create: AD_GROUP_AUDIENCE_SIZING_CREATE ): detachable AD_GROUP_AUDIENCE_SIZING


Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_audience_sizing_create** | [**AD_GROUP_AUDIENCE_SIZING_CREATE**](AD_GROUP_AUDIENCE_SIZING_CREATE.md)|  | 

### Return type

[**AD_GROUP_AUDIENCE_SIZING**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_bid_floor_get**
> ad_groups_bid_floor_get (ad_account_id: STRING_32 ; bid_floor_create: BID_FLOOR_CREATE ): detachable BID_FLOOR


Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bid_floor_create** | [**BID_FLOOR_CREATE**](BID_FLOOR_CREATE.md)|  | 

### Return type

[**BID_FLOOR**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_by_promotion_ids_list**
> ad_groups_by_promotion_ids_list (ad_account_id: STRING_32 ; promotion_ids: LIST [STRING_32] ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ): detachable AD_GROUPS_LIST_200_RESPONSE


List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **promotion_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Promotion IDs to use to filter the results. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]

### Return type

[**AD_GROUPS_LIST_200_RESPONSE**](ad_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_create**
> ad_groups_create (ad_account_id: STRING_32 ; ad_group_create_create: LIST [AD_GROUP_CREATE_CREATE] ): detachable AD_GROUPS_CREATE_200_RESPONSE


Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_create_create** | [**LIST [AD_GROUP_CREATE_CREATE]**](AdGroupCreateCreate.md)|  | 

### Return type

[**AD_GROUPS_CREATE_200_RESPONSE**](ad_groups_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_download_csv**
> ad_groups_dynamic_titles_download_csv (ad_account_id: STRING_32 ; ad_group_id: STRING_32 ): detachable DYNAMIC_TITLES_DOWNLOAD_CSV


Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_id** | **STRING_32**| Ad group ID. | [default to null]

### Return type

[**DYNAMIC_TITLES_DOWNLOAD_CSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_get_status**
> ad_groups_dynamic_titles_get_status (ad_account_id: STRING_32 ; ad_group_id: STRING_32 ): detachable DYNAMIC_TITLES_GET_STATUS


Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_id** | **STRING_32**| Ad group ID. | [default to null]

### Return type

[**DYNAMIC_TITLES_GET_STATUS**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_get_upload_url**
> ad_groups_dynamic_titles_get_upload_url (ad_account_id: STRING_32 ; ad_group_id: STRING_32 ): detachable DYNAMIC_TITLES_UPLOAD_URL


Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_id** | **STRING_32**| Ad group ID. | [default to null]

### Return type

[**DYNAMIC_TITLES_UPLOAD_URL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_process_csv**
> ad_groups_dynamic_titles_process_csv (ad_account_id: STRING_32 ; ad_group_id: STRING_32 ; dynamic_titles_process_csv_create: DYNAMIC_TITLES_PROCESS_CSV_CREATE ): detachable DYNAMIC_TITLES_PROCESS_CSV


Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_id** | **STRING_32**| Ad group ID. | [default to null]
 **dynamic_titles_process_csv_create** | [**DYNAMIC_TITLES_PROCESS_CSV_CREATE**](DYNAMIC_TITLES_PROCESS_CSV_CREATE.md)|  | 

### Return type

[**DYNAMIC_TITLES_PROCESS_CSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_get**
> ad_groups_get (ad_group_id: STRING_32 ; ad_account_id: STRING_32 ): detachable AD_GROUP


Get ad group

Get a specific ad group given the ad group ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_id** | **STRING_32**| Ad group ID. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**AD_GROUP**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_list**
> ad_groups_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; campaign_ids:  detachable LIST [STRING_32] ; ad_group_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [ENTITY_STATUS] ; translate_interests_to_names:  detachable BOOLEAN ): detachable AD_GROUPS_LIST_200_RESPONSE


List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] [default to null]
 **entity_statuses** | [**LIST [ENTITY_STATUS]**](ENTITY_STATUS.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **translate_interests_to_names** | **BOOLEAN**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**AD_GROUPS_LIST_200_RESPONSE**](ad_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_targeting_analytics_get**
> ad_groups_targeting_analytics_get (ad_account_id: STRING_32 ; ad_group_ids: LIST [STRING_32] ; start_date: DATE ; end_date: DATE ; targeting_types: LIST [ADS_ANALYTICS_AD_GROUP_TARGETING_TYPE] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; attribution_types:  detachable LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE] ; reporting_timezone:  detachable REPORTING_TIME_ZONE ; sort_columns:  detachable LIST [STRING_32] ; sort_ascending:  detachable BOOLEAN ): detachable METRICS_RESPONSE


Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targeting_types** | [**LIST [ADS_ANALYTICS_AD_GROUP_TARGETING_TYPE]**](ADS_ANALYTICS_AD_GROUP_TARGETING_TYPE.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **attribution_types** | [**LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]**](CONVERSION_REPORT_ATTRIBUTION_TYPE.md)| List of types of attribution for the conversion report | [optional] [default to null]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]
 **sort_columns** | [**LIST [STRING_32]**](STRING_32.md)| Sort Columns. | [optional] [default to null]
 **sort_ascending** | **BOOLEAN**| Sort ascending. | [optional] [default to null]

### Return type

[**METRICS_RESPONSE**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_update**
> ad_groups_update (ad_account_id: STRING_32 ; ad_group_update_batch_update: LIST [AD_GROUP_UPDATE_BATCH_UPDATE] ): detachable AD_GROUPS_CREATE_200_RESPONSE


Update ad groups

Update multiple existing ad groups.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_group_update_batch_update** | [**LIST [AD_GROUP_UPDATE_BATCH_UPDATE]**](AdGroupUpdateBatchUpdate.md)|  | 

### Return type

[**AD_GROUPS_CREATE_200_RESPONSE**](ad_groups_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

