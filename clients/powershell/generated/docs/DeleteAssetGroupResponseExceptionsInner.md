# DeleteAssetGroupResponseExceptionsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** | Error code associated with the error deleting asset group. | [optional] 
**Message** | **String** | Error message associated with the error deleting asset group. | [optional] 
**AssetGroupId** | **String** | Asset group id of the exception. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteAssetGroupResponseExceptionsInner = Initialize-PSOpenAPIToolsDeleteAssetGroupResponseExceptionsInner  -Code 29 `
 -Message You are not permitted to access that resource. `
 -AssetGroupId 666791336903426391
```

- Convert the resource to JSON
```powershell
$DeleteAssetGroupResponseExceptionsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

