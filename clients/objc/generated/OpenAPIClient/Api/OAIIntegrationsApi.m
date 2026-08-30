#import "OAIIntegrationsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIIntegrationLogsInvalidLogResponse.h"
#import "OAIIntegrationLogsRequestCreate.h"
#import "OAIIntegrationLogsSuccessResponse.h"
#import "OAIIntegrationMetadata.h"
#import "OAIIntegrationMetadataCreate.h"
#import "OAIIntegrationMetadataUpdate.h"
#import "OAIIntegrationRecord.h"
#import "OAIIntegrationsGetList200Response.h"
#import "OAIPinterestLibError.h"


@interface OAIIntegrationsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIIntegrationsApi

NSString* kOAIIntegrationsApiErrorDomain = @"OAIIntegrationsApiErrorDomain";
NSInteger kOAIIntegrationsApiMissingParamErrorCode = 234513;

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
/// Delete commerce integration
/// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param externalBusinessId External business ID for the integration. 
///
///  @returns OAIIntegrationMetadata*
///
-(NSURLSessionTask*) integrationsCommerceDelWithExternalBusinessId: (NSString*) externalBusinessId
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler {
    // verify the required parameter 'externalBusinessId' is set
    if (externalBusinessId == nil) {
        NSParameterAssert(externalBusinessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"externalBusinessId"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations/commerce/{external_business_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (externalBusinessId != nil) {
        pathParams[@"external_business_id"] = externalBusinessId;
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
                              responseType: @"OAIIntegrationMetadata*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationMetadata*)data, error);
                                }
                            }];
}

///
/// Get commerce integration
/// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param externalBusinessId External business ID for the integration. 
///
///  @returns OAIIntegrationMetadata*
///
-(NSURLSessionTask*) integrationsCommerceGetWithExternalBusinessId: (NSString*) externalBusinessId
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler {
    // verify the required parameter 'externalBusinessId' is set
    if (externalBusinessId == nil) {
        NSParameterAssert(externalBusinessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"externalBusinessId"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations/commerce/{external_business_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (externalBusinessId != nil) {
        pathParams[@"external_business_id"] = externalBusinessId;
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
                              responseType: @"OAIIntegrationMetadata*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationMetadata*)data, error);
                                }
                            }];
}

///
/// Update commerce integration
/// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param externalBusinessId External business ID for the integration. 
///
///  @param integrationMetadataUpdate  
///
///  @returns OAIIntegrationMetadata*
///
-(NSURLSessionTask*) integrationsCommercePatchWithExternalBusinessId: (NSString*) externalBusinessId
    integrationMetadataUpdate: (OAIIntegrationMetadataUpdate*) integrationMetadataUpdate
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler {
    // verify the required parameter 'externalBusinessId' is set
    if (externalBusinessId == nil) {
        NSParameterAssert(externalBusinessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"externalBusinessId"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'integrationMetadataUpdate' is set
    if (integrationMetadataUpdate == nil) {
        NSParameterAssert(integrationMetadataUpdate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"integrationMetadataUpdate"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations/commerce/{external_business_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (externalBusinessId != nil) {
        pathParams[@"external_business_id"] = externalBusinessId;
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
    bodyParam = integrationMetadataUpdate;

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
                              responseType: @"OAIIntegrationMetadata*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationMetadata*)data, error);
                                }
                            }];
}

///
/// Create commerce integration
/// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param integrationMetadataCreate  
///
///  @returns OAIIntegrationMetadata*
///
-(NSURLSessionTask*) integrationsCommercePostWithIntegrationMetadataCreate: (OAIIntegrationMetadataCreate*) integrationMetadataCreate
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler {
    // verify the required parameter 'integrationMetadataCreate' is set
    if (integrationMetadataCreate == nil) {
        NSParameterAssert(integrationMetadataCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"integrationMetadataCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations/commerce"];

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
    bodyParam = integrationMetadataCreate;

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
                              responseType: @"OAIIntegrationMetadata*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationMetadata*)data, error);
                                }
                            }];
}

///
/// Get integration metadata
/// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param _id Integration record ID. 
///
///  @returns OAIIntegrationRecord*
///
-(NSURLSessionTask*) integrationsGetByIdWithId: (NSString*) _id
    completionHandler: (void (^)(OAIIntegrationRecord* output, NSError* error)) handler {
    // verify the required parameter '_id' is set
    if (_id == nil) {
        NSParameterAssert(_id);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_id"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations/{id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (_id != nil) {
        pathParams[@"id"] = _id;
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
                              responseType: @"OAIIntegrationRecord*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationRecord*)data, error);
                                }
                            }];
}

///
/// Get integration metadata list
/// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIIntegrationsGetList200Response*
///
-(NSURLSessionTask*) integrationsGetListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIIntegrationsGetList200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations"];

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
                              responseType: @"OAIIntegrationsGetList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationsGetList200Response*)data, error);
                                }
                            }];
}

///
/// Receives batched logs from integration applications.
/// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///  @param integrationLogsRequestCreate  
///
///  @returns OAIIntegrationLogsSuccessResponse*
///
-(NSURLSessionTask*) integrationsLogsPostWithIntegrationLogsRequestCreate: (OAIIntegrationLogsRequestCreate*) integrationLogsRequestCreate
    completionHandler: (void (^)(OAIIntegrationLogsSuccessResponse* output, NSError* error)) handler {
    // verify the required parameter 'integrationLogsRequestCreate' is set
    if (integrationLogsRequestCreate == nil) {
        NSParameterAssert(integrationLogsRequestCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"integrationLogsRequestCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIIntegrationsApiErrorDomain code:kOAIIntegrationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/integrations/logs"];

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
    bodyParam = integrationLogsRequestCreate;

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
                              responseType: @"OAIIntegrationLogsSuccessResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIntegrationLogsSuccessResponse*)data, error);
                                }
                            }];
}



@end
