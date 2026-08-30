# \BusinessAccessAssetsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetGroupCreate**](BusinessAccessAssetsAPI.md#AssetGroupCreate) | **Post** /businesses/{business_id}/asset_groups | Create a new asset group.
[**AssetGroupDelete**](BusinessAccessAssetsAPI.md#AssetGroupDelete) | **Delete** /businesses/{business_id}/asset_groups | Delete asset groups.
[**AssetGroupUpdate**](BusinessAccessAssetsAPI.md#AssetGroupUpdate) | **Patch** /businesses/{business_id}/asset_groups | Update asset groups.
[**BusinessAssetMembersGet**](BusinessAccessAssetsAPI.md#BusinessAssetMembersGet) | **Get** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**BusinessAssetPartnersGet**](BusinessAccessAssetsAPI.md#BusinessAssetPartnersGet) | **Get** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**BusinessAssetsGet**](BusinessAccessAssetsAPI.md#BusinessAssetsGet) | **Get** /businesses/{business_id}/assets | List business assets
[**BusinessMemberAssetsGet**](BusinessAccessAssetsAPI.md#BusinessMemberAssetsGet) | **Get** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**BusinessMembersAssetAccessDelete**](BusinessAccessAssetsAPI.md#BusinessMembersAssetAccessDelete) | **Delete** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**BusinessMembersAssetAccessUpdate**](BusinessAccessAssetsAPI.md#BusinessMembersAssetAccessUpdate) | **Patch** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**BusinessPartnerAssetAccessGet**](BusinessAccessAssetsAPI.md#BusinessPartnerAssetAccessGet) | **Get** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**DeletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsAPI.md#DeletePartnerAssetAccessHandlerImpl) | **Delete** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**UpdatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsAPI.md#UpdatePartnerAssetAccessHandlerImpl) | **Patch** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions



## AssetGroupCreate

> AssetGroupInput AssetGroupCreate(ctx, businessId).AssetGroupInputCreate(assetGroupInputCreate).Execute()

Create a new asset group.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	assetGroupInputCreate := *openapiclient.NewAssetGroupInputCreate("Asset groups that has ad accounts shared in Canada", "Canada Ad Accounts", []openapiclient.AssetGroupType{openapiclient.AssetGroupType("BRAND")}) // AssetGroupInputCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.AssetGroupCreate(context.Background(), businessId).AssetGroupInputCreate(assetGroupInputCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.AssetGroupCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetGroupCreate`: AssetGroupInput
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.AssetGroupCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetGroupCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetGroupInputCreate** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md) |  | 

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetGroupDelete

> AssetGroupDeletion AssetGroupDelete(ctx, businessId).AssetGroupDeletionDelete(assetGroupDeletionDelete).Execute()

Delete asset groups.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	assetGroupDeletionDelete := *openapiclient.NewAssetGroupDeletionDelete([]string{"AssetGroupsToDelete_example"}) // AssetGroupDeletionDelete | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.AssetGroupDelete(context.Background(), businessId).AssetGroupDeletionDelete(assetGroupDeletionDelete).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.AssetGroupDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetGroupDelete`: AssetGroupDeletion
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.AssetGroupDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetGroupDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md) |  | 

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetGroupUpdate

> AssetGroupModification AssetGroupUpdate(ctx, businessId).AssetGroupModificationReadOrUpdate(assetGroupModificationReadOrUpdate).Execute()

Update asset groups.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	assetGroupModificationReadOrUpdate := *openapiclient.NewAssetGroupModificationReadOrUpdate() // AssetGroupModificationReadOrUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.AssetGroupUpdate(context.Background(), businessId).AssetGroupModificationReadOrUpdate(assetGroupModificationReadOrUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.AssetGroupUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetGroupUpdate`: AssetGroupModification
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.AssetGroupUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetGroupUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md) |  | 

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessAssetMembersGet

> BusinessAssetMembersGet200Response BusinessAssetMembersGet(ctx, businessId, assetId).StartIndex(startIndex).FetchSystemUsers(fetchSystemUsers).Bookmark(bookmark).PageSize(pageSize).Execute()

Get members with access to asset



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	assetId := "assetId_example" // string | Unique identifier of a business asset.
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	fetchSystemUsers := true // bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to false)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessAssetMembersGet(context.Background(), businessId, assetId).StartIndex(startIndex).FetchSystemUsers(fetchSystemUsers).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessAssetMembersGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessAssetMembersGet`: BusinessAssetMembersGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessAssetMembersGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 
**assetId** | **string** | Unique identifier of a business asset. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessAssetMembersGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **fetchSystemUsers** | **bool** | Fetches system users if True. Fetches regular user employees if False. | [default to false]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessAssetPartnersGet

> BusinessAssetMembersGet200Response BusinessAssetPartnersGet(ctx, businessId, assetId).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()

Get partners with access to asset



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	assetId := "assetId_example" // string | Unique identifier of a business asset.
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessAssetPartnersGet(context.Background(), businessId, assetId).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessAssetPartnersGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessAssetPartnersGet`: BusinessAssetMembersGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessAssetPartnersGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 
**assetId** | **string** | Unique identifier of a business asset. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessAssetPartnersGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessAssetsGet

> BusinessAssetsGet200Response BusinessAssetsGet(ctx, businessId).Permissions(permissions).ChildAssetId(childAssetId).AssetGroupId(assetGroupId).AssetType(assetType).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()

List business assets



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	permissions := []openapiclient.PermissionsWithOwner{openapiclient.PermissionsWithOwner("ADMIN")} // []PermissionsWithOwner | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
	childAssetId := "childAssetId_example" // string | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
	assetGroupId := "assetGroupId_example" // string | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
	assetType := "assetType_example" // string | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessAssetsGet(context.Background(), businessId).Permissions(permissions).ChildAssetId(childAssetId).AssetGroupId(assetGroupId).AssetType(assetType).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessAssetsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessAssetsGet`: BusinessAssetsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessAssetsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessAssetsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **permissions** | [**[]PermissionsWithOwner**](PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | 
 **childAssetId** | **string** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | 
 **assetGroupId** | **string** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | 
 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessMemberAssetsGet

> BusinessMemberAssetsGetResponse BusinessMemberAssetsGet(ctx, businessId, memberId).AssetType(assetType).StartIndex(startIndex).SortBy(sortBy).SortAscending(sortAscending).SearchBy(searchBy).SearchValue(searchValue).AssetPermissionType(assetPermissionType).AdAccountStatuses(adAccountStatuses).Bookmark(bookmark).PageSize(pageSize).Execute()

Get assets assigned to a member



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	memberId := "memberId_example" // string | The member id to fetch assets for.
	assetType := "assetType_example" // string | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	sortBy := openapiclient.AssetSortBy("NAME") // AssetSortBy | The field to sort member assets by (optional)
	sortAscending := true // bool | Sort assets in ascending order (optional) (default to true)
	searchBy := openapiclient.AssetSearchBy("NAME") // AssetSearchBy | The field to search member assets by (optional)
	searchValue := "searchValue_example" // string | The value to search for (optional)
	assetPermissionType := openapiclient.AssetPermissionType("AGGREGATED_PERMISSION") // AssetPermissionType | The type of asset permission to filter by (optional)
	adAccountStatuses := []openapiclient.NonDraftEntityStatus{openapiclient.NonDraftEntityStatus("ACTIVE")} // []NonDraftEntityStatus | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessMemberAssetsGet(context.Background(), businessId, memberId).AssetType(assetType).StartIndex(startIndex).SortBy(sortBy).SortAscending(sortAscending).SearchBy(searchBy).SearchValue(searchValue).AssetPermissionType(assetPermissionType).AdAccountStatuses(adAccountStatuses).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessMemberAssetsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessMemberAssetsGet`: BusinessMemberAssetsGetResponse
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessMemberAssetsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 
**memberId** | **string** | The member id to fetch assets for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessMemberAssetsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **sortBy** | [**AssetSortBy**](AssetSortBy.md) | The field to sort member assets by | 
 **sortAscending** | **bool** | Sort assets in ascending order | [default to true]
 **searchBy** | [**AssetSearchBy**](AssetSearchBy.md) | The field to search member assets by | 
 **searchValue** | **string** | The value to search for | 
 **assetPermissionType** | [**AssetPermissionType**](AssetPermissionType.md) | The type of asset permission to filter by | 
 **adAccountStatuses** | [**[]NonDraftEntityStatus**](NonDraftEntityStatus.md) | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessMembersAssetAccessDelete

> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete(ctx, businessId).BusinessMembersAssetAccessDeleteBody(businessMembersAssetAccessDeleteBody).Execute()

Delete member access to asset



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	businessMembersAssetAccessDeleteBody := *openapiclient.NewBusinessMembersAssetAccessDeleteBody([]openapiclient.DeleteMemberAssetAccessItem{*openapiclient.NewDeleteMemberAssetAccessItem("AssetId_example", "MemberId_example")}) // BusinessMembersAssetAccessDeleteBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessMembersAssetAccessDelete(context.Background(), businessId).BusinessMembersAssetAccessDeleteBody(businessMembersAssetAccessDeleteBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessMembersAssetAccessDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessMembersAssetAccessDelete`: DeleteMemberAccessResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessMembersAssetAccessDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessMembersAssetAccessDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **businessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md) |  | 

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessMembersAssetAccessUpdate

> UpdateMemberAssetsResultsResponseArray BusinessMembersAssetAccessUpdate(ctx, businessId).UpdateMemberAssetAccessBody(updateMemberAssetAccessBody).Execute()

Assign/Update member asset permissions



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	updateMemberAssetAccessBody := *openapiclient.NewUpdateMemberAssetAccessBody([]openapiclient.UpdateMemberAssetAccessItem{*openapiclient.NewUpdateMemberAssetAccessItem("AssetId_example", "MemberId_example", []openapiclient.Permissions{openapiclient.Permissions("ADMIN")})}) // UpdateMemberAssetAccessBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessMembersAssetAccessUpdate(context.Background(), businessId).UpdateMemberAssetAccessBody(updateMemberAssetAccessBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessMembersAssetAccessUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessMembersAssetAccessUpdate`: UpdateMemberAssetsResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessMembersAssetAccessUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessMembersAssetAccessUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) |  | 

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessPartnerAssetAccessGet

> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet(ctx, businessId, partnerId).PartnerType(partnerType).AssetType(assetType).StartIndex(startIndex).SortBy(sortBy).SortAscending(sortAscending).SearchBy(searchBy).SearchValue(searchValue).Bookmark(bookmark).PageSize(pageSize).Execute()

Get assets assigned to a partner or assets assigned by a partner



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	partnerId := "partnerId_example" // string | The partner id to be bound to the Business
	partnerType := "partnerType_example" // string | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional) (default to "INTERNAL")
	assetType := "assetType_example" // string | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	sortBy := openapiclient.AssetSortBy("NAME") // AssetSortBy | The field to sort member assets by (optional)
	sortAscending := true // bool | Sort assets in ascending order (optional) (default to true)
	searchBy := openapiclient.AssetSearchBy("NAME") // AssetSearchBy | The field to search member assets by (optional)
	searchValue := "searchValue_example" // string | The value to search for (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessPartnerAssetAccessGet(context.Background(), businessId, partnerId).PartnerType(partnerType).AssetType(assetType).StartIndex(startIndex).SortBy(sortBy).SortAscending(sortAscending).SearchBy(searchBy).SearchValue(searchValue).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessPartnerAssetAccessGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessPartnerAssetAccessGet`: BusinessPartnerAssetAccessGet200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.BusinessPartnerAssetAccessGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 
**partnerId** | **string** | The partner id to be bound to the Business | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessPartnerAssetAccessGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **partnerType** | **string** | Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [default to &quot;INTERNAL&quot;]
 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **sortBy** | [**AssetSortBy**](AssetSortBy.md) | The field to sort member assets by | 
 **sortAscending** | **bool** | Sort assets in ascending order | [default to true]
 **searchBy** | [**AssetSearchBy**](AssetSearchBy.md) | The field to search member assets by | 
 **searchValue** | **string** | The value to search for | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeletePartnerAssetAccessHandlerImpl

> DeletePartnerAssetAccessResultsResponseArray DeletePartnerAssetAccessHandlerImpl(ctx, businessId).DeletePartnerAssetAccessBody(deletePartnerAssetAccessBody).Execute()

Delete partner access to asset



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	deletePartnerAssetAccessBody := *openapiclient.NewDeletePartnerAssetAccessBody([]openapiclient.DeletePartnerAssetAccessItem{*openapiclient.NewDeletePartnerAssetAccessItem("AssetId_example", "PartnerId_example")}) // DeletePartnerAssetAccessBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.DeletePartnerAssetAccessHandlerImpl(context.Background(), businessId).DeletePartnerAssetAccessBody(deletePartnerAssetAccessBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.DeletePartnerAssetAccessHandlerImpl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeletePartnerAssetAccessHandlerImpl`: DeletePartnerAssetAccessResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.DeletePartnerAssetAccessHandlerImpl`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeletePartnerAssetAccessHandlerImplRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  | 

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdatePartnerAssetAccessHandlerImpl

> UpdatePartnerAssetsResultsResponseArray UpdatePartnerAssetAccessHandlerImpl(ctx, businessId).UpdatePartnerAssetAccessBody(updatePartnerAssetAccessBody).Execute()

Assign/Update partner asset permissions



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	updatePartnerAssetAccessBody := *openapiclient.NewUpdatePartnerAssetAccessBody([]openapiclient.UpdatePartnerAssetAccessItem{*openapiclient.NewUpdatePartnerAssetAccessItem("AssetId_example", "PartnerId_example", []openapiclient.Permissions{openapiclient.Permissions("ADMIN")})}) // UpdatePartnerAssetAccessBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.UpdatePartnerAssetAccessHandlerImpl(context.Background(), businessId).UpdatePartnerAssetAccessBody(updatePartnerAssetAccessBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.UpdatePartnerAssetAccessHandlerImpl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdatePartnerAssetAccessHandlerImpl`: UpdatePartnerAssetsResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessAssetsAPI.UpdatePartnerAssetAccessHandlerImpl`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdatePartnerAssetAccessHandlerImplRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) |  | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

