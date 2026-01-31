# \ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_eqs_slash_list**](ConversionEqsApi.md#conversion_eqs_slash_list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)



## conversion_eqs_slash_list

> Vec<models::EventQualityScore> conversion_eqs_slash_list(lookback_period, ad_account_id, source_platform, ingestion_source)
Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**lookback_period** | [**LookbackPeriodOptions**](.md) | Lookback window (number of days). | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**source_platform** | Option<[**SourcePlatformOptions**](.md)> | Source platform of event. |  |
**ingestion_source** | Option<[**IngestionSourceOptions**](.md)> | Ingestion source of event. |  |

### Return type

[**Vec<models::EventQualityScore>**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

