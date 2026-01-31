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
        (void (^)(OAIConversionAccessTokenResponse* output, NSError* error)) handler;
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
          ^(OAIConversionAccessTokenResponse* output, NSError* error) {
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

[**OAIConversionAccessTokenResponse***](OAIConversionAccessTokenResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauthToken**
```objc
-(NSURLSessionTask*) oauthTokenWithGrantType: (NSString*) grantType
        completionHandler: (void (^)(OAIOauthAccessTokenResponse* output, NSError* error)) handler;
```

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basic)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* grantType = @"grantType_example"; // 

OAIOauthApi*apiInstance = [[OAIOauthApi alloc] init];

// Generate OAuth access token
[apiInstance oauthTokenWithGrantType:grantType
          completionHandler: ^(OAIOauthAccessTokenResponse* output, NSError* error) {
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
 **grantType** | **NSString***|  | 

### Return type

[**OAIOauthAccessTokenResponse***](OAIOauthAccessTokenResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tokenRevoke**
```objc
-(NSURLSessionTask*) tokenRevokeWithToken: (NSString*) token
    tokenTypeHint: (NSString*) tokenTypeHint
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
NSString* tokenTypeHint = @"tokenTypeHint_example"; // The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)

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
 **tokenTypeHint** | **NSString***| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional] 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

