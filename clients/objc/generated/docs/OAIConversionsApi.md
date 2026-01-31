# OAIConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsGet**](OAIConversionsApi.md#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events


# **advertiserDefinedEventsGet**
```objc
-(NSURLSessionTask*) advertiserDefinedEventsGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdvertiserDefinedEventsResponse* output, NSError* error)) handler;
```

Get advertiser defined events

<p>Get advertiser defined events for the given ad account.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIConversionsApi*apiInstance = [[OAIConversionsApi alloc] init];

// Get advertiser defined events
[apiInstance advertiserDefinedEventsGetWithAdAccountId:adAccountId
          completionHandler: ^(OAIAdvertiserDefinedEventsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionsApi->advertiserDefinedEventsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIAdvertiserDefinedEventsResponse***](OAIAdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

