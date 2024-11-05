# OAIBusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetGroupCreate**](OAIBusinessAccessAssetsApi.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**assetGroupDelete**](OAIBusinessAccessAssetsApi.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**assetGroupUpdate**](OAIBusinessAccessAssetsApi.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**businessAssetMembersGet**](OAIBusinessAccessAssetsApi.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**businessAssetPartnersGet**](OAIBusinessAccessAssetsApi.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**businessAssetsGet**](OAIBusinessAccessAssetsApi.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets
[**businessMemberAssetsGet**](OAIBusinessAccessAssetsApi.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**businessMembersAssetAccessDelete**](OAIBusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**businessMembersAssetAccessUpdate**](OAIBusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**businessPartnerAssetAccessGet**](OAIBusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**deletePartnerAssetAccessHandlerImpl**](OAIBusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**updatePartnerAssetAccessHandlerImpl**](OAIBusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **assetGroupCreate**
```objc
-(NSURLSessionTask*) assetGroupCreateWithBusinessId: (NSString*) businessId
    createAssetGroupBody: (OAICreateAssetGroupBody*) createAssetGroupBody
        completionHandler: (void (^)(OAICreateAssetGroupResponse* output, NSError* error)) handler;
```

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAICreateAssetGroupBody* createAssetGroupBody = [[OAICreateAssetGroupBody alloc] init]; // 

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Create a new asset group.
[apiInstance assetGroupCreateWithBusinessId:businessId
              createAssetGroupBody:createAssetGroupBody
          completionHandler: ^(OAICreateAssetGroupResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->assetGroupCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **createAssetGroupBody** | [**OAICreateAssetGroupBody***](OAICreateAssetGroupBody.md)|  | 

### Return type

[**OAICreateAssetGroupResponse***](OAICreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupDelete**
```objc
-(NSURLSessionTask*) assetGroupDeleteWithBusinessId: (NSString*) businessId
    deleteAssetGroupBody: (OAIDeleteAssetGroupBody*) deleteAssetGroupBody
        completionHandler: (void (^)(OAIDeleteAssetGroupResponse* output, NSError* error)) handler;
```

Delete asset groups.

Delete a batch of asset groups.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIDeleteAssetGroupBody* deleteAssetGroupBody = [[OAIDeleteAssetGroupBody alloc] init]; // 

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Delete asset groups.
[apiInstance assetGroupDeleteWithBusinessId:businessId
              deleteAssetGroupBody:deleteAssetGroupBody
          completionHandler: ^(OAIDeleteAssetGroupResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->assetGroupDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **deleteAssetGroupBody** | [**OAIDeleteAssetGroupBody***](OAIDeleteAssetGroupBody.md)|  | 

### Return type

[**OAIDeleteAssetGroupResponse***](OAIDeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupUpdate**
```objc
-(NSURLSessionTask*) assetGroupUpdateWithBusinessId: (NSString*) businessId
    updateAssetGroupBody: (OAIUpdateAssetGroupBody*) updateAssetGroupBody
        completionHandler: (void (^)(OAIUpdateAssetGroupResponse* output, NSError* error)) handler;
```

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIUpdateAssetGroupBody* updateAssetGroupBody = [[OAIUpdateAssetGroupBody alloc] init]; // 

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Update asset groups.
[apiInstance assetGroupUpdateWithBusinessId:businessId
              updateAssetGroupBody:updateAssetGroupBody
          completionHandler: ^(OAIUpdateAssetGroupResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->assetGroupUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **updateAssetGroupBody** | [**OAIUpdateAssetGroupBody***](OAIUpdateAssetGroupBody.md)|  | 

### Return type

[**OAIUpdateAssetGroupResponse***](OAIUpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetMembersGet**
```objc
-(NSURLSessionTask*) businessAssetMembersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    startIndex: (NSNumber*) startIndex
        completionHandler: (void (^)(OAIBusinessAssetMembersGet200Response* output, NSError* error)) handler;
```

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSString* assetId = 729090764583391194; // Unique identifier of a business asset.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Get members with access to asset
[apiInstance businessAssetMembersGetWithBusinessId:businessId
              assetId:assetId
              bookmark:bookmark
              pageSize:pageSize
              startIndex:startIndex
          completionHandler: ^(OAIBusinessAssetMembersGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessAssetMembersGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **assetId** | **NSString***| Unique identifier of a business asset. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]

### Return type

[**OAIBusinessAssetMembersGet200Response***](OAIBusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetPartnersGet**
```objc
-(NSURLSessionTask*) businessAssetPartnersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBusinessAssetPartnersGet200Response* output, NSError* error)) handler;
```

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSString* assetId = 729090764583391194; // Unique identifier of a business asset.
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Get partners with access to asset
[apiInstance businessAssetPartnersGetWithBusinessId:businessId
              assetId:assetId
              startIndex:startIndex
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIBusinessAssetPartnersGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessAssetPartnersGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **assetId** | **NSString***| Unique identifier of a business asset. | 
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIBusinessAssetPartnersGet200Response***](OAIBusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetsGet**
```objc
-(NSURLSessionTask*) businessAssetsGetWithBusinessId: (NSString*) businessId
    permissions: (NSArray<OAIPermissionsWithOwner>*) permissions
    childAssetId: (NSString*) childAssetId
    assetGroupId: (NSString*) assetGroupId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBusinessAssetsGet200Response* output, NSError* error)) handler;
```

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSArray<OAIPermissionsWithOwner>* permissions = @[[[OAIPermissionsWithOwner alloc] init]]; // A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
NSString* childAssetId = 549764894835; // A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
NSString* assetGroupId = 7078106104032; // An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
NSString* assetType = AD_ACCOUNT; // A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to @"AD_ACCOUNT")
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// List business assets
[apiInstance businessAssetsGetWithBusinessId:businessId
              permissions:permissions
              childAssetId:childAssetId
              assetGroupId:assetGroupId
              assetType:assetType
              startIndex:startIndex
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIBusinessAssetsGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessAssetsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **permissions** | [**NSArray&lt;OAIPermissionsWithOwner&gt;***](OAIPermissionsWithOwner*.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **childAssetId** | **NSString***| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **assetGroupId** | **NSString***| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **assetType** | **NSString***| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to @&quot;AD_ACCOUNT&quot;]
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIBusinessAssetsGet200Response***](OAIBusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMemberAssetsGet**
```objc
-(NSURLSessionTask*) businessMemberAssetsGetWithBusinessId: (NSString*) businessId
    memberId: (NSString*) memberId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBusinessMemberAssetsGet200Response* output, NSError* error)) handler;
```

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSString* memberId = 729090764583391194; // The member id to fetch assets for.
NSString* assetType = AD_ACCOUNT; // A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to @"AD_ACCOUNT")
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Get assets assigned to a member
[apiInstance businessMemberAssetsGetWithBusinessId:businessId
              memberId:memberId
              assetType:assetType
              startIndex:startIndex
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIBusinessMemberAssetsGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessMemberAssetsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **memberId** | **NSString***| The member id to fetch assets for. | 
 **assetType** | **NSString***| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to @&quot;AD_ACCOUNT&quot;]
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIBusinessMemberAssetsGet200Response***](OAIBusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessDelete**
```objc
-(NSURLSessionTask*) businessMembersAssetAccessDeleteWithBusinessId: (NSString*) businessId
    businessMembersAssetAccessDeleteRequest: (OAIBusinessMembersAssetAccessDeleteRequest*) businessMembersAssetAccessDeleteRequest
        completionHandler: (void (^)(OAIDeleteMemberAccessResultsResponseArray* output, NSError* error)) handler;
```

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIBusinessMembersAssetAccessDeleteRequest* businessMembersAssetAccessDeleteRequest = [[OAIBusinessMembersAssetAccessDeleteRequest alloc] init]; // List member assset permissions to delete.

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Delete member access to asset
[apiInstance businessMembersAssetAccessDeleteWithBusinessId:businessId
              businessMembersAssetAccessDeleteRequest:businessMembersAssetAccessDeleteRequest
          completionHandler: ^(OAIDeleteMemberAccessResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessMembersAssetAccessDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **businessMembersAssetAccessDeleteRequest** | [**OAIBusinessMembersAssetAccessDeleteRequest***](OAIBusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. | 

### Return type

[**OAIDeleteMemberAccessResultsResponseArray***](OAIDeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessUpdate**
```objc
-(NSURLSessionTask*) businessMembersAssetAccessUpdateWithBusinessId: (NSString*) businessId
    updateMemberAssetAccessBody: (OAIUpdateMemberAssetAccessBody*) updateMemberAssetAccessBody
        completionHandler: (void (^)(OAIUpdateMemberAssetsResultsResponseArray* output, NSError* error)) handler;
```

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIUpdateMemberAssetAccessBody* updateMemberAssetAccessBody = [[OAIUpdateMemberAssetAccessBody alloc] init]; // List of member asset permissions to create or update.

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Assign/Update member asset permissions
[apiInstance businessMembersAssetAccessUpdateWithBusinessId:businessId
              updateMemberAssetAccessBody:updateMemberAssetAccessBody
          completionHandler: ^(OAIUpdateMemberAssetsResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessMembersAssetAccessUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **updateMemberAssetAccessBody** | [**OAIUpdateMemberAssetAccessBody***](OAIUpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. | 

### Return type

[**OAIUpdateMemberAssetsResultsResponseArray***](OAIUpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessPartnerAssetAccessGet**
```objc
-(NSURLSessionTask*) businessPartnerAssetAccessGetWithBusinessId: (NSString*) businessId
    partnerId: (NSString*) partnerId
    partnerType: (OAIPartnerType*) partnerType
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIBusinessPartnerAssetAccessGet200Response* output, NSError* error)) handler;
```

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSString* partnerId = 729090764583391194; // The partner id to be bound to the Business
OAIPartnerType* partnerType = INTERNAL; // Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
NSString* assetType = AD_ACCOUNT; // A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to @"AD_ACCOUNT")
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Get assets assigned to a partner or assets assigned by a partner
[apiInstance businessPartnerAssetAccessGetWithBusinessId:businessId
              partnerId:partnerId
              partnerType:partnerType
              assetType:assetType
              startIndex:startIndex
              pageSize:pageSize
              bookmark:bookmark
          completionHandler: ^(OAIBusinessPartnerAssetAccessGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->businessPartnerAssetAccessGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **partnerId** | **NSString***| The partner id to be bound to the Business | 
 **partnerType** | [**OAIPartnerType***](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **assetType** | **NSString***| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to @&quot;AD_ACCOUNT&quot;]
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIBusinessPartnerAssetAccessGet200Response***](OAIBusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deletePartnerAssetAccessHandlerImpl**
```objc
-(NSURLSessionTask*) deletePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    deletePartnerAssetAccessBody: (OAIDeletePartnerAssetAccessBody*) deletePartnerAssetAccessBody
        completionHandler: (void (^)(OAIDeletePartnerAssetsResultsResponseArray* output, NSError* error)) handler;
```

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIDeletePartnerAssetAccessBody* deletePartnerAssetAccessBody = [[OAIDeletePartnerAssetAccessBody alloc] init]; // 

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Delete partner access to asset
[apiInstance deletePartnerAssetAccessHandlerImplWithBusinessId:businessId
              deletePartnerAssetAccessBody:deletePartnerAssetAccessBody
          completionHandler: ^(OAIDeletePartnerAssetsResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->deletePartnerAssetAccessHandlerImpl: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **deletePartnerAssetAccessBody** | [**OAIDeletePartnerAssetAccessBody***](OAIDeletePartnerAssetAccessBody.md)|  | 

### Return type

[**OAIDeletePartnerAssetsResultsResponseArray***](OAIDeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatePartnerAssetAccessHandlerImpl**
```objc
-(NSURLSessionTask*) updatePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    updatePartnerAssetAccessBody: (OAIUpdatePartnerAssetAccessBody*) updatePartnerAssetAccessBody
        completionHandler: (void (^)(OAIUpdatePartnerAssetsResultsResponseArray* output, NSError* error)) handler;
```

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIUpdatePartnerAssetAccessBody* updatePartnerAssetAccessBody = [[OAIUpdatePartnerAssetAccessBody alloc] init]; // A list of assets and permissions to assign to your partners.

OAIBusinessAccessAssetsApi*apiInstance = [[OAIBusinessAccessAssetsApi alloc] init];

// Assign/Update partner asset permissions
[apiInstance updatePartnerAssetAccessHandlerImplWithBusinessId:businessId
              updatePartnerAssetAccessBody:updatePartnerAssetAccessBody
          completionHandler: ^(OAIUpdatePartnerAssetsResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessAssetsApi->updatePartnerAssetAccessHandlerImpl: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **updatePartnerAssetAccessBody** | [**OAIUpdatePartnerAssetAccessBody***](OAIUpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. | 

### Return type

[**OAIUpdatePartnerAssetsResultsResponseArray***](OAIUpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

