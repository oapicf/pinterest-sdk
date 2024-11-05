# BusinessAccessInviteAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetAccessRequestsCreate**](BusinessAccessInviteAPI.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancelInvitesOrRequests**](BusinessAccessInviteAPI.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**createAssetInvites**](BusinessAccessInviteAPI.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createMembershipOrPartnershipInvites**](BusinessAccessInviteAPI.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**getInvites**](BusinessAccessInviteAPI.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respondBusinessAccessInvites**](BusinessAccessInviteAPI.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request


# **assetAccessRequestsCreate**
```swift
    open class func assetAccessRequestsCreate(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody, completion: @escaping (_ data: CreateAssetAccessRequestResponse?, _ error: Error?) -> Void)
```

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let createAssetAccessRequestBody = CreateAssetAccessRequestBody(assetRequests: [CreateAssetAccessRequestBody_asset_requests_inner(partnerId: "partnerId_example", assetIdToPermissions: "TODO")]) // CreateAssetAccessRequestBody | 

// Create a request to access an existing partner's assets.
BusinessAccessInviteAPI.assetAccessRequestsCreate(businessId: businessId, createAssetAccessRequestBody: createAssetAccessRequestBody) { (response, error) in
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
 **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md) |  | 

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelInvitesOrRequests**
```swift
    open class func cancelInvitesOrRequests(businessId: String, cancelInvitesBody: CancelInvitesBody, completion: @escaping (_ data: DeleteInvitesResultsResponseArray?, _ error: Error?) -> Void)
```

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Business id
let cancelInvitesBody = CancelInvitesBody(inviteIds: ["inviteIds_example"]) // CancelInvitesBody | A list with invite ids

// Cancel invites/requests
BusinessAccessInviteAPI.cancelInvitesOrRequests(businessId: businessId, cancelInvitesBody: cancelInvitesBody) { (response, error) in
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
 **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md) | A list with invite ids | 

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAssetInvites**
```swift
    open class func createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest, completion: @escaping (_ data: UpdateInvitesResultsResponseArray?, _ error: Error?) -> Void)
```

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let createAssetInvitesRequest = CreateAssetInvitesRequest(invites: [CreateAssetInvitesRequestItem(inviteId: "inviteId_example", inviteType: InviteType(), assetIdToPermissions: "TODO")]) // CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

// Update invite/request with an asset permission
BusinessAccessInviteAPI.createAssetInvites(businessId: businessId, createAssetInvitesRequest: createAssetInvitesRequest) { (response, error) in
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
 **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createMembershipOrPartnershipInvites**
```swift
    open class func createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody, completion: @escaping (_ data: CreateInvitesResultsResponseArray?, _ error: Error?) -> Void)
```

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Business id
let createMembershipOrPartnershipInvitesBody = CreateMembershipOrPartnershipInvitesBody(businessRole: "businessRole_example", inviteType: InviteType(), members: ["members_example"], partners: ["partners_example"]) // CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

// Create invites or requests
BusinessAccessInviteAPI.createMembershipOrPartnershipInvites(businessId: businessId, createMembershipOrPartnershipInvitesBody: createMembershipOrPartnershipInvitesBody) { (response, error) in
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
 **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role | 

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInvites**
```swift
    open class func getInvites(businessId: String, isMember: Bool? = nil, inviteStatus: [InviteStatus_getInvites]? = nil, inviteType: InviteType? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: GetInvites200Response?, _ error: Error?) -> Void)
```

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let isMember = true // Bool | A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to true)
let inviteStatus = ["inviteStatus_example"] // [String] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
let inviteType = InviteType() // InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// Get invites/requests
BusinessAccessInviteAPI.getInvites(businessId: businessId, isMember: isMember, inviteStatus: inviteStatus, inviteType: inviteType, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **isMember** | **Bool** | A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true]
 **inviteStatus** | [**[String]**](String.md) | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
 **inviteType** | [**InviteType**](.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **respondBusinessAccessInvites**
```swift
    open class func respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody, completion: @escaping (_ data: RespondToInvitesResponseArray?, _ error: Error?) -> Void)
```

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let authRespondInvitesBody = AuthRespondInvitesBody(invites: [AuthRespondInvitesBody_invites_inner(action: AuthRespondInvitesBody_invites_inner_action(acceptInvite: false, assetIdToPermissions: "TODO"), inviteId: "inviteId_example")]) // AuthRespondInvitesBody | 

// Accept or decline an invite/request
BusinessAccessInviteAPI.respondBusinessAccessInvites(authRespondInvitesBody: authRespondInvitesBody) { (response, error) in
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
 **authRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md) |  | 

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

