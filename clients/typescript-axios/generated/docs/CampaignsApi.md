# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adPinsAnalytics**](#adpinsanalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics|
|[**campaignTargetingAnalyticsGet**](#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns|
|[**campaignsAnalytics**](#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics|
|[**campaignsCreate**](#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns|
|[**campaignsGet**](#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign|
|[**campaignsList**](#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns|
|[**campaignsUpdate**](#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns|
|[**getCampaignDeliveryEstimates**](#getcampaigndeliveryestimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates|

# **adPinsAnalytics**
> Array<AdPinAnalytics> adPinsAnalytics()

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let campaignId: string; //Campaign Id to use to filter the results. (default to undefined)
let pinIds: Array<string>; //List of Pin IDs. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')

const { status, data } = await apiInstance.adPinsAnalytics(
    campaignId,
    pinIds,
    startDate,
    endDate,
    columns,
    granularity,
    adAccountId,
    clickWindowDays,
    engagementWindowDays,
    viewWindowDays,
    conversionReportTime
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **campaignId** | [**string**] | Campaign Id to use to filter the results. | defaults to undefined|
| **pinIds** | **Array&lt;string&gt;** | List of Pin IDs. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **columns** | **Array&lt;ReportingColumnSync&gt;** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30|
| **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to 30|
| **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1|
| **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'|


### Return type

**Array<AdPinAnalytics>**

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

# **campaignTargetingAnalyticsGet**
> MetricsResponse campaignTargetingAnalyticsGet()

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let targetingTypes: Array<AdsAnalyticsCampaignTargetingType>; //Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let attributionTypes: Array<ConversionReportAttributionType>; //List of types of attribution for the conversion report (optional) (default to undefined)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)

const { status, data } = await apiInstance.campaignTargetingAnalyticsGet(
    adAccountId,
    campaignIds,
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
    reportingTimezone
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **targetingTypes** | **Array&lt;AdsAnalyticsCampaignTargetingType&gt;** | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | defaults to undefined|
| **columns** | **Array&lt;ReportingColumnSync&gt;** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | defaults to undefined|
| **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30|
| **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to 30|
| **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1|
| **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'|
| **attributionTypes** | **Array&lt;ConversionReportAttributionType&gt;** | List of types of attribution for the conversion report | (optional) defaults to undefined|
| **reportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|


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

# **campaignsAnalytics**
> Array<CampaignsAnalyticsMetrics> campaignsAnalytics()

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let aggregateReportRows: boolean; //Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to false)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)

const { status, data } = await apiInstance.campaignsAnalytics(
    startDate,
    endDate,
    campaignIds,
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
| **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | defaults to undefined|
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

**Array<CampaignsAnalyticsMetrics>**

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

# **campaignsCreate**
> CampaignBatchWriteResponseModel campaignsCreate(campaignCreateItem)

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser\'s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser\'s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\'s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let campaignCreateItem: Array<CampaignCreateItem>; //

const { status, data } = await apiInstance.campaignsCreate(
    adAccountId,
    campaignCreateItem
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **campaignCreateItem** | **Array<CampaignCreateItem>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**CampaignBatchWriteResponseModel**

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

# **campaignsGet**
> Campaign campaignsGet()

Get a specific campaign given the campaign ID.

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let campaignId: string; //Campaign ID, must be associated with the ad account ID provided in the path. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.campaignsGet(
    campaignId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **campaignId** | [**string**] | Campaign ID, must be associated with the ad account ID provided in the path. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Campaign**

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

# **campaignsList**
> CampaignsList200Response campaignsList()

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (optional) (default to undefined)
let entityStatuses: Array<EntityStatus>; //Entity status (optional) (default to undefined)

const { status, data } = await apiInstance.campaignsList(
    adAccountId,
    bookmark,
    pageSize,
    order,
    campaignIds,
    entityStatuses
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
| **entityStatuses** | **Array&lt;EntityStatus&gt;** | Entity status | (optional) defaults to undefined|


### Return type

**CampaignsList200Response**

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

# **campaignsUpdate**
> CampaignBatchWriteResponseModel campaignsUpdate(campaignBatchUpdateItem)

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser\'s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser\'s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\'s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let campaignBatchUpdateItem: Array<CampaignBatchUpdateItem>; //

const { status, data } = await apiInstance.campaignsUpdate(
    adAccountId,
    campaignBatchUpdateItem
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **campaignBatchUpdateItem** | **Array<CampaignBatchUpdateItem>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**CampaignBatchWriteResponseModel**

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

# **getCampaignDeliveryEstimates**
> CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(campaignDeliveryEstimatesCampaign)

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example

```typescript
import {
    CampaignsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CampaignsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let campaignDeliveryEstimatesCampaign: Array<CampaignDeliveryEstimatesCampaign>; //

const { status, data } = await apiInstance.getCampaignDeliveryEstimates(
    adAccountId,
    campaignDeliveryEstimatesCampaign
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **campaignDeliveryEstimatesCampaign** | **Array<CampaignDeliveryEstimatesCampaign>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**CampaignDeliveryEstimatesResponse**

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
|**503** | The service is temporarily unavailable. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

