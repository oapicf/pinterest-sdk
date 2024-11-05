# BusinessAccessAssetsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetGroupCreate**](BusinessAccessAssetsAPI.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**assetGroupDelete**](BusinessAccessAssetsAPI.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**assetGroupUpdate**](BusinessAccessAssetsAPI.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**businessAssetMembersGet**](BusinessAccessAssetsAPI.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**businessAssetPartnersGet**](BusinessAccessAssetsAPI.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**businessAssetsGet**](BusinessAccessAssetsAPI.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets
[**businessMemberAssetsGet**](BusinessAccessAssetsAPI.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**businessMembersAssetAccessDelete**](BusinessAccessAssetsAPI.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**businessMembersAssetAccessUpdate**](BusinessAccessAssetsAPI.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**businessPartnerAssetAccessGet**](BusinessAccessAssetsAPI.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsAPI.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsAPI.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **assetGroupCreate**
```swift
    open class func assetGroupCreate(businessId: String, createAssetGroupBody: CreateAssetGroupBody, completion: @escaping (_ data: CreateAssetGroupResponse?, _ error: Error?) -> Void)
```

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let createAssetGroupBody = CreateAssetGroupBody(assetGroupName: "assetGroupName_example", assetGroupDescription: "assetGroupDescription_example", assetGroupTypes: [AssetGroupType()]) // CreateAssetGroupBody | 

// Create a new asset group.
BusinessAccessAssetsAPI.assetGroupCreate(businessId: businessId, createAssetGroupBody: createAssetGroupBody) { (response, error) in
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
 **createAssetGroupBody** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md) |  | 

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupDelete**
```swift
    open class func assetGroupDelete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody, completion: @escaping (_ data: DeleteAssetGroupResponse?, _ error: Error?) -> Void)
```

Delete asset groups.

Delete a batch of asset groups.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let deleteAssetGroupBody = DeleteAssetGroupBody(assetGroupsToDelete: ["assetGroupsToDelete_example"]) // DeleteAssetGroupBody | 

// Delete asset groups.
BusinessAccessAssetsAPI.assetGroupDelete(businessId: businessId, deleteAssetGroupBody: deleteAssetGroupBody) { (response, error) in
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
 **deleteAssetGroupBody** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md) |  | 

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupUpdate**
```swift
    open class func assetGroupUpdate(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody, completion: @escaping (_ data: UpdateAssetGroupResponse?, _ error: Error?) -> Void)
```

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let updateAssetGroupBody = UpdateAssetGroupBody(assetGroupsToUpdate: [UpdateAssetGroupBody_asset_groups_to_update_inner(assetGroupId: "assetGroupId_example", name: "name_example", description: "description_example", assetGroupTypes: [AssetGroupType()], assetsToAdd: ["assetsToAdd_example"], assetsToRemove: ["assetsToRemove_example"])]) // UpdateAssetGroupBody | 

// Update asset groups.
BusinessAccessAssetsAPI.assetGroupUpdate(businessId: businessId, updateAssetGroupBody: updateAssetGroupBody) { (response, error) in
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
 **updateAssetGroupBody** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md) |  | 

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetMembersGet**
```swift
    open class func businessAssetMembersGet(businessId: String, assetId: String, bookmark: String? = nil, pageSize: Int? = nil, startIndex: Int? = nil, completion: @escaping (_ data: BusinessAssetMembersGet200Response?, _ error: Error?) -> Void)
```

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetId = "assetId_example" // String | Unique identifier of a business asset.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)

// Get members with access to asset
BusinessAccessAssetsAPI.businessAssetMembersGet(businessId: businessId, assetId: assetId, bookmark: bookmark, pageSize: pageSize, startIndex: startIndex) { (response, error) in
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
 **assetId** | **String** | Unique identifier of a business asset. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetPartnersGet**
```swift
    open class func businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: BusinessAssetPartnersGet200Response?, _ error: Error?) -> Void)
```

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetId = "assetId_example" // String | Unique identifier of a business asset.
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// Get partners with access to asset
BusinessAccessAssetsAPI.businessAssetPartnersGet(businessId: businessId, assetId: assetId, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **assetId** | **String** | Unique identifier of a business asset. | 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetsGet**
```swift
    open class func businessAssetsGet(businessId: String, permissions: [PermissionsWithOwner]? = nil, childAssetId: String? = nil, assetGroupId: String? = nil, assetType: AssetType_businessAssetsGet? = nil, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: BusinessAssetsGet200Response?, _ error: Error?) -> Void)
```

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let permissions = [PermissionsWithOwner()] // [PermissionsWithOwner] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
let childAssetId = "childAssetId_example" // String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
let assetGroupId = "assetGroupId_example" // String | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
let assetType = "assetType_example" // String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to .adAccount)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// List business assets
BusinessAccessAssetsAPI.businessAssetsGet(businessId: businessId, permissions: permissions, childAssetId: childAssetId, assetGroupId: assetGroupId, assetType: assetType, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **permissions** | [**[PermissionsWithOwner]**](PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **childAssetId** | **String** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **assetGroupId** | **String** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **assetType** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to .adAccount]
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMemberAssetsGet**
```swift
    open class func businessMemberAssetsGet(businessId: String, memberId: String, assetType: AssetType_businessMemberAssetsGet? = nil, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: BusinessMemberAssetsGet200Response?, _ error: Error?) -> Void)
```

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let memberId = "memberId_example" // String | The member id to fetch assets for.
let assetType = "assetType_example" // String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to .adAccount)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// Get assets assigned to a member
BusinessAccessAssetsAPI.businessMemberAssetsGet(businessId: businessId, memberId: memberId, assetType: assetType, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **memberId** | **String** | The member id to fetch assets for. | 
 **assetType** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to .adAccount]
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessDelete**
```swift
    open class func businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest, completion: @escaping (_ data: DeleteMemberAccessResultsResponseArray?, _ error: Error?) -> Void)
```

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let businessMembersAssetAccessDeleteRequest = business_members_asset_access_delete_request(accesses: [business_members_asset_access_delete_request_accesses_inner(assetId: "assetId_example", memberId: "memberId_example")]) // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

// Delete member access to asset
BusinessAccessAssetsAPI.businessMembersAssetAccessDelete(businessId: businessId, businessMembersAssetAccessDeleteRequest: businessMembersAssetAccessDeleteRequest) { (response, error) in
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
 **businessMembersAssetAccessDeleteRequest** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. | 

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessUpdate**
```swift
    open class func businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody, completion: @escaping (_ data: UpdateMemberAssetsResultsResponseArray?, _ error: Error?) -> Void)
```

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let updateMemberAssetAccessBody = UpdateMemberAssetAccessBody(accesses: [UpdateMemberAssetAccessBody_accesses_inner(assetId: "assetId_example", memberId: "memberId_example", permissions: [Permissions()])]) // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

// Assign/Update member asset permissions
BusinessAccessAssetsAPI.businessMembersAssetAccessUpdate(businessId: businessId, updateMemberAssetAccessBody: updateMemberAssetAccessBody) { (response, error) in
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
 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. | 

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessPartnerAssetAccessGet**
```swift
    open class func businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: PartnerType? = nil, assetType: AssetType_businessPartnerAssetAccessGet? = nil, startIndex: Int? = nil, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: BusinessPartnerAssetAccessGet200Response?, _ error: Error?) -> Void)
```

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let partnerId = "partnerId_example" // String | The partner id to be bound to the Business
let partnerType = PartnerType() // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
let assetType = "assetType_example" // String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to .adAccount)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get assets assigned to a partner or assets assigned by a partner
BusinessAccessAssetsAPI.businessPartnerAssetAccessGet(businessId: businessId, partnerId: partnerId, partnerType: partnerType, assetType: assetType, startIndex: startIndex, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **partnerId** | **String** | The partner id to be bound to the Business | 
 **partnerType** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **assetType** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to .adAccount]
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deletePartnerAssetAccessHandlerImpl**
```swift
    open class func deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody, completion: @escaping (_ data: DeletePartnerAssetsResultsResponseArray?, _ error: Error?) -> Void)
```

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let deletePartnerAssetAccessBody = DeletePartnerAssetAccessBody(accesses: [DeletePartnerAssetAccessBody_accesses_inner(partnerId: "partnerId_example", assetId: "assetId_example", partnerType: "partnerType_example")]) // DeletePartnerAssetAccessBody | 

// Delete partner access to asset
BusinessAccessAssetsAPI.deletePartnerAssetAccessHandlerImpl(businessId: businessId, deletePartnerAssetAccessBody: deletePartnerAssetAccessBody) { (response, error) in
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
 **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  | 

### Return type

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatePartnerAssetAccessHandlerImpl**
```swift
    open class func updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody, completion: @escaping (_ data: UpdatePartnerAssetsResultsResponseArray?, _ error: Error?) -> Void)
```

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let updatePartnerAssetAccessBody = UpdatePartnerAssetAccessBody(accesses: [UpdatePartnerAssetAccessBody_accesses_inner(partnerId: "partnerId_example", assetId: "assetId_example", permissions: [Permissions()])]) // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

// Assign/Update partner asset permissions
BusinessAccessAssetsAPI.updatePartnerAssetAccessHandlerImpl(businessId: businessId, updatePartnerAssetAccessBody: updatePartnerAssetAccessBody) { (response, error) in
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
 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

