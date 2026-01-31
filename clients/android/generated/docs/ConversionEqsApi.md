# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)



## conversionEqsList

> List&lt;EventQualityScore&gt; conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ConversionEqsApi;

ConversionEqsApi apiInstance = new ConversionEqsApi();
LookbackPeriodOptions lookbackPeriod = null; // LookbackPeriodOptions | Lookback window (number of days).
String adAccountId = null; // String | Unique identifier of an ad account.
SourcePlatformOptions sourcePlatform = null; // SourcePlatformOptions | Source platform of event.
IngestionSourceOptions ingestionSource = null; // IngestionSourceOptions | Ingestion source of event.
try {
    List<EventQualityScore> result = apiInstance.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionEqsApi#conversionEqsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | [default to null] [enum: 1d, 14d]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **sourcePlatform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] [default to null] [enum: WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE]
 **ingestionSource** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] [default to null] [enum: TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE]

### Return type

[**List&lt;EventQualityScore&gt;**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

