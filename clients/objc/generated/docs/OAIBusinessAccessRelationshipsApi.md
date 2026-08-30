# OAIBusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandAccountsCreate**](OAIBusinessAccessRelationshipsApi.md#brandaccountscreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brandAccountsUpdate**](OAIBusinessAccessRelationshipsApi.md#brandaccountsupdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**deleteBusinessMembership**](OAIBusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](OAIBusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](OAIBusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](OAIBusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](OAIBusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**systemUserUpdate**](OAIBusinessAccessRelationshipsApi.md#systemuserupdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**updateBusinessMemberships**](OAIBusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **brandAccountsCreate**
```objc
-(NSURLSessionTask*) brandAccountsCreateWithBusinessHierarchyId: (NSString*) businessHierarchyId
    brandAccountCreate: (OAIBrandAccountCreate*) brandAccountCreate
        completionHandler: (void (^)(OAIBrandAccount* output, NSError* error)) handler;
```

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessHierarchyId = @"businessHierarchyId_example"; // business hierarchy node id
OAIBrandAccountCreate* brandAccountCreate = [[OAIBrandAccountCreate alloc] init]; // 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Create a Brand Account
[apiInstance brandAccountsCreateWithBusinessHierarchyId:businessHierarchyId
              brandAccountCreate:brandAccountCreate
          completionHandler: ^(OAIBrandAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->brandAccountsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessHierarchyId** | **NSString***| business hierarchy node id | 
 **brandAccountCreate** | [**OAIBrandAccountCreate***](OAIBrandAccountCreate.md)|  | 

### Return type

[**OAIBrandAccount***](OAIBrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brandAccountsUpdate**
```objc
-(NSURLSessionTask*) brandAccountsUpdateWithBrandAccountId: (NSString*) brandAccountId
    businessHierarchyId: (NSString*) businessHierarchyId
    brandAccountUpdate: (OAIBrandAccountUpdate*) brandAccountUpdate
        completionHandler: (void (^)(OAIBrandAccount* output, NSError* error)) handler;
```

Update a Brand Account

Update an existing Brand Account

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* brandAccountId = @"brandAccountId_example"; // 
NSString* businessHierarchyId = @"businessHierarchyId_example"; // business hierarchy node id
OAIBrandAccountUpdate* brandAccountUpdate = [[OAIBrandAccountUpdate alloc] init]; // 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Update a Brand Account
[apiInstance brandAccountsUpdateWithBrandAccountId:brandAccountId
              businessHierarchyId:businessHierarchyId
              brandAccountUpdate:brandAccountUpdate
          completionHandler: ^(OAIBrandAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->brandAccountsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandAccountId** | **NSString***|  | 
 **businessHierarchyId** | **NSString***| business hierarchy node id | 
 **brandAccountUpdate** | [**OAIBrandAccountUpdate***](OAIBrandAccountUpdate.md)|  | 

### Return type

[**OAIBrandAccount***](OAIBrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessMembership**
```objc
-(NSURLSessionTask*) deleteBusinessMembershipWithBusinessId: (NSString*) businessId
    deleteBusinessMembershipBody: (OAIDeleteBusinessMembershipBody*) deleteBusinessMembershipBody
        completionHandler: (void (^)(OAIDeleteBusinessMembership200Response* output, NSError* error)) handler;
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = @"businessId_example"; // Business id
OAIDeleteBusinessMembershipBody* deleteBusinessMembershipBody = [[OAIDeleteBusinessMembershipBody alloc] init]; // 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Terminate business memberships
[apiInstance deleteBusinessMembershipWithBusinessId:businessId
              deleteBusinessMembershipBody:deleteBusinessMembershipBody
          completionHandler: ^(OAIDeleteBusinessMembership200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->deleteBusinessMembership: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Business id | 
 **deleteBusinessMembershipBody** | [**OAIDeleteBusinessMembershipBody***](OAIDeleteBusinessMembershipBody.md)|  | 

### Return type

[**OAIDeleteBusinessMembership200Response***](OAIDeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessPartners**
```objc
-(NSURLSessionTask*) deleteBusinessPartnersWithBusinessId: (NSString*) businessId
    deleteBusinessPartnersDelete: (OAIDeleteBusinessPartnersDelete*) deleteBusinessPartnersDelete
        completionHandler: (void (^)(OAIDeleteBusinessPartners* output, NSError* error)) handler;
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = @"businessId_example"; // Unique identifier of the requesting business.
OAIDeleteBusinessPartnersDelete* deleteBusinessPartnersDelete = [[OAIDeleteBusinessPartnersDelete alloc] init]; // 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Terminate business partnerships
[apiInstance deleteBusinessPartnersWithBusinessId:businessId
              deleteBusinessPartnersDelete:deleteBusinessPartnersDelete
          completionHandler: ^(OAIDeleteBusinessPartners* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->deleteBusinessPartners: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **deleteBusinessPartnersDelete** | [**OAIDeleteBusinessPartnersDelete***](OAIDeleteBusinessPartnersDelete.md)|  | 

### Return type

[**OAIDeleteBusinessPartners***](OAIDeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessEmployers**
```objc
-(NSURLSessionTask*) getBusinessEmployersWithAssetsSummary: (NSNumber*) assetsSummary
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler;
```

List business employers for user

Get all of the viewing user's business employers.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* assetsSummary = @(YES); // Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(YES))
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// List business employers for user
[apiInstance getBusinessEmployersWithAssetsSummary:assetsSummary
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIGetBusinessEmployers200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->getBusinessEmployers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsSummary** | **NSNumber***| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to @(YES)]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIGetBusinessEmployers200Response***](OAIGetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessMembers**
```objc
-(NSURLSessionTask*) getBusinessMembersWithBusinessId: (NSString*) businessId
    fetchSystemUsers: (NSNumber*) fetchSystemUsers
    assetsSummary: (NSNumber*) assetsSummary
    businessRoles: (NSArray<OAIMemberBusinessRole>*) businessRoles
    memberIds: (NSString*) memberIds
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler;
```

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = @"businessId_example"; // Unique identifier of the requesting business.
NSNumber* fetchSystemUsers = @(NO); // Fetches system users if True. Fetches regular user employees if False. (optional) (default to @(NO))
NSNumber* assetsSummary = @(NO); // Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(NO))
NSArray<OAIMemberBusinessRole>* businessRoles = @[[[OAIMemberBusinessRole alloc] init]]; // A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
NSString* memberIds = @"memberIds_example"; // A list of business members ids separated by comma. (optional)
NSNumber* startIndex = @0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Get business members
[apiInstance getBusinessMembersWithBusinessId:businessId
              fetchSystemUsers:fetchSystemUsers
              assetsSummary:assetsSummary
              businessRoles:businessRoles
              memberIds:memberIds
              startIndex:startIndex
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIGetBusinessEmployers200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->getBusinessMembers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **fetchSystemUsers** | **NSNumber***| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to @(NO)]
 **assetsSummary** | **NSNumber***| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to @(NO)]
 **businessRoles** | [**NSArray&lt;OAIMemberBusinessRole&gt;***](OAIMemberBusinessRole*.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **memberIds** | **NSString***| A list of business members ids separated by comma. | [optional] 
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIGetBusinessEmployers200Response***](OAIGetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessPartners**
```objc
-(NSURLSessionTask*) getBusinessPartnersWithBusinessId: (NSString*) businessId
    assetsSummary: (NSNumber*) assetsSummary
    partnerType: (OAIPartnerType) partnerType
    partnerIds: (NSString*) partnerIds
    startIndex: (NSNumber*) startIndex
    sortAscending: (NSNumber*) sortAscending
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler;
```

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = @"businessId_example"; // Unique identifier of the requesting business.
NSNumber* assetsSummary = @(NO); // Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(NO))
OAIPartnerType partnerType = [[OAIPartnerType alloc] init]; // Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
NSString* partnerIds = @"partnerIds_example"; // A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
NSNumber* startIndex = @0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSNumber* sortAscending = @56; // Sort ascending. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Get business partners
[apiInstance getBusinessPartnersWithBusinessId:businessId
              assetsSummary:assetsSummary
              partnerType:partnerType
              partnerIds:partnerIds
              startIndex:startIndex
              sortAscending:sortAscending
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIGetBusinessEmployers200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->getBusinessPartners: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **assetsSummary** | **NSNumber***| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to @(NO)]
 **partnerType** | [**OAIPartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partnerIds** | **NSString***| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **sortAscending** | **NSNumber***| Sort ascending. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIGetBusinessEmployers200Response***](OAIGetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **systemUserUpdate**
```objc
-(NSURLSessionTask*) systemUserUpdateWithBusinessId: (NSString*) businessId
    systemUserId: (NSString*) systemUserId
    systemUserUpdateWithRequiredBody: (OAISystemUserUpdateWithRequiredBody*) systemUserUpdateWithRequiredBody
        completionHandler: (void (^)(NSError* error)) handler;
```

Update a system user information.

Update a system user information such as name.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = @"businessId_example"; // Unique identifier of the requesting business.
NSString* systemUserId = @"systemUserId_example"; // Unique identifier of a system user.
OAISystemUserUpdateWithRequiredBody* systemUserUpdateWithRequiredBody = [[OAISystemUserUpdateWithRequiredBody alloc] init]; // 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Update a system user information.
[apiInstance systemUserUpdateWithBusinessId:businessId
              systemUserId:systemUserId
              systemUserUpdateWithRequiredBody:systemUserUpdateWithRequiredBody
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->systemUserUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **systemUserId** | **NSString***| Unique identifier of a system user. | 
 **systemUserUpdateWithRequiredBody** | [**OAISystemUserUpdateWithRequiredBody***](OAISystemUserUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessMemberships**
```objc
-(NSURLSessionTask*) updateBusinessMembershipsWithBusinessId: (NSString*) businessId
    businessMembershipMember: (NSArray<OAIBusinessMembershipMember>*) businessMembershipMember
        completionHandler: (void (^)(OAIUpdateBusinessMembershipsResponse* output, NSError* error)) handler;
```

Update member's business role

Update a member's business role within the business.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = @"businessId_example"; // Business id
NSArray<OAIBusinessMembershipMember>* businessMembershipMember = @[[[OAIBusinessMembershipMember alloc] init]]; // 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Update member's business role
[apiInstance updateBusinessMembershipsWithBusinessId:businessId
              businessMembershipMember:businessMembershipMember
          completionHandler: ^(OAIUpdateBusinessMembershipsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBusinessAccessRelationshipsApi->updateBusinessMemberships: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Business id | 
 **businessMembershipMember** | [**NSArray&lt;OAIBusinessMembershipMember&gt;***](OAIBusinessMembershipMember.md)|  | 

### Return type

[**OAIUpdateBusinessMembershipsResponse***](OAIUpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

