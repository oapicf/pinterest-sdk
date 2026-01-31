# BillingInvoiceDownloadResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadUrl** | **String** | The download url for the billing invoice | [optional] 
**Id** | **String** | The billing invoice id | [optional] 

## Examples

- Prepare the resource
```powershell
$BillingInvoiceDownloadResponse = Initialize-PSOpenAPIToolsBillingInvoiceDownloadResponse  -DownloadUrl null `
 -Id null
```

- Convert the resource to JSON
```powershell
$BillingInvoiceDownloadResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

