# \CatalogProductGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsProductGroupPinsList**](CatalogProductGroupsAPI.md#CatalogsProductGroupPinsList) | **Get** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**CatalogsProductGroupsCreate**](CatalogProductGroupsAPI.md#CatalogsProductGroupsCreate) | **Post** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsCreateMany**](CatalogProductGroupsAPI.md#CatalogsProductGroupsCreateMany) | **Post** /catalogs/product_groups/multiple | Create product groups
[**CatalogsProductGroupsDelete**](CatalogProductGroupsAPI.md#CatalogsProductGroupsDelete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsDeleteMany**](CatalogProductGroupsAPI.md#CatalogsProductGroupsDeleteMany) | **Delete** /catalogs/product_groups/multiple | Delete product groups
[**CatalogsProductGroupsGet**](CatalogProductGroupsAPI.md#CatalogsProductGroupsGet) | **Get** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsProductGroupsList**](CatalogProductGroupsAPI.md#CatalogsProductGroupsList) | **Get** /catalogs/product_groups | List product groups
[**CatalogsProductGroupsProductCountsGet**](CatalogProductGroupsAPI.md#CatalogsProductGroupsProductCountsGet) | **Get** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**CatalogsProductGroupsUpdate**](CatalogProductGroupsAPI.md#CatalogsProductGroupsUpdate) | **Patch** /catalogs/product_groups/{product_group_id} | Update single product group
[**ProductsByProductGroupFilterList**](CatalogProductGroupsAPI.md#ProductsByProductGroupFilterList) | **Post** /catalogs/products/get_by_product_group_filters | List products by filter



## CatalogsProductGroupPinsList

> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList(ctx, productGroupId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()

List products by product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupPinsList(context.Background(), productGroupId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupPinsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupPinsList`: CatalogsProductGroupPinsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupPinsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupPinsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsCreate

> CatalogsVerticalProductGroup CatalogsProductGroupsCreate(ctx).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()

Create product group



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
	multipleProductGroupsInner := openapiclient.multiple_product_groups_inner{CatalogsProductGroupCreateRequest: openapiclient.NewCatalogsProductGroupCreateRequest("2680059592705", *openapiclient.NewCatalogsProductGroupFiltersRequest([]openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}, []openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}), "Name_example")} // MultipleProductGroupsInner | Request object used to create a single catalogs product groups.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsCreate(context.Background()).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsCreate`: CatalogsVerticalProductGroup
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | [**MultipleProductGroupsInner**](MultipleProductGroupsInner.md) | Request object used to create a single catalogs product groups. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsCreateMany

> []string CatalogsProductGroupsCreateMany(ctx).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()

Create product groups



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
	multipleProductGroupsInner := []openapiclient.MultipleProductGroupsInner{openapiclient.multiple_product_groups_inner{CatalogsProductGroupCreateRequest: openapiclient.NewCatalogsProductGroupCreateRequest("2680059592705", *openapiclient.NewCatalogsProductGroupFiltersRequest([]openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}, []openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}), "Name_example")}} // []MultipleProductGroupsInner | Request object used to create one or more catalogs product groups.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsCreateMany(context.Background()).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsCreateMany``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsCreateMany`: []string
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupsCreateMany`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsCreateManyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | [**[]MultipleProductGroupsInner**](MultipleProductGroupsInner.md) | Request object used to create one or more catalogs product groups. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

**[]string**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsDelete

> CatalogsProductGroupsDelete(ctx, productGroupId).AdAccountId(adAccountId).Execute()

Delete product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsDelete(context.Background(), productGroupId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsDeleteMany

> CatalogsProductGroupsDeleteMany(ctx).Id(id).AdAccountId(adAccountId).Execute()

Delete product groups



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
	id := []int32{int32(123)} // []int32 | Comma-separated list of product group ids
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsDeleteMany(context.Background()).Id(id).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsDeleteMany``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsDeleteManyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **[]int32** | Comma-separated list of product group ids | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsGet

> CatalogsVerticalProductGroup CatalogsProductGroupsGet(ctx, productGroupId).AdAccountId(adAccountId).Execute()

Get product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsGet(context.Background(), productGroupId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsGet`: CatalogsVerticalProductGroup
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsList

> CatalogsProductGroupsList200Response CatalogsProductGroupsList(ctx).Id(id).FeedId(feedId).CatalogId(catalogId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()

List product groups



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
	id := []int32{int32(123)} // []int32 | Comma-separated list of product group ids (optional)
	feedId := "feedId_example" // string | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
	catalogId := "catalogId_example" // string | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsList(context.Background()).Id(id).FeedId(feedId).CatalogId(catalogId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsList`: CatalogsProductGroupsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **[]int32** | Comma-separated list of product group ids | 
 **feedId** | **string** | Filter entities for a given feed_id. If not given, all feeds are considered. | 
 **catalogId** | **string** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsProductCountsGet

> CatalogsProductGroupProductCountsVertical CatalogsProductGroupsProductCountsGet(ctx, productGroupId).AdAccountId(adAccountId).Execute()

Get product counts



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsProductCountsGet(context.Background(), productGroupId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsProductCountsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsProductCountsGet`: CatalogsProductGroupProductCountsVertical
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupsProductCountsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsProductCountsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsUpdate

> CatalogsVerticalProductGroup CatalogsProductGroupsUpdate(ctx, productGroupId).CatalogsProductGroupsUpdateRequest(catalogsProductGroupsUpdateRequest).AdAccountId(adAccountId).Execute()

Update single product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	catalogsProductGroupsUpdateRequest := openapiclient.catalogs_product_groups_update_request{CatalogsProductGroupUpdateRequest: openapiclient.NewCatalogsProductGroupUpdateRequest()} // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.CatalogsProductGroupsUpdate(context.Background(), productGroupId).CatalogsProductGroupsUpdateRequest(catalogsProductGroupsUpdateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.CatalogsProductGroupsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsUpdate`: CatalogsVerticalProductGroup
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.CatalogsProductGroupsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductsByProductGroupFilterList

> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList(ctx).CatalogsListProductsByFilterRequest(catalogsListProductsByFilterRequest).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()

List products by filter



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
	catalogsListProductsByFilterRequest := openapiclient.CatalogsListProductsByFilterRequest{CatalogsListProductsByFeedBasedFilter: openapiclient.NewCatalogsListProductsByFeedBasedFilter("2680059592705", *openapiclient.NewCatalogsProductGroupFilters([]openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}, []openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupFilterOperatorTypeCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupUint32Criteria("Operator_example", int32(123)), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}))} // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogProductGroupsAPI.ProductsByProductGroupFilterList(context.Background()).CatalogsListProductsByFilterRequest(catalogsListProductsByFilterRequest).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogProductGroupsAPI.ProductsByProductGroupFilterList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductsByProductGroupFilterList`: CatalogsProductGroupPinsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogProductGroupsAPI.ProductsByProductGroupFilterList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiProductsByProductGroupFilterListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

