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
> AdAccountsCountryResponse adAccountCountriesGet()

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

**AdAccountsCountryResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deliveryMetricsGet**
> DeliveryMetricsResponse deliveryMetricsGet()

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/api-features/analytics-overview/\'>Organic Analytics</a> and <a href=\'/docs/api-features/ads-reporting/\'>Ads Analytics</a> for more information.

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

let reportType: 'SYNC' | 'ASYNC'; //Report type. (optional) (default to undefined)

const { status, data } = await apiInstance.deliveryMetricsGet(
    reportType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **reportType** | [**&#39;SYNC&#39; | &#39;ASYNC&#39;**]**Array<&#39;SYNC&#39; &#124; &#39;ASYNC&#39;>** | Report type. | (optional) defaults to undefined|


### Return type

**DeliveryMetricsResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interestTargetingOptionsGet**
> SingleInterestTargetingOptionResponse interestTargetingOptionsGet()

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>

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

**SingleInterestTargetingOptionResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormQuestionsGet**
> leadFormQuestionsGet()

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>

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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metricsReadyStateGet**
> BookClosedResponse metricsReadyStateGet()

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

**BookClosedResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingOptionsGet**
> Array<object> targetingOptionsGet()

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

### Example

```typescript
import {
    ResourcesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ResourcesApi(configuration);

let targetingType: 'APPTYPE' | 'GENDER' | 'LOCALE' | 'AGE_BUCKET' | 'LOCATION' | 'GEO' | 'INTEREST' | 'KEYWORD' | 'AUDIENCE_INCLUDE' | 'AUDIENCE_EXCLUDE'; //Public targeting type. (default to undefined)
let clientId: string; //Client ID. (optional) (default to undefined)
let oauthSignature: string; //Oauth signature (optional) (default to undefined)
let timestamp: string; //Timestamp (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.targetingOptionsGet(
    targetingType,
    clientId,
    oauthSignature,
    timestamp,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **targetingType** | [**&#39;APPTYPE&#39; | &#39;GENDER&#39; | &#39;LOCALE&#39; | &#39;AGE_BUCKET&#39; | &#39;LOCATION&#39; | &#39;GEO&#39; | &#39;INTEREST&#39; | &#39;KEYWORD&#39; | &#39;AUDIENCE_INCLUDE&#39; | &#39;AUDIENCE_EXCLUDE&#39;**]**Array<&#39;APPTYPE&#39; &#124; &#39;GENDER&#39; &#124; &#39;LOCALE&#39; &#124; &#39;AGE_BUCKET&#39; &#124; &#39;LOCATION&#39; &#124; &#39;GEO&#39; &#124; &#39;INTEREST&#39; &#124; &#39;KEYWORD&#39; &#124; &#39;AUDIENCE_INCLUDE&#39; &#124; &#39;AUDIENCE_EXCLUDE&#39;>** | Public targeting type. | defaults to undefined|
| **clientId** | [**string**] | Client ID. | (optional) defaults to undefined|
| **oauthSignature** | [**string**] | Oauth signature | (optional) defaults to undefined|
| **timestamp** | [**string**] | Timestamp | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

