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

> CreateAssetGroupResponse AssetGroupCreate(ctx, businessId).CreateAssetGroupBody(createAssetGroupBody).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	createAssetGroupBody := *openapiclient.NewCreateAssetGroupBody("Canada Ad Accounts", "Asset groups that has ad accounts shared in Canada", []openapiclient.AssetGroupType{openapiclient.AssetGroupType("BRAND")}) // CreateAssetGroupBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.AssetGroupCreate(context.Background(), businessId).CreateAssetGroupBody(createAssetGroupBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.AssetGroupCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetGroupCreate`: CreateAssetGroupResponse
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

 **createAssetGroupBody** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md) |  | 

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetGroupDelete

> DeleteAssetGroupResponse AssetGroupDelete(ctx, businessId).DeleteAssetGroupBody(deleteAssetGroupBody).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	deleteAssetGroupBody := *openapiclient.NewDeleteAssetGroupBody([]string{"AssetGroupsToDelete_example"}) // DeleteAssetGroupBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.AssetGroupDelete(context.Background(), businessId).DeleteAssetGroupBody(deleteAssetGroupBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.AssetGroupDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetGroupDelete`: DeleteAssetGroupResponse
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

 **deleteAssetGroupBody** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md) |  | 

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AssetGroupUpdate

> UpdateAssetGroupResponse AssetGroupUpdate(ctx, businessId).UpdateAssetGroupBody(updateAssetGroupBody).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	updateAssetGroupBody := *openapiclient.NewUpdateAssetGroupBody() // UpdateAssetGroupBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.AssetGroupUpdate(context.Background(), businessId).UpdateAssetGroupBody(updateAssetGroupBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.AssetGroupUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetGroupUpdate`: UpdateAssetGroupResponse
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

 **updateAssetGroupBody** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md) |  | 

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessAssetMembersGet

> BusinessAssetMembersGet200Response BusinessAssetMembersGet(ctx, businessId, assetId).Bookmark(bookmark).PageSize(pageSize).StartIndex(startIndex).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	assetId := "729090764583391194" // string | Unique identifier of a business asset.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessAssetMembersGet(context.Background(), businessId, assetId).Bookmark(bookmark).PageSize(pageSize).StartIndex(startIndex).Execute()
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


 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]

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

> BusinessAssetPartnersGet200Response BusinessAssetPartnersGet(ctx, businessId, assetId).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	assetId := "729090764583391194" // string | Unique identifier of a business asset.
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessAssetPartnersGet(context.Background(), businessId, assetId).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessAssetPartnersGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessAssetPartnersGet`: BusinessAssetPartnersGet200Response
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
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	permissions := []openapiclient.PermissionsWithOwner{openapiclient.PermissionsWithOwner("ADMIN")} // []PermissionsWithOwner | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
	childAssetId := "549764894835" // string | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
	assetGroupId := "7078106104032" // string | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
	assetType := "AD_ACCOUNT" // string | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

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
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

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

> BusinessMemberAssetsGet200Response BusinessMemberAssetsGet(ctx, businessId, memberId).AssetType(assetType).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	memberId := "729090764583391194" // string | The member id to fetch assets for.
	assetType := "AD_ACCOUNT" // string | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessMemberAssetsGet(context.Background(), businessId, memberId).AssetType(assetType).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.BusinessMemberAssetsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessMemberAssetsGet`: BusinessMemberAssetsGet200Response
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
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessMembersAssetAccessDelete

> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete(ctx, businessId).BusinessMembersAssetAccessDeleteRequest(businessMembersAssetAccessDeleteRequest).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	businessMembersAssetAccessDeleteRequest := *openapiclient.NewBusinessMembersAssetAccessDeleteRequest([]openapiclient.BusinessMembersAssetAccessDeleteRequestAccessesInner{*openapiclient.NewBusinessMembersAssetAccessDeleteRequestAccessesInner("549755885175", "140943737684417")}) // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessMembersAssetAccessDelete(context.Background(), businessId).BusinessMembersAssetAccessDeleteRequest(businessMembersAssetAccessDeleteRequest).Execute()
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

 **businessMembersAssetAccessDeleteRequest** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. | 

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	updateMemberAssetAccessBody := *openapiclient.NewUpdateMemberAssetAccessBody([]openapiclient.UpdateMemberAssetAccessBodyAccessesInner{*openapiclient.NewUpdateMemberAssetAccessBodyAccessesInner("549755885175", "140943737684417", []openapiclient.Permissions{openapiclient.Permissions("ADMIN")})}) // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

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

 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. | 

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

> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet(ctx, businessId, partnerId).PartnerType(partnerType).AssetType(assetType).StartIndex(startIndex).PageSize(pageSize).Bookmark(bookmark).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	partnerId := "729090764583391194" // string | The partner id to be bound to the Business
	partnerType := openapiclient.PartnerType("INTERNAL") // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
	assetType := "AD_ACCOUNT" // string | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.BusinessPartnerAssetAccessGet(context.Background(), businessId, partnerId).PartnerType(partnerType).AssetType(assetType).StartIndex(startIndex).PageSize(pageSize).Bookmark(bookmark).Execute()
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


 **partnerType** | [**PartnerType**](PartnerType.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | 
 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

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

> DeletePartnerAssetsResultsResponseArray DeletePartnerAssetAccessHandlerImpl(ctx, businessId).DeletePartnerAssetAccessBody(deletePartnerAssetAccessBody).Execute()

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	deletePartnerAssetAccessBody := *openapiclient.NewDeletePartnerAssetAccessBody([]openapiclient.DeletePartnerAssetAccessBodyAccessesInner{*openapiclient.NewDeletePartnerAssetAccessBodyAccessesInner("1234567890123", "549755885175")}) // DeletePartnerAssetAccessBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessAssetsAPI.DeletePartnerAssetAccessHandlerImpl(context.Background(), businessId).DeletePartnerAssetAccessBody(deletePartnerAssetAccessBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessAssetsAPI.DeletePartnerAssetAccessHandlerImpl``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeletePartnerAssetAccessHandlerImpl`: DeletePartnerAssetsResultsResponseArray
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

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

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
	businessId := "729090764583391194" // string | Unique identifier of the requesting business.
	updatePartnerAssetAccessBody := *openapiclient.NewUpdatePartnerAssetAccessBody([]openapiclient.UpdatePartnerAssetAccessBodyAccessesInner{*openapiclient.NewUpdatePartnerAssetAccessBodyAccessesInner("1234567890123", "549755885175", []openapiclient.Permissions{openapiclient.Permissions("ADMIN")})}) // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

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

 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. | 

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

