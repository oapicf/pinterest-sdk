# AppsflyerAudience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContainerId** | **String** | The ID of the audience container | [readonly] 
**Name** | **String** | The name of the audience | 
**Platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience | 

## Examples

- Prepare the resource
```powershell
$AppsflyerAudience = Initialize-PSOpenAPIToolsAppsflyerAudience  -ContainerId null `
 -Name null `
 -Platform null
```

- Convert the resource to JSON
```powershell
$AppsflyerAudience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

