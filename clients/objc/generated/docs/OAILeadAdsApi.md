# OAILeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](OAILeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](OAILeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**adAccountsSubscriptionsGetList**](OAILeadAdsApi.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](OAILeadAdsApi.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **adAccountsSubscriptionsDelById**
```objc
-(NSURLSessionTask*) adAccountsSubscriptionsDelByIdWithAdAccountId: (NSString*) adAccountId
    subscriptionId: (NSString*) subscriptionId
        completionHandler: (void (^)(OAILeadSubscription* output, NSError* error)) handler;
```

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* subscriptionId = @"subscriptionId_example"; // Unique identifier of a subscription.

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Delete lead ads subscription
[apiInstance adAccountsSubscriptionsDelByIdWithAdAccountId:adAccountId
              subscriptionId:subscriptionId
          completionHandler: ^(OAILeadSubscription* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadAdsApi->adAccountsSubscriptionsDelById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **subscriptionId** | **NSString***| Unique identifier of a subscription. | 

### Return type

[**OAILeadSubscription***](OAILeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetById**
```objc
-(NSURLSessionTask*) adAccountsSubscriptionsGetByIdWithAdAccountId: (NSString*) adAccountId
    subscriptionId: (NSString*) subscriptionId
        completionHandler: (void (^)(OAILeadSubscription* output, NSError* error)) handler;
```

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* subscriptionId = @"subscriptionId_example"; // Unique identifier of a subscription.

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Get lead ads subscription by ID
[apiInstance adAccountsSubscriptionsGetByIdWithAdAccountId:adAccountId
              subscriptionId:subscriptionId
          completionHandler: ^(OAILeadSubscription* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadAdsApi->adAccountsSubscriptionsGetById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **subscriptionId** | **NSString***| Unique identifier of a subscription. | 

### Return type

[**OAILeadSubscription***](OAILeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetList**
```objc
-(NSURLSessionTask*) adAccountsSubscriptionsGetListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIAdAccountsSubscriptionsGetList200Response* output, NSError* error)) handler;
```

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Get lead ads subscriptions
[apiInstance adAccountsSubscriptionsGetListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIAdAccountsSubscriptionsGetList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadAdsApi->adAccountsSubscriptionsGetList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIAdAccountsSubscriptionsGetList200Response***](OAIAdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsPost**
```objc
-(NSURLSessionTask*) adAccountsSubscriptionsPostWithAdAccountId: (NSString*) adAccountId
    leadSubscriptionPostParamsCreate: (OAILeadSubscriptionPostParamsCreate*) leadSubscriptionPostParamsCreate
        completionHandler: (void (^)(OAILeadSubscription* output, NSError* error)) handler;
```

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAILeadSubscriptionPostParamsCreate* leadSubscriptionPostParamsCreate = [[OAILeadSubscriptionPostParamsCreate alloc] init]; // 

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Create lead ads subscription
[apiInstance adAccountsSubscriptionsPostWithAdAccountId:adAccountId
              leadSubscriptionPostParamsCreate:leadSubscriptionPostParamsCreate
          completionHandler: ^(OAILeadSubscription* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadAdsApi->adAccountsSubscriptionsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadSubscriptionPostParamsCreate** | [**OAILeadSubscriptionPostParamsCreate***](OAILeadSubscriptionPostParamsCreate.md)|  | 

### Return type

[**OAILeadSubscription***](OAILeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

