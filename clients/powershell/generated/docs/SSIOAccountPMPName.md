# SSIOAccountPMPName
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Salesforce id for PMP | [optional] 
**Name** | **String** | Display name | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOAccountPMPName = Initialize-PSOpenAPIToolsSSIOAccountPMPName  -Id 0011N00001LW2aSQAT `
 -Name Bidalgo
```

- Convert the resource to JSON
```powershell
$SSIOAccountPMPName | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

