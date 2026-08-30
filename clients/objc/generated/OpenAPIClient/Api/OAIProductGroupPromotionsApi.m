#import "OAIProductGroupPromotionsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIEntityStatus.h"
#import "OAIGranularity.h"
#import "OAIPinterestLibError.h"
#import "OAIPinterestLibPaginationOrder.h"
#import "OAIProductGroupAnalyticsItems.h"
#import "OAIProductGroupPromotion.h"
#import "OAIProductGroupPromotions.h"
#import "OAIProductGroupPromotionsCreate.h"
#import "OAIProductGroupPromotionsList200Response.h"
#import "OAIProductGroupPromotionsUpdateWithRequiredBody.h"
#import "OAIReportingColumnSync.h"
#import "OAIReportingTimeZone.h"


@interface OAIProductGroupPromotionsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIProductGroupPromotionsApi

NSString* kOAIProductGroupPromotionsApiErrorDomain = @"OAIProductGroupPromotionsApiErrorDomain";
NSInteger kOAIProductGroupPromotionsApiMissingParamErrorCode = 234513;

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
/// Create product group promotions
/// Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param productGroupPromotionsCreate  
///
///  @returns OAIProductGroupPromotions*
///
-(NSURLSessionTask*) productGroupPromotionsCreateWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionsCreate: (OAIProductGroupPromotionsCreate*) productGroupPromotionsCreate
    completionHandler: (void (^)(OAIProductGroupPromotions* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'productGroupPromotionsCreate' is set
    if (productGroupPromotionsCreate == nil) {
        NSParameterAssert(productGroupPromotionsCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupPromotionsCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/product_group_promotions"];

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
    bodyParam = productGroupPromotionsCreate;

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
                              responseType: @"OAIProductGroupPromotions*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProductGroupPromotions*)data, error);
                                }
                            }];
}

///
/// Get a product group promotion by id
/// Get a product group promotion by id
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param productGroupPromotionId Unique identifier of a product group promotion 
///
///  @returns OAIProductGroupPromotion*
///
-(NSURLSessionTask*) productGroupPromotionsGetWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionId: (NSString*) productGroupPromotionId
    completionHandler: (void (^)(OAIProductGroupPromotion* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'productGroupPromotionId' is set
    if (productGroupPromotionId == nil) {
        NSParameterAssert(productGroupPromotionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupPromotionId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (productGroupPromotionId != nil) {
        pathParams[@"product_group_promotion_id"] = productGroupPromotionId;
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
                              responseType: @"OAIProductGroupPromotion*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProductGroupPromotion*)data, error);
                                }
                            }];
}

///
/// Get product group promotions
/// List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param productGroupPromotionIds List of Product group promotion Ids. (optional)
///
///  @param entityStatuses Entity status (optional)
///
///  @param adGroupId Ad group Id. (optional)
///
///  @returns OAIProductGroupPromotionsList200Response*
///
-(NSURLSessionTask*) productGroupPromotionsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    productGroupPromotionIds: (NSArray<NSString*>*) productGroupPromotionIds
    entityStatuses: (NSArray<OAIEntityStatus>*) entityStatuses
    adGroupId: (NSString*) adGroupId
    completionHandler: (void (^)(OAIProductGroupPromotionsList200Response* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/product_group_promotions"];

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
    if (productGroupPromotionIds != nil) {
        queryParams[@"product_group_promotion_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: productGroupPromotionIds format: @"multi"];
    }
    if (entityStatuses != nil) {
        queryParams[@"entity_statuses"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: entityStatuses format: @"multi"];
    }
    if (adGroupId != nil) {
        queryParams[@"ad_group_id"] = adGroupId;
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
                              responseType: @"OAIProductGroupPromotionsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProductGroupPromotionsList200Response*)data, error);
                                }
                            }];
}

///
/// Update product group promotions
/// Update multiple existing Product Group Promotions (by product_group_id)
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param productGroupPromotionsUpdateWithRequiredBody  
///
///  @returns OAIProductGroupPromotions*
///
-(NSURLSessionTask*) productGroupPromotionsUpdateWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionsUpdateWithRequiredBody: (OAIProductGroupPromotionsUpdateWithRequiredBody*) productGroupPromotionsUpdateWithRequiredBody
    completionHandler: (void (^)(OAIProductGroupPromotions* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'productGroupPromotionsUpdateWithRequiredBody' is set
    if (productGroupPromotionsUpdateWithRequiredBody == nil) {
        NSParameterAssert(productGroupPromotionsUpdateWithRequiredBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupPromotionsUpdateWithRequiredBody"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/product_group_promotions"];

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
    bodyParam = productGroupPromotionsUpdateWithRequiredBody;

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
                              responseType: @"OAIProductGroupPromotions*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProductGroupPromotions*)data, error);
                                }
                            }];
}

///
/// Get product group analytics
/// Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
///  @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
///
///  @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
///
///  @param productGroupIds List of Product group Ids to use to filter the results. 
///
///  @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
///
///  @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional, default to @30)
///
///  @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to @30)
///
///  @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional, default to @1)
///
///  @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to @"TIME_OF_AD_ACTION")
///
///  @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
///
///  @returns NSArray<OAIProductGroupAnalyticsItems>*
///
-(NSURLSessionTask*) productGroupsAnalyticsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    productGroupIds: (NSArray<NSString*>*) productGroupIds
    columns: (NSArray<OAIReportingColumnSync>*) columns
    granularity: (OAIGranularity) granularity
    adAccountId: (NSString*) adAccountId
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    reportingTimezone: (OAIReportingTimeZone) reportingTimezone
    completionHandler: (void (^)(NSArray<OAIProductGroupAnalyticsItems>* output, NSError* error)) handler {
    // verify the required parameter 'startDate' is set
    if (startDate == nil) {
        NSParameterAssert(startDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startDate"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endDate' is set
    if (endDate == nil) {
        NSParameterAssert(endDate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endDate"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'productGroupIds' is set
    if (productGroupIds == nil) {
        NSParameterAssert(productGroupIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productGroupIds"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'columns' is set
    if (columns == nil) {
        NSParameterAssert(columns);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"columns"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'granularity' is set
    if (granularity == nil) {
        NSParameterAssert(granularity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"granularity"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductGroupPromotionsApiErrorDomain code:kOAIProductGroupPromotionsApiMissingParamErrorCode userInfo:userInfo];
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
                              responseType: @"NSArray<OAIProductGroupAnalyticsItems>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIProductGroupAnalyticsItems>*)data, error);
                                }
                            }];
}



@end
