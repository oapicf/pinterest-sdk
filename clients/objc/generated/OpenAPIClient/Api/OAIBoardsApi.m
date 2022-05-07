#import "OAIBoardsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIBoard.h"
#import "OAIBoardSection.h"
#import "OAIBoardUpdate.h"
#import "OAIError.h"
#import "OAIPaginated.h"


@interface OAIBoardsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIBoardsApi

NSString* kOAIBoardsApiErrorDomain = @"OAIBoardsApiErrorDomain";
NSInteger kOAIBoardsApiMissingParamErrorCode = 234513;

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
/// Create board section
/// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @param boardSection Create a board section. 
///
///  @returns OAIBoardSection*
///
-(NSURLSessionTask*) boardSectionsCreateWithBoardId: (NSString*) boardId
    boardSection: (OAIBoardSection*) boardSection
    completionHandler: (void (^)(OAIBoardSection* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'boardSection' is set
    if (boardSection == nil) {
        NSParameterAssert(boardSection);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardSection"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}/sections"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
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
    bodyParam = boardSection;

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
                              responseType: @"OAIBoardSection*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBoardSection*)data, error);
                                }
                            }];
}

///
/// Delete board section
/// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @param sectionId Unique identifier of a board section. 
///
///  @returns void
///
-(NSURLSessionTask*) boardSectionsDeleteWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'sectionId' is set
    if (sectionId == nil) {
        NSParameterAssert(sectionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"sectionId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}/sections/{section_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
    }
    if (sectionId != nil) {
        pathParams[@"section_id"] = sectionId;
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
/// List board sections
/// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) boardSectionsListWithBoardId: (NSString*) boardId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}/sections"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
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
/// List Pins on board section
/// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @param sectionId Unique identifier of a board section. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) boardSectionsListPinsWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'sectionId' is set
    if (sectionId == nil) {
        NSParameterAssert(sectionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"sectionId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}/sections/{section_id}/pins"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
    }
    if (sectionId != nil) {
        pathParams[@"section_id"] = sectionId;
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
/// Update board section
/// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @param sectionId Unique identifier of a board section. 
///
///  @param boardSection Update a board section. 
///
///  @returns OAIBoardSection*
///
-(NSURLSessionTask*) boardSectionsUpdateWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    boardSection: (OAIBoardSection*) boardSection
    completionHandler: (void (^)(OAIBoardSection* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'sectionId' is set
    if (sectionId == nil) {
        NSParameterAssert(sectionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"sectionId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'boardSection' is set
    if (boardSection == nil) {
        NSParameterAssert(boardSection);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardSection"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}/sections/{section_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
    }
    if (sectionId != nil) {
        pathParams[@"section_id"] = sectionId;
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
    bodyParam = boardSection;

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
                              responseType: @"OAIBoardSection*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBoardSection*)data, error);
                                }
                            }];
}

///
/// Create board
/// Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///  @param board Create a board using a single board json object. 
///
///  @returns OAIBoard*
///
-(NSURLSessionTask*) boardsCreateWithBoard: (OAIBoard*) board
    completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler {
    // verify the required parameter 'board' is set
    if (board == nil) {
        NSParameterAssert(board);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"board"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards"];

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
    bodyParam = board;

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
                              responseType: @"OAIBoard*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBoard*)data, error);
                                }
                            }];
}

///
/// Delete board
/// Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @returns void
///
-(NSURLSessionTask*) boardsDeleteWithBoardId: (NSString*) boardId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
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
/// Get board
/// Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @returns OAIBoard*
///
-(NSURLSessionTask*) boardsGetWithBoardId: (NSString*) boardId
    completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
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
                              responseType: @"OAIBoard*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBoard*)data, error);
                                }
                            }];
}

///
/// List boards
/// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @param privacy Privacy setting for a board. (optional)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) boardsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    privacy: (NSString*) privacy
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (privacy != nil) {
        queryParams[@"privacy"] = privacy;
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
/// List Pins on board
/// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param boardId Unique identifier of a board. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) boardsListPinsWithBoardId: (NSString*) boardId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}/pins"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
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
/// Update board
/// Update a board owned by the \"operating user_account\".
///  @param boardId Unique identifier of a board. 
///
///  @param boardUpdate Update a board. 
///
///  @returns OAIBoard*
///
-(NSURLSessionTask*) boardsUpdateWithBoardId: (NSString*) boardId
    boardUpdate: (OAIBoardUpdate*) boardUpdate
    completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler {
    // verify the required parameter 'boardId' is set
    if (boardId == nil) {
        NSParameterAssert(boardId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardId"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'boardUpdate' is set
    if (boardUpdate == nil) {
        NSParameterAssert(boardUpdate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"boardUpdate"] };
            NSError* error = [NSError errorWithDomain:kOAIBoardsApiErrorDomain code:kOAIBoardsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/boards/{board_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (boardId != nil) {
        pathParams[@"board_id"] = boardId;
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
    bodyParam = boardUpdate;

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
                              responseType: @"OAIBoard*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBoard*)data, error);
                                }
                            }];
}



@end
