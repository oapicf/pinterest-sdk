# \LeadFormsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormGet**](LeadFormsAPI.md#LeadFormGet) | **Get** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormTestCreate**](LeadFormsAPI.md#LeadFormTestCreate) | **Post** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsList**](LeadFormsAPI.md#LeadFormsList) | **Get** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms



## LeadFormGet

> LeadFormResponse LeadFormGet(ctx, adAccountId, leadFormId).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	leadFormId := "1234567890123" // string | Unique identifier of a lead form.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormGet(context.Background(), adAccountId, leadFormId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormGet`: LeadFormResponse
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**leadFormId** | **string** | Unique identifier of a lead form. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormTestCreate

> LeadFormTestResponse LeadFormTestCreate(ctx, adAccountId, leadFormId).LeadFormTestRequest(leadFormTestRequest).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	leadFormId := "1234567890123" // string | Unique identifier of a lead form.
	leadFormTestRequest := *openapiclient.NewLeadFormTestRequest([]string{"Answers_example"}) // LeadFormTestRequest | Subscription to create.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormTestCreate(context.Background(), adAccountId, leadFormId).LeadFormTestRequest(leadFormTestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadFormsAPI.LeadFormTestCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadFormTestCreate`: LeadFormTestResponse
	fmt.Fprintf(os.Stdout, "Response from `LeadFormsAPI.LeadFormTestCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**leadFormId** | **string** | Unique identifier of a lead form. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadFormTestCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md) | Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadFormsList

> LeadFormsList200Response LeadFormsList(ctx, adAccountId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()

Get lead forms



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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadFormsAPI.LeadFormsList(context.Background(), adAccountId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()
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

 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

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

