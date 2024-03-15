# SSIOAccountAddress
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Display** | **String** | Address display | [optional] 
**Purpose** | **String** | Purpose for which the address is used, usually Billing or Businness | [optional] 
**AddressId** | **String** | Salesforce id for address | [optional] 
**OrderLegalEntity** | **String** | Legal entity for this insertion order | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOAccountAddress = Initialize-PSOpenAPIToolsSSIOAccountAddress  -Display 475 Brannan Street, San Francisco, CA 94103 `
 -Purpose Billing `
 -AddressId a1C1N000004MUrLUAW `
 -OrderLegalEntity PIN US OU
```

- Convert the resource to JSON
```powershell
$SSIOAccountAddress | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

