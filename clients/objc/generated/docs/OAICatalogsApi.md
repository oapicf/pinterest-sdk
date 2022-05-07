# OAICatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate**](OAICatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](OAICatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList**](OAICatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate**](OAICatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](OAICatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](OAICatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](OAICatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](OAICatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](OAICatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](OAICatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](OAICatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost**](OAICatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet**](OAICatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items


# **catalogsProductGroupsCreate**
```objc
-(NSURLSessionTask*) catalogsProductGroupsCreateWithCatalogsProductGroupCreateRequest: (OAICatalogsProductGroupCreateRequest*) catalogsProductGroupCreateRequest
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsProductGroupCreateRequest* catalogsProductGroupCreateRequest = [[OAICatalogsProductGroupCreateRequest alloc] init]; // Request object used to created a catalogs product group.

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Create product group
[apiInstance catalogsProductGroupsCreateWithCatalogsProductGroupCreateRequest:catalogsProductGroupCreateRequest
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupCreateRequest** | [**OAICatalogsProductGroupCreateRequest***](OAICatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. | 

### Return type

**NSObject***

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDelete**
```objc
-(NSURLSessionTask*) catalogsProductGroupsDeleteWithProductGroupId: (NSString*) productGroupId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Delete product group
[apiInstance catalogsProductGroupsDeleteWithProductGroupId:productGroupId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
```objc
-(NSURLSessionTask*) catalogsProductGroupsListWithFeedId: (NSString*) feedId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get product groups list
[apiInstance catalogsProductGroupsListWithFeedId:feedId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
```objc
-(NSURLSessionTask*) catalogsProductGroupsUpdateWithProductGroupId: (NSString*) productGroupId
    catalogsProductGroupUpdateRequest: (OAICatalogsProductGroupUpdateRequest*) catalogsProductGroupUpdateRequest
        completionHandler: (void (^)(OAICatalogsProductGroup* output, NSError* error)) handler;
```

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
OAICatalogsProductGroupUpdateRequest* catalogsProductGroupUpdateRequest = [[OAICatalogsProductGroupUpdateRequest alloc] init]; // Request object used to Update a catalogs product group.

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Update product group
[apiInstance catalogsProductGroupsUpdateWithProductGroupId:productGroupId
              catalogsProductGroupUpdateRequest:catalogsProductGroupUpdateRequest
          completionHandler: ^(OAICatalogsProductGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **catalogsProductGroupUpdateRequest** | [**OAICatalogsProductGroupUpdateRequest***](OAICatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. | 

### Return type

[**OAICatalogsProductGroup***](OAICatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedProcessingResultsList**
```objc
-(NSURLSessionTask*) feedProcessingResultsListWithFeedId: (NSString*) feedId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List processing results for a given feed
[apiInstance feedProcessingResultsListWithFeedId:feedId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->feedProcessingResultsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsCreate**
```objc
-(NSURLSessionTask*) feedsCreateWithCatalogsFeedsCreateRequest: (OAICatalogsFeedsCreateRequest*) catalogsFeedsCreateRequest
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsFeedsCreateRequest* catalogsFeedsCreateRequest = [[OAICatalogsFeedsCreateRequest alloc] init]; // Request object used to created a feed.

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Create feed
[apiInstance feedsCreateWithCatalogsFeedsCreateRequest:catalogsFeedsCreateRequest
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->feedsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedsCreateRequest** | [**OAICatalogsFeedsCreateRequest***](OAICatalogsFeedsCreateRequest.md)| Request object used to created a feed. | 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsDelete**
```objc
-(NSURLSessionTask*) feedsDeleteWithFeedId: (NSString*) feedId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Delete feed
[apiInstance feedsDeleteWithFeedId:feedId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->feedsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsGet**
```objc
-(NSURLSessionTask*) feedsGetWithFeedId: (NSString*) feedId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get feed
[apiInstance feedsGetWithFeedId:feedId
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->feedsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed | 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsList**
```objc
-(NSURLSessionTask*) feedsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List feeds
[apiInstance feedsListWithBookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->feedsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
```objc
-(NSURLSessionTask*) feedsUpdateWithFeedId: (NSString*) feedId
    catalogsFeedsUpdateRequest: (OAICatalogsFeedsUpdateRequest*) catalogsFeedsUpdateRequest
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
OAICatalogsFeedsUpdateRequest* catalogsFeedsUpdateRequest = [[OAICatalogsFeedsUpdateRequest alloc] init]; // Request object used to update a feed.

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Update feed
[apiInstance feedsUpdateWithFeedId:feedId
              catalogsFeedsUpdateRequest:catalogsFeedsUpdateRequest
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->feedsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed | 
 **catalogsFeedsUpdateRequest** | [**OAICatalogsFeedsUpdateRequest***](OAICatalogsFeedsUpdateRequest.md)| Request object used to update a feed. | 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchGet**
```objc
-(NSURLSessionTask*) itemsBatchGetWithBatchId: (NSString*) batchId
        completionHandler: (void (^)(OAICatalogsItemsBatch* output, NSError* error)) handler;
```

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* batchId = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e; // Id of a catalogs items batch to fetch

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get catalogs items batch
[apiInstance itemsBatchGetWithBatchId:batchId
          completionHandler: ^(OAICatalogsItemsBatch* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->itemsBatchGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **NSString***| Id of a catalogs items batch to fetch | 

### Return type

[**OAICatalogsItemsBatch***](OAICatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchPost**
```objc
-(NSURLSessionTask*) itemsBatchPostWithCatalogsItemsBatchRequest: (OAICatalogsItemsBatchRequest*) catalogsItemsBatchRequest
        completionHandler: (void (^)(OAICatalogsItemsBatch* output, NSError* error)) handler;
```

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsItemsBatchRequest* catalogsItemsBatchRequest = [[OAICatalogsItemsBatchRequest alloc] init]; // Request object used to create catalogs items in a batch

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Perform an operation on an item batch
[apiInstance itemsBatchPostWithCatalogsItemsBatchRequest:catalogsItemsBatchRequest
          completionHandler: ^(OAICatalogsItemsBatch* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->itemsBatchPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchRequest** | [**OAICatalogsItemsBatchRequest***](OAICatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch | 

### Return type

[**OAICatalogsItemsBatch***](OAICatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsGet**
```objc
-(NSURLSessionTask*) itemsGetWithCountry: (NSString*) country
    itemIds: (NSArray<NSString*>*) itemIds
    language: (NSString*) language
        completionHandler: (void (^)(OAICatalogsItems* output, NSError* error)) handler;
```

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* country = US; // Country for the Catalogs Items
NSArray<NSString*>* itemIds = CR123; // Catalos Item ids
NSString* language = EN; // Language for the Catalogs Items

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get catalogs items
[apiInstance itemsGetWithCountry:country
              itemIds:itemIds
              language:language
          completionHandler: ^(OAICatalogsItems* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->itemsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **NSString***| Country for the Catalogs Items | 
 **itemIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Catalos Item ids | 
 **language** | **NSString***| Language for the Catalogs Items | 

### Return type

[**OAICatalogsItems***](OAICatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

