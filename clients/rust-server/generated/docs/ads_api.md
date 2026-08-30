# ads_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**ad_previews/create**](ads_api.md#ad_previews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
**ad_targeting_analytics/get**](ads_api.md#ad_targeting_analytics/get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
**ads/analytics**](ads_api.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
**ads/create**](ads_api.md#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
**ads/list**](ads_api.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
**ads/update**](ads_api.md#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
**campaign_ad_preview/create**](ads_api.md#campaign_ad_preview/create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
**campaign_ad_preview/delete**](ads_api.md#campaign_ad_preview/delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
**campaign_ad_preview/read**](ads_api.md#campaign_ad_preview/read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
**ads/get**](ads_api.md#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad


# **ad_previews/create**
> models::AdPreviewUrlResponse ad_previews/create(ctx, ad_account_id, ad_preview_request)
Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md)|  | 

### Return type

[**models::AdPreviewUrlResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_targeting_analytics/get**
> models::MetricsResponse ad_targeting_analytics/get(ctx, ctx, ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, optional)
Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **targeting_types** | [**models::AdsAnalyticsAdTargetingType**](models::AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | 
  **columns** | [**models::ReportingColumnSync**](models::ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
  **granularity** | [****](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**models::AdsAnalyticsAdTargetingType**](models::AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | 
 **columns** | [**models::ReportingColumnSync**](models::ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [****](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | [****](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | 
 **engagement_window_days** | [****](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | 
 **view_window_days** | [****](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | 
 **conversion_report_time** | [****](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | 
 **attribution_types** | [**models::ConversionReportAttributionType**](models::ConversionReportAttributionType.md)| List of types of attribution for the conversion report | 
 **reporting_timezone** | [****](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 
 **sort_columns** | [**String**](String.md)| Sort Columns. | 
 **sort_ascending** | **bool**| Sort ascending. | 

### Return type

[**models::MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/analytics**
> Vec<models::AdsAnalytics> ads/analytics(ctx, ctx, start_date, end_date, columns, granularity, ad_account_id, optional)
Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **columns** | [**models::ReportingColumnSync**](models::ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
  **granularity** | [****](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**models::ReportingColumnSync**](models::ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [****](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **pin_ids** | [**String**](String.md)| List of Pin IDs. | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **click_window_days** | [****](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | 
 **engagement_window_days** | [****](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | 
 **view_window_days** | [****](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | 
 **conversion_report_time** | [****](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | 
 **campaign_ids** | [**String**](String.md)| List of Campaign Ids to use to filter the results. | 
 **reporting_timezone** | [****](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

### Return type

[**Vec<models::AdsAnalytics>**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/create**
> models::AdBatchWriteResponseModel ads/create(ctx, ad_account_id, ad_create)
Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_create** | [**AdCreate**](AdCreate.md)|  | 

### Return type

[**models::AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/list**
> models::AdsList200Response ads/list(ctx, ctx, ad_account_id, optional)
List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **campaign_ids** | [**String**](String.md)| List of Campaign Ids to use to filter the results. | 
 **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **entity_statuses** | [**models::EntityStatus**](models::EntityStatus.md)| Entity status | 

### Return type

[**models::AdsList200Response**](ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/update**
> models::AdBatchWriteResponseModel ads/update(ctx, ad_account_id, ad_batch_update)
Update ads

Update multiple existing ads

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_batch_update** | [**AdBatchUpdate**](AdBatchUpdate.md)|  | 

### Return type

[**models::AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview/create**
> Vec<models::CampaignAdPreviewCreate200ResponseInner> campaign_ad_preview/create(ctx, ad_account_id, campaign_ad_preview_create)
Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **campaign_ad_preview_create** | [**CampaignAdPreviewCreate**](CampaignAdPreviewCreate.md)|  | 

### Return type

[**Vec<models::CampaignAdPreviewCreate200ResponseInner>**](campaign_ad_preview_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview/delete**
> Vec<models::CampaignAdPreviewDelete200ResponseInner> campaign_ad_preview/delete(ctx, ad_group_ids, ad_account_id)
Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to use to filter the results. | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**Vec<models::CampaignAdPreviewDelete200ResponseInner>**](campaign_ad_preview_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview/read**
> Vec<models::CampaignAdPreview> campaign_ad_preview/read(ctx, ad_group_ids, ad_account_id)
Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to use to filter the results. | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**Vec<models::CampaignAdPreview>**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/get**
> models::Ad ads/get(ctx, ctx, ad_id, ad_account_id)
Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_id** | **String**| The ID of this ad. | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

