#import "OAICatalogsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICatalogsFeed.h"
#import "OAICatalogsFeedsCreateRequest.h"
#import "OAICatalogsFeedsUpdateRequest.h"
#import "OAICatalogsItems.h"
#import "OAICatalogsItemsBatch.h"
#import "OAICatalogsItemsBatchRequest.h"
#import "OAICatalogsProductGroup.h"
#import "OAICatalogsProductGroupCreateRequest.h"
#import "OAICatalogsProductGroupUpdateRequest.h"
#import "OAIError.h"
#import "OAIPaginated.h"


@interface OAICatalogsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAICatalogsApi

NSString* kOAICatalogsApiErrorDomain = @"OAICatalogsApiErrorDomain";
NSInteger kOAICatalogsApiMissingParamErrorCode = 234513;

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
/// Create product group
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.
///  @param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. 
///
///  @returns NSObject*
///
-(NSURLSessionTask*) catalogsProductGroupsCreateWithCatalogsProductGroupCreateRequest: (OAICatalogsProductGroupCreateRequest*) catalogsProductGroupCreateRequest
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler {
    // verify the required parameter 'catalogsProductGroupCreateRequest' is set
    if (catalogsProductGroupCreateRequest == nil) {
        NSParameterAssert(catalogsProductGroupCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogsProductGroupCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/product_groups"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
    bodyParam = catalogsProductGroupCreateRequest;

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
                              responseType: @"NSObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSObject*)data, error);
                                }
                            }];
}

///
/// Delete product group
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
///  @param productGroupId Unique identifier of a product group 
///
///  @returns void
///
-(NSURLSessionTask*) catalogsProductGroupsDeleteWithProductGroupId: (NSString*) productGroupId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'productGroupId' is set
    if (productGroupId == nil) {
        NSParameterAssert(productGroupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/product_groups/{product_group_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (productGroupId != nil) {
        pathParams[@"product_group_id"] = productGroupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Get product groups list
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
///  @param feedId Unique identifier of a feed 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) catalogsProductGroupsListWithFeedId: (NSString*) feedId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'feedId' is set
    if (feedId == nil) {
        NSParameterAssert(feedId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"feedId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/product_groups"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (feedId != nil) {
        queryParams[@"feed_id"] = feedId;
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
                              responseType: @"OAIPaginated*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPaginated*)data, error);
                                }
                            }];
}

///
/// Update product group
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.
///  @param productGroupId Unique identifier of a product group 
///
///  @param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group. 
///
///  @returns OAICatalogsProductGroup*
///
-(NSURLSessionTask*) catalogsProductGroupsUpdateWithProductGroupId: (NSString*) productGroupId
    catalogsProductGroupUpdateRequest: (OAICatalogsProductGroupUpdateRequest*) catalogsProductGroupUpdateRequest
    completionHandler: (void (^)(OAICatalogsProductGroup* output, NSError* error)) handler {
    // verify the required parameter 'productGroupId' is set
    if (productGroupId == nil) {
        NSParameterAssert(productGroupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'catalogsProductGroupUpdateRequest' is set
    if (catalogsProductGroupUpdateRequest == nil) {
        NSParameterAssert(catalogsProductGroupUpdateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogsProductGroupUpdateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/product_groups/{product_group_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (productGroupId != nil) {
        pathParams[@"product_group_id"] = productGroupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
    bodyParam = catalogsProductGroupUpdateRequest;

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
                              responseType: @"OAICatalogsProductGroup*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsProductGroup*)data, error);
                                }
                            }];
}

///
/// List processing results for a given feed
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.
///  @param feedId Unique identifier of a feed 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) feedProcessingResultsListWithFeedId: (NSString*) feedId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'feedId' is set
    if (feedId == nil) {
        NSParameterAssert(feedId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"feedId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/feeds/{feed_id}/processing_results"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (feedId != nil) {
        pathParams[@"feed_id"] = feedId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIPaginated*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPaginated*)data, error);
                                }
                            }];
}

///
/// Create feed
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
///  @param catalogsFeedsCreateRequest Request object used to created a feed. 
///
///  @returns OAICatalogsFeed*
///
-(NSURLSessionTask*) feedsCreateWithCatalogsFeedsCreateRequest: (OAICatalogsFeedsCreateRequest*) catalogsFeedsCreateRequest
    completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler {
    // verify the required parameter 'catalogsFeedsCreateRequest' is set
    if (catalogsFeedsCreateRequest == nil) {
        NSParameterAssert(catalogsFeedsCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogsFeedsCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/feeds"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
    bodyParam = catalogsFeedsCreateRequest;

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
                              responseType: @"OAICatalogsFeed*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsFeed*)data, error);
                                }
                            }];
}

///
/// Delete feed
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
///  @param feedId Unique identifier of a feed 
///
///  @returns void
///
-(NSURLSessionTask*) feedsDeleteWithFeedId: (NSString*) feedId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'feedId' is set
    if (feedId == nil) {
        NSParameterAssert(feedId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"feedId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/feeds/{feed_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (feedId != nil) {
        pathParams[@"feed_id"] = feedId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Get feed
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
///  @param feedId Unique identifier of a feed 
///
///  @returns OAICatalogsFeed*
///
-(NSURLSessionTask*) feedsGetWithFeedId: (NSString*) feedId
    completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler {
    // verify the required parameter 'feedId' is set
    if (feedId == nil) {
        NSParameterAssert(feedId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"feedId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/feeds/{feed_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (feedId != nil) {
        pathParams[@"feed_id"] = feedId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAICatalogsFeed*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsFeed*)data, error);
                                }
                            }];
}

///
/// List feeds
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) feedsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/feeds"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIPaginated*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPaginated*)data, error);
                                }
                            }];
}

///
/// Update feed
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
///  @param feedId Unique identifier of a feed 
///
///  @param catalogsFeedsUpdateRequest Request object used to update a feed. 
///
///  @returns OAICatalogsFeed*
///
-(NSURLSessionTask*) feedsUpdateWithFeedId: (NSString*) feedId
    catalogsFeedsUpdateRequest: (OAICatalogsFeedsUpdateRequest*) catalogsFeedsUpdateRequest
    completionHandler: (void (^)(OAICatalogsFeed* output, NSError* error)) handler {
    // verify the required parameter 'feedId' is set
    if (feedId == nil) {
        NSParameterAssert(feedId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"feedId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'catalogsFeedsUpdateRequest' is set
    if (catalogsFeedsUpdateRequest == nil) {
        NSParameterAssert(catalogsFeedsUpdateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogsFeedsUpdateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/feeds/{feed_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (feedId != nil) {
        pathParams[@"feed_id"] = feedId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
    bodyParam = catalogsFeedsUpdateRequest;

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
                              responseType: @"OAICatalogsFeed*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsFeed*)data, error);
                                }
                            }];
}

///
/// Get catalogs items batch
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".
///  @param batchId Id of a catalogs items batch to fetch 
///
///  @returns OAICatalogsItemsBatch*
///
-(NSURLSessionTask*) itemsBatchGetWithBatchId: (NSString*) batchId
    completionHandler: (void (^)(OAICatalogsItemsBatch* output, NSError* error)) handler {
    // verify the required parameter 'batchId' is set
    if (batchId == nil) {
        NSParameterAssert(batchId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"batchId"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/items/batch/{batch_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (batchId != nil) {
        pathParams[@"batch_id"] = batchId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAICatalogsItemsBatch*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsItemsBatch*)data, error);
                                }
                            }];
}

///
/// Perform an operation on an item batch
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.
///  @param catalogsItemsBatchRequest Request object used to create catalogs items in a batch 
///
///  @returns OAICatalogsItemsBatch*
///
-(NSURLSessionTask*) itemsBatchPostWithCatalogsItemsBatchRequest: (OAICatalogsItemsBatchRequest*) catalogsItemsBatchRequest
    completionHandler: (void (^)(OAICatalogsItemsBatch* output, NSError* error)) handler {
    // verify the required parameter 'catalogsItemsBatchRequest' is set
    if (catalogsItemsBatchRequest == nil) {
        NSParameterAssert(catalogsItemsBatchRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"catalogsItemsBatchRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/items/batch"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
    bodyParam = catalogsItemsBatchRequest;

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
                              responseType: @"OAICatalogsItemsBatch*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsItemsBatch*)data, error);
                                }
                            }];
}

///
/// Get catalogs items
/// Get the items of the catalog created by the \"operating user_account\"
///  @param country Country for the Catalogs Items 
///
///  @param itemIds Catalos Item ids 
///
///  @param language Language for the Catalogs Items 
///
///  @returns OAICatalogsItems*
///
-(NSURLSessionTask*) itemsGetWithCountry: (NSString*) country
    itemIds: (NSArray<NSString*>*) itemIds
    language: (NSString*) language
    completionHandler: (void (^)(OAICatalogsItems* output, NSError* error)) handler {
    // verify the required parameter 'country' is set
    if (country == nil) {
        NSParameterAssert(country);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"country"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'itemIds' is set
    if (itemIds == nil) {
        NSParameterAssert(itemIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"itemIds"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'language' is set
    if (language == nil) {
        NSParameterAssert(language);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"language"] };
            NSError* error = [NSError errorWithDomain:kOAICatalogsApiErrorDomain code:kOAICatalogsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/catalogs/items"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (country != nil) {
        queryParams[@"country"] = country;
    }
    if (itemIds != nil) {
        queryParams[@"item_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: itemIds format: @"multi"];
    }
    if (language != nil) {
        queryParams[@"language"] = language;
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
                              responseType: @"OAICatalogsItems*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICatalogsItems*)data, error);
                                }
                            }];
}



@end
