# UpdateAssetGroupResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UpdatedAssetGroups** | [**AssetGroupBinding[]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] 
**Exceptions** | [**UpdateAssetGroupResponseExceptionsInner[]**](UpdateAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateAssetGroupResponse = Initialize-PSOpenAPIToolsUpdateAssetGroupResponse  -UpdatedAssetGroups null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$UpdateAssetGroupResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

