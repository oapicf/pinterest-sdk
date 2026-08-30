# ADS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews_create**](ADS_API.md#ad_previews_create) | **Post** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**ad_targeting_analytics_get**](ADS_API.md#ad_targeting_analytics_get) | **Get** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**ads_analytics**](ADS_API.md#ads_analytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_create**](ADS_API.md#ads_create) | **Post** /ad_accounts/{ad_account_id}/ads | Create ads
[**ads_get**](ADS_API.md#ads_get) | **Get** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**ads_list**](ADS_API.md#ads_list) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
[**ads_update**](ADS_API.md#ads_update) | **Patch** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaign_ad_preview_create**](ADS_API.md#campaign_ad_preview_create) | **Post** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaign_ad_preview_delete**](ADS_API.md#campaign_ad_preview_delete) | **Delete** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaign_ad_preview_read**](ADS_API.md#campaign_ad_preview_read) | **Get** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **ad_previews_create**
> ad_previews_create (ad_account_id: STRING_32 ; ad_preview_request: AD_PREVIEW_REQUEST ): detachable AD_PREVIEW_URL_RESPONSE


Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_preview_request** | [**AD_PREVIEW_REQUEST**](AD_PREVIEW_REQUEST.md)|  | 

### Return type

[**AD_PREVIEW_URL_RESPONSE**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_targeting_analytics_get**
> ad_targeting_analytics_get (ad_account_id: STRING_32 ; ad_ids: LIST [STRING_32] ; start_date: DATE ; end_date: DATE ; targeting_types: LIST [ADS_ANALYTICS_AD_TARGETING_TYPE] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; click_window_days:  detachable CONVERSION_ATTRIBUTION_WINDOW_DAYS ; engagement_window_days:  detachable CONVERSION_ATTRIBUTION_WINDOW_DAYS ; view_window_days:  detachable CONVERSION_ATTRIBUTION_WINDOW_DAYS ; conversion_report_time:  detachable CONVERSION_REPORT_TIME_TYPE ; attribution_types:  detachable LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE] ; reporting_timezone:  detachable REPORTING_TIME_ZONE ; sort_columns:  detachable LIST [STRING_32] ; sort_ascending:  detachable BOOLEAN ): detachable METRICS_RESPONSE


Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targeting_types** | [**LIST [ADS_ANALYTICS_AD_TARGETING_TYPE]**](ADS_ANALYTICS_AD_TARGETING_TYPE.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **click_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to null]
 **engagement_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to null]
 **view_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to null]
 **conversion_report_time** | [**CONVERSION_REPORT_TIME_TYPE**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to null]
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

# **ads_analytics**
> ads_analytics (start_date: DATE ; end_date: DATE ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; ad_account_id: STRING_32 ; pin_ids:  detachable LIST [STRING_32] ; ad_ids:  detachable LIST [STRING_32] ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable LIST [ADS_ANALYTICS]


Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **pin_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Pin IDs. | [optional] [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [optional] [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**LIST [ADS_ANALYTICS]**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_create**
> ads_create (ad_account_id: STRING_32 ; ad_create: LIST [AD_CREATE] ): detachable AD_BATCH_WRITE_RESPONSE_MODEL


Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_create** | [**LIST [AD_CREATE]**](AdCreate.md)|  | 

### Return type

[**AD_BATCH_WRITE_RESPONSE_MODEL**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_get**
> ads_get (ad_id: STRING_32 ; ad_account_id: STRING_32 ): detachable AD


Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_id** | **STRING_32**| The ID of this ad. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**AD**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> ads_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; campaign_ids:  detachable LIST [STRING_32] ; ad_group_ids:  detachable LIST [STRING_32] ; ad_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [ENTITY_STATUS] ): detachable ADS_LIST_200_RESPONSE


List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [ENTITY_STATUS]**](ENTITY_STATUS.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**ADS_LIST_200_RESPONSE**](ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_update**
> ads_update (ad_account_id: STRING_32 ; ad_batch_update: LIST [AD_BATCH_UPDATE] ): detachable AD_BATCH_WRITE_RESPONSE_MODEL


Update ads

Update multiple existing ads


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_batch_update** | [**LIST [AD_BATCH_UPDATE]**](AdBatchUpdate.md)|  | 

### Return type

[**AD_BATCH_WRITE_RESPONSE_MODEL**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_create**
> campaign_ad_preview_create (ad_account_id: STRING_32 ; campaign_ad_preview_create: LIST [CAMPAIGN_AD_PREVIEW_CREATE] ): detachable LIST [CAMPAIGN_AD_PREVIEW_CREATE_200_RESPONSE_INNER]


Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ad_preview_create** | [**LIST [CAMPAIGN_AD_PREVIEW_CREATE]**](CampaignAdPreviewCreate.md)|  | 

### Return type

[**LIST [CAMPAIGN_AD_PREVIEW_CREATE_200_RESPONSE_INNER]**](campaign_ad_preview_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_delete**
> campaign_ad_preview_delete (ad_group_ids: LIST [STRING_32] ; ad_account_id: STRING_32 ): detachable LIST [CAMPAIGN_AD_PREVIEW_DELETE_200_RESPONSE_INNER]


Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**LIST [CAMPAIGN_AD_PREVIEW_DELETE_200_RESPONSE_INNER]**](campaign_ad_preview_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_read**
> campaign_ad_preview_read (ad_group_ids: LIST [STRING_32] ; ad_account_id: STRING_32 ): detachable LIST [CAMPAIGN_AD_PREVIEW]


Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**LIST [CAMPAIGN_AD_PREVIEW]**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

