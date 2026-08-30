# OAIOauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthConversionToken**](OAIOauthApi.md#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauthToken**](OAIOauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
[**tokenRevoke**](OAIOauthApi.md#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token


# **oauthConversionToken**
```objc
-(NSURLSessionTask*) oauthConversionTokenWithCompletionHandler: 
        (void (^)(OAIConversionAccessToken* output, NSError* error)) handler;
```

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIOauthApi*apiInstance = [[OAIOauthApi alloc] init];

// Generate OAuth access token for conversion API
[apiInstance oauthConversionTokenWithCompletionHandler: 
          ^(OAIConversionAccessToken* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOauthApi->oauthConversionToken: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIConversionAccessToken***](OAIConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauthToken**
```objc
-(NSURLSessionTask*) oauthTokenWithGrantType: (OAITokenGrantType*) grantType
    code: (NSString*) code
    continuousRefresh: (NSString*) continuousRefresh
    redirectUri: (NSString*) redirectUri
    refreshToken: (NSString*) refreshToken
    scope: (NSString*) scope
        completionHandler: (void (^)(OAIOauthAccessToken* output, NSError* error)) handler;
```

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basic)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


OAITokenGrantType* grantType = [[OAITokenGrantType alloc] init]; // 
NSString* code = @"code_example"; //  (optional)
NSString* continuousRefresh = @"continuousRefresh_example"; //   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
NSString* redirectUri = @"redirectUri_example"; //  (optional)
NSString* refreshToken = @"refreshToken_example"; //  (optional)
NSString* scope = @"scope_example"; //  (optional)

OAIOauthApi*apiInstance = [[OAIOauthApi alloc] init];

// Generate OAuth access token
[apiInstance oauthTokenWithGrantType:grantType
              code:code
              continuousRefresh:continuousRefresh
              redirectUri:redirectUri
              refreshToken:refreshToken
              scope:scope
          completionHandler: ^(OAIOauthAccessToken* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOauthApi->oauthToken: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**OAITokenGrantType***](OAITokenGrantType.md)|  | 
 **code** | **NSString***|  | [optional] 
 **continuousRefresh** | **NSString***|   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional] 
 **redirectUri** | **NSString***|  | [optional] 
 **refreshToken** | **NSString***|  | [optional] 
 **scope** | **NSString***|  | [optional] 

### Return type

[**OAIOauthAccessToken***](OAIOauthAccessToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tokenRevoke**
```objc
-(NSURLSessionTask*) tokenRevokeWithToken: (NSString*) token
    tokenTypeHint: (OAITokenTypeHint*) tokenTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basic)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* token = @"token_example"; // The token to revoke.
OAITokenTypeHint* tokenTypeHint = [[OAITokenTypeHint alloc] init]; // The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)

OAIOauthApi*apiInstance = [[OAIOauthApi alloc] init];

// Revoke a token
[apiInstance tokenRevokeWithToken:token
              tokenTypeHint:tokenTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIOauthApi->tokenRevoke: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***| The token to revoke. | 
 **tokenTypeHint** | [**OAITokenTypeHint***](OAITokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

