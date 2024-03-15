# \TermsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsRelatedList**](TermsAPI.md#TermsRelatedList) | **Get** /terms/related | List related terms
[**TermsSuggestedList**](TermsAPI.md#TermsSuggestedList) | **Get** /terms/suggested | List suggested terms



## TermsRelatedList

> RelatedTerms TermsRelatedList(ctx).Terms(terms).Execute()

List related terms



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
	terms := []string{"workout"} // []string | List of input terms.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TermsAPI.TermsRelatedList(context.Background()).Terms(terms).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TermsAPI.TermsRelatedList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TermsRelatedList`: RelatedTerms
	fmt.Fprintf(os.Stdout, "Response from `TermsAPI.TermsRelatedList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTermsRelatedListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | **[]string** | List of input terms. | 

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TermsSuggestedList

> []string TermsSuggestedList(ctx).Term(term).Limit(limit).Execute()

List suggested terms



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
	term := "sports" // string | Input term.
	limit := int32(4) // int32 | Max suggested terms to return. (optional) (default to 4)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TermsAPI.TermsSuggestedList(context.Background()).Term(term).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TermsAPI.TermsSuggestedList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TermsSuggestedList`: []string
	fmt.Fprintf(os.Stdout, "Response from `TermsAPI.TermsSuggestedList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTermsSuggestedListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string** | Input term. | 
 **limit** | **int32** | Max suggested terms to return. | [default to 4]

### Return type

**[]string**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

