#import "OAITermsOfServiceApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIError.h"
#import "OAITermsOfService.h"


@interface OAITermsOfServiceApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAITermsOfServiceApi

NSString* kOAITermsOfServiceApiErrorDomain = @"OAITermsOfServiceApiErrorDomain";
NSInteger kOAITermsOfServiceApiMissingParamErrorCode = 234513;

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
/// Get terms of service
/// Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param includeHtml Return HTML in TOS text. (optional, default to @(NO))
///
///  @param tosType Request type. (optional)
///
///  @returns OAITermsOfService*
///
-(NSURLSessionTask*) termsOfServiceGetWithAdAccountId: (NSString*) adAccountId
    includeHtml: (NSNumber*) includeHtml
    tosType: (NSString*) tosType
    completionHandler: (void (^)(OAITermsOfService* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAITermsOfServiceApiErrorDomain code:kOAITermsOfServiceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/terms_of_service"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (includeHtml != nil) {
        queryParams[@"include_html"] = [includeHtml isEqual:@(YES)] ? @"true" : @"false";
    }
    if (tosType != nil) {
        queryParams[@"tos_type"] = tosType;
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
                              responseType: @"OAITermsOfService*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITermsOfService*)data, error);
                                }
                            }];
}



@end
