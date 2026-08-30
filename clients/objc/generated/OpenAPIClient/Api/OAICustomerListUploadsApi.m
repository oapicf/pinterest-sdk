#import "OAICustomerListUploadsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICustomerListUpload.h"
#import "OAICustomerListUploadCreateRequest.h"
#import "OAICustomerListUploadCreateResponse.h"
#import "OAIPinterestLibError.h"


@interface OAICustomerListUploadsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAICustomerListUploadsApi

NSString* kOAICustomerListUploadsApiErrorDomain = @"OAICustomerListUploadsApiErrorDomain";
NSInteger kOAICustomerListUploadsApiMissingParamErrorCode = 234513;

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
/// Create customer list upload
/// Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
///  @param adAccountId  
///
///  @param customerListId Customer list ID. 
///
///  @param customerListUploadCreateRequest  
///
///  @returns OAICustomerListUploadCreateResponse*
///
-(NSURLSessionTask*) customerListUploadsCreateWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUploadCreateRequest: (OAICustomerListUploadCreateRequest*) customerListUploadCreateRequest
    completionHandler: (void (^)(OAICustomerListUploadCreateResponse* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'customerListId' is set
    if (customerListId == nil) {
        NSParameterAssert(customerListId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"customerListId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'customerListUploadCreateRequest' is set
    if (customerListUploadCreateRequest == nil) {
        NSParameterAssert(customerListUploadCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"customerListUploadCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (customerListId != nil) {
        pathParams[@"customer_list_id"] = customerListId;
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
    bodyParam = customerListUploadCreateRequest;

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
                              responseType: @"OAICustomerListUploadCreateResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICustomerListUploadCreateResponse*)data, error);
                                }
                            }];
}

///
/// Get customer list upload
/// Get the metadata for a given upload by its ID.
///  @param adAccountId  
///
///  @param customerListId Customer list ID. 
///
///  @param customerListUploadId Customer List Upload ID. 
///
///  @returns OAICustomerListUpload*
///
-(NSURLSessionTask*) customerListUploadsGetWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUploadId: (NSString*) customerListUploadId
    completionHandler: (void (^)(OAICustomerListUpload* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'customerListId' is set
    if (customerListId == nil) {
        NSParameterAssert(customerListId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"customerListId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'customerListUploadId' is set
    if (customerListUploadId == nil) {
        NSParameterAssert(customerListUploadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"customerListUploadId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (customerListId != nil) {
        pathParams[@"customer_list_id"] = customerListId;
    }
    if (customerListUploadId != nil) {
        pathParams[@"customer_list_upload_id"] = customerListUploadId;
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
                              responseType: @"OAICustomerListUpload*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICustomerListUpload*)data, error);
                                }
                            }];
}

///
/// Run customer list upload
/// Begin processing a customer list upload.
///  @param adAccountId  
///
///  @param customerListId Customer list ID. 
///
///  @param customerListUploadId Customer List Upload ID. 
///
///  @returns OAICustomerListUpload*
///
-(NSURLSessionTask*) customerListUploadsRunWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUploadId: (NSString*) customerListUploadId
    completionHandler: (void (^)(OAICustomerListUpload* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'customerListId' is set
    if (customerListId == nil) {
        NSParameterAssert(customerListId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"customerListId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'customerListUploadId' is set
    if (customerListUploadId == nil) {
        NSParameterAssert(customerListUploadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"customerListUploadId"] };
            NSError* error = [NSError errorWithDomain:kOAICustomerListUploadsApiErrorDomain code:kOAICustomerListUploadsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }
    if (customerListId != nil) {
        pathParams[@"customer_list_id"] = customerListId;
    }
    if (customerListUploadId != nil) {
        pathParams[@"customer_list_upload_id"] = customerListUploadId;
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
                              responseType: @"OAICustomerListUpload*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICustomerListUpload*)data, error);
                                }
                            }];
}



@end
