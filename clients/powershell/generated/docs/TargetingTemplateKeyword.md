# TargetingTemplateKeyword
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MatchType** | [**MatchType**](MatchType.md) |  | [optional] 
**Value** | **String** | The keyword targeting (120 chars max). | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateKeyword = Initialize-PSOpenAPIToolsTargetingTemplateKeyword  -MatchType null `
 -Value couples halloween costumes
```

- Convert the resource to JSON
```powershell
$TargetingTemplateKeyword | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

