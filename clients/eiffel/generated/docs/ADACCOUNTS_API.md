# ADACCOUNTS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_analytics**](ADACCOUNTS_API.md#ad_account_analytics) | **Get** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_account_targeting_analytics_get**](ADACCOUNTS_API.md#ad_account_targeting_analytics_get) | **Get** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**ad_accounts_create**](ADACCOUNTS_API.md#ad_accounts_create) | **Post** /ad_accounts | Create ad account
[**ad_accounts_get**](ADACCOUNTS_API.md#ad_accounts_get) | **Get** /ad_accounts/{ad_account_id} | Get ad account
[**ad_accounts_list**](ADACCOUNTS_API.md#ad_accounts_list) | **Get** /ad_accounts | List ad accounts
[**analytics_create_conversion_product_report**](ADACCOUNTS_API.md#analytics_create_conversion_product_report) | **Post** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
[**analytics_create_mmm_report**](ADACCOUNTS_API.md#analytics_create_mmm_report) | **Post** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analytics_create_report**](ADACCOUNTS_API.md#analytics_create_report) | **Post** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_create_template_report**](ADACCOUNTS_API.md#analytics_create_template_report) | **Post** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analytics_get_conversion_product_report**](ADACCOUNTS_API.md#analytics_get_conversion_product_report) | **Get** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
[**analytics_get_mmm_report**](ADACCOUNTS_API.md#analytics_get_mmm_report) | **Get** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analytics_get_report**](ADACCOUNTS_API.md#analytics_get_report) | **Get** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandbox_delete**](ADACCOUNTS_API.md#sandbox_delete) | **Delete** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templates_list**](ADACCOUNTS_API.md#templates_list) | **Get** /ad_accounts/{ad_account_id}/templates | List templates


# **ad_account_analytics**
> ad_account_analytics (start_date: DATE ; end_date: DATE ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; ad_account_id: STRING_32 ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable LIST [AD_ACCOUNT_ANALYTICS_ITEMS]


Get ad account analytics

  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**LIST [AD_ACCOUNT_ANALYTICS_ITEMS]**](AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_account_targeting_analytics_get**
> ad_account_targeting_analytics_get (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; targeting_types: LIST [ADS_ANALYTICS_ACCOUNT_TARGETING_TYPE] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; attribution_types:  detachable LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE] ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable METRICS_RESPONSE


Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targeting_types** | [**LIST [ADS_ANALYTICS_ACCOUNT_TARGETING_TYPE]**](ADS_ANALYTICS_ACCOUNT_TARGETING_TYPE.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **attribution_types** | [**LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]**](CONVERSION_REPORT_ATTRIBUTION_TYPE.md)| List of types of attribution for the conversion report | [optional] [default to null]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**METRICS_RESPONSE**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_create**
> ad_accounts_create (ad_account_create: AD_ACCOUNT_CREATE ): detachable AD_ACCOUNT


Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_create** | [**AD_ACCOUNT_CREATE**](AD_ACCOUNT_CREATE.md)|  | 

### Return type

[**AD_ACCOUNT**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_get**
> ad_accounts_get (ad_account_id: STRING_32 ): detachable AD_ACCOUNT


Get ad account

Get an ad account


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]

### Return type

[**AD_ACCOUNT**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> ad_accounts_list (include_shared_accounts:  detachable BOOLEAN ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable AD_ACCOUNTS_LIST_200_RESPONSE


List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_shared_accounts** | **BOOLEAN**| Include shared ad accounts | [optional] [default to true]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AD_ACCOUNTS_LIST_200_RESPONSE**](ad_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_conversion_product_report**
> analytics_create_conversion_product_report (ad_account_id: STRING_32 ; conversion_product_report_create: CONVERSION_PRODUCT_REPORT_CREATE ): detachable CONVERSION_PRODUCT_REPORT


Create a request for a brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **conversion_product_report_create** | [**CONVERSION_PRODUCT_REPORT_CREATE**](CONVERSION_PRODUCT_REPORT_CREATE.md)|  | 

### Return type

[**CONVERSION_PRODUCT_REPORT**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_mmm_report**
> analytics_create_mmm_report (ad_account_id: STRING_32 ; mmm_report_create: MMM_REPORT_CREATE ): detachable MMM_REPORT


Create a request for a Marketing Mix Modeling (MMM) report

    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **mmm_report_create** | [**MMM_REPORT_CREATE**](MMM_REPORT_CREATE.md)|  | 

### Return type

[**MMM_REPORT**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> analytics_create_report (ad_account_id: STRING_32 ; ads_analytics_create_async_request: ADS_ANALYTICS_CREATE_ASYNC_REQUEST ): detachable ADS_ANALYTICS_CREATE_ASYNC_RESPONSE


Create async request for an account analytics report

  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.


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

# **analytics_create_template_report**
> analytics_create_template_report (ad_account_id: STRING_32 ; template_id: STRING_32 ; start_date:  detachable DATE ; end_date:  detachable DATE ; granularity:  detachable GRANULARITY ): detachable TEMPLATE_BASED_REPORT


Create async request for an analytics report using a template

  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **template_id** | **STRING_32**| Unique identifier of a template. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional] [default to null]

### Return type

[**TEMPLATE_BASED_REPORT**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_conversion_product_report**
> analytics_get_conversion_product_report (ad_account_id: STRING_32 ; token: STRING_32 ): detachable CONVERSION_PRODUCT_REPORT


Get advertiser brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **token** | **STRING_32**| Token returned from the post request creation call | [default to null]

### Return type

[**CONVERSION_PRODUCT_REPORT**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_mmm_report**
> analytics_get_mmm_report (ad_account_id: STRING_32 ; token: STRING_32 ): detachable MMM_REPORT


Get advertiser Marketing Mix Modeling (MMM) report.

    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **token** | **STRING_32**| Token returned from the post request creation call | [default to null]

### Return type

[**MMM_REPORT**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> analytics_get_report (ad_account_id: STRING_32 ; token: STRING_32 ): detachable ADS_ANALYTICS_GET_ASYNC_RESPONSE


Get the account analytics report created by the async call

  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.


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

# **sandbox_delete**
> sandbox_delete (ad_account_id: STRING_32 ): detachable STRING_32


Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templates_list**
> templates_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ): detachable TEMPLATES_LIST_200_RESPONSE


List templates

Gets all Templates associated with an ad account ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]

### Return type

[**TEMPLATES_LIST_200_RESPONSE**](templates_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

