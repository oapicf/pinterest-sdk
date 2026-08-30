# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adPreviewsCreate**](AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**adTargetingAnalyticsGet**](AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
| [**adsAnalytics**](AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**adsCreate**](AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**adsGet**](AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**adsList**](AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**adsUpdate**](AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
| [**campaignAdPreviewCreate**](AdsApi.md#campaignadpreviewcreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups |
| [**campaignAdPreviewDelete**](AdsApi.md#campaignadpreviewdelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups |
| [**campaignAdPreviewRead**](AdsApi.md#campaignadpreviewread) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups |



## adPreviewsCreate

> AdPreviewURLResponse adPreviewsCreate(adAccountId, adPreviewRequest)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdPreviewsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // AdPreviewRequest
    adPreviewRequest: ...,
  } satisfies AdPreviewsCreateRequest;

  try {
    const data = await api.adPreviewsCreate(body);
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
| **adPreviewRequest** | [AdPreviewRequest](AdPreviewRequest.md) |  | |

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

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


## adTargetingAnalyticsGet

> MetricsResponse adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdTargetingAnalyticsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Ad Ids to use to filter the results.
    adIds: ...,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<AdsAnalyticsAdTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    targetingTypes: ...,
    // Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    columns: ...,
    // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    granularity: ...,
    // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    clickWindowDays: ...,
    // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
    engagementWindowDays: ...,
    // ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    viewWindowDays: ...,
    // ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    conversionReportTime: ...,
    // Array<ConversionReportAttributionType> | List of types of attribution for the conversion report (optional)
    attributionTypes: ...,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
    // Array<string> | Sort Columns. (optional)
    sortColumns: ...,
    // boolean | Sort ascending. (optional)
    sortAscending: true,
  } satisfies AdTargetingAnalyticsGetRequest;

  try {
    const data = await api.adTargetingAnalyticsGet(body);
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
| **adIds** | `Array<string>` | List of Ad Ids to use to filter the results. | |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **targetingTypes** | `Array<AdsAnalyticsAdTargetingType>` | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | |
| **columns** | `Array<ReportingColumnSync>` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | `Granularity` |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `undefined`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [Optional] [Defaults to `undefined`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `undefined`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `ConversionReportTimeType` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `undefined`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
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


## adsAnalytics

> Array&lt;AdsAnalytics&gt; adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)

Get ad analytics

    Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdsAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    columns: ...,
    // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    granularity: ...,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Pin IDs. (optional)
    pinIds: ...,
    // Array<string> | List of Ad Ids to use to filter the results. (optional)
    adIds: ...,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    clickWindowDays: 8.14,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
    engagementWindowDays: 8.14,
    // 0 | 1 | 7 | 14 | 30 | 60 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    viewWindowDays: 8.14,
    // 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    conversionReportTime: conversionReportTime_example,
    // Array<string> | List of Campaign Ids to use to filter the results. (optional)
    campaignIds: ...,
    // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    reportingTimezone: ...,
  } satisfies AdsAnalyticsRequest;

  try {
    const data = await api.adsAnalytics(body);
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
| **columns** | `Array<ReportingColumnSync>` | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | `Granularity` |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [Defaults to `undefined`] [Enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **pinIds** | `Array<string>` | List of Pin IDs. | [Optional] |
| **adIds** | `Array<string>` | List of Ad Ids to use to filter the results. | [Optional] |
| **clickWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [Optional] [Defaults to `30`] [Enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | `0`, `1`, `7`, `14`, `30`, `60` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [Optional] [Defaults to `1`] [Enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [Optional] [Defaults to `&#39;TIME_OF_AD_ACTION&#39;`] [Enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **campaignIds** | `Array<string>` | List of Campaign Ids to use to filter the results. | [Optional] |
| **reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [Optional] [Defaults to `undefined`] [Enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**Array&lt;AdsAnalytics&gt;**](AdsAnalytics.md)

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


## adsCreate

> AdBatchWriteResponseModel adsCreate(adAccountId, adCreate)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<AdCreate>
    adCreate: ...,
  } satisfies AdsCreateRequest;

  try {
    const data = await api.adsCreate(body);
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
| **adCreate** | `Array<AdCreate>` |  | |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

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


## adsGet

> Ad adsGet(adId, adAccountId)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // string | The ID of this ad.
    adId: adId_example,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
  } satisfies AdsGetRequest;

  try {
    const data = await api.adsGet(body);
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
| **adId** | `string` | The ID of this ad. | [Defaults to `undefined`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |

### Return type

[**Ad**](Ad.md)

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


## adsList

> AdsList200Response adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

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
    // Array<string> | List of Ad Ids to use to filter the results. (optional)
    adIds: ...,
    // Array<EntityStatus> | Entity status (optional)
    entityStatuses: ...,
  } satisfies AdsListRequest;

  try {
    const data = await api.adsList(body);
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
| **adIds** | `Array<string>` | List of Ad Ids to use to filter the results. | [Optional] |
| **entityStatuses** | `Array<EntityStatus>` | Entity status | [Optional] |

### Return type

[**AdsList200Response**](AdsList200Response.md)

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


## adsUpdate

> AdBatchWriteResponseModel adsUpdate(adAccountId, adBatchUpdate)

Update ads

Update multiple existing ads

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { AdsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<AdBatchUpdate>
    adBatchUpdate: ...,
  } satisfies AdsUpdateRequest;

  try {
    const data = await api.adsUpdate(body);
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
| **adBatchUpdate** | `Array<AdBatchUpdate>` |  | |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

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


## campaignAdPreviewCreate

> Array&lt;CampaignAdPreviewCreate200ResponseInner&gt; campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { CampaignAdPreviewCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<CampaignAdPreviewCreate>
    campaignAdPreviewCreate: ...,
  } satisfies CampaignAdPreviewCreateRequest;

  try {
    const data = await api.campaignAdPreviewCreate(body);
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
| **campaignAdPreviewCreate** | `Array<CampaignAdPreviewCreate>` |  | |

### Return type

[**Array&lt;CampaignAdPreviewCreate200ResponseInner&gt;**](CampaignAdPreviewCreate200ResponseInner.md)

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


## campaignAdPreviewDelete

> Array&lt;CampaignAdPreviewDelete200ResponseInner&gt; campaignAdPreviewDelete(adGroupIds, adAccountId)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { CampaignAdPreviewDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // Array<string> | List of Ad group Ids to use to filter the results.
    adGroupIds: ...,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
  } satisfies CampaignAdPreviewDeleteRequest;

  try {
    const data = await api.campaignAdPreviewDelete(body);
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
| **adGroupIds** | `Array<string>` | List of Ad group Ids to use to filter the results. | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |

### Return type

[**Array&lt;CampaignAdPreviewDelete200ResponseInner&gt;**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## campaignAdPreviewRead

> Array&lt;CampaignAdPreview&gt; campaignAdPreviewRead(adGroupIds, adAccountId)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example

```ts
import {
  Configuration,
  AdsApi,
} from '';
import type { CampaignAdPreviewReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AdsApi(config);

  const body = {
    // Array<string> | List of Ad group Ids to use to filter the results.
    adGroupIds: ...,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
  } satisfies CampaignAdPreviewReadRequest;

  try {
    const data = await api.campaignAdPreviewRead(body);
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
| **adGroupIds** | `Array<string>` | List of Ad group Ids to use to filter the results. | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |

### Return type

[**Array&lt;CampaignAdPreview&gt;**](CampaignAdPreview.md)

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

