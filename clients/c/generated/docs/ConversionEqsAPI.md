# ConversionEqsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionEqsAPI_conversionEqsList**](ConversionEqsAPI.md#ConversionEqsAPI_conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **ConversionEqsAPI_conversionEqsList**
```c
// Get event quality score (EQS)
//
// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
//
list_t* ConversionEqsAPI_conversionEqsList(apiClient_t *apiClient, lookback_period_options_e lookback_period, char *ad_account_id, source_platform_options_e source_platform, ingestion_source_options_e ingestion_source);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**lookback_period** | **lookback_period_options_e** | Lookback window (number of days). | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**source_platform** | **source_platform_options_e** | Source platform of event. | [optional] 
**ingestion_source** | **ingestion_source_options_e** | Ingestion source of event. | [optional] 

### Return type

[list_t](event_quality_score.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

