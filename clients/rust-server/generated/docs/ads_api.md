# ads_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**ad_previews/create**](ads_api.md#ad_previews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
**ad_targeting_analytics/get**](ads_api.md#ad_targeting_analytics/get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
**ads/analytics**](ads_api.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
**ads/create**](ads_api.md#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
**ads/get**](ads_api.md#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
**ads/list**](ads_api.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
**ads/update**](ads_api.md#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads


# **ad_previews/create**
> models::AdPreviewUrlResponse ad_previews/create(ctx, ad_account_id, ad_preview_request)
Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md)| Create ad preview with pin or image. | 

### Return type

[**models::AdPreviewUrlResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_targeting_analytics/get**
> models::MetricsResponse ad_targeting_analytics/get(ctx, ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, optional)
Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **targeting_types** | [**models::AdsAnalyticsTargetingType**](models::AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. | 
  **columns** | [**String**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**models::AdsAnalyticsTargetingType**](models::AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. | 
 **columns** | [**String**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]
 **attribution_types** | [****](.md)| List of types of attribution for the conversion report | 

### Return type

[**models::MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/analytics**
> Vec<models::AdsAnalyticsResponseInner> ads/analytics(ctx, ad_account_id, start_date, end_date, ad_ids, columns, granularity, optional)
Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
  **columns** | [**String**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**String**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]

### Return type

[**Vec<models::AdsAnalyticsResponseInner>**](AdsAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/create**
> models::AdArrayResponse ads/create(ctx, ad_account_id, ad_create_request)
Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_create_request** | [**AdCreateRequest**](AdCreateRequest.md)| List of ads to create, size limit [1, 30]. | 

### Return type

[**models::AdArrayResponse**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/get**
> models::AdResponse ads/get(ctx, ad_account_id, ad_id)
Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_id** | **String**| Unique identifier of an ad. | 

### Return type

[**models::AdResponse**](AdResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/list**
> models::AdsList200Response ads/list(ctx, ad_account_id, optional)
List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **campaign_ids** | [**String**](String.md)| List of Campaign Ids to use to filter the results. | 
 **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to use to filter the results. | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **entity_statuses** | [**String**](String.md)| Entity status | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 

### Return type

[**models::AdsList200Response**](ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/update**
> models::AdArrayResponse ads/update(ctx, ad_account_id, ad_update_request)
Update ads

Update multiple existing ads

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_update_request** | [**AdUpdateRequest**](AdUpdateRequest.md)| List of ads to update, size limit [1, 30] | 

### Return type

[**models::AdArrayResponse**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

