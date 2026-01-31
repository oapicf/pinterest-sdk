# TargetingTemplateUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Targeting template ID | 
**OperationType** | **String** |  | 
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateUpdateRequest = Initialize-PSOpenAPIToolsTargetingTemplateUpdateRequest  -Id 643 `
 -OperationType null `
 -TargetingAttributes null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

