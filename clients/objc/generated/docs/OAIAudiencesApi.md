# OAIAudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](OAIAudiencesApi.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](OAIAudiencesApi.md#audiencescreatecustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiencesGet**](OAIAudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](OAIAudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](OAIAudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiencesCreate**
```objc
-(NSURLSessionTask*) audiencesCreateWithAdAccountId: (NSString*) adAccountId
    audienceCreateRequest: (OAIAudienceCreateRequest*) audienceCreateRequest
        completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler;
```

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAudienceCreateRequest* audienceCreateRequest = [[OAIAudienceCreateRequest alloc] init]; // List of ads to create, size limit [1, 30]

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Create audience
[apiInstance audiencesCreateWithAdAccountId:adAccountId
              audienceCreateRequest:audienceCreateRequest
          completionHandler: ^(OAIAudience* output, NSError* error) {
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
 **audienceCreateRequest** | [**OAIAudienceCreateRequest***](OAIAudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | 

### Return type

[**OAIAudience***](OAIAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesCreateCustom**
```objc
-(NSURLSessionTask*) audiencesCreateCustomWithAdAccountId: (NSString*) adAccountId
    audienceCreateCustomRequest: (OAIAudienceCreateCustomRequest*) audienceCreateCustomRequest
        completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler;
```

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAudienceCreateCustomRequest* audienceCreateCustomRequest = [[OAIAudienceCreateCustomRequest alloc] init]; // Custom audience to create.

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Create custom audience
[apiInstance audiencesCreateCustomWithAdAccountId:adAccountId
              audienceCreateCustomRequest:audienceCreateCustomRequest
          completionHandler: ^(OAIAudience* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudiencesApi->audiencesCreateCustom: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **audienceCreateCustomRequest** | [**OAIAudienceCreateCustomRequest***](OAIAudienceCreateCustomRequest.md)| Custom audience to create. | 

### Return type

[**OAIAudience***](OAIAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesGet**
```objc
-(NSURLSessionTask*) audiencesGetWithAdAccountId: (NSString*) adAccountId
    audienceId: (NSString*) audienceId
        completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler;
```

Get audience

Get a specific audience given the audience ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* audienceId = @"audienceId_example"; // Unique identifier of an audience

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Get audience
[apiInstance audiencesGetWithAdAccountId:adAccountId
              audienceId:audienceId
          completionHandler: ^(OAIAudience* output, NSError* error) {
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **audienceId** | **NSString***| Unique identifier of an audience | 

### Return type

[**OAIAudience***](OAIAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesList**
```objc
-(NSURLSessionTask*) audiencesListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    order: (NSString*) order
    pageSize: (NSNumber*) pageSize
    ownershipType: (NSString*) ownershipType
        completionHandler: (void (^)(OAIAudiencesList200Response* output, NSError* error)) handler;
```

List audiences

Get list of audiences for the ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* ownershipType = OWNED; // <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. (optional) (default to @"OWNED")

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// List audiences
[apiInstance audiencesListWithAdAccountId:adAccountId
              bookmark:bookmark
              order:order
              pageSize:pageSize
              ownershipType:ownershipType
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
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **ownershipType** | **NSString***| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to @&quot;OWNED&quot;]

### Return type

[**OAIAudiencesList200Response***](OAIAudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesUpdate**
```objc
-(NSURLSessionTask*) audiencesUpdateWithAdAccountId: (NSString*) adAccountId
    audienceId: (NSString*) audienceId
    audienceUpdateRequest: (OAIAudienceUpdateRequest*) audienceUpdateRequest
        completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler;
```

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* audienceId = @"audienceId_example"; // Unique identifier of an audience
OAIAudienceUpdateRequest* audienceUpdateRequest = [[OAIAudienceUpdateRequest alloc] init]; // The audience to be updated. (optional)

OAIAudiencesApi*apiInstance = [[OAIAudiencesApi alloc] init];

// Update audience
[apiInstance audiencesUpdateWithAdAccountId:adAccountId
              audienceId:audienceId
              audienceUpdateRequest:audienceUpdateRequest
          completionHandler: ^(OAIAudience* output, NSError* error) {
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **audienceId** | **NSString***| Unique identifier of an audience | 
 **audienceUpdateRequest** | [**OAIAudienceUpdateRequest***](OAIAudienceUpdateRequest.md)| The audience to be updated. | [optional] 

### Return type

[**OAIAudience***](OAIAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

