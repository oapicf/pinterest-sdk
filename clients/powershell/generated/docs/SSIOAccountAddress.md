# SSIOAccountAddress
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AddressId** | **String** | Salesforce id for address | [optional] 
**Display** | **String** | Address display | [optional] 
**OrderLegalEntity** | **String** | Legal entity for this insertion order | [optional] 
**Purpose** | **String** | Purpose for which the address is used, usually Billing or Businness | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOAccountAddress = Initialize-PSOpenAPIToolsSSIOAccountAddress  -AddressId a1C1N000004MUrLUAW `
 -Display 475 Brannan Street, San Francisco, CA 94103 `
 -OrderLegalEntity PIN US OU `
 -Purpose Billing
```

- Convert the resource to JSON
```powershell
$SSIOAccountAddress | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

