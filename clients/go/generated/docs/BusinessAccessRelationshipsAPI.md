# \BusinessAccessRelationshipsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteBusinessMembership**](BusinessAccessRelationshipsAPI.md#DeleteBusinessMembership) | **Delete** /businesses/{business_id}/members | Terminate business memberships
[**DeleteBusinessPartners**](BusinessAccessRelationshipsAPI.md#DeleteBusinessPartners) | **Delete** /businesses/{business_id}/partners | Terminate business partnerships
[**GetBusinessEmployers**](BusinessAccessRelationshipsAPI.md#GetBusinessEmployers) | **Get** /businesses/employers | List business employers for user
[**GetBusinessMembers**](BusinessAccessRelationshipsAPI.md#GetBusinessMembers) | **Get** /businesses/{business_id}/members | Get business members
[**GetBusinessPartners**](BusinessAccessRelationshipsAPI.md#GetBusinessPartners) | **Get** /businesses/{business_id}/partners | Get business partners
[**UpdateBusinessMemberships**](BusinessAccessRelationshipsAPI.md#UpdateBusinessMemberships) | **Patch** /businesses/{business_id}/members | Update member&#39;s business role



## DeleteBusinessMembership

> DeletedMembersResponse DeleteBusinessMembership(ctx, businessId).MembersToDeleteBody(membersToDeleteBody).Execute()

Terminate business memberships



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
	membersToDeleteBody := *openapiclient.NewMembersToDeleteBody([]openapiclient.MembersToDeleteBodyMembersInner{*openapiclient.NewMembersToDeleteBodyMembersInner("140943737684417", openapiclient.BusinessRoleForMembers("EMPLOYEE"))}) // MembersToDeleteBody | List of members with role to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.DeleteBusinessMembership(context.Background(), businessId).MembersToDeleteBody(membersToDeleteBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.DeleteBusinessMembership``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteBusinessMembership`: DeletedMembersResponse
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.DeleteBusinessMembership`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Business id | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteBusinessMembershipRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md) | List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteBusinessPartners

> DeletePartnersResponse DeleteBusinessPartners(ctx, businessId).DeletePartnersRequest(deletePartnersRequest).Execute()

Terminate business partnerships



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
	deletePartnersRequest := *openapiclient.NewDeletePartnersRequest([]string{"1234567890123"}) // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.DeleteBusinessPartners(context.Background(), businessId).DeletePartnersRequest(deletePartnersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.DeleteBusinessPartners``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteBusinessPartners`: DeletePartnersResponse
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.DeleteBusinessPartners`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteBusinessPartnersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md) | An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBusinessEmployers

> GetBusinessEmployers200Response GetBusinessEmployers(ctx).PageSize(pageSize).Bookmark(bookmark).Execute()

List business employers for user



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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.GetBusinessEmployers(context.Background()).PageSize(pageSize).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.GetBusinessEmployers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessEmployers`: GetBusinessEmployers200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.GetBusinessEmployers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBusinessEmployersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBusinessMembers

> GetBusinessMembers200Response GetBusinessMembers(ctx, businessId).AssetsSummary(assetsSummary).BusinessRoles(businessRoles).MemberIds(memberIds).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()

Get business members



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
	assetsSummary := true // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
	businessRoles := []openapiclient.MemberBusinessRole{openapiclient.MemberBusinessRole("EMPLOYEE")} // []MemberBusinessRole | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
	memberIds := "00101010101,2222220101" // string | A list of business members ids separated by comma. (optional)
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.GetBusinessMembers(context.Background(), businessId).AssetsSummary(assetsSummary).BusinessRoles(businessRoles).MemberIds(memberIds).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.GetBusinessMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessMembers`: GetBusinessMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.GetBusinessMembers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBusinessMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetsSummary** | **bool** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **businessRoles** | [**[]MemberBusinessRole**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | 
 **memberIds** | **string** | A list of business members ids separated by comma. | 
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBusinessPartners

> GetBusinessPartners200Response GetBusinessPartners(ctx, businessId).AssetsSummary(assetsSummary).PartnerType(partnerType).PartnerIds(partnerIds).StartIndex(startIndex).PageSize(pageSize).Bookmark(bookmark).Execute()

Get business partners



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
	assetsSummary := true // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
	partnerType := openapiclient.PartnerType("INTERNAL") // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
	partnerIds := "00101010101,2222220101" // string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
	startIndex := int32(0) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.GetBusinessPartners(context.Background(), businessId).AssetsSummary(assetsSummary).PartnerType(partnerType).PartnerIds(partnerIds).StartIndex(startIndex).PageSize(pageSize).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.GetBusinessPartners``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessPartners`: GetBusinessPartners200Response
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.GetBusinessPartners`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBusinessPartnersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **assetsSummary** | **bool** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **partnerType** | [**PartnerType**](PartnerType.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | 
 **partnerIds** | **string** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | 
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateBusinessMemberships

> UpdateMemberResultsResponseArray UpdateBusinessMemberships(ctx, businessId).UpdateMemberBusinessRoleBody(updateMemberBusinessRoleBody).Execute()

Update member's business role



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
	updateMemberBusinessRoleBody := []openapiclient.UpdateMemberBusinessRoleBody{*openapiclient.NewUpdateMemberBusinessRoleBody(openapiclient.BusinessRoleForMembers("EMPLOYEE"), "140943737684417")} // []UpdateMemberBusinessRoleBody | List of objects with the member id and the business_role.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.UpdateBusinessMemberships(context.Background(), businessId).UpdateMemberBusinessRoleBody(updateMemberBusinessRoleBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.UpdateBusinessMemberships``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateBusinessMemberships`: UpdateMemberResultsResponseArray
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.UpdateBusinessMemberships`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Business id | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateBusinessMembershipsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateMemberBusinessRoleBody** | [**[]UpdateMemberBusinessRoleBody**](UpdateMemberBusinessRoleBody.md) | List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

