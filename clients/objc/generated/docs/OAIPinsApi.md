# OAIPinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](OAIPinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](OAIPinsApi.md#pinscreate) | **POST** /pins | Create Pin
[**pinsDelete**](OAIPinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](OAIPinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin


# **pinsAnalytics**
```objc
-(NSURLSessionTask*) pinsAnalyticsWithPinId: (NSString*) pinId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    metricTypes: (NSArray<NSString*>*) metricTypes
    appTypes: (NSString*) appTypes
    splitField: (NSString*) splitField
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSDictionary<OAIAnalyticsMetricsResponse>* output, NSError* error)) handler;
```

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSArray<NSString*>* metricTypes = @[@"metricTypes_example"]; // Pin metric types to get data for, default is all.
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
          completionHandler: ^(NSDictionary<OAIAnalyticsMetricsResponse>* output, NSError* error) {
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
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metricTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Pin metric types to get data for, default is all. | 
 **appTypes** | **NSString***| Apps or devices to get data for, default is all. | [optional] [default to @&quot;ALL&quot;]
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

# **pinsCreate**
```objc
-(NSURLSessionTask*) pinsCreateWithPin: (OAIPin*) pin
        completionHandler: (void (^)(OAIPin* output, NSError* error)) handler;
```

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIPin* pin = [[OAIPin alloc] init]; // Create a new Pin.

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Create Pin
[apiInstance pinsCreateWithPin:pin
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
 **pin** | [**OAIPin***](OAIPin.md)| Create a new Pin. | 

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
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of a Pin.

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Delete Pin
[apiInstance pinsDeleteWithPinId:pinId
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
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIPinsApi*apiInstance = [[OAIPinsApi alloc] init];

// Get Pin
[apiInstance pinsGetWithPinId:pinId
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIPin***](OAIPin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

