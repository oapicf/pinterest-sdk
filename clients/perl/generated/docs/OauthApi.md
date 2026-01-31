# WWW::OpenAPIClient::OauthApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OauthApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth_conversion_token**](OauthApi.md#oauth_conversion_token) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token
[**token_revoke**](OauthApi.md#token_revoke) | **POST** /oauth/token/revoke | Revoke a token


# **oauth_conversion_token**
> ConversionAccessTokenResponse oauth_conversion_token()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OauthApi;
my $api_instance = WWW::OpenAPIClient::OauthApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);


eval {
    my $result = $api_instance->oauth_conversion_token();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OauthApi->oauth_conversion_token: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversionAccessTokenResponse**](ConversionAccessTokenResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_token**
> OauthAccessTokenResponse oauth_token(grant_type => $grant_type)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.

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

# **token_revoke**
> token_revoke(token => $token, token_type_hint => $token_type_hint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OauthApi;
my $api_instance = WWW::OpenAPIClient::OauthApi->new(

    # Configure HTTP basic authorization: basic
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $token = "token_example"; # string | The token to revoke.
my $token_type_hint = "token_type_hint_example"; # string | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.

eval {
    $api_instance->token_revoke(token => $token, token_type_hint => $token_type_hint);
};
if ($@) {
    warn "Exception when calling OauthApi->token_revoke: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| The token to revoke. | 
 **token_type_hint** | **string**| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

