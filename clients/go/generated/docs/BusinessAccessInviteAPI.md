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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	createAssetAccessRequestBody := *openapiclient.NewCreateAssetAccessRequestBody([]openapiclient.CreateAssetAccessRequestItem{*openapiclient.NewCreateAssetAccessRequestItem(map[string][]openapiclient.Permissions{"key": []openapiclient.Permissions{openapiclient.Permissions("ADMIN")}}, "PartnerId_example")}) // CreateAssetAccessRequestBody | 

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

> CancelInvitesResponse CancelInvitesOrRequests(ctx, businessId).CancelInvitesRequest(cancelInvitesRequest).Execute()

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	cancelInvitesRequest := *openapiclient.NewCancelInvitesRequest([]string{"InviteIds_example"}) // CancelInvitesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessInviteAPI.CancelInvitesOrRequests(context.Background(), businessId).CancelInvitesRequest(cancelInvitesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessInviteAPI.CancelInvitesOrRequests``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelInvitesOrRequests`: CancelInvitesResponse
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessInviteAPI.CancelInvitesOrRequests`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelInvitesOrRequestsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **cancelInvitesRequest** | [**CancelInvitesRequest**](CancelInvitesRequest.md) |  | 

### Return type

[**CancelInvitesResponse**](CancelInvitesResponse.md)

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	createAssetInvitesRequest := *openapiclient.NewCreateAssetInvitesRequest([]openapiclient.CreateAssetInvitesRequestItem{*openapiclient.NewCreateAssetInvitesRequestItem(map[string][]openapiclient.Permissions{"key": []openapiclient.Permissions{openapiclient.Permissions("ADMIN")}}, "1234567890123", openapiclient.InviteType("MEMBER_INVITE"))}) // CreateAssetInvitesRequest | 

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

 **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md) |  | 

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	createMembershipOrPartnershipInvitesBody := *openapiclient.NewCreateMembershipOrPartnershipInvitesBody(openapiclient.BusinessRoleForInvite("EMPLOYEE"), openapiclient.InviteType("MEMBER_INVITE")) // CreateMembershipOrPartnershipInvitesBody | 

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
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateMembershipOrPartnershipInvitesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md) |  | 

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	isMember := true // bool | A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to true)
	inviteStatus := []openapiclient.InviteFilterStatus{openapiclient.InviteFilterStatus("PENDING")} // []InviteFilterStatus | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
	inviteType := openapiclient.InviteType("MEMBER_INVITE") // InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

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
 **inviteStatus** | [**[]InviteFilterStatus**](InviteFilterStatus.md) | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | 
 **inviteType** | [**InviteType**](InviteType.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

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
	authRespondInvitesBody := *openapiclient.NewAuthRespondInvitesBody([]openapiclient.AuthRespondInvitesBodyItem{*openapiclient.NewAuthRespondInvitesBodyItem(*openapiclient.NewAuthRespondInviteAction(false), "InviteId_example")}) // AuthRespondInvitesBody | 

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

