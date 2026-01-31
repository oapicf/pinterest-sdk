# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionEqsList**](ConversionEqsApi.md#conversioneqslist) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |



## conversionEqsList

> Array&lt;EventQualityScore&gt; conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```ts
import {
  Configuration,
  ConversionEqsApi,
} from '';
import type { ConversionEqsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new ConversionEqsApi(config);

  const body = {
    // LookbackPeriodOptions | Lookback window (number of days).
    lookbackPeriod: ...,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // SourcePlatformOptions | Source platform of event. (optional)
    sourcePlatform: ...,
    // IngestionSourceOptions | Ingestion source of event. (optional)
    ingestionSource: ...,
  } satisfies ConversionEqsListRequest;

  try {
    const data = await api.conversionEqsList(body);
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
| **lookbackPeriod** | `LookbackPeriodOptions` | Lookback window (number of days). | [Defaults to `undefined`] [Enum: 1d, 14d] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **sourcePlatform** | `SourcePlatformOptions` | Source platform of event. | [Optional] [Defaults to `undefined`] [Enum: WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE] |
| **ingestionSource** | `IngestionSourceOptions` | Ingestion source of event. | [Optional] [Defaults to `undefined`] [Enum: TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE] |

### Return type

[**Array&lt;EventQualityScore&gt;**](EventQualityScore.md)

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

