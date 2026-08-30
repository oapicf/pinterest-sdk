# BusinessAccessRelationshipsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandAccountsCreate**](BusinessAccessRelationshipsAPI.md#brandaccountscreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brandAccountsUpdate**](BusinessAccessRelationshipsAPI.md#brandaccountsupdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**deleteBusinessMembership**](BusinessAccessRelationshipsAPI.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsAPI.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsAPI.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsAPI.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsAPI.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**systemUserUpdate**](BusinessAccessRelationshipsAPI.md#systemuserupdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**updateBusinessMemberships**](BusinessAccessRelationshipsAPI.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **brandAccountsCreate**
```swift
    open class func brandAccountsCreate(businessHierarchyId: String, brandAccountCreate: BrandAccountCreate, completion: @escaping (_ data: BrandAccount?, _ error: Error?) -> Void)
```

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessHierarchyId = "businessHierarchyId_example" // String | business hierarchy node id
let brandAccountCreate = BrandAccountCreate(about: "about_example", country: Country(), name: "name_example", profileImage: BrandAccountProfileImage(contentType: "contentType_example", data: "data_example"), username: "username_example", website: "website_example") // BrandAccountCreate | 

// Create a Brand Account
BusinessAccessRelationshipsAPI.brandAccountsCreate(businessHierarchyId: businessHierarchyId, brandAccountCreate: brandAccountCreate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessHierarchyId** | **String** | business hierarchy node id | 
 **brandAccountCreate** | [**BrandAccountCreate**](BrandAccountCreate.md) |  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brandAccountsUpdate**
```swift
    open class func brandAccountsUpdate(brandAccountId: String, businessHierarchyId: String, brandAccountUpdate: BrandAccountUpdate, completion: @escaping (_ data: BrandAccount?, _ error: Error?) -> Void)
```

Update a Brand Account

Update an existing Brand Account

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let brandAccountId = "brandAccountId_example" // String | 
let businessHierarchyId = "businessHierarchyId_example" // String | business hierarchy node id
let brandAccountUpdate = BrandAccountUpdate(about: "about_example", country: Country(), name: "name_example", profileImage: BrandAccountProfileImageUpdate(contentType: "contentType_example", data: "data_example"), username: "username_example", website: "website_example") // BrandAccountUpdate | 

// Update a Brand Account
BusinessAccessRelationshipsAPI.brandAccountsUpdate(brandAccountId: brandAccountId, businessHierarchyId: businessHierarchyId, brandAccountUpdate: brandAccountUpdate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandAccountId** | **String** |  | 
 **businessHierarchyId** | **String** | business hierarchy node id | 
 **brandAccountUpdate** | [**BrandAccountUpdate**](BrandAccountUpdate.md) |  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessMembership**
```swift
    open class func deleteBusinessMembership(businessId: String, deleteBusinessMembershipBody: DeleteBusinessMembershipBody, completion: @escaping (_ data: DeleteBusinessMembership200Response?, _ error: Error?) -> Void)
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Business id
let deleteBusinessMembershipBody = DeleteBusinessMembershipBody(members: [DeleteBusinessMembershipMember(businessRole: BusinessRoleForMembers(), memberId: "memberId_example")]) // DeleteBusinessMembershipBody | 

// Terminate business memberships
BusinessAccessRelationshipsAPI.deleteBusinessMembership(businessId: businessId, deleteBusinessMembershipBody: deleteBusinessMembershipBody) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Business id | 
 **deleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md) |  | 

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessPartners**
```swift
    open class func deleteBusinessPartners(businessId: String, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete, completion: @escaping (_ data: DeleteBusinessPartners?, _ error: Error?) -> Void)
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let deleteBusinessPartnersDelete = DeleteBusinessPartnersDelete(partnerIds: ["partnerIds_example"], partnerType: NullablePartnerType()) // DeleteBusinessPartnersDelete | 

// Terminate business partnerships
BusinessAccessRelationshipsAPI.deleteBusinessPartners(businessId: businessId, deleteBusinessPartnersDelete: deleteBusinessPartnersDelete) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **deleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md) |  | 

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessEmployers**
```swift
    open class func getBusinessEmployers(assetsSummary: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: GetBusinessEmployers200Response?, _ error: Error?) -> Void)
```

List business employers for user

Get all of the viewing user's business employers.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let assetsSummary = true // Bool | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to true)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List business employers for user
BusinessAccessRelationshipsAPI.getBusinessEmployers(assetsSummary: assetsSummary, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsSummary** | **Bool** | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessMembers**
```swift
    open class func getBusinessMembers(businessId: String, fetchSystemUsers: Bool? = nil, assetsSummary: Bool? = nil, businessRoles: [MemberBusinessRole]? = nil, memberIds: String? = nil, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: GetBusinessEmployers200Response?, _ error: Error?) -> Void)
```

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let fetchSystemUsers = true // Bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to false)
let assetsSummary = true // Bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let businessRoles = [MemberBusinessRole()] // [MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
let memberIds = "memberIds_example" // String | A list of business members ids separated by comma. (optional)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get business members
BusinessAccessRelationshipsAPI.getBusinessMembers(businessId: businessId, fetchSystemUsers: fetchSystemUsers, assetsSummary: assetsSummary, businessRoles: businessRoles, memberIds: memberIds, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **fetchSystemUsers** | **Bool** | Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **assetsSummary** | **Bool** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **businessRoles** | [**[MemberBusinessRole]**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **memberIds** | **String** | A list of business members ids separated by comma. | [optional] 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessPartners**
```swift
    open class func getBusinessPartners(businessId: String, assetsSummary: Bool? = nil, partnerType: PartnerType? = nil, partnerIds: String? = nil, startIndex: Int? = nil, sortAscending: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: GetBusinessEmployers200Response?, _ error: Error?) -> Void)
```

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetsSummary = true // Bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let partnerType = PartnerType() // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
let partnerIds = "partnerIds_example" // String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let sortAscending = true // Bool | Sort ascending. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get business partners
BusinessAccessRelationshipsAPI.getBusinessPartners(businessId: businessId, assetsSummary: assetsSummary, partnerType: partnerType, partnerIds: partnerIds, startIndex: startIndex, sortAscending: sortAscending, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **assetsSummary** | **Bool** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partnerType** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partnerIds** | **String** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortAscending** | **Bool** | Sort ascending. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **systemUserUpdate**
```swift
    open class func systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Update a system user information.

Update a system user information such as name.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let systemUserId = "systemUserId_example" // String | Unique identifier of a system user.
let systemUserUpdateWithRequiredBody = SystemUserUpdateWithRequiredBody(name: "name_example") // SystemUserUpdateWithRequiredBody | 

// Update a system user information.
BusinessAccessRelationshipsAPI.systemUserUpdate(businessId: businessId, systemUserId: systemUserId, systemUserUpdateWithRequiredBody: systemUserUpdateWithRequiredBody) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **systemUserId** | **String** | Unique identifier of a system user. | 
 **systemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md) |  | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessMemberships**
```swift
    open class func updateBusinessMemberships(businessId: String, businessMembershipMember: [BusinessMembershipMember], completion: @escaping (_ data: UpdateBusinessMembershipsResponse?, _ error: Error?) -> Void)
```

Update member's business role

Update a member's business role within the business.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Business id
let businessMembershipMember = [BusinessMembershipMember(businessRole: BusinessRoleForMembers(), memberId: "memberId_example")] // [BusinessMembershipMember] | 

// Update member's business role
BusinessAccessRelationshipsAPI.updateBusinessMemberships(businessId: businessId, businessMembershipMember: businessMembershipMember) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Business id | 
 **businessMembershipMember** | [**[BusinessMembershipMember]**](BusinessMembershipMember.md) |  | 

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

