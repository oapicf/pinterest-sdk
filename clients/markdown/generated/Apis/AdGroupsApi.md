# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adGroups/analytics**](AdGroupsApi.md#adGroups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**adGroups/audienceSizing**](AdGroupsApi.md#adGroups/audienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
| [**adGroups/create**](AdGroupsApi.md#adGroups/create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**adGroups/get**](AdGroupsApi.md#adGroups/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**adGroups/list**](AdGroupsApi.md#adGroups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**adGroups/update**](AdGroupsApi.md#adGroups/update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
| [**adGroupsBidFloor/get**](AdGroupsApi.md#adGroupsBidFloor/get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
| [**adGroupsDynamicTitles/downloadCsv**](AdGroupsApi.md#adGroupsDynamicTitles/downloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL |
| [**adGroupsDynamicTitles/getStatus**](AdGroupsApi.md#adGroupsDynamicTitles/getStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status |
| [**adGroupsDynamicTitles/getUploadUrl**](AdGroupsApi.md#adGroupsDynamicTitles/getUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL |
| [**adGroupsDynamicTitles/processCsv**](AdGroupsApi.md#adGroupsDynamicTitles/processCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV |
| [**adGroupsTargetingAnalytics/get**](AdGroupsApi.md#adGroupsTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| [**getAdGroupsByPromotionIds/list**](AdGroupsApi.md#getAdGroupsByPromotionIds/list) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs. |


<a name="adGroups/analytics"></a>
# **adGroups/analytics**
> List adGroups/analytics(start\_date, end\_date, ad\_group\_ids, columns, granularity, ad\_account\_id, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, aggregate\_report\_rows, reporting\_timezone)

Get ad group analytics

    Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to use to filter the results. | [default to null] |
| **columns** | [**List**](../Models/ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **click\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagement\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **view\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **aggregate\_report\_rows** | **Boolean**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false] |
| **reporting\_timezone** | [**ReportingTimeZone**](../Models/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**List**](../Models/AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroups/audienceSizing"></a>
# **adGroups/audienceSizing**
> AdGroupAudienceSizing adGroups/audienceSizing(ad\_account\_id, AdGroupAudienceSizingCreate)

Get audience sizing

    Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdGroupAudienceSizingCreate** | [**AdGroupAudienceSizingCreate**](../Models/AdGroupAudienceSizingCreate.md)|  | |

### Return type

[**AdGroupAudienceSizing**](../Models/AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroups/create"></a>
# **adGroups/create**
> ad_groups_create_200_response adGroups/create(ad\_account\_id, AdGroupCreateCreate)

Create ad groups

    Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdGroupCreateCreate** | [**List**](../Models/AdGroupCreateCreate.md)|  | |

### Return type

[**ad_groups_create_200_response**](../Models/ad_groups_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroups/get"></a>
# **adGroups/get**
> AdGroup adGroups/get(ad\_group\_id, ad\_account\_id)

Get ad group

    Get a specific ad group given the ad group ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_group\_id** | **String**| Ad group ID. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**AdGroup**](../Models/AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroups/list"></a>
# **adGroups/list**
> ad_groups_list_200_response adGroups/list(ad\_account\_id, bookmark, page\_size, order, campaign\_ids, ad\_group\_ids, entity\_statuses, translate\_interests\_to\_names)

List ad groups

    List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/EntityStatus.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]] |
| **translate\_interests\_to\_names** | **Boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false] |

### Return type

[**ad_groups_list_200_response**](../Models/ad_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroups/update"></a>
# **adGroups/update**
> ad_groups_create_200_response adGroups/update(ad\_account\_id, AdGroupUpdateBatchUpdate)

Update ad groups

    Update multiple existing ad groups.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdGroupUpdateBatchUpdate** | [**List**](../Models/AdGroupUpdateBatchUpdate.md)|  | |

### Return type

[**ad_groups_create_200_response**](../Models/ad_groups_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroupsBidFloor/get"></a>
# **adGroupsBidFloor/get**
> BidFloor adGroupsBidFloor/get(ad\_account\_id, BidFloorCreate)

Get bid floors

    List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **BidFloorCreate** | [**BidFloorCreate**](../Models/BidFloorCreate.md)|  | |

### Return type

[**BidFloor**](../Models/BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroupsDynamicTitles/downloadCsv"></a>
# **adGroupsDynamicTitles/downloadCsv**
> DynamicTitlesDownloadCSV adGroupsDynamicTitles/downloadCsv(ad\_account\_id, ad\_group\_id)

Get dynamic titles CSV download URL

    Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_group\_id** | **String**| Ad group ID. | [default to null] |

### Return type

[**DynamicTitlesDownloadCSV**](../Models/DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroupsDynamicTitles/getStatus"></a>
# **adGroupsDynamicTitles/getStatus**
> DynamicTitlesGetStatus adGroupsDynamicTitles/getStatus(ad\_account\_id, ad\_group\_id)

Get dynamic titles status

    Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_group\_id** | **String**| Ad group ID. | [default to null] |

### Return type

[**DynamicTitlesGetStatus**](../Models/DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroupsDynamicTitles/getUploadUrl"></a>
# **adGroupsDynamicTitles/getUploadUrl**
> DynamicTitlesUploadURL adGroupsDynamicTitles/getUploadUrl(ad\_account\_id, ad\_group\_id)

Get dynamic titles upload URL

    Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_group\_id** | **String**| Ad group ID. | [default to null] |

### Return type

[**DynamicTitlesUploadURL**](../Models/DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroupsDynamicTitles/processCsv"></a>
# **adGroupsDynamicTitles/processCsv**
> DynamicTitlesProcessCSV adGroupsDynamicTitles/processCsv(ad\_account\_id, ad\_group\_id, DynamicTitlesProcessCSVCreate)

Process dynamic titles CSV

    Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_group\_id** | **String**| Ad group ID. | [default to null] |
| **DynamicTitlesProcessCSVCreate** | [**DynamicTitlesProcessCSVCreate**](../Models/DynamicTitlesProcessCSVCreate.md)|  | |

### Return type

[**DynamicTitlesProcessCSV**](../Models/DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroupsTargetingAnalytics/get"></a>
# **adGroupsTargetingAnalytics/get**
> MetricsResponse adGroupsTargetingAnalytics/get(ad\_account\_id, ad\_group\_ids, start\_date, end\_date, targeting\_types, columns, granularity, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, attribution\_types, reporting\_timezone, sort\_columns, sort\_ascending)

Get targeting analytics for ad groups

    Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to use to filter the results. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **targeting\_types** | [**List**](../Models/AdsAnalyticsAdGroupTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | [default to null] |
| **columns** | [**List**](../Models/ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **click\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagement\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **view\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attribution\_types** | [**List**](../Models/ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] [default to null] |
| **reporting\_timezone** | [**ReportingTimeZone**](../Models/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |
| **sort\_columns** | [**List**](../Models/String.md)| Sort Columns. | [optional] [default to null] |
| **sort\_ascending** | **Boolean**| Sort ascending. | [optional] [default to null] |

### Return type

[**MetricsResponse**](../Models/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getAdGroupsByPromotionIds/list"></a>
# **getAdGroupsByPromotionIds/list**
> ad_groups_list_200_response getAdGroupsByPromotionIds/list(ad\_account\_id, promotion\_ids, bookmark, page\_size, order)

List of ad groups using promotions IDs.

      Get a list of ad groups that are associated with those promotion ids

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **promotion\_ids** | [**List**](../Models/String.md)| List of Promotion IDs to use to filter the results. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |

### Return type

[**ad_groups_list_200_response**](../Models/ad_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

