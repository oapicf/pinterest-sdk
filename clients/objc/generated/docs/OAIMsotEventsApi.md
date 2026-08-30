# OAIMsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](OAIMsotEventsApi.md#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **msotEventsCreate**
```objc
-(NSURLSessionTask*) msotEventsCreateWithAdAccountId: (NSString*) adAccountId
    conversionMSOTEventsCreate: (OAIConversionMSOTEventsCreate*) conversionMSOTEventsCreate
        completionHandler: (void (^)(NSError* error)) handler;
```

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIConversionMSOTEventsCreate* conversionMSOTEventsCreate = [[OAIConversionMSOTEventsCreate alloc] init]; // 

OAIMsotEventsApi*apiInstance = [[OAIMsotEventsApi alloc] init];

// Send Measurement Source Of Truth (MSOT) attributed conversion events
[apiInstance msotEventsCreateWithAdAccountId:adAccountId
              conversionMSOTEventsCreate:conversionMSOTEventsCreate
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIMsotEventsApi->msotEventsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **conversionMSOTEventsCreate** | [**OAIConversionMSOTEventsCreate***](OAIConversionMSOTEventsCreate.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

