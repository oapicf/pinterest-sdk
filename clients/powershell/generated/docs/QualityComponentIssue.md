# QualityComponentIssue
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Unique identifier for the issue check. | 
**Name** | **String** | Human-readable name of the issue. | 
**Reason** | **String** | Detailed reason for the issue. | 

## Examples

- Prepare the resource
```powershell
$QualityComponentIssue = Initialize-PSOpenAPIToolsQualityComponentIssue  -Id null `
 -Name null `
 -Reason null
```

- Convert the resource to JSON
```powershell
$QualityComponentIssue | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

