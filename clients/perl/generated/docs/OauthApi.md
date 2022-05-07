# WWW::OpenAPIClient::OauthApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OauthApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token


# **oauth_token**
> OauthAccessTokenResponse oauth_token(grant_type => $grant_type)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OauthApi;
my $api_instance = WWW::OpenAPIClient::OauthApi->new(
);

my $grant_type = "grant_type_example"; # string | 

eval {
    my $result = $api_instance->oauth_token(grant_type => $grant_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OauthApi->oauth_token: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | **string**|  | 

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

