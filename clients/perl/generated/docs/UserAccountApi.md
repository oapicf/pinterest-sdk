# WWW::OpenAPIClient::UserAccountApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::UserAccountApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account


# **user_account_analytics**
> HASH[string,AnalyticsMetricsResponse] user_account_analytics(start_date => $start_date, end_date => $end_date, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, metric_types => $metric_types, split_field => $split_field, ad_account_id => $ad_account_id)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $from_claimed_content = 'BOTH'; # string | Filter on Pins that match your claimed domain.
my $pin_format = 'ALL'; # string | Pin formats to get data for, default is all.
my $app_types = 'ALL'; # string | Apps or devices to get data for, default is all.
my $metric_types = [("null")]; # ARRAY[string] | Metric types to get data for, default is all. 
my $split_field = 'NO_SPLIT'; # string | How to split the data into groups. Not including this param means data won't be split.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->user_account_analytics(start_date => $start_date, end_date => $end_date, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, metric_types => $metric_types, split_field => $split_field, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**ARRAY[string]**](string.md)| Metric types to get data for, default is all.  | [optional] 
 **split_field** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**HASH[string,AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> Account user_account_get(ad_account_id => $ad_account_id)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->user_account_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

