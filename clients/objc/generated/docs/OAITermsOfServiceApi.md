# OAITermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](OAITermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **termsOfServiceGet**
```objc
-(NSURLSessionTask*) termsOfServiceGetWithAdAccountId: (NSString*) adAccountId
    includeHtml: (NSNumber*) includeHtml
    tosType: (NSString*) tosType
        completionHandler: (void (^)(OAITermsOfService* output, NSError* error)) handler;
```

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* includeHtml = @(NO); // Return HTML in TOS text. (optional) (default to @(NO))
NSString* tosType = @"tosType_example"; // Request type. (optional)

OAITermsOfServiceApi*apiInstance = [[OAITermsOfServiceApi alloc] init];

// Get terms of service
[apiInstance termsOfServiceGetWithAdAccountId:adAccountId
              includeHtml:includeHtml
              tosType:tosType
          completionHandler: ^(OAITermsOfService* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITermsOfServiceApi->termsOfServiceGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **includeHtml** | **NSNumber***| Return HTML in TOS text. | [optional] [default to @(NO)]
 **tosType** | **NSString***| Request type. | [optional] 

### Return type

[**OAITermsOfService***](OAITermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

