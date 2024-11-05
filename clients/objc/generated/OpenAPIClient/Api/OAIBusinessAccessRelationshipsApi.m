#import "OAIBusinessAccessRelationshipsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIDeletePartnersRequest.h"
#import "OAIDeletePartnersResponse.h"
#import "OAIDeletedMembersResponse.h"
#import "OAIError.h"
#import "OAIGetBusinessEmployers200Response.h"
#import "OAIGetBusinessMembers200Response.h"
#import "OAIGetBusinessPartners200Response.h"
#import "OAIMemberBusinessRole.h"
#import "OAIMembersToDeleteBody.h"
#import "OAIPartnerType.h"
#import "OAIUpdateMemberBusinessRoleBody.h"
#import "OAIUpdateMemberResultsResponseArray.h"


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
/// Terminate business memberships
/// Terminate memberships between the specified members and your business.
///  @param businessId Business id 
///
///  @param membersToDeleteBody List of members with role to delete. 
///
///  @returns OAIDeletedMembersResponse*
///
-(NSURLSessionTask*) deleteBusinessMembershipWithBusinessId: (NSString*) businessId
    membersToDeleteBody: (OAIMembersToDeleteBody*) membersToDeleteBody
    completionHandler: (void (^)(OAIDeletedMembersResponse* output, NSError* error)) handler {
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

    // verify the required parameter 'membersToDeleteBody' is set
    if (membersToDeleteBody == nil) {
        NSParameterAssert(membersToDeleteBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"membersToDeleteBody"] };
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
    bodyParam = membersToDeleteBody;

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
                              responseType: @"OAIDeletedMembersResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeletedMembersResponse*)data, error);
                                }
                            }];
}

///
/// Terminate business partnerships
/// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param deletePartnersRequest An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete.  
///
///  @returns OAIDeletePartnersResponse*
///
-(NSURLSessionTask*) deleteBusinessPartnersWithBusinessId: (NSString*) businessId
    deletePartnersRequest: (OAIDeletePartnersRequest*) deletePartnersRequest
    completionHandler: (void (^)(OAIDeletePartnersResponse* output, NSError* error)) handler {
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

    // verify the required parameter 'deletePartnersRequest' is set
    if (deletePartnersRequest == nil) {
        NSParameterAssert(deletePartnersRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"deletePartnersRequest"] };
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
    bodyParam = deletePartnersRequest;

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
                              responseType: @"OAIDeletePartnersResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeletePartnersResponse*)data, error);
                                }
                            }];
}

///
/// List business employers for user
/// Get all of the viewing user's business employers.
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIGetBusinessEmployers200Response*
///
-(NSURLSessionTask*) getBusinessEmployersWithPageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/employers"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIGetBusinessMembers200Response*
///
-(NSURLSessionTask*) getBusinessMembersWithBusinessId: (NSString*) businessId
    assetsSummary: (NSNumber*) assetsSummary
    businessRoles: (NSArray<OAIMemberBusinessRole>*) businessRoles
    memberIds: (NSString*) memberIds
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetBusinessMembers200Response* output, NSError* error)) handler {
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
                              responseType: @"OAIGetBusinessMembers200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetBusinessMembers200Response*)data, error);
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
///  @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
///
///  @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIGetBusinessPartners200Response*
///
-(NSURLSessionTask*) getBusinessPartnersWithBusinessId: (NSString*) businessId
    assetsSummary: (NSNumber*) assetsSummary
    partnerType: (OAIPartnerType) partnerType
    partnerIds: (NSString*) partnerIds
    startIndex: (NSNumber*) startIndex
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIGetBusinessPartners200Response* output, NSError* error)) handler {
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
                              responseType: @"OAIGetBusinessPartners200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetBusinessPartners200Response*)data, error);
                                }
                            }];
}

///
/// Update member's business role
/// Update a member's business role within the business.
///  @param businessId Business id 
///
///  @param updateMemberBusinessRoleBody List of objects with the member id and the business_role. 
///
///  @returns OAIUpdateMemberResultsResponseArray*
///
-(NSURLSessionTask*) updateBusinessMembershipsWithBusinessId: (NSString*) businessId
    updateMemberBusinessRoleBody: (NSArray<OAIUpdateMemberBusinessRoleBody>*) updateMemberBusinessRoleBody
    completionHandler: (void (^)(OAIUpdateMemberResultsResponseArray* output, NSError* error)) handler {
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

    // verify the required parameter 'updateMemberBusinessRoleBody' is set
    if (updateMemberBusinessRoleBody == nil) {
        NSParameterAssert(updateMemberBusinessRoleBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateMemberBusinessRoleBody"] };
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
    bodyParam = updateMemberBusinessRoleBody;

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
                              responseType: @"OAIUpdateMemberResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUpdateMemberResultsResponseArray*)data, error);
                                }
                            }];
}



@end
