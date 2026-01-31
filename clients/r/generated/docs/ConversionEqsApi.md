# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionEqsList**](ConversionEqsApi.md#ConversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **ConversionEqsList**
> array[EventQualityScore] ConversionEqsList(lookback_period, ad_account_id, source_platform = var.source_platform, ingestion_source = var.ingestion_source)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example
```R
library(openapi)

# Get event quality score (EQS)
#
# prepare function argument(s)
var_lookback_period <- LookbackPeriodOptions$new() # LookbackPeriodOptions | Lookback window (number of days).
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_source_platform <- SourcePlatformOptions$new() # SourcePlatformOptions | Source platform of event. (Optional)
var_ingestion_source <- IngestionSourceOptions$new() # IngestionSourceOptions | Ingestion source of event. (Optional)

api_instance <- ConversionEqsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ConversionEqsList(var_lookback_period, var_ad_account_id, source_platform = var_source_platform, ingestion_source = var_ingestion_sourcedata_file = "result.txt")
result <- api_instance$ConversionEqsList(var_lookback_period, var_ad_account_id, source_platform = var_source_platform, ingestion_source = var_ingestion_source)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookback_period** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **source_platform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] 
 **ingestion_source** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] 

### Return type

[**array[EventQualityScore]**](EventQualityScore.md)

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
| **0** | An unexpected error response. |  -  |

