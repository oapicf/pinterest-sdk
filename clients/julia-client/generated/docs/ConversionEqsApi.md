# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_eqs_list**](ConversionEqsApi.md#conversion_eqs_list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversion_eqs_list**
> `conversion_eqs_list`(_api::`ConversionEqsApi`, `lookback_period`::`LookbackPeriodOptions`, `ad_account_id`::`String`; `source_platform`=nothing, `ingestion_source`=nothing, _mediaType=nothing) -> `Vector{EventQualityScore}`, `OpenAPI.Clients.ApiResponse` <br/>
> `conversion_eqs_list`(_api::`ConversionEqsApi`, response_stream::`Channel`, `lookback_period`::`LookbackPeriodOptions`, `ad_account_id`::`String`; `source_platform`=nothing, `ingestion_source`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{EventQualityScore}` }, `OpenAPI.Clients.ApiResponse`

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConversionEqsApi`** | API context | 
**`lookback_period`** | [**`LookbackPeriodOptions`**](.md) | Lookback window (number of days). |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`source_platform`** | [**`SourcePlatformOptions`**](.md) | Source platform of event. | [default to nothing]
 **`ingestion_source`** | [**`IngestionSourceOptions`**](.md) | Ingestion source of event. | [default to nothing]

### Return type

[**`Vector{EventQualityScore}`**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

