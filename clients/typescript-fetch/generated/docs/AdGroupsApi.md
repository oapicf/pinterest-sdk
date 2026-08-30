# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adGroupsAnalytics**](AdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**adGroupsAudienceSizing**](AdGroupsApi.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
| [**adGroupsBidFloorGet**](AdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
| [**adGroupsCreate**](AdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**adGroupsDynamicTitlesDownloadCsv**](AdGroupsApi.md#adgroupsdynamictitlesdownloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL |
| [**adGroupsDynamicTitlesGetStatus**](AdGroupsApi.md#adgroupsdynamictitlesgetstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status |
| [**adGroupsDynamicTitlesGetUploadUrl**](AdGroupsApi.md#adgroupsdynamictitlesgetuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL |
| [**adGroupsDynamicTitlesProcessCsv**](AdGroupsApi.md#adgroupsdynamictitlesprocesscsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV |
| [**adGroupsGet**](AdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**adGroupsList**](AdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**adGroupsTargetingAnalyticsGet**](AdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| [**adGroupsUpdate**](AdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
| [**getAdGroupsByPromotionIdsList**](AdGroupsApi.md#getadgroupsbypromotionidslist) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs. |



## adGroupsAnalytics

> Array&lt;AdGroupsAnalyticsMetrics&gt; adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

Get ad group analytics

Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<string> | List of Ad group Ids to use to filter the results.
    adGroupIds: ...,
    // Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    columns: ...,
    // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    granularity: ...,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    clickWindowDays: 8.14,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
    engagementWindowDays: 8.14,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    viewWindowDays: 8.14,
    // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    conversionReportTime: conversionReportTime_example,
    // boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional)
    aggregateReportRows: true,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
  } satisfies AdGroupsAnalyticsRequest;

  try {
    const data = await api.adGroupsAnalytics(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **adGroupIds** | `Array<string>` | List of Ad group Ids to use to filter the results. | |
| **columns** | `Array<ReportingColumnSync>` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | `Granularity` |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **aggregateReportRows** | `boolean` | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `false`] |
| **reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `undefined`] [Enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**Array&lt;AdGroupsAnalyticsMetrics&gt;**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsAudienceSizing

> AdGroupAudienceSizing adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsAudienceSizingRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // AdGroupAudienceSizingCreate
    adGroupAudienceSizingCreate: ...,
  } satisfies AdGroupsAudienceSizingRequest;

  try {
    const data = await api.adGroupsAudienceSizing(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupAudienceSizingCreate** | [AdGroupAudienceSizingCreate](AdGroupAudienceSizingCreate.md) |  | |

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsBidFloorGet

> BidFloor adGroupsBidFloorGet(adAccountId, bidFloorCreate)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsBidFloorGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // BidFloorCreate
    bidFloorCreate: ...,
  } satisfies AdGroupsBidFloorGetRequest;

  try {
    const data = await api.adGroupsBidFloorGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **bidFloorCreate** | [BidFloorCreate](BidFloorCreate.md) |  | |

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsCreate

> AdGroupsCreate200Response adGroupsCreate(adAccountId, adGroupCreateCreate)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser\&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<AdGroupCreateCreate>
    adGroupCreateCreate: ...,
  } satisfies AdGroupsCreateRequest;

  try {
    const data = await api.adGroupsCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupCreateCreate** | `Array<AdGroupCreateCreate>` |  | |

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsDynamicTitlesDownloadCsv

> DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsDynamicTitlesDownloadCsvRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Ad group ID.
    adGroupId: adGroupId_example,
  } satisfies AdGroupsDynamicTitlesDownloadCsvRequest;

  try {
    const data = await api.adGroupsDynamicTitlesDownloadCsv(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupId** | `string` | Ad group ID. | [Defaults to `undefined`] |

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsDynamicTitlesGetStatus

> DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsDynamicTitlesGetStatusRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Ad group ID.
    adGroupId: adGroupId_example,
  } satisfies AdGroupsDynamicTitlesGetStatusRequest;

  try {
    const data = await api.adGroupsDynamicTitlesGetStatus(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupId** | `string` | Ad group ID. | [Defaults to `undefined`] |

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsDynamicTitlesGetUploadUrl

> DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsDynamicTitlesGetUploadUrlRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Ad group ID.
    adGroupId: adGroupId_example,
  } satisfies AdGroupsDynamicTitlesGetUploadUrlRequest;

  try {
    const data = await api.adGroupsDynamicTitlesGetUploadUrl(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupId** | `string` | Ad group ID. | [Defaults to `undefined`] |

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsDynamicTitlesProcessCsv

> DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsDynamicTitlesProcessCsvRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Ad group ID.
    adGroupId: adGroupId_example,
    // DynamicTitlesProcessCSVCreate
    dynamicTitlesProcessCSVCreate: ...,
  } satisfies AdGroupsDynamicTitlesProcessCsvRequest;

  try {
    const data = await api.adGroupsDynamicTitlesProcessCsv(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupId** | `string` | Ad group ID. | [Defaults to `undefined`] |
| **dynamicTitlesProcessCSVCreate** | [DynamicTitlesProcessCSVCreate](DynamicTitlesProcessCSVCreate.md) |  | |

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsGet

> AdGroup adGroupsGet(adGroupId, adAccountId)

Get ad group

Get a specific ad group given the ad group ID.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Ad group ID.
    adGroupId: adGroupId_example,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
  } satisfies AdGroupsGetRequest;

  try {
    const data = await api.adGroupsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adGroupId** | `string` | Ad group ID. | [Defaults to `undefined`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |

### Return type

[**AdGroup**](AdGroup.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsList

> AdGroupsList200Response adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
    // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ...,
    // Array<string> | List of Campaign Ids to use to filter the results. (optional)
    campaignIds: ...,
    // Array<string> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
    adGroupIds: ...,
    // Array<EntityStatus> | Entity status (optional)
    entityStatuses: ...,
    // boolean | Return interests as text names (if value is true) rather than topic IDs. (optional)
    translateInterestsToNames: true,
  } satisfies AdGroupsListRequest;

  try {
    const data = await api.adGroupsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |
| **order** | `PinterestLibPaginationOrder` | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |
| **campaignIds** | `Array<string>` | List of Campaign Ids to use to filter the results. | [Optional] |
| **adGroupIds** | `Array<string>` | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [Optional] |
| **entityStatuses** | `Array<EntityStatus>` | Entity status | [Optional] |
| **translateInterestsToNames** | `boolean` | Return interests as text names (if value is true) rather than topic IDs. | [Optional] [Defaults to `false`] |

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsTargetingAnalyticsGet

> MetricsResponse adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsTargetingAnalyticsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Ad group Ids to use to filter the results.
    adGroupIds: ...,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<AdsAnalyticsAdGroupTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
    targetingTypes: ...,
    // Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    columns: ...,
    // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    granularity: ...,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    clickWindowDays: 8.14,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
    engagementWindowDays: 8.14,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    viewWindowDays: 8.14,
    // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    conversionReportTime: conversionReportTime_example,
    // Array<ConversionReportAttributionType> | List of types of attribution for the conversion report (optional)
    attributionTypes: ...,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
    // Array<string> | Sort Columns. (optional)
    sortColumns: ...,
    // boolean | Sort ascending. (optional)
    sortAscending: true,
  } satisfies AdGroupsTargetingAnalyticsGetRequest;

  try {
    const data = await api.adGroupsTargetingAnalyticsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupIds** | `Array<string>` | List of Ad group Ids to use to filter the results. | |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **targetingTypes** | `Array<AdsAnalyticsAdGroupTargetingType>` | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | |
| **columns** | `Array<ReportingColumnSync>` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | `Granularity` |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attributionTypes** | `Array<ConversionReportAttributionType>` | List of types of attribution for the conversion report | [Optional] |
| **reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `undefined`] [Enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |
| **sortColumns** | `Array<string>` | Sort Columns. | [Optional] |
| **sortAscending** | `boolean` | Sort ascending. | [Optional] [Defaults to `undefined`] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adGroupsUpdate

> AdGroupsCreate200Response adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)

Update ad groups

Update multiple existing ad groups.

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { AdGroupsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<AdGroupUpdateBatchUpdate>
    adGroupUpdateBatchUpdate: ...,
  } satisfies AdGroupsUpdateRequest;

  try {
    const data = await api.adGroupsUpdate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **adGroupUpdateBatchUpdate** | `Array<AdGroupUpdateBatchUpdate>` |  | |

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getAdGroupsByPromotionIdsList

> AdGroupsList200Response getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example

```ts
import {
  Configuration,
  AdGroupsApi,
} from '';
import type { GetAdGroupsByPromotionIdsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdGroupsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Promotion IDs to use to filter the results.
    promotionIds: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
    // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ...,
  } satisfies GetAdGroupsByPromotionIdsListRequest;

  try {
    const data = await api.getAdGroupsByPromotionIdsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **promotionIds** | `Array<string>` | List of Promotion IDs to use to filter the results. | |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |
| **order** | `PinterestLibPaginationOrder` | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

