# \ConversionTagsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionTagsCreate**](ConversionTagsAPI.md#ConversionTagsCreate) | **Post** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**ConversionTagsGet**](ConversionTagsAPI.md#ConversionTagsGet) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**ConversionTagsList**](ConversionTagsAPI.md#ConversionTagsList) | **Get** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**OcpmEligibleConversionTagsGet**](ConversionTagsAPI.md#OcpmEligibleConversionTagsGet) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**PageVisitConversionTagsGet**](ConversionTagsAPI.md#PageVisitConversionTagsGet) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags



## ConversionTagsCreate

> ConversionTagResponse ConversionTagsCreate(ctx, adAccountId).ConversionTagCreate(conversionTagCreate).Execute()

Create conversion tag



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
	conversionTagCreate := *openapiclient.NewConversionTagCreate("ACME Tools Tag") // ConversionTagCreate | Conversion Tag to create

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionTagsAPI.ConversionTagsCreate(context.Background(), adAccountId).ConversionTagCreate(conversionTagCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionTagsAPI.ConversionTagsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionTagsCreate`: ConversionTagResponse
	fmt.Fprintf(os.Stdout, "Response from `ConversionTagsAPI.ConversionTagsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionTagsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **conversionTagCreate** | [**ConversionTagCreate**](ConversionTagCreate.md) | Conversion Tag to create | 

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversionTagsGet

> ConversionTagResponse ConversionTagsGet(ctx, adAccountId, conversionTagId).Execute()

Get conversion tag



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
	conversionTagId := "2617998078212" // string | Id of the conversion tag.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionTagsAPI.ConversionTagsGet(context.Background(), adAccountId, conversionTagId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionTagsAPI.ConversionTagsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionTagsGet`: ConversionTagResponse
	fmt.Fprintf(os.Stdout, "Response from `ConversionTagsAPI.ConversionTagsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**conversionTagId** | **string** | Id of the conversion tag. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionTagsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversionTagsList

> ConversionTagListResponse ConversionTagsList(ctx, adAccountId).FilterDeleted(filterDeleted).Execute()

Get conversion tags



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
	filterDeleted := true // bool | Filter out deleted tags. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionTagsAPI.ConversionTagsList(context.Background(), adAccountId).FilterDeleted(filterDeleted).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionTagsAPI.ConversionTagsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConversionTagsList`: ConversionTagListResponse
	fmt.Fprintf(os.Stdout, "Response from `ConversionTagsAPI.ConversionTagsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConversionTagsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **filterDeleted** | **bool** | Filter out deleted tags. | [default to false]

### Return type

[**ConversionTagListResponse**](ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OcpmEligibleConversionTagsGet

> map[string][]ConversionEventResponse OcpmEligibleConversionTagsGet(ctx, adAccountId).Execute()

Get Ocpm eligible conversion tags



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionTagsAPI.OcpmEligibleConversionTagsGet(context.Background(), adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionTagsAPI.OcpmEligibleConversionTagsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OcpmEligibleConversionTagsGet`: map[string][]ConversionEventResponse
	fmt.Fprintf(os.Stdout, "Response from `ConversionTagsAPI.OcpmEligibleConversionTagsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiOcpmEligibleConversionTagsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**map[string][]ConversionEventResponse**](array.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PageVisitConversionTagsGet

> PageVisitConversionTagsGet200Response PageVisitConversionTagsGet(ctx, adAccountId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()

Get page visit conversion tags



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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionTagsAPI.PageVisitConversionTagsGet(context.Background(), adAccountId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionTagsAPI.PageVisitConversionTagsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PageVisitConversionTagsGet`: PageVisitConversionTagsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `ConversionTagsAPI.PageVisitConversionTagsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPageVisitConversionTagsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**PageVisitConversionTagsGet200Response**](PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

