# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adPreviewsCreate**](#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image|
|[**adTargetingAnalyticsGet**](#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads|
|[**adsAnalytics**](#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics|
|[**adsCreate**](#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads|
|[**adsGet**](#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad|
|[**adsList**](#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads|
|[**adsUpdate**](#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads|
|[**campaignAdPreviewCreate**](#campaignadpreviewcreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups|
|[**campaignAdPreviewDelete**](#campaignadpreviewdelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups|
|[**campaignAdPreviewRead**](#campaignadpreviewread) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups|

# **adPreviewsCreate**
> AdPreviewURLResponse adPreviewsCreate(adPreviewRequest)

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example

```typescript
import {
    AdsApi,
    Configuration,
    AdPreviewRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adPreviewRequest: AdPreviewRequest; //

const { status, data } = await apiInstance.adPreviewsCreate(
    adAccountId,
    adPreviewRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adPreviewRequest** | **AdPreviewRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdPreviewURLResponse**

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

# **adTargetingAnalyticsGet**
> MetricsResponse adTargetingAnalyticsGet()

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adIds: Array<string>; //List of Ad Ids to use to filter the results. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let targetingTypes: Array<AdsAnalyticsAdTargetingType>; //Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let clickWindowDays: ConversionAttributionWindowDays; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to undefined)
let engagementWindowDays: ConversionAttributionWindowDays; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to undefined)
let viewWindowDays: ConversionAttributionWindowDays; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to undefined)
let conversionReportTime: ConversionReportTimeType; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to undefined)
let attributionTypes: Array<ConversionReportAttributionType>; //List of types of attribution for the conversion report (optional) (default to undefined)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)
let sortColumns: Array<string>; //Sort Columns. (optional) (default to undefined)
let sortAscending: boolean; //Sort ascending. (optional) (default to undefined)

const { status, data } = await apiInstance.adTargetingAnalyticsGet(
    adAccountId,
    adIds,
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
| **adIds** | **Array&lt;string&gt;** | List of Ad Ids to use to filter the results. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **targetingTypes** | **Array&lt;AdsAnalyticsAdTargetingType&gt;** | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | defaults to undefined|
| **columns** | **Array&lt;ReportingColumnSync&gt;** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | defaults to undefined|
| **clickWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to undefined|
| **engagementWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to undefined|
| **viewWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to undefined|
| **conversionReportTime** | **ConversionReportTimeType** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to undefined|
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

# **adsAnalytics**
> Array<AdsAnalytics> adsAnalytics()

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let pinIds: Array<string>; //List of Pin IDs. (optional) (default to undefined)
let adIds: Array<string>; //List of Ad Ids to use to filter the results. (optional) (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (optional) (default to undefined)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)

const { status, data } = await apiInstance.adsAnalytics(
    startDate,
    endDate,
    columns,
    granularity,
    adAccountId,
    pinIds,
    adIds,
    clickWindowDays,
    engagementWindowDays,
    viewWindowDays,
    conversionReportTime,
    campaignIds,
    reportingTimezone
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **columns** | **Array&lt;ReportingColumnSync&gt;** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.  For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **pinIds** | **Array&lt;string&gt;** | List of Pin IDs. | (optional) defaults to undefined|
| **adIds** | **Array&lt;string&gt;** | List of Ad Ids to use to filter the results. | (optional) defaults to undefined|
| **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30|
| **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to 30|
| **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1|
| **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'|
| **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | (optional) defaults to undefined|
| **reportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|


### Return type

**Array<AdsAnalytics>**

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

# **adsCreate**
> AdBatchWriteResponseModel adsCreate(adCreate)

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adCreate: Array<AdCreate>; //

const { status, data } = await apiInstance.adsCreate(
    adAccountId,
    adCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adCreate** | **Array<AdCreate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdBatchWriteResponseModel**

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

# **adsGet**
> Ad adsGet()

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adId: string; //The ID of this ad. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.adsGet(
    adId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adId** | [**string**] | The ID of this ad. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Ad**

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

# **adsList**
> AdsList200Response adsList()

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (optional) (default to undefined)
let adGroupIds: Array<string>; //List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)
let adIds: Array<string>; //List of Ad Ids to use to filter the results. (optional) (default to undefined)
let entityStatuses: Array<EntityStatus>; //Entity status (optional) (default to undefined)

const { status, data } = await apiInstance.adsList(
    adAccountId,
    bookmark,
    pageSize,
    order,
    campaignIds,
    adGroupIds,
    adIds,
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
| **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|
| **adIds** | **Array&lt;string&gt;** | List of Ad Ids to use to filter the results. | (optional) defaults to undefined|
| **entityStatuses** | **Array&lt;EntityStatus&gt;** | Entity status | (optional) defaults to undefined|


### Return type

**AdsList200Response**

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

# **adsUpdate**
> AdBatchWriteResponseModel adsUpdate(adBatchUpdate)

Update multiple existing ads

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adBatchUpdate: Array<AdBatchUpdate>; //

const { status, data } = await apiInstance.adsUpdate(
    adAccountId,
    adBatchUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adBatchUpdate** | **Array<AdBatchUpdate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdBatchWriteResponseModel**

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

# **campaignAdPreviewCreate**
> Array<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(campaignAdPreviewCreate)

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let campaignAdPreviewCreate: Array<CampaignAdPreviewCreate>; //

const { status, data } = await apiInstance.campaignAdPreviewCreate(
    adAccountId,
    campaignAdPreviewCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **campaignAdPreviewCreate** | **Array<CampaignAdPreviewCreate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Array<CampaignAdPreviewCreate200ResponseInner>**

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

# **campaignAdPreviewDelete**
> Array<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete()

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adGroupIds: Array<string>; //List of Ad group Ids to use to filter the results. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.campaignAdPreviewDelete(
    adGroupIds,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to use to filter the results. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Array<CampaignAdPreviewDelete200ResponseInner>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignAdPreviewRead**
> Array<CampaignAdPreview> campaignAdPreviewRead()

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example

```typescript
import {
    AdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdsApi(configuration);

let adGroupIds: Array<string>; //List of Ad group Ids to use to filter the results. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.campaignAdPreviewRead(
    adGroupIds,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adGroupIds** | **Array&lt;string&gt;** | List of Ad group Ids to use to filter the results. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Array<CampaignAdPreview>**

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

