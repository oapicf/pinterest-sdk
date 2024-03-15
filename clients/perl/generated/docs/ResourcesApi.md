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
> AdAccountsCountryResponse ad_account_countries_get()

Get ad accounts countries

Get Ad Accounts countries

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
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

[**AdAccountsCountryResponse**](AdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delivery_metrics_get**
> DeliveryMetricsResponse delivery_metrics_get(report_type => $report_type)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $report_type = "report_type_example"; # string | Report type.

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
 **report_type** | **string**| Report type. | [optional] 

### Return type

[**DeliveryMetricsResponse**](DeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interest_targeting_options_get**
> SingleInterestTargetingOptionResponse interest_targeting_options_get(interest_id => $interest_id)

Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
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

[**SingleInterestTargetingOptionResponse**](SingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_questions_get**
> lead_form_questions_get()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

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
> BookClosedResponse metrics_ready_state_get(date => $date)

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

my $date = 2022-07-13; # string | Analytics reports request date (UTC). Format: YYYY-MM-DD

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

[**BookClosedResponse**](BookClosedResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_options_get**
> ARRAY[object] targeting_options_get(targeting_type => $targeting_type, client_id => $client_id, oauth_signature => $oauth_signature, timestamp => $timestamp)

Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ResourcesApi;
my $api_instance = WWW::OpenAPIClient::ResourcesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $targeting_type = APPTYPE; # string | Public targeting type.
my $client_id = 1094834; # string | Client ID.
my $oauth_signature = 8209f; # string | Oauth signature
my $timestamp = 1618338184277; # string | Timestamp

eval {
    my $result = $api_instance->targeting_options_get(targeting_type => $targeting_type, client_id => $client_id, oauth_signature => $oauth_signature, timestamp => $timestamp);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ResourcesApi->targeting_options_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targeting_type** | **string**| Public targeting type. | 
 **client_id** | **string**| Client ID. | [optional] 
 **oauth_signature** | **string**| Oauth signature | [optional] 
 **timestamp** | **string**| Timestamp | [optional] 

### Return type

**ARRAY[object]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

