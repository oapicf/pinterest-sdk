#import "OAIResourcesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAdAccountCountriesGet200Response.h"
#import "OAIBookClosed.h"
#import "OAIDeliveryMetricsGet200Response.h"
#import "OAIPinterestLibError.h"
#import "OAIPublicTargetingType.h"
#import "OAIReportType.h"
#import "OAISingleInterestTargetingOption.h"


@interface OAIResourcesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIResourcesApi

NSString* kOAIResourcesApiErrorDomain = @"OAIResourcesApiErrorDomain";
NSInteger kOAIResourcesApiMissingParamErrorCode = 234513;

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
/// Get ad accounts countries
/// Get Ad Accounts countries
///  @returns OAIAdAccountCountriesGet200Response*
///
-(NSURLSessionTask*) adAccountCountriesGetWithCompletionHandler: 
    (void (^)(OAIAdAccountCountriesGet200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/resources/ad_account_countries"];

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
                              responseType: @"OAIAdAccountCountriesGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdAccountCountriesGet200Response*)data, error);
                                }
                            }];
}

///
/// Get available metrics' definitions
/// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
///  @param reportType Report type. (optional)
///
///  @returns OAIDeliveryMetricsGet200Response*
///
-(NSURLSessionTask*) deliveryMetricsGetWithReportType: (OAIReportType) reportType
    completionHandler: (void (^)(OAIDeliveryMetricsGet200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/resources/delivery_metrics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (reportType != nil) {
        queryParams[@"report_type"] = reportType;
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
                              responseType: @"OAIDeliveryMetricsGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeliveryMetricsGet200Response*)data, error);
                                }
                            }];
}

///
/// Get interest details
/// Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
///  @param interestId Unique identifier of an interest. 
///
///  @returns OAISingleInterestTargetingOption*
///
-(NSURLSessionTask*) interestTargetingOptionsGetWithInterestId: (NSString*) interestId
    completionHandler: (void (^)(OAISingleInterestTargetingOption* output, NSError* error)) handler {
    // verify the required parameter 'interestId' is set
    if (interestId == nil) {
        NSParameterAssert(interestId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"interestId"] };
            NSError* error = [NSError errorWithDomain:kOAIResourcesApiErrorDomain code:kOAIResourcesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/resources/targeting/interests/{interest_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (interestId != nil) {
        pathParams[@"interest_id"] = interestId;
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
                              responseType: @"OAISingleInterestTargetingOption*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISingleInterestTargetingOption*)data, error);
                                }
                            }];
}

///
/// Get lead form questions
/// Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
///  @returns void
///
-(NSURLSessionTask*) leadFormQuestionsGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/resources/lead_form_questions"];

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Get metrics ready state
/// Learn whether conversion or non-conversion metrics are finalized and ready to query.
///  @param date Analytics reports request date (UTC). Format: YYYY-MM-DD 
///
///  @returns OAIBookClosed*
///
-(NSURLSessionTask*) metricsReadyStateGetWithDate: (NSString*) date
    completionHandler: (void (^)(OAIBookClosed* output, NSError* error)) handler {
    // verify the required parameter 'date' is set
    if (date == nil) {
        NSParameterAssert(date);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"date"] };
            NSError* error = [NSError errorWithDomain:kOAIResourcesApiErrorDomain code:kOAIResourcesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/resources/metrics_ready_state"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (date != nil) {
        queryParams[@"date"] = date;
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
                              responseType: @"OAIBookClosed*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBookClosed*)data, error);
                                }
                            }];
}

///
/// Get targeting options
///     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
///  @param targetingType Public targeting type 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @param clientId Client ID (optional)
///
///  @param oauthSignature Oauth signature (optional)
///
///  @param timestamp Timestamp. (optional)
///
///  @returns NSArray<NSObject*>*
///
-(NSURLSessionTask*) targetingOptionsGetWithTargetingType: (OAIPublicTargetingType) targetingType
    adAccountId: (NSString*) adAccountId
    clientId: (NSString*) clientId
    oauthSignature: (NSString*) oauthSignature
    timestamp: (NSString*) timestamp
    completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler {
    // verify the required parameter 'targetingType' is set
    if (targetingType == nil) {
        NSParameterAssert(targetingType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"targetingType"] };
            NSError* error = [NSError errorWithDomain:kOAIResourcesApiErrorDomain code:kOAIResourcesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/resources/targeting/{targeting_type}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (targetingType != nil) {
        pathParams[@"targeting_type"] = targetingType;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    if (clientId != nil) {
        queryParams[@"client_id"] = clientId;
    }
    if (oauthSignature != nil) {
        queryParams[@"oauth_signature"] = oauthSignature;
    }
    if (timestamp != nil) {
        queryParams[@"timestamp"] = timestamp;
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
                              responseType: @"NSArray<NSObject*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSObject*>*)data, error);
                                }
                            }];
}



@end
