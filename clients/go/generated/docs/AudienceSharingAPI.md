# \AudienceSharingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsAudiencesSharedAccountsList**](AudienceSharingAPI.md#AdAccountsAudiencesSharedAccountsList) | **Get** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**BusinessAccountAudiencesSharedAccountsList**](AudienceSharingAPI.md#BusinessAccountAudiencesSharedAccountsList) | **Get** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**SharedAudiencesForBusinessList**](AudienceSharingAPI.md#SharedAudiencesForBusinessList) | **Get** /businesses/{business_id}/audiences | List received audiences for a business
[**UpdateAdAccountToAdAccountSharedAudience**](AudienceSharingAPI.md#UpdateAdAccountToAdAccountSharedAudience) | **Patch** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**UpdateAdAccountToBusinessSharedAudience**](AudienceSharingAPI.md#UpdateAdAccountToBusinessSharedAudience) | **Patch** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**UpdateBusinessToAdAccountSharedAudience**](AudienceSharingAPI.md#UpdateBusinessToAdAccountSharedAudience) | **Patch** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**UpdateBusinessToBusinessSharedAudience**](AudienceSharingAPI.md#UpdateBusinessToBusinessSharedAudience) | **Patch** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses



## AdAccountsAudiencesSharedAccountsList

> AdAccountsAudiencesSharedAccountsList200Response AdAccountsAudiencesSharedAccountsList(ctx, adAccountId).AudienceId(audienceId).AccountType(accountType).PageSize(pageSize).Bookmark(bookmark).Execute()

List accounts with access to an audience owned by an ad account



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	audienceId := "audienceId_example" // string | Unique identifier of the audience to use to filter the results.
	accountType := openapiclient.AudienceAccountType("AD_ACCOUNT") // AudienceAccountType | Filter accounts by account type. (default to "AD_ACCOUNT")
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.AdAccountsAudiencesSharedAccountsList(context.Background(), adAccountId).AudienceId(audienceId).AccountType(accountType).PageSize(pageSize).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.AdAccountsAudiencesSharedAccountsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdAccountsAudiencesSharedAccountsList`: AdAccountsAudiencesSharedAccountsList200Response
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.AdAccountsAudiencesSharedAccountsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsAudiencesSharedAccountsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **audienceId** | **string** | Unique identifier of the audience to use to filter the results. | 
 **accountType** | [**AudienceAccountType**](AudienceAccountType.md) | Filter accounts by account type. | [default to &quot;AD_ACCOUNT&quot;]
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessAccountAudiencesSharedAccountsList

> AdAccountsAudiencesSharedAccountsList200Response BusinessAccountAudiencesSharedAccountsList(ctx, businessId).AudienceId(audienceId).AccountType(accountType).PageSize(pageSize).Bookmark(bookmark).Execute()

List accounts with access to an audience owned by a business



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
	audienceId := "audienceId_example" // string | Unique identifier of the audience to use to filter the results.
	accountType := openapiclient.AudienceAccountType("AD_ACCOUNT") // AudienceAccountType | Filter accounts by account type. (default to "AD_ACCOUNT")
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.BusinessAccountAudiencesSharedAccountsList(context.Background(), businessId).AudienceId(audienceId).AccountType(accountType).PageSize(pageSize).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.BusinessAccountAudiencesSharedAccountsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BusinessAccountAudiencesSharedAccountsList`: AdAccountsAudiencesSharedAccountsList200Response
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.BusinessAccountAudiencesSharedAccountsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBusinessAccountAudiencesSharedAccountsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **audienceId** | **string** | Unique identifier of the audience to use to filter the results. | 
 **accountType** | [**AudienceAccountType**](AudienceAccountType.md) | Filter accounts by account type. | [default to &quot;AD_ACCOUNT&quot;]
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SharedAudiencesForBusinessList

> AudiencesList200Response SharedAudiencesForBusinessList(ctx, businessId).Bookmark(bookmark).Order(order).PageSize(pageSize).Execute()

List received audiences for a business



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.SharedAudiencesForBusinessList(context.Background(), businessId).Bookmark(bookmark).Order(order).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.SharedAudiencesForBusinessList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SharedAudiencesForBusinessList`: AudiencesList200Response
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.SharedAudiencesForBusinessList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSharedAudiencesForBusinessListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateAdAccountToAdAccountSharedAudience

> SharedAudienceResponse UpdateAdAccountToAdAccountSharedAudience(ctx, adAccountId).SharedAudience(sharedAudience).Execute()

Update audience sharing between ad accounts



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	sharedAudience := *openapiclient.NewSharedAudience("2542621871096", openapiclient.OperationType("SHARE"), []string{"RecipientAccountIds_example"}) // SharedAudience | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.UpdateAdAccountToAdAccountSharedAudience(context.Background(), adAccountId).SharedAudience(sharedAudience).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.UpdateAdAccountToAdAccountSharedAudience``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateAdAccountToAdAccountSharedAudience`: SharedAudienceResponse
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.UpdateAdAccountToAdAccountSharedAudience`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateAdAccountToAdAccountSharedAudienceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **sharedAudience** | [**SharedAudience**](SharedAudience.md) |  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateAdAccountToBusinessSharedAudience

> BusinessSharedAudienceResponse UpdateAdAccountToBusinessSharedAudience(ctx, adAccountId).BusinessSharedAudience(businessSharedAudience).Execute()

Update audience sharing from an ad account to businesses



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	businessSharedAudience := *openapiclient.NewBusinessSharedAudience("2542621871096", openapiclient.OperationType("SHARE"), []string{"RecipientBusinessIds_example"}) // BusinessSharedAudience | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.UpdateAdAccountToBusinessSharedAudience(context.Background(), adAccountId).BusinessSharedAudience(businessSharedAudience).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.UpdateAdAccountToBusinessSharedAudience``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateAdAccountToBusinessSharedAudience`: BusinessSharedAudienceResponse
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.UpdateAdAccountToBusinessSharedAudience`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateAdAccountToBusinessSharedAudienceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateBusinessToAdAccountSharedAudience

> SharedAudienceResponse UpdateBusinessToAdAccountSharedAudience(ctx, businessId).SharedAudience(sharedAudience).Execute()

Update audience sharing from a business to ad accounts



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
	sharedAudience := *openapiclient.NewSharedAudience("2542621871096", openapiclient.OperationType("SHARE"), []string{"RecipientAccountIds_example"}) // SharedAudience | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.UpdateBusinessToAdAccountSharedAudience(context.Background(), businessId).SharedAudience(sharedAudience).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.UpdateBusinessToAdAccountSharedAudience``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateBusinessToAdAccountSharedAudience`: SharedAudienceResponse
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.UpdateBusinessToAdAccountSharedAudience`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateBusinessToAdAccountSharedAudienceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **sharedAudience** | [**SharedAudience**](SharedAudience.md) |  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateBusinessToBusinessSharedAudience

> BusinessSharedAudienceResponse UpdateBusinessToBusinessSharedAudience(ctx, businessId).BusinessSharedAudience(businessSharedAudience).Execute()

Update audience sharing between businesses



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
	businessSharedAudience := *openapiclient.NewBusinessSharedAudience("2542621871096", openapiclient.OperationType("SHARE"), []string{"RecipientBusinessIds_example"}) // BusinessSharedAudience | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudienceSharingAPI.UpdateBusinessToBusinessSharedAudience(context.Background(), businessId).BusinessSharedAudience(businessSharedAudience).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudienceSharingAPI.UpdateBusinessToBusinessSharedAudience``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateBusinessToBusinessSharedAudience`: BusinessSharedAudienceResponse
	fmt.Fprintf(os.Stdout, "Response from `AudienceSharingAPI.UpdateBusinessToBusinessSharedAudience`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **string** | Unique identifier of the requesting business. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateBusinessToBusinessSharedAudienceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

