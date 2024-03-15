#import "OAIKeywordsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIError.h"
#import "OAIKeywordUpdateBody.h"
#import "OAIKeywordsGet200Response.h"
#import "OAIKeywordsMetricsArrayResponse.h"
#import "OAIKeywordsRequest.h"
#import "OAIKeywordsResponse.h"
#import "OAIMatchType.h"
#import "OAITrendType.h"
#import "OAITrendingKeywordsResponse.h"
#import "OAITrendsSupportedRegion.h"


@interface OAIKeywordsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIKeywordsApi

NSString* kOAIKeywordsApiErrorDomain = @"OAIKeywordsApiErrorDomain";
NSInteger kOAIKeywordsApiMissingParamErrorCode = 234513;

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
/// Get country's keyword metrics
/// See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param countryCode Two letter country code (ISO 3166-1 alpha-2) 
///
///  @param keywords Comma-separated keywords 
///
///  @returns OAIKeywordsMetricsArrayResponse*
///
-(NSURLSessionTask*) countryKeywordsMetricsGetWithAdAccountId: (NSString*) adAccountId
    countryCode: (NSString*) countryCode
    keywords: (NSArray<NSString*>*) keywords
    completionHandler: (void (^)(OAIKeywordsMetricsArrayResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'countryCode' is set
    if (countryCode == nil) {
        NSParameterAssert(countryCode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"countryCode"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'keywords' is set
    if (keywords == nil) {
        NSParameterAssert(keywords);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keywords"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/keywords/metrics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (countryCode != nil) {
        queryParams[@"country_code"] = countryCode;
    }
    if (keywords != nil) {
        queryParams[@"keywords"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: keywords format: @"csv"];
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
                              responseType: @"OAIKeywordsMetricsArrayResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIKeywordsMetricsArrayResponse*)data, error);
                                }
                            }];
}

///
/// Create keywords
/// <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param keywordsRequest  
///
///  @returns OAIKeywordsResponse*
///
-(NSURLSessionTask*) keywordsCreateWithAdAccountId: (NSString*) adAccountId
    keywordsRequest: (OAIKeywordsRequest*) keywordsRequest
    completionHandler: (void (^)(OAIKeywordsResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'keywordsRequest' is set
    if (keywordsRequest == nil) {
        NSParameterAssert(keywordsRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keywordsRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/keywords"];

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
    bodyParam = keywordsRequest;

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
                              responseType: @"OAIKeywordsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIKeywordsResponse*)data, error);
                                }
                            }];
}

///
/// Get keywords
/// <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param campaignId Campaign Id to use to filter the results. (optional)
///
///  @param adGroupId Ad group Id. (optional)
///
///  @param matchTypes Keyword <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type</a> (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIKeywordsGet200Response*
///
-(NSURLSessionTask*) keywordsGetWithAdAccountId: (NSString*) adAccountId
    campaignId: (NSString*) campaignId
    adGroupId: (NSString*) adGroupId
    matchTypes: (NSArray<OAIMatchType>*) matchTypes
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIKeywordsGet200Response* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/keywords"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (campaignId != nil) {
        queryParams[@"campaign_id"] = campaignId;
    }
    if (adGroupId != nil) {
        queryParams[@"ad_group_id"] = adGroupId;
    }
    if (matchTypes != nil) {
        queryParams[@"match_types"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: matchTypes format: @"multi"];
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
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
                              responseType: @"OAIKeywordsGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIKeywordsGet200Response*)data, error);
                                }
                            }];
}

///
/// Update keywords
/// <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param keywordUpdateBody  
///
///  @returns OAIKeywordsResponse*
///
-(NSURLSessionTask*) keywordsUpdateWithAdAccountId: (NSString*) adAccountId
    keywordUpdateBody: (OAIKeywordUpdateBody*) keywordUpdateBody
    completionHandler: (void (^)(OAIKeywordsResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'keywordUpdateBody' is set
    if (keywordUpdateBody == nil) {
        NSParameterAssert(keywordUpdateBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keywordUpdateBody"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/keywords"];

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
    bodyParam = keywordUpdateBody;

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
                              responseType: @"OAIKeywordsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIKeywordsResponse*)data, error);
                                }
                            }];
}

///
/// List trending keywords
/// <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
///  @param region The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia 
///
///  @param trendType The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) 
///
///  @param interests If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion (optional)
///
///  @param genders If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings. (optional)
///
///  @param ages If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned. (optional)
///
///  @param normalizeAgainstGroup Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional, default to @(NO))
///
///  @param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. (optional, default to @50)
///
///  @returns OAITrendingKeywordsResponse*
///
-(NSURLSessionTask*) trendingKeywordsListWithRegion: (OAITrendsSupportedRegion) region
    trendType: (OAITrendType) trendType
    interests: (NSArray<NSString*>*) interests
    genders: (NSArray<NSString*>*) genders
    ages: (NSArray<NSString*>*) ages
    normalizeAgainstGroup: (NSNumber*) normalizeAgainstGroup
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAITrendingKeywordsResponse* output, NSError* error)) handler {
    // verify the required parameter 'region' is set
    if (region == nil) {
        NSParameterAssert(region);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"region"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'trendType' is set
    if (trendType == nil) {
        NSParameterAssert(trendType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"trendType"] };
            NSError* error = [NSError errorWithDomain:kOAIKeywordsApiErrorDomain code:kOAIKeywordsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trends/keywords/{region}/top/{trend_type}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (region != nil) {
        pathParams[@"region"] = region;
    }
    if (trendType != nil) {
        pathParams[@"trend_type"] = trendType;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (interests != nil) {
        queryParams[@"interests"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: interests format: @"multi"];
    }
    if (genders != nil) {
        queryParams[@"genders"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: genders format: @"multi"];
    }
    if (ages != nil) {
        queryParams[@"ages"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: ages format: @"multi"];
    }
    if (normalizeAgainstGroup != nil) {
        queryParams[@"normalize_against_group"] = [normalizeAgainstGroup isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAITrendingKeywordsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITrendingKeywordsResponse*)data, error);
                                }
                            }];
}



@end
