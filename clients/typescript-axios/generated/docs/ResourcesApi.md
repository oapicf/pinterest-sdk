# ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adAccountCountriesGet**](#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries|
|[**deliveryMetricsGet**](#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics\&#39; definitions|
|[**interestTargetingOptionsGet**](#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details|
|[**leadFormQuestionsGet**](#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions|
|[**metricsReadyStateGet**](#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state|
|[**targetingOptionsGet**](#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options|

# **adAccountCountriesGet**
> AdAccountCountriesGet200Response adAccountCountriesGet()

Get Ad Accounts countries

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

const { status, data } = await apiInstance.adAccountCountriesGet();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**AdAccountCountriesGet200Response**

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

# **deliveryMetricsGet**
> DeliveryMetricsGet200Response deliveryMetricsGet()

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

let reportType: ReportType; //Report type. (optional) (default to undefined)

const { status, data } = await apiInstance.deliveryMetricsGet(
    reportType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **reportType** | **ReportType** | Report type. | (optional) defaults to undefined|


### Return type

**DeliveryMetricsGet200Response**

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

# **interestTargetingOptionsGet**
> SingleInterestTargetingOption interestTargetingOptionsGet()

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

let interestId: string; //Unique identifier of an interest. (default to undefined)

const { status, data } = await apiInstance.interestTargetingOptionsGet(
    interestId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **interestId** | [**string**] | Unique identifier of an interest. | defaults to undefined|


### Return type

**SingleInterestTargetingOption**

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

# **leadFormQuestionsGet**
> leadFormQuestionsGet()

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

const { status, data } = await apiInstance.leadFormQuestionsGet();
```

### Parameters
This endpoint does not have any parameters.


### Return type

void (empty response body)

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

# **metricsReadyStateGet**
> BookClosed metricsReadyStateGet()

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

let date: string; //Analytics reports request date (UTC). Format: YYYY-MM-DD (default to undefined)

const { status, data } = await apiInstance.metricsReadyStateGet(
    date
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **date** | [**string**] | Analytics reports request date (UTC). Format: YYYY-MM-DD | defaults to undefined|


### Return type

**BookClosed**

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

# **targetingOptionsGet**
> Array<object> targetingOptionsGet()

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

let targetingType: PublicTargetingType; //Public targeting type (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let clientId: string; //Client ID (optional) (default to undefined)
let oauthSignature: string; //Oauth signature (optional) (default to undefined)
let timestamp: string; //Timestamp. (optional) (default to undefined)

const { status, data } = await apiInstance.targetingOptionsGet(
    targetingType,
    adAccountId,
    clientId,
    oauthSignature,
    timestamp
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **targetingType** | **PublicTargetingType** | Public targeting type | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **clientId** | [**string**] | Client ID | (optional) defaults to undefined|
| **oauthSignature** | [**string**] | Oauth signature | (optional) defaults to undefined|
| **timestamp** | [**string**] | Timestamp. | (optional) defaults to undefined|


### Return type

**Array<object>**

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

