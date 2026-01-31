# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionEqs/list**](ConversionEqsApi.md#conversionEqs/list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |


<a name="conversionEqs/list"></a>
# **conversionEqs/list**
> List conversionEqs/list(lookback\_period, ad\_account\_id, source\_platform, ingestion\_source)

Get event quality score (EQS)

    Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lookback\_period** | [**LookbackPeriodOptions**](../Models/.md)| Lookback window (number of days). | [default to null] [enum: 1d, 14d] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **source\_platform** | [**SourcePlatformOptions**](../Models/.md)| Source platform of event. | [optional] [default to null] [enum: WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE] |
| **ingestion\_source** | [**IngestionSourceOptions**](../Models/.md)| Ingestion source of event. | [optional] [default to null] [enum: TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE] |

### Return type

[**List**](../Models/EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

