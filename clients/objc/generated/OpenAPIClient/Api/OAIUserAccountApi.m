#import "OAIUserAccountApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAccount.h"
#import "OAIAnalyticsMetricsResponse.h"
#import "OAIBoardsList200Response.h"
#import "OAIFollowUser.h"
#import "OAIFollowUserCreate.h"
#import "OAIFollowersList200Response.h"
#import "OAILinkedBusiness.h"
#import "OAIPinterestLibError.h"
#import "OAIQuerymetrictypesItems.h"
#import "OAIQueryvideopinmetrictypesItems.h"
#import "OAITopPinsAnalyticsResponse.h"
#import "OAITopPinsSortBy.h"
#import "OAITopVideoPinsAnalyticsResponse.h"
#import "OAITopVideoPinsSortBy.h"
#import "OAIUserAccountFollowedInterests200Response.h"
#import "OAIUserFollowingFeedType.h"
#import "OAIUserWebsite.h"
#import "OAIUserWebsiteCreate.h"
#import "OAIUserWebsiteVerification.h"
#import "OAIUserWebsitesGet200Response.h"


@interface OAIUserAccountApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIUserAccountApi

NSString* kOAIUserAccountApiErrorDomain = @"OAIUserAccountApiErrorDomain";
NSInteger kOAIUserAccountApiMissingParamErrorCode = 234513;

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
/// List following boards
/// Get a list of the boards a user follows. The request returns a board summary object array.
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to @(NO))
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIBoardsList200Response*
///
-(NSURLSessionTask*) boardsUserFollowsListWithAdAccountId: (NSString*) adAccountId
    explicitFollowing: (NSNumber*) explicitFollowing
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBoardsList200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/following/boards"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    if (explicitFollowing != nil) {
        queryParams[@"explicit_following"] = [explicitFollowing isEqual:@(YES)] ? @"true" : @"false";
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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAIBoardsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBoardsList200Response*)data, error);
                                }
                            }];
}

///
/// Follow user
/// **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
///  @param username A valid username 
///
///  @param followUserCreate  
///
///  @returns OAIFollowUser*
///
-(NSURLSessionTask*) followUserUpdateWithUsername: (NSString*) username
    followUserCreate: (OAIFollowUserCreate*) followUserCreate
    completionHandler: (void (^)(OAIFollowUser* output, NSError* error)) handler {
    // verify the required parameter 'username' is set
    if (username == nil) {
        NSParameterAssert(username);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"username"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'followUserCreate' is set
    if (followUserCreate == nil) {
        NSParameterAssert(followUserCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"followUserCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/following/{username}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (username != nil) {
        pathParams[@"username"] = username;
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
    bodyParam = followUserCreate;

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
                              responseType: @"OAIFollowUser*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFollowUser*)data, error);
                                }
                            }];
}

///
/// List followers
/// Get a list of your followers.
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIFollowersList200Response*
///
-(NSURLSessionTask*) followersListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIFollowersList200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/followers"];

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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAIFollowersList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFollowersList200Response*)data, error);
                                }
                            }];
}

///
/// List linked businesses
/// Get a list of your linked business accounts.
///  @returns NSArray<OAILinkedBusiness>*
///
-(NSURLSessionTask*) linkedBusinessAccountsGetWithCompletionHandler: 
    (void (^)(NSArray<OAILinkedBusiness>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/businesses"];

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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"NSArray<OAILinkedBusiness>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAILinkedBusiness>*)data, error);
                                }
                            }];
}

///
/// Unverify website
/// Unverify a website verified by the signed-in user.
///  @param website Website with path or domain only 
///
///  @returns OAIUserWebsite*
///
-(NSURLSessionTask*) unverifyWebsiteDeleteWithWebsite: (NSString*) website
    completionHandler: (void (^)(OAIUserWebsite* output, NSError* error)) handler {
    // verify the required parameter 'website' is set
    if (website == nil) {
        NSParameterAssert(website);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"website"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/websites"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (website != nil) {
        queryParams[@"website"] = website;
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
                              responseType: @"OAIUserWebsite*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUserWebsite*)data, error);
                                }
                            }];
}

///
/// Get user account analytics
/// Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to @"BOTH")
///
///  @param pinFormat Pin formats to get data for, default is all. (optional, default to @"ALL")
///
///  @param appTypes Apps or devices to get data for, default is all. (optional, default to @"ALL")
///
///  @param contentType Filter to paid or organic data. Default is all. (optional, default to @"ALL")
///
///  @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to @"ALL")
///
///  @param metricTypes Metric types to get data for, default is all. (optional)
///
///  @param splitField How to split the data into groups. Not including this param means data won't be split. (optional, default to @"NO_SPLIT")
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns NSDictionary<OAIAnalyticsMetricsResponse>*
///
-(NSURLSessionTask*) userAccountAnalyticsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    contentType: (NSString*) contentType
    source: (NSString*) source
    metricTypes: (NSArray<OAIQuerymetrictypesItems>*) metricTypes
    splitField: (NSString*) splitField
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSDictionary<OAIAnalyticsMetricsResponse>* output, NSError* error)) handler {
    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (fromClaimedContent != nil) {
        queryParams[@"from_claimed_content"] = fromClaimedContent;
    }
    if (pinFormat != nil) {
        queryParams[@"pin_format"] = pinFormat;
    }
    if (appTypes != nil) {
        queryParams[@"app_types"] = appTypes;
    }
    if (contentType != nil) {
        queryParams[@"content_type"] = contentType;
    }
    if (source != nil) {
        queryParams[@"source"] = source;
    }
    if (metricTypes != nil) {
        queryParams[@"metric_types"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: metricTypes format: @"csv"];
    }
    if (splitField != nil) {
        queryParams[@"split_field"] = splitField;
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
                              responseType: @"NSDictionary<OAIAnalyticsMetricsResponse>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSDictionary<OAIAnalyticsMetricsResponse>*)data, error);
                                }
                            }];
}

///
/// Get user account top pins analytics
/// Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param sortBy Specify sorting order for metrics 
///
///  @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to @"BOTH")
///
///  @param pinFormat Pin formats to get data for, default is all. (optional, default to @"ALL")
///
///  @param appTypes Apps or devices to get data for, default is all. (optional, default to @"ALL")
///
///  @param contentType Filter to paid or organic data. Default is all. (optional, default to @"ALL")
///
///  @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to @"ALL")
///
///  @param metricTypes Metric types to get data for, default is all. (optional)
///
///  @param numOfPins Number of pins to include, default is 10. Max is 50. (optional, default to @10)
///
///  @param createdInLastNDays Get metrics for pins created in the last \"n\" days. (optional)
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAITopPinsAnalyticsResponse*
///
-(NSURLSessionTask*) userAccountAnalyticsTopPinsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    sortBy: (OAITopPinsSortBy) sortBy
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    contentType: (NSString*) contentType
    source: (NSString*) source
    metricTypes: (NSArray<OAIQuerymetrictypesItems>*) metricTypes
    numOfPins: (NSNumber*) numOfPins
    createdInLastNDays: (NSNumber*) createdInLastNDays
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAITopPinsAnalyticsResponse* output, NSError* error)) handler {
    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'sortBy' is set
    if (sortBy == nil) {
        NSParameterAssert(sortBy);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"sortBy"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/analytics/top_pins"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (sortBy != nil) {
        queryParams[@"sort_by"] = sortBy;
    }
    if (fromClaimedContent != nil) {
        queryParams[@"from_claimed_content"] = fromClaimedContent;
    }
    if (pinFormat != nil) {
        queryParams[@"pin_format"] = pinFormat;
    }
    if (appTypes != nil) {
        queryParams[@"app_types"] = appTypes;
    }
    if (contentType != nil) {
        queryParams[@"content_type"] = contentType;
    }
    if (source != nil) {
        queryParams[@"source"] = source;
    }
    if (metricTypes != nil) {
        queryParams[@"metric_types"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: metricTypes format: @"csv"];
    }
    if (numOfPins != nil) {
        queryParams[@"num_of_pins"] = numOfPins;
    }
    if (createdInLastNDays != nil) {
        queryParams[@"created_in_last_n_days"] = createdInLastNDays;
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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAITopPinsAnalyticsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITopPinsAnalyticsResponse*)data, error);
                                }
                            }];
}

///
/// Get user account top video pins analytics
/// Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param sortBy Specify sorting order for video metrics 
///
///  @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to @"BOTH")
///
///  @param pinFormat Pin formats to get data for, default is all. (optional, default to @"ALL")
///
///  @param appTypes Apps or devices to get data for, default is all. (optional, default to @"ALL")
///
///  @param contentType Filter to paid or organic data. Default is all. (optional, default to @"ALL")
///
///  @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to @"ALL")
///
///  @param metricTypes Metric types to get video data for, default is all. (optional)
///
///  @param numOfPins Number of pins to include, default is 10. Max is 50. (optional, default to @10)
///
///  @param createdInLastNDays Get metrics for pins created in the last \"n\" days. (optional)
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAITopVideoPinsAnalyticsResponse*
///
-(NSURLSessionTask*) userAccountAnalyticsTopVideoPinsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    sortBy: (OAITopVideoPinsSortBy) sortBy
    fromClaimedContent: (NSString*) fromClaimedContent
    pinFormat: (NSString*) pinFormat
    appTypes: (NSString*) appTypes
    contentType: (NSString*) contentType
    source: (NSString*) source
    metricTypes: (NSArray<OAIQueryvideopinmetrictypesItems>*) metricTypes
    numOfPins: (NSNumber*) numOfPins
    createdInLastNDays: (NSNumber*) createdInLastNDays
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAITopVideoPinsAnalyticsResponse* output, NSError* error)) handler {
    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'sortBy' is set
    if (sortBy == nil) {
        NSParameterAssert(sortBy);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"sortBy"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/analytics/top_video_pins"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (sortBy != nil) {
        queryParams[@"sort_by"] = sortBy;
    }
    if (fromClaimedContent != nil) {
        queryParams[@"from_claimed_content"] = fromClaimedContent;
    }
    if (pinFormat != nil) {
        queryParams[@"pin_format"] = pinFormat;
    }
    if (appTypes != nil) {
        queryParams[@"app_types"] = appTypes;
    }
    if (contentType != nil) {
        queryParams[@"content_type"] = contentType;
    }
    if (source != nil) {
        queryParams[@"source"] = source;
    }
    if (metricTypes != nil) {
        queryParams[@"metric_types"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: metricTypes format: @"csv"];
    }
    if (numOfPins != nil) {
        queryParams[@"num_of_pins"] = numOfPins;
    }
    if (createdInLastNDays != nil) {
        queryParams[@"created_in_last_n_days"] = createdInLastNDays;
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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAITopVideoPinsAnalyticsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITopVideoPinsAnalyticsResponse*)data, error);
                                }
                            }];
}

///
/// List following interests
/// Get a list of a user's following interests in one place.
///  @param username A valid username 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIUserAccountFollowedInterests200Response*
///
-(NSURLSessionTask*) userAccountFollowedInterestsWithUsername: (NSString*) username
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIUserAccountFollowedInterests200Response* output, NSError* error)) handler {
    // verify the required parameter 'username' is set
    if (username == nil) {
        NSParameterAssert(username);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"username"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{username}/interests/follow"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (username != nil) {
        pathParams[@"username"] = username;
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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAIUserAccountFollowedInterests200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUserAccountFollowedInterests200Response*)data, error);
                                }
                            }];
}

///
/// Get user account
/// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAIAccount*
///
-(NSURLSessionTask*) userAccountGetWithAdAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIAccount* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAIAccount*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAccount*)data, error);
                                }
                            }];
}

///
/// List following
/// Get a list of who a certain user follows.
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to @(NO))
///
///  @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIFollowersList200Response*
///
-(NSURLSessionTask*) userFollowingGetWithAdAccountId: (NSString*) adAccountId
    explicitFollowing: (NSNumber*) explicitFollowing
    feedType: (OAIUserFollowingFeedType) feedType
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIFollowersList200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/following"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    if (explicitFollowing != nil) {
        queryParams[@"explicit_following"] = [explicitFollowing isEqual:@(YES)] ? @"true" : @"false";
    }
    if (feedType != nil) {
        queryParams[@"feed_type"] = feedType;
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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAIFollowersList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFollowersList200Response*)data, error);
                                }
                            }];
}

///
/// Get user websites
/// Get user websites, claimed or not
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIUserWebsitesGet200Response*
///
-(NSURLSessionTask*) userWebsitesGetWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIUserWebsitesGet200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/websites"];

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
                              responseType: @"OAIUserWebsitesGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUserWebsitesGet200Response*)data, error);
                                }
                            }];
}

///
/// Verify website
/// Verify a website as a signed-in user.
///  @param userWebsiteCreate  
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAIUserWebsite*
///
-(NSURLSessionTask*) verifyWebsiteUpdateWithUserWebsiteCreate: (OAIUserWebsiteCreate*) userWebsiteCreate
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIUserWebsite* output, NSError* error)) handler {
    // verify the required parameter 'userWebsiteCreate' is set
    if (userWebsiteCreate == nil) {
        NSParameterAssert(userWebsiteCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userWebsiteCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIUserAccountApiErrorDomain code:kOAIUserAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/websites"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

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
    bodyParam = userWebsiteCreate;

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
                              responseType: @"OAIUserWebsite*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUserWebsite*)data, error);
                                }
                            }];
}

///
/// Get user verification code for website claiming
/// Get verification code for user to install on the website to claim it.
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAIUserWebsiteVerification*
///
-(NSURLSessionTask*) websiteVerificationGetWithAdAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIUserWebsiteVerification* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_account/websites/verification"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

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
    NSArray *authSettings = @[@"pinterest_oauth2", @"client_credentials"];

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
                              responseType: @"OAIUserWebsiteVerification*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUserWebsiteVerification*)data, error);
                                }
                            }];
}



@end
