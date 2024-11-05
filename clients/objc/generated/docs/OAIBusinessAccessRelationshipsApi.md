# OAIBusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](OAIBusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](OAIBusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](OAIBusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](OAIBusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](OAIBusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**updateBusinessMemberships**](OAIBusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **deleteBusinessMembership**
```objc
-(NSURLSessionTask*) deleteBusinessMembershipWithBusinessId: (NSString*) businessId
    membersToDeleteBody: (OAIMembersToDeleteBody*) membersToDeleteBody
        completionHandler: (void (^)(OAIDeletedMembersResponse* output, NSError* error)) handler;
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Business id
OAIMembersToDeleteBody* membersToDeleteBody = [[OAIMembersToDeleteBody alloc] init]; // List of members with role to delete.

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Terminate business memberships
[apiInstance deleteBusinessMembershipWithBusinessId:businessId
              membersToDeleteBody:membersToDeleteBody
          completionHandler: ^(OAIDeletedMembersResponse* output, NSError* error) {
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
 **membersToDeleteBody** | [**OAIMembersToDeleteBody***](OAIMembersToDeleteBody.md)| List of members with role to delete. | 

### Return type

[**OAIDeletedMembersResponse***](OAIDeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessPartners**
```objc
-(NSURLSessionTask*) deleteBusinessPartnersWithBusinessId: (NSString*) businessId
    deletePartnersRequest: (OAIDeletePartnersRequest*) deletePartnersRequest
        completionHandler: (void (^)(OAIDeletePartnersResponse* output, NSError* error)) handler;
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIDeletePartnersRequest* deletePartnersRequest = [[OAIDeletePartnersRequest alloc] init]; // An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Terminate business partnerships
[apiInstance deleteBusinessPartnersWithBusinessId:businessId
              deletePartnersRequest:deletePartnersRequest
          completionHandler: ^(OAIDeletePartnersResponse* output, NSError* error) {
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
 **deletePartnersRequest** | [**OAIDeletePartnersRequest***](OAIDeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**OAIDeletePartnersResponse***](OAIDeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessEmployers**
```objc
-(NSURLSessionTask*) getBusinessEmployersWithPageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler;
```

List business employers for user

Get all of the viewing user's business employers.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// List business employers for user
[apiInstance getBusinessEmployersWithPageSize:pageSize
              bookmark:bookmark
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

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
    assetsSummary: (NSNumber*) assetsSummary
    businessRoles: (NSArray<OAIMemberBusinessRole>*) businessRoles
    memberIds: (NSString*) memberIds
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIGetBusinessMembers200Response* output, NSError* error)) handler;
```

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSNumber* assetsSummary = @(NO); // Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(NO))
NSArray<OAIMemberBusinessRole>* businessRoles = @[[[OAIMemberBusinessRole alloc] init]]; // A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
NSString* memberIds = 00101010101,2222220101; // A list of business members ids separated by comma. (optional)
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Get business members
[apiInstance getBusinessMembersWithBusinessId:businessId
              assetsSummary:assetsSummary
              businessRoles:businessRoles
              memberIds:memberIds
              startIndex:startIndex
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIGetBusinessMembers200Response* output, NSError* error) {
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
 **assetsSummary** | **NSNumber***| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to @(NO)]
 **businessRoles** | [**NSArray&lt;OAIMemberBusinessRole&gt;***](OAIMemberBusinessRole*.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **memberIds** | **NSString***| A list of business members ids separated by comma. | [optional] 
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIGetBusinessMembers200Response***](OAIGetBusinessMembers200Response.md)

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
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIGetBusinessPartners200Response* output, NSError* error)) handler;
```

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSNumber* assetsSummary = @(NO); // Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(NO))
OAIPartnerType partnerType = INTERNAL; // Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
NSString* partnerIds = 00101010101,2222220101; // A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
NSNumber* startIndex = 0; // An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Get business partners
[apiInstance getBusinessPartnersWithBusinessId:businessId
              assetsSummary:assetsSummary
              partnerType:partnerType
              partnerIds:partnerIds
              startIndex:startIndex
              pageSize:pageSize
              bookmark:bookmark
          completionHandler: ^(OAIGetBusinessPartners200Response* output, NSError* error) {
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
 **partnerType** | [**OAIPartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partnerIds** | **NSString***| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **startIndex** | **NSNumber***| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to @0]
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIGetBusinessPartners200Response***](OAIGetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessMemberships**
```objc
-(NSURLSessionTask*) updateBusinessMembershipsWithBusinessId: (NSString*) businessId
    updateMemberBusinessRoleBody: (NSArray<OAIUpdateMemberBusinessRoleBody>*) updateMemberBusinessRoleBody
        completionHandler: (void (^)(OAIUpdateMemberResultsResponseArray* output, NSError* error)) handler;
```

Update member's business role

Update a member's business role within the business.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Business id
NSArray<OAIUpdateMemberBusinessRoleBody>* updateMemberBusinessRoleBody = @[[[OAIUpdateMemberBusinessRoleBody alloc] init]]; // List of objects with the member id and the business_role.

OAIBusinessAccessRelationshipsApi*apiInstance = [[OAIBusinessAccessRelationshipsApi alloc] init];

// Update member's business role
[apiInstance updateBusinessMembershipsWithBusinessId:businessId
              updateMemberBusinessRoleBody:updateMemberBusinessRoleBody
          completionHandler: ^(OAIUpdateMemberResultsResponseArray* output, NSError* error) {
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
 **updateMemberBusinessRoleBody** | [**NSArray&lt;OAIUpdateMemberBusinessRoleBody&gt;***](OAIUpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | 

### Return type

[**OAIUpdateMemberResultsResponseArray***](OAIUpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

