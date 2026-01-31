#import "OAIProductCategoriesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAgeTrendsBucket.h"
#import "OAIFeaturedTrend.h"
#import "OAIGenderBucket.h"
#import "OAIInterestsEnum.h"
#import "OAIPinterestLibError.h"
#import "OAIProductCategoriesEngagementType.h"
#import "OAIProductCategoryDetailLookbackWindow.h"
#import "OAIProductCategoryDetails.h"
#import "OAIProductCategoryEnum.h"
#import "OAIProductCategoryRegion.h"
#import "OAITrendingProductCategory.h"
#import "OAIVerticalProductCategory.h"


@interface OAIProductCategoriesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIProductCategoriesApi

NSString* kOAIProductCategoriesApiErrorDomain = @"OAIProductCategoriesApiErrorDomain";
NSInteger kOAIProductCategoriesApiMissingParamErrorCode = 234513;

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
/// Get featured topics
///   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
///  @param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada 
///
///  @param interest Interest to filter by (optional)
///
///  @returns NSArray<OAIFeaturedTrend>*
///
-(NSURLSessionTask*) trendsFeaturedTopicsListWithRegion: (OAIProductCategoryRegion) region
    interest: (OAIInterestsEnum) interest
    completionHandler: (void (^)(NSArray<OAIFeaturedTrend>* output, NSError* error)) handler {
    // verify the required parameter 'region' is set
    if (region == nil) {
        NSParameterAssert(region);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"region"] };
            NSError* error = [NSError errorWithDomain:kOAIProductCategoriesApiErrorDomain code:kOAIProductCategoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trends/topics/featured"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (interest != nil) {
        queryParams[@"interest"] = interest;
    }
    if (region != nil) {
        queryParams[@"region"] = region;
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
                              responseType: @"NSArray<OAIFeaturedTrend>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIFeaturedTrend>*)data, error);
                                }
                            }];
}

///
/// Get product category details
///   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
///  @param productCategories List of product categories 
///
///  @param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada 
///
///  @param lookbackWindow    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
///
///  @param engagementType      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)
///
///  @returns NSArray<OAIProductCategoryDetails>*
///
-(NSURLSessionTask*) trendsProductCategoriesDetailsListWithProductCategories: (NSArray<OAIProductCategoryEnum>*) productCategories
    region: (OAIProductCategoryRegion) region
    lookbackWindow: (OAIProductCategoryDetailLookbackWindow) lookbackWindow
    engagementType: (OAIProductCategoriesEngagementType) engagementType
    completionHandler: (void (^)(NSArray<OAIProductCategoryDetails>* output, NSError* error)) handler {
    // verify the required parameter 'productCategories' is set
    if (productCategories == nil) {
        NSParameterAssert(productCategories);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productCategories"] };
            NSError* error = [NSError errorWithDomain:kOAIProductCategoriesApiErrorDomain code:kOAIProductCategoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'region' is set
    if (region == nil) {
        NSParameterAssert(region);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"region"] };
            NSError* error = [NSError errorWithDomain:kOAIProductCategoriesApiErrorDomain code:kOAIProductCategoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trends/product_categories/details"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (productCategories != nil) {
        queryParams[@"product_categories"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: productCategories format: @"multi"];
    }
    if (region != nil) {
        queryParams[@"region"] = region;
    }
    if (lookbackWindow != nil) {
        queryParams[@"lookback_window"] = lookbackWindow;
    }
    if (engagementType != nil) {
        queryParams[@"engagement_type"] = engagementType;
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
                              responseType: @"NSArray<OAIProductCategoryDetails>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIProductCategoryDetails>*)data, error);
                                }
                            }];
}

///
/// Get a list of growing Shopping Product Categories
///   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
///  @param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada 
///
///  @param verticals List of verticals to filter by (optional)
///
///  @param ages Age to filter by. If not provided, the results will be filtered by all ages. (optional)
///
///  @param genders Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
///
///  @param engagementType      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)
///
///  @returns NSArray<OAITrendingProductCategory>*
///
-(NSURLSessionTask*) trendsProductCategoriesTrendingListWithRegion: (OAIProductCategoryRegion) region
    verticals: (NSArray<OAIVerticalProductCategory>*) verticals
    ages: (NSArray<OAIAgeTrendsBucket>*) ages
    genders: (NSArray<OAIGenderBucket>*) genders
    engagementType: (OAIProductCategoriesEngagementType) engagementType
    completionHandler: (void (^)(NSArray<OAITrendingProductCategory>* output, NSError* error)) handler {
    // verify the required parameter 'region' is set
    if (region == nil) {
        NSParameterAssert(region);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"region"] };
            NSError* error = [NSError errorWithDomain:kOAIProductCategoriesApiErrorDomain code:kOAIProductCategoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/trends/product_categories/trending"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (region != nil) {
        queryParams[@"region"] = region;
    }
    if (verticals != nil) {
        queryParams[@"verticals"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: verticals format: @"multi"];
    }
    if (ages != nil) {
        queryParams[@"ages"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: ages format: @"multi"];
    }
    if (genders != nil) {
        queryParams[@"genders"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: genders format: @"multi"];
    }
    if (engagementType != nil) {
        queryParams[@"engagement_type"] = engagementType;
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
                              responseType: @"NSArray<OAITrendingProductCategory>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAITrendingProductCategory>*)data, error);
                                }
                            }];
}



@end
