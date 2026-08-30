# OAICatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](OAICatalogSupplementalApi.md#catalogslocalinventoryitemsbatchoperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](OAICatalogSupplementalApi.md#catalogslocalinventoryitemspost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](OAICatalogSupplementalApi.md#catalogslocalstorescreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](OAICatalogSupplementalApi.md#catalogslocalstoresdelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](OAICatalogSupplementalApi.md#catalogslocalstoreslist) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](OAICatalogSupplementalApi.md#catalogslocalstoresupdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](OAICatalogSupplementalApi.md#catalogssupplementalitemsbatchget) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogsLocalInventoryItemsBatchOperate**
```objc
-(NSURLSessionTask*) catalogsLocalInventoryItemsBatchOperateWithCatalogId: (NSString*) catalogId
    localInventoryItemsBatchCreate: (OAILocalInventoryItemsBatchCreate*) localInventoryItemsBatchCreate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAISupplementalItemsBatchResponse* output, NSError* error)) handler;
```

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
OAILocalInventoryItemsBatchCreate* localInventoryItemsBatchCreate = [[OAILocalInventoryItemsBatchCreate alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// Operate on local inventory item batch
[apiInstance catalogsLocalInventoryItemsBatchOperateWithCatalogId:catalogId
              localInventoryItemsBatchCreate:localInventoryItemsBatchCreate
              adAccountId:adAccountId
          completionHandler: ^(OAISupplementalItemsBatchResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsLocalInventoryItemsBatchOperate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **localInventoryItemsBatchCreate** | [**OAILocalInventoryItemsBatchCreate***](OAILocalInventoryItemsBatchCreate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAISupplementalItemsBatchResponse***](OAISupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalInventoryItemsPost**
```objc
-(NSURLSessionTask*) catalogsLocalInventoryItemsPostWithCatalogId: (NSString*) catalogId
    localInventoryItemsGetCreate: (OAILocalInventoryItemsGetCreate*) localInventoryItemsGetCreate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAILocalInventoryItemsGet* output, NSError* error)) handler;
```

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
OAILocalInventoryItemsGetCreate* localInventoryItemsGetCreate = [[OAILocalInventoryItemsGetCreate alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// Get local inventory items (POST)
[apiInstance catalogsLocalInventoryItemsPostWithCatalogId:catalogId
              localInventoryItemsGetCreate:localInventoryItemsGetCreate
              adAccountId:adAccountId
          completionHandler: ^(OAILocalInventoryItemsGet* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsLocalInventoryItemsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **localInventoryItemsGetCreate** | [**OAILocalInventoryItemsGetCreate***](OAILocalInventoryItemsGetCreate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAILocalInventoryItemsGet***](OAILocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresCreate**
```objc
-(NSURLSessionTask*) catalogsLocalStoresCreateWithCatalogId: (NSString*) catalogId
    localStoreCreate: (NSArray<OAILocalStoreCreate>*) localStoreCreate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSArray<OAICatalogsLocalStoresCreate200ResponseInner>* output, NSError* error)) handler;
```

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
NSArray<OAILocalStoreCreate>* localStoreCreate = @[[[OAILocalStoreCreate alloc] init]]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// Create local stores
[apiInstance catalogsLocalStoresCreateWithCatalogId:catalogId
              localStoreCreate:localStoreCreate
              adAccountId:adAccountId
          completionHandler: ^(NSArray<OAICatalogsLocalStoresCreate200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsLocalStoresCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **localStoreCreate** | [**NSArray&lt;OAILocalStoreCreate&gt;***](OAILocalStoreCreate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSArray<OAICatalogsLocalStoresCreate200ResponseInner>***](OAICatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresDelete**
```objc
-(NSURLSessionTask*) catalogsLocalStoresDeleteWithCatalogId: (NSString*) catalogId
    ids: (NSArray<NSString*>*) ids
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSArray<OAICatalogsLocalStoresDelete200ResponseInner>* output, NSError* error)) handler;
```

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
NSArray<NSString*>* ids = @[@"ids_example"]; // List of local store IDs to filter by.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// Delete local stores
[apiInstance catalogsLocalStoresDeleteWithCatalogId:catalogId
              ids:ids
              adAccountId:adAccountId
          completionHandler: ^(NSArray<OAICatalogsLocalStoresDelete200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsLocalStoresDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **ids** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of local store IDs to filter by. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSArray<OAICatalogsLocalStoresDelete200ResponseInner>***](OAICatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresList**
```objc
-(NSURLSessionTask*) catalogsLocalStoresListWithCatalogId: (NSString*) catalogId
    ids: (NSArray<NSString*>*) ids
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAICatalogsLocalStoresList200Response* output, NSError* error)) handler;
```

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
NSArray<NSString*>* ids = @[@"ids_example"]; // List of local store IDs to filter by. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// List local stores
[apiInstance catalogsLocalStoresListWithCatalogId:catalogId
              ids:ids
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAICatalogsLocalStoresList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsLocalStoresList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **ids** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of local store IDs to filter by. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAICatalogsLocalStoresList200Response***](OAICatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresUpdate**
```objc
-(NSURLSessionTask*) catalogsLocalStoresUpdateWithCatalogId: (NSString*) catalogId
    localStoreBatchUpdate: (NSArray<OAILocalStoreBatchUpdate>*) localStoreBatchUpdate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSArray<OAICatalogsLocalStoresCreate200ResponseInner>* output, NSError* error)) handler;
```

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
NSArray<OAILocalStoreBatchUpdate>* localStoreBatchUpdate = @[[[OAILocalStoreBatchUpdate alloc] init]]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// Update local stores
[apiInstance catalogsLocalStoresUpdateWithCatalogId:catalogId
              localStoreBatchUpdate:localStoreBatchUpdate
              adAccountId:adAccountId
          completionHandler: ^(NSArray<OAICatalogsLocalStoresCreate200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsLocalStoresUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **localStoreBatchUpdate** | [**NSArray&lt;OAILocalStoreBatchUpdate&gt;***](OAILocalStoreBatchUpdate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**NSArray<OAICatalogsLocalStoresCreate200ResponseInner>***](OAICatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsSupplementalItemsBatchGet**
```objc
-(NSURLSessionTask*) catalogsSupplementalItemsBatchGetWithCatalogId: (NSString*) catalogId
    batchId: (NSString*) batchId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAISupplementalItemsBatchResponse* output, NSError* error)) handler;
```

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Unique identifier of a catalog.
NSString* batchId = @"batchId_example"; // Unique identifier of an items batch operation.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogSupplementalApi*apiInstance = [[OAICatalogSupplementalApi alloc] init];

// Get supplemental items batch status
[apiInstance catalogsSupplementalItemsBatchGetWithCatalogId:catalogId
              batchId:batchId
              adAccountId:adAccountId
          completionHandler: ^(OAISupplementalItemsBatchResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogSupplementalApi->catalogsSupplementalItemsBatchGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Unique identifier of a catalog. | 
 **batchId** | **NSString***| Unique identifier of an items batch operation. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAISupplementalItemsBatchResponse***](OAISupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

