# CreateAssetAccessRequestErrorMessageInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** | Error code associated with the error in requesting asset access. | [optional] 
**Messages** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateAssetAccessRequestErrorMessageInner = Initialize-PSOpenAPIToolsCreateAssetAccessRequestErrorMessageInner  -Code 2932 `
 -Messages [&quot;Invalid asset id: 549760723247&quot;,&quot;Invalid asset id: 546760723248&quot;]
```

- Convert the resource to JSON
```powershell
$CreateAssetAccessRequestErrorMessageInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

