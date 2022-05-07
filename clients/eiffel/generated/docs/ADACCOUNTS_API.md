# ADACCOUNTS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_analytics**](ADACCOUNTS_API.md#ad_account_analytics) | **Get** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_accounts_list**](ADACCOUNTS_API.md#ad_accounts_list) | **Get** /ad_accounts | List ad accounts
[**ad_groups_analytics**](ADACCOUNTS_API.md#ad_groups_analytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**ad_groups_list**](ADACCOUNTS_API.md#ad_groups_list) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**ads_analytics**](ADACCOUNTS_API.md#ads_analytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_list**](ADACCOUNTS_API.md#ads_list) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
[**analytics_create_report**](ADACCOUNTS_API.md#analytics_create_report) | **Post** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_get_report**](ADACCOUNTS_API.md#analytics_get_report) | **Get** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaigns_analytics**](ADACCOUNTS_API.md#campaigns_analytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_list**](ADACCOUNTS_API.md#campaigns_list) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**product_groups_analytics**](ADACCOUNTS_API.md#product_groups_analytics) | **Get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **ad_account_analytics**
> ad_account_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [STRING_TABLE [ANY]]


Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| Granularity | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [STRING_TABLE [ANY]]**](STRING_TABLE.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> ad_accounts_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; include_shared_accounts:  detachable BOOLEAN ): detachable PAGINATED


List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **include_shared_accounts** | **BOOLEAN**| Include shared ad accounts | [optional] [default to true]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_analytics**
> ad_groups_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; ad_group_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [STRING_TABLE [ANY]]


Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| Granularity | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [STRING_TABLE [ANY]]**](STRING_TABLE.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_list**
> ad_groups_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; ad_group_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; translate_interests_to_names:  detachable BOOLEAN ): detachable PAGINATED


List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Entity status | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **translate_interests_to_names** | **BOOLEAN**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_analytics**
> ads_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; ad_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [STRING_TABLE [ANY]]


Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| Granularity | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [STRING_TABLE [ANY]]**](STRING_TABLE.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> ads_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; ad_group_ids:  detachable LIST [STRING_32] ; ad_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable PAGINATED


List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad group Ids to use to filter the results. | [optional] [default to null]
 **ad_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Ad Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Entity status | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> analytics_create_report (ad_account_id: STRING_32 ; ads_analytics_create_async_request: ADS_ANALYTICS_CREATE_ASYNC_REQUEST ): detachable ADS_ANALYTICS_CREATE_ASYNC_RESPONSE


Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ads_analytics_create_async_request** | [**ADS_ANALYTICS_CREATE_ASYNC_REQUEST**](ADS_ANALYTICS_CREATE_ASYNC_REQUEST.md)|  | 

### Return type

[**ADS_ANALYTICS_CREATE_ASYNC_RESPONSE**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> analytics_get_report (ad_account_id: STRING_32 ; token: STRING_32 ): detachable ADS_ANALYTICS_GET_ASYNC_RESPONSE


Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **token** | **STRING_32**| Token returned from the post request creation call | [default to null]

### Return type

[**ADS_ANALYTICS_GET_ASYNC_RESPONSE**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> campaigns_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; campaign_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [STRING_TABLE [ANY]]


Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| Granularity | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [STRING_TABLE [ANY]]**](STRING_TABLE.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> campaigns_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable PAGINATED


List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Entity status | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> product_groups_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; product_group_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [STRING_TABLE [ANY]]


Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **product_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Product group Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| Granularity | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [STRING_TABLE [ANY]]**](STRING_TABLE.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

