# WWW::OpenAPIClient::ResourcesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ResourcesApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_countries_get**](ResourcesApi.md#ad_account_countries_get) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**delivery_metrics_get**](ResourcesApi.md#delivery_metrics_get) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interest_targeting_options_get**](ResourcesApi.md#interest_targeting_options_get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**lead_form_questions_get**](ResourcesApi.md#lead_form_questions_get) | **GET** /resources/lead_form_questions | Get lead form questions
[**metrics_ready_state_get**](ResourcesApi.md#metrics_ready_state_get) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targeting_options_get**](ResourcesApi.md#targeting_options_get) | **GET** /resources/targeting/{targeting_type} | Get targeting options


# **ad_account_countries_get**
> AdAccountCountriesGet200Response ad_account_countries_get()

Get ad accounts countries

Get Ad Accounts countries

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);


eval {
    my $result = $api_instance->ad_account_countries_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ResourcesApi->ad_account_countries_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delivery_metrics_get**
> DeliveryMetricsGet200Response delivery_metrics_get(report_type => $report_type)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $report_type = new WWW::OpenAPIClient.ReportType(); # ReportType | Report type.

eval {
    my $result = $api_instance->delivery_metrics_get(report_type => $report_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ResourcesApi->delivery_metrics_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | [**ReportType**](.md)| Report type. | [optional] 

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interest_targeting_options_get**
> SingleInterestTargetingOption interest_targeting_options_get(interest_id => $interest_id)

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $interest_id = "interest_id_example"; # string | Unique identifier of an interest.

eval {
    my $result = $api_instance->interest_targeting_options_get(interest_id => $interest_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ResourcesApi->interest_targeting_options_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interest_id** | **string**| Unique identifier of an interest. | 

### Return type

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_questions_get**
> lead_form_questions_get()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);


eval {
    $api_instance->lead_form_questions_get();
};
if ($@) {
    warn "Exception when calling ResourcesApi->lead_form_questions_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_ready_state_get**
> BookClosed metrics_ready_state_get(date => $date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $date = "date_example"; # string | Analytics reports request date (UTC). Format: YYYY-MM-DD

eval {
    my $result = $api_instance->metrics_ready_state_get(date => $date);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ResourcesApi->metrics_ready_state_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **string**| Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**BookClosed**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_options_get**
> ARRAY[object] targeting_options_get(targeting_type => $targeting_type, ad_account_id => $ad_account_id, client_id => $client_id, oauth_signature => $oauth_signature, timestamp => $timestamp)

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $targeting_type = new WWW::OpenAPIClient.PublicTargetingType(); # PublicTargetingType | Public targeting type
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $client_id = "client_id_example"; # string | Client ID
my $oauth_signature = "oauth_signature_example"; # string | Oauth signature
my $timestamp = "timestamp_example"; # string | Timestamp.

eval {
    my $result = $api_instance->targeting_options_get(targeting_type => $targeting_type, ad_account_id => $ad_account_id, client_id => $client_id, oauth_signature => $oauth_signature, timestamp => $timestamp);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ResourcesApi->targeting_options_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targeting_type** | [**PublicTargetingType**](.md)| Public targeting type | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **client_id** | **string**| Client ID | [optional] 
 **oauth_signature** | **string**| Oauth signature | [optional] 
 **timestamp** | **string**| Timestamp. | [optional] 

### Return type

**ARRAY[object]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

