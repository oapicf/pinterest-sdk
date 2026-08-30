# AdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdsAPI_adPreviewsCreate**](AdsAPI.md#AdsAPI_adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**AdsAPI_adTargetingAnalyticsGet**](AdsAPI.md#AdsAPI_adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**AdsAPI_adsAnalytics**](AdsAPI.md#AdsAPI_adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsAPI_adsCreate**](AdsAPI.md#AdsAPI_adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**AdsAPI_adsGet**](AdsAPI.md#AdsAPI_adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**AdsAPI_adsList**](AdsAPI.md#AdsAPI_adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**AdsAPI_adsUpdate**](AdsAPI.md#AdsAPI_adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**AdsAPI_campaignAdPreviewCreate**](AdsAPI.md#AdsAPI_campaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**AdsAPI_campaignAdPreviewDelete**](AdsAPI.md#AdsAPI_campaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**AdsAPI_campaignAdPreviewRead**](AdsAPI.md#AdsAPI_campaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **AdsAPI_adPreviewsCreate**
```c
// Create ad preview with pin or image
//
// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
//
ad_preview_url_response_t* AdsAPI_adPreviewsCreate(apiClient_t *apiClient, char *ad_account_id, ad_preview_request_t *ad_preview_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_preview_request** | **[ad_preview_request_t](ad_preview_request.md) \*** |  | 

### Return type

[ad_preview_url_response_t](ad_preview_url_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_adTargetingAnalyticsGet**
```c
// Get targeting analytics for ads
//
// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
metrics_response_t* AdsAPI_adTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, list_t *ad_ids, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, conversion_attribution_window_days_e click_window_days, conversion_attribution_window_days_e engagement_window_days, conversion_attribution_window_days_e view_window_days, conversion_report_time_type_e conversion_report_time, list_t *attribution_types, reporting_time_zone_e reporting_timezone, list_t *sort_columns, int *sort_ascending);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_ids** | **[list_t](char.md) \*** | List of Ad Ids to use to filter the results. | 
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**targeting_types** | **[list_t](ads_analytics_ad_targeting_type.md) \*** | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
**columns** | **[list_t](reporting_column_sync.md) \*** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
**granularity** | **granularity_e** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
**click_window_days** | **conversion_attribution_window_days_e** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
**engagement_window_days** | **conversion_attribution_window_days_e** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] 
**view_window_days** | **conversion_attribution_window_days_e** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 
**conversion_report_time** | **conversion_report_time_type_e** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
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

# **AdsAPI_adsAnalytics**
```c
// Get ad analytics
//
//     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
list_t* AdsAPI_adsAnalytics(apiClient_t *apiClient, char start_date, char end_date, list_t *columns, granularity_e granularity, char *ad_account_id, list_t *pin_ids, list_t *ad_ids, double click_window_days, double engagement_window_days, double view_window_days, pinterest_rest_api_adsAnalytics_conversion_report_time_e conversion_report_time, list_t *campaign_ids, reporting_time_zone_e reporting_timezone);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**columns** | **[list_t](reporting_column_sync.md) \*** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
**granularity** | **granularity_e** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**pin_ids** | **[list_t](char.md) \*** | List of Pin IDs. | [optional] 
**ad_ids** | **[list_t](char.md) \*** | List of Ad Ids to use to filter the results. | [optional] 
**click_window_days** | **double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | **double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
**view_window_days** | **double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | **pinterest_rest_api_adsAnalytics_conversion_report_time_e** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | [optional] 
**reporting_timezone** | **reporting_time_zone_e** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[list_t](ads_analytics.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_adsCreate**
```c
// Create ads
//
// Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
//
ad_batch_write_response_model_t* AdsAPI_adsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_create** | **[list_t](ad_create.md) \*** |  | 

### Return type

[ad_batch_write_response_model_t](ad_batch_write_response_model.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_adsGet**
```c
// Get ad
//
// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
//
ad_t* AdsAPI_adsGet(apiClient_t *apiClient, char *ad_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_id** | **char \*** | The ID of this ad. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[ad_t](ad.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_adsList**
```c
// List ads
//
// List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
//
ads_list_200_response_t* AdsAPI_adsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, list_t *campaign_ids, list_t *ad_group_ids, list_t *ad_ids, list_t *entity_statuses);
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
**ad_ids** | **[list_t](char.md) \*** | List of Ad Ids to use to filter the results. | [optional] 
**entity_statuses** | **[list_t](entity_status.md) \*** | Entity status | [optional] 

### Return type

[ads_list_200_response_t](ads_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_adsUpdate**
```c
// Update ads
//
// Update multiple existing ads
//
ad_batch_write_response_model_t* AdsAPI_adsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_batch_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_batch_update** | **[list_t](ad_batch_update.md) \*** |  | 

### Return type

[ad_batch_write_response_model_t](ad_batch_write_response_model.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_campaignAdPreviewCreate**
```c
// Create ad preview records for one or more ad groups
//
// Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
//
list_t* AdsAPI_campaignAdPreviewCreate(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ad_preview_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_ad_preview_create** | **[list_t](campaign_ad_preview_create.md) \*** |  | 

### Return type

[list_t](campaign_ad_preview_create_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_campaignAdPreviewDelete**
```c
// Delete ad preview records for one or more ad groups
//
// Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
//
list_t* AdsAPI_campaignAdPreviewDelete(apiClient_t *apiClient, list_t *ad_group_ids, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_group_ids** | **[list_t](char.md) \*** | List of Ad group Ids to use to filter the results. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[list_t](campaign_ad_preview_delete_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdsAPI_campaignAdPreviewRead**
```c
// Fetch ad preview records for one or more ad groups
//
// Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
//
list_t* AdsAPI_campaignAdPreviewRead(apiClient_t *apiClient, list_t *ad_group_ids, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_group_ids** | **[list_t](char.md) \*** | List of Ad group Ids to use to filter the results. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[list_t](campaign_ad_preview.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

