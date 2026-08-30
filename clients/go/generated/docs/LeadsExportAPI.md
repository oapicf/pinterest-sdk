# \LeadsExportAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadsExportCreate**](LeadsExportAPI.md#LeadsExportCreate) | **Post** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**LeadsExportGet**](LeadsExportAPI.md#LeadsExportGet) | **Get** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call



## LeadsExportCreate

> LeadsExports LeadsExportCreate(ctx, adAccountId).LeadsExportsCreate(leadsExportsCreate).Execute()

Create a request to export leads collected from a lead ad



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
	leadsExportsCreate := *openapiclient.NewLeadsExportsCreate("687201361754", "2020-12-20", "2020-12-20") // LeadsExportsCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadsExportAPI.LeadsExportCreate(context.Background(), adAccountId).LeadsExportsCreate(leadsExportsCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadsExportAPI.LeadsExportCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadsExportCreate`: LeadsExports
	fmt.Fprintf(os.Stdout, "Response from `LeadsExportAPI.LeadsExportCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadsExportCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **leadsExportsCreate** | [**LeadsExportsCreate**](LeadsExportsCreate.md) |  | 

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LeadsExportGet

> LeadsExportResponseData LeadsExportGet(ctx, adAccountId, leadsExportId).Execute()

Get the lead export from the lead export create call



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
	leadsExportId := "leadsExportId_example" // string | lead_export_id token returned from the create a lead export endpoint

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LeadsExportAPI.LeadsExportGet(context.Background(), adAccountId, leadsExportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LeadsExportAPI.LeadsExportGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LeadsExportGet`: LeadsExportResponseData
	fmt.Fprintf(os.Stdout, "Response from `LeadsExportAPI.LeadsExportGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**leadsExportId** | **string** | lead_export_id token returned from the create a lead export endpoint | 

### Other Parameters

Other parameters are passed through a pointer to a apiLeadsExportGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

