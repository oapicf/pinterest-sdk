# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |



## conversionEqsList

> List&lt;EventQualityScore&gt; conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lookbackPeriod** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | [enum: 1d, 14d] |
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **sourcePlatform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] [enum: WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE] |
| **ingestionSource** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] [enum: TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE] |

### Return type

[**List&lt;EventQualityScore&gt;**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |

