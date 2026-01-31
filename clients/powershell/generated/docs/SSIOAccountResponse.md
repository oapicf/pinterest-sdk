# SSIOAccountResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BilltoInfos** | [**SSIOAccountItem[]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] 
**CanEdit** | **Boolean** | Advertiser eligible to update order lines | [optional] 
**Currency** | **String** |  | [optional] 
**Eligible** | **Boolean** | Advertiser eligible to create order lines | [optional] 
**VarError** | **String** | Error indicator from Salesforce which could be &quot;&quot;No Error&quot;&quot; | [optional] 
**PmpNames** | [**SSIOAccountPMPName[]**](SSIOAccountPMPName.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOAccountResponse = Initialize-PSOpenAPIToolsSSIOAccountResponse  -BilltoInfos null `
 -CanEdit true `
 -Currency USD `
 -Eligible true `
 -VarError No Error `
 -PmpNames null
```

- Convert the resource to JSON
```powershell
$SSIOAccountResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

