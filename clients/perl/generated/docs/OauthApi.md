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

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OauthApi;
my $api_instance = WWW::OpenAPIClient::OauthApi->new(

    # Configure HTTP basic authorization: basic
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
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

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

