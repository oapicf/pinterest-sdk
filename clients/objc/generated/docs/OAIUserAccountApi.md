# OAIUserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardsUserFollowsList**](OAIUserAccountApi.md#boardsuserfollowslist) | **GET** /user_account/following/boards | List following boards
[**followUserUpdate**](OAIUserAccountApi.md#followuserupdate) | **POST** /user_account/following/{username} | Follow user
[**followersList**](OAIUserAccountApi.md#followerslist) | **GET** /user_account/followers | List followers
[**linkedBusinessAccountsGet**](OAIUserAccountApi.md#linkedbusinessaccountsget) | **GET** /user_account/businesses | List linked businesses
[**unverifyWebsiteDelete**](OAIUserAccountApi.md#unverifywebsitedelete) | **DELETE** /user_account/websites | Unverify website
[**userAccountAnalytics**](OAIUserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountAnalyticsTopPins**](OAIUserAccountApi.md#useraccountanalyticstoppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**userAccountAnalyticsTopVideoPins**](OAIUserAccountApi.md#useraccountanalyticstopvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**userAccountFollowedInterests**](OAIUserAccountApi.md#useraccountfollowedinterests) | **GET** /users/{username}/interests/follow | List following interests
[**userAccountGet**](OAIUserAccountApi.md#useraccountget) | **GET** /user_account | Get user account
[**userFollowingGet**](OAIUserAccountApi.md#userfollowingget) | **GET** /user_account/following | List following
[**userWebsitesGet**](OAIUserAccountApi.md#userwebsitesget) | **GET** /user_account/websites | Get user websites
[**verifyWebsiteUpdate**](OAIUserAccountApi.md#verifywebsiteupdate) | **POST** /user_account/websites | Verify website
[**websiteVerificationGet**](OAIUserAccountApi.md#websiteverificationget) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boardsUserFollowsList**
```objc
-(NSURLSessionTask*) boardsUserFollowsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    explicitFollowing: (NSNumber*) explicitFollowing
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIBoardsUserFollowsList200Response* output, NSError* error)) handler;
```

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSNumber* explicitFollowing = @(NO); // Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to @(NO))
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// List following boards
[apiInstance boardsUserFollowsListWithBookmark:bookmark
              pageSize:pageSize
              explicitFollowing:explicitFollowing
              adAccountId:adAccountId
          completionHandler: ^(OAIBoardsUserFollowsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->boardsUserFollowsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **explicitFollowing** | **NSNumber***| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to @(NO)]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIBoardsUserFollowsList200Response***](OAIBoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followUserUpdate**
```objc
-(NSURLSessionTask*) followUserUpdateWithUsername: (NSString*) username
    followUserRequest: (OAIFollowUserRequest*) followUserRequest
        completionHandler: (void (^)(OAIUserSummary* output, NSError* error)) handler;
```

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* username = username; // A valid username
OAIFollowUserRequest* followUserRequest = [[OAIFollowUserRequest alloc] init]; // Follow a user.

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Follow user
[apiInstance followUserUpdateWithUsername:username
              followUserRequest:followUserRequest
          completionHandler: ^(OAIUserSummary* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->followUserUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **NSString***| A valid username | 
 **followUserRequest** | [**OAIFollowUserRequest***](OAIFollowUserRequest.md)| Follow a user. | 

### Return type

[**OAIUserSummary***](OAIUserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followersList**
```objc
-(NSURLSessionTask*) followersListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIFollowersList200Response* output, NSError* error)) handler;
```

List followers

Get a list of your followers.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// List followers
[apiInstance followersListWithBookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIFollowersList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->followersList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIFollowersList200Response***](OAIFollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linkedBusinessAccountsGet**
```objc
-(NSURLSessionTask*) linkedBusinessAccountsGetWithCompletionHandler: 
        (void (^)(NSArray<OAILinkedBusiness>* output, NSError* error)) handler;
```

List linked businesses

Get a list of your linked business accounts.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// List linked businesses
[apiInstance linkedBusinessAccountsGetWithCompletionHandler: 
          ^(NSArray<OAILinkedBusiness>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->linkedBusinessAccountsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<OAILinkedBusiness>***](OAILinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverifyWebsiteDelete**
```objc
-(NSURLSessionTask*) unverifyWebsiteDeleteWithWebsite: (NSString*) website
        completionHandler: (void (^)(NSError* error)) handler;
```

Unverify website

Unverifu a website verified by the signed-in user.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* website = mysite.test; // Website with path or domain only

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Unverify website
[apiInstance unverifyWebsiteDeleteWithWebsite:website
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->unverifyWebsiteDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **NSString***| Website with path or domain only | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountAnalytics**
```objc
-(NSURLSessionTask*) userAccountAnalyticsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    contentType: (NSString*) contentType
    source: (NSString*) source
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


NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSString* fromClaimedContent = @"BOTH"; // Filter on Pins that match your claimed domain. (optional) (default to @"BOTH")
NSString* pinFormat = @"ALL"; // Pin formats to get data for, default is all. (optional) (default to @"ALL")
NSString* appTypes = @"ALL"; // Apps or devices to get data for, default is all. (optional) (default to @"ALL")
NSString* contentType = @"ALL"; // Filter to paid or organic data. Default is all. (optional) (default to @"ALL")
NSString* source = @"ALL"; // Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to @"ALL")
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
              contentType:contentType
              source:source
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
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **fromClaimedContent** | **NSString***| Filter on Pins that match your claimed domain. | [optional] [default to @&quot;BOTH&quot;]
 **pinFormat** | **NSString***| Pin formats to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **contentType** | **NSString***| Filter to paid or organic data. Default is all. | [optional] [default to @&quot;ALL&quot;]
 **source** | **NSString***| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to @&quot;ALL&quot;]
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

# **userAccountAnalyticsTopPins**
```objc
-(NSURLSessionTask*) userAccountAnalyticsTopPinsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    sortBy: (NSString*) sortBy
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    contentType: (NSString*) contentType
    source: (NSString*) source
    metricTypes: (NSArray<NSString*>*) metricTypes
    numOfPins: (NSNumber*) numOfPins
    createdInLastNDays: (NSNumber*) createdInLastNDays
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAITopPinsAnalyticsResponse* output, NSError* error)) handler;
```

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSString* sortBy = @"sortBy_example"; // Specify sorting order for metrics
NSString* fromClaimedContent = @"BOTH"; // Filter on Pins that match your claimed domain. (optional) (default to @"BOTH")
NSString* pinFormat = @"ALL"; // Pin formats to get data for, default is all. (optional) (default to @"ALL")
NSString* appTypes = @"ALL"; // Apps or devices to get data for, default is all. (optional) (default to @"ALL")
NSString* contentType = @"ALL"; // Filter to paid or organic data. Default is all. (optional) (default to @"ALL")
NSString* source = @"ALL"; // Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to @"ALL")
NSArray<NSString*>* metricTypes = @[@"metricTypes_example"]; // Metric types to get data for, default is all.  (optional)
NSNumber* numOfPins = 25; // Number of pins to include, default is 10. Max is 50. (optional) (default to @10)
NSNumber* createdInLastNDays = 30; // Get metrics for pins created in the last \"n\" days. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Get user account top pins analytics
[apiInstance userAccountAnalyticsTopPinsWithStartDate:startDate
              endDate:endDate
              sortBy:sortBy
              fromClaimedContent:fromClaimedContent
              pinFormat:pinFormat
              appTypes:appTypes
              contentType:contentType
              source:source
              metricTypes:metricTypes
              numOfPins:numOfPins
              createdInLastNDays:createdInLastNDays
              adAccountId:adAccountId
          completionHandler: ^(OAITopPinsAnalyticsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userAccountAnalyticsTopPins: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | **NSString***| Specify sorting order for metrics | 
 **fromClaimedContent** | **NSString***| Filter on Pins that match your claimed domain. | [optional] [default to @&quot;BOTH&quot;]
 **pinFormat** | **NSString***| Pin formats to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **contentType** | **NSString***| Filter to paid or organic data. Default is all. | [optional] [default to @&quot;ALL&quot;]
 **source** | **NSString***| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to @&quot;ALL&quot;]
 **metricTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Metric types to get data for, default is all.  | [optional] 
 **numOfPins** | **NSNumber***| Number of pins to include, default is 10. Max is 50. | [optional] [default to @10]
 **createdInLastNDays** | **NSNumber***| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAITopPinsAnalyticsResponse***](OAITopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountAnalyticsTopVideoPins**
```objc
-(NSURLSessionTask*) userAccountAnalyticsTopVideoPinsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    sortBy: (NSString*) sortBy
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    contentType: (NSString*) contentType
    source: (NSString*) source
    metricTypes: (NSArray<NSString*>*) metricTypes
    numOfPins: (NSNumber*) numOfPins
    createdInLastNDays: (NSNumber*) createdInLastNDays
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAITopVideoPinsAnalyticsResponse* output, NSError* error)) handler;
```

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSString* sortBy = @"sortBy_example"; // Specify sorting order for video metrics
NSString* fromClaimedContent = @"BOTH"; // Filter on Pins that match your claimed domain. (optional) (default to @"BOTH")
NSString* pinFormat = @"ALL"; // Pin formats to get data for, default is all. (optional) (default to @"ALL")
NSString* appTypes = @"ALL"; // Apps or devices to get data for, default is all. (optional) (default to @"ALL")
NSString* contentType = @"ALL"; // Filter to paid or organic data. Default is all. (optional) (default to @"ALL")
NSString* source = @"ALL"; // Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to @"ALL")
NSArray<NSString*>* metricTypes = @[@"metricTypes_example"]; // Metric types to get video data for, default is all.  (optional)
NSNumber* numOfPins = 25; // Number of pins to include, default is 10. Max is 50. (optional) (default to @10)
NSNumber* createdInLastNDays = 30; // Get metrics for pins created in the last \"n\" days. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Get user account top video pins analytics
[apiInstance userAccountAnalyticsTopVideoPinsWithStartDate:startDate
              endDate:endDate
              sortBy:sortBy
              fromClaimedContent:fromClaimedContent
              pinFormat:pinFormat
              appTypes:appTypes
              contentType:contentType
              source:source
              metricTypes:metricTypes
              numOfPins:numOfPins
              createdInLastNDays:createdInLastNDays
              adAccountId:adAccountId
          completionHandler: ^(OAITopVideoPinsAnalyticsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userAccountAnalyticsTopVideoPins: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | **NSString***| Specify sorting order for video metrics | 
 **fromClaimedContent** | **NSString***| Filter on Pins that match your claimed domain. | [optional] [default to @&quot;BOTH&quot;]
 **pinFormat** | **NSString***| Pin formats to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **contentType** | **NSString***| Filter to paid or organic data. Default is all. | [optional] [default to @&quot;ALL&quot;]
 **source** | **NSString***| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to @&quot;ALL&quot;]
 **metricTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Metric types to get video data for, default is all.  | [optional] 
 **numOfPins** | **NSNumber***| Number of pins to include, default is 10. Max is 50. | [optional] [default to @10]
 **createdInLastNDays** | **NSNumber***| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAITopVideoPinsAnalyticsResponse***](OAITopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountFollowedInterests**
```objc
-(NSURLSessionTask*) userAccountFollowedInterestsWithUsername: (NSString*) username
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIUserAccountFollowedInterests200Response* output, NSError* error)) handler;
```

List following interests

Get a list of a user's following interests in one place.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* username = username; // A valid username
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// List following interests
[apiInstance userAccountFollowedInterestsWithUsername:username
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIUserAccountFollowedInterests200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userAccountFollowedInterests: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **NSString***| A valid username | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIUserAccountFollowedInterests200Response***](OAIUserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
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

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userFollowingGet**
```objc
-(NSURLSessionTask*) userFollowingGetWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    feedType: (OAIUserFollowingFeedType) feedType
    explicitFollowing: (NSNumber*) explicitFollowing
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIUserFollowingGet200Response* output, NSError* error)) handler;
```

List following

Get a list of who a certain user follows.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
OAIUserFollowingFeedType feedType = [[OAIUserFollowingFeedType alloc] init]; // Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
NSNumber* explicitFollowing = @(NO); // Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to @(NO))
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// List following
[apiInstance userFollowingGetWithBookmark:bookmark
              pageSize:pageSize
              feedType:feedType
              explicitFollowing:explicitFollowing
              adAccountId:adAccountId
          completionHandler: ^(OAIUserFollowingGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userFollowingGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **feedType** | **OAIUserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **explicitFollowing** | **NSNumber***| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to @(NO)]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIUserFollowingGet200Response***](OAIUserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userWebsitesGet**
```objc
-(NSURLSessionTask*) userWebsitesGetWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIUserWebsitesGet200Response* output, NSError* error)) handler;
```

Get user websites

Get user websites, claimed or not

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Get user websites
[apiInstance userWebsitesGetWithBookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIUserWebsitesGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->userWebsitesGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIUserWebsitesGet200Response***](OAIUserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verifyWebsiteUpdate**
```objc
-(NSURLSessionTask*) verifyWebsiteUpdateWithUserWebsiteVerifyRequest: (OAIUserWebsiteVerifyRequest*) userWebsiteVerifyRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIUserWebsiteSummary* output, NSError* error)) handler;
```

Verify website

Verify a website as a signed-in user.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIUserWebsiteVerifyRequest* userWebsiteVerifyRequest = [[OAIUserWebsiteVerifyRequest alloc] init]; // Verify a website.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Verify website
[apiInstance verifyWebsiteUpdateWithUserWebsiteVerifyRequest:userWebsiteVerifyRequest
              adAccountId:adAccountId
          completionHandler: ^(OAIUserWebsiteSummary* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->verifyWebsiteUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteVerifyRequest** | [**OAIUserWebsiteVerifyRequest***](OAIUserWebsiteVerifyRequest.md)| Verify a website. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIUserWebsiteSummary***](OAIUserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **websiteVerificationGet**
```objc
-(NSURLSessionTask*) websiteVerificationGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIUserWebsiteVerificationCode* output, NSError* error)) handler;
```

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIUserAccountApi*apiInstance = [[OAIUserAccountApi alloc] init];

// Get user verification code for website claiming
[apiInstance websiteVerificationGetWithAdAccountId:adAccountId
          completionHandler: ^(OAIUserWebsiteVerificationCode* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUserAccountApi->websiteVerificationGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIUserWebsiteVerificationCode***](OAIUserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

