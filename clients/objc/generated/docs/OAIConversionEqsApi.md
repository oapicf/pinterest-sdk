# OAIConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](OAIConversionEqsApi.md#conversioneqslist) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversionEqsList**
```objc
-(NSURLSessionTask*) conversionEqsListWithLookbackPeriod: (OAILookbackPeriodOptions) lookbackPeriod
    adAccountId: (NSString*) adAccountId
    sourcePlatform: (OAISourcePlatformOptions) sourcePlatform
    ingestionSource: (OAIIngestionSourceOptions) ingestionSource
        completionHandler: (void (^)(NSArray<OAIEventQualityScore>* output, NSError* error)) handler;
```

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAILookbackPeriodOptions lookbackPeriod = [[OAILookbackPeriodOptions alloc] init]; // Lookback window (number of days).
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAISourcePlatformOptions sourcePlatform = [[OAISourcePlatformOptions alloc] init]; // Source platform of event. (optional)
OAIIngestionSourceOptions ingestionSource = [[OAIIngestionSourceOptions alloc] init]; // Ingestion source of event. (optional)

OAIConversionEqsApi*apiInstance = [[OAIConversionEqsApi alloc] init];

// Get event quality score (EQS)
[apiInstance conversionEqsListWithLookbackPeriod:lookbackPeriod
              adAccountId:adAccountId
              sourcePlatform:sourcePlatform
              ingestionSource:ingestionSource
          completionHandler: ^(NSArray<OAIEventQualityScore>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionEqsApi->conversionEqsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**OAILookbackPeriodOptions**](.md)| Lookback window (number of days). | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **sourcePlatform** | [**OAISourcePlatformOptions**](.md)| Source platform of event. | [optional] 
 **ingestionSource** | [**OAIIngestionSourceOptions**](.md)| Ingestion source of event. | [optional] 

### Return type

[**NSArray<OAIEventQualityScore>***](OAIEventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

