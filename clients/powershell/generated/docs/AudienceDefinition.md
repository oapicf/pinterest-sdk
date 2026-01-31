# AudienceDefinition
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **String** | Generation date | [optional] 
**Scope** | **String** |  | [optional] 
**Type** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceDefinition = Initialize-PSOpenAPIToolsAudienceDefinition  -Date 2022-10-09 `
 -Scope PARTNER `
 -Type IMPRESSION_PLUS_ENGAGEMENT
```

- Convert the resource to JSON
```powershell
$AudienceDefinition | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

