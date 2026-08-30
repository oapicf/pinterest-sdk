# OAIConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](OAIConversionTagsApi.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](OAIConversionTagsApi.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](OAIConversionTagsApi.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpmEligibleConversionTagsGet**](OAIConversionTagsApi.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](OAIConversionTagsApi.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **conversionTagsCreate**
```objc
-(NSURLSessionTask*) conversionTagsCreateWithAdAccountId: (NSString*) adAccountId
    conversionTagCreate: (OAIConversionTagCreate*) conversionTagCreate
        completionHandler: (void (^)(OAIConversionTag* output, NSError* error)) handler;
```

Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIConversionTagCreate* conversionTagCreate = [[OAIConversionTagCreate alloc] init]; // 

OAIConversionTagsApi*apiInstance = [[OAIConversionTagsApi alloc] init];

// Create conversion tag
[apiInstance conversionTagsCreateWithAdAccountId:adAccountId
              conversionTagCreate:conversionTagCreate
          completionHandler: ^(OAIConversionTag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionTagsApi->conversionTagsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **conversionTagCreate** | [**OAIConversionTagCreate***](OAIConversionTagCreate.md)|  | 

### Return type

[**OAIConversionTag***](OAIConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionTagsGet**
```objc
-(NSURLSessionTask*) conversionTagsGetWithAdAccountId: (NSString*) adAccountId
    conversionTagId: (NSString*) conversionTagId
        completionHandler: (void (^)(OAIConversionTag* output, NSError* error)) handler;
```

Get conversion tag

Get information about an existing conversion tag.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* conversionTagId = @"conversionTagId_example"; // Id of the conversion tag.

OAIConversionTagsApi*apiInstance = [[OAIConversionTagsApi alloc] init];

// Get conversion tag
[apiInstance conversionTagsGetWithAdAccountId:adAccountId
              conversionTagId:conversionTagId
          completionHandler: ^(OAIConversionTag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionTagsApi->conversionTagsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **conversionTagId** | **NSString***| Id of the conversion tag. | 

### Return type

[**OAIConversionTag***](OAIConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionTagsList**
```objc
-(NSURLSessionTask*) conversionTagsListWithAdAccountId: (NSString*) adAccountId
    filterDeleted: (NSNumber*) filterDeleted
        completionHandler: (void (^)(OAIConversionTagsList200Response* output, NSError* error)) handler;
```

List conversion tags

List conversion tags associated with an ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* filterDeleted = @(NO); // Filter by deleted status (optional) (default to @(NO))

OAIConversionTagsApi*apiInstance = [[OAIConversionTagsApi alloc] init];

// List conversion tags
[apiInstance conversionTagsListWithAdAccountId:adAccountId
              filterDeleted:filterDeleted
          completionHandler: ^(OAIConversionTagsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionTagsApi->conversionTagsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **filterDeleted** | **NSNumber***| Filter by deleted status | [optional] [default to @(NO)]

### Return type

[**OAIConversionTagsList200Response***](OAIConversionTagsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ocpmEligibleConversionTagsGet**
```objc
-(NSURLSessionTask*) ocpmEligibleConversionTagsGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSDictionary<NSString*, NSArray<OAIConversionEventResponse>*>* output, NSError* error)) handler;
```

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIConversionTagsApi*apiInstance = [[OAIConversionTagsApi alloc] init];

// Get Ocpm eligible conversion tags
[apiInstance ocpmEligibleConversionTagsGetWithAdAccountId:adAccountId
          completionHandler: ^(NSDictionary<NSString*, NSArray<OAIConversionEventResponse>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionTagsApi->ocpmEligibleConversionTagsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**NSDictionary<NSString*, NSArray<OAIConversionEventResponse>*>***](NSArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pageVisitConversionTagsGet**
```objc
-(NSURLSessionTask*) pageVisitConversionTagsGetWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
        completionHandler: (void (^)(OAIPageVisitConversionTagsGet200Response* output, NSError* error)) handler;
```

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

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

OAIConversionTagsApi*apiInstance = [[OAIConversionTagsApi alloc] init];

// Get page visit conversion tags
[apiInstance pageVisitConversionTagsGetWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
          completionHandler: ^(OAIPageVisitConversionTagsGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConversionTagsApi->pageVisitConversionTagsGet: %@", error);
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

### Return type

[**OAIPageVisitConversionTagsGet200Response***](OAIPageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

