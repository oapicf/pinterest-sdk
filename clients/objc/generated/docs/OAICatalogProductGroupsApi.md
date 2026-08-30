# OAICatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](OAICatalogProductGroupsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](OAICatalogProductGroupsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](OAICatalogProductGroupsApi.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](OAICatalogProductGroupsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](OAICatalogProductGroupsApi.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](OAICatalogProductGroupsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](OAICatalogProductGroupsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](OAICatalogProductGroupsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](OAICatalogProductGroupsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](OAICatalogProductGroupsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **catalogsProductGroupPinsList**
```objc
-(NSURLSessionTask*) catalogsProductGroupPinsListWithProductGroupId: (NSString*) productGroupId
    adAccountId: (NSString*) adAccountId
    pinMetrics: (NSNumber*) pinMetrics
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAICatalogsProductGroupPinsList200Response* output, NSError* error)) handler;
```

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// List products by product group
[apiInstance catalogsProductGroupPinsListWithProductGroupId:productGroupId
              adAccountId:adAccountId
              pinMetrics:pinMetrics
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAICatalogsProductGroupPinsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupPinsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAICatalogsProductGroupPinsList200Response***](OAICatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreate**
```objc
-(NSURLSessionTask*) catalogsProductGroupsCreateWithCatalogsProductGroupsCreateRequestSchema: (OAICatalogsProductGroupsCreateRequestSchema*) catalogsProductGroupsCreateRequestSchema
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsVerticalProductGroup* output, NSError* error)) handler;
```

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsProductGroupsCreateRequestSchema* catalogsProductGroupsCreateRequestSchema = [[OAICatalogsProductGroupsCreateRequestSchema alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Create product group
[apiInstance catalogsProductGroupsCreateWithCatalogsProductGroupsCreateRequestSchema:catalogsProductGroupsCreateRequestSchema
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsVerticalProductGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequestSchema** | [**OAICatalogsProductGroupsCreateRequestSchema***](OAICatalogsProductGroupsCreateRequestSchema.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsVerticalProductGroup***](OAICatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreateMany**
```objc
-(NSURLSessionTask*) catalogsProductGroupsCreateManyWithCatalogsProductGroupsCreateManyRequestItems: (NSArray<OAICatalogsProductGroupsCreateManyRequestItems>*) catalogsProductGroupsCreateManyRequestItems
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSArray<NSString*>* output, NSError* error)) handler;
```

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSArray<OAICatalogsProductGroupsCreateManyRequestItems>* catalogsProductGroupsCreateManyRequestItems = @[[[OAICatalogsProductGroupsCreateManyRequestItems alloc] init]]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Create product groups
[apiInstance catalogsProductGroupsCreateManyWithCatalogsProductGroupsCreateManyRequestItems:catalogsProductGroupsCreateManyRequestItems
              adAccountId:adAccountId
          completionHandler: ^(NSArray<NSString*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsCreateMany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateManyRequestItems** | [**NSArray&lt;OAICatalogsProductGroupsCreateManyRequestItems&gt;***](OAICatalogsProductGroupsCreateManyRequestItems.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

**NSArray<NSString*>***

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDelete**
```objc
-(NSURLSessionTask*) catalogsProductGroupsDeleteWithProductGroupId: (NSString*) productGroupId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsVerticalProductGroup* output, NSError* error)) handler;
```

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Delete product group
[apiInstance catalogsProductGroupsDeleteWithProductGroupId:productGroupId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsVerticalProductGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsVerticalProductGroup***](OAICatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDeleteMany**
```objc
-(NSURLSessionTask*) catalogsProductGroupsDeleteManyWithId: (NSArray<NSNumber*>*) _id
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSArray<NSNumber*>* _id = @[@56]; // Comma-separated list of product group ids
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Delete product groups
[apiInstance catalogsProductGroupsDeleteManyWithId:_id
              adAccountId:adAccountId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsDeleteMany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| Comma-separated list of product group ids | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsGet**
```objc
-(NSURLSessionTask*) catalogsProductGroupsGetWithProductGroupId: (NSString*) productGroupId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsVerticalProductGroup* output, NSError* error)) handler;
```

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Get product group
[apiInstance catalogsProductGroupsGetWithProductGroupId:productGroupId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsVerticalProductGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsVerticalProductGroup***](OAICatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
```objc
-(NSURLSessionTask*) catalogsProductGroupsListWithId: (NSArray<NSNumber*>*) _id
    feedId: (NSString*) feedId
    catalogId: (NSString*) catalogId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAICatalogsProductGroupsList200Response* output, NSError* error)) handler;
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSArray<NSNumber*>* _id = @[@56]; // Comma-separated list of product group ids (optional)
NSString* feedId = @"feedId_example"; // Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
NSString* catalogId = @"catalogId_example"; // Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// List product groups
[apiInstance catalogsProductGroupsListWithId:_id
              feedId:feedId
              catalogId:catalogId
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAICatalogsProductGroupsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| Comma-separated list of product group ids | [optional] 
 **feedId** | **NSString***| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalogId** | **NSString***| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAICatalogsProductGroupsList200Response***](OAICatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsProductCountsGet**
```objc
-(NSURLSessionTask*) catalogsProductGroupsProductCountsGetWithProductGroupId: (NSString*) productGroupId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsProductGroupProductCountsVertical* output, NSError* error)) handler;
```

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Get product counts
[apiInstance catalogsProductGroupsProductCountsGetWithProductGroupId:productGroupId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupProductCountsVertical* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsProductCountsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupProductCountsVertical***](OAICatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
```objc
-(NSURLSessionTask*) catalogsProductGroupsUpdateWithProductGroupId: (NSString*) productGroupId
    catalogsProductGroupsUpdateRequestSchema: (OAICatalogsProductGroupsUpdateRequestSchema*) catalogsProductGroupsUpdateRequestSchema
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsVerticalProductGroup* output, NSError* error)) handler;
```

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
OAICatalogsProductGroupsUpdateRequestSchema* catalogsProductGroupsUpdateRequestSchema = [[OAICatalogsProductGroupsUpdateRequestSchema alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// Update single product group
[apiInstance catalogsProductGroupsUpdateWithProductGroupId:productGroupId
              catalogsProductGroupsUpdateRequestSchema:catalogsProductGroupsUpdateRequestSchema
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsVerticalProductGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->catalogsProductGroupsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **catalogsProductGroupsUpdateRequestSchema** | [**OAICatalogsProductGroupsUpdateRequestSchema***](OAICatalogsProductGroupsUpdateRequestSchema.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsVerticalProductGroup***](OAICatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productsByProductGroupFilterList**
```objc
-(NSURLSessionTask*) productsByProductGroupFilterListWithCatalogsListProductsByFilterRequest: (OAICatalogsListProductsByFilterRequest*) catalogsListProductsByFilterRequest
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    adAccountId: (NSString*) adAccountId
    pinMetrics: (NSNumber*) pinMetrics
        completionHandler: (void (^)(OAICatalogsProductGroupPinsList200Response* output, NSError* error)) handler;
```

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsListProductsByFilterRequest* catalogsListProductsByFilterRequest = [[OAICatalogsListProductsByFilterRequest alloc] init]; // 
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))

OAICatalogProductGroupsApi*apiInstance = [[OAICatalogProductGroupsApi alloc] init];

// List products by filter
[apiInstance productsByProductGroupFilterListWithCatalogsListProductsByFilterRequest:catalogsListProductsByFilterRequest
              bookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
              pinMetrics:pinMetrics
          completionHandler: ^(OAICatalogsProductGroupPinsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogProductGroupsApi->productsByProductGroupFilterList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**OAICatalogsListProductsByFilterRequest***](OAICatalogsListProductsByFilterRequest.md)|  | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]

### Return type

[**OAICatalogsProductGroupPinsList200Response***](OAICatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

