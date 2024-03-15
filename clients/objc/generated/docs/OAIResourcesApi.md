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
        (void (^)(OAIAdAccountsCountryResponse* output, NSError* error)) handler;
```

Get ad accounts countries

Get Ad Accounts countries

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get ad accounts countries
[apiInstance adAccountCountriesGetWithCompletionHandler: 
          ^(OAIAdAccountsCountryResponse* output, NSError* error) {
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

[**OAIAdAccountsCountryResponse***](OAIAdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deliveryMetricsGet**
```objc
-(NSURLSessionTask*) deliveryMetricsGetWithReportType: (NSString*) reportType
        completionHandler: (void (^)(OAIDeliveryMetricsResponse* output, NSError* error)) handler;
```

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* reportType = @"reportType_example"; // Report type. (optional)

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get available metrics' definitions
[apiInstance deliveryMetricsGetWithReportType:reportType
          completionHandler: ^(OAIDeliveryMetricsResponse* output, NSError* error) {
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
 **reportType** | **NSString***| Report type. | [optional] 

### Return type

[**OAIDeliveryMetricsResponse***](OAIDeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interestTargetingOptionsGet**
```objc
-(NSURLSessionTask*) interestTargetingOptionsGetWithInterestId: (NSString*) interestId
        completionHandler: (void (^)(OAISingleInterestTargetingOptionResponse* output, NSError* error)) handler;
```

Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* interestId = @"interestId_example"; // Unique identifier of an interest.

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get interest details
[apiInstance interestTargetingOptionsGetWithInterestId:interestId
          completionHandler: ^(OAISingleInterestTargetingOptionResponse* output, NSError* error) {
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

[**OAISingleInterestTargetingOptionResponse***](OAISingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

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
        completionHandler: (void (^)(OAIBookClosedResponse* output, NSError* error)) handler;
```

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* date = 2022-07-13; // Analytics reports request date (UTC). Format: YYYY-MM-DD

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get metrics ready state
[apiInstance metricsReadyStateGetWithDate:date
          completionHandler: ^(OAIBookClosedResponse* output, NSError* error) {
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

[**OAIBookClosedResponse***](OAIBookClosedResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingOptionsGet**
```objc
-(NSURLSessionTask*) targetingOptionsGetWithTargetingType: (NSString*) targetingType
    clientId: (NSString*) clientId
    oauthSignature: (NSString*) oauthSignature
    timestamp: (NSString*) timestamp
        completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;
```

Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* targetingType = APPTYPE; // Public targeting type.
NSString* clientId = 1094834; // Client ID. (optional)
NSString* oauthSignature = 8209f; // Oauth signature (optional)
NSString* timestamp = 1618338184277; // Timestamp (optional)

OAIResourcesApi*apiInstance = [[OAIResourcesApi alloc] init];

// Get targeting options
[apiInstance targetingOptionsGetWithTargetingType:targetingType
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
 **targetingType** | **NSString***| Public targeting type. | 
 **clientId** | **NSString***| Client ID. | [optional] 
 **oauthSignature** | **NSString***| Oauth signature | [optional] 
 **timestamp** | **NSString***| Timestamp | [optional] 

### Return type

**NSArray<NSObject*>***

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

