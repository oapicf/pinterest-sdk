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
    open class func assetGroupCreate(businessId: String, assetGroupInputCreate: AssetGroupInputCreate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AssetGroupInput
```

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetGroupInputCreate = AssetGroupInputCreate(assetGroup: AssetGroupBinding(adAccountsIds: ["adAccountsIds_example"], assetGroupDescription: "assetGroupDescription_example", assetGroupName: "assetGroupName_example", assetGroupTypes: ["assetGroupTypes_example"], catalogsIds: ["catalogsIds_example"], createdBy: BusinessAccessUserSummary(email: "email_example", id: "id_example", username: "username_example"), createdTime: 123, id: "id_example", owner: nil, profilesIds: ["profilesIds_example"], updatedTime: 123), assetGroupDescription: "assetGroupDescription_example", assetGroupName: "assetGroupName_example", assetGroupTypes: [AssetGroupType()]) // AssetGroupInputCreate | 

// Create a new asset group.
do {
    let response = try await BusinessAccessAssetsAPI.assetGroupCreate(businessId: businessId, assetGroupInputCreate: assetGroupInputCreate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **assetGroupInputCreate** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md) |  | 

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupDelete**
```swift
    open class func assetGroupDelete(businessId: String, assetGroupDeletionDelete: AssetGroupDeletionDelete, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AssetGroupDeletion
```

Delete asset groups.

Delete a batch of asset groups.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetGroupDeletionDelete = AssetGroupDeletionDelete(assetGroupsToDelete: ["assetGroupsToDelete_example"]) // AssetGroupDeletionDelete | 

// Delete asset groups.
do {
    let response = try await BusinessAccessAssetsAPI.assetGroupDelete(businessId: businessId, assetGroupDeletionDelete: assetGroupDeletionDelete)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **assetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md) |  | 

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupUpdate**
```swift
    open class func assetGroupUpdate(businessId: String, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> AssetGroupModification
```

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetGroupModificationReadOrUpdate = AssetGroupModificationReadOrUpdate(assetGroupsToUpdate: [AssetGroupUpdateItemReadOrUpdateItem(assetGroupId: "assetGroupId_example", assetGroupTypes: [AssetGroupType()], assetsToAdd: ["assetsToAdd_example"], assetsToRemove: ["assetsToRemove_example"], description: "description_example", name: "name_example")], exceptions: [AssetGroupUpdateError(assetGroupId: "assetGroupId_example", code: 123, message: "message_example")], updatedAssetGroups: [AssetGroupBinding(adAccountsIds: ["adAccountsIds_example"], assetGroupDescription: "assetGroupDescription_example", assetGroupName: "assetGroupName_example", assetGroupTypes: ["assetGroupTypes_example"], catalogsIds: ["catalogsIds_example"], createdBy: BusinessAccessUserSummary(email: "email_example", id: "id_example", username: "username_example"), createdTime: 123, id: "id_example", owner: nil, profilesIds: ["profilesIds_example"], updatedTime: 123)]) // AssetGroupModificationReadOrUpdate | 

// Update asset groups.
do {
    let response = try await BusinessAccessAssetsAPI.assetGroupUpdate(businessId: businessId, assetGroupModificationReadOrUpdate: assetGroupModificationReadOrUpdate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **assetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md) |  | 

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetMembersGet**
```swift
    open class func businessAssetMembersGet(businessId: String, assetId: String, startIndex: Int? = nil, fetchSystemUsers: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BusinessAssetMembersGet200Response
```

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let assetId = "assetId_example" // String | Unique identifier of a business asset.
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let fetchSystemUsers = true // Bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to false)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get members with access to asset
do {
    let response = try await BusinessAccessAssetsAPI.businessAssetMembersGet(businessId: businessId, assetId: assetId, startIndex: startIndex, fetchSystemUsers: fetchSystemUsers, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **assetId** | **String** | Unique identifier of a business asset. | 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **fetchSystemUsers** | **Bool** | Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
    open class func businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BusinessAssetMembersGet200Response
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
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get partners with access to asset
do {
    let response = try await BusinessAccessAssetsAPI.businessAssetPartnersGet(businessId: businessId, assetId: assetId, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **assetId** | **String** | Unique identifier of a business asset. | 
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetsGet**
```swift
    open class func businessAssetsGet(businessId: String, permissions: [PermissionsWithOwner]? = nil, childAssetId: String? = nil, assetGroupId: String? = nil, assetType: AssetType_businessAssetsGet? = nil, startIndex: Int? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BusinessAssetsGet200Response
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
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List business assets
do {
    let response = try await BusinessAccessAssetsAPI.businessAssetsGet(businessId: businessId, permissions: permissions, childAssetId: childAssetId, assetGroupId: assetGroupId, assetType: assetType, startIndex: startIndex, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
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
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
    open class func businessMemberAssetsGet(businessId: String, memberId: String, assetType: AssetType_businessMemberAssetsGet? = nil, startIndex: Int? = nil, sortBy: AssetSortBy? = nil, sortAscending: Bool? = nil, searchBy: AssetSearchBy? = nil, searchValue: String? = nil, assetPermissionType: AssetPermissionType? = nil, adAccountStatuses: [NonDraftEntityStatus]? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BusinessMemberAssetsGetResponse
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
let sortBy = AssetSortBy() // AssetSortBy | The field to sort member assets by (optional)
let sortAscending = true // Bool | Sort assets in ascending order (optional) (default to true)
let searchBy = AssetSearchBy() // AssetSearchBy | The field to search member assets by (optional)
let searchValue = "searchValue_example" // String | The value to search for (optional)
let assetPermissionType = AssetPermissionType() // AssetPermissionType | The type of asset permission to filter by (optional)
let adAccountStatuses = [NonDraftEntityStatus()] // [NonDraftEntityStatus] | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get assets assigned to a member
do {
    let response = try await BusinessAccessAssetsAPI.businessMemberAssetsGet(businessId: businessId, memberId: memberId, assetType: assetType, startIndex: startIndex, sortBy: sortBy, sortAscending: sortAscending, searchBy: searchBy, searchValue: searchValue, assetPermissionType: assetPermissionType, adAccountStatuses: adAccountStatuses, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **memberId** | **String** | The member id to fetch assets for. | 
 **assetType** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to .adAccount]
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortBy** | [**AssetSortBy**](.md) | The field to sort member assets by | [optional] 
 **sortAscending** | **Bool** | Sort assets in ascending order | [optional] [default to true]
 **searchBy** | [**AssetSearchBy**](.md) | The field to search member assets by | [optional] 
 **searchValue** | **String** | The value to search for | [optional] 
 **assetPermissionType** | [**AssetPermissionType**](.md) | The type of asset permission to filter by | [optional] 
 **adAccountStatuses** | [**[NonDraftEntityStatus]**](NonDraftEntityStatus.md) | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessDelete**
```swift
    open class func businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> DeleteMemberAccessResultsResponseArray
```

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let businessMembersAssetAccessDeleteBody = BusinessMembersAssetAccessDeleteBody(accesses: [DeleteMemberAssetAccessItem(assetId: "assetId_example", memberId: "memberId_example")]) // BusinessMembersAssetAccessDeleteBody | 

// Delete member access to asset
do {
    let response = try await BusinessAccessAssetsAPI.businessMembersAssetAccessDelete(businessId: businessId, businessMembersAssetAccessDeleteBody: businessMembersAssetAccessDeleteBody)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **businessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md) |  | 

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
    open class func businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UpdateMemberAssetsResultsResponseArray
```

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let updateMemberAssetAccessBody = UpdateMemberAssetAccessBody(accesses: [UpdateMemberAssetAccessItem(assetId: "assetId_example", memberId: "memberId_example", permissions: [Permissions()])]) // UpdateMemberAssetAccessBody | 

// Assign/Update member asset permissions
do {
    let response = try await BusinessAccessAssetsAPI.businessMembersAssetAccessUpdate(businessId: businessId, updateMemberAssetAccessBody: updateMemberAssetAccessBody)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) |  | 

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
    open class func businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: PartnerType_businessPartnerAssetAccessGet? = nil, assetType: AssetType_businessPartnerAssetAccessGet? = nil, startIndex: Int? = nil, sortBy: AssetSortBy? = nil, sortAscending: Bool? = nil, searchBy: AssetSearchBy? = nil, searchValue: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BusinessPartnerAssetAccessGet200Response
```

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let partnerId = "partnerId_example" // String | The partner id to be bound to the Business
let partnerType = "partnerType_example" // String | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional) (default to ._internal)
let assetType = "assetType_example" // String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to .adAccount)
let startIndex = 987 // Int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let sortBy = AssetSortBy() // AssetSortBy | The field to sort member assets by (optional)
let sortAscending = true // Bool | Sort assets in ascending order (optional) (default to true)
let searchBy = AssetSearchBy() // AssetSearchBy | The field to search member assets by (optional)
let searchValue = "searchValue_example" // String | The value to search for (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get assets assigned to a partner or assets assigned by a partner
do {
    let response = try await BusinessAccessAssetsAPI.businessPartnerAssetAccessGet(businessId: businessId, partnerId: partnerId, partnerType: partnerType, assetType: assetType, startIndex: startIndex, sortBy: sortBy, sortAscending: sortAscending, searchBy: searchBy, searchValue: searchValue, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **partnerId** | **String** | The partner id to be bound to the Business | 
 **partnerType** | **String** | Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to ._internal]
 **assetType** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to .adAccount]
 **startIndex** | **Int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortBy** | [**AssetSortBy**](.md) | The field to sort member assets by | [optional] 
 **sortAscending** | **Bool** | Sort assets in ascending order | [optional] [default to true]
 **searchBy** | [**AssetSearchBy**](.md) | The field to search member assets by | [optional] 
 **searchValue** | **String** | The value to search for | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
    open class func deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> DeletePartnerAssetAccessResultsResponseArray
```

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let deletePartnerAssetAccessBody = DeletePartnerAssetAccessBody(accesses: [DeletePartnerAssetAccessItem(assetId: "assetId_example", partnerId: "partnerId_example", partnerType: "partnerType_example")]) // DeletePartnerAssetAccessBody | 

// Delete partner access to asset
do {
    let response = try await BusinessAccessAssetsAPI.deletePartnerAssetAccessHandlerImpl(businessId: businessId, deletePartnerAssetAccessBody: deletePartnerAssetAccessBody)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  | 

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatePartnerAssetAccessHandlerImpl**
```swift
    open class func updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UpdatePartnerAssetsResultsResponseArray
```

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let updatePartnerAssetAccessBody = UpdatePartnerAssetAccessBody(accesses: [UpdatePartnerAssetAccessItem(assetId: "assetId_example", partnerId: "partnerId_example", permissions: [Permissions()])]) // UpdatePartnerAssetAccessBody | 

// Assign/Update partner asset permissions
do {
    let response = try await BusinessAccessAssetsAPI.updatePartnerAssetAccessHandlerImpl(businessId: businessId, updatePartnerAssetAccessBody: updatePartnerAssetAccessBody)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) |  | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

