# AssetAccessRequestError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** | Error code associated with the error in requesting asset access. | [optional] 
**Messages** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssetAccessRequestError = Initialize-PSOpenAPIToolsAssetAccessRequestError  -Code null `
 -Messages null
```

- Convert the resource to JSON
```powershell
$AssetAccessRequestError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

