# TargetingTemplateUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OperationType** | **String** |  | 
**Id** | **String** | Targeting template ID | 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateUpdateRequest = Initialize-PSOpenAPIToolsTargetingTemplateUpdateRequest  -OperationType null `
 -Id 643
```

- Convert the resource to JSON
```powershell
$TargetingTemplateUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

