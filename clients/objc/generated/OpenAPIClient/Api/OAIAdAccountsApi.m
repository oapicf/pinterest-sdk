#import "OAIAdAccountsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAdsAnalyticsCreateAsyncRequest.h"
#import "OAIAdsAnalyticsCreateAsyncResponse.h"
#import "OAIAdsAnalyticsGetAsyncResponse.h"
#import "OAIAnyType.h"
#import "OAIError.h"
#import "OAIGranularity.h"
#import "OAIPaginated.h"


@interface OAIAdAccountsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAdAccountsApi

NSString* kOAIAdAccountsApiErrorDomain = @"OAIAdAccountsApiErrorDomain";
NSInteger kOAIAdAccountsApiMissingParamErrorCode = 234513;

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
/// Get ad account analytics
/// Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param columns Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity Granularity 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @returns NSArray<NSDictionary<NSString*, NSObject*>*>*
///
-(NSURLSessionTask*) adAccountAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (columns != nil) {
        queryParams[@"columns"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: columns format: @"csv"];
    }
    if (granularity != nil) {
        queryParams[@"granularity"] = granularity;
    }
    if (clickWindowDays != nil) {
        queryParams[@"click_window_days"] = clickWindowDays;
    }
    if (engagementWindowDays != nil) {
        queryParams[@"engagement_window_days"] = engagementWindowDays;
    }
    if (viewWindowDays != nil) {
        queryParams[@"view_window_days"] = viewWindowDays;
    }
    if (conversionReportTime != nil) {
        queryParams[@"conversion_report_time"] = conversionReportTime;
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
                              responseType: @"NSArray<NSDictionary<NSString*, NSObject*>*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSDictionary<NSString*, NSObject*>*>*)data, error);
                                }
                            }];
}

///
/// List ad accounts
/// Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @param includeSharedAccounts Include shared ad accounts (optional, default to @(YES))
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) adAccountsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    includeSharedAccounts: (NSNumber*) includeSharedAccounts
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (includeSharedAccounts != nil) {
        queryParams[@"include_shared_accounts"] = [includeSharedAccounts isEqual:@(YES)] ? @"true" : @"false";
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
/// Get ad group analytics
/// Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param adGroupIds List of Ad group Ids to use to filter the results. 
///
///  @param columns Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity Granularity 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @returns NSArray<NSDictionary<NSString*, NSObject*>*>*
///
-(NSURLSessionTask*) adGroupsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adGroupIds' is set
    if (adGroupIds == nil) {
        NSParameterAssert(adGroupIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adGroupIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ad_groups/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (adGroupIds != nil) {
        queryParams[@"ad_group_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adGroupIds format: @"multi"];
    }
    if (columns != nil) {
        queryParams[@"columns"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: columns format: @"csv"];
    }
    if (granularity != nil) {
        queryParams[@"granularity"] = granularity;
    }
    if (clickWindowDays != nil) {
        queryParams[@"click_window_days"] = clickWindowDays;
    }
    if (engagementWindowDays != nil) {
        queryParams[@"engagement_window_days"] = engagementWindowDays;
    }
    if (viewWindowDays != nil) {
        queryParams[@"view_window_days"] = viewWindowDays;
    }
    if (conversionReportTime != nil) {
        queryParams[@"conversion_report_time"] = conversionReportTime;
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
                              responseType: @"NSArray<NSDictionary<NSString*, NSObject*>*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSDictionary<NSString*, NSObject*>*>*)data, error);
                                }
                            }];
}

///
/// List ad groups
/// Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignIds List of Campaign Ids to use to filter the results. (optional)
///
///  @param adGroupIds List of Ad group Ids to use to filter the results. (optional)
///
///  @param entityStatuses Entity status (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs. (optional, default to @(NO))
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) adGroupsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
    translateInterestsToNames: (NSNumber*) translateInterestsToNames
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ad_groups"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (campaignIds != nil) {
        queryParams[@"campaign_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: campaignIds format: @"multi"];
    }
    if (adGroupIds != nil) {
        queryParams[@"ad_group_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adGroupIds format: @"multi"];
    }
    if (entityStatuses != nil) {
        queryParams[@"entity_statuses"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: entityStatuses format: @"multi"];
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (translateInterestsToNames != nil) {
        queryParams[@"translate_interests_to_names"] = [translateInterestsToNames isEqual:@(YES)] ? @"true" : @"false";
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
/// Get ad analytics
/// Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param adIds List of Ad Ids to use to filter the results. 
///
///  @param columns Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity Granularity 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @returns NSArray<NSDictionary<NSString*, NSObject*>*>*
///
-(NSURLSessionTask*) adsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    adIds: (NSArray<NSString*>*) adIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adIds' is set
    if (adIds == nil) {
        NSParameterAssert(adIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ads/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (adIds != nil) {
        queryParams[@"ad_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adIds format: @"multi"];
    }
    if (columns != nil) {
        queryParams[@"columns"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: columns format: @"csv"];
    }
    if (granularity != nil) {
        queryParams[@"granularity"] = granularity;
    }
    if (clickWindowDays != nil) {
        queryParams[@"click_window_days"] = clickWindowDays;
    }
    if (engagementWindowDays != nil) {
        queryParams[@"engagement_window_days"] = engagementWindowDays;
    }
    if (viewWindowDays != nil) {
        queryParams[@"view_window_days"] = viewWindowDays;
    }
    if (conversionReportTime != nil) {
        queryParams[@"conversion_report_time"] = conversionReportTime;
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
                              responseType: @"NSArray<NSDictionary<NSString*, NSObject*>*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSDictionary<NSString*, NSObject*>*>*)data, error);
                                }
                            }];
}

///
/// List ads
/// Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignIds List of Campaign Ids to use to filter the results. (optional)
///
///  @param adGroupIds List of Ad group Ids to use to filter the results. (optional)
///
///  @param adIds List of Ad Ids to use to filter the results. (optional)
///
///  @param entityStatuses Entity status (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) adsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    adIds: (NSArray<NSString*>*) adIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ads"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (campaignIds != nil) {
        queryParams[@"campaign_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: campaignIds format: @"multi"];
    }
    if (adGroupIds != nil) {
        queryParams[@"ad_group_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adGroupIds format: @"multi"];
    }
    if (adIds != nil) {
        queryParams[@"ad_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adIds format: @"multi"];
    }
    if (entityStatuses != nil) {
        queryParams[@"entity_statuses"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: entityStatuses format: @"multi"];
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
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
                              responseType: @"OAIPaginated*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPaginated*)data, error);
                                }
                            }];
}

///
/// Create async request for an account analytics report
/// This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adsAnalyticsCreateAsyncRequest  
///
///  @returns OAIAdsAnalyticsCreateAsyncResponse*
///
-(NSURLSessionTask*) analyticsCreateReportWithAdAccountId: (NSString*) adAccountId
    adsAnalyticsCreateAsyncRequest: (OAIAdsAnalyticsCreateAsyncRequest*) adsAnalyticsCreateAsyncRequest
    completionHandler: (void (^)(OAIAdsAnalyticsCreateAsyncResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adsAnalyticsCreateAsyncRequest' is set
    if (adsAnalyticsCreateAsyncRequest == nil) {
        NSParameterAssert(adsAnalyticsCreateAsyncRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adsAnalyticsCreateAsyncRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/reports"];

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
    bodyParam = adsAnalyticsCreateAsyncRequest;

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
                              responseType: @"OAIAdsAnalyticsCreateAsyncResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdsAnalyticsCreateAsyncResponse*)data, error);
                                }
                            }];
}

///
/// Get the account analytics report created by the async call
/// This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param token Token returned from the post request creation call 
///
///  @returns OAIAdsAnalyticsGetAsyncResponse*
///
-(NSURLSessionTask*) analyticsGetReportWithAdAccountId: (NSString*) adAccountId
    token: (NSString*) token
    completionHandler: (void (^)(OAIAdsAnalyticsGetAsyncResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'token' is set
    if (token == nil) {
        NSParameterAssert(token);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"token"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/reports"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (token != nil) {
        queryParams[@"token"] = token;
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
                              responseType: @"OAIAdsAnalyticsGetAsyncResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdsAnalyticsGetAsyncResponse*)data, error);
                                }
                            }];
}

///
/// Get campaign analytics
/// Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param campaignIds List of Campaign Ids to use to filter the results. 
///
///  @param columns Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity Granularity 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @returns NSArray<NSDictionary<NSString*, NSObject*>*>*
///
-(NSURLSessionTask*) campaignsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    campaignIds: (NSArray<NSString*>*) campaignIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignIds' is set
    if (campaignIds == nil) {
        NSParameterAssert(campaignIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaigns/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (campaignIds != nil) {
        queryParams[@"campaign_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: campaignIds format: @"multi"];
    }
    if (columns != nil) {
        queryParams[@"columns"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: columns format: @"csv"];
    }
    if (granularity != nil) {
        queryParams[@"granularity"] = granularity;
    }
    if (clickWindowDays != nil) {
        queryParams[@"click_window_days"] = clickWindowDays;
    }
    if (engagementWindowDays != nil) {
        queryParams[@"engagement_window_days"] = engagementWindowDays;
    }
    if (viewWindowDays != nil) {
        queryParams[@"view_window_days"] = viewWindowDays;
    }
    if (conversionReportTime != nil) {
        queryParams[@"conversion_report_time"] = conversionReportTime;
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
                              responseType: @"NSArray<NSDictionary<NSString*, NSObject*>*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSDictionary<NSString*, NSObject*>*>*)data, error);
                                }
                            }];
}

///
/// List campaigns
/// Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignIds List of Campaign Ids to use to filter the results. (optional)
///
///  @param entityStatuses Entity status (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional, default to @25)
///
///  @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIPaginated*
///
-(NSURLSessionTask*) campaignsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaigns"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (campaignIds != nil) {
        queryParams[@"campaign_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: campaignIds format: @"multi"];
    }
    if (entityStatuses != nil) {
        queryParams[@"entity_statuses"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: entityStatuses format: @"multi"];
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
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
                              responseType: @"OAIPaginated*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPaginated*)data, error);
                                }
                            }];
}

///
/// Get product group analytics
/// Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD 
///
///  @param productGroupIds List of Product group Ids to use to filter the results. 
///
///  @param columns Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity Granularity 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @returns NSArray<NSDictionary<NSString*, NSObject*>*>*
///
-(NSURLSessionTask*) productGroupsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    productGroupIds: (NSArray<NSString*>*) productGroupIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'productGroupIds' is set
    if (productGroupIds == nil) {
        NSParameterAssert(productGroupIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdAccountsApiErrorDomain code:kOAIAdAccountsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/product_groups/analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (productGroupIds != nil) {
        queryParams[@"product_group_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: productGroupIds format: @"multi"];
    }
    if (columns != nil) {
        queryParams[@"columns"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: columns format: @"csv"];
    }
    if (granularity != nil) {
        queryParams[@"granularity"] = granularity;
    }
    if (clickWindowDays != nil) {
        queryParams[@"click_window_days"] = clickWindowDays;
    }
    if (engagementWindowDays != nil) {
        queryParams[@"engagement_window_days"] = engagementWindowDays;
    }
    if (viewWindowDays != nil) {
        queryParams[@"view_window_days"] = viewWindowDays;
    }
    if (conversionReportTime != nil) {
        queryParams[@"conversion_report_time"] = conversionReportTime;
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
                              responseType: @"NSArray<NSDictionary<NSString*, NSObject*>*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSDictionary<NSString*, NSObject*>*>*)data, error);
                                }
                            }];
}



@end
