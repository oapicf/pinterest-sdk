#import "OAIBusinessAccessInviteApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAuthRespondInvitesBody.h"
#import "OAICancelInvitesBody.h"
#import "OAICreateAssetAccessRequestBody.h"
#import "OAICreateAssetAccessRequestResponse.h"
#import "OAICreateAssetInvitesRequest.h"
#import "OAICreateInvitesResultsResponseArray.h"
#import "OAICreateMembershipOrPartnershipInvitesBody.h"
#import "OAIDeleteInvitesResultsResponseArray.h"
#import "OAIError.h"
#import "OAIGetInvites200Response.h"
#import "OAIInviteType.h"
#import "OAIRespondToInvitesResponseArray.h"
#import "OAIUpdateInvitesResultsResponseArray.h"


@interface OAIBusinessAccessInviteApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIBusinessAccessInviteApi

NSString* kOAIBusinessAccessInviteApiErrorDomain = @"OAIBusinessAccessInviteApiErrorDomain";
NSInteger kOAIBusinessAccessInviteApiMissingParamErrorCode = 234513;

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
/// Create a request to access an existing partner's assets.
/// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param createAssetAccessRequestBody  
///
///  @returns OAICreateAssetAccessRequestResponse*
///
-(NSURLSessionTask*) assetAccessRequestsCreateWithBusinessId: (NSString*) businessId
    createAssetAccessRequestBody: (OAICreateAssetAccessRequestBody*) createAssetAccessRequestBody
    completionHandler: (void (^)(OAICreateAssetAccessRequestResponse* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createAssetAccessRequestBody' is set
    if (createAssetAccessRequestBody == nil) {
        NSParameterAssert(createAssetAccessRequestBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createAssetAccessRequestBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/requests/assets/access"];

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
    bodyParam = createAssetAccessRequestBody;

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
                              responseType: @"OAICreateAssetAccessRequestResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateAssetAccessRequestResponse*)data, error);
                                }
                            }];
}

///
/// Cancel invites/requests
/// Cancel membership/partnership invites and/or requests.
///  @param businessId Business id 
///
///  @param cancelInvitesBody A list with invite ids 
///
///  @returns OAIDeleteInvitesResultsResponseArray*
///
-(NSURLSessionTask*) cancelInvitesOrRequestsWithBusinessId: (NSString*) businessId
    cancelInvitesBody: (OAICancelInvitesBody*) cancelInvitesBody
    completionHandler: (void (^)(OAIDeleteInvitesResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'cancelInvitesBody' is set
    if (cancelInvitesBody == nil) {
        NSParameterAssert(cancelInvitesBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"cancelInvitesBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/invites"];

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
    bodyParam = cancelInvitesBody;

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
                              responseType: @"OAIDeleteInvitesResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteInvitesResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Update invite/request with an asset permission
/// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param createAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request.  
///
///  @returns OAIUpdateInvitesResultsResponseArray*
///
-(NSURLSessionTask*) createAssetInvitesWithBusinessId: (NSString*) businessId
    createAssetInvitesRequest: (OAICreateAssetInvitesRequest*) createAssetInvitesRequest
    completionHandler: (void (^)(OAIUpdateInvitesResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createAssetInvitesRequest' is set
    if (createAssetInvitesRequest == nil) {
        NSParameterAssert(createAssetInvitesRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createAssetInvitesRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/invites/assets/access"];

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
    bodyParam = createAssetInvitesRequest;

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
                              responseType: @"OAIUpdateInvitesResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUpdateInvitesResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Create invites or requests
/// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
///  @param businessId Business id 
///
///  @param createMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role 
///
///  @returns OAICreateInvitesResultsResponseArray*
///
-(NSURLSessionTask*) createMembershipOrPartnershipInvitesWithBusinessId: (NSString*) businessId
    createMembershipOrPartnershipInvitesBody: (OAICreateMembershipOrPartnershipInvitesBody*) createMembershipOrPartnershipInvitesBody
    completionHandler: (void (^)(OAICreateInvitesResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createMembershipOrPartnershipInvitesBody' is set
    if (createMembershipOrPartnershipInvitesBody == nil) {
        NSParameterAssert(createMembershipOrPartnershipInvitesBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createMembershipOrPartnershipInvitesBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/invites"];

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
    bodyParam = createMembershipOrPartnershipInvitesBody;

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
                              responseType: @"OAICreateInvitesResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateInvitesResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Get invites/requests
/// Get the membership/partnership invites and/or requests for the authorized user.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param isMember A boolean field to indicate whether the invite is to create a partnership or a membership. (optional, default to @(YES))
///
///  @param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
///
///  @param inviteType Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIGetInvites200Response*
///
-(NSURLSessionTask*) getInvitesWithBusinessId: (NSString*) businessId
    isMember: (NSNumber*) isMember
    inviteStatus: (NSArray<NSString*>*) inviteStatus
    inviteType: (OAIInviteType) inviteType
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetInvites200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/invites"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (isMember != nil) {
        queryParams[@"is_member"] = [isMember isEqual:@(YES)] ? @"true" : @"false";
    }
    if (inviteStatus != nil) {
        queryParams[@"invite_status"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: inviteStatus format: @"multi"];
    }
    if (inviteType != nil) {
        queryParams[@"invite_type"] = inviteType;
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
                              responseType: @"OAIGetInvites200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetInvites200Response*)data, error);
                                }
                            }];
}

///
/// Accept or decline an invite/request
/// Accept or decline invites or requests.
///  @param authRespondInvitesBody  
///
///  @returns OAIRespondToInvitesResponseArray*
///
-(NSURLSessionTask*) respondBusinessAccessInvitesWithAuthRespondInvitesBody: (OAIAuthRespondInvitesBody*) authRespondInvitesBody
    completionHandler: (void (^)(OAIRespondToInvitesResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'authRespondInvitesBody' is set
    if (authRespondInvitesBody == nil) {
        NSParameterAssert(authRespondInvitesBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authRespondInvitesBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessInviteApiErrorDomain code:kOAIBusinessAccessInviteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/invites"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

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
    bodyParam = authRespondInvitesBody;

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
                              responseType: @"OAIRespondToInvitesResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRespondToInvitesResponseArray*)data, error);
                                }
                            }];
}



@end
