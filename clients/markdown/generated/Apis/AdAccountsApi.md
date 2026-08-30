# AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccount/analytics**](AdAccountsApi.md#adAccount/analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
| [**adAccountTargetingAnalytics/get**](AdAccountsApi.md#adAccountTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account |
| [**adAccounts/create**](AdAccountsApi.md#adAccounts/create) | **POST** /ad_accounts | Create ad account |
| [**adAccounts/get**](AdAccountsApi.md#adAccounts/get) | **GET** /ad_accounts/{ad_account_id} | Get ad account |
| [**adAccounts/list**](AdAccountsApi.md#adAccounts/list) | **GET** /ad_accounts | List ad accounts |
| [**analytics/createConversionProductReport**](AdAccountsApi.md#analytics/createConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report |
| [**analytics/createMmmReport**](AdAccountsApi.md#analytics/createMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report |
| [**analytics/createReport**](AdAccountsApi.md#analytics/createReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
| [**analytics/createTemplateReport**](AdAccountsApi.md#analytics/createTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template |
| [**analytics/getConversionProductReport**](AdAccountsApi.md#analytics/getConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report |
| [**analytics/getMmmReport**](AdAccountsApi.md#analytics/getMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report. |
| [**analytics/getReport**](AdAccountsApi.md#analytics/getReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
| [**sandbox/delete**](AdAccountsApi.md#sandbox/delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox |
| [**templates/list**](AdAccountsApi.md#templates/list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates |


<a name="adAccount/analytics"></a>
# **adAccount/analytics**
> List adAccount/analytics(start\_date, end\_date, columns, granularity, ad\_account\_id, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, reporting\_timezone)

Get ad account analytics

      Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **columns** | [**List**](../Models/ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **click\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagement\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **view\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **reporting\_timezone** | [**ReportingTimeZone**](../Models/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**List**](../Models/AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adAccountTargetingAnalytics/get"></a>
# **adAccountTargetingAnalytics/get**
> MetricsResponse adAccountTargetingAnalytics/get(ad\_account\_id, start\_date, end\_date, targeting\_types, columns, granularity, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, attribution\_types, reporting\_timezone)

Get targeting analytics for an ad account

    Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **targeting\_types** | [**List**](../Models/AdsAnalyticsAccountTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [default to null] |
| **columns** | [**List**](../Models/ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **click\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagement\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **view\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attribution\_types** | [**List**](../Models/ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] [default to null] |
| **reporting\_timezone** | [**ReportingTimeZone**](../Models/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**MetricsResponse**](../Models/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adAccounts/create"></a>
# **adAccounts/create**
> AdAccount adAccounts/create(AdAccountCreate)

Create ad account

    Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **AdAccountCreate** | [**AdAccountCreate**](../Models/AdAccountCreate.md)|  | |

### Return type

[**AdAccount**](../Models/AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adAccounts/get"></a>
# **adAccounts/get**
> AdAccount adAccounts/get(ad\_account\_id)

Get ad account

    Get an ad account

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |

### Return type

[**AdAccount**](../Models/AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adAccounts/list"></a>
# **adAccounts/list**
> ad_accounts_list_200_response adAccounts/list(include\_shared\_accounts, bookmark, page\_size)

List ad accounts

    Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **include\_shared\_accounts** | **Boolean**| Include shared ad accounts | [optional] [default to true] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**ad_accounts_list_200_response**](../Models/ad_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="analytics/createConversionProductReport"></a>
# **analytics/createConversionProductReport**
> ConversionProductReport analytics/createConversionProductReport(ad\_account\_id, ConversionProductReportCreate)

Create a request for a brand, category, SKU report

      [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ConversionProductReportCreate** | [**ConversionProductReportCreate**](../Models/ConversionProductReportCreate.md)|  | |

### Return type

[**ConversionProductReport**](../Models/ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="analytics/createMmmReport"></a>
# **analytics/createMmmReport**
> MMMReport analytics/createMmmReport(ad\_account\_id, MMMReportCreate)

Create a request for a Marketing Mix Modeling (MMM) report

        This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **MMMReportCreate** | [**MMMReportCreate**](../Models/MMMReportCreate.md)|  | |

### Return type

[**MMMReport**](../Models/MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="analytics/createReport"></a>
# **analytics/createReport**
> AdsAnalyticsCreateAsyncResponse analytics/createReport(ad\_account\_id, AdsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

      This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](../Models/AdsAnalyticsCreateAsyncRequest.md)|  | |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](../Models/AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="analytics/createTemplateReport"></a>
# **analytics/createTemplateReport**
> TemplateBasedReport analytics/createTemplateReport(ad\_account\_id, template\_id, start\_date, end\_date, granularity)

Create async request for an analytics report using a template

      This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **template\_id** | **String**| Unique identifier of a template. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional] [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |

### Return type

[**TemplateBasedReport**](../Models/TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="analytics/getConversionProductReport"></a>
# **analytics/getConversionProductReport**
> ConversionProductReport analytics/getConversionProductReport(ad\_account\_id, token)

Get advertiser brand, category, SKU report

      [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **token** | **String**| Token returned from the post request creation call | [default to null] |

### Return type

[**ConversionProductReport**](../Models/ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="analytics/getMmmReport"></a>
# **analytics/getMmmReport**
> MMMReport analytics/getMmmReport(ad\_account\_id, token)

Get advertiser Marketing Mix Modeling (MMM) report.

        Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **token** | **String**| Token returned from the post request creation call | [default to null] |

### Return type

[**MMMReport**](../Models/MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="analytics/getReport"></a>
# **analytics/getReport**
> AdsAnalyticsGetAsyncResponse analytics/getReport(ad\_account\_id, token)

Get the account analytics report created by the async call

      This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **token** | **String**| Token returned from the post request creation call | [default to null] |

### Return type

[**AdsAnalyticsGetAsyncResponse**](../Models/AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="sandbox/delete"></a>
# **sandbox/delete**
> String sandbox/delete(ad\_account\_id)

Delete ads data for ad account in API Sandbox

    Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

**String**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="templates/list"></a>
# **templates/list**
> templates_list_200_response templates/list(ad\_account\_id, bookmark, page\_size, order)

List templates

    Gets all Templates associated with an ad account ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |

### Return type

[**templates_list_200_response**](../Models/templates_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

