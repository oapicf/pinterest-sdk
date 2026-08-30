#import "OAIAdsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAd.h"
#import "OAIAdBatchUpdate.h"
#import "OAIAdBatchWriteResponseModel.h"
#import "OAIAdCreate.h"
#import "OAIAdPreviewRequest.h"
#import "OAIAdPreviewURLResponse.h"
#import "OAIAdsAnalytics.h"
#import "OAIAdsAnalyticsAdTargetingType.h"
#import "OAIAdsList200Response.h"
#import "OAICampaignAdPreview.h"
#import "OAICampaignAdPreviewCreate.h"
#import "OAICampaignAdPreviewCreate200ResponseInner.h"
#import "OAICampaignAdPreviewDelete200ResponseInner.h"
#import "OAIConversionAttributionWindowDays.h"
#import "OAIConversionReportAttributionType.h"
#import "OAIConversionReportTimeType.h"
#import "OAIEntityStatus.h"
#import "OAIGranularity.h"
#import "OAIMetricsResponse.h"
#import "OAIPinterestLibError.h"
#import "OAIPinterestLibPaginationOrder.h"
#import "OAIReportingColumnSync.h"
#import "OAIReportingTimeZone.h"


@interface OAIAdsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAdsApi

NSString* kOAIAdsApiErrorDomain = @"OAIAdsApiErrorDomain";
NSInteger kOAIAdsApiMissingParamErrorCode = 234513;

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
/// Create ad preview with pin or image
/// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adPreviewRequest  
///
///  @returns OAIAdPreviewURLResponse*
///
-(NSURLSessionTask*) adPreviewsCreateWithAdAccountId: (NSString*) adAccountId
    adPreviewRequest: (OAIAdPreviewRequest*) adPreviewRequest
    completionHandler: (void (^)(OAIAdPreviewURLResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adPreviewRequest' is set
    if (adPreviewRequest == nil) {
        NSParameterAssert(adPreviewRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adPreviewRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ad_previews"];

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
    bodyParam = adPreviewRequest;

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
                              responseType: @"OAIAdPreviewURLResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdPreviewURLResponse*)data, error);
                                }
                            }];
}

///
/// Get targeting analytics for ads
/// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adIds List of Ad Ids to use to filter the results. 
///
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. 
///
///  @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
///
///  @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
///
///  @param attributionTypes List of types of attribution for the conversion report (optional)
///
///  @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
///
///  @param sortColumns Sort Columns. (optional)
///
///  @param sortAscending Sort ascending. (optional)
///
///  @returns OAIMetricsResponse*
///
-(NSURLSessionTask*) adTargetingAnalyticsGetWithAdAccountId: (NSString*) adAccountId
    adIds: (NSArray<NSString*>*) adIds
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    targetingTypes: (NSArray<OAIAdsAnalyticsAdTargetingType>*) targetingTypes
    columns: (NSArray<OAIReportingColumnSync>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (OAIConversionAttributionWindowDays) clickWindowDays
    engagementWindowDays: (OAIConversionAttributionWindowDays) engagementWindowDays
    viewWindowDays: (OAIConversionAttributionWindowDays) viewWindowDays
    conversionReportTime: (OAIConversionReportTimeType) conversionReportTime
    attributionTypes: (NSArray<OAIConversionReportAttributionType>*) attributionTypes
    reportingTimezone: (OAIReportingTimeZone) reportingTimezone
    sortColumns: (NSArray<NSString*>*) sortColumns
    sortAscending: (NSNumber*) sortAscending
    completionHandler: (void (^)(OAIMetricsResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adIds' is set
    if (adIds == nil) {
        NSParameterAssert(adIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'targetingTypes' is set
    if (targetingTypes == nil) {
        NSParameterAssert(targetingTypes);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"targetingTypes"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ads/targeting_analytics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adIds != nil) {
        queryParams[@"ad_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adIds format: @"multi"];
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
        queryParams[@"attribution_types"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: attributionTypes format: @"csv"];
    }
    if (reportingTimezone != nil) {
        queryParams[@"reporting_timezone"] = reportingTimezone;
    }
    if (sortColumns != nil) {
        queryParams[@"sort_columns"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: sortColumns format: @"multi"];
    }
    if (sortAscending != nil) {
        queryParams[@"sort_ascending"] = [sortAscending isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAIMetricsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMetricsResponse*)data, error);
                                }
                            }];
}

///
/// Get ad analytics
///     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
///
///  @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param pinIds List of Pin IDs. (optional)
///
///  @param adIds List of Ad Ids to use to filter the results. (optional)
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @param campaignIds List of Campaign Ids to use to filter the results. (optional)
///
///  @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
///
///  @returns NSArray<OAIAdsAnalytics>*
///
-(NSURLSessionTask*) adsAnalyticsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    columns: (NSArray<OAIReportingColumnSync>*) columns
    granularity: (OAIGranularity) granularity
    adAccountId: (NSString*) adAccountId
    pinIds: (NSArray<NSString*>*) pinIds
    adIds: (NSArray<NSString*>*) adIds
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    campaignIds: (NSArray<NSString*>*) campaignIds
    reportingTimezone: (OAIReportingTimeZone) reportingTimezone
    completionHandler: (void (^)(NSArray<OAIAdsAnalytics>* output, NSError* error)) handler {
    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
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
    if (pinIds != nil) {
        queryParams[@"pin_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: pinIds format: @"multi"];
    }
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
    if (campaignIds != nil) {
        queryParams[@"campaign_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: campaignIds format: @"multi"];
    }
    if (reportingTimezone != nil) {
        queryParams[@"reporting_timezone"] = reportingTimezone;
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
                              responseType: @"NSArray<OAIAdsAnalytics>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIAdsAnalytics>*)data, error);
                                }
                            }];
}

///
/// Create ads
/// Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adCreate  
///
///  @returns OAIAdBatchWriteResponseModel*
///
-(NSURLSessionTask*) adsCreateWithAdAccountId: (NSString*) adAccountId
    adCreate: (NSArray<OAIAdCreate>*) adCreate
    completionHandler: (void (^)(OAIAdBatchWriteResponseModel* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adCreate' is set
    if (adCreate == nil) {
        NSParameterAssert(adCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
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
    bodyParam = adCreate;

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
                              responseType: @"OAIAdBatchWriteResponseModel*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdBatchWriteResponseModel*)data, error);
                                }
                            }];
}

///
/// Get ad
/// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
///  @param adId The ID of this ad. 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @returns OAIAd*
///
-(NSURLSessionTask*) adsGetWithAdId: (NSString*) adId
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIAd* output, NSError* error)) handler {
    // verify the required parameter 'adId' is set
    if (adId == nil) {
        NSParameterAssert(adId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/ads/{ad_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adId != nil) {
        pathParams[@"ad_id"] = adId;
    }
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
                              responseType: @"OAIAd*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAd*)data, error);
                                }
                            }];
}

///
/// List ads
/// List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param campaignIds List of Campaign Ids to use to filter the results. (optional)
///
///  @param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
///
///  @param adIds List of Ad Ids to use to filter the results. (optional)
///
///  @param entityStatuses Entity status (optional)
///
///  @returns OAIAdsList200Response*
///
-(NSURLSessionTask*) adsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    campaignIds: (NSArray<NSString*>*) campaignIds
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    adIds: (NSArray<NSString*>*) adIds
    entityStatuses: (NSArray<OAIEntityStatus>*) entityStatuses
    completionHandler: (void (^)(OAIAdsList200Response* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
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
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
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
                              responseType: @"OAIAdsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdsList200Response*)data, error);
                                }
                            }];
}

///
/// Update ads
/// Update multiple existing ads
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adBatchUpdate  
///
///  @returns OAIAdBatchWriteResponseModel*
///
-(NSURLSessionTask*) adsUpdateWithAdAccountId: (NSString*) adAccountId
    adBatchUpdate: (NSArray<OAIAdBatchUpdate>*) adBatchUpdate
    completionHandler: (void (^)(OAIAdBatchWriteResponseModel* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adBatchUpdate' is set
    if (adBatchUpdate == nil) {
        NSParameterAssert(adBatchUpdate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adBatchUpdate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
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
    bodyParam = adBatchUpdate;

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
                              responseType: @"OAIAdBatchWriteResponseModel*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdBatchWriteResponseModel*)data, error);
                                }
                            }];
}

///
/// Create ad preview records for one or more ad groups
/// Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignAdPreviewCreate  
///
///  @returns NSArray<OAICampaignAdPreviewCreate200ResponseInner>*
///
-(NSURLSessionTask*) campaignAdPreviewCreateWithAdAccountId: (NSString*) adAccountId
    campaignAdPreviewCreate: (NSArray<OAICampaignAdPreviewCreate>*) campaignAdPreviewCreate
    completionHandler: (void (^)(NSArray<OAICampaignAdPreviewCreate200ResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'campaignAdPreviewCreate' is set
    if (campaignAdPreviewCreate == nil) {
        NSParameterAssert(campaignAdPreviewCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignAdPreviewCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaign_ad_preview"];

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
    bodyParam = campaignAdPreviewCreate;

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
                              responseType: @"NSArray<OAICampaignAdPreviewCreate200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICampaignAdPreviewCreate200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// Delete ad preview records for one or more ad groups
/// Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
///  @param adGroupIds List of Ad group Ids to use to filter the results. 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @returns NSArray<OAICampaignAdPreviewDelete200ResponseInner>*
///
-(NSURLSessionTask*) campaignAdPreviewDeleteWithAdGroupIds: (NSArray<NSString*>*) adGroupIds
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSArray<OAICampaignAdPreviewDelete200ResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'adGroupIds' is set
    if (adGroupIds == nil) {
        NSParameterAssert(adGroupIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adGroupIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaign_ad_preview"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adGroupIds != nil) {
        queryParams[@"ad_group_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adGroupIds format: @"multi"];
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
                              responseType: @"NSArray<OAICampaignAdPreviewDelete200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICampaignAdPreviewDelete200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// Fetch ad preview records for one or more ad groups
/// Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
///  @param adGroupIds List of Ad group Ids to use to filter the results. 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @returns NSArray<OAICampaignAdPreview>*
///
-(NSURLSessionTask*) campaignAdPreviewReadWithAdGroupIds: (NSArray<NSString*>*) adGroupIds
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSArray<OAICampaignAdPreview>* output, NSError* error)) handler {
    // verify the required parameter 'adGroupIds' is set
    if (adGroupIds == nil) {
        NSParameterAssert(adGroupIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adGroupIds"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAdsApiErrorDomain code:kOAIAdsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/campaign_ad_preview"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adGroupIds != nil) {
        queryParams[@"ad_group_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adGroupIds format: @"multi"];
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
                              responseType: @"NSArray<OAICampaignAdPreview>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICampaignAdPreview>*)data, error);
                                }
                            }];
}



@end
