# UpdateAssetGroupResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | [**UpdateAssetGroupResponseExceptionsInner[]**](UpdateAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 
**UpdatedAssetGroups** | [**AssetGroupBinding[]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateAssetGroupResponse = Initialize-PSOpenAPIToolsUpdateAssetGroupResponse  -Exceptions null `
 -UpdatedAssetGroups null
```

- Convert the resource to JSON
```powershell
$UpdateAssetGroupResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

