# SSIOAccountResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Eligible** | **Boolean** | Advertiser eligible to create order lines | [optional] 
**CanEdit** | **Boolean** | Advertiser eligible to update order lines | [optional] 
**BilltoInfos** | [**SSIOAccountItem[]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] 
**Currency** | **String** |  | [optional] 
**PmpNames** | [**SSIOAccountPMPName[]**](SSIOAccountPMPName.md) |  | [optional] 
**VarError** | **String** | Error indicator from Salesforce which could be &quot;&quot;No Error&quot;&quot; | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOAccountResponse = Initialize-PSOpenAPIToolsSSIOAccountResponse  -Eligible true `
 -CanEdit true `
 -BilltoInfos null `
 -Currency USD `
 -PmpNames null `
 -VarError No Error
```

- Convert the resource to JSON
```powershell
$SSIOAccountResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

