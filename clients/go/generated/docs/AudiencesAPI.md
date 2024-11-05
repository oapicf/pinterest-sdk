# \AudiencesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesCreate**](AudiencesAPI.md#AudiencesCreate) | **Post** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesCreateCustom**](AudiencesAPI.md#AudiencesCreateCustom) | **Post** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**AudiencesGet**](AudiencesAPI.md#AudiencesGet) | **Get** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesList**](AudiencesAPI.md#AudiencesList) | **Get** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesUpdate**](AudiencesAPI.md#AudiencesUpdate) | **Patch** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience



## AudiencesCreate

> Audience AudiencesCreate(ctx, adAccountId).AudienceCreateRequest(audienceCreateRequest).Execute()

Create audience



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
	audienceCreateRequest := *openapiclient.NewAudienceCreateRequest("string", *openapiclient.NewAudienceRule(), *openapiclient.NewAudienceCreateRequest1AudienceType()) // AudienceCreateRequest | List of ads to create, size limit [1, 30]

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesCreate(context.Background(), adAccountId).AudienceCreateRequest(audienceCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesCreate`: Audience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **audienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md) | List of ads to create, size limit [1, 30] | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudiencesCreateCustom

> Audience AudiencesCreateCustom(ctx, adAccountId).AudienceCreateCustomRequest(audienceCreateCustomRequest).Execute()

Create custom audience



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
	audienceCreateCustomRequest := *openapiclient.NewAudienceCreateCustomRequest("string", *openapiclient.NewAudienceRule(), openapiclient.AudienceSharingType("CUSTOM"), openapiclient.AudienceDataParty("1p")) // AudienceCreateCustomRequest | Custom audience to create.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesCreateCustom(context.Background(), adAccountId).AudienceCreateCustomRequest(audienceCreateCustomRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesCreateCustom``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesCreateCustom`: Audience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesCreateCustom`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesCreateCustomRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md) | Custom audience to create. | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudiencesGet

> Audience AudiencesGet(ctx, adAccountId, audienceId).Execute()

Get audience



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
	audienceId := "audienceId_example" // string | Unique identifier of an audience

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesGet(context.Background(), adAccountId, audienceId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesGet`: Audience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**audienceId** | **string** | Unique identifier of an audience | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AudiencesList

> AudiencesList200Response AudiencesList(ctx, adAccountId).Bookmark(bookmark).Order(order).PageSize(pageSize).OwnershipType(ownershipType).Execute()

List audiences



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	ownershipType := "OWNED" // string | Filter audiences by ownership type. (optional) (default to "OWNED")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesList(context.Background(), adAccountId).Bookmark(bookmark).Order(order).PageSize(pageSize).OwnershipType(ownershipType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesList`: AudiencesList200Response
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **ownershipType** | **string** | Filter audiences by ownership type. | [default to &quot;OWNED&quot;]

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


## AudiencesUpdate

> Audience AudiencesUpdate(ctx, adAccountId, audienceId).AudienceUpdateRequest(audienceUpdateRequest).Execute()

Update audience



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
	audienceId := "audienceId_example" // string | Unique identifier of an audience
	audienceUpdateRequest := *openapiclient.NewAudienceUpdateRequest() // AudienceUpdateRequest | The audience to be updated. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AudiencesAPI.AudiencesUpdate(context.Background(), adAccountId, audienceId).AudienceUpdateRequest(audienceUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AudiencesAPI.AudiencesUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AudiencesUpdate`: Audience
	fmt.Fprintf(os.Stdout, "Response from `AudiencesAPI.AudiencesUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**audienceId** | **string** | Unique identifier of an audience | 

### Other Parameters

Other parameters are passed through a pointer to a apiAudiencesUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **audienceUpdateRequest** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md) | The audience to be updated. | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

