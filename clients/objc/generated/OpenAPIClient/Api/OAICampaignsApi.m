#import "OAICampaignsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAdsAnalyticsTargetingType.h"
#import "OAICampaignCreateRequest.h"
#import "OAICampaignCreateResponse.h"
#import "OAICampaignResponse.h"
#import "OAICampaignUpdateRequest.h"
#import "OAICampaignUpdateResponse.h"
#import "OAICampaignsAnalyticsResponseInner.h"
#import "OAICampaignsList200Response.h"
#import "OAIConversionReportAttributionType.h"
#import "OAIError.h"
#import "OAIGranularity.h"
#import "OAIMetricsResponse.h"


@interface OAICampaignsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAICampaignsApi

NSString* kOAICampaignsApiErrorDomain = @"OAICampaignsApiErrorDomain";
NSInteger kOAICampaignsApiMissingParamErrorCode = 234513;

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
/// Get targeting analytics for campaigns
/// Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignIds List of Campaign Ids to use to filter the results. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. 
///
///  @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @param attributionTypes List of types of attribution for the conversion report (optional)
///
///  @returns OAIMetricsResponse*
///
-(NSURLSessionTask*) campaignTargetingAnalyticsGetWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    targetingTypes: (NSArray<OAIAdsAnalyticsTargetingType>*) targetingTypes
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    attributionTypes: (OAIConversionReportAttributionType) attributionTypes
    completionHandler: (void (^)(OAIMetricsResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignIds' is set
    if (campaignIds == nil) {
        NSParameterAssert(campaignIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignIds"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'targetingTypes' is set
    if (targetingTypes == nil) {
        NSParameterAssert(targetingTypes);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"targetingTypes"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (campaignIds != nil) {
        queryParams[@"campaign_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: campaignIds format: @"multi"];
    }
    if (startDate != nil) {
        queryParams[@"start_date"] = startDate;
    }
    if (endDate != nil) {
        queryParams[@"end_date"] = endDate;
    }
    if (targetingTypes != nil) {
        queryParams[@"targeting_types"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: targetingTypes format: @"csv"];
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
    if (attributionTypes != nil) {
        queryParams[@"attribution_types"] = attributionTypes;
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
                              responseType: @"OAIMetricsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMetricsResponse*)data, error);
                                }
                            }];
}

///
/// Get campaign analytics
/// Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param campaignIds List of Campaign Ids to use to filter the results. 
///
///  @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned 
///
///  @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @returns NSArray<OAICampaignsAnalyticsResponseInner>*
///
-(NSURLSessionTask*) campaignsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    campaignIds: (NSArray<NSString*>*) campaignIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<OAICampaignsAnalyticsResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignIds' is set
    if (campaignIds == nil) {
        NSParameterAssert(campaignIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignIds"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
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
                              responseType: @"NSArray<OAICampaignsAnalyticsResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICampaignsAnalyticsResponseInner>*)data, error);
                                }
                            }];
}

///
/// Create campaigns
/// Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignCreateRequest Array of campaigns. 
///
///  @returns OAICampaignCreateResponse*
///
-(NSURLSessionTask*) campaignsCreateWithAdAccountId: (NSString*) adAccountId
    campaignCreateRequest: (NSArray<OAICampaignCreateRequest>*) campaignCreateRequest
    completionHandler: (void (^)(OAICampaignCreateResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignCreateRequest' is set
    if (campaignCreateRequest == nil) {
        NSParameterAssert(campaignCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
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
    bodyParam = campaignCreateRequest;

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
                              responseType: @"OAICampaignCreateResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICampaignCreateResponse*)data, error);
                                }
                            }];
}

///
/// Get campaign
/// Get a specific campaign given the campaign ID.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignId Campaign ID, must be associated with the ad account ID provided in the path. 
///
///  @returns OAICampaignResponse*
///
-(NSURLSessionTask*) campaignsGetWithAdAccountId: (NSString*) adAccountId
    campaignId: (NSString*) campaignId
    completionHandler: (void (^)(OAICampaignResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignId' is set
    if (campaignId == nil) {
        NSParameterAssert(campaignId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (campaignId != nil) {
        pathParams[@"campaign_id"] = campaignId;
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
                              responseType: @"OAICampaignResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICampaignResponse*)data, error);
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
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAICampaignsList200Response*
///
-(NSURLSessionTask*) campaignsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAICampaignsList200Response* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
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
                              responseType: @"OAICampaignsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICampaignsList200Response*)data, error);
                                }
                            }];
}

///
/// Update campaigns
/// Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignUpdateRequest Array of campaigns. 
///
///  @returns OAICampaignUpdateResponse*
///
-(NSURLSessionTask*) campaignsUpdateWithAdAccountId: (NSString*) adAccountId
    campaignUpdateRequest: (NSArray<OAICampaignUpdateRequest>*) campaignUpdateRequest
    completionHandler: (void (^)(OAICampaignUpdateResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignUpdateRequest' is set
    if (campaignUpdateRequest == nil) {
        NSParameterAssert(campaignUpdateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignUpdateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICampaignsApiErrorDomain code:kOAICampaignsApiMissingParamErrorCode userInfo:userInfo];
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
    bodyParam = campaignUpdateRequest;

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
                              responseType: @"OAICampaignUpdateResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICampaignUpdateResponse*)data, error);
                                }
                            }];
}



@end
