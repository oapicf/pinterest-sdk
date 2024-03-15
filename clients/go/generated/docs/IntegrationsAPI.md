# \IntegrationsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IntegrationsCommerceDel**](IntegrationsAPI.md#IntegrationsCommerceDel) | **Delete** /integrations/commerce/{external_business_id} | Delete commerce integration
[**IntegrationsCommerceGet**](IntegrationsAPI.md#IntegrationsCommerceGet) | **Get** /integrations/commerce/{external_business_id} | Get commerce integration
[**IntegrationsCommercePatch**](IntegrationsAPI.md#IntegrationsCommercePatch) | **Patch** /integrations/commerce/{external_business_id} | Update commerce integration
[**IntegrationsCommercePost**](IntegrationsAPI.md#IntegrationsCommercePost) | **Post** /integrations/commerce | Create commerce integration
[**IntegrationsGetById**](IntegrationsAPI.md#IntegrationsGetById) | **Get** /integrations/{id} | Get integration metadata
[**IntegrationsGetList**](IntegrationsAPI.md#IntegrationsGetList) | **Get** /integrations | Get integration metadata list
[**IntegrationsLogsPost**](IntegrationsAPI.md#IntegrationsLogsPost) | **Post** /integrations/logs | Receives batched logs from integration applications.



## IntegrationsCommerceDel

> IntegrationsCommerceDel(ctx, externalBusinessId).Execute()

Delete commerce integration



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
	externalBusinessId := "externalBusinessId_example" // string | External business ID for the integration.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.IntegrationsAPI.IntegrationsCommerceDel(context.Background(), externalBusinessId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsCommerceDel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**externalBusinessId** | **string** | External business ID for the integration. | 

### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsCommerceDelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


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


## IntegrationsCommerceGet

> IntegrationMetadata IntegrationsCommerceGet(ctx, externalBusinessId).Execute()

Get commerce integration



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
	externalBusinessId := "externalBusinessId_example" // string | External business ID for the integration.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IntegrationsAPI.IntegrationsCommerceGet(context.Background(), externalBusinessId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsCommerceGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IntegrationsCommerceGet`: IntegrationMetadata
	fmt.Fprintf(os.Stdout, "Response from `IntegrationsAPI.IntegrationsCommerceGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**externalBusinessId** | **string** | External business ID for the integration. | 

### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsCommerceGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IntegrationsCommercePatch

> IntegrationMetadata IntegrationsCommercePatch(ctx, externalBusinessId).IntegrationRequestPatch(integrationRequestPatch).Execute()

Update commerce integration



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
	externalBusinessId := "externalBusinessId_example" // string | External business ID for the integration.
	integrationRequestPatch := *openapiclient.NewIntegrationRequestPatch() // IntegrationRequestPatch | Parameters to get create/update the Integration Metadata (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IntegrationsAPI.IntegrationsCommercePatch(context.Background(), externalBusinessId).IntegrationRequestPatch(integrationRequestPatch).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsCommercePatch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IntegrationsCommercePatch`: IntegrationMetadata
	fmt.Fprintf(os.Stdout, "Response from `IntegrationsAPI.IntegrationsCommercePatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**externalBusinessId** | **string** | External business ID for the integration. | 

### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsCommercePatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **integrationRequestPatch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md) | Parameters to get create/update the Integration Metadata | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IntegrationsCommercePost

> IntegrationMetadata IntegrationsCommercePost(ctx).IntegrationRequest(integrationRequest).Execute()

Create commerce integration



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
	integrationRequest := *openapiclient.NewIntegrationRequest() // IntegrationRequest | Parameters to get create/update the Integration Metadata (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IntegrationsAPI.IntegrationsCommercePost(context.Background()).IntegrationRequest(integrationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsCommercePost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IntegrationsCommercePost`: IntegrationMetadata
	fmt.Fprintf(os.Stdout, "Response from `IntegrationsAPI.IntegrationsCommercePost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsCommercePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRequest** | [**IntegrationRequest**](IntegrationRequest.md) | Parameters to get create/update the Integration Metadata | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IntegrationsGetById

> IntegrationRecord IntegrationsGetById(ctx, id).Execute()

Get integration metadata



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
	id := "id_example" // string | Integration ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IntegrationsAPI.IntegrationsGetById(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsGetById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IntegrationsGetById`: IntegrationRecord
	fmt.Fprintf(os.Stdout, "Response from `IntegrationsAPI.IntegrationsGetById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | Integration ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsGetByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IntegrationsGetList

> IntegrationsGetList200Response IntegrationsGetList(ctx).Bookmark(bookmark).PageSize(pageSize).Execute()

Get integration metadata list



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IntegrationsAPI.IntegrationsGetList(context.Background()).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsGetList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IntegrationsGetList`: IntegrationsGetList200Response
	fmt.Fprintf(os.Stdout, "Response from `IntegrationsAPI.IntegrationsGetList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsGetListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IntegrationsLogsPost

> IntegrationLogsSuccessResponse IntegrationsLogsPost(ctx).IntegrationLogsRequest(integrationLogsRequest).Execute()

Receives batched logs from integration applications.



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
	integrationLogsRequest := *openapiclient.NewIntegrationLogsRequest([]openapiclient.IntegrationLog{*openapiclient.NewIntegrationLog(int32(123), "EventType_example", "LogLevel_example")}) // IntegrationLogsRequest | Ingest log information from external integration application.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IntegrationsAPI.IntegrationsLogsPost(context.Background()).IntegrationLogsRequest(integrationLogsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IntegrationsAPI.IntegrationsLogsPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IntegrationsLogsPost`: IntegrationLogsSuccessResponse
	fmt.Fprintf(os.Stdout, "Response from `IntegrationsAPI.IntegrationsLogsPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIntegrationsLogsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequest** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md) | Ingest log information from external integration application. | 

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

