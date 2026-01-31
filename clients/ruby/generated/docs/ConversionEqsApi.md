# PinterestSdkClient::ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**conversion_eqs_list**](ConversionEqsApi.md#conversion_eqs_list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |


## conversion_eqs_list

> <Array<EventQualityScore>> conversion_eqs_list(lookback_period, ad_account_id, opts)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ConversionEqsApi.new
lookback_period = PinterestSdkClient::LookbackPeriodOptions::N1D # LookbackPeriodOptions | Lookback window (number of days).
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  source_platform: PinterestSdkClient::SourcePlatformOptions::WEB, # SourcePlatformOptions | Source platform of event.
  ingestion_source: PinterestSdkClient::IngestionSourceOptions::TAG # IngestionSourceOptions | Ingestion source of event.
}

begin
  # Get event quality score (EQS)
  result = api_instance.conversion_eqs_list(lookback_period, ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionEqsApi->conversion_eqs_list: #{e}"
end
```

#### Using the conversion_eqs_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<EventQualityScore>>, Integer, Hash)> conversion_eqs_list_with_http_info(lookback_period, ad_account_id, opts)

```ruby
begin
  # Get event quality score (EQS)
  data, status_code, headers = api_instance.conversion_eqs_list_with_http_info(lookback_period, ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<EventQualityScore>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionEqsApi->conversion_eqs_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **lookback_period** | [**LookbackPeriodOptions**](.md) | Lookback window (number of days). |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **source_platform** | [**SourcePlatformOptions**](.md) | Source platform of event. | [optional] |
| **ingestion_source** | [**IngestionSourceOptions**](.md) | Ingestion source of event. | [optional] |

### Return type

[**Array&lt;EventQualityScore&gt;**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

