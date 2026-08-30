# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_groups_analytics**](AdGroupsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**ad_groups_audience_sizing**](AdGroupsApi.md#ad_groups_audience_sizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**ad_groups_bid_floor_get**](AdGroupsApi.md#ad_groups_bid_floor_get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**ad_groups_create**](AdGroupsApi.md#ad_groups_create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**ad_groups_dynamic_titles_download_csv**](AdGroupsApi.md#ad_groups_dynamic_titles_download_csv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**ad_groups_dynamic_titles_get_status**](AdGroupsApi.md#ad_groups_dynamic_titles_get_status) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**ad_groups_dynamic_titles_get_upload_url**](AdGroupsApi.md#ad_groups_dynamic_titles_get_upload_url) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**ad_groups_dynamic_titles_process_csv**](AdGroupsApi.md#ad_groups_dynamic_titles_process_csv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**ad_groups_get**](AdGroupsApi.md#ad_groups_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**ad_groups_list**](AdGroupsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**ad_groups_targeting_analytics_get**](AdGroupsApi.md#ad_groups_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**ad_groups_update**](AdGroupsApi.md#ad_groups_update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**get_ad_groups_by_promotion_ids_list**](AdGroupsApi.md#get_ad_groups_by_promotion_ids_list) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


# **ad_groups_analytics**
> `ad_groups_analytics`(_api::`AdGroupsApi`, `start_date`::`Date`, `end_date`::`Date`, `ad_group_ids`::`Vector{String}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`, `ad_account_id`::`String`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `aggregate_report_rows`=nothing, `reporting_timezone`=nothing, _mediaType=nothing) -> `Vector{AdGroupsAnalyticsMetrics}`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_analytics`(_api::`AdGroupsApi`, response_stream::`Channel`, `start_date`::`Date`, `end_date`::`Date`, `ad_group_ids`::`Vector{String}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`, `ad_account_id`::`String`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `aggregate_report_rows`=nothing, `reporting_timezone`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{AdGroupsAnalyticsMetrics}` }, `OpenAPI.Clients.ApiResponse`

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`start_date`** | **`Date`** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`ad_group_ids`** | [**`Vector{String}`**](String.md) | List of Ad group Ids to use to filter the results. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | **`Float64`** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **`aggregate_report_rows`** | **`Bool`** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [default to false]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]

### Return type

[**`Vector{AdGroupsAnalyticsMetrics}`**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_audience_sizing**
> `ad_groups_audience_sizing`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_audience_sizing_create`::`AdGroupAudienceSizingCreate`; _mediaType=nothing) -> `AdGroupAudienceSizing`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_audience_sizing`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_audience_sizing_create`::`AdGroupAudienceSizingCreate`; _mediaType=nothing) -> `Channel`{ `AdGroupAudienceSizing` }, `OpenAPI.Clients.ApiResponse`

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_audience_sizing_create`** | [**`AdGroupAudienceSizingCreate`**](AdGroupAudienceSizingCreate.md) |  |

### Return type

[**`AdGroupAudienceSizing`**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_bid_floor_get**
> `ad_groups_bid_floor_get`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `bid_floor_create`::`BidFloorCreate`; _mediaType=nothing) -> `BidFloor`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_bid_floor_get`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `bid_floor_create`::`BidFloorCreate`; _mediaType=nothing) -> `Channel`{ `BidFloor` }, `OpenAPI.Clients.ApiResponse`

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`bid_floor_create`** | [**`BidFloorCreate`**](BidFloorCreate.md) |  |

### Return type

[**`BidFloor`**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_create**
> `ad_groups_create`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_create_create`::`Vector{AdGroupCreateCreate}`; _mediaType=nothing) -> `AdGroupsCreate200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_create`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_create_create`::`Vector{AdGroupCreateCreate}`; _mediaType=nothing) -> `Channel`{ `AdGroupsCreate200Response` }, `OpenAPI.Clients.ApiResponse`

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_create_create`** | [**`Vector{AdGroupCreateCreate}`**](AdGroupCreateCreate.md) |  |

### Return type

[**`AdGroupsCreate200Response`**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_download_csv**
> `ad_groups_dynamic_titles_download_csv`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_id`::`String`; _mediaType=nothing) -> `DynamicTitlesDownloadCSV`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_dynamic_titles_download_csv`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_id`::`String`; _mediaType=nothing) -> `Channel`{ `DynamicTitlesDownloadCSV` }, `OpenAPI.Clients.ApiResponse`

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_id`** | **`String`** | Ad group ID. |

### Return type

[**`DynamicTitlesDownloadCSV`**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_get_status**
> `ad_groups_dynamic_titles_get_status`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_id`::`String`; _mediaType=nothing) -> `DynamicTitlesGetStatus`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_dynamic_titles_get_status`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_id`::`String`; _mediaType=nothing) -> `Channel`{ `DynamicTitlesGetStatus` }, `OpenAPI.Clients.ApiResponse`

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_id`** | **`String`** | Ad group ID. |

### Return type

[**`DynamicTitlesGetStatus`**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_get_upload_url**
> `ad_groups_dynamic_titles_get_upload_url`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_id`::`String`; _mediaType=nothing) -> `DynamicTitlesUploadURL`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_dynamic_titles_get_upload_url`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_id`::`String`; _mediaType=nothing) -> `Channel`{ `DynamicTitlesUploadURL` }, `OpenAPI.Clients.ApiResponse`

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_id`** | **`String`** | Ad group ID. |

### Return type

[**`DynamicTitlesUploadURL`**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_process_csv**
> `ad_groups_dynamic_titles_process_csv`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_id`::`String`, `dynamic_titles_process_c_s_v_create`::`DynamicTitlesProcessCSVCreate`; _mediaType=nothing) -> `DynamicTitlesProcessCSV`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_dynamic_titles_process_csv`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_id`::`String`, `dynamic_titles_process_c_s_v_create`::`DynamicTitlesProcessCSVCreate`; _mediaType=nothing) -> `Channel`{ `DynamicTitlesProcessCSV` }, `OpenAPI.Clients.ApiResponse`

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_id`** | **`String`** | Ad group ID. |
**`dynamic_titles_process_c_s_v_create`** | [**`DynamicTitlesProcessCSVCreate`**](DynamicTitlesProcessCSVCreate.md) |  |

### Return type

[**`DynamicTitlesProcessCSV`**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_get**
> `ad_groups_get`(_api::`AdGroupsApi`, `ad_group_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `AdGroup`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_get`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_group_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `AdGroup` }, `OpenAPI.Clients.ApiResponse`

Get ad group

Get a specific ad group given the ad group ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_group_id`** | **`String`** | Ad group ID. |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Return type

[**`AdGroup`**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_list**
> `ad_groups_list`(_api::`AdGroupsApi`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `campaign_ids`=nothing, `ad_group_ids`=nothing, `entity_statuses`=nothing, `translate_interests_to_names`=nothing, _mediaType=nothing) -> `AdGroupsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_list`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `campaign_ids`=nothing, `ad_group_ids`=nothing, `entity_statuses`=nothing, `translate_interests_to_names`=nothing, _mediaType=nothing) -> `Channel`{ `AdGroupsList200Response` }, `OpenAPI.Clients.ApiResponse`

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]
 **`campaign_ids`** | [**`Vector{String}`**](String.md) | List of Campaign Ids to use to filter the results. | [default to nothing]
 **`ad_group_ids`** | [**`Vector{String}`**](String.md) | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [default to nothing]
 **`entity_statuses`** | [**`Vector{EntityStatus}`**](EntityStatus.md) | Entity status | [default to nothing]
 **`translate_interests_to_names`** | **`Bool`** | Return interests as text names (if value is true) rather than topic IDs. | [default to false]

### Return type

[**`AdGroupsList200Response`**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_targeting_analytics_get**
> `ad_groups_targeting_analytics_get`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `targeting_types`::`Vector{AdsAnalyticsAdGroupTargetingType}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `attribution_types`=nothing, `reporting_timezone`=nothing, `sort_columns`=nothing, `sort_ascending`=nothing, _mediaType=nothing) -> `MetricsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_targeting_analytics_get`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `targeting_types`::`Vector{AdsAnalyticsAdGroupTargetingType}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `attribution_types`=nothing, `reporting_timezone`=nothing, `sort_columns`=nothing, `sort_ascending`=nothing, _mediaType=nothing) -> `Channel`{ `MetricsResponse` }, `OpenAPI.Clients.ApiResponse`

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_ids`** | [**`Vector{String}`**](String.md) | List of Ad group Ids to use to filter the results. |
**`start_date`** | **`Date`** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`targeting_types`** | [**`Vector{AdsAnalyticsAdGroupTargetingType}`**](AdsAnalyticsAdGroupTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | **`Float64`** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **`attribution_types`** | [**`Vector{ConversionReportAttributionType}`**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [default to nothing]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]
 **`sort_columns`** | [**`Vector{String}`**](String.md) | Sort Columns. | [default to nothing]
 **`sort_ascending`** | **`Bool`** | Sort ascending. | [default to nothing]

### Return type

[**`MetricsResponse`**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_groups_update**
> `ad_groups_update`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `ad_group_update_batch_update`::`Vector{AdGroupUpdateBatchUpdate}`; _mediaType=nothing) -> `AdGroupsCreate200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_groups_update`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `ad_group_update_batch_update`::`Vector{AdGroupUpdateBatchUpdate}`; _mediaType=nothing) -> `Channel`{ `AdGroupsCreate200Response` }, `OpenAPI.Clients.ApiResponse`

Update ad groups

Update multiple existing ad groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`ad_group_update_batch_update`** | [**`Vector{AdGroupUpdateBatchUpdate}`**](AdGroupUpdateBatchUpdate.md) |  |

### Return type

[**`AdGroupsCreate200Response`**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_ad_groups_by_promotion_ids_list**
> `get_ad_groups_by_promotion_ids_list`(_api::`AdGroupsApi`, `ad_account_id`::`String`, `promotion_ids`::`Vector{String}`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, _mediaType=nothing) -> `AdGroupsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_ad_groups_by_promotion_ids_list`(_api::`AdGroupsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `promotion_ids`::`Vector{String}`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, _mediaType=nothing) -> `Channel`{ `AdGroupsList200Response` }, `OpenAPI.Clients.ApiResponse`

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AdGroupsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`promotion_ids`** | [**`Vector{String}`**](String.md) | List of Promotion IDs to use to filter the results. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]

### Return type

[**`AdGroupsList200Response`**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

