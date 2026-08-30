# OAISchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](OAISchedulesApi.md#schedulescreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](OAISchedulesApi.md#scheduleslist) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](OAISchedulesApi.md#schedulesupdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedulesCreate**
```objc
-(NSURLSessionTask*) schedulesCreateWithAdAccountId: (NSString*) adAccountId
    scheduleCreate: (NSArray<OAIScheduleCreate>*) scheduleCreate
        completionHandler: (void (^)(NSArray<OAISchedulesCreate200ResponseInner>* output, NSError* error)) handler;
```

Create schedules

Batch create schedules

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSArray<OAIScheduleCreate>* scheduleCreate = @[[[OAIScheduleCreate alloc] init]]; // 

OAISchedulesApi*apiInstance = [[OAISchedulesApi alloc] init];

// Create schedules
[apiInstance schedulesCreateWithAdAccountId:adAccountId
              scheduleCreate:scheduleCreate
          completionHandler: ^(NSArray<OAISchedulesCreate200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISchedulesApi->schedulesCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***|  | 
 **scheduleCreate** | [**NSArray&lt;OAIScheduleCreate&gt;***](OAIScheduleCreate.md)|  | 

### Return type

[**NSArray<OAISchedulesCreate200ResponseInner>***](OAISchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedulesList**
```objc
-(NSURLSessionTask*) schedulesListWithAdAccountId: (NSString*) adAccountId
    entityIds: (NSArray<NSString*>*) entityIds
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    scheduleStatuses: (NSArray<OAIScheduleStatus>*) scheduleStatuses
    scheduleType: (OAIScheduleType) scheduleType
        completionHandler: (void (^)(OAISchedulesList200Response* output, NSError* error)) handler;
```

Get Schedules

Get schedules for a specific advertiser

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSArray<NSString*>* entityIds = @[@"entityIds_example"]; // List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSArray<OAIScheduleStatus>* scheduleStatuses = @[[[OAIScheduleStatus alloc] init]]; // Filter schedules by status (one or more) (optional)
OAIScheduleType scheduleType = [[OAIScheduleType alloc] init]; // Filter schedules by a type (optional)

OAISchedulesApi*apiInstance = [[OAISchedulesApi alloc] init];

// Get Schedules
[apiInstance schedulesListWithAdAccountId:adAccountId
              entityIds:entityIds
              bookmark:bookmark
              pageSize:pageSize
              order:order
              scheduleStatuses:scheduleStatuses
              scheduleType:scheduleType
          completionHandler: ^(OAISchedulesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISchedulesApi->schedulesList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***|  | 
 **entityIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]
 **order** | [**OAIPinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **scheduleStatuses** | [**NSArray&lt;OAIScheduleStatus&gt;***](OAIScheduleStatus*.md)| Filter schedules by status (one or more) | [optional] 
 **scheduleType** | [**OAIScheduleType**](.md)| Filter schedules by a type | [optional] 

### Return type

[**OAISchedulesList200Response***](OAISchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedulesUpdate**
```objc
-(NSURLSessionTask*) schedulesUpdateWithAdAccountId: (NSString*) adAccountId
    scheduleBatchUpdate: (NSArray<OAIScheduleBatchUpdate>*) scheduleBatchUpdate
        completionHandler: (void (^)(NSArray<OAISchedulesCreate200ResponseInner>* output, NSError* error)) handler;
```

Update schedules

Update one or more schedules

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSArray<OAIScheduleBatchUpdate>* scheduleBatchUpdate = @[[[OAIScheduleBatchUpdate alloc] init]]; // 

OAISchedulesApi*apiInstance = [[OAISchedulesApi alloc] init];

// Update schedules
[apiInstance schedulesUpdateWithAdAccountId:adAccountId
              scheduleBatchUpdate:scheduleBatchUpdate
          completionHandler: ^(NSArray<OAISchedulesCreate200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISchedulesApi->schedulesUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***|  | 
 **scheduleBatchUpdate** | [**NSArray&lt;OAIScheduleBatchUpdate&gt;***](OAIScheduleBatchUpdate.md)|  | 

### Return type

[**NSArray<OAISchedulesCreate200ResponseInner>***](OAISchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

