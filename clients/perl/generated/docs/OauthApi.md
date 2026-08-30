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
> ConversionAccessToken oauth_conversion_token()

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

[**ConversionAccessToken**](ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_token**
> OauthAccessToken oauth_token(grant_type => $grant_type, code => $code, continuous_refresh => $continuous_refresh, redirect_uri => $redirect_uri, refresh_token => $refresh_token, scope => $scope)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OauthApi;
my $api_instance = WWW::OpenAPIClient::OauthApi->new(

    # Configure HTTP basic authorization: basic
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $grant_type = new WWW::OpenAPIClient.TokenGrantType(); # TokenGrantType | 
my $code = "code_example"; # string | 
my $continuous_refresh = "continuous_refresh_example"; # string |   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
my $redirect_uri = "redirect_uri_example"; # string | 
my $refresh_token = "refresh_token_example"; # string | 
my $scope = "scope_example"; # string | 

eval {
    my $result = $api_instance->oauth_token(grant_type => $grant_type, code => $code, continuous_refresh => $continuous_refresh, redirect_uri => $redirect_uri, refresh_token => $refresh_token, scope => $scope);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OauthApi->oauth_token: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | [**TokenGrantType**](TokenGrantType.md)|  | 
 **code** | **string**|  | [optional] 
 **continuous_refresh** | **string**|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] 
 **redirect_uri** | **string**|  | [optional] 
 **refresh_token** | **string**|  | [optional] 
 **scope** | **string**|  | [optional] 

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

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
my $token_type_hint = new WWW::OpenAPIClient.TokenTypeHint(); # TokenTypeHint | The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.

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
 **token_type_hint** | [**TokenTypeHint**](TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

