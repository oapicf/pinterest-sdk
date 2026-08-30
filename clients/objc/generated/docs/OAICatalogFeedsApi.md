# OAICatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feedProcessingResultsList**](OAICatalogFeedsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**feedsCreate**](OAICatalogFeedsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](OAICatalogFeedsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](OAICatalogFeedsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsIngest**](OAICatalogFeedsApi.md#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**feedsList**](OAICatalogFeedsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](OAICatalogFeedsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsIssuesList**](OAICatalogFeedsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues


# **feedProcessingResultsList**
```objc
-(NSURLSessionTask*) feedProcessingResultsListWithFeedId: (NSString*) feedId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIFeedProcessingResultsList200Response* output, NSError* error)) handler;
```

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// List feed processing results
[apiInstance feedProcessingResultsListWithFeedId:feedId
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIFeedProcessingResultsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedProcessingResultsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIFeedProcessingResultsList200Response***](OAIFeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsCreate**
```objc
-(NSURLSessionTask*) feedsCreateWithCatalogsFeedCreateRequestSchema: (OAICatalogsFeedCreateRequestSchema*) catalogsFeedCreateRequestSchema
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsFeedCreateRequestSchema* catalogsFeedCreateRequestSchema = [[OAICatalogsFeedCreateRequestSchema alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// Create feed
[apiInstance feedsCreateWithCatalogsFeedCreateRequestSchema:catalogsFeedCreateRequestSchema
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedCreateRequestSchema** | [**OAICatalogsFeedCreateRequestSchema***](OAICatalogsFeedCreateRequestSchema.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsDelete**
```objc
-(NSURLSessionTask*) feedsDeleteWithFeedId: (NSString*) feedId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Delete feed

Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// Delete feed
[apiInstance feedsDeleteWithFeedId:feedId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsGet**
```objc
-(NSURLSessionTask*) feedsGetWithFeedId: (NSString*) feedId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// Get feed
[apiInstance feedsGetWithFeedId:feedId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsIngest**
```objc
-(NSURLSessionTask*) feedsIngestWithFeedId: (NSString*) feedId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeedIngestion* output, NSError* error)) handler;
```

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// Ingest feed items
[apiInstance feedsIngestWithFeedId:feedId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsFeedIngestion* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedsIngest: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsFeedIngestion***](OAICatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsList**
```objc
-(NSURLSessionTask*) feedsListWithCatalogId: (NSString*) catalogId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIFeedsList200Response* output, NSError* error)) handler;
```

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// List feeds
[apiInstance feedsListWithCatalogId:catalogId
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIFeedsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIFeedsList200Response***](OAIFeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
```objc
-(NSURLSessionTask*) feedsUpdateWithFeedId: (NSString*) feedId
    catalogsFeedUpdateRequestSchema: (OAICatalogsFeedUpdateRequestSchema*) catalogsFeedUpdateRequestSchema
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed.
OAICatalogsFeedUpdateRequestSchema* catalogsFeedUpdateRequestSchema = [[OAICatalogsFeedUpdateRequestSchema alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// Update feed
[apiInstance feedsUpdateWithFeedId:feedId
              catalogsFeedUpdateRequestSchema:catalogsFeedUpdateRequestSchema
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsFeed* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->feedsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **NSString***| Unique identifier of a feed. | 
 **catalogsFeedUpdateRequestSchema** | [**OAICatalogsFeedUpdateRequestSchema***](OAICatalogsFeedUpdateRequestSchema.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsFeed***](OAICatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsIssuesList**
```objc
-(NSURLSessionTask*) itemsIssuesListWithProcessingResultId: (NSString*) processingResultId
    itemNumbers: (NSArray<NSNumber*>*) itemNumbers
    itemValidationIssue: (OAICatalogsItemValidationIssue) itemValidationIssue
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIItemsIssuesList200Response* output, NSError* error)) handler;
```

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* processingResultId = @"processingResultId_example"; // Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
NSArray<NSNumber*>* itemNumbers = @[@56]; // Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional)
OAICatalogsItemValidationIssue itemValidationIssue = [[OAICatalogsItemValidationIssue alloc] init]; // Filter item validation issues that have a given type of item validation issue. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogFeedsApi*apiInstance = [[OAICatalogFeedsApi alloc] init];

// List item issues
[apiInstance itemsIssuesListWithProcessingResultId:processingResultId
              itemNumbers:itemNumbers
              itemValidationIssue:itemValidationIssue
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIItemsIssuesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogFeedsApi->itemsIssuesList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processingResultId** | **NSString***| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | 
 **itemNumbers** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **itemValidationIssue** | [**OAICatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIItemsIssuesList200Response***](OAIItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

