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


# **ad_previews_create**
> ad_previews_create (ad_account_id: STRING_32 ; ad_preview_request: AD_PREVIEW_REQUEST ): detachable AD_PREVIEW_URL_RESPONSE


Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_preview_request** | [**AD_PREVIEW_REQUEST**](AD_PREVIEW_REQUEST.md)| Create ad preview with pin or image. | 

### Return type

[**AD_PREVIEW_URL_RESPONSE**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_targeting_analytics_get**
> ad_targeting_analytics_get (ad_account_id: STRING_32 ; ad_ids: LIST [STRING_32] ; start_date: DATE ; end_date: DATE ; targeting_types: LIST [ADS_ANALYTICS_TARGETING_TYPE] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ; attribution_types:  detachable CONVERSION_REPORT_ATTRIBUTION_TYPE ): detachable METRICS_RESPONSE


Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [default to null]
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

# **ads_analytics**
> ads_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; ad_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [ADS_ANALYTICS_RESPONSE_INNER]


Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [ADS_ANALYTICS_RESPONSE_INNER]**](AdsAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_create**
> ads_create (ad_account_id: STRING_32 ; ad_create_request: LIST [AD_CREATE_REQUEST] ): detachable AD_ARRAY_RESPONSE


Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_create_request** | [**LIST [AD_CREATE_REQUEST]**](AdCreateRequest.md)| List of ads to create, size limit [1, 30]. | 

### Return type

[**AD_ARRAY_RESPONSE**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_get**
> ads_get (ad_account_id: STRING_32 ; ad_id: STRING_32 ): detachable AD_RESPONSE


Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_id** | **STRING_32**| Unique identifier of an ad. | [default to null]

### Return type

[**AD_RESPONSE**](AdResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> ads_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; ad_group_ids:  detachable LIST [STRING_32] ; ad_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable ADS_LIST_200_RESPONSE


List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [optional] [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**ADS_LIST_200_RESPONSE**](ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_update**
> ads_update (ad_account_id: STRING_32 ; ad_update_request: LIST [AD_UPDATE_REQUEST] ): detachable AD_ARRAY_RESPONSE


Update ads

Update multiple existing ads


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_update_request** | [**LIST [AD_UPDATE_REQUEST]**](AdUpdateRequest.md)| List of ads to update, size limit [1, 30] | 

### Return type

[**AD_ARRAY_RESPONSE**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

