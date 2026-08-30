# AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adAccountAnalytics**](#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics|
|[**adAccountTargetingAnalyticsGet**](#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account|
|[**adAccountsCreate**](#adaccountscreate) | **POST** /ad_accounts | Create ad account|
|[**adAccountsGet**](#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account|
|[**adAccountsList**](#adaccountslist) | **GET** /ad_accounts | List ad accounts|
|[**analyticsCreateConversionProductReport**](#analyticscreateconversionproductreport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report|
|[**analyticsCreateMmmReport**](#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report|
|[**analyticsCreateReport**](#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report|
|[**analyticsCreateTemplateReport**](#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template|
|[**analyticsGetConversionProductReport**](#analyticsgetconversionproductreport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report|
|[**analyticsGetMmmReport**](#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.|
|[**analyticsGetReport**](#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call|
|[**sandboxDelete**](#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox|
|[**templatesList**](#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates|

# **adAccountAnalytics**
> Array<AdAccountAnalyticsItems> adAccountAnalytics()

  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)

const { status, data } = await apiInstance.adAccountAnalytics(
    startDate,
    endDate,
    columns,
    granularity,
    adAccountId,
    clickWindowDays,
    engagementWindowDays,
    viewWindowDays,
    conversionReportTime,
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
| **clickWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | (optional) defaults to 30|
| **engagementWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | (optional) defaults to 30|
| **viewWindowDays** | [**0 | 1 | 7 | 14 | 30 | 60**]**Array<0 &#124; 1 &#124; 7 &#124; 14 &#124; 30 &#124; 60>** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | (optional) defaults to 1|
| **conversionReportTime** | [**&#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;**]**Array<&#39;TIME_OF_AD_ACTION&#39; &#124; &#39;TIME_OF_CONVERSION&#39;>** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | (optional) defaults to 'TIME_OF_AD_ACTION'|
| **reportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | (optional) defaults to undefined|


### Return type

**Array<AdAccountAnalyticsItems>**

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

# **adAccountTargetingAnalyticsGet**
> MetricsResponse adAccountTargetingAnalyticsGet()

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let targetingTypes: Array<AdsAnalyticsAccountTargetingType>; //Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. (default to undefined)
let columns: Array<ReportingColumnSync>; //Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\'s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\'s microdollars. Otherwise, it\'s in microunits of the advertiser\'s currency.  For example, if the advertiser\'s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (default to undefined)
let clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
let engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
let viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60; //Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
let conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'; //The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
let attributionTypes: Array<ConversionReportAttributionType>; //List of types of attribution for the conversion report (optional) (default to undefined)
let reportingTimezone: ReportingTimeZone; //Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional) (default to undefined)

const { status, data } = await apiInstance.adAccountTargetingAnalyticsGet(
    adAccountId,
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
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **targetingTypes** | **Array&lt;AdsAnalyticsAccountTargetingType&gt;** | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | defaults to undefined|
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

# **adAccountsCreate**
> AdAccount adAccountsCreate(adAccountCreate)

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example

```typescript
import {
    AdAccountsApi,
    Configuration,
    AdAccountCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountCreate: AdAccountCreate; //

const { status, data } = await apiInstance.adAccountsCreate(
    adAccountCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountCreate** | **AdAccountCreate**|  | |


### Return type

**AdAccount**

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

# **adAccountsGet**
> AdAccount adAccountsGet()

Get an ad account

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; // (default to undefined)

const { status, data } = await apiInstance.adAccountsGet(
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] |  | defaults to undefined|


### Return type

**AdAccount**

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

# **adAccountsList**
> AdAccountsList200Response adAccountsList()

Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let includeSharedAccounts: boolean; //Include shared ad accounts (optional) (default to true)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.adAccountsList(
    includeSharedAccounts,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **includeSharedAccounts** | [**boolean**] | Include shared ad accounts | (optional) defaults to true|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**AdAccountsList200Response**

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

# **analyticsCreateConversionProductReport**
> ConversionProductReport analyticsCreateConversionProductReport(conversionProductReportCreate)

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration,
    ConversionProductReportCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let conversionProductReportCreate: ConversionProductReportCreate; //

const { status, data } = await apiInstance.analyticsCreateConversionProductReport(
    adAccountId,
    conversionProductReportCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **conversionProductReportCreate** | **ConversionProductReportCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**ConversionProductReport**

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

# **analyticsCreateMmmReport**
> MMMReport analyticsCreateMmmReport(mMMReportCreate)

    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it\'s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we\'ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration,
    MMMReportCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; // (default to undefined)
let mMMReportCreate: MMMReportCreate; //

const { status, data } = await apiInstance.analyticsCreateMmmReport(
    adAccountId,
    mMMReportCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **mMMReportCreate** | **MMMReportCreate**|  | |
| **adAccountId** | [**string**] |  | defaults to undefined|


### Return type

**MMMReport**

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

# **analyticsCreateReport**
> AdsAnalyticsCreateAsyncResponse analyticsCreateReport(adsAnalyticsCreateAsyncRequest)

  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration,
    AdsAnalyticsCreateAsyncRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest; //

const { status, data } = await apiInstance.analyticsCreateReport(
    adAccountId,
    adsAnalyticsCreateAsyncRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adsAnalyticsCreateAsyncRequest** | **AdsAnalyticsCreateAsyncRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdsAnalyticsCreateAsyncResponse**

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

# **analyticsCreateTemplateReport**
> TemplateBasedReport analyticsCreateTemplateReport()

  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; // (default to undefined)
let templateId: string; //Unique identifier of a template. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional) (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional) (default to undefined)
let granularity: Granularity; //  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (optional) (default to undefined)

const { status, data } = await apiInstance.analyticsCreateTemplateReport(
    adAccountId,
    templateId,
    startDate,
    endDate,
    granularity
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] |  | defaults to undefined|
| **templateId** | [**string**] | Unique identifier of a template. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | (optional) defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | (optional) defaults to undefined|
| **granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | (optional) defaults to undefined|


### Return type

**TemplateBasedReport**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
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

# **analyticsGetConversionProductReport**
> ConversionProductReport analyticsGetConversionProductReport()

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let token: string; //Token returned from the post request creation call (default to undefined)

const { status, data } = await apiInstance.analyticsGetConversionProductReport(
    adAccountId,
    token
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **token** | [**string**] | Token returned from the post request creation call | defaults to undefined|


### Return type

**ConversionProductReport**

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

# **analyticsGetMmmReport**
> MMMReport analyticsGetMmmReport()

    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; // (default to undefined)
let token: string; //Token returned from the post request creation call (default to undefined)

const { status, data } = await apiInstance.analyticsGetMmmReport(
    adAccountId,
    token
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] |  | defaults to undefined|
| **token** | [**string**] | Token returned from the post request creation call | defaults to undefined|


### Return type

**MMMReport**

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

# **analyticsGetReport**
> AdsAnalyticsGetAsyncResponse analyticsGetReport()

  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let token: string; //Token returned from the post request creation call (default to undefined)

const { status, data } = await apiInstance.analyticsGetReport(
    adAccountId,
    token
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **token** | [**string**] | Token returned from the post request creation call | defaults to undefined|


### Return type

**AdsAnalyticsGetAsyncResponse**

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

# **sandboxDelete**
> string sandboxDelete()

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.sandboxDelete(
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**string**

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

# **templatesList**
> TemplatesList200Response templatesList()

Gets all Templates associated with an ad account ID.

### Example

```typescript
import {
    AdAccountsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AdAccountsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)

const { status, data } = await apiInstance.templatesList(
    adAccountId,
    bookmark,
    pageSize,
    order
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|


### Return type

**TemplatesList200Response**

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

