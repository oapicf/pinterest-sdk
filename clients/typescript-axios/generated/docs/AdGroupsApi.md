# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adGroupsAnalytics**](#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics|
|[**adGroupsAudienceSizing**](#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing|
|[**adGroupsBidFloorGet**](#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors|
|[**adGroupsCreate**](#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups|
|[**adGroupsDynamicTitlesDownloadCsv**](#adgroupsdynamictitlesdownloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL|
|[**adGroupsDynamicTitlesGetStatus**](#adgroupsdynamictitlesgetstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status|
|[**adGroupsDynamicTitlesGetUploadUrl**](#adgroupsdynamictitlesgetuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL|
|[**adGroupsDynamicTitlesProcessCsv**](#adgroupsdynamictitlesprocesscsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV|
|[**adGroupsGet**](#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group|
|[**adGroupsList**](#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups|
|[**adGroupsTargetingAnalyticsGet**](#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups|
|[**adGroupsUpdate**](#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups|
|[**getAdGroupsByPromotionIdsList**](#getadgroupsbypromotionidslist) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.|

# **adGroupsAnalytics**
> Array<AdGroupsAnalyticsMetrics> adGroupsAnalytics()

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let adGroupIds: Array<string>; //List of Ad group Ids to use to filter the results. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let aggregateReportRows: boolean; //Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to false)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)

const { status, data } = await apiInstance.adGroupsAnalytics(
    startDate,
    endDate,
    adGroupIds,
    columns,
    granularity,
    adAccountId,
    clickWindowDays,
    engagementWindowDays,
    viewWindowDays,
    conversionReportTime,
    aggregateReportRows,
    reportingTimezone
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to use to filter the results. | defaults to undefined|
| **columns** | **Array&lt;ReportingColumnSync&gt;** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30|
| **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to 30|
| **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1|
| **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'|
| **aggregateReportRows** | [**boolean**] | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | (optional) defaults to false|
| **reportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|


### Return type

**Array<AdGroupsAnalyticsMetrics>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsAudienceSizing**
> AdGroupAudienceSizing adGroupsAudienceSizing(adGroupAudienceSizingCreate)

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration,
    AdGroupAudienceSizingCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate; //

const { status, data } = await apiInstance.adGroupsAudienceSizing(
    adAccountId,
    adGroupAudienceSizingCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adGroupAudienceSizingCreate** | **AdGroupAudienceSizingCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdGroupAudienceSizing**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsBidFloorGet**
> BidFloor adGroupsBidFloorGet(bidFloorCreate)

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser\'s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\'s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example

```typescript
import {
    AdGroupsApi,
    Configuration,
    BidFloorCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bidFloorCreate: BidFloorCreate; //

const { status, data } = await apiInstance.adGroupsBidFloorGet(
    adAccountId,
    bidFloorCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bidFloorCreate** | **BidFloorCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**BidFloor**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsCreate**
> AdGroupsCreate200Response adGroupsCreate(adGroupCreateCreate)

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser\'s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\'s profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupCreateCreate: Array<AdGroupCreateCreate>; //

const { status, data } = await apiInstance.adGroupsCreate(
    adAccountId,
    adGroupCreateCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adGroupCreateCreate** | **Array<AdGroupCreateCreate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdGroupsCreate200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesDownloadCsv**
> DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv()

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupId: string; //Ad group ID. (default to undefined)

const { status, data } = await apiInstance.adGroupsDynamicTitlesDownloadCsv(
    adAccountId,
    adGroupId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **adGroupId** | [**string**] | Ad group ID. | defaults to undefined|


### Return type

**DynamicTitlesDownloadCSV**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesGetStatus**
> DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus()

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupId: string; //Ad group ID. (default to undefined)

const { status, data } = await apiInstance.adGroupsDynamicTitlesGetStatus(
    adAccountId,
    adGroupId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **adGroupId** | [**string**] | Ad group ID. | defaults to undefined|


### Return type

**DynamicTitlesGetStatus**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesGetUploadUrl**
> DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl()

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupId: string; //Ad group ID. (default to undefined)

const { status, data } = await apiInstance.adGroupsDynamicTitlesGetUploadUrl(
    adAccountId,
    adGroupId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **adGroupId** | [**string**] | Ad group ID. | defaults to undefined|


### Return type

**DynamicTitlesUploadURL**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesProcessCsv**
> DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(dynamicTitlesProcessCSVCreate)

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration,
    DynamicTitlesProcessCSVCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupId: string; //Ad group ID. (default to undefined)
let dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate; //

const { status, data } = await apiInstance.adGroupsDynamicTitlesProcessCsv(
    adAccountId,
    adGroupId,
    dynamicTitlesProcessCSVCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **dynamicTitlesProcessCSVCreate** | **DynamicTitlesProcessCSVCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **adGroupId** | [**string**] | Ad group ID. | defaults to undefined|


### Return type

**DynamicTitlesProcessCSV**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsGet**
> AdGroup adGroupsGet()

Get a specific ad group given the ad group ID.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adGroupId: string; //Ad group ID. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.adGroupsGet(
    adGroupId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adGroupId** | [**string**] | Ad group ID. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdGroup**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsList**
> AdGroupsList200Response adGroupsList()

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (optional) (default to undefined)
let adGroupIds: Array<string>; //List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)
let entityStatuses: Array<EntityStatus>; //Entity status (optional) (default to undefined)
let translateInterestsToNames: boolean; //Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

const { status, data } = await apiInstance.adGroupsList(
    adAccountId,
    bookmark,
    pageSize,
    order,
    campaignIds,
    adGroupIds,
    entityStatuses,
    translateInterestsToNames
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | (optional) defaults to undefined|
| **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|
| **entityStatuses** | **Array&lt;EntityStatus&gt;** | Entity status | (optional) defaults to undefined|
| **translateInterestsToNames** | [**boolean**] | Return interests as text names (if value is true) rather than topic IDs. | (optional) defaults to false|


### Return type

**AdGroupsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsTargetingAnalyticsGet**
> MetricsResponse adGroupsTargetingAnalyticsGet()

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupIds: Array<string>; //List of Ad group Ids to use to filter the results. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let targetingTypes: Array<AdsAnalyticsAdGroupTargetingType>; //Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let attributionTypes: Array<ConversionReportAttributionType>; //List of types of attribution for the conversion report (optional) (default to undefined)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)
let sortColumns: Array<string>; //Sort Columns. (optional) (default to undefined)
let sortAscending: boolean; //Sort ascending. (optional) (default to undefined)

const { status, data } = await apiInstance.adGroupsTargetingAnalyticsGet(
    adAccountId,
    adGroupIds,
    startDate,
    endDate,
    targetingTypes,
    columns,
    granularity,
    clickWindowDays,
    engagementWindowDays,
    viewWindowDays,
    conversionReportTime,
    attributionTypes,
    reportingTimezone,
    sortColumns,
    sortAscending
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to use to filter the results. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **targetingTypes** | **Array&lt;AdsAnalyticsAdGroupTargetingType&gt;** | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | defaults to undefined|
| **columns** | **Array&lt;ReportingColumnSync&gt;** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | defaults to undefined|
| **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30|
| **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to 30|
| **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1|
| **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'|
| **attributionTypes** | **Array&lt;ConversionReportAttributionType&gt;** | List of types of attribution for the conversion report | (optional) defaults to undefined|
| **reportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|
| **sortColumns** | **Array&lt;string&gt;** | Sort Columns. | (optional) defaults to undefined|
| **sortAscending** | [**boolean**] | Sort ascending. | (optional) defaults to undefined|


### Return type

**MetricsResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsUpdate**
> AdGroupsCreate200Response adGroupsUpdate(adGroupUpdateBatchUpdate)

Update multiple existing ad groups.

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adGroupUpdateBatchUpdate: Array<AdGroupUpdateBatchUpdate>; //

const { status, data } = await apiInstance.adGroupsUpdate(
    adAccountId,
    adGroupUpdateBatchUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adGroupUpdateBatchUpdate** | **Array<AdGroupUpdateBatchUpdate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdGroupsCreate200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAdGroupsByPromotionIdsList**
> AdGroupsList200Response getAdGroupsByPromotionIdsList()

  Get a list of ad groups that are associated with those promotion ids

### Example

```typescript
import {
    AdGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdGroupsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let promotionIds: Array<string>; //List of Promotion IDs to use to filter the results. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)

const { status, data } = await apiInstance.getAdGroupsByPromotionIdsList(
    adAccountId,
    promotionIds,
    bookmark,
    pageSize,
    order
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **promotionIds** | **Array&lt;string&gt;** | List of Promotion IDs to use to filter the results. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|


### Return type

**AdGroupsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

