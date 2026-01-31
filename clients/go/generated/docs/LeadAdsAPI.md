# \LeadAdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsSubscriptionsDelById**](LeadAdsAPI.md#AdAccountsSubscriptionsDelById) | **Delete** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**AdAccountsSubscriptionsGetById**](LeadAdsAPI.md#AdAccountsSubscriptionsGetById) | **Get** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**AdAccountsSubscriptionsGetList**](LeadAdsAPI.md#AdAccountsSubscriptionsGetList) | **Get** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**AdAccountsSubscriptionsPost**](LeadAdsAPI.md#AdAccountsSubscriptionsPost) | **Post** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription



## AdAccountsSubscriptionsDelById

> AdAccountsSubscriptionsDelById(ctx, adAccountId, subscriptionId).Execute()

Delete lead ads subscription



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
	subscriptionId := "subscriptionId_example" // string | Unique identifier of a subscription.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.LeadAdsAPI.AdAccountsSubscriptionsDelById(context.Background(), adAccountId, subscriptionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadAdsAPI.AdAccountsSubscriptionsDelById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**subscriptionId** | **string** | Unique identifier of a subscription. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsSubscriptionsDelByIdRequest struct via the builder pattern


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


## AdAccountsSubscriptionsGetById

> LeadSubscription AdAccountsSubscriptionsGetById(ctx, adAccountId, subscriptionId).Execute()

Get lead ads subscription by ID



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
	subscriptionId := "subscriptionId_example" // string | Unique identifier of a subscription.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadAdsAPI.AdAccountsSubscriptionsGetById(context.Background(), adAccountId, subscriptionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadAdsAPI.AdAccountsSubscriptionsGetById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdAccountsSubscriptionsGetById`: LeadSubscription
	fmt.Fprintf(os.Stdout, "Response from `LeadAdsAPI.AdAccountsSubscriptionsGetById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**subscriptionId** | **string** | Unique identifier of a subscription. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsSubscriptionsGetByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdAccountsSubscriptionsGetList

> AdAccountsSubscriptionsGetList200Response AdAccountsSubscriptionsGetList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

Get lead ads subscriptions



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadAdsAPI.AdAccountsSubscriptionsGetList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadAdsAPI.AdAccountsSubscriptionsGetList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdAccountsSubscriptionsGetList`: AdAccountsSubscriptionsGetList200Response
	fmt.Fprintf(os.Stdout, "Response from `LeadAdsAPI.AdAccountsSubscriptionsGetList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsSubscriptionsGetListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdAccountsSubscriptionsPost

> LeadSubscription AdAccountsSubscriptionsPost(ctx, adAccountId).LeadSubscriptionPostParamsCreate(leadSubscriptionPostParamsCreate).Execute()

Create lead ads subscription



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
	leadSubscriptionPostParamsCreate := *openapiclient.NewLeadSubscriptionPostParamsCreate("WebhookUrl_example") // LeadSubscriptionPostParamsCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadAdsAPI.AdAccountsSubscriptionsPost(context.Background(), adAccountId).LeadSubscriptionPostParamsCreate(leadSubscriptionPostParamsCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadAdsAPI.AdAccountsSubscriptionsPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AdAccountsSubscriptionsPost`: LeadSubscription
	fmt.Fprintf(os.Stdout, "Response from `LeadAdsAPI.AdAccountsSubscriptionsPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAdAccountsSubscriptionsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **leadSubscriptionPostParamsCreate** | [**LeadSubscriptionPostParamsCreate**](LeadSubscriptionPostParamsCreate.md) |  | 

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

