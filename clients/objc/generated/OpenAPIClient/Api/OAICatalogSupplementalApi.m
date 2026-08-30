#import "OAICatalogSupplementalApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICatalogsLocalStoresCreate200ResponseInner.h"
#import "OAICatalogsLocalStoresDelete200ResponseInner.h"
#import "OAICatalogsLocalStoresList200Response.h"
#import "OAILocalInventoryItemsBatch.h"
#import "OAILocalInventoryItemsBatchCreate.h"
#import "OAILocalInventoryItemsGet.h"
#import "OAILocalInventoryItemsGetCreate.h"
#import "OAILocalStore.h"
#import "OAILocalStoreBatchUpdate.h"
#import "OAILocalStoreCreate.h"
#import "OAIPinterestLibError.h"
#import "OAISupplementalItemsBatchResponse.h"


@interface OAICatalogSupplementalApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAICatalogSupplementalApi

NSString* kOAICatalogSupplementalApiErrorDomain = @"OAICatalogSupplementalApiErrorDomain";
NSInteger kOAICatalogSupplementalApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Operate on local inventory item batch
/// Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param localInventoryItemsBatchCreate  
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAISupplementalItemsBatchResponse*
///
-(NSURLSessionTask*) catalogsLocalInventoryItemsBatchOperateWithCatalogId: (NSString*) catalogId
    localInventoryItemsBatchCreate: (OAILocalInventoryItemsBatchCreate*) localInventoryItemsBatchCreate
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAISupplementalItemsBatchResponse* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'localInventoryItemsBatchCreate' is set
    if (localInventoryItemsBatchCreate == nil) {
        NSParameterAssert(localInventoryItemsBatchCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"localInventoryItemsBatchCreate"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/local_inventory_items/batch"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = localInventoryItemsBatchCreate;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAISupplementalItemsBatchResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISupplementalItemsBatchResponse*)data, error);
                                }
                            }];
}

///
/// Get local inventory items (POST)
/// Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param localInventoryItemsGetCreate  
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAILocalInventoryItemsGet*
///
-(NSURLSessionTask*) catalogsLocalInventoryItemsPostWithCatalogId: (NSString*) catalogId
    localInventoryItemsGetCreate: (OAILocalInventoryItemsGetCreate*) localInventoryItemsGetCreate
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAILocalInventoryItemsGet* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'localInventoryItemsGetCreate' is set
    if (localInventoryItemsGetCreate == nil) {
        NSParameterAssert(localInventoryItemsGetCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"localInventoryItemsGetCreate"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/local_inventory_items/query"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = localInventoryItemsGetCreate;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAILocalInventoryItemsGet*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAILocalInventoryItemsGet*)data, error);
                                }
                            }];
}

///
/// Create local stores
/// Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param localStoreCreate  
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns NSArray<OAICatalogsLocalStoresCreate200ResponseInner>*
///
-(NSURLSessionTask*) catalogsLocalStoresCreateWithCatalogId: (NSString*) catalogId
    localStoreCreate: (NSArray<OAILocalStoreCreate>*) localStoreCreate
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSArray<OAICatalogsLocalStoresCreate200ResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'localStoreCreate' is set
    if (localStoreCreate == nil) {
        NSParameterAssert(localStoreCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"localStoreCreate"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/local_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = localStoreCreate;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<OAICatalogsLocalStoresCreate200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICatalogsLocalStoresCreate200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// Delete local stores
///   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param ids List of local store IDs to filter by. 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns NSArray<OAICatalogsLocalStoresDelete200ResponseInner>*
///
-(NSURLSessionTask*) catalogsLocalStoresDeleteWithCatalogId: (NSString*) catalogId
    ids: (NSArray<NSString*>*) ids
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSArray<OAICatalogsLocalStoresDelete200ResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'ids' is set
    if (ids == nil) {
        NSParameterAssert(ids);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ids"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/local_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (ids != nil) {
        queryParams[@"ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: ids format: @"csv"];
    }
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<OAICatalogsLocalStoresDelete200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICatalogsLocalStoresDelete200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// List local stores
/// Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param ids List of local store IDs to filter by. (optional)
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAICatalogsLocalStoresList200Response*
///
-(NSURLSessionTask*) catalogsLocalStoresListWithCatalogId: (NSString*) catalogId
    ids: (NSArray<NSString*>*) ids
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAICatalogsLocalStoresList200Response* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/local_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (ids != nil) {
        queryParams[@"ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: ids format: @"csv"];
    }
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICatalogsLocalStoresList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsLocalStoresList200Response*)data, error);
                                }
                            }];
}

///
/// Update local stores
///   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param localStoreBatchUpdate  
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns NSArray<OAICatalogsLocalStoresCreate200ResponseInner>*
///
-(NSURLSessionTask*) catalogsLocalStoresUpdateWithCatalogId: (NSString*) catalogId
    localStoreBatchUpdate: (NSArray<OAILocalStoreBatchUpdate>*) localStoreBatchUpdate
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSArray<OAICatalogsLocalStoresCreate200ResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'localStoreBatchUpdate' is set
    if (localStoreBatchUpdate == nil) {
        NSParameterAssert(localStoreBatchUpdate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"localStoreBatchUpdate"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/local_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = localStoreBatchUpdate;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PATCH"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<OAICatalogsLocalStoresCreate200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICatalogsLocalStoresCreate200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// Get supplemental items batch status
/// Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
///  @param catalogId Unique identifier of a catalog. 
///
///  @param batchId Unique identifier of an items batch operation. 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAISupplementalItemsBatchResponse*
///
-(NSURLSessionTask*) catalogsSupplementalItemsBatchGetWithCatalogId: (NSString*) catalogId
    batchId: (NSString*) batchId
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAISupplementalItemsBatchResponse* output, NSError* error)) handler {
    // verify the required parameter 'catalogId' is set
    if (catalogId == nil) {
        NSParameterAssert(catalogId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'batchId' is set
    if (batchId == nil) {
        NSParameterAssert(batchId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"batchId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogSupplementalApiErrorDomain code:kOAICatalogSupplementalApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (catalogId != nil) {
        pathParams[@"catalog_id"] = catalogId;
    }
    if (batchId != nil) {
        pathParams[@"batch_id"] = batchId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAISupplementalItemsBatchResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISupplementalItemsBatchResponse*)data, error);
                                }
                            }];
}



@end
