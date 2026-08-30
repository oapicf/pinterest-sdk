# conversion_eqs_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**conversion_eqs/list**](conversion_eqs_api.md#conversion_eqs/list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversion_eqs/list**
> Vec<models::EventQualityScore> conversion_eqs/list(ctx, ctx, lookback_period, ad_account_id, optional)
Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **lookback_period** | [****](.md)| Lookback window (number of days). | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookback_period** | [****](.md)| Lookback window (number of days). | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **source_platform** | [****](.md)| Source platform of event. | 
 **ingestion_source** | [****](.md)| Ingestion source of event. | 

### Return type

[**Vec<models::EventQualityScore>**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

