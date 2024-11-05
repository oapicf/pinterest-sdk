#import "OAIBusinessAccessAssetsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIBusinessAssetMembersGet200Response.h"
#import "OAIBusinessAssetPartnersGet200Response.h"
#import "OAIBusinessAssetsGet200Response.h"
#import "OAIBusinessMemberAssetsGet200Response.h"
#import "OAIBusinessMembersAssetAccessDeleteRequest.h"
#import "OAIBusinessPartnerAssetAccessGet200Response.h"
#import "OAICreateAssetGroupBody.h"
#import "OAICreateAssetGroupResponse.h"
#import "OAIDeleteAssetGroupBody.h"
#import "OAIDeleteAssetGroupResponse.h"
#import "OAIDeleteMemberAccessResultsResponseArray.h"
#import "OAIDeletePartnerAssetAccessBody.h"
#import "OAIDeletePartnerAssetsResultsResponseArray.h"
#import "OAIError.h"
#import "OAIPartnerType.h"
#import "OAIPermissionsWithOwner.h"
#import "OAIUpdateAssetGroupBody.h"
#import "OAIUpdateAssetGroupResponse.h"
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
/// Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param createAssetGroupBody  
///
///  @returns OAICreateAssetGroupResponse*
///
-(NSURLSessionTask*) assetGroupCreateWithBusinessId: (NSString*) businessId
    createAssetGroupBody: (OAICreateAssetGroupBody*) createAssetGroupBody
    completionHandler: (void (^)(OAICreateAssetGroupResponse* output, NSError* error)) handler {
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

    // verify the required parameter 'createAssetGroupBody' is set
    if (createAssetGroupBody == nil) {
        NSParameterAssert(createAssetGroupBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createAssetGroupBody"] };
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
    bodyParam = createAssetGroupBody;

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
                              responseType: @"OAICreateAssetGroupResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateAssetGroupResponse*)data, error);
                                }
                            }];
}

///
/// Delete asset groups.
/// Delete a batch of asset groups.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param deleteAssetGroupBody  
///
///  @returns OAIDeleteAssetGroupResponse*
///
-(NSURLSessionTask*) assetGroupDeleteWithBusinessId: (NSString*) businessId
    deleteAssetGroupBody: (OAIDeleteAssetGroupBody*) deleteAssetGroupBody
    completionHandler: (void (^)(OAIDeleteAssetGroupResponse* output, NSError* error)) handler {
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

    // verify the required parameter 'deleteAssetGroupBody' is set
    if (deleteAssetGroupBody == nil) {
        NSParameterAssert(deleteAssetGroupBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"deleteAssetGroupBody"] };
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
    bodyParam = deleteAssetGroupBody;

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
                              responseType: @"OAIDeleteAssetGroupResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteAssetGroupResponse*)data, error);
                                }
                            }];
}

///
/// Update asset groups.
/// Update a batch of asset groups with the specified parameters.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param updateAssetGroupBody  
///
///  @returns OAIUpdateAssetGroupResponse*
///
-(NSURLSessionTask*) assetGroupUpdateWithBusinessId: (NSString*) businessId
    updateAssetGroupBody: (OAIUpdateAssetGroupBody*) updateAssetGroupBody
    completionHandler: (void (^)(OAIUpdateAssetGroupResponse* output, NSError* error)) handler {
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

    // verify the required parameter 'updateAssetGroupBody' is set
    if (updateAssetGroupBody == nil) {
        NSParameterAssert(updateAssetGroupBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateAssetGroupBody"] };
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
    bodyParam = updateAssetGroupBody;

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
                              responseType: @"OAIUpdateAssetGroupResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUpdateAssetGroupResponse*)data, error);
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
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @returns OAIBusinessAssetMembersGet200Response*
///
-(NSURLSessionTask*) businessAssetMembersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    startIndex: (NSNumber*) startIndex
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
    if (bookmark != nil) {
        queryParams[@"bookmark"] = bookmark;
    }
    if (pageSize != nil) {
        queryParams[@"page_size"] = pageSize;
    }
    if (startIndex != nil) {
        queryParams[@"start_index"] = startIndex;
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
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIBusinessAssetPartnersGet200Response*
///
-(NSURLSessionTask*) businessAssetPartnersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessAssetPartnersGet200Response* output, NSError* error)) handler {
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
                              responseType: @"OAIBusinessAssetPartnersGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessAssetPartnersGet200Response*)data, error);
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
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
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
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @returns OAIBusinessMemberAssetsGet200Response*
///
-(NSURLSessionTask*) businessMemberAssetsGetWithBusinessId: (NSString*) businessId
    memberId: (NSString*) memberId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessMemberAssetsGet200Response* output, NSError* error)) handler {
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
                              responseType: @"OAIBusinessMemberAssetsGet200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIBusinessMemberAssetsGet200Response*)data, error);
                                }
                            }];
}

///
/// Delete member access to asset
/// Terminate multiple members' access to an asset.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param businessMembersAssetAccessDeleteRequest List member assset permissions to delete. 
///
///  @returns OAIDeleteMemberAccessResultsResponseArray*
///
-(NSURLSessionTask*) businessMembersAssetAccessDeleteWithBusinessId: (NSString*) businessId
    businessMembersAssetAccessDeleteRequest: (OAIBusinessMembersAssetAccessDeleteRequest*) businessMembersAssetAccessDeleteRequest
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

    // verify the required parameter 'businessMembersAssetAccessDeleteRequest' is set
    if (businessMembersAssetAccessDeleteRequest == nil) {
        NSParameterAssert(businessMembersAssetAccessDeleteRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"businessMembersAssetAccessDeleteRequest"] };
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
    bodyParam = businessMembersAssetAccessDeleteRequest;

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
///  @param updateMemberAssetAccessBody List of member asset permissions to create or update. 
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
///  @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
///
///  @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to @"AD_ACCOUNT")
///
///  @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to @0)
///
///  @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional, default to @25)
///
///  @param bookmark Cursor used to fetch the next page of items (optional)
///
///  @returns OAIBusinessPartnerAssetAccessGet200Response*
///
-(NSURLSessionTask*) businessPartnerAssetAccessGetWithBusinessId: (NSString*) businessId
    partnerId: (NSString*) partnerId
    partnerType: (OAIPartnerType*) partnerType
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
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
///  @returns OAIDeletePartnerAssetsResultsResponseArray*
///
-(NSURLSessionTask*) deletePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    deletePartnerAssetAccessBody: (OAIDeletePartnerAssetAccessBody*) deletePartnerAssetAccessBody
    completionHandler: (void (^)(OAIDeletePartnerAssetsResultsResponseArray* output, NSError* error)) handler {
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
                              responseType: @"OAIDeletePartnerAssetsResultsResponseArray*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeletePartnerAssetsResultsResponseArray*)data, error);
                                }
                            }];
}

///
/// Assign/Update partner asset permissions
/// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
///  @param businessId Unique identifier of the requesting business. 
///
///  @param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners. 
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
