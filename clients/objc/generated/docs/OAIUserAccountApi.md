# OAIUserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](OAIUserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](OAIUserAccountApi.md#useraccountget) | **GET** /user_account | Get user account


# **userAccountAnalytics**
```objc
-(NSURLSessionTask*) userAccountAnalyticsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    metricTypes: (NSArray<NSString*>*) metricTypes
    splitField: (NSString*) splitField
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSDictionary<OAIAnalyticsMetricsResponse>* output, NSError* error)) handler;
```

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSString* fromClaimedContent = @"BOTH"; // Filter on Pins that match your claimed domain. (optional) (default to @"BOTH")
NSString* pinFormat = @"ALL"; // Pin formats to get data for, default is all. (optional) (default to @"ALL")
NSString* appTypes = @"ALL"; // Apps or devices to get data for, default is all. (optional) (default to @"ALL")
NSArray<NSString*>* metricTypes = @[@"metricTypes_example"]; // Metric types to get data for, default is all.  (optional)
NSString* splitField = @"NO_SPLIT"; // How to split the data into groups. Not including this param means data won't be split. (optional) (default to @"NO_SPLIT")
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Get user account analytics
[apiInstance userAccountAnalyticsWithStartDate:startDate
              endDate:endDate
              fromClaimedContent:fromClaimedContent
              pinFormat:pinFormat
              appTypes:appTypes
              metricTypes:metricTypes
              splitField:splitField
              adAccountId:adAccountId
          completionHandler: ^(NSDictionary<OAIAnalyticsMetricsResponse>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userAccountAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **fromClaimedContent** | **NSString***| Filter on Pins that match your claimed domain. | [optional] [default to @&quot;BOTH&quot;]
 **pinFormat** | **NSString***| Pin formats to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **metricTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Metric types to get data for, default is all.  | [optional] 
 **splitField** | **NSString***| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to @&quot;NO_SPLIT&quot;]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSDictionary<OAIAnalyticsMetricsResponse>***](OAIAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountGet**
```objc
-(NSURLSessionTask*) userAccountGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAccount* output, NSError* error)) handler;
```

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Get user account
[apiInstance userAccountGetWithAdAccountId:adAccountId
          completionHandler: ^(OAIAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userAccountGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIAccount***](OAIAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

