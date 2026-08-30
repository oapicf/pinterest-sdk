# OAIResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountCountriesGet**](OAIResourcesApi.md#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**deliveryMetricsGet**](OAIResourcesApi.md#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interestTargetingOptionsGet**](OAIResourcesApi.md#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**leadFormQuestionsGet**](OAIResourcesApi.md#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions
[**metricsReadyStateGet**](OAIResourcesApi.md#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targetingOptionsGet**](OAIResourcesApi.md#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options


# **adAccountCountriesGet**
```objc
-(NSURLSessionTask*) adAccountCountriesGetWithCompletionHandler: 
        (void (^)(OAIAdAccountCountriesGet200Response* output, NSError* error)) handler;
```

Get ad accounts countries

Get Ad Accounts countries

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get ad accounts countries
[apiInstance adAccountCountriesGetWithCompletionHandler: 
          ^(OAIAdAccountCountriesGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIResourcesApi->adAccountCountriesGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIAdAccountCountriesGet200Response***](OAIAdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deliveryMetricsGet**
```objc
-(NSURLSessionTask*) deliveryMetricsGetWithReportType: (OAIReportType) reportType
        completionHandler: (void (^)(OAIDeliveryMetricsGet200Response* output, NSError* error)) handler;
```

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIReportType reportType = [[OAIReportType alloc] init]; // Report type. (optional)

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get available metrics' definitions
[apiInstance deliveryMetricsGetWithReportType:reportType
          completionHandler: ^(OAIDeliveryMetricsGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIResourcesApi->deliveryMetricsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | [**OAIReportType**](.md)| Report type. | [optional] 

### Return type

[**OAIDeliveryMetricsGet200Response***](OAIDeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interestTargetingOptionsGet**
```objc
-(NSURLSessionTask*) interestTargetingOptionsGetWithInterestId: (NSString*) interestId
        completionHandler: (void (^)(OAISingleInterestTargetingOption* output, NSError* error)) handler;
```

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* interestId = @"interestId_example"; // Unique identifier of an interest.

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get interest details
[apiInstance interestTargetingOptionsGetWithInterestId:interestId
          completionHandler: ^(OAISingleInterestTargetingOption* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIResourcesApi->interestTargetingOptionsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interestId** | **NSString***| Unique identifier of an interest. | 

### Return type

[**OAISingleInterestTargetingOption***](OAISingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormQuestionsGet**
```objc
-(NSURLSessionTask*) leadFormQuestionsGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get lead form questions
[apiInstance leadFormQuestionsGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIResourcesApi->leadFormQuestionsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metricsReadyStateGet**
```objc
-(NSURLSessionTask*) metricsReadyStateGetWithDate: (NSString*) date
        completionHandler: (void (^)(OAIBookClosed* output, NSError* error)) handler;
```

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* date = @"date_example"; // Analytics reports request date (UTC). Format: YYYY-MM-DD

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get metrics ready state
[apiInstance metricsReadyStateGetWithDate:date
          completionHandler: ^(OAIBookClosed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIResourcesApi->metricsReadyStateGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **NSString***| Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**OAIBookClosed***](OAIBookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingOptionsGet**
```objc
-(NSURLSessionTask*) targetingOptionsGetWithTargetingType: (OAIPublicTargetingType) targetingType
    adAccountId: (NSString*) adAccountId
    clientId: (NSString*) clientId
    oauthSignature: (NSString*) oauthSignature
    timestamp: (NSString*) timestamp
        completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;
```

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIPublicTargetingType targetingType = [[OAIPublicTargetingType alloc] init]; // Public targeting type
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* clientId = @"clientId_example"; // Client ID (optional)
NSString* oauthSignature = @"oauthSignature_example"; // Oauth signature (optional)
NSString* timestamp = @"timestamp_example"; // Timestamp. (optional)

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get targeting options
[apiInstance targetingOptionsGetWithTargetingType:targetingType
              adAccountId:adAccountId
              clientId:clientId
              oauthSignature:oauthSignature
              timestamp:timestamp
          completionHandler: ^(NSArray<NSObject*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIResourcesApi->targetingOptionsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetingType** | [**OAIPublicTargetingType**](.md)| Public targeting type | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **clientId** | **NSString***| Client ID | [optional] 
 **oauthSignature** | **NSString***| Oauth signature | [optional] 
 **timestamp** | **NSString***| Timestamp. | [optional] 

### Return type

**NSArray<NSObject*>***

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

