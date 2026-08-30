#import "OAIBusinessAccessRelationshipsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIBrandAccount.h"
#import "OAIBrandAccountCreate.h"
#import "OAIBrandAccountUpdate.h"
#import "OAIBusinessMembershipMember.h"
#import "OAIDeleteBusinessMembership200Response.h"
#import "OAIDeleteBusinessMembershipBody.h"
#import "OAIDeleteBusinessPartners.h"
#import "OAIDeleteBusinessPartnersDelete.h"
#import "OAIGetBusinessEmployers200Response.h"
#import "OAIMemberBusinessRole.h"
#import "OAIPartnerType.h"
#import "OAIPinterestLibError.h"
#import "OAISystemUserUpdateWithRequiredBody.h"
#import "OAIUpdateBusinessMembershipsResponse.h"


@interface OAIBusinessAccessRelationshipsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIBusinessAccessRelationshipsApi

NSString* kOAIBusinessAccessRelationshipsApiErrorDomain = @"OAIBusinessAccessRelationshipsApiErrorDomain";
NSInteger kOAIBusinessAccessRelationshipsApiMissingParamErrorCode = 234513;

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
/// Create a Brand Account
/// Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
///  @param businessHierarchyId business hierarchy node id 
///
///  @param brandAccountCreate  
///
///  @returns OAIBrandAccount*
///
-(NSURLSessionTask*) brandAccountsCreateWithBusinessHierarchyId: (NSString*) businessHierarchyId
    brandAccountCreate: (OAIBrandAccountCreate*) brandAccountCreate
    completionHandler: (void (^)(OAIBrandAccount* output, NSError* error)) handler {
    // verify the required parameter 'businessHierarchyId' is set
    if (businessHierarchyId == nil) {
        NSParameterAssert(businessHierarchyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessHierarchyId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'brandAccountCreate' is set
    if (brandAccountCreate == nil) {
        NSParameterAssert(brandAccountCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"brandAccountCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessHierarchyId != nil) {
        pathParams[@"business_hierarchy_id"] = businessHierarchyId;
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
    bodyParam = brandAccountCreate;

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
                              responseType: @"OAIBrandAccount*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBrandAccount*)data, error);
                                }
                            }];
}

///
/// Update a Brand Account
/// Update an existing Brand Account
///  @param brandAccountId  
///
///  @param businessHierarchyId business hierarchy node id 
///
///  @param brandAccountUpdate  
///
///  @returns OAIBrandAccount*
///
-(NSURLSessionTask*) brandAccountsUpdateWithBrandAccountId: (NSString*) brandAccountId
    businessHierarchyId: (NSString*) businessHierarchyId
    brandAccountUpdate: (OAIBrandAccountUpdate*) brandAccountUpdate
    completionHandler: (void (^)(OAIBrandAccount* output, NSError* error)) handler {
    // verify the required parameter 'brandAccountId' is set
    if (brandAccountId == nil) {
        NSParameterAssert(brandAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"brandAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'businessHierarchyId' is set
    if (businessHierarchyId == nil) {
        NSParameterAssert(businessHierarchyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessHierarchyId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'brandAccountUpdate' is set
    if (brandAccountUpdate == nil) {
        NSParameterAssert(brandAccountUpdate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"brandAccountUpdate"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (brandAccountId != nil) {
        pathParams[@"brand_account_id"] = brandAccountId;
    }
    if (businessHierarchyId != nil) {
        pathParams[@"business_hierarchy_id"] = businessHierarchyId;
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
    bodyParam = brandAccountUpdate;

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
                              responseType: @"OAIBrandAccount*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBrandAccount*)data, error);
                                }
                            }];
}

///
/// Terminate business memberships
/// Terminate memberships between the specified members and your business.
///  @param businessId Business id 
///
///  @param deleteBusinessMembershipBody  
///
///  @returns OAIDeleteBusinessMembership200Response*
///
-(NSURLSessionTask*) deleteBusinessMembershipWithBusinessId: (NSString*) businessId
    deleteBusinessMembershipBody: (OAIDeleteBusinessMembershipBody*) deleteBusinessMembershipBody
    completionHandler: (void (^)(OAIDeleteBusinessMembership200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'deleteBusinessMembershipBody' is set
    if (deleteBusinessMembershipBody == nil) {
        NSParameterAssert(deleteBusinessMembershipBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"deleteBusinessMembershipBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/members"];

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
    bodyParam = deleteBusinessMembershipBody;

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
                              responseType: @"OAIDeleteBusinessMembership200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteBusinessMembership200Response*)data, error);
                                }
                            }];
}

///
/// Terminate business partnerships
/// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param deleteBusinessPartnersDelete  
///
///  @returns OAIDeleteBusinessPartners*
///
-(NSURLSessionTask*) deleteBusinessPartnersWithBusinessId: (NSString*) businessId
    deleteBusinessPartnersDelete: (OAIDeleteBusinessPartnersDelete*) deleteBusinessPartnersDelete
    completionHandler: (void (^)(OAIDeleteBusinessPartners* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'deleteBusinessPartnersDelete' is set
    if (deleteBusinessPartnersDelete == nil) {
        NSParameterAssert(deleteBusinessPartnersDelete);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"deleteBusinessPartnersDelete"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/partners"];

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
    bodyParam = deleteBusinessPartnersDelete;

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
                              responseType: @"OAIDeleteBusinessPartners*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteBusinessPartners*)data, error);
                                }
                            }];
}

///
/// List business employers for user
/// Get all of the viewing user's business employers.
///  @param assetsSummary Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional, default to @(YES))
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIGetBusinessEmployers200Response*
///
-(NSURLSessionTask*) getBusinessEmployersWithAssetsSummary: (NSNumber*) assetsSummary
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/employers"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (assetsSummary != nil) {
        queryParams[@"assets_summary"] = [assetsSummary isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAIGetBusinessEmployers200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetBusinessEmployers200Response*)data, error);
                                }
                            }];
}

///
/// Get business members
/// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
///  @param businessId Unique identifier of the requesting business. 
///
///  @param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False. (optional, default to @(NO))
///
///  @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional, default to @(NO))
///
///  @param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
///
///  @param memberIds A list of business members ids separated by comma. (optional)
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIGetBusinessEmployers200Response*
///
-(NSURLSessionTask*) getBusinessMembersWithBusinessId: (NSString*) businessId
    fetchSystemUsers: (NSNumber*) fetchSystemUsers
    assetsSummary: (NSNumber*) assetsSummary
    businessRoles: (NSArray<OAIMemberBusinessRole>*) businessRoles
    memberIds: (NSString*) memberIds
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/members"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (fetchSystemUsers != nil) {
        queryParams[@"fetch_system_users"] = [fetchSystemUsers isEqual:@(YES)] ? @"true" : @"false";
    }
    if (assetsSummary != nil) {
        queryParams[@"assets_summary"] = [assetsSummary isEqual:@(YES)] ? @"true" : @"false";
    }
    if (businessRoles != nil) {
        queryParams[@"business_roles"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: businessRoles format: @"multi"];
    }
    if (memberIds != nil) {
        queryParams[@"member_ids"] = memberIds;
    }
    if (startIndex != nil) {
        queryParams[@"start_index"] = startIndex;
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
                              responseType: @"OAIGetBusinessEmployers200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetBusinessEmployers200Response*)data, error);
                                }
                            }];
}

///
/// Get business partners
/// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional, default to @(NO))
///
///  @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
///
///  @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param sortAscending Sort ascending. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIGetBusinessEmployers200Response*
///
-(NSURLSessionTask*) getBusinessPartnersWithBusinessId: (NSString*) businessId
    assetsSummary: (NSNumber*) assetsSummary
    partnerType: (OAIPartnerType) partnerType
    partnerIds: (NSString*) partnerIds
    startIndex: (NSNumber*) startIndex
    sortAscending: (NSNumber*) sortAscending
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/partners"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (assetsSummary != nil) {
        queryParams[@"assets_summary"] = [assetsSummary isEqual:@(YES)] ? @"true" : @"false";
    }
    if (partnerType != nil) {
        queryParams[@"partner_type"] = partnerType;
    }
    if (partnerIds != nil) {
        queryParams[@"partner_ids"] = partnerIds;
    }
    if (startIndex != nil) {
        queryParams[@"start_index"] = startIndex;
    }
    if (sortAscending != nil) {
        queryParams[@"sort_ascending"] = [sortAscending isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAIGetBusinessEmployers200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetBusinessEmployers200Response*)data, error);
                                }
                            }];
}

///
/// Update a system user information.
/// Update a system user information such as name.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param systemUserId Unique identifier of a system user. 
///
///  @param systemUserUpdateWithRequiredBody  
///
///  @returns void
///
-(NSURLSessionTask*) systemUserUpdateWithBusinessId: (NSString*) businessId
    systemUserId: (NSString*) systemUserId
    systemUserUpdateWithRequiredBody: (OAISystemUserUpdateWithRequiredBody*) systemUserUpdateWithRequiredBody
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'systemUserId' is set
    if (systemUserId == nil) {
        NSParameterAssert(systemUserId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"systemUserId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'systemUserUpdateWithRequiredBody' is set
    if (systemUserUpdateWithRequiredBody == nil) {
        NSParameterAssert(systemUserUpdateWithRequiredBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"systemUserUpdateWithRequiredBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/system_users/{system_user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }
    if (systemUserId != nil) {
        pathParams[@"system_user_id"] = systemUserId;
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
    bodyParam = systemUserUpdateWithRequiredBody;

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Update member's business role
/// Update a member's business role within the business.
///  @param businessId Business id 
///
///  @param businessMembershipMember  
///
///  @returns OAIUpdateBusinessMembershipsResponse*
///
-(NSURLSessionTask*) updateBusinessMembershipsWithBusinessId: (NSString*) businessId
    businessMembershipMember: (NSArray<OAIBusinessMembershipMember>*) businessMembershipMember
    completionHandler: (void (^)(OAIUpdateBusinessMembershipsResponse* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'businessMembershipMember' is set
    if (businessMembershipMember == nil) {
        NSParameterAssert(businessMembershipMember);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessMembershipMember"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessRelationshipsApiErrorDomain code:kOAIBusinessAccessRelationshipsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/members"];

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
    bodyParam = businessMembershipMember;

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
                              responseType: @"OAIUpdateBusinessMembershipsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUpdateBusinessMembershipsResponse*)data, error);
                                }
                            }];
}



@end
