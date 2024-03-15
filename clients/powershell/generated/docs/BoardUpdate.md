# BoardUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Privacy** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BoardUpdate = Initialize-PSOpenAPIToolsBoardUpdate  -Name Summer Recipes `
 -Description My favorite summer recipes `
 -Privacy null
```

- Convert the resource to JSON
```powershell
$BoardUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

