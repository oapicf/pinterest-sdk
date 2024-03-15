#import "OAIAudiencesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAudience.h"
#import "OAIAudienceCreateCustomRequest.h"
#import "OAIAudienceCreateRequest.h"
#import "OAIAudienceUpdateRequest.h"
#import "OAIAudiencesList200Response.h"
#import "OAIError.h"


@interface OAIAudiencesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAudiencesApi

NSString* kOAIAudiencesApiErrorDomain = @"OAIAudiencesApiErrorDomain";
NSInteger kOAIAudiencesApiMissingParamErrorCode = 234513;

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
/// Create audience
/// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param audienceCreateRequest List of ads to create, size limit [1, 30] 
///
///  @returns OAIAudience*
///
-(NSURLSessionTask*) audiencesCreateWithAdAccountId: (NSString*) adAccountId
    audienceCreateRequest: (OAIAudienceCreateRequest*) audienceCreateRequest
    completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audienceCreateRequest' is set
    if (audienceCreateRequest == nil) {
        NSParameterAssert(audienceCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audienceCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
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
    bodyParam = audienceCreateRequest;

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
                              responseType: @"OAIAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAudience*)data, error);
                                }
                            }];
}

///
/// Create custom audience
/// Create a custom audience and find the audiences you want your ads to reach.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param audienceCreateCustomRequest Custom audience to create. 
///
///  @returns OAIAudience*
///
-(NSURLSessionTask*) audiencesCreateCustomWithAdAccountId: (NSString*) adAccountId
    audienceCreateCustomRequest: (OAIAudienceCreateCustomRequest*) audienceCreateCustomRequest
    completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audienceCreateCustomRequest' is set
    if (audienceCreateCustomRequest == nil) {
        NSParameterAssert(audienceCreateCustomRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audienceCreateCustomRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences/custom"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
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
    bodyParam = audienceCreateCustomRequest;

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
                              responseType: @"OAIAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAudience*)data, error);
                                }
                            }];
}

///
/// Get audience
/// Get a specific audience given the audience ID.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param audienceId Unique identifier of an audience 
///
///  @returns OAIAudience*
///
-(NSURLSessionTask*) audiencesGetWithAdAccountId: (NSString*) adAccountId
    audienceId: (NSString*) audienceId
    completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audienceId' is set
    if (audienceId == nil) {
        NSParameterAssert(audienceId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audienceId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences/{audience_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (audienceId != nil) {
        pathParams[@"audience_id"] = audienceId;
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
                              responseType: @"OAIAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAudience*)data, error);
                                }
                            }];
}

///
/// List audiences
/// Get list of audiences for the ad account.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param ownershipType <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. (optional, default to @"OWNED")
///
///  @returns OAIAudiencesList200Response*
///
-(NSURLSessionTask*) audiencesListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    order: (NSString*) order
    pageSize: (NSNumber*) pageSize
    ownershipType: (NSString*) ownershipType
    completionHandler: (void (^)(OAIAudiencesList200Response* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (ownershipType != nil) {
        queryParams[@"ownership_type"] = ownershipType;
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
                              responseType: @"OAIAudiencesList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAudiencesList200Response*)data, error);
                                }
                            }];
}

///
/// Update audience
/// Update (edit or remove) an existing targeting audience.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param audienceId Unique identifier of an audience 
///
///  @param audienceUpdateRequest The audience to be updated. (optional)
///
///  @returns OAIAudience*
///
-(NSURLSessionTask*) audiencesUpdateWithAdAccountId: (NSString*) adAccountId
    audienceId: (NSString*) audienceId
    audienceUpdateRequest: (OAIAudienceUpdateRequest*) audienceUpdateRequest
    completionHandler: (void (^)(OAIAudience* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audienceId' is set
    if (audienceId == nil) {
        NSParameterAssert(audienceId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audienceId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudiencesApiErrorDomain code:kOAIAudiencesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences/{audience_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (audienceId != nil) {
        pathParams[@"audience_id"] = audienceId;
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
    bodyParam = audienceUpdateRequest;

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
                              responseType: @"OAIAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAudience*)data, error);
                                }
                            }];
}



@end
