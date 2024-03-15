# OAICatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsList**](OAICatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs
[**catalogsProductGroupPinsList**](OAICatalogsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**catalogsProductGroupsCreate**](OAICatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](OAICatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsGet**](OAICatalogsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](OAICatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](OAICatalogsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**catalogsProductGroupsUpdate**](OAICatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](OAICatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](OAICatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](OAICatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](OAICatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](OAICatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](OAICatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](OAICatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**itemsBatchPost**](OAICatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsGet**](OAICatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items
[**itemsIssuesList**](OAICatalogsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**productsByProductGroupFilterList**](OAICatalogsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products


# **catalogsList**
```objc
-(NSURLSessionTask*) catalogsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsList200Response* output, NSError* error)) handler;
```

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List catalogs
[apiInstance catalogsListWithBookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsList200Response***](OAICatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupPinsList**
```objc
-(NSURLSessionTask*) catalogsProductGroupPinsListWithProductGroupId: (NSString*) productGroupId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsProductGroupPinsList200Response* output, NSError* error)) handler;
```

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List products for a Product Group
[apiInstance catalogsProductGroupPinsListWithProductGroupId:productGroupId
              bookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupPinsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupPinsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupPinsList200Response***](OAICatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreate**
```objc
-(NSURLSessionTask*) catalogsProductGroupsCreateWithCatalogsProductGroupsCreateRequest: (OAICatalogsProductGroupsCreateRequest*) catalogsProductGroupsCreateRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsProductGroupsCreate201Response* output, NSError* error)) handler;
```

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsProductGroupsCreateRequest* catalogsProductGroupsCreateRequest = {"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","featured":false,"filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}}; // Request object used to created a catalogs product group.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Create product group
[apiInstance catalogsProductGroupsCreateWithCatalogsProductGroupsCreateRequest:catalogsProductGroupsCreateRequest
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupsCreate201Response* output, NSError* error) {
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
 **catalogsProductGroupsCreateRequest** | [**OAICatalogsProductGroupsCreateRequest***](OAICatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupsCreate201Response***](OAICatalogsProductGroupsCreate201Response.md)

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
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Delete product group
[apiInstance catalogsProductGroupsDeleteWithProductGroupId:productGroupId
              adAccountId:adAccountId
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
        completionHandler: (void (^)(OAICatalogsProductGroupsCreate201Response* output, NSError* error)) handler;
```

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get product group
[apiInstance catalogsProductGroupsGetWithProductGroupId:productGroupId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupsCreate201Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupsCreate201Response***](OAICatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
```objc
-(NSURLSessionTask*) catalogsProductGroupsListWithFeedId: (NSString*) feedId
    catalogId: (NSString*) catalogId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsProductGroupsList200Response* output, NSError* error)) handler;
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
NSString* catalogId = @"catalogId_example"; // Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List product groups
[apiInstance catalogsProductGroupsListWithFeedId:feedId
              catalogId:catalogId
              bookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupsList200Response* output, NSError* error) {
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
 **feedId** | **NSString***| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalogId** | **NSString***| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
        completionHandler: (void (^)(OAICatalogsProductGroupProductCounts* output, NSError* error)) handler;
```

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get product counts for a Product Group
[apiInstance catalogsProductGroupsProductCountsGetWithProductGroupId:productGroupId
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupProductCounts* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsProductGroupsProductCountsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **NSString***| Unique identifier of a product group | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupProductCounts***](OAICatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
```objc
-(NSURLSessionTask*) catalogsProductGroupsUpdateWithProductGroupId: (NSString*) productGroupId
    catalogsProductGroupsUpdateRequest: (OAICatalogsProductGroupsUpdateRequest*) catalogsProductGroupsUpdateRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsProductGroupsCreate201Response* output, NSError* error)) handler;
```

Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productGroupId = @"productGroupId_example"; // Unique identifier of a product group
OAICatalogsProductGroupsUpdateRequest* catalogsProductGroupsUpdateRequest = [[OAICatalogsProductGroupsUpdateRequest alloc] init]; // Request object used to Update a catalogs product group.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Update product group
[apiInstance catalogsProductGroupsUpdateWithProductGroupId:productGroupId
              catalogsProductGroupsUpdateRequest:catalogsProductGroupsUpdateRequest
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupsCreate201Response* output, NSError* error) {
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
 **catalogsProductGroupsUpdateRequest** | [**OAICatalogsProductGroupsUpdateRequest***](OAICatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupsCreate201Response***](OAICatalogsProductGroupsCreate201Response.md)

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
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIFeedProcessingResultsList200Response* output, NSError* error)) handler;
```

List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List processing results for a given feed
[apiInstance feedProcessingResultsListWithFeedId:feedId
              bookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
          completionHandler: ^(OAIFeedProcessingResultsList200Response* output, NSError* error) {
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
-(NSURLSessionTask*) feedsCreateWithFeedsCreateRequest: (OAIFeedsCreateRequest*) feedsCreateRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIFeedsCreateRequest* feedsCreateRequest = [[OAIFeedsCreateRequest alloc] init]; // Request object used to created a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Create feed
[apiInstance feedsCreateWithFeedsCreateRequest:feedsCreateRequest
              adAccountId:adAccountId
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
 **feedsCreateRequest** | [**OAIFeedsCreateRequest***](OAIFeedsCreateRequest.md)| Request object used to created a feed. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Delete feed
[apiInstance feedsDeleteWithFeedId:feedId
              adAccountId:adAccountId
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get feed
[apiInstance feedsGetWithFeedId:feedId
              adAccountId:adAccountId
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
    catalogId: (NSString*) catalogId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIFeedsList200Response* output, NSError* error)) handler;
```

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* catalogId = @"catalogId_example"; // Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List feeds
[apiInstance feedsListWithBookmark:bookmark
              pageSize:pageSize
              catalogId:catalogId
              adAccountId:adAccountId
          completionHandler: ^(OAIFeedsList200Response* output, NSError* error) {
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **catalogId** | **NSString***| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIFeedsList200Response***](OAIFeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
```objc
-(NSURLSessionTask*) feedsUpdateWithFeedId: (NSString*) feedId
    feedsUpdateRequest: (OAIFeedsUpdateRequest*) feedsUpdateRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler;
```

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* feedId = @"feedId_example"; // Unique identifier of a feed
OAIFeedsUpdateRequest* feedsUpdateRequest = [[OAIFeedsUpdateRequest alloc] init]; // Request object used to update a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Update feed
[apiInstance feedsUpdateWithFeedId:feedId
              feedsUpdateRequest:feedsUpdateRequest
              adAccountId:adAccountId
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
 **feedsUpdateRequest** | [**OAIFeedsUpdateRequest***](OAIFeedsUpdateRequest.md)| Request object used to update a feed. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsItemsBatch* output, NSError* error)) handler;
```

Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* batchId = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e; // Id of a catalogs items batch to fetch
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get catalogs item batch status
[apiInstance itemsBatchGetWithBatchId:batchId
              adAccountId:adAccountId
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
-(NSURLSessionTask*) itemsBatchPostWithItemsBatchPostRequest: (OAIItemsBatchPostRequest*) itemsBatchPostRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsItemsBatch* output, NSError* error)) handler;
```

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIItemsBatchPostRequest* itemsBatchPostRequest = [[OAIItemsBatchPostRequest alloc] init]; // Request object used to create catalogs items in a batch
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Operate on item batch
[apiInstance itemsBatchPostWithItemsBatchPostRequest:itemsBatchPostRequest
              adAccountId:adAccountId
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
 **itemsBatchPostRequest** | [**OAIItemsBatchPostRequest***](OAIItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

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
    language: (NSString*) language
    adAccountId: (NSString*) adAccountId
    itemIds: (NSArray<NSString*>*) itemIds
    filters: (OAICatalogsItemsFilters) filters
        completionHandler: (void (^)(OAICatalogsItems* output, NSError* error)) handler;
```

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* country = US; // Country for the Catalogs Items
NSString* language = EN; // Language for the Catalogs Items
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSArray<NSString*>* itemIds = ["CR123"]; // This parameter is deprecated. Use filters instead. (optional)
OAICatalogsItemsFilters filters = [[OAICatalogsItemsFilters alloc] init]; // Identifies items to be retrieved. This is a required parameter. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Get catalogs items
[apiInstance itemsGetWithCountry:country
              language:language
              adAccountId:adAccountId
              itemIds:itemIds
              filters:filters
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
 **language** | **NSString***| Language for the Catalogs Items | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **itemIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| This parameter is deprecated. Use filters instead. | [optional] 
 **filters** | [**OAICatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional] 

### Return type

[**OAICatalogsItems***](OAICatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsIssuesList**
```objc
-(NSURLSessionTask*) itemsIssuesListWithProcessingResultId: (NSString*) processingResultId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    itemNumbers: (NSArray<NSNumber*>*) itemNumbers
    itemValidationIssue: (OAICatalogsItemValidationIssue) itemValidationIssue
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIItemsIssuesList200Response* output, NSError* error)) handler;
```

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* processingResultId = 5224831246441439241; // Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSArray<NSNumber*>* itemNumbers = [1,5]; // Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional)
OAICatalogsItemValidationIssue itemValidationIssue = TITLE_MISSING; // Filter item validation issues that have a given type of item validation issue. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List item issues for a given processing result
[apiInstance itemsIssuesListWithProcessingResultId:processingResultId
              bookmark:bookmark
              pageSize:pageSize
              itemNumbers:itemNumbers
              itemValidationIssue:itemValidationIssue
              adAccountId:adAccountId
          completionHandler: ^(OAIItemsIssuesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->itemsIssuesList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processingResultId** | **NSString***| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **itemNumbers** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **itemValidationIssue** | [**OAICatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIItemsIssuesList200Response***](OAIItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productsByProductGroupFilterList**
```objc
-(NSURLSessionTask*) productsByProductGroupFilterListWithCatalogsListProductsByFilterRequest: (OAICatalogsListProductsByFilterRequest*) catalogsListProductsByFilterRequest
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsProductGroupPinsList200Response* output, NSError* error)) handler;
```

List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsListProductsByFilterRequest* catalogsListProductsByFilterRequest = [[OAICatalogsListProductsByFilterRequest alloc] init]; // Object holding a group of filters for a catalog product group
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List filtered products
[apiInstance productsByProductGroupFilterListWithCatalogsListProductsByFilterRequest:catalogsListProductsByFilterRequest
              bookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsProductGroupPinsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->productsByProductGroupFilterList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**OAICatalogsListProductsByFilterRequest***](OAICatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsProductGroupPinsList200Response***](OAICatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

