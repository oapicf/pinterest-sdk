# ConversionEqsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)



## conversionEqsList

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.

[Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```bash
 conversionEqsList  lookback_period=value ad_account_id=value  source_platform=value  ingestion_source=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**LookbackPeriodOptions**](.md) | Lookback window (number of days). | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **sourcePlatform** | [**SourcePlatformOptions**](.md) | Source platform of event. | [optional] [default to null]
 **ingestionSource** | [**IngestionSourceOptions**](.md) | Ingestion source of event. | [optional] [default to null]

### Return type

[**array[EventQualityScore]**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

