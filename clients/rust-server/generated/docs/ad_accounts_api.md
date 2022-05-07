# ad_accounts_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**ad_account/analytics**](ad_accounts_api.md#ad_account/analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
**ad_accounts/list**](ad_accounts_api.md#ad_accounts/list) | **GET** /ad_accounts | List ad accounts
**ad_groups/analytics**](ad_accounts_api.md#ad_groups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
**ad_groups/list**](ad_accounts_api.md#ad_groups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
**ads/analytics**](ad_accounts_api.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
**ads/list**](ad_accounts_api.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
**analytics/create_report**](ad_accounts_api.md#analytics/create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
**analytics/get_report**](ad_accounts_api.md#analytics/get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
**campaigns/analytics**](ad_accounts_api.md#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
**campaigns/list**](ad_accounts_api.md#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
**product_groups/analytics**](ad_accounts_api.md#product_groups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **ad_account/analytics**
> Vec<std::collections::HashMap<String, serde_json::Value>> ad_account/analytics(ctx, ad_account_id, start_date, end_date, columns, granularity, optional)
Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
  **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
  **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| Granularity | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| Granularity | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]

### Return type

[**Vec<std::collections::HashMap<String, serde_json::Value>>**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts/list**
> Paginated ad_accounts/list(ctx, optional)
List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [default to 25]
 **include_shared_accounts** | **bool**| Include shared ad accounts | [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups/analytics**
> Vec<std::collections::HashMap<String, serde_json::Value>> ad_groups/analytics(ctx, ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, optional)
Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
  **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
  **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to use to filter the results. | 
  **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| Granularity | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| Granularity | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]

### Return type

[**Vec<std::collections::HashMap<String, serde_json::Value>>**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups/list**
> Paginated ad_groups/list(ctx, ad_account_id, optional)
List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
 **entity_statuses** | [**String**](String.md)| Entity status | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **translate_interests_to_names** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/analytics**
> Vec<std::collections::HashMap<String, serde_json::Value>> ads/analytics(ctx, ad_account_id, start_date, end_date, ad_ids, columns, granularity, optional)
Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
  **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
  **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
  **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| Granularity | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **ad_ids** | [**String**](String.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| Granularity | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]

### Return type

[**Vec<std::collections::HashMap<String, serde_json::Value>>**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads/list**
> Paginated ads/list(ctx, ad_account_id, optional)
List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics/create_report**
> models::AdsAnalyticsCreateAsyncResponse analytics/create_report(ctx, ad_account_id, ads_analytics_create_async_request)
Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ads_analytics_create_async_request** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**models::AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics/get_report**
> models::AdsAnalyticsGetAsyncResponse analytics/get_report(ctx, ad_account_id, token)
Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **token** | **String**| Token returned from the post request creation call | 

### Return type

[**models::AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns/analytics**
> Vec<std::collections::HashMap<String, serde_json::Value>> campaigns/analytics(ctx, ad_account_id, start_date, end_date, campaign_ids, columns, granularity, optional)
Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
  **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
  **campaign_ids** | [**String**](String.md)| List of Campaign Ids to use to filter the results. | 
  **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| Granularity | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaign_ids** | [**String**](String.md)| List of Campaign Ids to use to filter the results. | 
 **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| Granularity | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]

### Return type

[**Vec<std::collections::HashMap<String, serde_json::Value>>**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns/list**
> Paginated campaigns/list(ctx, ad_account_id, optional)
List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
 **entity_statuses** | [**String**](String.md)| Entity status | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups/analytics**
> Vec<std::collections::HashMap<String, serde_json::Value>> product_groups/analytics(ctx, ad_account_id, start_date, end_date, product_group_ids, columns, granularity, optional)
Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
  **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
  **product_group_ids** | [**String**](String.md)| List of Product group Ids to use to filter the results. | 
  **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
  **granularity** | [****](.md)| Granularity | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **product_group_ids** | [**String**](String.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**String**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | 
 **granularity** | [****](.md)| Granularity | 
 **click_window_days** | **i32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **engagement_window_days** | **i32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [default to 30]
 **view_window_days** | **i32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [default to 1]
 **conversion_report_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to "TIME_OF_AD_ACTION".to_string()]

### Return type

[**Vec<std::collections::HashMap<String, serde_json::Value>>**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

