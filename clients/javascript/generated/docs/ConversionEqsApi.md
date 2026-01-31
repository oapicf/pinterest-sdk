# PinterestSdk.ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)



## conversionEqsList

> [EventQualityScore] conversionEqsList(lookbackPeriod, adAccountId, opts)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ConversionEqsApi();
let lookbackPeriod = new PinterestSdk.LookbackPeriodOptions(); // LookbackPeriodOptions | Lookback window (number of days).
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'sourcePlatform': new PinterestSdk.SourcePlatformOptions(), // SourcePlatformOptions | Source platform of event.
  'ingestionSource': new PinterestSdk.IngestionSourceOptions() // IngestionSourceOptions | Ingestion source of event.
};
apiInstance.conversionEqsList(lookbackPeriod, adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | 
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **sourcePlatform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] 
 **ingestionSource** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] 

### Return type

[**[EventQualityScore]**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

