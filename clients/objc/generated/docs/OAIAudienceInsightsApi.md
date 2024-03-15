# OAIAudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](OAIAudienceInsightsApi.md#audienceinsightsget) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](OAIAudienceInsightsApi.md#audienceinsightsscopeandtypeget) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **audienceInsightsGet**
```objc
-(NSURLSessionTask*) audienceInsightsGetWithAdAccountId: (NSString*) adAccountId
    audienceInsightType: (OAIAudienceInsightType) audienceInsightType
        completionHandler: (void (^)(OAIAudienceInsightsResponse* output, NSError* error)) handler;
```

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAudienceInsightType audienceInsightType = [[OAIAudienceInsightType alloc] init]; // Type of audience insights.

OAIAudienceInsightsApi*apiInstance = [[OAIAudienceInsightsApi alloc] init];

// Get audience insights
[apiInstance audienceInsightsGetWithAdAccountId:adAccountId
              audienceInsightType:audienceInsightType
          completionHandler: ^(OAIAudienceInsightsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceInsightsApi->audienceInsightsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **audienceInsightType** | [**OAIAudienceInsightType**](.md)| Type of audience insights. | 

### Return type

[**OAIAudienceInsightsResponse***](OAIAudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audienceInsightsScopeAndTypeGet**
```objc
-(NSURLSessionTask*) audienceInsightsScopeAndTypeGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAudienceDefinitionResponse* output, NSError* error)) handler;
```

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIAudienceInsightsApi*apiInstance = [[OAIAudienceInsightsApi alloc] init];

// Get audience insights scope and type
[apiInstance audienceInsightsScopeAndTypeGetWithAdAccountId:adAccountId
          completionHandler: ^(OAIAudienceDefinitionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceInsightsApi->audienceInsightsScopeAndTypeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIAudienceDefinitionResponse***](OAIAudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

