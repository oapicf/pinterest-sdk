# \LeadFormsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormGet**](LeadFormsAPI.md#LeadFormGet) | **Get** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormTestCreate**](LeadFormsAPI.md#LeadFormTestCreate) | **Post** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsCreate**](LeadFormsAPI.md#LeadFormsCreate) | **Post** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**LeadFormsList**](LeadFormsAPI.md#LeadFormsList) | **Get** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**LeadFormsUpdate**](LeadFormsAPI.md#LeadFormsUpdate) | **Patch** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms



## LeadFormGet

> LeadForm LeadFormGet(ctx, leadFormId, adAccountId).Execute()

Get lead form by id



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
	leadFormId := "leadFormId_example" // string | The ID of this lead form
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormGet(context.Background(), leadFormId, adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormGet`: LeadForm
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**leadFormId** | **string** | The ID of this lead form | 
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**LeadForm**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormTestCreate

> LeadFormTest LeadFormTestCreate(ctx, adAccountId, leadFormId).LeadFormTestCreate(leadFormTestCreate).Execute()

Create lead form test data



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
	adAccountId := "adAccountId_example" // string | 
	leadFormId := "leadFormId_example" // string | Unique identifier of a lead form.
	leadFormTestCreate := *openapiclient.NewLeadFormTestCreate([]string{"Answers_example"}) // LeadFormTestCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormTestCreate(context.Background(), adAccountId, leadFormId).LeadFormTestCreate(leadFormTestCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormTestCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormTestCreate`: LeadFormTest
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormTestCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 
**leadFormId** | **string** | Unique identifier of a lead form. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormTestCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **leadFormTestCreate** | [**LeadFormTestCreate**](LeadFormTestCreate.md) |  | 

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormsCreate

> LeadFormsCreate200Response LeadFormsCreate(ctx, adAccountId).LeadFormCreate(leadFormCreate).Execute()

Create lead forms



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
	leadFormCreate := []openapiclient.LeadFormCreate{*openapiclient.NewLeadFormCreate("Thank you for submitting. We will contact you soon.", false, "Lead Form 3/14/2023", "https://www.advertisername.com/privacy-policy", []openapiclient.LeadFormQuestion{*openapiclient.NewLeadFormQuestion()})} // []LeadFormCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormsCreate(context.Background(), adAccountId).LeadFormCreate(leadFormCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormsCreate`: LeadFormsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **leadFormCreate** | [**[]LeadFormCreate**](LeadFormCreate.md) |  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormsList

> LeadFormsList200Response LeadFormsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()

List lead forms



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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormsList`: LeadFormsList200Response
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormsUpdate

> LeadFormsCreate200Response LeadFormsUpdate(ctx, adAccountId).LeadFormBatchUpdate(leadFormBatchUpdate).Execute()

Update lead forms



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
	leadFormBatchUpdate := []openapiclient.LeadFormBatchUpdate{*openapiclient.NewLeadFormBatchUpdate("Id_example")} // []LeadFormBatchUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormsUpdate(context.Background(), adAccountId).LeadFormBatchUpdate(leadFormBatchUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormsUpdate`: LeadFormsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **leadFormBatchUpdate** | [**[]LeadFormBatchUpdate**](LeadFormBatchUpdate.md) |  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

