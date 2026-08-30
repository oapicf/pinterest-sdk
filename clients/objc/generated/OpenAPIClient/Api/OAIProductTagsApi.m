#import "OAIProductTagsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIPinterestLibError.h"
#import "OAIProductTagsBulkAddRequest.h"
#import "OAIProductTagsBulkDeleteRequest.h"
#import "OAIProductTagsError.h"
#import "OAIProductTagsResponse.h"


@interface OAIProductTagsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIProductTagsApi

NSString* kOAIProductTagsApiErrorDomain = @"OAIProductTagsApiErrorDomain";
NSInteger kOAIProductTagsApiMissingParamErrorCode = 234513;

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
/// Add product tags to pin
/// Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
///  @param pinId Unique identifier of the hero pin that will receive product tags. 
///
///  @param productTagsBulkAddRequest  
///
///  @returns OAIProductTagsResponse*
///
-(NSURLSessionTask*) productTagsBulkAddWithPinId: (NSString*) pinId
    productTagsBulkAddRequest: (OAIProductTagsBulkAddRequest*) productTagsBulkAddRequest
    completionHandler: (void (^)(OAIProductTagsResponse* output, NSError* error)) handler {
    // verify the required parameter 'pinId' is set
    if (pinId == nil) {
        NSParameterAssert(pinId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pinId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductTagsApiErrorDomain code:kOAIProductTagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'productTagsBulkAddRequest' is set
    if (productTagsBulkAddRequest == nil) {
        NSParameterAssert(productTagsBulkAddRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productTagsBulkAddRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProductTagsApiErrorDomain code:kOAIProductTagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins/{pin_id}/product_tags"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (pinId != nil) {
        pathParams[@"pin_id"] = pinId;
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
    bodyParam = productTagsBulkAddRequest;

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
                              responseType: @"OAIProductTagsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProductTagsResponse*)data, error);
                                }
                            }];
}

///
/// Delete product tags from pin
/// Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
///  @param pinId Unique identifier of the hero pin that will receive product tags. 
///
///  @param productTagsBulkDeleteRequest  
///
///  @returns void
///
-(NSURLSessionTask*) productTagsBulkDeleteWithPinId: (NSString*) pinId
    productTagsBulkDeleteRequest: (OAIProductTagsBulkDeleteRequest*) productTagsBulkDeleteRequest
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'pinId' is set
    if (pinId == nil) {
        NSParameterAssert(pinId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pinId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductTagsApiErrorDomain code:kOAIProductTagsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'productTagsBulkDeleteRequest' is set
    if (productTagsBulkDeleteRequest == nil) {
        NSParameterAssert(productTagsBulkDeleteRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"productTagsBulkDeleteRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProductTagsApiErrorDomain code:kOAIProductTagsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins/{pin_id}/product_tags/bulk-delete"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (pinId != nil) {
        pathParams[@"pin_id"] = pinId;
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
    bodyParam = productTagsBulkDeleteRequest;

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Get product tags for pin
/// Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
///  @param pinId Unique identifier of the hero pin that will receive product tags. 
///
///  @returns OAIProductTagsResponse*
///
-(NSURLSessionTask*) productTagsListWithPinId: (NSString*) pinId
    completionHandler: (void (^)(OAIProductTagsResponse* output, NSError* error)) handler {
    // verify the required parameter 'pinId' is set
    if (pinId == nil) {
        NSParameterAssert(pinId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pinId"] };
            NSError* error = [NSError errorWithDomain:kOAIProductTagsApiErrorDomain code:kOAIProductTagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/pins/{pin_id}/product_tags"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (pinId != nil) {
        pathParams[@"pin_id"] = pinId;
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
                              responseType: @"OAIProductTagsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProductTagsResponse*)data, error);
                                }
                            }];
}



@end
