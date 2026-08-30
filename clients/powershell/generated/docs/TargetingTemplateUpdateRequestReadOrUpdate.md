# TargetingTemplateUpdateRequestReadOrUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Targeting template ID | 
**OperationType** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | 
**TargetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateUpdateRequestReadOrUpdate = Initialize-PSOpenAPIToolsTargetingTemplateUpdateRequestReadOrUpdate  -Id 643 `
 -OperationType null `
 -TargetingAttributes null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateUpdateRequestReadOrUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

