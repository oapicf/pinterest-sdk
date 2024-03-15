# OAIPinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](OAIPinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](OAIPinsApi.md#pinscreate) | **POST** /pins | Create Pin
[**pinsDelete**](OAIPinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](OAIPinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](OAIPinsApi.md#pinslist) | **GET** /pins | List Pins
[**pinsSave**](OAIPinsApi.md#pinssave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](OAIPinsApi.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin


# **pinsAnalytics**
```objc
-(NSURLSessionTask*) pinsAnalyticsWithPinId: (NSString*) pinId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    metricTypes: (NSArray<OAIPinsAnalyticsMetricTypesParameterInner>*) metricTypes
    appTypes: (NSString*) appTypes
    splitField: (NSString*) splitField
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSDictionary<OAIPinAnalyticsMetricsResponse>* output, NSError* error)) handler;
```

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<OAIPinsAnalyticsMetricTypesParameterInner>* metricTypes = @[[[OAIPinsAnalyticsMetricTypesParameterInner alloc] init]]; // Pin metric types to get data for, default is all.
NSString* appTypes = @"ALL"; // Apps or devices to get data for, default is all. (optional) (default to @"ALL")
NSString* splitField = @"NO_SPLIT"; // How to split the data into groups. Not including this param means data won't be split. (optional) (default to @"NO_SPLIT")
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Get Pin analytics
[apiInstance pinsAnalyticsWithPinId:pinId
              startDate:startDate
              endDate:endDate
              metricTypes:metricTypes
              appTypes:appTypes
              splitField:splitField
              adAccountId:adAccountId
          completionHandler: ^(NSDictionary<OAIPinAnalyticsMetricsResponse>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of a Pin. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metricTypes** | [**NSArray&lt;OAIPinsAnalyticsMetricTypesParameterInner&gt;***](OAIPinsAnalyticsMetricTypesParameterInner*.md)| Pin metric types to get data for, default is all. | 
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **splitField** | **NSString***| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to @&quot;NO_SPLIT&quot;]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSDictionary<OAIPinAnalyticsMetricsResponse>***](OAIPinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsCreate**
```objc
-(NSURLSessionTask*) pinsCreateWithPinCreate: (OAIPinCreate*) pinCreate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIPinCreate* pinCreate = [[OAIPinCreate alloc] init]; // Create a new Pin.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Create Pin
[apiInstance pinsCreateWithPinCreate:pinCreate
              adAccountId:adAccountId
          completionHandler: ^(OAIPin* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | [**OAIPinCreate***](OAIPinCreate.md)| Create a new Pin. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsDelete**
```objc
-(NSURLSessionTask*) pinsDeleteWithPinId: (NSString*) pinId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Delete Pin
[apiInstance pinsDeleteWithPinId:pinId
              adAccountId:adAccountId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of a Pin. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsGet**
```objc
-(NSURLSessionTask*) pinsGetWithPinId: (NSString*) pinId
    pinMetrics: (NSNumber*) pinMetrics
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Get Pin
[apiInstance pinsGetWithPinId:pinId
              pinMetrics:pinMetrics
              adAccountId:adAccountId
          completionHandler: ^(OAIPin* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of a Pin. | 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsList**
```objc
-(NSURLSessionTask*) pinsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    pinFilter: (NSString*) pinFilter
    includeProtectedPins: (NSNumber*) includeProtectedPins
    pinType: (NSString*) pinType
    creativeTypes: (NSArray<NSString*>*) creativeTypes
    adAccountId: (NSString*) adAccountId
    pinMetrics: (NSNumber*) pinMetrics
        completionHandler: (void (^)(OAIPinsList200Response* output, NSError* error)) handler;
```

List Pins

Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* pinFilter = @"pinFilter_example"; // Pin filter. (optional)
NSNumber* includeProtectedPins = @(NO); // Specify if return pins from protected boards (optional) (default to @(NO))
NSString* pinType = @"pinType_example"; // The type of pins to return, currently only enabled for private pins (optional)
NSArray<NSString*>* creativeTypes = @[@"creativeTypes_example"]; // Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// List Pins
[apiInstance pinsListWithBookmark:bookmark
              pageSize:pageSize
              pinFilter:pinFilter
              includeProtectedPins:includeProtectedPins
              pinType:pinType
              creativeTypes:creativeTypes
              adAccountId:adAccountId
              pinMetrics:pinMetrics
          completionHandler: ^(OAIPinsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **pinFilter** | **NSString***| Pin filter. | [optional] 
 **includeProtectedPins** | **NSNumber***| Specify if return pins from protected boards | [optional] [default to @(NO)]
 **pinType** | **NSString***| The type of pins to return, currently only enabled for private pins | [optional] 
 **creativeTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]

### Return type

[**OAIPinsList200Response***](OAIPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsSave**
```objc
-(NSURLSessionTask*) pinsSaveWithPinId: (NSString*) pinId
    pinsSaveRequest: (OAIPinsSaveRequest*) pinsSaveRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
OAIPinsSaveRequest* pinsSaveRequest = [[OAIPinsSaveRequest alloc] init]; // Request object used to save an existing pin
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Save Pin
[apiInstance pinsSaveWithPinId:pinId
              pinsSaveRequest:pinsSaveRequest
              adAccountId:adAccountId
          completionHandler: ^(OAIPin* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsSave: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of a Pin. | 
 **pinsSaveRequest** | [**OAIPinsSaveRequest***](OAIPinsSaveRequest.md)| Request object used to save an existing pin | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsUpdate**
```objc
-(NSURLSessionTask*) pinsUpdateWithPinId: (NSString*) pinId
    pinUpdate: (OAIPinUpdate*) pinUpdate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
OAIPinUpdate* pinUpdate = [[OAIPinUpdate alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Update Pin
[apiInstance pinsUpdateWithPinId:pinId
              pinUpdate:pinUpdate
              adAccountId:adAccountId
          completionHandler: ^(OAIPin* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of a Pin. | 
 **pinUpdate** | [**OAIPinUpdate***](OAIPinUpdate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

