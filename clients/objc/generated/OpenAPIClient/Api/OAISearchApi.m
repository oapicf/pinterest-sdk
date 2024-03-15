#import "OAISearchApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIError.h"
#import "OAIPinsList200Response.h"
#import "OAISearchPartnerPins200Response.h"
#import "OAISearchUserBoardsGet200Response.h"


@interface OAISearchApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAISearchApi

NSString* kOAISearchApiErrorDomain = @"OAISearchApiErrorDomain";
NSInteger kOAISearchApiMissingParamErrorCode = 234513;

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
/// Search pins by a given search term
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
///  @param term Search term to look up pins. 
///
///  @param countryCode Two letter country code (ISO 3166-1 alpha-2) 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param locale Search locale. (optional)
///
///  @param limit Max search result size (optional, default to @10)
///
///  @returns OAISearchPartnerPins200Response*
///
-(NSURLSessionTask*) searchPartnerPinsWithTerm: (NSString*) term
    countryCode: (NSString*) countryCode
    bookmark: (NSString*) bookmark
    locale: (NSString*) locale
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAISearchPartnerPins200Response* output, NSError* error)) handler {
    // verify the required parameter 'term' is set
    if (term == nil) {
        NSParameterAssert(term);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"term"] };
            NSError* error = [NSError errorWithDomain:kOAISearchApiErrorDomain code:kOAISearchApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'countryCode' is set
    if (countryCode == nil) {
        NSParameterAssert(countryCode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"countryCode"] };
            NSError* error = [NSError errorWithDomain:kOAISearchApiErrorDomain code:kOAISearchApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/search/partner/pins"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (term != nil) {
        queryParams[@"term"] = term;
    }
    if (countryCode != nil) {
        queryParams[@"country_code"] = countryCode;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (locale != nil) {
        queryParams[@"locale"] = locale;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAISearchPartnerPins200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISearchPartnerPins200Response*)data, error);
                                }
                            }];
}

///
/// Search user's boards
/// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param query Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
///
///  @returns OAISearchUserBoardsGet200Response*
///
-(NSURLSessionTask*) searchUserBoardsGetWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    query: (NSString*) query
    completionHandler: (void (^)(OAISearchUserBoardsGet200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/search/boards"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (query != nil) {
        queryParams[@"query"] = query;
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
                              responseType: @"OAISearchUserBoardsGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISearchUserBoardsGet200Response*)data, error);
                                }
                            }];
}

///
/// Search user's Pins
/// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
///  @param query Search query. Can contain pin description keywords or comma-separated pin IDs. 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIPinsList200Response*
///
-(NSURLSessionTask*) searchUserPinsListWithQuery: (NSString*) query
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIPinsList200Response* output, NSError* error)) handler {
    // verify the required parameter 'query' is set
    if (query == nil) {
        NSParameterAssert(query);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"query"] };
            NSError* error = [NSError errorWithDomain:kOAISearchApiErrorDomain code:kOAISearchApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/search/pins"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    if (query != nil) {
        queryParams[@"query"] = query;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
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
                              responseType: @"OAIPinsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPinsList200Response*)data, error);
                                }
                            }];
}



@end
