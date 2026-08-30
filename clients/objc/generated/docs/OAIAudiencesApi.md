# OAIAudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](OAIAudiencesApi.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesGet**](OAIAudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](OAIAudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](OAIAudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiencesCreate**
```objc
-(NSURLSessionTask*) audiencesCreateWithAdAccountId: (NSString*) adAccountId
    adAccountsAudienceCreate: (OAIAdAccountsAudienceCreate*) adAccountsAudienceCreate
        completionHandler: (void (^)(OAIAdAccountsAudience* output, NSError* error)) handler;
```

Create audience

Create a new audience for the ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdAccountsAudienceCreate* adAccountsAudienceCreate = [[OAIAdAccountsAudienceCreate alloc] init]; // 

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Create audience
[apiInstance audiencesCreateWithAdAccountId:adAccountId
              adAccountsAudienceCreate:adAccountsAudienceCreate
          completionHandler: ^(OAIAdAccountsAudience* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudiencesApi->audiencesCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adAccountsAudienceCreate** | [**OAIAdAccountsAudienceCreate***](OAIAdAccountsAudienceCreate.md)|  | 

### Return type

[**OAIAdAccountsAudience***](OAIAdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesGet**
```objc
-(NSURLSessionTask*) audiencesGetWithAudienceId: (NSString*) audienceId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdAccountsAudience* output, NSError* error)) handler;
```

Get audience

Get a specific audience given the audience ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* audienceId = @"audienceId_example"; // Audience ID.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Get audience
[apiInstance audiencesGetWithAudienceId:audienceId
              adAccountId:adAccountId
          completionHandler: ^(OAIAdAccountsAudience* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudiencesApi->audiencesGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **NSString***| Audience ID. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIAdAccountsAudience***](OAIAdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesList**
```objc
-(NSURLSessionTask*) audiencesListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    ownershipType: (OAIAudienceOwnershipType) ownershipType
    excludeNca: (NSNumber*) excludeNca
        completionHandler: (void (^)(OAIAudiencesList200Response* output, NSError* error)) handler;
```

List audiences

Get list of audiences for the ad account.

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
OAIAudienceOwnershipType ownershipType = [[OAIAudienceOwnershipType alloc] init]; //  (optional)
NSNumber* excludeNca = @(NO); // When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional) (default to @(NO))

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// List audiences
[apiInstance audiencesListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
              ownershipType:ownershipType
              excludeNca:excludeNca
          completionHandler: ^(OAIAudiencesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudiencesApi->audiencesList: %@", error);
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
 **ownershipType** | [**OAIAudienceOwnershipType**](.md)|  | [optional] 
 **excludeNca** | **NSNumber***| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to @(NO)]

### Return type

[**OAIAudiencesList200Response***](OAIAudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesUpdate**
```objc
-(NSURLSessionTask*) audiencesUpdateWithAudienceId: (NSString*) audienceId
    adAccountId: (NSString*) adAccountId
    adAccountsAudienceUpdate: (OAIAdAccountsAudienceUpdate*) adAccountsAudienceUpdate
        completionHandler: (void (^)(OAIAdAccountsAudience* output, NSError* error)) handler;
```

Update audience

Update an existing audience for the ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* audienceId = @"audienceId_example"; // Audience ID.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdAccountsAudienceUpdate* adAccountsAudienceUpdate = [[OAIAdAccountsAudienceUpdate alloc] init]; // 

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Update audience
[apiInstance audiencesUpdateWithAudienceId:audienceId
              adAccountId:adAccountId
              adAccountsAudienceUpdate:adAccountsAudienceUpdate
          completionHandler: ^(OAIAdAccountsAudience* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudiencesApi->audiencesUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **NSString***| Audience ID. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adAccountsAudienceUpdate** | [**OAIAdAccountsAudienceUpdate***](OAIAdAccountsAudienceUpdate.md)|  | 

### Return type

[**OAIAdAccountsAudience***](OAIAdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

