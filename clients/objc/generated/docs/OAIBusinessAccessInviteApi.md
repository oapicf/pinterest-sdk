# OAIBusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetAccessRequestsCreate**](OAIBusinessAccessInviteApi.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancelInvitesOrRequests**](OAIBusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**createAssetInvites**](OAIBusinessAccessInviteApi.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createMembershipOrPartnershipInvites**](OAIBusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**getInvites**](OAIBusinessAccessInviteApi.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respondBusinessAccessInvites**](OAIBusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request


# **assetAccessRequestsCreate**
```objc
-(NSURLSessionTask*) assetAccessRequestsCreateWithBusinessId: (NSString*) businessId
    createAssetAccessRequestBody: (OAICreateAssetAccessRequestBody*) createAssetAccessRequestBody
        completionHandler: (void (^)(OAICreateAssetAccessRequestResponse* output, NSError* error)) handler;
```

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAICreateAssetAccessRequestBody* createAssetAccessRequestBody = [[OAICreateAssetAccessRequestBody alloc] init]; // 

OAIBusinessAccessInviteApi*apiInstance = [[OAIBusinessAccessInviteApi alloc] init];

// Create a request to access an existing partner's assets.
[apiInstance assetAccessRequestsCreateWithBusinessId:businessId
              createAssetAccessRequestBody:createAssetAccessRequestBody
          completionHandler: ^(OAICreateAssetAccessRequestResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessInviteApi->assetAccessRequestsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **createAssetAccessRequestBody** | [**OAICreateAssetAccessRequestBody***](OAICreateAssetAccessRequestBody.md)|  | 

### Return type

[**OAICreateAssetAccessRequestResponse***](OAICreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelInvitesOrRequests**
```objc
-(NSURLSessionTask*) cancelInvitesOrRequestsWithBusinessId: (NSString*) businessId
    cancelInvitesBody: (OAICancelInvitesBody*) cancelInvitesBody
        completionHandler: (void (^)(OAIDeleteInvitesResultsResponseArray* output, NSError* error)) handler;
```

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Business id
OAICancelInvitesBody* cancelInvitesBody = [[OAICancelInvitesBody alloc] init]; // A list with invite ids

OAIBusinessAccessInviteApi*apiInstance = [[OAIBusinessAccessInviteApi alloc] init];

// Cancel invites/requests
[apiInstance cancelInvitesOrRequestsWithBusinessId:businessId
              cancelInvitesBody:cancelInvitesBody
          completionHandler: ^(OAIDeleteInvitesResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessInviteApi->cancelInvitesOrRequests: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Business id | 
 **cancelInvitesBody** | [**OAICancelInvitesBody***](OAICancelInvitesBody.md)| A list with invite ids | 

### Return type

[**OAIDeleteInvitesResultsResponseArray***](OAIDeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAssetInvites**
```objc
-(NSURLSessionTask*) createAssetInvitesWithBusinessId: (NSString*) businessId
    createAssetInvitesRequest: (OAICreateAssetInvitesRequest*) createAssetInvitesRequest
        completionHandler: (void (^)(OAIUpdateInvitesResultsResponseArray* output, NSError* error)) handler;
```

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAICreateAssetInvitesRequest* createAssetInvitesRequest = [[OAICreateAssetInvitesRequest alloc] init]; // A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

OAIBusinessAccessInviteApi*apiInstance = [[OAIBusinessAccessInviteApi alloc] init];

// Update invite/request with an asset permission
[apiInstance createAssetInvitesWithBusinessId:businessId
              createAssetInvitesRequest:createAssetInvitesRequest
          completionHandler: ^(OAIUpdateInvitesResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessInviteApi->createAssetInvites: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **createAssetInvitesRequest** | [**OAICreateAssetInvitesRequest***](OAICreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[**OAIUpdateInvitesResultsResponseArray***](OAIUpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createMembershipOrPartnershipInvites**
```objc
-(NSURLSessionTask*) createMembershipOrPartnershipInvitesWithBusinessId: (NSString*) businessId
    createMembershipOrPartnershipInvitesBody: (OAICreateMembershipOrPartnershipInvitesBody*) createMembershipOrPartnershipInvitesBody
        completionHandler: (void (^)(OAICreateInvitesResultsResponseArray* output, NSError* error)) handler;
```

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Business id
OAICreateMembershipOrPartnershipInvitesBody* createMembershipOrPartnershipInvitesBody = [[OAICreateMembershipOrPartnershipInvitesBody alloc] init]; // An object with the properties: invite_type, partners, members, business_role

OAIBusinessAccessInviteApi*apiInstance = [[OAIBusinessAccessInviteApi alloc] init];

// Create invites or requests
[apiInstance createMembershipOrPartnershipInvitesWithBusinessId:businessId
              createMembershipOrPartnershipInvitesBody:createMembershipOrPartnershipInvitesBody
          completionHandler: ^(OAICreateInvitesResultsResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessInviteApi->createMembershipOrPartnershipInvites: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Business id | 
 **createMembershipOrPartnershipInvitesBody** | [**OAICreateMembershipOrPartnershipInvitesBody***](OAICreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | 

### Return type

[**OAICreateInvitesResultsResponseArray***](OAICreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInvites**
```objc
-(NSURLSessionTask*) getInvitesWithBusinessId: (NSString*) businessId
    isMember: (NSNumber*) isMember
    inviteStatus: (NSArray<NSString*>*) inviteStatus
    inviteType: (OAIInviteType) inviteType
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIGetInvites200Response* output, NSError* error)) handler;
```

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSNumber* isMember = @(YES); // A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to @(YES))
NSArray<NSString*>* inviteStatus = @[@"inviteStatus_example"]; // A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
OAIInviteType inviteType = [[OAIInviteType alloc] init]; // Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBusinessAccessInviteApi*apiInstance = [[OAIBusinessAccessInviteApi alloc] init];

// Get invites/requests
[apiInstance getInvitesWithBusinessId:businessId
              isMember:isMember
              inviteStatus:inviteStatus
              inviteType:inviteType
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIGetInvites200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessInviteApi->getInvites: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **isMember** | **NSNumber***| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to @(YES)]
 **inviteStatus** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
 **inviteType** | [**OAIInviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIGetInvites200Response***](OAIGetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **respondBusinessAccessInvites**
```objc
-(NSURLSessionTask*) respondBusinessAccessInvitesWithAuthRespondInvitesBody: (OAIAuthRespondInvitesBody*) authRespondInvitesBody
        completionHandler: (void (^)(OAIRespondToInvitesResponseArray* output, NSError* error)) handler;
```

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIAuthRespondInvitesBody* authRespondInvitesBody = [[OAIAuthRespondInvitesBody alloc] init]; // 

OAIBusinessAccessInviteApi*apiInstance = [[OAIBusinessAccessInviteApi alloc] init];

// Accept or decline an invite/request
[apiInstance respondBusinessAccessInvitesWithAuthRespondInvitesBody:authRespondInvitesBody
          completionHandler: ^(OAIRespondToInvitesResponseArray* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessInviteApi->respondBusinessAccessInvites: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRespondInvitesBody** | [**OAIAuthRespondInvitesBody***](OAIAuthRespondInvitesBody.md)|  | 

### Return type

[**OAIRespondToInvitesResponseArray***](OAIRespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

