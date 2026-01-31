# \LabelsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsCreate**](LabelsAPI.md#LabelsCreate) | **Post** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsList**](LabelsAPI.md#LabelsList) | **Get** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsUpdate**](LabelsAPI.md#LabelsUpdate) | **Patch** /ad_accounts/{ad_account_id}/labels | Update labels



## LabelsCreate

> LabelsResponse LabelsCreate(ctx, adAccountId).LabelCreateRequest(labelCreateRequest).Execute()

Create labels



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
	labelCreateRequest := *openapiclient.NewLabelCreateRequest([]openapiclient.LabelCreateRequestLabelsInner{*openapiclient.NewLabelCreateRequestLabelsInner("TODO", "Value_example")}, "626753052072") // LabelCreateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LabelsAPI.LabelsCreate(context.Background(), adAccountId).LabelCreateRequest(labelCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LabelsAPI.LabelsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LabelsCreate`: LabelsResponse
	fmt.Fprintf(os.Stdout, "Response from `LabelsAPI.LabelsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLabelsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md) |  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LabelsList

> LabelsList200Response LabelsList(ctx, adAccountId).CampaignIds(campaignIds).LabelIds(labelIds).EntityStatuses(entityStatuses).LabelTypes(labelTypes).PageSize(pageSize).Bookmark(bookmark).Execute()

List labels



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
	campaignIds := []string{"Inner_example"} // []string | List of Campaign Ids to use to filter the results. (optional)
	labelIds := []string{"Inner_example"} // []string | List of Label Ids to use to filter the results. (optional)
	entityStatuses := []string{"ACTIVE"} // []string | Label entity status (optional) (default to {"ACTIVE"})
	labelTypes := []string{"BRAND"} // []string | Label type. (optional) (default to {"BRAND", "CUSTOM"})
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LabelsAPI.LabelsList(context.Background(), adAccountId).CampaignIds(campaignIds).LabelIds(labelIds).EntityStatuses(entityStatuses).LabelTypes(labelTypes).PageSize(pageSize).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LabelsAPI.LabelsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LabelsList`: LabelsList200Response
	fmt.Fprintf(os.Stdout, "Response from `LabelsAPI.LabelsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLabelsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignIds** | **[]string** | List of Campaign Ids to use to filter the results. | 
 **labelIds** | **[]string** | List of Label Ids to use to filter the results. | 
 **entityStatuses** | **[]string** | Label entity status | [default to {&quot;ACTIVE&quot;}]
 **labelTypes** | **[]string** | Label type. | [default to {&quot;BRAND&quot;, &quot;CUSTOM&quot;}]
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LabelsUpdate

> LabelsResponse LabelsUpdate(ctx, adAccountId).LabelUpdateRequest(labelUpdateRequest).Execute()

Update labels



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
	labelUpdateRequest := *openapiclient.NewLabelUpdateRequest([]openapiclient.LabelUpdateRequestLabelsInner{*openapiclient.NewLabelUpdateRequestLabelsInner("1106385754497")}) // LabelUpdateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LabelsAPI.LabelsUpdate(context.Background(), adAccountId).LabelUpdateRequest(labelUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LabelsAPI.LabelsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LabelsUpdate`: LabelsResponse
	fmt.Fprintf(os.Stdout, "Response from `LabelsAPI.LabelsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLabelsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md) |  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

