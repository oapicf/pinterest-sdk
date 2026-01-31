# AdAccountOwner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The owning account&#39;s user ID. | [optional] 
**Username** | **String** | Public username for the user account | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountOwner = Initialize-PSOpenAPIToolsAdAccountOwner  -Id null `
 -Username null
```

- Convert the resource to JSON
```powershell
$AdAccountOwner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

