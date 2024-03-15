# AudienceDefinition
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **String** | Generation date | [optional] 
**Type** | **String** | Generated audience type to request. | [optional] 
**Scope** | **String** | Generated audience scope to request. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceDefinition = Initialize-PSOpenAPIToolsAudienceDefinition  -Date 2022-10-09 `
 -Type null `
 -Scope null
```

- Convert the resource to JSON
```powershell
$AudienceDefinition | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

