# BillingInvoicesGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**BillingInvoiceResponse[]**](BillingInvoiceResponse.md) |  | 

## Examples

- Prepare the resource
```powershell
$BillingInvoicesGet200Response = Initialize-PSOpenAPIToolsBillingInvoicesGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BillingInvoicesGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

