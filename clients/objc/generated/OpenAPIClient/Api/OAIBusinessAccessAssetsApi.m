#import "OAIBusinessAccessAssetsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAssetGroupDeletion.h"
#import "OAIAssetGroupDeletionDelete.h"
#import "OAIAssetGroupInput.h"
#import "OAIAssetGroupInputCreate.h"
#import "OAIAssetGroupModification.h"
#import "OAIAssetGroupModificationReadOrUpdate.h"
#import "OAIAssetPermissionType.h"
#import "OAIAssetSearchBy.h"
#import "OAIAssetSortBy.h"
#import "OAIBusinessAssetMembersGet200Response.h"
#import "OAIBusinessAssetsGet200Response.h"
#import "OAIBusinessMemberAssetsGetResponse.h"
#import "OAIBusinessMembersAssetAccessDeleteBody.h"
#import "OAIBusinessPartnerAssetAccessGet200Response.h"
#import "OAIDeleteMemberAccessResultsResponseArray.h"
#import "OAIDeletePartnerAssetAccessBody.h"
#import "OAIDeletePartnerAssetAccessResultsResponseArray.h"
#import "OAINonDraftEntityStatus.h"
#import "OAIPermissionsWithOwner.h"
#import "OAIPinterestLibError.h"
#import "OAIUpdateMemberAssetAccessBody.h"
#import "OAIUpdateMemberAssetsResultsResponseArray.h"
#import "OAIUpdatePartnerAssetAccessBody.h"
#import "OAIUpdatePartnerAssetsResultsResponseArray.h"


@interface OAIBusinessAccessAssetsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIBusinessAccessAssetsApi

NSString* kOAIBusinessAccessAssetsApiErrorDomain = @"OAIBusinessAccessAssetsApiErrorDomain";
NSInteger kOAIBusinessAccessAssetsApiMissingParamErrorCode = 234513;

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
/// Create a new asset group.
/// Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param assetGroupInputCreate  
///
///  @returns OAIAssetGroupInput*
///
-(NSURLSessionTask*) assetGroupCreateWithBusinessId: (NSString*) businessId
    assetGroupInputCreate: (OAIAssetGroupInputCreate*) assetGroupInputCreate
    completionHandler: (void (^)(OAIAssetGroupInput* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetGroupInputCreate' is set
    if (assetGroupInputCreate == nil) {
        NSParameterAssert(assetGroupInputCreate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetGroupInputCreate"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/asset_groups"];

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
    bodyParam = assetGroupInputCreate;

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
                              responseType: @"OAIAssetGroupInput*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssetGroupInput*)data, error);
                                }
                            }];
}

///
/// Delete asset groups.
/// Delete a batch of asset groups.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param assetGroupDeletionDelete  
///
///  @returns OAIAssetGroupDeletion*
///
-(NSURLSessionTask*) assetGroupDeleteWithBusinessId: (NSString*) businessId
    assetGroupDeletionDelete: (OAIAssetGroupDeletionDelete*) assetGroupDeletionDelete
    completionHandler: (void (^)(OAIAssetGroupDeletion* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetGroupDeletionDelete' is set
    if (assetGroupDeletionDelete == nil) {
        NSParameterAssert(assetGroupDeletionDelete);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetGroupDeletionDelete"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/asset_groups"];

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
    bodyParam = assetGroupDeletionDelete;

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
                              responseType: @"OAIAssetGroupDeletion*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssetGroupDeletion*)data, error);
                                }
                            }];
}

///
/// Update asset groups.
/// Update a batch of asset groups with the specified parameters.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param assetGroupModificationReadOrUpdate  
///
///  @returns OAIAssetGroupModification*
///
-(NSURLSessionTask*) assetGroupUpdateWithBusinessId: (NSString*) businessId
    assetGroupModificationReadOrUpdate: (OAIAssetGroupModificationReadOrUpdate*) assetGroupModificationReadOrUpdate
    completionHandler: (void (^)(OAIAssetGroupModification* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetGroupModificationReadOrUpdate' is set
    if (assetGroupModificationReadOrUpdate == nil) {
        NSParameterAssert(assetGroupModificationReadOrUpdate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetGroupModificationReadOrUpdate"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/asset_groups"];

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
    bodyParam = assetGroupModificationReadOrUpdate;

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
                              responseType: @"OAIAssetGroupModification*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssetGroupModification*)data, error);
                                }
                            }];
}

///
/// Get members with access to asset
/// Get all the members the requesting business has granted access to on the given asset.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param assetId Unique identifier of a business asset. 
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False. (optional, default to @(NO))
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIBusinessAssetMembersGet200Response*
///
-(NSURLSessionTask*) businessAssetMembersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    startIndex: (NSNumber*) startIndex
    fetchSystemUsers: (NSNumber*) fetchSystemUsers
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessAssetMembersGet200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetId' is set
    if (assetId == nil) {
        NSParameterAssert(assetId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/assets/{asset_id}/members"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }
    if (assetId != nil) {
        pathParams[@"asset_id"] = assetId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startIndex != nil) {
        queryParams[@"start_index"] = startIndex;
    }
    if (fetchSystemUsers != nil) {
        queryParams[@"fetch_system_users"] = [fetchSystemUsers isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAIBusinessAssetMembersGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessAssetMembersGet200Response*)data, error);
                                }
                            }];
}

///
/// Get partners with access to asset
/// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param assetId Unique identifier of a business asset. 
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIBusinessAssetMembersGet200Response*
///
-(NSURLSessionTask*) businessAssetPartnersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessAssetMembersGet200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetId' is set
    if (assetId == nil) {
        NSParameterAssert(assetId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/assets/{asset_id}/partners"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }
    if (assetId != nil) {
        pathParams[@"asset_id"] = assetId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIBusinessAssetMembersGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessAssetMembersGet200Response*)data, error);
                                }
                            }];
}

///
/// List business assets
/// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
///
///  @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
///
///  @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
///
///  @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to @"AD_ACCOUNT")
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIBusinessAssetsGet200Response*
///
-(NSURLSessionTask*) businessAssetsGetWithBusinessId: (NSString*) businessId
    permissions: (NSArray<OAIPermissionsWithOwner>*) permissions
    childAssetId: (NSString*) childAssetId
    assetGroupId: (NSString*) assetGroupId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessAssetsGet200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/assets"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (permissions != nil) {
        queryParams[@"permissions"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: permissions format: @"multi"];
    }
    if (childAssetId != nil) {
        queryParams[@"child_asset_id"] = childAssetId;
    }
    if (assetGroupId != nil) {
        queryParams[@"asset_group_id"] = assetGroupId;
    }
    if (assetType != nil) {
        queryParams[@"asset_type"] = assetType;
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
                              responseType: @"OAIBusinessAssetsGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessAssetsGet200Response*)data, error);
                                }
                            }];
}

///
/// Get assets assigned to a member
/// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param memberId The member id to fetch assets for. 
///
///  @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to @"AD_ACCOUNT")
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param sortBy The field to sort member assets by (optional)
///
///  @param sortAscending Sort assets in ascending order (optional, default to @(YES))
///
///  @param searchBy The field to search member assets by (optional)
///
///  @param searchValue The value to search for (optional)
///
///  @param assetPermissionType The type of asset permission to filter by (optional)
///
///  @param adAccountStatuses A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIBusinessMemberAssetsGetResponse*
///
-(NSURLSessionTask*) businessMemberAssetsGetWithBusinessId: (NSString*) businessId
    memberId: (NSString*) memberId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    sortBy: (OAIAssetSortBy) sortBy
    sortAscending: (NSNumber*) sortAscending
    searchBy: (OAIAssetSearchBy) searchBy
    searchValue: (NSString*) searchValue
    assetPermissionType: (OAIAssetPermissionType) assetPermissionType
    adAccountStatuses: (NSArray<OAINonDraftEntityStatus>*) adAccountStatuses
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessMemberAssetsGetResponse* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'memberId' is set
    if (memberId == nil) {
        NSParameterAssert(memberId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"memberId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/members/{member_id}/assets"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }
    if (memberId != nil) {
        pathParams[@"member_id"] = memberId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (assetType != nil) {
        queryParams[@"asset_type"] = assetType;
    }
    if (startIndex != nil) {
        queryParams[@"start_index"] = startIndex;
    }
    if (sortBy != nil) {
        queryParams[@"sort_by"] = sortBy;
    }
    if (sortAscending != nil) {
        queryParams[@"sort_ascending"] = [sortAscending isEqual:@(YES)] ? @"true" : @"false";
    }
    if (searchBy != nil) {
        queryParams[@"search_by"] = searchBy;
    }
    if (searchValue != nil) {
        queryParams[@"search_value"] = searchValue;
    }
    if (assetPermissionType != nil) {
        queryParams[@"asset_permission_type"] = assetPermissionType;
    }
    if (adAccountStatuses != nil) {
        queryParams[@"ad_account_statuses"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: adAccountStatuses format: @"multi"];
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
                              responseType: @"OAIBusinessMemberAssetsGetResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessMemberAssetsGetResponse*)data, error);
                                }
                            }];
}

///
/// Delete member access to asset
/// Terminate multiple members' access to an asset.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param businessMembersAssetAccessDeleteBody  
///
///  @returns OAIDeleteMemberAccessResultsResponseArray*
///
-(NSURLSessionTask*) businessMembersAssetAccessDeleteWithBusinessId: (NSString*) businessId
    businessMembersAssetAccessDeleteBody: (OAIBusinessMembersAssetAccessDeleteBody*) businessMembersAssetAccessDeleteBody
    completionHandler: (void (^)(OAIDeleteMemberAccessResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'businessMembersAssetAccessDeleteBody' is set
    if (businessMembersAssetAccessDeleteBody == nil) {
        NSParameterAssert(businessMembersAssetAccessDeleteBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessMembersAssetAccessDeleteBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/members/assets/access"];

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
    bodyParam = businessMembersAssetAccessDeleteBody;

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
                              responseType: @"OAIDeleteMemberAccessResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteMemberAccessResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Assign/Update member asset permissions
/// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param updateMemberAssetAccessBody  
///
///  @returns OAIUpdateMemberAssetsResultsResponseArray*
///
-(NSURLSessionTask*) businessMembersAssetAccessUpdateWithBusinessId: (NSString*) businessId
    updateMemberAssetAccessBody: (OAIUpdateMemberAssetAccessBody*) updateMemberAssetAccessBody
    completionHandler: (void (^)(OAIUpdateMemberAssetsResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'updateMemberAssetAccessBody' is set
    if (updateMemberAssetAccessBody == nil) {
        NSParameterAssert(updateMemberAssetAccessBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateMemberAssetAccessBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/members/assets/access"];

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
    bodyParam = updateMemberAssetAccessBody;

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
                              responseType: @"OAIUpdateMemberAssetsResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUpdateMemberAssetsResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Get assets assigned to a partner or assets assigned by a partner
/// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param partnerId The partner id to be bound to the Business 
///
///  @param partnerType Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional, default to @"INTERNAL")
///
///  @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to @"AD_ACCOUNT")
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param sortBy The field to sort member assets by (optional)
///
///  @param sortAscending Sort assets in ascending order (optional, default to @(YES))
///
///  @param searchBy The field to search member assets by (optional)
///
///  @param searchValue The value to search for (optional)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to @25)
///
///  @returns OAIBusinessPartnerAssetAccessGet200Response*
///
-(NSURLSessionTask*) businessPartnerAssetAccessGetWithBusinessId: (NSString*) businessId
    partnerId: (NSString*) partnerId
    partnerType: (NSString*) partnerType
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    sortBy: (OAIAssetSortBy) sortBy
    sortAscending: (NSNumber*) sortAscending
    searchBy: (OAIAssetSearchBy) searchBy
    searchValue: (NSString*) searchValue
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessPartnerAssetAccessGet200Response* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'partnerId' is set
    if (partnerId == nil) {
        NSParameterAssert(partnerId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"partnerId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/partners/{partner_id}/assets"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (businessId != nil) {
        pathParams[@"business_id"] = businessId;
    }
    if (partnerId != nil) {
        pathParams[@"partner_id"] = partnerId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (partnerType != nil) {
        queryParams[@"partner_type"] = partnerType;
    }
    if (assetType != nil) {
        queryParams[@"asset_type"] = assetType;
    }
    if (startIndex != nil) {
        queryParams[@"start_index"] = startIndex;
    }
    if (sortBy != nil) {
        queryParams[@"sort_by"] = sortBy;
    }
    if (sortAscending != nil) {
        queryParams[@"sort_ascending"] = [sortAscending isEqual:@(YES)] ? @"true" : @"false";
    }
    if (searchBy != nil) {
        queryParams[@"search_by"] = searchBy;
    }
    if (searchValue != nil) {
        queryParams[@"search_value"] = searchValue;
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
                              responseType: @"OAIBusinessPartnerAssetAccessGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessPartnerAssetAccessGet200Response*)data, error);
                                }
                            }];
}

///
/// Delete partner access to asset
/// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param deletePartnerAssetAccessBody  
///
///  @returns OAIDeletePartnerAssetAccessResultsResponseArray*
///
-(NSURLSessionTask*) deletePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    deletePartnerAssetAccessBody: (OAIDeletePartnerAssetAccessBody*) deletePartnerAssetAccessBody
    completionHandler: (void (^)(OAIDeletePartnerAssetAccessResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'deletePartnerAssetAccessBody' is set
    if (deletePartnerAssetAccessBody == nil) {
        NSParameterAssert(deletePartnerAssetAccessBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"deletePartnerAssetAccessBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/partners/assets"];

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
    bodyParam = deletePartnerAssetAccessBody;

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
                              responseType: @"OAIDeletePartnerAssetAccessResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeletePartnerAssetAccessResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Assign/Update partner asset permissions
/// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param updatePartnerAssetAccessBody  
///
///  @returns OAIUpdatePartnerAssetsResultsResponseArray*
///
-(NSURLSessionTask*) updatePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    updatePartnerAssetAccessBody: (OAIUpdatePartnerAssetAccessBody*) updatePartnerAssetAccessBody
    completionHandler: (void (^)(OAIUpdatePartnerAssetsResultsResponseArray* output, NSError* error)) handler {
    // verify the required parameter 'businessId' is set
    if (businessId == nil) {
        NSParameterAssert(businessId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessId"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'updatePartnerAssetAccessBody' is set
    if (updatePartnerAssetAccessBody == nil) {
        NSParameterAssert(updatePartnerAssetAccessBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updatePartnerAssetAccessBody"] };
            NSError* error = [NSError errorWithDomain:kOAIBusinessAccessAssetsApiErrorDomain code:kOAIBusinessAccessAssetsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/businesses/{business_id}/partners/assets"];

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
    bodyParam = updatePartnerAssetAccessBody;

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
                              responseType: @"OAIUpdatePartnerAssetsResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUpdatePartnerAssetsResultsResponseArray*)data, error);
                                }
                            }];
}



@end
