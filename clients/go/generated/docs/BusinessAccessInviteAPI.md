# \BusinessAccessInviteAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetAccessRequestsCreate**](BusinessAccessInviteAPI.md#AssetAccessRequestsCreate) | **Post** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**CancelInvitesOrRequests**](BusinessAccessInviteAPI.md#CancelInvitesOrRequests) | **Delete** /businesses/{business_id}/invites | Cancel invites/requests
[**CreateAssetInvites**](BusinessAccessInviteAPI.md#CreateAssetInvites) | **Post** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**CreateMembershipOrPartnershipInvites**](BusinessAccessInviteAPI.md#CreateMembershipOrPartnershipInvites) | **Post** /businesses/{business_id}/invites | Create invites or requests
[**GetInvites**](BusinessAccessInviteAPI.md#GetInvites) | **Get** /businesses/{business_id}/invites | Get invites/requests
[**RespondBusinessAccessInvites**](BusinessAccessInviteAPI.md#RespondBusinessAccessInvites) | **Patch** /businesses/invites | Accept or decline an invite/request



## AssetAccessRequestsCreate

> CreateAssetAccessRequestResponse AssetAccessRequestsCreate(ctx, businessId).CreateAssetAccessRequestBody(createAssetAccessRequestBody).Execute()

Create a request to access an existing partner's assets.



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
	createAssetAccessRequestBody := *openapiclient.NewCreateAssetAccessRequestBody([]openapiclient.CreateAssetAccessRequestBodyAssetRequestsInner{*openapiclient.NewCreateAssetAccessRequestBodyAssetRequestsInner("809944451643622187", map[string][]openapiclient.Permissions{"key": []openapiclient.Permissions{openapiclient.Permissions("ADMIN")}})}) // CreateAssetAccessRequestBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.AssetAccessRequestsCreate(context.Background(), businessId).CreateAssetAccessRequestBody(createAssetAccessRequestBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.AssetAccessRequestsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssetAccessRequestsCreate`: CreateAssetAccessRequestResponse
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.AssetAccessRequestsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssetAccessRequestsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md) |  | 

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CancelInvitesOrRequests

> DeleteInvitesResultsResponseArray CancelInvitesOrRequests(ctx, businessId).CancelInvitesBody(cancelInvitesBody).Execute()

Cancel invites/requests



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
	businessId := "729090764583391194" // string | Business id
	cancelInvitesBody := *openapiclient.NewCancelInvitesBody([]string{"InviteIds_example"}) // CancelInvitesBody | A list with invite ids

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.CancelInvitesOrRequests(context.Background(), businessId).CancelInvitesBody(cancelInvitesBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.CancelInvitesOrRequests``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelInvitesOrRequests`: DeleteInvitesResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.CancelInvitesOrRequests`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Business id | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelInvitesOrRequestsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md) | A list with invite ids | 

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateAssetInvites

> UpdateInvitesResultsResponseArray CreateAssetInvites(ctx, businessId).CreateAssetInvitesRequest(createAssetInvitesRequest).Execute()

Update invite/request with an asset permission



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
	createAssetInvitesRequest := *openapiclient.NewCreateAssetInvitesRequest([]openapiclient.CreateAssetInvitesRequestItem{*openapiclient.NewCreateAssetInvitesRequestItem("1234567890123", openapiclient.InviteType("MEMBER_INVITE"), map[string][]openapiclient.Permissions{"key": []openapiclient.Permissions{openapiclient.Permissions("ADMIN")}})}) // CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.CreateAssetInvites(context.Background(), businessId).CreateAssetInvitesRequest(createAssetInvitesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.CreateAssetInvites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateAssetInvites`: UpdateInvitesResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.CreateAssetInvites`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateAssetInvitesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateMembershipOrPartnershipInvites

> CreateInvitesResultsResponseArray CreateMembershipOrPartnershipInvites(ctx, businessId).CreateMembershipOrPartnershipInvitesBody(createMembershipOrPartnershipInvitesBody).Execute()

Create invites or requests



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
	businessId := "729090764583391194" // string | Business id
	createMembershipOrPartnershipInvitesBody := *openapiclient.NewCreateMembershipOrPartnershipInvitesBody("BIZ_ADMIN", openapiclient.InviteType("MEMBER_INVITE")) // CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.CreateMembershipOrPartnershipInvites(context.Background(), businessId).CreateMembershipOrPartnershipInvitesBody(createMembershipOrPartnershipInvitesBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.CreateMembershipOrPartnershipInvites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateMembershipOrPartnershipInvites`: CreateInvitesResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.CreateMembershipOrPartnershipInvites`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Business id | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateMembershipOrPartnershipInvitesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role | 

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetInvites

> GetInvites200Response GetInvites(ctx, businessId).IsMember(isMember).InviteStatus(inviteStatus).InviteType(inviteType).Bookmark(bookmark).PageSize(pageSize).Execute()

Get invites/requests



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
	isMember := true // bool | A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to true)
	inviteStatus := []string{"PENDING"} // []string | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
	inviteType := openapiclient.InviteType("MEMBER_INVITE") // InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.GetInvites(context.Background(), businessId).IsMember(isMember).InviteStatus(inviteStatus).InviteType(inviteType).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.GetInvites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetInvites`: GetInvites200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.GetInvites`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetInvitesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **isMember** | **bool** | A boolean field to indicate whether the invite is to create a partnership or a membership. | [default to true]
 **inviteStatus** | **[]string** | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | 
 **inviteType** | [**InviteType**](InviteType.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RespondBusinessAccessInvites

> RespondToInvitesResponseArray RespondBusinessAccessInvites(ctx).AuthRespondInvitesBody(authRespondInvitesBody).Execute()

Accept or decline an invite/request



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
	authRespondInvitesBody := *openapiclient.NewAuthRespondInvitesBody([]openapiclient.AuthRespondInvitesBodyInvitesInner{*openapiclient.NewAuthRespondInvitesBodyInvitesInner(*openapiclient.NewAuthRespondInvitesBodyInvitesInnerAction(false), "InviteId_example")}) // AuthRespondInvitesBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.RespondBusinessAccessInvites(context.Background()).AuthRespondInvitesBody(authRespondInvitesBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.RespondBusinessAccessInvites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RespondBusinessAccessInvites`: RespondToInvitesResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.RespondBusinessAccessInvites`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRespondBusinessAccessInvitesRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

