# UpdateAssetGroupResponseExceptionsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **String** | Asset group id of the exception. | [optional] 
**Code** | **Int32** | Error code associated with the error editing asset group. | [optional] 
**Message** | **String** | Error message associated with the error editing asset group. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateAssetGroupResponseExceptionsInner = Initialize-PSOpenAPIToolsUpdateAssetGroupResponseExceptionsInner  -AssetGroupId 666791336903426391 `
 -Code 29 `
 -Message You are not permitted to access that resource.
```

- Convert the resource to JSON
```powershell
$UpdateAssetGroupResponseExceptionsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

