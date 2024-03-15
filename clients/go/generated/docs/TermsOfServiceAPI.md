# \TermsOfServiceAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsOfServiceGet**](TermsOfServiceAPI.md#TermsOfServiceGet) | **Get** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service



## TermsOfServiceGet

> TermsOfService TermsOfServiceGet(ctx, adAccountId).IncludeHtml(includeHtml).TosType(tosType).Execute()

Get terms of service



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
	includeHtml := true // bool | Return HTML in TOS text. (optional) (default to false)
	tosType := "tosType_example" // string | Request type. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TermsOfServiceAPI.TermsOfServiceGet(context.Background(), adAccountId).IncludeHtml(includeHtml).TosType(tosType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TermsOfServiceAPI.TermsOfServiceGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TermsOfServiceGet`: TermsOfService
	fmt.Fprintf(os.Stdout, "Response from `TermsOfServiceAPI.TermsOfServiceGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTermsOfServiceGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeHtml** | **bool** | Return HTML in TOS text. | [default to false]
 **tosType** | **string** | Request type. | 

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

