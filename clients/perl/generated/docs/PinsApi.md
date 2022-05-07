# WWW::OpenAPIClient::PinsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PinsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pins_analytics**](PinsApi.md#pins_analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pins_create**](PinsApi.md#pins_create) | **POST** /pins | Create Pin
[**pins_delete**](PinsApi.md#pins_delete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pins_get**](PinsApi.md#pins_get) | **GET** /pins/{pin_id} | Get Pin


# **pins_analytics**
> HASH[string,AnalyticsMetricsResponse] pins_analytics(pin_id => $pin_id, start_date => $start_date, end_date => $end_date, metric_types => $metric_types, app_types => $app_types, split_field => $split_field, ad_account_id => $ad_account_id)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PinsApi;
my $api_instance = WWW::OpenAPIClient::PinsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $pin_id = "pin_id_example"; # string | Unique identifier of a Pin.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $metric_types = [("null")]; # ARRAY[string] | Pin metric types to get data for, default is all.
my $app_types = 'ALL'; # string | Apps or devices to get data for, default is all.
my $split_field = 'NO_SPLIT'; # string | How to split the data into groups. Not including this param means data won't be split.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->pins_analytics(pin_id => $pin_id, start_date => $start_date, end_date => $end_date, metric_types => $metric_types, app_types => $app_types, split_field => $split_field, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinsApi->pins_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **string**| Unique identifier of a Pin. | 
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metric_types** | [**ARRAY[string]**](string.md)| Pin metric types to get data for, default is all. | 
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
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

# **pins_create**
> Pin pins_create(pin => $pin)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PinsApi;
my $api_instance = WWW::OpenAPIClient::PinsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $pin = WWW::OpenAPIClient::Object::Pin->new(); # Pin | Create a new Pin.

eval {
    my $result = $api_instance->pins_create(pin => $pin);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinsApi->pins_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Pin**](Pin.md)| Create a new Pin. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pins_delete**
> pins_delete(pin_id => $pin_id)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PinsApi;
my $api_instance = WWW::OpenAPIClient::PinsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $pin_id = "pin_id_example"; # string | Unique identifier of a Pin.

eval {
    $api_instance->pins_delete(pin_id => $pin_id);
};
if ($@) {
    warn "Exception when calling PinsApi->pins_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **string**| Unique identifier of a Pin. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pins_get**
> Pin pins_get(pin_id => $pin_id, ad_account_id => $ad_account_id)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PinsApi;
my $api_instance = WWW::OpenAPIClient::PinsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $pin_id = "pin_id_example"; # string | Unique identifier of a Pin.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->pins_get(pin_id => $pin_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinsApi->pins_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **string**| Unique identifier of a Pin. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

