# OAITargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](OAITargetingTemplateApi.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](OAITargetingTemplateApi.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](OAITargetingTemplateApi.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targetingTemplateCreate**
```objc
-(NSURLSessionTask*) targetingTemplateCreateWithAdAccountId: (NSString*) adAccountId
    targetingTemplateCreate: (OAITargetingTemplateCreate*) targetingTemplateCreate
        completionHandler: (void (^)(OAITargetingTemplate* output, NSError* error)) handler;
```

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAITargetingTemplateCreate* targetingTemplateCreate = [[OAITargetingTemplateCreate alloc] init]; // 

OAITargetingTemplateApi*apiInstance = [[OAITargetingTemplateApi alloc] init];

// Create targeting templates
[apiInstance targetingTemplateCreateWithAdAccountId:adAccountId
              targetingTemplateCreate:targetingTemplateCreate
          completionHandler: ^(OAITargetingTemplate* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITargetingTemplateApi->targetingTemplateCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **targetingTemplateCreate** | [**OAITargetingTemplateCreate***](OAITargetingTemplateCreate.md)|  | 

### Return type

[**OAITargetingTemplate***](OAITargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateList**
```objc
-(NSURLSessionTask*) targetingTemplateListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    includeSizing: (NSNumber*) includeSizing
    searchQuery: (NSString*) searchQuery
        completionHandler: (void (^)(OAITargetingTemplateList200Response* output, NSError* error)) handler;
```

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSNumber* includeSizing = @(NO); // Include audience sizing in result or not (optional) (default to @(NO))
NSString* searchQuery = @"searchQuery_example"; // Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

OAITargetingTemplateApi*apiInstance = [[OAITargetingTemplateApi alloc] init];

// List targeting templates
[apiInstance targetingTemplateListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
              includeSizing:includeSizing
              searchQuery:searchQuery
          completionHandler: ^(OAITargetingTemplateList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITargetingTemplateApi->targetingTemplateList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]
 **order** | [**OAIPinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **includeSizing** | **NSNumber***| Include audience sizing in result or not | [optional] [default to @(NO)]
 **searchQuery** | **NSString***| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**OAITargetingTemplateList200Response***](OAITargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateUpdate**
```objc
-(NSURLSessionTask*) targetingTemplateUpdateWithAdAccountId: (NSString*) adAccountId
    targetingTemplateUpdateRequestReadOrUpdate: (OAITargetingTemplateUpdateRequestReadOrUpdate*) targetingTemplateUpdateRequestReadOrUpdate
        completionHandler: (void (^)(NSError* error)) handler;
```

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAITargetingTemplateUpdateRequestReadOrUpdate* targetingTemplateUpdateRequestReadOrUpdate = [[OAITargetingTemplateUpdateRequestReadOrUpdate alloc] init]; // 

OAITargetingTemplateApi*apiInstance = [[OAITargetingTemplateApi alloc] init];

// Update targeting templates
[apiInstance targetingTemplateUpdateWithAdAccountId:adAccountId
              targetingTemplateUpdateRequestReadOrUpdate:targetingTemplateUpdateRequestReadOrUpdate
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAITargetingTemplateApi->targetingTemplateUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **targetingTemplateUpdateRequestReadOrUpdate** | [**OAITargetingTemplateUpdateRequestReadOrUpdate***](OAITargetingTemplateUpdateRequestReadOrUpdate.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

