#import "OAIUserAccountApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAccount.h"
#import "OAIAnalyticsMetricsResponse.h"
#import "OAIError.h"


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
/// Get user account analytics
/// Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to @"BOTH")
///
///  @param pinFormat Pin formats to get data for, default is all. (optional, default to @"ALL")
///
///  @param appTypes Apps or devices to get data for, default is all. (optional, default to @"ALL")
///
///  @param metricTypes Metric types to get data for, default is all.  (optional)
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
    metricTypes: (NSArray<NSString*>*) metricTypes
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
/// Get user account
/// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.
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
                              responseType: @"OAIAccount*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAccount*)data, error);
                                }
                            }];
}



@end
