# OAIOauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OAIOauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token


# **oauthToken**
```objc
-(NSURLSessionTask*) oauthTokenWithGrantType: (NSString*) grantType
        completionHandler: (void (^)(OAIOauthAccessTokenResponse* output, NSError* error)) handler;
```

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example
```objc

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

