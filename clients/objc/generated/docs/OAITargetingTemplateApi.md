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
        completionHandler: (void (^)(OAITargetingTemplateGetResponseData* output, NSError* error)) handler;
```

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAITargetingTemplateCreate* targetingTemplateCreate = [[OAITargetingTemplateCreate alloc] init]; // targeting template creation entity

OAITargetingTemplateApi*apiInstance = [[OAITargetingTemplateApi alloc] init];

// Create targeting templates
[apiInstance targetingTemplateCreateWithAdAccountId:adAccountId
              targetingTemplateCreate:targetingTemplateCreate
          completionHandler: ^(OAITargetingTemplateGetResponseData* output, NSError* error) {
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
 **targetingTemplateCreate** | [**OAITargetingTemplateCreate***](OAITargetingTemplateCreate.md)| targeting template creation entity | 

### Return type

[**OAITargetingTemplateGetResponseData***](OAITargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateList**
```objc
-(NSURLSessionTask*) targetingTemplateListWithAdAccountId: (NSString*) adAccountId
    order: (NSString*) order
    includeSizing: (NSNumber*) includeSizing
    searchQuery: (NSString*) searchQuery
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAITargetingTemplateList200Response* output, NSError* error)) handler;
```

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSNumber* includeSizing = @(NO); // Include audience sizing in result or not (optional) (default to @(NO))
NSString* searchQuery = gaming; // Search keyword for targeting templates (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAITargetingTemplateApi*apiInstance = [[OAITargetingTemplateApi alloc] init];

// List targeting templates
[apiInstance targetingTemplateListWithAdAccountId:adAccountId
              order:order
              includeSizing:includeSizing
              searchQuery:searchQuery
              pageSize:pageSize
              bookmark:bookmark
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
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **includeSizing** | **NSNumber***| Include audience sizing in result or not | [optional] [default to @(NO)]
 **searchQuery** | **NSString***| Search keyword for targeting templates | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAITargetingTemplateList200Response***](OAITargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateUpdate**
```objc
-(NSURLSessionTask*) targetingTemplateUpdateWithAdAccountId: (NSString*) adAccountId
    targetingTemplateUpdateRequest: (OAITargetingTemplateUpdateRequest*) targetingTemplateUpdateRequest
        completionHandler: (void (^)(NSError* error)) handler;
```

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAITargetingTemplateUpdateRequest* targetingTemplateUpdateRequest = [[OAITargetingTemplateUpdateRequest alloc] init]; // Operation type and targeting template ID

OAITargetingTemplateApi*apiInstance = [[OAITargetingTemplateApi alloc] init];

// Update targeting templates
[apiInstance targetingTemplateUpdateWithAdAccountId:adAccountId
              targetingTemplateUpdateRequest:targetingTemplateUpdateRequest
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
 **targetingTemplateUpdateRequest** | [**OAITargetingTemplateUpdateRequest***](OAITargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

