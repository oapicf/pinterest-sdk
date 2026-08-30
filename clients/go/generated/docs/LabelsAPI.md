# \LabelsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsApply**](LabelsAPI.md#LabelsApply) | **Post** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**LabelsCreate**](LabelsAPI.md#LabelsCreate) | **Post** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsList**](LabelsAPI.md#LabelsList) | **Get** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsRemove**](LabelsAPI.md#LabelsRemove) | **Post** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**LabelsUpdate**](LabelsAPI.md#LabelsUpdate) | **Patch** /ad_accounts/{ad_account_id}/labels | Update labels



## LabelsApply

> LabeledEntities LabelsApply(ctx, adAccountId, labelId).LabeledEntitiesCreate(labeledEntitiesCreate).Execute()

Apply label to entity



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
	labelId := "labelId_example" // string | Label ID.
	labeledEntitiesCreate := *openapiclient.NewLabeledEntitiesCreate([]string{"EntityIds_example"}) // LabeledEntitiesCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LabelsAPI.LabelsApply(context.Background(), adAccountId, labelId).LabeledEntitiesCreate(labeledEntitiesCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LabelsAPI.LabelsApply``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LabelsApply`: LabeledEntities
	fmt.Fprintf(os.Stdout, "Response from `LabelsAPI.LabelsApply`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 
**labelId** | **string** | Label ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLabelsApplyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	labelCreateRequest := *openapiclient.NewLabelCreateRequest([]openapiclient.LabelCreateItem{*openapiclient.NewLabelCreateItem(openapiclient.LabelType("BRAND"), "Value_example")}) // LabelCreateRequest | 

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

> LabelsList200Response LabelsList(ctx, adAccountId).CampaignIds(campaignIds).LabelIds(labelIds).EntityStatuses(entityStatuses).LabelTypes(labelTypes).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	entityStatuses := []openapiclient.QueryLabelEntityStatusesItems{openapiclient.QueryLabelEntityStatusesItems("ACTIVE")} // []QueryLabelEntityStatusesItems | Label entity status (optional) (default to {"ACTIVE"})
	labelTypes := []openapiclient.QueryLabelTypesItems{openapiclient.QueryLabelTypesItems("BRAND")} // []QueryLabelTypesItems | Label type. (optional) (default to {"BRAND", "CUSTOM"})
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LabelsAPI.LabelsList(context.Background(), adAccountId).CampaignIds(campaignIds).LabelIds(labelIds).EntityStatuses(entityStatuses).LabelTypes(labelTypes).Bookmark(bookmark).PageSize(pageSize).Execute()
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
 **entityStatuses** | [**[]QueryLabelEntityStatusesItems**](QueryLabelEntityStatusesItems.md) | Label entity status | [default to {&quot;ACTIVE&quot;}]
 **labelTypes** | [**[]QueryLabelTypesItems**](QueryLabelTypesItems.md) | Label type. | [default to {&quot;BRAND&quot;, &quot;CUSTOM&quot;}]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

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


## LabelsRemove

> LabeledEntities LabelsRemove(ctx, adAccountId, labelId).LabeledEntitiesCreate(labeledEntitiesCreate).Execute()

Remove label from entities



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
	labelId := "labelId_example" // string | Label ID.
	labeledEntitiesCreate := *openapiclient.NewLabeledEntitiesCreate([]string{"EntityIds_example"}) // LabeledEntitiesCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LabelsAPI.LabelsRemove(context.Background(), adAccountId, labelId).LabeledEntitiesCreate(labeledEntitiesCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LabelsAPI.LabelsRemove``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LabelsRemove`: LabeledEntities
	fmt.Fprintf(os.Stdout, "Response from `LabelsAPI.LabelsRemove`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 
**labelId** | **string** | Label ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLabelsRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
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
	labelUpdateRequest := *openapiclient.NewLabelUpdateRequest([]openapiclient.LabelUpdateItem{*openapiclient.NewLabelUpdateItem("1106385754497")}) // LabelUpdateRequest | 

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

