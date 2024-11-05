# DeleteAssetGroupResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedAssetGroups** | **String[]** | A list of ids of successfully deleted asset groups. | [optional] 
**Exceptions** | [**DeleteAssetGroupResponseExceptionsInner[]**](DeleteAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteAssetGroupResponse = Initialize-PSOpenAPIToolsDeleteAssetGroupResponse  -DeletedAssetGroups null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$DeleteAssetGroupResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

