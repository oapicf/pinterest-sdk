# OAILeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](OAILeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](OAILeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**adAccountsSubscriptionsGetList**](OAILeadAdsApi.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](OAILeadAdsApi.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **adAccountsSubscriptionsDelById**
```objc
-(NSURLSessionTask*) adAccountsSubscriptionsDelByIdWithAdAccountId: (NSString*) adAccountId
    subscriptionId: (NSString*) subscriptionId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

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
          completionHandler: ^(NSError* error) {
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

void (empty response body)

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
        completionHandler: (void (^)(OAIAdAccountGetSubscriptionResponse* output, NSError* error)) handler;
```

Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* subscriptionId = @"subscriptionId_example"; // Unique identifier of a subscription.

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Get lead ads subscription
[apiInstance adAccountsSubscriptionsGetByIdWithAdAccountId:adAccountId
              subscriptionId:subscriptionId
          completionHandler: ^(OAIAdAccountGetSubscriptionResponse* output, NSError* error) {
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

[**OAIAdAccountGetSubscriptionResponse***](OAIAdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetList**
```objc
-(NSURLSessionTask*) adAccountsSubscriptionsGetListWithAdAccountId: (NSString*) adAccountId
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIAdAccountsSubscriptionsGetList200Response* output, NSError* error)) handler;
```

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Get lead ads subscriptions
[apiInstance adAccountsSubscriptionsGetListWithAdAccountId:adAccountId
              pageSize:pageSize
              bookmark:bookmark
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

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
    adAccountCreateSubscriptionRequest: (OAIAdAccountCreateSubscriptionRequest*) adAccountCreateSubscriptionRequest
        completionHandler: (void (^)(OAIAdAccountCreateSubscriptionResponse* output, NSError* error)) handler;
```

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdAccountCreateSubscriptionRequest* adAccountCreateSubscriptionRequest = [[OAIAdAccountCreateSubscriptionRequest alloc] init]; // Subscription to create.

OAILeadAdsApi*apiInstance = [[OAILeadAdsApi alloc] init];

// Create lead ads subscription
[apiInstance adAccountsSubscriptionsPostWithAdAccountId:adAccountId
              adAccountCreateSubscriptionRequest:adAccountCreateSubscriptionRequest
          completionHandler: ^(OAIAdAccountCreateSubscriptionResponse* output, NSError* error) {
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
 **adAccountCreateSubscriptionRequest** | [**OAIAdAccountCreateSubscriptionRequest***](OAIAdAccountCreateSubscriptionRequest.md)| Subscription to create. | 

### Return type

[**OAIAdAccountCreateSubscriptionResponse***](OAIAdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

