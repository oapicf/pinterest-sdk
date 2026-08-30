# \BusinessAccessRelationshipsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BrandAccountsCreate**](BusinessAccessRelationshipsAPI.md#BrandAccountsCreate) | **Post** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**BrandAccountsUpdate**](BusinessAccessRelationshipsAPI.md#BrandAccountsUpdate) | **Patch** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**DeleteBusinessMembership**](BusinessAccessRelationshipsAPI.md#DeleteBusinessMembership) | **Delete** /businesses/{business_id}/members | Terminate business memberships
[**DeleteBusinessPartners**](BusinessAccessRelationshipsAPI.md#DeleteBusinessPartners) | **Delete** /businesses/{business_id}/partners | Terminate business partnerships
[**GetBusinessEmployers**](BusinessAccessRelationshipsAPI.md#GetBusinessEmployers) | **Get** /businesses/employers | List business employers for user
[**GetBusinessMembers**](BusinessAccessRelationshipsAPI.md#GetBusinessMembers) | **Get** /businesses/{business_id}/members | Get business members
[**GetBusinessPartners**](BusinessAccessRelationshipsAPI.md#GetBusinessPartners) | **Get** /businesses/{business_id}/partners | Get business partners
[**SystemUserUpdate**](BusinessAccessRelationshipsAPI.md#SystemUserUpdate) | **Patch** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**UpdateBusinessMemberships**](BusinessAccessRelationshipsAPI.md#UpdateBusinessMemberships) | **Patch** /businesses/{business_id}/members | Update member&#39;s business role



## BrandAccountsCreate

> BrandAccount BrandAccountsCreate(ctx, businessHierarchyId).BrandAccountCreate(brandAccountCreate).Execute()

Create a Brand Account



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
	businessHierarchyId := "businessHierarchyId_example" // string | business hierarchy node id
	brandAccountCreate := *openapiclient.NewBrandAccountCreate(openapiclient.Country("AD"), "Name_example", "Username_example") // BrandAccountCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.BrandAccountsCreate(context.Background(), businessHierarchyId).BrandAccountCreate(brandAccountCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.BrandAccountsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BrandAccountsCreate`: BrandAccount
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.BrandAccountsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessHierarchyId** | **string** | business hierarchy node id | 

### Other Parameters

Other parameters are passed through a pointer to a apiBrandAccountsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **brandAccountCreate** | [**BrandAccountCreate**](BrandAccountCreate.md) |  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BrandAccountsUpdate

> BrandAccount BrandAccountsUpdate(ctx, brandAccountId, businessHierarchyId).BrandAccountUpdate(brandAccountUpdate).Execute()

Update a Brand Account



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
	brandAccountId := "brandAccountId_example" // string | 
	businessHierarchyId := "businessHierarchyId_example" // string | business hierarchy node id
	brandAccountUpdate := *openapiclient.NewBrandAccountUpdate() // BrandAccountUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.BrandAccountsUpdate(context.Background(), brandAccountId, businessHierarchyId).BrandAccountUpdate(brandAccountUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.BrandAccountsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BrandAccountsUpdate`: BrandAccount
	fmt.Fprintf(os.Stdout, "Response from `BusinessAccessRelationshipsAPI.BrandAccountsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**brandAccountId** | **string** |  | 
**businessHierarchyId** | **string** | business hierarchy node id | 

### Other Parameters

Other parameters are passed through a pointer to a apiBrandAccountsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **brandAccountUpdate** | [**BrandAccountUpdate**](BrandAccountUpdate.md) |  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteBusinessMembership

> DeleteBusinessMembership200Response DeleteBusinessMembership(ctx, businessId).DeleteBusinessMembershipBody(deleteBusinessMembershipBody).Execute()

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
	businessId := "businessId_example" // string | Business id
	deleteBusinessMembershipBody := *openapiclient.NewDeleteBusinessMembershipBody([]openapiclient.DeleteBusinessMembershipMember{*openapiclient.NewDeleteBusinessMembershipMember(openapiclient.BusinessRoleForMembers("EMPLOYEE"), "140943737684417")}) // DeleteBusinessMembershipBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.DeleteBusinessMembership(context.Background(), businessId).DeleteBusinessMembershipBody(deleteBusinessMembershipBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.DeleteBusinessMembership``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteBusinessMembership`: DeleteBusinessMembership200Response
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

 **deleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md) |  | 

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteBusinessPartners

> DeleteBusinessPartners DeleteBusinessPartners(ctx, businessId).DeleteBusinessPartnersDelete(deleteBusinessPartnersDelete).Execute()

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	deleteBusinessPartnersDelete := *openapiclient.NewDeleteBusinessPartnersDelete([]string{"PartnerIds_example"}) // DeleteBusinessPartnersDelete | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.DeleteBusinessPartners(context.Background(), businessId).DeleteBusinessPartnersDelete(deleteBusinessPartnersDelete).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.DeleteBusinessPartners``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteBusinessPartners`: DeleteBusinessPartners
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

 **deleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md) |  | 

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBusinessEmployers

> GetBusinessEmployers200Response GetBusinessEmployers(ctx).AssetsSummary(assetsSummary).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	assetsSummary := true // bool | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to true)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.GetBusinessEmployers(context.Background()).AssetsSummary(assetsSummary).Bookmark(bookmark).PageSize(pageSize).Execute()
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
 **assetsSummary** | **bool** | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to true]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

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

> GetBusinessEmployers200Response GetBusinessMembers(ctx, businessId).FetchSystemUsers(fetchSystemUsers).AssetsSummary(assetsSummary).BusinessRoles(businessRoles).MemberIds(memberIds).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	fetchSystemUsers := true // bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to false)
	assetsSummary := true // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
	businessRoles := []openapiclient.MemberBusinessRole{openapiclient.MemberBusinessRole("EMPLOYEE")} // []MemberBusinessRole | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
	memberIds := "memberIds_example" // string | A list of business members ids separated by comma. (optional)
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.GetBusinessMembers(context.Background(), businessId).FetchSystemUsers(fetchSystemUsers).AssetsSummary(assetsSummary).BusinessRoles(businessRoles).MemberIds(memberIds).StartIndex(startIndex).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.GetBusinessMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessMembers`: GetBusinessEmployers200Response
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

 **fetchSystemUsers** | **bool** | Fetches system users if True. Fetches regular user employees if False. | [default to false]
 **assetsSummary** | **bool** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [default to false]
 **businessRoles** | [**[]MemberBusinessRole**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | 
 **memberIds** | **string** | A list of business members ids separated by comma. | 
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

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


## GetBusinessPartners

> GetBusinessEmployers200Response GetBusinessPartners(ctx, businessId).AssetsSummary(assetsSummary).PartnerType(partnerType).PartnerIds(partnerIds).StartIndex(startIndex).SortAscending(sortAscending).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	businessId := "businessId_example" // string | Unique identifier of the requesting business.
	assetsSummary := true // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
	partnerType := openapiclient.PartnerType("INTERNAL") // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
	partnerIds := "partnerIds_example" // string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
	startIndex := int32(56) // int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
	sortAscending := true // bool | Sort ascending. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.GetBusinessPartners(context.Background(), businessId).AssetsSummary(assetsSummary).PartnerType(partnerType).PartnerIds(partnerIds).StartIndex(startIndex).SortAscending(sortAscending).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.GetBusinessPartners``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessPartners`: GetBusinessEmployers200Response
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
 **partnerType** | [**PartnerType**](PartnerType.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | 
 **partnerIds** | **string** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | 
 **startIndex** | **int32** | An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **sortAscending** | **bool** | Sort ascending. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

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


## SystemUserUpdate

> SystemUserUpdate(ctx, businessId, systemUserId).SystemUserUpdateWithRequiredBody(systemUserUpdateWithRequiredBody).Execute()

Update a system user information.



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
	systemUserId := "systemUserId_example" // string | Unique identifier of a system user.
	systemUserUpdateWithRequiredBody := *openapiclient.NewSystemUserUpdateWithRequiredBody("Name_example") // SystemUserUpdateWithRequiredBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.BusinessAccessRelationshipsAPI.SystemUserUpdate(context.Background(), businessId, systemUserId).SystemUserUpdateWithRequiredBody(systemUserUpdateWithRequiredBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.SystemUserUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 
**systemUserId** | **string** | Unique identifier of a system user. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSystemUserUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **systemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md) |  | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateBusinessMemberships

> UpdateBusinessMembershipsResponse UpdateBusinessMemberships(ctx, businessId).BusinessMembershipMember(businessMembershipMember).Execute()

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
	businessId := "businessId_example" // string | Business id
	businessMembershipMember := []openapiclient.BusinessMembershipMember{*openapiclient.NewBusinessMembershipMember(openapiclient.BusinessRoleForMembers("EMPLOYEE"), "140943737684417")} // []BusinessMembershipMember | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BusinessAccessRelationshipsAPI.UpdateBusinessMemberships(context.Background(), businessId).BusinessMembershipMember(businessMembershipMember).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BusinessAccessRelationshipsAPI.UpdateBusinessMemberships``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateBusinessMemberships`: UpdateBusinessMembershipsResponse
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

 **businessMembershipMember** | [**[]BusinessMembershipMember**](BusinessMembershipMember.md) |  | 

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

