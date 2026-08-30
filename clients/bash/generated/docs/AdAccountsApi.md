# AdAccountsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](AdAccountsApi.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](AdAccountsApi.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](AdAccountsApi.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateConversionProductReport**](AdAccountsApi.md#analyticsCreateConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
[**analyticsCreateMmmReport**](AdAccountsApi.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](AdAccountsApi.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analyticsGetConversionProductReport**](AdAccountsApi.md#analyticsGetConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
[**analyticsGetMmmReport**](AdAccountsApi.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analyticsGetReport**](AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandboxDelete**](AdAccountsApi.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templatesList**](AdAccountsApi.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates



## adAccountAnalytics

Get ad account analytics

Get analytics for the specified 'ad_account_id', filtered by the specified options.

  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.

  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example

```bash
 adAccountAnalytics  start_date=value  end_date=value  Specify as:  columns="value1,value2,..."  granularity=value ad_account_id=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  reporting_timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**array[AdAccountAnalyticsItems]**](AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountTargetingAnalyticsGet

Get targeting analytics for an ad account

Get targeting analytics for an ad account.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```bash
 adAccountTargetingAnalyticsGet ad_account_id=value  start_date=value  end_date=value  Specify as:  targeting_types="value1,value2,..."  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  Specify as:  attribution_types="value1,value2,..."  reporting_timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targetingTypes** | [**array[AdsAnalyticsAccountTargetingType]**](AdsAnalyticsAccountTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **attributionTypes** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] [default to null]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsCreate

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.
An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.

You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.)
For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example

```bash
 adAccountsCreate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreate** | [**AdAccountCreate**](AdAccountCreate.md) |  |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsGet

Get ad account

Get an ad account

### Example

```bash
 adAccountsGet ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsList

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.
        - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example

```bash
 adAccountsList  include_shared_accounts=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSharedAccounts** | **boolean** | Include shared ad accounts | [optional] [default to true]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsCreateConversionProductReport

Create a request for a brand, category, SKU report

[Restricted](/docs/getting-started/using-beta-and-restricted-features/)
  This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example

```bash
 analyticsCreateConversionProductReport ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **conversionProductReportCreate** | [**ConversionProductReportCreate**](ConversionProductReportCreate.md) |  |

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsCreateMmmReport

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request.
    It returns a token that you can use to download the report when it is
    ready. NOTE: An additional limit of 5 queries per minute per advertiser
    applies to this endpoint while it's in beta release.
    For the ADVERTISER_PAID_SPEND_IN_DOLLAR,
    ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR
    columns: if you receive bonus media, this value still includes that spend, and it will
    need to be removed manually with support from your Pinterest account team for a
    fully netted value. Over time, we'll also subtract bonus media and other incentives as
    data becomes available. Production and other non-media fees are excluded.

### Example

```bash
 analyticsCreateMmmReport ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **mMMReportCreate** | [**MMMReportCreate**](MMMReportCreate.md) |  |

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsCreateReport

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready.
  Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
  - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.
  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.
  - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example

```bash
 analyticsCreateReport ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsCreateTemplateReport

Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and
  constructs an asynchronous report based on the template. It returns
  a token that you can use to download the report when it is ready.

### Example

```bash
 analyticsCreateTemplateReport ad_account_id=value template_id=value  start_date=value  end_date=value  granularity=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **templateId** | **string** | Unique identifier of a template. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [optional] [default to null]

### Return type

[**TemplateBasedReport**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsGetConversionProductReport

Get advertiser brand, category, SKU report

[Restricted](/docs/getting-started/using-beta-and-restricted-features/)
  Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example

```bash
 analyticsGetConversionProductReport ad_account_id=value  token=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **token** | **string** | Token returned from the post request creation call | [default to null]

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsGetMmmReport

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an
    mmm metrics report given a token returned from the create mmm report endpoint.

### Example

```bash
 analyticsGetMmmReport ad_account_id=value  token=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **token** | **string** | Token returned from the post request creation call | [default to null]

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsGetReport

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call.
  You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.
  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

```bash
 analyticsGetReport ad_account_id=value  token=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **token** | **string** | Token returned from the post request creation call | [default to null]

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sandboxDelete

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account.
A string message is returned indicating the status of the delete operation.

Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).
Go to /docs/developer-tools/sandbox/ for more information.

### Example

```bash
 sandboxDelete ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

**string**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesList

List templates

Gets all Templates associated with an ad account ID.

### Example

```bash
 templatesList ad_account_id=value  bookmark=value  page_size=value  order=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID.
Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

