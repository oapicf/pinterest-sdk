#import "OAIConversionEqsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIEventQualityScore.h"
#import "OAIIngestionSourceOptions.h"
#import "OAILookbackPeriodOptions.h"
#import "OAIPinterestLibError.h"
#import "OAISourcePlatformOptions.h"


@interface OAIConversionEqsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIConversionEqsApi

NSString* kOAIConversionEqsApiErrorDomain = @"OAIConversionEqsApiErrorDomain";
NSInteger kOAIConversionEqsApiMissingParamErrorCode = 234513;

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
/// Get event quality score (EQS)
/// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
///  @param lookbackPeriod Lookback window (number of days). 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param sourcePlatform Source platform of event. (optional)
///
///  @param ingestionSource Ingestion source of event. (optional)
///
///  @returns NSArray<OAIEventQualityScore>*
///
-(NSURLSessionTask*) conversionEqsListWithLookbackPeriod: (OAILookbackPeriodOptions) lookbackPeriod
    adAccountId: (NSString*) adAccountId
    sourcePlatform: (OAISourcePlatformOptions) sourcePlatform
    ingestionSource: (OAIIngestionSourceOptions) ingestionSource
    completionHandler: (void (^)(NSArray<OAIEventQualityScore>* output, NSError* error)) handler {
    // verify the required parameter 'lookbackPeriod' is set
    if (lookbackPeriod == nil) {
        NSParameterAssert(lookbackPeriod);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"lookbackPeriod"] };
            NSError* error = [NSError errorWithDomain:kOAIConversionEqsApiErrorDomain code:kOAIConversionEqsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIConversionEqsApiErrorDomain code:kOAIConversionEqsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/conversion_eqs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (lookbackPeriod != nil) {
        queryParams[@"lookback_period"] = lookbackPeriod;
    }
    if (sourcePlatform != nil) {
        queryParams[@"source_platform"] = sourcePlatform;
    }
    if (ingestionSource != nil) {
        queryParams[@"ingestion_source"] = ingestionSource;
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
                              responseType: @"NSArray<OAIEventQualityScore>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIEventQualityScore>*)data, error);
                                }
                            }];
}



@end
