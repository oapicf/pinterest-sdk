#import "OAIAudienceSharingApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAdAccountToAdAccountSharedAudience.h"
#import "OAIAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.h"
#import "OAIAdAccountToBusinessSharedAudience.h"
#import "OAIAdAccountToBusinessSharedAudienceUpdateWithRequiredBody.h"
#import "OAIAdAccountsAudiencesSharedAccountsList200Response.h"
#import "OAIAudienceAccountType.h"
#import "OAIBusinessToAdAccountSharedAudience.h"
#import "OAIBusinessToAdAccountSharedAudienceUpdateWithRequiredBody.h"
#import "OAIBusinessToBusinessSharedAudience.h"
#import "OAIBusinessToBusinessSharedAudienceUpdateWithRequiredBody.h"
#import "OAIOrder.h"
#import "OAIPinterestLibError.h"
#import "OAISharedAudiencesForBusinessList200Response.h"


@interface OAIAudienceSharingApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAudienceSharingApi

NSString* kOAIAudienceSharingApiErrorDomain = @"OAIAudienceSharingApiErrorDomain";
NSInteger kOAIAudienceSharingApiMissingParamErrorCode = 234513;

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
/// List accounts with access to an audience owned by an ad account
/// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
///  @param audienceId Unique identifier of the audience to use to filter the results. 
///
///  @param accountType Filter accounts by account type. 
///
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIAdAccountsAudiencesSharedAccountsList200Response*
///
-(NSURLSessionTask*) adAccountsAudiencesSharedAccountsListWithAudienceId: (NSString*) audienceId
    accountType: (OAIAudienceAccountType) accountType
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIAdAccountsAudiencesSharedAccountsList200Response* output, NSError* error)) handler {
    // verify the required parameter 'audienceId' is set
    if (audienceId == nil) {
        NSParameterAssert(audienceId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audienceId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accountType' is set
    if (accountType == nil) {
        NSParameterAssert(accountType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accountType"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences/shared/accounts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        pathParams[@"ad_account_id"] = adAccountId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (audienceId != nil) {
        queryParams[@"audience_id"] = audienceId;
    }
    if (accountType != nil) {
        queryParams[@"account_type"] = accountType;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
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
                              responseType: @"OAIAdAccountsAudiencesSharedAccountsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdAccountsAudiencesSharedAccountsList200Response*)data, error);
                                }
                            }];
}

///
/// List accounts with access to an audience owned by a business
/// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param audienceId Unique identifier of the audience to use to filter the results. 
///
///  @param accountType Filter accounts by account type. 
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIAdAccountsAudiencesSharedAccountsList200Response*
///
-(NSURLSessionTask*) businessAccountAudiencesSharedAccountsListWithBusinessId: (NSString*) businessId
    audienceId: (NSString*) audienceId
    accountType: (OAIAudienceAccountType) accountType
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIAdAccountsAudiencesSharedAccountsList200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audienceId' is set
    if (audienceId == nil) {
        NSParameterAssert(audienceId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audienceId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accountType' is set
    if (accountType == nil) {
        NSParameterAssert(accountType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accountType"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/audiences/shared/accounts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (audienceId != nil) {
        queryParams[@"audience_id"] = audienceId;
    }
    if (accountType != nil) {
        queryParams[@"account_type"] = accountType;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
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
                              responseType: @"OAIAdAccountsAudiencesSharedAccountsList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdAccountsAudiencesSharedAccountsList200Response*)data, error);
                                }
                            }];
}

///
/// List received audiences for a business
/// Get a list of received audiences for the given business.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAISharedAudiencesForBusinessList200Response*
///
-(NSURLSessionTask*) sharedAudiencesForBusinessListWithBusinessId: (NSString*) businessId
    order: (OAIOrder) order
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAISharedAudiencesForBusinessList200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/audiences"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
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
                              responseType: @"OAISharedAudiencesForBusinessList200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISharedAudiencesForBusinessList200Response*)data, error);
                                }
                            }];
}

///
/// Update audience sharing between ad accounts
/// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adAccountToAdAccountSharedAudienceUpdateWithRequiredBody  
///
///  @returns OAIAdAccountToAdAccountSharedAudience*
///
-(NSURLSessionTask*) updateAdAccountToAdAccountSharedAudienceWithAdAccountId: (NSString*) adAccountId
    adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: (OAIAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody*) adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    completionHandler: (void (^)(OAIAdAccountToAdAccountSharedAudience* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountToAdAccountSharedAudienceUpdateWithRequiredBody' is set
    if (adAccountToAdAccountSharedAudienceUpdateWithRequiredBody == nil) {
        NSParameterAssert(adAccountToAdAccountSharedAudienceUpdateWithRequiredBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountToAdAccountSharedAudienceUpdateWithRequiredBody"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"];

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
    bodyParam = adAccountToAdAccountSharedAudienceUpdateWithRequiredBody;

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
                              responseType: @"OAIAdAccountToAdAccountSharedAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdAccountToAdAccountSharedAudience*)data, error);
                                }
                            }];
}

///
/// Update audience sharing from an ad account to businesses
/// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
///  @param adAccountId Unique identifier of an ad account. 
///
///  @param adAccountToBusinessSharedAudienceUpdateWithRequiredBody  
///
///  @returns OAIAdAccountToBusinessSharedAudience*
///
-(NSURLSessionTask*) updateAdAccountToBusinessSharedAudienceWithAdAccountId: (NSString*) adAccountId
    adAccountToBusinessSharedAudienceUpdateWithRequiredBody: (OAIAdAccountToBusinessSharedAudienceUpdateWithRequiredBody*) adAccountToBusinessSharedAudienceUpdateWithRequiredBody
    completionHandler: (void (^)(OAIAdAccountToBusinessSharedAudience* output, NSError* error)) handler {
    // verify the required parameter 'adAccountId' is set
    if (adAccountId == nil) {
        NSParameterAssert(adAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'adAccountToBusinessSharedAudienceUpdateWithRequiredBody' is set
    if (adAccountToBusinessSharedAudienceUpdateWithRequiredBody == nil) {
        NSParameterAssert(adAccountToBusinessSharedAudienceUpdateWithRequiredBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adAccountToBusinessSharedAudienceUpdateWithRequiredBody"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/ad_accounts/{ad_account_id}/audiences/businesses/shared"];

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
    bodyParam = adAccountToBusinessSharedAudienceUpdateWithRequiredBody;

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
                              responseType: @"OAIAdAccountToBusinessSharedAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdAccountToBusinessSharedAudience*)data, error);
                                }
                            }];
}

///
/// Update audience sharing from a business to ad accounts
/// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
///  @param businessId Unique identifier of the requesting business. 
///
///  @param businessToAdAccountSharedAudienceUpdateWithRequiredBody  
///
///  @returns OAIBusinessToAdAccountSharedAudience*
///
-(NSURLSessionTask*) updateBusinessToAdAccountSharedAudienceWithBusinessId: (NSString*) businessId
    businessToAdAccountSharedAudienceUpdateWithRequiredBody: (OAIBusinessToAdAccountSharedAudienceUpdateWithRequiredBody*) businessToAdAccountSharedAudienceUpdateWithRequiredBody
    completionHandler: (void (^)(OAIBusinessToAdAccountSharedAudience* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'businessToAdAccountSharedAudienceUpdateWithRequiredBody' is set
    if (businessToAdAccountSharedAudienceUpdateWithRequiredBody == nil) {
        NSParameterAssert(businessToAdAccountSharedAudienceUpdateWithRequiredBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessToAdAccountSharedAudienceUpdateWithRequiredBody"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/audiences/ad_accounts/shared"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
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
    bodyParam = businessToAdAccountSharedAudienceUpdateWithRequiredBody;

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
                              responseType: @"OAIBusinessToAdAccountSharedAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessToAdAccountSharedAudience*)data, error);
                                }
                            }];
}

///
/// Update audience sharing between businesses
/// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
///  @param businessId Unique identifier of the requesting business. 
///
///  @param businessToBusinessSharedAudienceUpdateWithRequiredBody  
///
///  @returns OAIBusinessToBusinessSharedAudience*
///
-(NSURLSessionTask*) updateBusinessToBusinessSharedAudienceWithBusinessId: (NSString*) businessId
    businessToBusinessSharedAudienceUpdateWithRequiredBody: (OAIBusinessToBusinessSharedAudienceUpdateWithRequiredBody*) businessToBusinessSharedAudienceUpdateWithRequiredBody
    completionHandler: (void (^)(OAIBusinessToBusinessSharedAudience* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'businessToBusinessSharedAudienceUpdateWithRequiredBody' is set
    if (businessToBusinessSharedAudienceUpdateWithRequiredBody == nil) {
        NSParameterAssert(businessToBusinessSharedAudienceUpdateWithRequiredBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessToBusinessSharedAudienceUpdateWithRequiredBody"] };
            NSError* error = [NSError errorWithDomain:kOAIAudienceSharingApiErrorDomain code:kOAIAudienceSharingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/audiences/businesses/shared"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
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
    bodyParam = businessToBusinessSharedAudienceUpdateWithRequiredBody;

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
                              responseType: @"OAIBusinessToBusinessSharedAudience*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessToBusinessSharedAudience*)data, error);
                                }
                            }];
}



@end
