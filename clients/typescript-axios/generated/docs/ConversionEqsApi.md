# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**conversionEqsList**](#conversioneqslist) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)|

# **conversionEqsList**
> Array<EventQualityScore> conversionEqsList()

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```typescript
import {
    ConversionEqsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConversionEqsApi(configuration);

let lookbackPeriod: LookbackPeriodOptions; //Lookback window (number of days). (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let sourcePlatform: SourcePlatformOptions; //Source platform of event. (optional) (default to undefined)
let ingestionSource: IngestionSourceOptions; //Ingestion source of event. (optional) (default to undefined)

const { status, data } = await apiInstance.conversionEqsList(
    lookbackPeriod,
    adAccountId,
    sourcePlatform,
    ingestionSource
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **lookbackPeriod** | **LookbackPeriodOptions** | Lookback window (number of days). | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **sourcePlatform** | **SourcePlatformOptions** | Source platform of event. | (optional) defaults to undefined|
| **ingestionSource** | **IngestionSourceOptions** | Ingestion source of event. | (optional) defaults to undefined|


### Return type

**Array<EventQualityScore>**

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

