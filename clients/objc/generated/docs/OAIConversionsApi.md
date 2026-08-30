# OAIConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsCreate**](OAIConversionsApi.md#advertiserdefinedeventscreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiserDefinedEventsDelete**](OAIConversionsApi.md#advertiserdefinedeventsdelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiserDefinedEventsGet**](OAIConversionsApi.md#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiserDefinedEventsUpdate**](OAIConversionsApi.md#advertiserdefinedeventsupdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiserDefinedEventsCreate**
```objc
-(NSURLSessionTask*) advertiserDefinedEventsCreateWithAdAccountId: (NSString*) adAccountId
    advertiserDefinedEventsCreateRequest: (OAIAdvertiserDefinedEventsCreateRequest*) advertiserDefinedEventsCreateRequest
        completionHandler: (void (^)(OAIAdvertiserDefinedEventsCreate200Response* output, NSError* error)) handler;
```

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdvertiserDefinedEventsCreateRequest* advertiserDefinedEventsCreateRequest = [[OAIAdvertiserDefinedEventsCreateRequest alloc] init]; // 

OAIConversionsApi*apiInstance = [[OAIConversionsApi alloc] init];

// Create advertiser defined events
[apiInstance advertiserDefinedEventsCreateWithAdAccountId:adAccountId
              advertiserDefinedEventsCreateRequest:advertiserDefinedEventsCreateRequest
          completionHandler: ^(OAIAdvertiserDefinedEventsCreate200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionsApi->advertiserDefinedEventsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **advertiserDefinedEventsCreateRequest** | [**OAIAdvertiserDefinedEventsCreateRequest***](OAIAdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**OAIAdvertiserDefinedEventsCreate200Response***](OAIAdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiserDefinedEventsDelete**
```objc
-(NSURLSessionTask*) advertiserDefinedEventsDeleteWithAdAccountId: (NSString*) adAccountId
    eventNames: (NSArray<NSString*>*) eventNames
        completionHandler: (void (^)(OAIAdvertiserDefinedEventsCreate200Response* output, NSError* error)) handler;
```

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* eventNames = @[@"eventNames_example"]; // List of event names to delete

OAIConversionsApi*apiInstance = [[OAIConversionsApi alloc] init];

// Delete advertiser defined events
[apiInstance advertiserDefinedEventsDeleteWithAdAccountId:adAccountId
              eventNames:eventNames
          completionHandler: ^(OAIAdvertiserDefinedEventsCreate200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionsApi->advertiserDefinedEventsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **eventNames** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of event names to delete | 

### Return type

[**OAIAdvertiserDefinedEventsCreate200Response***](OAIAdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiserDefinedEventsGet**
```objc
-(NSURLSessionTask*) advertiserDefinedEventsGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdvertiserDefinedEventsGet200Response* output, NSError* error)) handler;
```

Get advertiser defined events

Get advertiser defined events for the given ad account.

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
          completionHandler: ^(OAIAdvertiserDefinedEventsGet200Response* output, NSError* error) {
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

[**OAIAdvertiserDefinedEventsGet200Response***](OAIAdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiserDefinedEventsUpdate**
```objc
-(NSURLSessionTask*) advertiserDefinedEventsUpdateWithAdAccountId: (NSString*) adAccountId
    advertiserDefinedEventsCreateRequest: (OAIAdvertiserDefinedEventsCreateRequest*) advertiserDefinedEventsCreateRequest
        completionHandler: (void (^)(OAIAdvertiserDefinedEventsCreate200Response* output, NSError* error)) handler;
```

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdvertiserDefinedEventsCreateRequest* advertiserDefinedEventsCreateRequest = [[OAIAdvertiserDefinedEventsCreateRequest alloc] init]; // 

OAIConversionsApi*apiInstance = [[OAIConversionsApi alloc] init];

// Update advertiser defined events
[apiInstance advertiserDefinedEventsUpdateWithAdAccountId:adAccountId
              advertiserDefinedEventsCreateRequest:advertiserDefinedEventsCreateRequest
          completionHandler: ^(OAIAdvertiserDefinedEventsCreate200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionsApi->advertiserDefinedEventsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **advertiserDefinedEventsCreateRequest** | [**OAIAdvertiserDefinedEventsCreateRequest***](OAIAdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**OAIAdvertiserDefinedEventsCreate200Response***](OAIAdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

