# \ConversionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvertiserDefinedEventsCreate**](ConversionsAPI.md#AdvertiserDefinedEventsCreate) | **Post** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**AdvertiserDefinedEventsDelete**](ConversionsAPI.md#AdvertiserDefinedEventsDelete) | **Delete** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**AdvertiserDefinedEventsGet**](ConversionsAPI.md#AdvertiserDefinedEventsGet) | **Get** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**AdvertiserDefinedEventsUpdate**](ConversionsAPI.md#AdvertiserDefinedEventsUpdate) | **Patch** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events



## AdvertiserDefinedEventsCreate

> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsCreate(ctx, adAccountId).AdvertiserDefinedEventsCreateRequest(advertiserDefinedEventsCreateRequest).Execute()

Create advertiser defined events



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
	advertiserDefinedEventsCreateRequest := *openapiclient.NewAdvertiserDefinedEventsCreateRequest([]openapiclient.AdvertiserDefinedEventInput{*openapiclient.NewAdvertiserDefinedEventInput(openapiclient.AdvertiserDefinedEventMappingType("SIGNUP"), "newsletter_signup")}) // AdvertiserDefinedEventsCreateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionsAPI.AdvertiserDefinedEventsCreate(context.Background(), adAccountId).AdvertiserDefinedEventsCreateRequest(advertiserDefinedEventsCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionsAPI.AdvertiserDefinedEventsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvertiserDefinedEventsCreate`: AdvertiserDefinedEventsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `ConversionsAPI.AdvertiserDefinedEventsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdvertiserDefinedEventsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdvertiserDefinedEventsDelete

> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsDelete(ctx, adAccountId).EventNames(eventNames).Execute()

Delete advertiser defined events



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
	eventNames := []string{"Inner_example"} // []string | List of event names to delete

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionsAPI.AdvertiserDefinedEventsDelete(context.Background(), adAccountId).EventNames(eventNames).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionsAPI.AdvertiserDefinedEventsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvertiserDefinedEventsDelete`: AdvertiserDefinedEventsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `ConversionsAPI.AdvertiserDefinedEventsDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdvertiserDefinedEventsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **eventNames** | **[]string** | List of event names to delete | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdvertiserDefinedEventsGet

> AdvertiserDefinedEventsGet200Response AdvertiserDefinedEventsGet(ctx, adAccountId).Execute()

Get advertiser defined events



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
	resp, r, err := apiClient.ConversionsAPI.AdvertiserDefinedEventsGet(context.Background(), adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionsAPI.AdvertiserDefinedEventsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvertiserDefinedEventsGet`: AdvertiserDefinedEventsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `ConversionsAPI.AdvertiserDefinedEventsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdvertiserDefinedEventsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdvertiserDefinedEventsUpdate

> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsUpdate(ctx, adAccountId).AdvertiserDefinedEventsCreateRequest(advertiserDefinedEventsCreateRequest).Execute()

Update advertiser defined events



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
	advertiserDefinedEventsCreateRequest := *openapiclient.NewAdvertiserDefinedEventsCreateRequest([]openapiclient.AdvertiserDefinedEventInput{*openapiclient.NewAdvertiserDefinedEventInput(openapiclient.AdvertiserDefinedEventMappingType("SIGNUP"), "newsletter_signup")}) // AdvertiserDefinedEventsCreateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConversionsAPI.AdvertiserDefinedEventsUpdate(context.Background(), adAccountId).AdvertiserDefinedEventsCreateRequest(advertiserDefinedEventsCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConversionsAPI.AdvertiserDefinedEventsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdvertiserDefinedEventsUpdate`: AdvertiserDefinedEventsCreate200Response
	fmt.Fprintf(os.Stdout, "Response from `ConversionsAPI.AdvertiserDefinedEventsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdvertiserDefinedEventsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

