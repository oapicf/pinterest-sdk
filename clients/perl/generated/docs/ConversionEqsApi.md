# WWW::OpenAPIClient::ConversionEqsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConversionEqsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_eqs_list**](ConversionEqsApi.md#conversion_eqs_list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversion_eqs_list**
> ARRAY[EventQualityScore] conversion_eqs_list(lookback_period => $lookback_period, ad_account_id => $ad_account_id, source_platform => $source_platform, ingestion_source => $ingestion_source)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionEqsApi;
my $api_instance = WWW::OpenAPIClient::ConversionEqsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $lookback_period = new WWW::OpenAPIClient.LookbackPeriodOptions(); # LookbackPeriodOptions | Lookback window (number of days).
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $source_platform = new WWW::OpenAPIClient.SourcePlatformOptions(); # SourcePlatformOptions | Source platform of event.
my $ingestion_source = new WWW::OpenAPIClient.IngestionSourceOptions(); # IngestionSourceOptions | Ingestion source of event.

eval {
    my $result = $api_instance->conversion_eqs_list(lookback_period => $lookback_period, ad_account_id => $ad_account_id, source_platform => $source_platform, ingestion_source => $ingestion_source);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionEqsApi->conversion_eqs_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookback_period** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **source_platform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] 
 **ingestion_source** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] 

### Return type

[**ARRAY[EventQualityScore]**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

