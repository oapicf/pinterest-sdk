# OAIPinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**multiPinsAnalytics**](OAIPinsApi.md#multipinsanalytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**pinsAnalytics**](OAIPinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](OAIPinsApi.md#pinscreate) | **POST** /pins | Create Pin
[**pinsDelete**](OAIPinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](OAIPinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](OAIPinsApi.md#pinslist) | **GET** /pins | List Pins
[**pinsSave**](OAIPinsApi.md#pinssave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](OAIPinsApi.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin


# **multiPinsAnalytics**
```objc
-(NSURLSessionTask*) multiPinsAnalyticsWithPinIds: (NSArray<NSString*>*) pinIds
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    metricTypes: (NSArray<OAIMultiPinsAnalyticsMetricTypesItem>*) metricTypes
    appTypes: (NSString*) appTypes
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSDictionary<NSString*, NSDictionary*>* output, NSError* error)) handler;
```

Get multiple Pin analytics

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSArray<NSString*>* pinIds = @[@"pinIds_example"]; // List of Pin IDs.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<OAIMultiPinsAnalyticsMetricTypesItem>* metricTypes = @[[[OAIMultiPinsAnalyticsMetricTypesItem alloc] init]]; // Pin metric types to get data for.
NSString* appTypes = @"ALL"; // Apps or devices to get data for, default is all. (optional) (default to @"ALL")
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Get multiple Pin analytics
[apiInstance multiPinsAnalyticsWithPinIds:pinIds
              startDate:startDate
              endDate:endDate
              metricTypes:metricTypes
              appTypes:appTypes
              adAccountId:adAccountId
          completionHandler: ^(NSDictionary<NSString*, NSDictionary*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->multiPinsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Pin IDs. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metricTypes** | [**NSArray&lt;OAIMultiPinsAnalyticsMetricTypesItem&gt;***](OAIMultiPinsAnalyticsMetricTypesItem*.md)| Pin metric types to get data for. | 
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSDictionary<NSString*, NSDictionary*>***](NSDictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsAnalytics**
```objc
-(NSURLSessionTask*) pinsAnalyticsWithPinId: (NSString*) pinId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    metricTypes: (NSArray<OAIQuerypinanalyticsmetrictypesItems>*) metricTypes
    appTypes: (NSString*) appTypes
    splitField: (NSString*) splitField
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSDictionary<OAIPinAnalyticsMetricsResponse>* output, NSError* error)) handler;
```

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<OAIQuerypinanalyticsmetrictypesItems>* metricTypes = @[[[OAIQuerypinanalyticsmetrictypesItems alloc] init]]; // Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.
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
 **metricTypes** | [**NSArray&lt;OAIQuerypinanalyticsmetrictypesItems&gt;***](OAIQuerypinanalyticsmetrictypesItems*.md)| Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;. | 
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
 **splitField** | **NSString***| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to @&quot;NO_SPLIT&quot;]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSDictionary<OAIPinAnalyticsMetricsResponse>***](OAIPinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

 Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIPinCreate* pinCreate = [[OAIPinCreate alloc] init]; // 
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
 **pinCreate** | [**OAIPinCreate***](OAIPinCreate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsDelete**
```objc
-(NSURLSessionTask*) pinsDeleteWithPinId: (NSString*) pinId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Delete Pin

  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Delete Pin
[apiInstance pinsDeleteWithPinId:pinId
              adAccountId:adAccountId
          completionHandler: ^(OAIPin* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPinsApi->pinsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsGet**
```objc
-(NSURLSessionTask*) pinsGetWithPinId: (NSString*) pinId
    adAccountId: (NSString*) adAccountId
    pinMetrics: (NSNumber*) pinMetrics
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Get Pin

  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Get Pin
[apiInstance pinsGetWithPinId:pinId
              adAccountId:adAccountId
              pinMetrics:pinMetrics
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
 **pinId** | **NSString***|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsList**
```objc
-(NSURLSessionTask*) pinsListWithPinFilter: (OAIPinFilter) pinFilter
    pinMetrics: (NSNumber*) pinMetrics
    includeProtectedPins: (NSNumber*) includeProtectedPins
    pinType: (OAIPinType) pinType
    creativeTypes: (NSArray<OAICreativeType>*) creativeTypes
    adAccountId: (NSString*) adAccountId
    domain: (NSString*) domain
    domains: (NSArray<NSString*>*) domains
    includeProductTagObj: (NSNumber*) includeProductTagObj
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIPinsList200Response* output, NSError* error)) handler;
```

List Pins

    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIPinFilter pinFilter = [[OAIPinFilter alloc] init]; // The filter to apply to the pins (optional)
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))
NSNumber* includeProtectedPins = @(NO); // Whether to include protected pins in the results (optional) (default to @(NO))
OAIPinType pinType = [[OAIPinType alloc] init]; // The type of pins to return, currently only enabled for private pins (optional)
NSArray<OAICreativeType>* creativeTypes = @[[[OAICreativeType alloc] init]]; // Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* domain = @"domain_example"; // Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins). (optional)
NSArray<NSString*>* domains = @[@"domains_example"]; // Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`). (optional)
NSNumber* includeProductTagObj = @56; // Include product tag objects in the response with their associated links. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// List Pins
[apiInstance pinsListWithPinFilter:pinFilter
              pinMetrics:pinMetrics
              includeProtectedPins:includeProtectedPins
              pinType:pinType
              creativeTypes:creativeTypes
              adAccountId:adAccountId
              domain:domain
              domains:domains
              includeProductTagObj:includeProductTagObj
              bookmark:bookmark
              pageSize:pageSize
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
 **pinFilter** | [**OAIPinFilter**](.md)| The filter to apply to the pins | [optional] 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]
 **includeProtectedPins** | **NSNumber***| Whether to include protected pins in the results | [optional] [default to @(NO)]
 **pinType** | [**OAIPinType**](.md)| The type of pins to return, currently only enabled for private pins | [optional] 
 **creativeTypes** | [**NSArray&lt;OAICreativeType&gt;***](OAICreativeType*.md)| Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **domain** | **NSString***| Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins). | [optional] 
 **domains** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;). | [optional] 
 **includeProductTagObj** | **NSNumber***| Include product tag objects in the response with their associated links. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIPinsList200Response***](OAIPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsSave**
```objc
-(NSURLSessionTask*) pinsSaveWithPinId: (NSString*) pinId
    pinsSaveRequestCreate: (OAIPinsSaveRequestCreate*) pinsSaveRequestCreate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
OAIPinsSaveRequestCreate* pinsSaveRequestCreate = [[OAIPinsSaveRequestCreate alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Save Pin
[apiInstance pinsSaveWithPinId:pinId
              pinsSaveRequestCreate:pinsSaveRequestCreate
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
 **pinsSaveRequestCreate** | [**OAIPinsSaveRequestCreate***](OAIPinsSaveRequestCreate.md)|  | 
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

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // 
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
 **pinId** | **NSString***|  | 
 **pinUpdate** | [**OAIPinUpdate***](OAIPinUpdate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

