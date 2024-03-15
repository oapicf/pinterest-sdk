# \AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_slash_analytics**](AdAccountsApi.md#ad_account_slash_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_account_targeting_analytics_slash_get**](AdAccountsApi.md#ad_account_targeting_analytics_slash_get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**ad_accounts_slash_create**](AdAccountsApi.md#ad_accounts_slash_create) | **POST** /ad_accounts | Create ad account
[**ad_accounts_slash_get**](AdAccountsApi.md#ad_accounts_slash_get) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**ad_accounts_slash_list**](AdAccountsApi.md#ad_accounts_slash_list) | **GET** /ad_accounts | List ad accounts
[**analytics_slash_create_mmm_report**](AdAccountsApi.md#analytics_slash_create_mmm_report) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analytics_slash_create_report**](AdAccountsApi.md#analytics_slash_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_slash_create_template_report**](AdAccountsApi.md#analytics_slash_create_template_report) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analytics_slash_get_mmm_report**](AdAccountsApi.md#analytics_slash_get_mmm_report) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analytics_slash_get_report**](AdAccountsApi.md#analytics_slash_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandbox_slash_delete**](AdAccountsApi.md#sandbox_slash_delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templates_slash_list**](AdAccountsApi.md#templates_slash_list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates



## ad_account_slash_analytics

> Vec<models::AdAccountAnalyticsResponseInner> ad_account_slash_analytics(ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time)
Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**columns** | [**Vec<String>**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [required] |
**granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | [required] |
**click_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**view_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]

### Return type

[**Vec<models::AdAccountAnalyticsResponseInner>**](AdAccountAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ad_account_targeting_analytics_slash_get

> models::MetricsResponse ad_account_targeting_analytics_slash_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types)
Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**targeting_types** | [**Vec<models::AdsAnalyticsTargetingType>**](models::AdsAnalyticsTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. | [required] |
**columns** | [**Vec<String>**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [required] |
**granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | [required] |
**click_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**view_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]
**attribution_types** | Option<[**ConversionReportAttributionType**](.md)> | List of types of attribution for the conversion report |  |

### Return type

[**models::MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ad_accounts_slash_create

> models::AdAccount ad_accounts_slash_create(ad_account_create_request)
Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_create_request** | [**AdAccountCreateRequest**](AdAccountCreateRequest.md) | Ad account to create. | [required] |

### Return type

[**models::AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ad_accounts_slash_get

> models::AdAccount ad_accounts_slash_get(ad_account_id)
Get ad account

Get an ad account

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ad_accounts_slash_list

> models::AdAccountsList200Response ad_accounts_slash_list(bookmark, page_size, include_shared_accounts)
List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]
**include_shared_accounts** | Option<**bool**> | Include shared ad accounts |  |[default to true]

### Return type

[**models::AdAccountsList200Response**](ad_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analytics_slash_create_mmm_report

> models::CreateMmmReportResponse analytics_slash_create_mmm_report(ad_account_id, create_mmm_report_request)
Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**create_mmm_report_request** | [**CreateMmmReportRequest**](CreateMmmReportRequest.md) |  | [required] |

### Return type

[**models::CreateMmmReportResponse**](CreateMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analytics_slash_create_report

> models::AdsAnalyticsCreateAsyncResponse analytics_slash_create_report(ad_account_id, ads_analytics_create_async_request)
Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ads_analytics_create_async_request** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  | [required] |

### Return type

[**models::AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analytics_slash_create_template_report

> models::AdsAnalyticsCreateAsyncResponse analytics_slash_create_template_report(ad_account_id, template_id, start_date, end_date, granularity)
Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**template_id** | **String** | Unique identifier of a template. | [required] |
**start_date** | Option<**String**> | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. |  |
**end_date** | Option<**String**> | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. |  |
**granularity** | Option<[**Granularity**](.md)> | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly |  |

### Return type

[**models::AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analytics_slash_get_mmm_report

> models::GetMmmReportResponse analytics_slash_get_mmm_report(ad_account_id, token)
Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**token** | **String** | Token returned from the post request creation call | [required] |

### Return type

[**models::GetMmmReportResponse**](GetMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analytics_slash_get_report

> models::AdsAnalyticsGetAsyncResponse analytics_slash_get_report(ad_account_id, token)
Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**token** | **String** | Token returned from the post request creation call | [required] |

### Return type

[**models::AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sandbox_slash_delete

> String sandbox_slash_delete(ad_account_id)
Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

**String**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templates_slash_list

> models::TemplatesList200Response templates_slash_list(ad_account_id, page_size, order, bookmark)
List templates

Gets all Templates associated with an ad account ID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]
**order** | Option<**String**> | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::TemplatesList200Response**](templates_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

