# BusinessAccessRelationshipsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](BusinessAccessRelationshipsAPI.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsAPI.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsAPI.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsAPI.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsAPI.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**updateBusinessMemberships**](BusinessAccessRelationshipsAPI.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **deleteBusinessMembership**
```swift
    open class func deleteBusinessMembership(businessId: String, membersToDeleteBody: MembersToDeleteBody, completion: @escaping (_ data: DeletedMembersResponse?, _ error: Error?) -> Void)
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Business id
let membersToDeleteBody = MembersToDeleteBody(members: [MembersToDeleteBody_members_inner(memberId: "memberId_example", businessRole: BusinessRoleForMembers())]) // MembersToDeleteBody | List of members with role to delete.

// Terminate business memberships
BusinessAccessRelationshipsAPI.deleteBusinessMembership(businessId: businessId, membersToDeleteBody: membersToDeleteBody) { (response, error) in
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
 **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md) | List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessPartners**
```swift
    open class func deleteBusinessPartners(businessId: String, deletePartnersRequest: DeletePartnersRequest, completion: @escaping (_ data: DeletePartnersResponse?, _ error: Error?) -> Void)
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let deletePartnersRequest = DeletePartnersRequest(partnerIds: ["partnerIds_example"], partnerType: "partnerType_example") // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

// Terminate business partnerships
BusinessAccessRelationshipsAPI.deleteBusinessPartners(businessId: businessId, deletePartnersRequest: deletePartnersRequest) { (response, error) in
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
 **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md) | An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessEmployers**
```swift
    open class func getBusinessEmployers(pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: GetBusinessEmployers200Response?, _ error: Error?) -> Void)
```

List business employers for user

Get all of the viewing user's business employers.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List business employers for user
BusinessAccessRelationshipsAPI.getBusinessEmployers(pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

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
    open class func getBusinessMembers(businessId: String, assetsSummary: Bool? = nil, businessRoles: [MemberBusinessRole]? = nil, memberIds: String? = nil, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: GetBusinessMembers200Response?, _ error: Error?) -> Void)
```

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetsSummary = true // Bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let businessRoles = [MemberBusinessRole()] // [MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
let memberIds = "memberIds_example" // String | A list of business members ids separated by comma. (optional)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// Get business members
BusinessAccessRelationshipsAPI.getBusinessMembers(businessId: businessId, assetsSummary: assetsSummary, businessRoles: businessRoles, memberIds: memberIds, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **businessRoles** | [**[MemberBusinessRole]**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **memberIds** | **String** | A list of business members ids separated by comma. | [optional] 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessPartners**
```swift
    open class func getBusinessPartners(businessId: String, assetsSummary: Bool? = nil, partnerType: PartnerType? = nil, partnerIds: String? = nil, startIndex: Int? = nil, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: GetBusinessPartners200Response?, _ error: Error?) -> Void)
```

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetsSummary = true // Bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let partnerType = PartnerType() // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
let partnerIds = "partnerIds_example" // String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get business partners
BusinessAccessRelationshipsAPI.getBusinessPartners(businessId: businessId, assetsSummary: assetsSummary, partnerType: partnerType, partnerIds: partnerIds, startIndex: startIndex, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **partnerType** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partnerIds** | **String** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessMemberships**
```swift
    open class func updateBusinessMemberships(businessId: String, updateMemberBusinessRoleBody: [UpdateMemberBusinessRoleBody], completion: @escaping (_ data: UpdateMemberResultsResponseArray?, _ error: Error?) -> Void)
```

Update member's business role

Update a member's business role within the business.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Business id
let updateMemberBusinessRoleBody = [UpdateMemberBusinessRoleBody(businessRole: BusinessRoleForMembers(), memberId: "memberId_example")] // [UpdateMemberBusinessRoleBody] | List of objects with the member id and the business_role.

// Update member's business role
BusinessAccessRelationshipsAPI.updateBusinessMemberships(businessId: businessId, updateMemberBusinessRoleBody: updateMemberBusinessRoleBody) { (response, error) in
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
 **updateMemberBusinessRoleBody** | [**[UpdateMemberBusinessRoleBody]**](UpdateMemberBusinessRoleBody.md) | List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

