#import "OAIPinsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAnalyticsMetricsResponse.h"
#import "OAIError.h"
#import "OAIPin.h"


@interface OAIPinsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIPinsApi

NSString* kOAIPinsApiErrorDomain = @"OAIPinsApiErrorDomain";
NSInteger kOAIPinsApiMissingParamErrorCode = 234513;

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
/// Get Pin analytics
/// Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
///  @param pinId Unique identifier of a Pin. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param metricTypes Pin metric types to get data for, default is all. 
///
///  @param appTypes Apps or devices to get data for, default is all. (optional, default to @"ALL")
///
///  @param splitField How to split the data into groups. Not including this param means data won't be split. (optional, default to @"NO_SPLIT")
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns NSDictionary<OAIAnalyticsMetricsResponse>*
///
-(NSURLSessionTask*) pinsAnalyticsWithPinId: (NSString*) pinId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    metricTypes: (NSArray<NSString*>*) metricTypes
    appTypes: (NSString*) appTypes
    splitField: (NSString*) splitField
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSDictionary<OAIAnalyticsMetricsResponse>* output, NSError* error)) handler {
    // verify the required parameter 'pinId' is set
    if (pinId == nil) {
        NSParameterAssert(pinId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pinId"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'metricTypes' is set
    if (metricTypes == nil) {
        NSParameterAssert(metricTypes);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"metricTypes"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins/{pin_id}/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (pinId != nil) {
        pathParams[@"pin_id"] = pinId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (appTypes != nil) {
        queryParams[@"app_types"] = appTypes;
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
/// Create Pin
/// Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
///  @param pin Create a new Pin. 
///
///  @returns OAIPin*
///
-(NSURLSessionTask*) pinsCreateWithPin: (OAIPin*) pin
    completionHandler: (void (^)(OAIPin* output, NSError* error)) handler {
    // verify the required parameter 'pin' is set
    if (pin == nil) {
        NSParameterAssert(pin);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pin"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins"];

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
    bodyParam = pin;

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
                              responseType: @"OAIPin*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPin*)data, error);
                                }
                            }];
}

///
/// Delete Pin
/// Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
///  @param pinId Unique identifier of a Pin. 
///
///  @returns void
///
-(NSURLSessionTask*) pinsDeleteWithPinId: (NSString*) pinId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'pinId' is set
    if (pinId == nil) {
        NSParameterAssert(pinId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pinId"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins/{pin_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (pinId != nil) {
        pathParams[@"pin_id"] = pinId;
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
/// Get Pin
/// Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
///  @param pinId Unique identifier of a Pin. 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAIPin*
///
-(NSURLSessionTask*) pinsGetWithPinId: (NSString*) pinId
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIPin* output, NSError* error)) handler {
    // verify the required parameter 'pinId' is set
    if (pinId == nil) {
        NSParameterAssert(pinId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pinId"] };
            NSError* error = [NSError errorWithDomain:kOAIPinsApiErrorDomain code:kOAIPinsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins/{pin_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (pinId != nil) {
        pathParams[@"pin_id"] = pinId;
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
                              responseType: @"OAIPin*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPin*)data, error);
                                }
                            }];
}



@end
