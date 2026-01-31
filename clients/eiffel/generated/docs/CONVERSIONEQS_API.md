# CONVERSIONEQS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**conversion_eqs_list**](CONVERSIONEQS_API.md#conversion_eqs_list) | **Get** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversion_eqs_list**
> conversion_eqs_list (lookback_period: LOOKBACK_PERIOD_OPTIONS ; ad_account_id: STRING_32 ; source_platform:  detachable SOURCE_PLATFORM_OPTIONS ; ingestion_source:  detachable INGESTION_SOURCE_OPTIONS ): detachable LIST [EVENT_QUALITY_SCORE]


Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookback_period** | [**LOOKBACK_PERIOD_OPTIONS**](.md)| Lookback window (number of days). | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **source_platform** | [**SOURCE_PLATFORM_OPTIONS**](.md)| Source platform of event. | [optional] [default to null]
 **ingestion_source** | [**INGESTION_SOURCE_OPTIONS**](.md)| Ingestion source of event. | [optional] [default to null]

### Return type

[**LIST [EVENT_QUALITY_SCORE]**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

